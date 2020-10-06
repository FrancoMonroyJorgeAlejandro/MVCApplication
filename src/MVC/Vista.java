
package MVC;



import java .awt. *;
import javax . swing . *;
public class Vista extends JFrame implements InterfazVista
{
private final JTextArea texto ; 
private final JButton encriptarJButton ;
private final JButton desencriptarJButton ;


public Vista () {
    super("Cifrador de Texto");
JPanel fileJPanel ;
JPanel buttonJPanel ;
BorderLayout layout ;

layout = new BorderLayout (20 , 10) ;
setLayout ( layout ) ;
fileJPanel = new JPanel () ;
fileJPanel . setLayout (new FlowLayout () ) ;


add ( fileJPanel , BorderLayout . NORTH ) ;
texto = new JTextArea (10 ,15) ;
add (new JScrollPane ( texto ) , BorderLayout . CENTER ) ;
buttonJPanel = new JPanel () ;
buttonJPanel . setLayout ( new GridLayout (5 , 1) ) ;

encriptarJButton = new JButton ( ENCRYPT ) ;
buttonJPanel .add(encriptarJButton ) ;
desencriptarJButton = new JButton ( DECRYPT ) ;
buttonJPanel .add(desencriptarJButton ) ;

add ( buttonJPanel , BorderLayout . EAST ) ;
}


public String getText () { return texto . getText () ; }
@Override
public void setText ( String s) { texto . setText (s) ; }
@Override
public void setControlador ( Controlador c) {

encriptarJButton . addActionListener (c) ;
desencriptarJButton . addActionListener (c) ;
}
}


