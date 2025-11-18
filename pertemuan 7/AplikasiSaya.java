import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class AplikasiSaya {
    public AplikasiSaya() {
        JFrame frame = new JFrame("Aplikasi Saya");
        JPanel panelForm = new JPanel();
        frame.add(panelForm, BorderLayout.CENTER);
        frame.add(panelForm);
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelJudul = new JLabel("Identitas Mahasiswa");
        labelJudul.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel labelNama = new JLabel("Masukkan Nama:");
        JTextField textFieldNama = new JTextField(20);
        JLabel labelNPM = new JLabel("Masukkan NPM:");
        JTextField textFieldNPM = new JTextField(20);
        JLabel labelKelas = new JLabel("Masukkan Kelas:");
        JComboBox<String> comboBoxKelas = new JComboBox<>(new String[] { "A", "B", "C", "D", "E", "F", "G" });
        JButton buttonSimpan = new JButton("Simpan");
         buttonSimpan.addActionListener(e -> {
            String nama = textFieldNama.getText();
            String npm = textFieldNPM.getText();
            String kelas = (String) comboBoxKelas.getSelectedItem();
            
            JDialog dialog = new JDialog(frame, "Konfirmasi", true);
            JPanel panel = new JPanel(new GridLayout(3, 1));
            dialog.add(panel);
            panel.add(new JLabel("Nama: " + nama));
            panel.add(new JLabel("NPM: " + npm));
            panel.add(new JLabel("Kelas: " + kelas));
            JButton buttonConfirm = new JButton("Confirm");
            dialog.add(buttonConfirm, BorderLayout.SOUTH);
            
            buttonConfirm.addActionListener(e2 -> {
                dialog.dispose();
            });
            
            dialog.pack();
            dialog.setLocationRelativeTo(frame);
            dialog.setVisible(true);
        });

        frame.add(labelJudul, BorderLayout.NORTH);
        panelForm.add(labelNama);
        panelForm.add(textFieldNama);
        panelForm.add(buttonSimpan);
        panelForm.add(labelNPM);
        panelForm.add(textFieldNPM);
        panelForm.add(labelKelas);
        panelForm.add(comboBoxKelas);
        frame.add(buttonSimpan, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AplikasiSaya();
        });
    }
}