package application;

import chess.ChessMatch;
import application.UI;
import chess.ChessMatch;
public class Programs {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }

}
