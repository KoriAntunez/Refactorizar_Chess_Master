import java.awt.GridLayout;
import javax.swing.*;
// -------------------------------------------------------------------------
/**
 * Aqui es donde yacen las piezas después de ser capturadas.
 *
 * @version 2010.11.17
 */
public class ChessGraveyard
    extends JPanel{
    private String title;
    /**
     * Cree un nuevo objeto ChessGraveyard.
     *
     * @param title
     *            Titulo de graveyard
     */
    public ChessGraveyard( String title ){
        this.title = title;
        this.add( new JLabel( title ) );
        this.setLayout( new GridLayout( 8, 0 ) );
    }

    /**
     * Añade una pieza al cementerio.
     */
    public void addPiece( ChessGamePiece piece ){
        piece.setPieceLocation( -1, -1 );
        JLabel pieceLabel = new JLabel();
        pieceLabel.setIcon( piece.getImage() );
        this.add( pieceLabel );
    }
    
    /**
     * Elimina todas las piezas del cementerio.
     */
    public void clearGraveyard(){
        this.removeAll();
        this.add( new JLabel( title ) );
    }
}
