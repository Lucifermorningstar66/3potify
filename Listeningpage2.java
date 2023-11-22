import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Listeningpage2 implements ActionListener{
    private MusicPlayer musicPlayer = new MusicPlayer();
    private MusicPlayer musicPlayer2 = new MusicPlayer();
    private MusicPlayer musicPlayer3 = new MusicPlayer();
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JButton Stopbutton = new JButton("■");
    JButton Playbutton = new JButton("▶️");
    JButton Playbutton2 = new JButton("▶️");
    JButton Stopbutton2 = new JButton("■");
    JButton Playbutton3 = new JButton("▶️");
    JButton Stopbutton3 = new JButton("■");
    JButton button1 = new JButton();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();

    Listeningpage2() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        label2.setText("E U P H O R I A - Voj");
        label2.setForeground(Color.BLACK);
        label1.setBackground(Color.GREEN);
        label2.setSize(20, 20);
        label2.setBounds(240, 80, 300, 40);
        label2.setFont(new Font("Tahoma", Font.BOLD, 20));

        label1.setText("L O V E A G A I N - Dua Lipa");
        label1.setForeground(Color.BLACK);
        label1.setBackground(Color.GREEN);
        label1.setSize(20, 20);
        label1.setBounds(200, 296, 300, 40);
        label1.setFont(new Font("Tahoma", Font.BOLD, 20));

        label3.setText("Little DARK AGE - MGMT");
        label3.setForeground(Color.BLACK);
        label3.setBackground(Color.GREEN);
        label3.setSize(20, 20);
        label3.setBounds(170, 515, 320, 40);
        label3.setFont(new Font("Tahoma", Font.BOLD, 20));

        Stopbutton.setFocusable(false);
        Playbutton.setFocusable(false);
        Playbutton2.setFocusable(false);
        Stopbutton2.setFocusable(false);
        Stopbutton3.setFocusable(false);
        Playbutton3.setFocusable(false);
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(Playbutton);
        frame.add(Stopbutton);


        Stopbutton.setBackground(Color.black);
        Stopbutton.setForeground(Color.green);
        Playbutton.setBackground(Color.black);
        Playbutton.setForeground(Color.green);
        Stopbutton2.setBackground(Color.black);
        Stopbutton2.setForeground(Color.green);
        Playbutton2.setBackground(Color.black);
        Playbutton2.setForeground(Color.green);
        Stopbutton3.setBackground(Color.black);
        Stopbutton3.setForeground(Color.green);
        Playbutton3.setBackground(Color.black);
        Playbutton3.setForeground(Color.green);


        Playbutton2.setBorder(new LineBorder(Color.green, 1));
        Stopbutton2.setBorder(new LineBorder(Color.green, 1));
        Playbutton.setBorder(new LineBorder(Color.green, 1));
        Stopbutton.setBorder(new LineBorder(Color.green, 1));
        Playbutton3.setBorder(new LineBorder(Color.green, 1));
        Stopbutton3.setBorder(new LineBorder(Color.green, 1));

        //---- button1 ----
        button1.setText("Back");
        button1.setForeground(new Color(0xeeeeee));
        button1.setBackground(new Color(0x006633));
        frame.add(button1);
        button1.setBounds(400, 652, 95, 35);
        button1.addActionListener(this::actionPerformed);


        frame.add(Playbutton3);
        frame.add(Stopbutton3);
        frame.add(Playbutton2);
        frame.add(Stopbutton2);
        Stopbutton2.setBounds(11, 340, 100, 40);
        Playbutton2.setBounds(11, 260, 100, 40);
        Stopbutton.setBounds(11, 120, 100, 40);
        Playbutton.setBounds(11, 40, 100, 40);
        Stopbutton3.setBounds(11, 560, 100, 40);
        Playbutton3.setBounds(11, 480, 100, 40);
        frame.setTitle("Spotify");
        frame.setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\Pro2\\download.png").getImage());
        frame.getContentPane().setBackground(new Color(0xFF4CB679,true));
        frame.setSize(500, 725);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        Playbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer.playMusic("C:\\Users\\global village\\OneDrive\\Desktop\\music\\Euphoria.wav");
            }
        });
        Stopbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer.pauseMusic();
            }
        });
        Playbutton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer2.playMusic("C:\\Users\\global village\\OneDrive\\Desktop\\music\\loveagain.wav");
            }
        });

        Stopbutton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer2.pauseMusic();
            }
        });
        Playbutton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer3.playMusic("C:\\Users\\global village\\OneDrive\\Desktop\\music\\LittleDarkAge.wav");
            }
        });

        Stopbutton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                musicPlayer3.pauseMusic();
            }
        });
    }


    @Override
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == button1){
            frame.dispose();
            MainPro mainPro = new MainPro();
        }
    }
}
