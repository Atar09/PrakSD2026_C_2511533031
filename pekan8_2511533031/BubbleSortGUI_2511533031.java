package pekan8_2511533031;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class BubbleSortGUI_2511533031 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_3031;
    private JLabel[] labelArray_3031;
    private JButton stepButton_3031, resetButton_3031, setButton_3031;
    private JTextField inputField_3031;
    private JPanel panelArray_3031;
    private JTextArea stepArea_3031;
    private int i_3031 = 1, j_3031;
    private boolean sorting_3031 = false;
    private int stepCount_3031 = 1;

	
	

	/**
	 * Create the frame.
	 */
	public BubbleSortGUI_2511533031() {
		setTitle("Insertion Sort Langkah per Langkah");
	    setSize(750, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setLayout(new BorderLayout());

	    // Panel input
	    JPanel inputPanel_3031 = new JPanel(new FlowLayout());
	    inputField_3031 = new JTextField(30);
	    setButton_3031 = new JButton("Set Array");
	    inputPanel_3031.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
	    inputPanel_3031.add(inputField_3031);
	    inputPanel_3031.add(setButton_3031);

	    // Panel array visual
	    panelArray_3031 = new JPanel();
	    panelArray_3031.setLayout(new FlowLayout());

	    // Panel kontrol
	    JPanel controlPanel_3031 = new JPanel();
	    stepButton_3031 = new JButton("Langkah Selanjutnya");
	    resetButton_3031 = new JButton("Reset");
	    stepButton_3031.setEnabled(false);
	    controlPanel_3031.add(stepButton_3031);
	    controlPanel_3031.add(resetButton_3031);
		
	    // Area teks untuk log langkah-langkah
	    stepArea_3031 = new JTextArea(8, 60);
	    stepArea_3031.setEditable(false);
	    stepArea_3031.setFont(new Font("Monospaced", Font.PLAIN, 14));
	    JScrollPane scrollPane_3031 = new JScrollPane(stepArea_3031);

	    // Tambahkan panel ke frame
	    add(inputPanel_3031, BorderLayout.NORTH);
	    add(panelArray_3031, BorderLayout.CENTER);
	    add(controlPanel_3031, BorderLayout.SOUTH);
	    add(scrollPane_3031, BorderLayout.EAST);
	    // Event Set Array
	    setButton_3031.addActionListener(e -> setArrayFromInput_3031());
	    // Event Langkah Selanjutnya\
	    stepButton_3031.addActionListener(e -> performStep_3031());
	    // Event reset
	    resetButton_3031.addActionListener(e -> reset_3031 ());
	    }
	private void setArrayFromInput_3031() {
	    String text_3031 = inputField_3031.getText().trim();
	    if (text_3031.isEmpty())
	        return;
	    String[] parts_3031 = text_3031.split(",");
	    array_3031 = new int[parts_3031.length];
	    try {
	        for (int k_3031 = 0; k_3031 < parts_3031.length; k_3031++) {
	            array_3031[k_3031] =
	                    Integer.parseInt(parts_3031[k_3031].trim());
	        }
	    } catch (NumberFormatException e_3031) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka " + "yang dipisahkan koma!",
	                "Error",JOptionPane.ERROR_MESSAGE);
	        return;	}
	    i_3031 = 0;
	    j_3031 = 0;
	    stepCount_3031 = 1;
	    sorting_3031 = true;
	    stepButton_3031.setEnabled(true);
	    stepArea_3031.setText("");
	    panelArray_3031.removeAll();
	    labelArray_3031 = new JLabel[array_3031.length];
	    for (int k_3031 = 0; k_3031 < array_3031.length; k_3031++) {
	        labelArray_3031[k_3031] = new JLabel(String.valueOf(array_3031[k_3031]));
	        labelArray_3031[k_3031].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_3031[k_3031].setOpaque(true);
	        labelArray_3031[k_3031].setBackground(Color.WHITE);
	        labelArray_3031[k_3031].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_3031[k_3031].setPreferredSize(new Dimension(50, 50));
	        labelArray_3031[k_3031].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_3031.add(labelArray_3031[k_3031]);		}
	    
	    	panelArray_3031.revalidate();
	    	panelArray_3031.repaint();
	}
	private void performStep_3031() {
	    if (!sorting_3031 || i_3031 >= array_3031.length - 1) {
	        sorting_3031 = false;
	        stepButton_3031.setEnabled(false);
	        JOptionPane.showMessageDialog(this,"Sorting selesai!");
	        return;
	    }
	    resetHighlights_3031();
	    StringBuilder stepLog_3031 = new StringBuilder();
	    labelArray_3031[j_3031].setBackground(Color.CYAN);
	    labelArray_3031[j_3031 + 1].setBackground(Color.CYAN);
	    if (array_3031[j_3031] > array_3031[j_3031 + 1]) {
	        // Swap
	        int temp_3031 = array_3031[j_3031];
	        array_3031[j_3031] = array_3031[j_3031 + 1];
	        array_3031[j_3031 + 1] =temp_3031;
	        labelArray_3031[j_3031].setBackground(Color.RED);
	        labelArray_3031[j_3031 + 1].setBackground(Color.RED);
	        stepLog_3031.append("Langkah ").append(stepCount_3031).append(": Menukar elemen ke-").append(j_3031).append(" (").append(array_3031[j_3031 + 1]).append(") dengan ke-")
	        .append(j_3031 + 1).append(" (").append(array_3031[j_3031]).append(")\n");
	    } else {
	        stepLog_3031.append("Langkah ").append(stepCount_3031).append(": Tidak ada pertukaran antara ke-").append(j_3031).append(" dan ke-")
	        .append(j_3031 + 1).append("\n");
	    }
	    stepLog_3031.append("Hasil: ").append(arrayToString_3031(array_3031)).append("\n\n");
	    stepArea_3031.append(stepLog_3031.toString());
	    updateLabels_3031();
	    j_3031++;
	    if (j_3031 >= array_3031.length - i_3031 - 1) {
	        j_3031 = 0;
	        i_3031++;
	    }
	    stepCount_3031++;
	    if (i_3031 >= array_3031.length - 1) {
	        sorting_3031 = false;
	        stepButton_3031.setEnabled(false);
	        JOptionPane.showMessageDialog(this,"Sorting selesai!");
	    }
	}
	private void updateLabels_3031() {
	    for (int k_3031 = 0; k_3031 < array_3031.length; k_3031++) {
	        labelArray_3031[k_3031].setText(String.valueOf(array_3031[k_3031]));
	    }
	}
	private void resetHighlights_3031() {
	    for (JLabel label_3031 : labelArray_3031) {
	        label_3031.setBackground(Color.WHITE);
	    }
	}
	private void reset_3031() {
	    inputField_3031.setText("");
	    panelArray_3031.removeAll();
	    panelArray_3031.revalidate();
	    panelArray_3031.repaint();
	    stepArea_3031.setText("");
	    stepButton_3031.setEnabled(false);
	    sorting_3031 = false;
	    i_3031 = 0;
	    j_3031 = 0;
	    stepCount_3031 = 1;
	}
	private String arrayToString_3031(int[] arr_3031) {
	    StringBuilder sb_3031 = new StringBuilder();
	    for (int k_3031 = 0; k_3031 < arr_3031.length; k_3031++) {
	        sb_3031.append(arr_3031[k_3031]);
	        if (k_3031 < arr_3031.length - 1)
	            sb_3031.append(", ");
	    }
	    return sb_3031.toString();
	}
	public static void main (String [] args) {
		SwingUtilities.invokeLater(() -> {
			BubbleSortGUI_2511533031 gui_3029 = new BubbleSortGUI_2511533031 () ;
			gui_3029.setVisible(true);
		}); 
	}
}

