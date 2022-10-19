import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Game(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

    public void setMoveHistory(ArrayList<Move> moveHistory) {
        this.moveHistory = moveHistory;
    }

    /**
     * .
     *
     * @param piece .
     * @param x     .
     * @param y     .
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Piece other = board.getAt(x, y);
            if (other == null) {
                moveHistory.add(new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y,
                        piece));
            } else {
                moveHistory.add(new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y,
                        piece, other));
                board.removeAt(x, y);
            }

            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

}
