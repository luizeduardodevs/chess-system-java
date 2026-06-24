import application.UI;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;

public static void main(String[] args) {
    ChessMatch chessMatch = new ChessMatch();
    UI.printBoard(chessMatch.getPieces());
}
