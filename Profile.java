import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile extends JFrame implements ActionListener {
    public Profile() {
        initComponents();
    }

    ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\dow.png");
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        button1 = new JButton();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();

        //======== this ========
        setTitle("Spotify");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\download.png").getImage());
        getContentPane().setBackground(new Color(0xFF4CB679,true));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Username : "+ Login.User);
        label1.setBackground(Color.WHITE);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setVerticalAlignment(SwingConstants.TOP);
        label1.setFont(new Font("JetBrains Mono ExtraLight", Font.ITALIC, 16));
        contentPane.add(label1);
        label1.setBounds(123, 210, 150, 150);

        //---- button1 ----
        button1.setText("Back");
        button1.setForeground(new Color(0xeeeeee));
        button1.setBackground(new Color(0x006633));
        contentPane.add(button1);
        button1.setBounds(15, 500, 95, 35);
        button1.addActionListener(this::actionPerformed);

        //---- label2 ----
        label2.setText("S P O T I F Y");
        label2.setFont(new Font("Rockwell", Font.BOLD, 20));
        contentPane.add(label2);
        label2.setBounds(145, 5, 170, 25);

        //---- label3 ----
        label3.setIcon(imageIcon1);
        label3.setVerticalAlignment(JLabel.TOP);
        label3.setBounds(132,50,100,100);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setSize(146,150);
        contentPane.add(label3);

        //---- label5 ----
        label5.setText("Password : "+ Login.Pass);
        label5.setBackground(Color.WHITE);
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setVerticalAlignment(SwingConstants.TOP);
        label5.setFont(new Font("JetBrains Mono ExtraLight", Font.ITALIC, 16));
        contentPane.add(label5);
        label5.setBounds(123, 235, 200, 150);

        //---- label6 ----
        label6.setText("Gender : "+ Login.Gender);
        label6.setBackground(Color.WHITE);
        label6.setHorizontalAlignment(SwingConstants.CENTER);
        label6.setVerticalAlignment(SwingConstants.TOP);
        label6.setFont(new Font("JetBrains Mono ExtraLight", Font.ITALIC, 16));
        contentPane.add(label6);
        label6.setBounds(123, 260, 150, 150);

        //---- label7 ----
        label7.setText("Date of Birth : "+ Login.dateOfBirth);
        label7.setBackground(Color.WHITE);
        label7.setHorizontalAlignment(SwingConstants.CENTER);
        label7.setVerticalAlignment(SwingConstants.TOP);
        label7.setFont(new Font("JetBrains Mono ExtraLight", Font.ITALIC, 16));
        contentPane.add(label7);
        label7.setBounds(95, 285, 200, 150);

        //---- label4 ----
        label4.setText("Type : "+ Login.Type);
        label4.setBackground(Color.WHITE);
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setVerticalAlignment(SwingConstants.TOP);
        label4.setFont(new Font("JetBrains Mono ExtraLight", Font.ITALIC, 16));
        contentPane.add(label4);
        label4.setBounds(130, 310, 150, 150);
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
        setSize(400, 580);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JButton button1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label7;
    private JLabel label6;
    private JLabel label5;@Override


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            if(Login.Type == "Listener"){
            MainPro mainPro = new MainPro();
            }
            else if(Login.Type == "Artist"){
                ArtistPro artistPro = new ArtistPro();
            }
        }
    }


    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

