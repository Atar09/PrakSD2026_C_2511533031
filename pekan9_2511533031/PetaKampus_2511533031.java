package pekan9_2511533031;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class PetaKampus_2511533031 extends JFrame {

    private Map<String, java.util.List<String>> graph_3031;

    private JComboBox<String> cbAwal_3031;
    private JComboBox<String> cbTujuan_3031;

    private JTextArea graphArea_3031;
    private JTextArea hasilArea_3031;

    private Set<String> visited_3031 = new LinkedHashSet<>();
    private java.util.List<String> path_3031 = new ArrayList<>();

    public PetaKampus_2511533031() {
        initGraph_3031();
        initGUI_3031();
    }

    private void initGraph_3031() {

        graph_3031 = new LinkedHashMap<>();

        String[] lokasi_3031 = {
            "Rektorat",
            "Perpustakaan",
            "FTI",
            "PKM",
            "Masjid",
            "Lab Komputer",
            "Kantin"
        };

        for (String lokasi : lokasi_3031) {
            graph_3031.put(lokasi, new ArrayList<>());
        }

        addEdge_3031("Rektorat", "Perpustakaan");
        addEdge_3031("Rektorat", "PKM");
        addEdge_3031("Rektorat", "Masjid");

        addEdge_3031("Perpustakaan", "FTI");

        addEdge_3031("FTI", "Lab Komputer");

        addEdge_3031("PKM", "Lab Komputer");

        addEdge_3031("Masjid", "Kantin");

        addEdge_3031("Lab Komputer", "Kantin");
    }

    private void addEdge_3031(String a, String b) {
        graph_3031.get(a).add(b);
        graph_3031.get(b).add(a);
    }

    private void initGUI_3031() {

        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS");
        setSize(900, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelAtas_3031 = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 10));

        panelAtas_3031.add(new JLabel("Lokasi Awal :"));

        cbAwal_3031 = new JComboBox<>(graph_3031.keySet().toArray(new String[0]));
        panelAtas_3031.add(cbAwal_3031);

        panelAtas_3031.add(new JLabel("Lokasi Tujuan :"));

        cbTujuan_3031 = new JComboBox<>(graph_3031.keySet().toArray(new String[0]));
        cbTujuan_3031.setSelectedIndex(5);
        panelAtas_3031.add(cbTujuan_3031);

        JButton btnBFS_3031 = new JButton("[ BFS ]");
        JButton btnDFS_3031 = new JButton("[ DFS ]");
        JButton btnReset_3031 = new JButton("[ RESET ]");

        panelAtas_3031.add(btnBFS_3031);
        panelAtas_3031.add(btnDFS_3031);
        panelAtas_3031.add(btnReset_3031);

        add(panelAtas_3031, BorderLayout.NORTH);

        graphArea_3031 = new JTextArea();
        graphArea_3031.setEditable(false);
        graphArea_3031.setFont(new Font("Monospaced", Font.PLAIN, 18));

        graphArea_3031.setText(
                "\n" +
                "      Perpustakaan ------------ FTI\n" +
                "           |                     |\n" +
                "           |                     |\n" +
                "      Rektorat ---- PKM ---- Lab Komputer\n" +
                "           |                     |\n" +
                "           |                     |\n" +
                "        Masjid ------------- Labor AI\n"
        );

        JPanel panelGraph_3031 = new JPanel(new BorderLayout());
        panelGraph_3031.setBorder(
                BorderFactory.createTitledBorder("VISUALISASI GRAPH")
        );

        panelGraph_3031.add(graphArea_3031);

        add(panelGraph_3031, BorderLayout.CENTER);

        hasilArea_3031 = new JTextArea(8, 50);
        hasilArea_3031.setEditable(false);
        hasilArea_3031.setFont(new Font("Monospaced", Font.PLAIN, 16));

        hasilArea_3031.setText(
                "Hasil Pencarian :\n" +
                "Jalur :\n" +
                "Node Dikunjungi :\n" +
                "Jumlah Node Dikunjungi : 0"
        );

        JPanel panelBawah_3031 = new JPanel(new BorderLayout());
        panelBawah_3031.setBorder(
                BorderFactory.createTitledBorder("HASIL")
        );

        panelBawah_3031.add(new JScrollPane(hasilArea_3031));

        add(panelBawah_3031, BorderLayout.SOUTH);

        btnBFS_3031.addActionListener(e -> {
            BFS_3031();
            tampilkanHasil_3031("BFS");
        });

        btnDFS_3031.addActionListener(e -> {
            DFS_3031();
            tampilkanHasil_3031("DFS");
        });

        btnReset_3031.addActionListener(e -> {
            visited_3031.clear();
            path_3031.clear();

            hasilArea_3031.setText(
                    "Hasil Pencarian :\n" +
                    "Jalur :\n" +
                    "Node Dikunjungi :\n" +
                    "Jumlah Node Dikunjungi : 0"
            );
        });

        setVisible(true);
    }

    private void BFS_3031() {

        visited_3031.clear();
        path_3031.clear();

        String start = (String) cbAwal_3031.getSelectedItem();
        String goal = (String) cbTujuan_3031.getSelectedItem();

        Queue<java.util.List<String>> queue = new LinkedList<>();
        Set<String> seen = new HashSet<>();

        java.util.List<String> firstPath = new ArrayList<>();
        firstPath.add(start);

        queue.add(firstPath);
        seen.add(start);

        while (!queue.isEmpty()) {

            java.util.List<String> currentPath = queue.poll();
            String current = currentPath.get(currentPath.size() - 1);

            visited_3031.add(current);

            if (current.equals(goal)) {
                path_3031 = currentPath;
                return;
            }

            for (String next : graph_3031.get(current)) {

                if (!seen.contains(next)) {

                    seen.add(next);

                    java.util.List<String> newPath =
                            new ArrayList<>(currentPath);

                    newPath.add(next);

                    queue.add(newPath);
                }
            }
        }
    }

    private void DFS_3031() {

        visited_3031.clear();
        path_3031.clear();

        String start = (String) cbAwal_3031.getSelectedItem();
        String goal = (String) cbTujuan_3031.getSelectedItem();

        Stack<java.util.List<String>> stack = new Stack<>();

        java.util.List<String> awal = new ArrayList<>();
        awal.add(start);

        stack.push(awal);

        while (!stack.isEmpty()) {

            java.util.List<String> currentPath = stack.pop();

            String current =
                    currentPath.get(currentPath.size() - 1);

            if (visited_3031.contains(current))
                continue;

            visited_3031.add(current);

            if (current.equals(goal)) {
                path_3031 = currentPath;
                return;
            }

            java.util.List<String> neighbors =
                    new ArrayList<>(graph_3031.get(current));

            Collections.reverse(neighbors);

            for (String next : neighbors) {

                if (!visited_3031.contains(next)) {

                    java.util.List<String> newPath =
                            new ArrayList<>(currentPath);

                    newPath.add(next);

                    stack.push(newPath);
                }
            }
        }
    }

    private void tampilkanHasil_3031(String metode) {

        hasilArea_3031.setText(
                "Hasil Pencarian : " + metode + "\n\n" +
                "Jalur : " +
                String.join(" -> ", path_3031) + "\n\n" +
                "Node Dikunjungi : " +
                String.join(", ", visited_3031) + "\n\n" +
                "Jumlah Node Dikunjungi : " +
                visited_3031.size()
        );
    }

    public static void main(String[] args) {
        new PetaKampus_2511533031();
    }
}