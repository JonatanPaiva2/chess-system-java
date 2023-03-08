package boardgame;

public abstract class Piece {
    
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //Opcional. O padrão já é nulo.
    }

    protected Board getBoard() {
        return board;
    }

}
