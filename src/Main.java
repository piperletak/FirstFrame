import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){

        //graphics
        // 1 create frame
        // 2 create panel
        // 3 create components
        // 4 add components to panel
        // 5 add panel to frame
        // 6 set frame visible

        //1
        JFrame frame = new JFrame("My first frame");
        // frame size
        frame.setSize(500,500);
        //2
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255,200,200));
        panel.setBackground(Color.PINK);
        //3
        JLabel label = new JLabel("Hello World");
        JButton button = new JButton("Push me");
        JTextField textField = new JTextField(10);
        JSpinner spinner = new JSpinner();
        JSlider slider = new JSlider(1,5);

        //add an image!
        ImageIcon icon = new ImageIcon("Images/myCards/2C.png");
        icon.setImage(icon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        //create label with icon on it -- also look in JLabel api
        JLabel piclabel = new JLabel(icon);


        //4
        panel.add(label); //inheritance lesson//
        panel.add(button);
        panel.add(textField);
        panel.add(piclabel);
        panel.add(spinner);
        panel.add(slider);
        //5
        frame.add(panel);
        //6
        frame.setVisible(true);

    }
}