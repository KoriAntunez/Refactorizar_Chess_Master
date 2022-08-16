import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Rook
    extends ChessGamePiece{
    public Rook( ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color );
    }
    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        ArrayList<String> northMoves = calculateNorthMoves( board, 8 );
        ArrayList<String> southMoves = calculateSouthMoves( board, 8 );
        ArrayList<String> westMoves = calculateWestMoves( board, 8 );
        ArrayList<String> eastMoves = calculateEastMoves( board, 8 );
        ArrayList<String> allMoves = new ArrayList<>();
        allMoves.addAll( northMoves );
        allMoves.addAll( southMoves );
        allMoves.addAll( westMoves );
        allMoves.addAll( eastMoves );
        return allMoves;
    }

    @Override
    public ImageIcon createImageByPieceType(){
        if( getColorOfPiece() == ChessGamePiece.WHITE ){
            return new ImageIcon( getClass().getResource("chessImages/WhiteRook.gif"));
        }
        else{
            return new ImageIcon(getClass().getResource("chessImages/BlackRook.gif"));
        }
    }
}
