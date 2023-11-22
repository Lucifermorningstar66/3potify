import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Nov 07 01:54:07 IRST 2023
 */



/**
 * @author global village
 */
public class Login extends JFrame implements ActionListener {
    public Login() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        textField1 = new JTextField();
        passwordField1 = new JPasswordField();
        label2 = new JLabel();
        label3 = new JLabel();
        String[] comboBox = {"Artist" , "Listener"}; comboBox1 = new JComboBox(comboBox);
        label4 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("Spotify");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\download.png").getImage());
        getContentPane().setBackground(new Color(0xFF4CB679,true));
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Login");
        label1.setFont(new Font("Bell MT", label1.getFont().getStyle(), label1.getFont().getSize() + 15));
        label1.setBackground(Color.black);
        contentPane.add(label1);
        label1.setBounds(15, 15, 135, 40);

        //---- textField1 ----
        textField1.setBackground(new Color(0x99ff99));
        contentPane.add(textField1);
        textField1.setBounds(20, 85, 350, 45);

        //---- passwordField1 ----
        passwordField1.setBackground(new Color(0x99ff99));
        contentPane.add(passwordField1);
        passwordField1.setBounds(20, 160, 350, 45);

        //---- label2 ----
        label2.setText("Username");
        contentPane.add(label2);
        label2.setBounds(new Rectangle(new Point(25, 70), label2.getPreferredSize()));

        //---- label3 ----
        label3.setText("Password");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(25, 145), label3.getPreferredSize()));

        //---- comboBox1 ----
        comboBox1.addActionListener(this::actionPerformed);
        comboBox1.setBackground(new Color(0x99ff99));
        contentPane.add(comboBox1);
        comboBox1.setBounds(20, 235, 350, 45);

        //---- label4 ----
        label4.setText("Type of User");
        contentPane.add(label4);
        label4.setBounds(new Rectangle(new Point(25, 220), label4.getPreferredSize()));

        //---- button1 ----
        button1.setText("Cancel");
        button1.setBackground(new Color(0xcc0000));
        contentPane.add(button1);
        button1.setBounds(65, 315, 115, 35);
        button1.addActionListener(this::actionPerformed);

        //---- button2 ----
        button2.setText("Login");
        button2.setBackground(new Color(0x009933));
        contentPane.add(button2);
        button2.setBounds(210, 315, 115, 35);
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
        setSize(395, 445);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    public static boolean invalid;
    public static String User;
    public static String Pass;
    public static String Type;
    public static String Gender;
    public static String dateOfBirth;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel label2;
    private JLabel label3;
    private JComboBox comboBox1;
    private JLabel label4;
    private JButton button1;
    private JButton button2;@Override



    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            dispose();
            Menu menu = new Menu();
        }
        if(e.getSource() == button2){
            dispose();
            invalid = false;
            User = textField1.getText();
            Pass = Arrays.toString(passwordField1.getPassword());
            Pass = Pass.trim().substring(1,Pass.indexOf("]"));
            Pass = Pass.replace(",","");
            Pass = Pass.replace(" ","");
            Type = (String)comboBox1.getSelectedItem();
        try{
            Scanner scanner = new Scanner(Signup.file);
            while (scanner.hasNextLine()){
                String array = scanner.nextLine();
                array = array.trim().substring(1,array.indexOf("]"));
                array = array.replace(" ","");
                String[] list = array.split(",");

                if(User.equals(list[0]) && Pass.equals(list[1]) && Type.equals(list[4])){
                    Gender = (list[2]);
                    dateOfBirth = (list[3]);
                   WelcomeBack welcomeBack = new WelcomeBack();
                   invalid = true;
                   break;
                }
            }
        }catch (FileNotFoundException e2) {
            System.out.println("An error occurred.");
            e2.printStackTrace();
}
        if(invalid == false){
            InvalidLogin invalidLogin = new InvalidLogin();
        }
        }

    }



    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

//ddd
//[d, d, d]