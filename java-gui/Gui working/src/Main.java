import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.NavigableMap;

public class Main extends JFrame implements ActionListener {
    JButton button;



    public static void main(String[] args){
        ImageIcon bnt_icon=new ImageIcon("C:\\Users\\Admin\\Desktop\\java-gui\\Gui working\\Untitled.jpeg");

        JFrame frame=frame_constructor();
        JPanel NavPanel=panel_constructor(0,0,150,600);
        NavPanel.setBackground(Color.lightGray);
        frame.add(NavPanel);

        JPanel panel2=panel_constructor();


        NavPanel.add(label_constructor("This is a panel",20,10,120,70));

        JButton button=new JButton();
        button.setBounds(180,40,130,25);
        button.setText("Hi! click me!");
        button.setIcon(bnt_icon);
        frame.add(button);
        frame.setVisible(true);

    }

    public static JPanel panel_constructor(int x,int y,int width,int height){
        JPanel panel=new JPanel();
        panel.setBounds(x,y,width,height);
        return panel;

    }

    public static JLabel label_constructor(String text,int x,int y,int width,int height){
        JLabel label=new JLabel();
        label.setText(text);
        label.setBounds(x,y,width,height);
        return label;
    }


    public static JFrame frame_constructor(){
        JFrame frame=new JFrame();
        frame.setTitle("Paneling");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800,600);
        frame.getContentPane().setBackground(Color.darkGray);

        frame.setResizable(false);
        return  frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("Hi i am a button");
        }
    }
}