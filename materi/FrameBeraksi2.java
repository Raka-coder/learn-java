package materi;

import javax.swing.*;

public class FrameBeraksi2 extends JFrame {
    public FrameBeraksi2() {
        JFrame frame = new JFrame("Frame Beraksi");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JLabel emptyJLabel = new JLabel("Ginanjar Beraksi");
        // emptyJLabel.setSize(300, 300);
        frame.getContentPane().add(emptyJLabel);

    }
    public static void main(String[] args) {
        FrameBeraksi2 frame = new FrameBeraksi2();
        // FrameBeraksi2 frame2 = new FrameBeraksi2();
        // FrameBeraksi2 frame3 = new FrameBeraksi2();
    }
}
