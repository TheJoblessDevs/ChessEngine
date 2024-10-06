package com.project.chessengine;

public class ChessBoard {
    private char[][] board;

    public ChessBoard() {
        board = new char [8][8];
        setupBoard();
    }

    private void setupBoard() {
        //Set Up Empty Board
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                board[i][j] = '.';
            }
        }

        //Set up White Pieces (Capital Pieces)
        board[0] = new char[]{'R','N','B','Q','K','B','N','R'};
        for(int i=0;i<8;i++){
                board[1][i] = 'P';
        }

        //Set up Black Pieces (Common Pieces)
        board[7] = new char[]{'r','n','b','q','k','b','n','r'};
        for(int i=0;i<8;i++){
                board[6][i] = 'p';
        }
    }

    public String printBoard(){
 
        StringBuilder sb = new StringBuilder();
        
        sb.append("  a b c d e f g h\n"); // Top column labels with padding
        for (int i = 7; i > -1; i--) {
            sb.append(8 - i).append(" "); // Row number at the start
            for (int j = 0; j < 8; j++) {
                sb.append(board[i][j]).append(" "); // Add pieces with space between
            }
            sb.append(8 - i).append("\n"); // Row number at the end
        }
        sb.append("  a b c d e f g h"); // Bottom column labels with padding
        return sb.toString();     
    }

    public String printBoardWeb(){
 
        StringBuilder sb = new StringBuilder();
        
        sb.append("  a b c d e f g h <br>"); // Top column labels with padding
        for (int i = 7; i > -1; i--) {
            sb.append(8 - i).append(" "); // Row number at the start
            for (int j = 0; j < 8; j++) {
                sb.append(board[i][j]).append(" "); // Add pieces with space between
            }
            sb.append(8 - i).append("<br>"); // Row number at the end
        }
        sb.append("  a b c d e f g h"); // Bottom column labels with padding
        return sb.toString();     
    }
}
