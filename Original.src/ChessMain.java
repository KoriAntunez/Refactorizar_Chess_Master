import javax.swing.*;
// -------------------------------------------------------------------------
/**
 * Muestra GUI para el juego de ajedrez (Interfaz).
 * @version 2010.11.17
 */
public class ChessMain{
    // ----------------------------------------------------------
    /**
     * Crea la GUI para el juego de ajedrez.
     */
    public static void main( String[] args ){
        JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( new ChessPanel() );
        frame.pack();
        frame.setVisible( true );
    }
}
