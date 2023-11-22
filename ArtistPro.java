import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Nov 14 14:02:48 IRST 2023
 */



/**
 * @author global village
 */
public class ArtistPro extends JFrame implements ActionListener {
    public ArtistPro() {
        initComponents();
    }
    public static File musicfile = new File("C:\\Users\\global village\\OneDrive\\Desktop\\musicdatabase.txt");
    public static File albumfile = new File("C:\\Users\\global village\\OneDrive\\Desktop\\albumdatabase.txt");
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();

        //======== this ========
        setTitle("Spotify");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\download.png").getImage());
        getContentPane().setBackground(new Color(0xFF4CB679,true));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("Exit");
        button1.setBackground(new Color(0xcc0000));
        contentPane.add(button1);
        button1.setBounds(0, 0, 90, 35);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Profile");
        button2.setBackground(new Color(0x006600));
        contentPane.add(button2);
        button2.setBounds(655, 0, 90, 35);
        button2.addActionListener(this::actionPerformed);

        //---- button3 ----
        button3.setText("CREATE SONG");
        button3.setBackground(new Color(0x006633));
        button3.setFont(button3.getFont().deriveFont(button3.getFont().getStyle() | Font.ITALIC));
        contentPane.add(button3);
        button3.setBounds(235, 100, 130, 50);
        button3.addActionListener(this::actionPerformed);

        //---- label1 ----
        label1.setText("S P O T I F Y");
        label1.setFont(new Font("Ebrima", Font.BOLD, 20));
        label1.setForeground(Color.black);
        contentPane.add(label1);
        label1.setBounds(315, 0, 130, 35);

        //---- label2 ----
        label2.setText("Welcome << " + Login.User + " >>");
        label2.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
        contentPane.add(label2);
        label2.setBounds(290, 40, 185, label2.getPreferredSize().height);

        //---- button4 ----
        button4.setText("CREATE ALBUM");
        button4.setBackground(new Color(0x006633));
        button4.setFont(button4.getFont().deriveFont(button4.getFont().getStyle() | Font.ITALIC));
        contentPane.add(button4);
        button4.setBounds(380, 100, 145, 50);
        button4.addActionListener(this::actionPerformed);

        //---- button5 ----
        button5.setText("REMOVE SONG");
        button5.setBackground(new Color(0x006633));
        button5.setFont(button5.getFont().deriveFont(button5.getFont().getStyle() | Font.ITALIC));
        contentPane.add(button5);
        button5.setBounds(235, 170, 130, 50);
        button5.addActionListener(this::actionPerformed);

        //---- button6 ----
        button6.setText("REMOVE ALBUM");
        button6.setBackground(new Color(0x006633));
        button6.setFont(button6.getFont().deriveFont(button6.getFont().getStyle() | Font.ITALIC));
        contentPane.add(button6);
        button6.setBounds(380, 170, 145, 50);
        button6.addActionListener(this::actionPerformed);

        //---- button7 ----
        button7.setText("MY SONGS");
        button7.setBackground(new Color(0x006600));
        button7.setFont(button7.getFont().deriveFont(button7.getFont().getStyle() | Font.ITALIC));
        contentPane.add(button7);
        button7.setBounds(235, 260, 130, 50);
        button7.addActionListener(this::actionPerformed);

        //---- button8 ----
        button8.setText("MY ALBUMS");
        button8.setBackground(new Color(0x006600));
        button8.setFont(button8.getFont().deriveFont(button8.getFont().getStyle() | Font.ITALIC));
        contentPane.add(button8);
        button8.setBounds(380, 260, 130, 50);
        button8.addActionListener(this::actionPerformed);

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
        setSize(755, 380);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label1;
    private JLabel label2;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;@Override



    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            Menu menu = new Menu();
        }
        if(e.getSource() == button2){
            dispose();
            Profile profile = new Profile();
        }
        if(e.getSource() == button3){
            dispose();
            CreateMusic createMusic = new CreateMusic();
        }
        if(e.getSource() == button4){
            dispose();
            CreateAlbum createAlbum = new CreateAlbum();
        }
        if(e.getSource() == button7){
            dispose();
            MusicLIST musicLIST = new MusicLIST();
        }
        if(e.getSource() == button8){
            dispose();
            AlbumLIST albumLIST = new AlbumLIST();
        }

    }



    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
