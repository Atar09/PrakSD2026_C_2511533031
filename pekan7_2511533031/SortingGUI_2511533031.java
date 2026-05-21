package pekan7_2511533031;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SortingGUI_2511533031 extends JFrame {

    private static final long serialVersionUID = 1L;

    ArrayList<Mahasiswa_2511533031> listMahasiswa_3031 = new ArrayList<>();

    JTextField txtNama_3031, txtNim_3031, txtProdi_3031;

    JButton btnTambah_3031;
    JButton btnSort_3031;
    JButton btnHapus_3031;
    JButton btnReset_3031;

    JComboBox<String> comboSort_3031;

    JTable tabel_3031;
    DefaultTableModel model_3031;

    JTextArea areaLog_3031;

    public SortingGUI_2511533031() {

        setTitle("Program Sorting Mahasiswa");
        setSize(850, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelAtas_3031 = new JPanel();
        panelAtas_3031.setLayout(new GridLayout(3, 4, 5, 5));

        panelAtas_3031.add(new JLabel("Nama"));
        txtNama_3031 = new JTextField();
        panelAtas_3031.add(txtNama_3031);

        panelAtas_3031.add(new JLabel("NIM"));
        txtNim_3031 = new JTextField();
        panelAtas_3031.add(txtNim_3031);

        panelAtas_3031.add(new JLabel("Prodi"));
        txtProdi_3031 = new JTextField();
        panelAtas_3031.add(txtProdi_3031);

        panelAtas_3031.add(new JLabel("Pilih Sorting"));
        String[] pilihan_3031 = {"Insertion Sort", "Selection Sort", "Bubble Sort"};
        comboSort_3031 = new JComboBox<>(pilihan_3031);
        panelAtas_3031.add(comboSort_3031);

        btnTambah_3031 = new JButton("Tambah");
        panelAtas_3031.add(btnTambah_3031);

        btnHapus_3031 = new JButton("Hapus");
        panelAtas_3031.add(btnHapus_3031);

        btnSort_3031 = new JButton("Sorting");
        panelAtas_3031.add(btnSort_3031);

        btnReset_3031 = new JButton("Reset");
        panelAtas_3031.add(btnReset_3031);

        add(panelAtas_3031, BorderLayout.NORTH);

        String[] kolom_3031 = {"No", "Nama", "NIM", "Prodi"};

        model_3031 = new DefaultTableModel(kolom_3031, 0);

        tabel_3031 = new JTable(model_3031);

        JScrollPane scrollTabel_3031 = new JScrollPane(tabel_3031);

        add(scrollTabel_3031, BorderLayout.CENTER);

        areaLog_3031 = new JTextArea();
        areaLog_3031.setEditable(false);

        JScrollPane scrollLog_3031 = new JScrollPane(areaLog_3031);
        scrollLog_3031.setPreferredSize(new Dimension(100, 180));

        add(scrollLog_3031, BorderLayout.SOUTH);

        btnTambah_3031.addActionListener(e -> tambahData_3031());

        btnHapus_3031.addActionListener(e -> hapusData_3031());

        btnSort_3031.addActionListener(e -> mulaiSorting_3031());

        btnReset_3031.addActionListener(e -> reset_3031());
    }

    // tambah data
    private void tambahData_3031() {

        String nama = txtNama_3031.getText();
        String nim = txtNim_3031.getText();
        String prodi = txtProdi_3031.getText();

        if (nama.equals("") || nim.equals("") || prodi.equals("")) {

            JOptionPane.showMessageDialog(this, "Data belum lengkap");
            return;
        }

        Mahasiswa_2511533031 mhs_3031 =
                new Mahasiswa_2511533031(nama, nim, prodi);

        listMahasiswa_3031.add(mhs_3031);

        tampilData_3031();

        txtNama_3031.setText("");
        txtNim_3031.setText("");
        txtProdi_3031.setText("");
    }

    // tampil tabel
    private void tampilData_3031() {

        model_3031.setRowCount(0);

        for (int i = 0; i < listMahasiswa_3031.size(); i++) {

            model_3031.addRow(new Object[]{
                    i + 1,
                    listMahasiswa_3031.get(i).getNama_3031(),
                    listMahasiswa_3031.get(i).getNim_3031(),
                    listMahasiswa_3031.get(i).getProdi_3031()
            });
        }
    }

    // hapus data
    private void hapusData_3031() {

        int baris = tabel_3031.getSelectedRow();

        if (baris == -1) {

            JOptionPane.showMessageDialog(this,
                    "Pilih data dulu");
        }
        else {

            listMahasiswa_3031.remove(baris);

            tampilData_3031();
        }
    }

    // mulai sorting
    private void mulaiSorting_3031() {

        areaLog_3031.setText("");

        String pilihan = comboSort_3031.getSelectedItem().toString();

        if (pilihan.equals("Insertion Sort")) {

            insertionSort_3031();
        }
        else if (pilihan.equals("Selection Sort")) {

            selectionSort_3031();
        }
        else {

            bubbleSort_3031();
        }

        tampilData_3031();

        JOptionPane.showMessageDialog(this,
                "Sorting selesai");
    }

    // insertion sort
    private void insertionSort_3031() {

        areaLog_3031.append("=== INSERTION SORT ===\n");

        for (int i = 1; i < listMahasiswa_3031.size(); i++) {

            Mahasiswa_2511533031 key =
                    listMahasiswa_3031.get(i);

            int j = i - 1;

            while (j >= 0 &&
                    listMahasiswa_3031.get(j).getNama_3031()
                            .compareToIgnoreCase(key.getNama_3031()) > 0) {

                listMahasiswa_3031.set(j + 1,
                        listMahasiswa_3031.get(j));

                j--;
            }

            listMahasiswa_3031.set(j + 1, key);

            areaLog_3031.append(
                    "Langkah " + i + " : "
                            + tampilNama_3031() + "\n");
        }
    }

    // selection sort
    private void selectionSort_3031() {

        areaLog_3031.append("=== SELECTION SORT ===\n");

        for (int i = 0; i < listMahasiswa_3031.size() - 1; i++) {

            int min = i;

            for (int j = i + 1; j < listMahasiswa_3031.size(); j++) {

                if (listMahasiswa_3031.get(j).getNama_3031()
                        .compareToIgnoreCase(
                                listMahasiswa_3031.get(min).getNama_3031()) < 0) {

                    min = j;
                }
            }

            Mahasiswa_2511533031 temp =
                    listMahasiswa_3031.get(i);

            listMahasiswa_3031.set(i,
                    listMahasiswa_3031.get(min));

            listMahasiswa_3031.set(min, temp);

            areaLog_3031.append(
                    "Pass " + (i + 1) + " : "
                            + tampilNama_3031() + "\n");
        }
    }

    // bubble sort
    private void bubbleSort_3031() {

        areaLog_3031.append("=== BUBBLE SORT ===\n");

        for (int i = 0; i < listMahasiswa_3031.size() - 1; i++) {

            for (int j = 0; j < listMahasiswa_3031.size() - i - 1; j++) {

                if (listMahasiswa_3031.get(j).getNama_3031()
                        .compareToIgnoreCase(
                                listMahasiswa_3031.get(j + 1).getNama_3031()) > 0) {

                    Mahasiswa_2511533031 temp =
                            listMahasiswa_3031.get(j);

                    listMahasiswa_3031.set(j,
                            listMahasiswa_3031.get(j + 1));

                    listMahasiswa_3031.set(j + 1, temp);
                }
            }

            areaLog_3031.append(
                    "Pass " + (i + 1) + " : "
                            + tampilNama_3031() + "\n");
        }
    }

    // ubah list nama jadi string
    private String tampilNama_3031() {

        String hasil = "[";

        for (int i = 0; i < listMahasiswa_3031.size(); i++) {

            hasil += listMahasiswa_3031.get(i).getNama_3031();

            if (i != listMahasiswa_3031.size() - 1) {

                hasil += ", ";
            }
        }

        hasil += "]";

        return hasil;
    }

    // reset
    private void reset_3031() {

        listMahasiswa_3031.clear();

        tampilData_3031();

        areaLog_3031.setText("");

        txtNama_3031.setText("");
        txtNim_3031.setText("");
        txtProdi_3031.setText("");
    }

    // main
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            new SortingGUI_2511533031().setVisible(true);
        });
    }
}