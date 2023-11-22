import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.cert.TrustAnchor;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Nov 09 22:08:17 IRST 2023
 */



/**
 * @author global village
 */
public class MainPro extends JFrame implements ActionListener {
    public MainPro () {
        initComponents();
    }

    ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\1.jpg");
    ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\2.jpg");
    ImageIcon imageIcon3 = new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\3.jpg");
    ImageIcon imageIcon4 = new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\4.jpg");
    ImageIcon imageIcon5 = new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\5.jpg");
    ImageIcon imageIcon6 = new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\6.jpg");
    ImageIcon imageIcon7 = new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\7.jpg");
    ImageIcon imageIcon8 = new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\12.jpg");


    private void initComponents () {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();

        //======== this ========
        setTitle("Spotify");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\download.png").getImage());
        getContentPane().setBackground(new Color(0xFF4CB679,true));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("S P O T I F Y");
        label1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 20));

        label1.setForeground(Color.black);
        label1.setBackground(new Color(0x0A5E30));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(360, 15), label1.getPreferredSize()));

        //---- button1 ----
        button1.setText("Play");
        button1.setBackground(new Color(0xccffcc));
        button1.setForeground(new Color(0x00cccc));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(90, 200), button1.getPreferredSize()));
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Play");
        button2.setBackground(new Color(0xccffcc));
        button2.setForeground(new Color(0x00cccc));
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(290, 200), button2.getPreferredSize()));
        button2.addActionListener(this::actionPerformed);

        //---- button3 ----
        button3.setText("Play");
        button3.setBackground(new Color(0xccffcc));
        button3.setForeground(new Color(0x00cccc));
        contentPane.add(button3);
        button3.setBounds(new Rectangle(new Point(485, 200), button3.getPreferredSize()));
        button3.addActionListener(this::actionPerformed);

        //---- button4 ----
        button4.setText("Play");
        button4.setBackground(new Color(0xccffcc));
        button4.setForeground(new Color(0x00cccc));
        contentPane.add(button4);
        button4.setBounds(new Rectangle(new Point(690, 200), button4.getPreferredSize()));
        button4.addActionListener(this::actionPerformed);

        //---- button5 ----
        button5.setText("EXIT");
        button5.setBackground(new Color(0xcc0000));
        button5.setForeground(Color.black);
        contentPane.add(button5);
        button5.setBounds(new Rectangle(new Point(0, 0), button5.getPreferredSize()));
        button5.addActionListener(this::actionPerformed);

        //---- button6 ----
        button6.setText("PROFILE");
        button6.setBackground(new Color(0x006633));
        button6.setForeground(Color.black);
        contentPane.add(button6);
        button6.setBounds(new Rectangle(new Point(760, 0), button6.getPreferredSize()));
        button6.addActionListener(this::actionPerformed);

        //---- button7 ----
        button7.setText("Play");
        button7.setForeground(new Color(0x00cccc));
        button7.setBackground(new Color(0xccffcc));
        contentPane.add(button7);
        button7.setBounds(new Rectangle(new Point(90, 450), button7.getPreferredSize()));
        button7.addActionListener(this::actionPerformed);

        //---- button8 ----
        button8.setText("Play");
        button8.setForeground(new Color(0x00cccc));
        button8.setBackground(new Color(0xccffcc));
        contentPane.add(button8);
        button8.setBounds(new Rectangle(new Point(290, 450), button8.getPreferredSize()));
        button8.addActionListener(this::actionPerformed);

        //---- button9 ----
        button9.setText("Play");
        button9.setForeground(new Color(0x00cccc));
        button9.setBackground(new Color(0xccffcc));
        contentPane.add(button9);
        button9.setBounds(new Rectangle(new Point(485, 450), button9.getPreferredSize()));
        button9.addActionListener(this::actionPerformed);

        //---- button10 ----
        button10.setText("Play");
        button10.setForeground(new Color(0x00cccc));
        button10.setBackground(new Color(0xccffcc));
        contentPane.add(button10);
        button10.setBounds(new Rectangle(new Point(690, 450), button10.getPreferredSize()));
        button10.addActionListener(this::actionPerformed);

        //---- button11 ----
        button11.setText("New SONGS");
        button11.setBackground(new Color(0x006633));
        button11.setForeground(Color.black);
        contentPane.add(button11);
        button11.setBounds(630, 0,125,25);
        button11.addActionListener(this::actionPerformed);

        //---- label2 ----
        label2.setIcon(imageIcon1);
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setBounds(45,50,100,100);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setSize(150,150);
        contentPane.add(label2);

        //---- label3 ----
        label3.setIcon(imageIcon2);
        label3.setVerticalAlignment(JLabel.TOP);
        label3.setBounds(245,50,100,100);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setSize(150,150);
        contentPane.add(label3);

        //---- label4 ----
        label4.setIcon(imageIcon3);
        label4.setVerticalAlignment(JLabel.TOP);
        label4.setBounds(435,50,100,100);
        label4.setHorizontalAlignment(JLabel.CENTER);
        label4.setSize(150,150);
        contentPane.add(label4);


        //---- label5 ----
        label5.setIcon(imageIcon4);
        label5.setVerticalAlignment(JLabel.TOP);
        label5.setBounds(640,50,100,100);
        label5.setHorizontalAlignment(JLabel.CENTER);
        label5.setSize(150,150);
        contentPane.add(label5);


        //---- label6 ----
        label6.setIcon(imageIcon5);
        label6.setVerticalAlignment(JLabel.TOP);
        label6.setBounds(45,300,100,100);
        label6.setHorizontalAlignment(JLabel.CENTER);
        label6.setSize(150,150);
        contentPane.add(label6);

        //---- label7 ----
        label7.setIcon(imageIcon6);
        label7.setVerticalAlignment(JLabel.TOP);
        label7.setBounds(245,300,100,100);
        label7.setHorizontalAlignment(JLabel.CENTER);
        label7.setSize(150,150);
        contentPane.add(label7);

        //---- label8 ----
        label8.setIcon(imageIcon7);
        label8.setVerticalAlignment(JLabel.TOP);
        label8.setBounds(435,300,100,100);
        label8.setHorizontalAlignment(JLabel.CENTER);
        label8.setSize(150,150);
        contentPane.add(label8);

        //---- label9 ----
        label9.setIcon(imageIcon8);
        label9.setVerticalAlignment(JLabel.TOP);
        label9.setBounds(640,300,100,100);
        label9.setHorizontalAlignment(JLabel.CENTER);
        label9.setSize(150,150);
        contentPane.add(label9);
        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(855, 545);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;@Override


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button11){
            dispose();
            MusicLIST musicLIST = new MusicLIST();
        }
        if(e.getSource() == button5){
            dispose();
            Menu menu = new Menu();
        }
        if(e.getSource() == button6){
            dispose();
            Profile profile = new Profile();
        }

        if(e.getSource() == button1){
            dispose();
           try {
               Listeningpage1 listeningpage1 = new Listeningpage1();} catch (UnsupportedAudioFileException ex) {
               throw new RuntimeException(ex);
           } catch (IOException ex) {
               throw new RuntimeException(ex);
           } catch (LineUnavailableException ex) {
               throw new RuntimeException(ex);
           }
        }

        if(e.getSource() == button2){
            dispose();
            try {
                Listeningpage2 listeningpage2 = new Listeningpage2();} catch (UnsupportedAudioFileException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
        }

        if(e.getSource() == button3){
            dispose();
            try {
                Listeningpage3 listeningpage3 = new Listeningpage3();} catch (UnsupportedAudioFileException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
        }

        if(e.getSource() == button4){
            dispose();
            try {
                Listeningpage4 listeningpage4 = new Listeningpage4();} catch (UnsupportedAudioFileException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
        }

        if(e.getSource() == button7){
            dispose();
            try {
                Listeningpage5 listeningpage5 = new Listeningpage5();} catch (UnsupportedAudioFileException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (LineUnavailableException ex) {
                throw new RuntimeException(ex);
            }
        }

    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
        }
    }

