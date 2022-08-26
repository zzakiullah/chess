import javax.swing.*;

class MainScreen extends JLayeredPane {

    ChessBoard chessBoard;

    public MainScreen() {
        super();

        chessBoard = new ChessBoard();
    }
}
