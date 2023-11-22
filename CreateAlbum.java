import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Nov 14 17:28:49 IRST 2023
 */



/**
 * @author global village
 */
public class CreateAlbum extends JFrame implements ActionListener {
    public CreateAlbum() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        textField1 = new JTextField();
        textField2 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label5 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("Spotify");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\download.png").getImage());
        getContentPane().setBackground(new Color(0xFF4CB679,true));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- textField1 ----
        textField1.setBackground(new Color(0x99ff99));
        contentPane.add(textField1);
        textField1.setBounds(20, 95, 380, 45);

        //---- textField2 ----
        textField2.setBackground(new Color(0x99ff99));
        contentPane.add(textField2);
        textField2.setBounds(20, 185, 380, 45);


        //---- label1 ----
        label1.setText("Album Name");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(25, 80), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("Album Artist Name");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(25, 170), label2.getPreferredSize()));


        //---- label5 ----
        label5.setText("CREATE ALBUM");
        label5.setFont(new Font("Ebrima", Font.BOLD, 20));
        label5.setEnabled(false);
        label5.setForeground(new Color(0x1C0808));
        //label5.setBackground(new Color(0x1C0808));
        contentPane.add(label5);
        label5.setBounds(20, 10, label5.getPreferredSize().width, 35);

        //---- button1 ----
        button1.setText("Cancel");
        button1.setBackground(new Color(0xcc0000));
        contentPane.add(button1);
        button1.setBounds(70, 270, 115, 45);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Submit");
        button2.setBackground(new Color(0x006633));
        contentPane.add(button2);
        button2.setBounds(240, 270, 115, 45);
        button2.addActionListener(this::actionPerformed);

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
        setSize(430, 380);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTextField textField1;
    private JTextField textField2;
    public static ArrayList<Music> albumMusicList;
    public static String albumName;
    public static String albumArtistName;
    private JLabel label1;
    private JLabel label2;
    private JLabel label5;
    private JButton button1;
    private JButton button2;@Override




    public void actionPerformed (ActionEvent e) {

        if (e.getSource() == button1){
            dispose();
            ArtistPro artistPro = new ArtistPro();
        }

        if (e.getSource() == button2){
            dispose();

            albumName = textField1.getText();
            albumArtistName = textField2.getText();




            ArrayList<String> albumInfo = new ArrayList<>();
            albumMusicList = new ArrayList<>();

            albumInfo.add(albumName);
            albumInfo.add(albumArtistName);

            try{
                Scanner scanner = new Scanner(ArtistPro.musicfile);
                while (scanner.hasNextLine()){
                    String array = scanner.nextLine();
                    array = array.trim().substring(1,array.indexOf("]"));
                    array = array.replace(" ","");
                    String[] list = array.split(",");

                    if(albumName.equals(list[2])){
                        albumMusicList.add(CreateMusic.music);
                        break;
                    }
                }
            }catch (FileNotFoundException e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }


            Album album = new Album(albumName,albumArtistName,albumMusicList);


            try {
                FileWriter writer = new FileWriter(ArtistPro.albumfile.getAbsolutePath(), true);
                if (!ArtistPro.albumfile.exists()) {
                    ArtistPro.albumfile.createNewFile();
                }
                writer.write("\n"+String.valueOf(albumInfo));
                writer.close();

            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }

            dispose();
            AlbumCreated albumCreated = new AlbumCreated();
        }

    }



    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
