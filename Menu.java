import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Nov 07 01:40:42 IRST 2023
 */



/**
 * @author global village
 */
public class Menu extends JFrame implements ActionListener {
    public Menu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("Spotify");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\download.png").getImage());
        getContentPane().setBackground(new Color(0xFF4CB679,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("S P O T I F Y");
        label1.setForeground(new Color(0x112D1E));
        label1.setFont(new Font("Bell MT", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 15));
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(115, 20), label1.getPreferredSize()));

        //---- button1 ----
        button1.setText("Sign Up");
        button1.setBackground(new Color(0x006633));
        button1.setForeground(Color.white);
        contentPane.add(button1);
        button1.setBounds(135, 75, 130, 50);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Login");
        button2.setBackground(new Color(0x006633));
        button2.setForeground(Color.white);
        contentPane.add(button2);
        button2.setBounds(135, 135, 130, 50);
        button2.addActionListener(this::actionPerformed);

        //---- button3 ----
        button3.setText("E x i t");
        button3.setForeground(Color.lightGray);
        button3.setBackground(new Color(0xD00E0E));
        contentPane.add(button3);
        button3.setBounds(160, 215, 85, 35);
        button3.addActionListener(this::actionPerformed);

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
        setSize(410, 355);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;@Override




    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == button1){
           dispose();
           Signup signup = new Signup();
       }
        if(e.getSource() == button2){
            dispose();
            Login login = new Login();
        }
        if(e.getSource() == button3){
            dispose();
        }
    }



    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
