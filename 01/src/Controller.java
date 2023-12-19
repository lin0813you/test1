import javax.swing.*;
import java.awt.event.ActionListener;


public class Controller {

    private View view;
    private Model model;

    public Controller(View view,Model model) {
        this.view = view;
        this.model = model;
    }

    public void initController() {
        view.button.addActionListener(e -> buttonClick());
    }

    private void buttonClick() {
        model.setText(view.getInputText());
        view.setOutputText(model.getText());
    }
}
