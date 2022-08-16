import javax.swing.ImageIcon;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
// -------------------------------------------------------------------------
/**
 * Represents a Knight game piece.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class Knight
    extends ChessGamePiece{

    /**
     * Map to link the piece color to it's path
     * */
    private Map<Integer, String> colors;

    /**
     * Knight constructor for gamePiece
     *
     * @param row
     *            the row to create the knight on
     * @param col
     *            the column to create the knight on
     * @param board
     *            the board to create the piece on
     * @param color
     *            either GamePiece.WHITE, BLACK, or UNASSIGNED
     */

    public Knight( ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color );
    }
    /**
     * Calculates the moves of the knight in the north direction relative to the
     * location of the piece.
     *
     * @param board
     *            the board to check moves on
     * @return ArrayList<String> a list of the possible moves
     */
    private ArrayList<String> calculateNorthMoves( ChessGameBoard board ){
        ArrayList<String> moves = new ArrayList<String>();
        for ( int i = 2; i >= -2; i -= 4 ){
            for ( int j = 1; j >= -1; j -= 2 ){
                if ( isOnScreen( pieceRow + i, pieceColumn + j )
                    && ( isEnemy( board, pieceRow + i, pieceColumn + j ) ||
                        board.getCell(
                        pieceRow + i,
                        pieceColumn + j )
                        .getPieceOnSquare() == null ) ){
                    moves.add( ( pieceRow + i ) + "," + ( pieceColumn + j ) );
                }
            }
        }
        return moves;
    }
    /**
     * Calculates the moves of the knight in the south direction relative to the
     * location of the piece.
     *
     * @param board
     *            the board to check moves on
     * @return ArrayList<String> a list of the possible moves
     */
    private ArrayList<String> calculateSouthMoves( ChessGameBoard board ){
        ArrayList<String> moves = new ArrayList<String>();
        for ( int i = 1; i >= -1; i -= 2 ){
            for ( int j = 2; j >= -2; j -= 4 ){
                if ( isOnScreen( pieceRow + i, pieceColumn + j )
                    && ( isEnemy( board, pieceRow + i, pieceColumn + j ) ||
                        board.getCell(
                        pieceRow + i,
                        pieceColumn + j )
                        .getPieceOnSquare() == null ) ){
                    moves.add( ( pieceRow + i ) + "," + ( pieceColumn + j ) );
                }
            }
        }
        return moves;
    }
    /**
     * Calculates the possible moves for this Knight.
     *
     * @param board
     *            the game board to check
     * @return ArrayList<String> the list of possible moves
     */
    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> moves = new ArrayList<String>();
        if ( isPieceOnScreen() ){
            moves.addAll( calculateNorthMoves( board ) );
            moves.addAll( calculateSouthMoves( board ) );
        }
        return moves;
    }

    /**
     * Sets the piece colors to their paths
     * */
    public void setPieceColors(){
        this.colors = Map.ofEntries(
                new AbstractMap.SimpleEntry<>(ChessGamePiece.BLACK, "chessImages/BlackPawn.gif"),
                new AbstractMap.SimpleEntry<>(ChessGamePiece.WHITE, "chessImages/WhitePawn.gif")
        );
    }

    /**
     * Creates an icon for this piece depending on the piece's color.
     *
     * @return ImageIcon the ImageIcon representation of this piece.
     */
    @Override
    public ImageIcon createImageByPieceType(){

        setPieceColors();

        // looping over colors
        for (Integer color : this.colors.keySet())
        {
            // search for path
            String imagePath = this.colors.get(color);

            if( getColorOfPiece() == color){
                return new ImageIcon(
                        getClass().getResource(imagePath)
                );
            }
        }

        return new ImageIcon(
                getClass().getResource("chessImages/default-Unassigned.gif")
        );

    }
}
