import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;

    private ArrayList<Piece> pieces;

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    public boolean validate(int x, int y) {
        return 1 <= x && x <= 8 && 1 <= y && y <= 8;
    }

    /**
     * ff.
     *
     * @param piece f
     */
    public void addPiece(Piece piece) {
        if (!validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            return;
        }
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == piece.getCoordinatesX()
                    && p.getCoordinatesY() == piece.getCoordinatesY()) {
                return;
            }
        }
        pieces.add(piece);
    }

    /**
     * .
     *
     * @param x .
     * @param y .
     * @return .
     */
    public Piece getAt(int x, int y) {
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                return p;
            }
        }
        return null;
    }

    /**
     * .
     *
     * @param x .
     * @param y .
     */
    public void removeAt(int x, int y) {
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                pieces.remove(p);
                return;
            }
        }
    }
}
