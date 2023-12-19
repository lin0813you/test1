import javax.swing.*;


public class View extends JFrame {

    JTextField input;
    JButton button;
    JTextArea output;

    public View() {
        super("MVC 架構 ");

        input = new JTextField(20);
        button = new JButton("輸出");
        output = new JTextArea(10, 20);

        JPanel panel = new JPanel();
        panel.add(input);
        panel.add(button);
        panel.add(output);

        getContentPane().add(panel);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public String getInputText() {
        return input.getText();
    }

    public void setOutputText(String text) {
        output.setText(text);
    }
}

