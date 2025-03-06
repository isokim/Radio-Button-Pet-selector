import javax.swing.*;
import java.awt.*;

public class RadioButton extends JPanel {
    private JRadioButton r1, r2, r3, r4, r5;
    private JLabel imageLabel;

    public RadioButton() {
        setLayout(null);

        JLabel title = new JLabel("RadioButtonDemo");
        title.setFont(new Font("Segoe UI", Font.BOLD, 36));
        title.setBounds(180, 10, 400, 50);
        add(title);

        r1 = new JRadioButton("Bird");
        r1.setBounds(20, 80, 100, 30);
        add(r1);

        r2 = new JRadioButton("Cat");
        r2.setBounds(20, 120, 100, 30);
        add(r2);

        r3 = new JRadioButton("Dog");
        r3.setBounds(20, 160, 100, 30);
        add(r3);

        r4 = new JRadioButton("Rabbit");
        r4.setBounds(20, 200, 100, 30);
        add(r4);

        r5 = new JRadioButton("Pig");
        r5.setBounds(20, 240, 100, 30);
        add(r5);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);
        group.add(r5);

        imageLabel = new JLabel();
        imageLabel.setBounds(200, 80, 300, 200);
        add(imageLabel);

        r1.addActionListener(e -> showImage("images/bird.jpg"));
        r2.addActionListener(e -> showImage("images/cat.png"));
        r3.addActionListener(e -> showImage("images/dog.jpg"));
        r4.addActionListener(e -> showImage("images/rabbit.jpg"));
        r5.addActionListener(e -> showImage("images/pig.jpg"));
    }

    private void showImage(String path) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(img));
    }
}
