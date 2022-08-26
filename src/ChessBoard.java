class ChessBoard {
    public ChessBoard() {

        // White pieces
        new King(ChessPiece.WHITE);
        new Queen(ChessPiece.WHITE);
        for (int i=0; i<2; i++) {
            new Rook(ChessPiece.WHITE);
            new Knight(ChessPiece.WHITE);
            new Bishop(ChessPiece.WHITE);
        }
        for (int i=0; i<8; i++) {
            new Pawn(ChessPiece.WHITE);
        }

        // Black pieces
        new King(ChessPiece.BLACK);
        new Queen(ChessPiece.BLACK);
        for (int i=0; i<2; i++) {
            new Rook(ChessPiece.BLACK);
            new Knight(ChessPiece.BLACK);
            new Bishop(ChessPiece.BLACK);
        }
        for (int i=0; i<8; i++) {
            new Pawn(ChessPiece.BLACK);
        }

    }
}
