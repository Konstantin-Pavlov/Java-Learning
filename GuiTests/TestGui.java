package GuiTests;
import javax.swing.*;

public class TestGui extends JFrame {
    public static void main(String[] args) {
        Button buttons = new Button();
        buttons.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        buttons.setSize(600, 400);
        buttons.setVisible(true);
    }
}
