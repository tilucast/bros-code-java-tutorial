import javax.swing.*;

public class Gui {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Type anything here boi.");
        JOptionPane.showMessageDialog(null, name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Type anyother thing you like here as well..."));
        JOptionPane.showMessageDialog(null, age);

        double x = Double.parseDouble(JOptionPane.showInputDialog("Type a double value boi"));
        JOptionPane.showMessageDialog(null, x);
    }
}
