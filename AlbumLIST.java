import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Nov 16 20:28:27 IRST 2023
 */



/**
 * @author global village
 */
public class AlbumLIST extends JFrame implements ActionListener {
    public AlbumLIST() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        scrollPane2 = new JScrollPane();
        list2 = new JList();
        scrollPane3 = new JScrollPane();
        list3 = new JList();
        scrollPane4 = new JScrollPane();
        list4 = new JList();
        label1 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("Spotify");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\download.png").getImage());
        getContentPane().setBackground(new Color(0xFF4CB679,true));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);


        try{
            ArrayList<String> AlbumList = new ArrayList<>();
            Scanner scanner = new Scanner(ArtistPro.albumfile);
            while (scanner.hasNextLine()){
                String array = scanner.nextLine();
                array = array.trim().substring(1,array.indexOf("]"));
                array = array.replace(" ","");
                String[] list = array.split(",");
                AlbumList.add(list[0]);
            }
        }catch (FileNotFoundException e2) {
            System.out.println("An error occurred.");
            e2.printStackTrace();
        }


        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }
        contentPane.add(scrollPane1);
        scrollPane1.setBounds(15, 60, 105, 385);

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(list2);
        }
        contentPane.add(scrollPane2);
        scrollPane2.setBounds(130, 60, 105, 385);

        //======== scrollPane3 ========
        {
            scrollPane3.setViewportView(list3);
        }
        contentPane.add(scrollPane3);
        scrollPane3.setBounds(240, 60, 105, 385);

        //======== scrollPane4 ========
        {
            scrollPane4.setViewportView(list4);
        }
        contentPane.add(scrollPane4);
        scrollPane4.setBounds(350, 60, 105, 385);

        //---- label1 ----
        label1.setText("ALBUM LIST");
        label1.setFont(label1.getFont().deriveFont(Font.BOLD|Font.ITALIC, label1.getFont().getSize() + 15f));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(15, 10), label1.getPreferredSize()));

        //---- button1 ----
        button1.setText("Back");
        button1.setBackground(new Color(0x006633));
        contentPane.add(button1);
        button1.setBounds(20, 465, 100, 40);
        button1.addActionListener(this::actionPerformed);

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
        setSize(480, 560);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JScrollPane scrollPane1;
    private JList list1;
    private JScrollPane scrollPane2;
    private JList list2;
    private JScrollPane scrollPane3;
    private JList list3;
    private JScrollPane scrollPane4;
    private JList list4;
    private JLabel label1;
    private JButton button1;@Override



    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            ArtistPro artistPro = new ArtistPro();
        }
    }



    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
