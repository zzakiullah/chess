import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Window extends JFrame implements ActionListener, KeyListener {

    int width, height;

    Timer myTimer;

    public Window() {
        super("Chess Trainer");
        setIconImage(new ImageIcon(getClass().getResource("chess-knight-solid.png").getPath()).getImage());

        width = 800;
        height = 600;

        setSize(width, height);

        myTimer = new Timer(10, this);
        myTimer.start();

        addKeyListener(this);
        requestFocus();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {}

    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

}
