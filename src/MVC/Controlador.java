
package MVC;


import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;
import javax.swing.JFrame ;
public class Controlador implements ActionListener {
private final Modelo modelo ;
private final Vista vista ;
public Controlador ( Modelo m, Vista v) {
modelo = m;
vista = v;
vista . setControlador ( this ) ;
}
@Override
public void actionPerformed ( ActionEvent event )
{
switch ( event . getActionCommand () ) {


case InterfazVista . ENCRYPT :
modelo . setContenido ( vista . getText () ) ;
vista . setText ( modelo . encript () ) ;
break ;
case InterfazVista . DECRYPT :
modelo . setContenido ( vista . getText () ) ;
vista . setText ( modelo . decript () ) ;
break ;
default:
System.err.println("Error");
break;
}
}
public void arrancar () {
vista . setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE) ;
vista . setSize (600,350) ;
vista . setVisible (true) ;
}
}

