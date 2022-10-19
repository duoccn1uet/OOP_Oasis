public class Rook extends Piece {
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }
        int thisX = getCoordinatesX();
        int thisY = getCoordinatesY();
        if (thisX == x && thisY == y) {
            return false;
        }
        if (thisX != x && thisY != y) {
            return false;
        }

        if (thisX == x) {
            if (thisY < y) {
                for (int y2 = thisY + 1; y2 <= y; ++y2) {
                    Piece other = board.getAt(x, y2);
                    if (other != null) {
                        if (y2 != y) {
                            return false;
                        }
                        return !other.getColor().equals(getColor());
                    }
                }
            } else {
                for (int y2 = thisY - 1; y2 >= y; --y2) {
                    Piece other = board.getAt(x, y2);
                    if (other != null) {
                        if (y2 != y) {
                            return false;
                        }
                        return !other.getColor().equals(getColor());
                    }
                }
            }
        } else {
            if (thisX < x) {
                for (int x2 = thisX + 1; x2 <= x; ++x2) {
                    Piece other = board.getAt(x2, y);
                    if (other != null) {
                        if (x2 != x) {
                            return false;
                        }
                        return !other.getColor().equals(getColor());
                    }
                }
            } else {
                for (int x2 = thisX - 1; x2 >= x; --x2) {
                    Piece other = board.getAt(x2, y);
                    if (other != null) {
                        if (x2 != x) {
                            return false;
                        }
                        return !other.getColor().equals(getColor());
                    }
                }
            }
        }
        return true;
    }
}
