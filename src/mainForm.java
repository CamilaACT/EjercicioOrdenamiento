import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame {
    BubbleSort classOrdenamiento = new BubbleSort();
    private JButton ordenarButton;
    private JButton datosNoOrdenadosButton;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JPanel panel1;

    public mainForm(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

    ordenarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            classOrdenamiento.Burbuja();
            textArea2.setText(classOrdenamiento.getPersonaslista().toString());
        }
    });
    datosNoOrdenadosButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            classOrdenamiento.QuemarDatos();
            textArea1.setText(classOrdenamiento.getPersonas().toString());
        }
    });
}
}
