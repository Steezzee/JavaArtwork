import javax.swing.*;
import java.awt.*;

public class DrawMain {



    public static void main(String[] args){
        JFrame frame;
        frame = new JFrame("This is My Java Art.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);

        long time = System.currentTimeMillis();

        JPanel panel = new JPanel() {
            public void paint(Graphics g) {

                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                g2.setColor(Color.green);
                for (int i=250;i<500;i=i+10){
                    g2.fillRoundRect(i+300, i-200, i/2, i, i/2, i/2);
                }

                g2.setColor(Color.black);
                for (int i = 0; i < 50; i++) {
                        g2.fillRect(i + 50, i + 50, i * 10, i * 10);
                }

                g2.setColor(Color.blue);
                for (int i = 50; i < 75; i++) {
                    g2.fillOval(i, i, i * 5, i * 5);
                }

                g2.setColor(Color.MAGENTA);
                for (int i = 1000; i > 950; i--) {
                    g2.fillRect((i / 2) - 200, (i / 2) - 200, i / 2, i / 2);
                }

                g2.setColor(Color.yellow);
                for (int i = 900; i > 50; i = i - 150) {
                    g2.fillArc(i, i, i, i, 25, i);
                }

                g2.setColor(Color.green);
                for (int i = 250; i < 350; i++) {
                    g2.fillOval(i+250, i+350, i  , i / 5);
                }

                g2.setColor(Color.black);
                for (int i=20;i<108;i++) {
                    g2.drawOval(i*2+175, i*2+180, i*2, i*2);
                }

                g2.setColor(Color.gray);
                int count =0;
                for (int i=600;i<2260;i=i+280) {

                    g2.drawString("Steezzee", 1800-i/4, i/3+80);
                    count++;

                        if (count % 2 == 0) {
                            g2.setColor(Color.blue);
                        }
                        if (count % 2 == 1) {
                            g2.setColor(Color.gray);
                        }

                }

                g2.setColor(Color.black);
                for (int i=1;i<900;i=i+10) {
                    g2.drawArc(1/i+527, 1/i+655, i , i/4, i*i, i/5);
                }



                repaint();

            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }
}
