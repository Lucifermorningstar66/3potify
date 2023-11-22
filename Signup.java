import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;
import java.util.ArrayList;
import javax.swing.*;
import javax.rmi.ssl.SslRMIClientSocketFactory;
/*
 * Created by JFormDesigner on Tue Nov 07 02:28:02 IRST 2023
 */



/**
 * @author global village
 */
public class Signup extends JFrame implements ActionListener {
    public Signup() {
        initComponents();
    }
    public static File file = new File("C:\\Users\\global village\\OneDrive\\Desktop\\database.txt");
    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        String[] comboBox = {"Male" , "Female"}; comboBox1 = new JComboBox(comboBox);
        label4 = new JLabel();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        label5 = new JLabel();
        String[] comboBoxx = {"Artist" , "Listener"}; comboBox2 = new JComboBox(comboBoxx);
        label6 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();


        //======== this ========
        setTitle("Spotify");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\download.png").getImage());
        getContentPane().setBackground(new Color(0xFF4CB679,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Sign Up");
        label1.setFont(new Font("Bell MT", label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 15));
        contentPane.add(label1);
        label1.setBounds(15, 15, 135, 40);

        //---- textField1 ----
        textField1.setBackground(new Color(0x99ff99));
        contentPane.add(textField1);
        textField1.setBounds(20, 95, 350, 45);

        //---- label2 ----
        label2.setText("Username");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(25, 80), label2.getPreferredSize()));

        //---- textField2 ----
        textField2.setBackground(new Color(0x99ff99));
        contentPane.add(textField2);
        textField2.setBounds(20, 170, 350, 45);

        //---- label3 ----
        label3.setText("Password");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(25, 155), label3.getPreferredSize()));

        //---- comboBox1 ----
        comboBox1.addActionListener(this::actionPerformed);
        comboBox1.setBackground(new Color(0x99ff99));
        contentPane.add(comboBox1);
        comboBox1.setBounds(20, 245, 350, 45);

        //---- label4 ----
        label4.setText("Gender");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(25, 230), label4.getPreferredSize()));

        //---- textField3 ----
        textField3.setBackground(new Color(0x99ff99));
        contentPane.add(textField3);
        textField3.setBounds(20, 320, 100, 40);
        textField3.setText("Year");

        //---- textField4 ----
        textField4.setBackground(new Color(0x99ff99));
        contentPane.add(textField4);
        textField4.setBounds(145, 320, 100, 40);
        textField4.setText("Month");

        //---- textField5 ----
        textField5.setBackground(new Color(0x99ff99));
        contentPane.add(textField5);
        textField5.setBounds(265, 320, 105, 40);
        textField5.setText("Day");

        //---- label5 ----
        label5.setText("Date of Birth");
        contentPane.add(label5);
        label5.setBounds(new Rectangle(new Point(25, 305), label5.getPreferredSize()));

        //---- comboBox2 ----
        comboBox2.addActionListener(this::actionPerformed);
        comboBox2.setBackground(new Color(0x99ff99));
        contentPane.add(comboBox2);
        comboBox2.setBounds(20, 395, 350, 45);

        //---- label6 ----
        label6.setText("Type of User");
        contentPane.add(label6);
        label6.setBounds(new Rectangle(new Point(25, 380), label6.getPreferredSize()));

        //---- button1 ----
        button1.setText("Cancel");
        button1.setBackground(new Color(0xccffcc));
        contentPane.add(button1);
        button1.setBounds(65, 465, 120, 45);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Sign up");
        button2.setBackground(new Color(0x009933));
        contentPane.add(button2);
        button2.setBounds(210, 465, 125, 45);
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
        setSize(405, 570);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    public static String username;
    public static String password;
    public static String gender;
    public static String typeOfUser;
    public static String dateOfBirth;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JComboBox comboBox1;
    private JLabel label4;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel label5;
    private JComboBox comboBox2;
    private JLabel label6;
    private JButton button1;
    private JButton button2;@Override


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            Menu menu = new Menu();
        }

        if(e.getSource() == button2){
            username = textField1.getText();
            password = textField2.getText();
            gender = String.valueOf(comboBox1.getSelectedItem());
            typeOfUser = String.valueOf(comboBox2.getSelectedItem());
            dateOfBirth = textField3.getText()+"/"+textField4.getText()+"/"+textField5.getText();
            UserInfo user = new UserInfo(username,password,gender,dateOfBirth,typeOfUser);


            ArrayList<String> info = new ArrayList<>();
            info.add(username);
            info.add(password);
            info.add(gender);
            info.add(dateOfBirth);
            info.add(typeOfUser);

            try {
                FileWriter writer = new FileWriter(file.getAbsolutePath(), true);
                if (!file.exists()) {
                    file.createNewFile();
                }
                writer.write("\n"+String.valueOf(info));
                writer.close();

            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }

            dispose();
           WelcomeNewMem welcomeNewMem = new WelcomeNewMem();

        }
    }



    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
