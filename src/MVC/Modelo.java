
package MVC;


import java.io.*;
class Modelo {
private String cont ;
final char shiftup = (char) 3;
final char shiftdown = (char) 1;
public void setContenido (String texto){cont=texto;}
public String getContenido () {return cont;}
public String encript (){
String ctext = "";
for(String linea:cont.split("\n")){
StringBuilder cadena=new StringBuilder();
for(char c:linea.toCharArray()){
if (Character.isLetter(c))
c +=shiftup ;
    StringBuilder append=cadena.append(c);
}
StringBuilder shift_cadena=new StringBuilder();
String shifttext=cadena.reverse().toString();
int h=shifttext.length()/2;
for (char c:shifttext.substring(h,shifttext.length()).toCharArray()){if(Character.isLetter(c))c -= shiftdown ;
    StringBuilder append=shift_cadena.append(c);
}
ctext=ctext+shifttext.substring(0 , h)+shift_cadena.toString () + "\n";
}
cont=ctext ;
return ctext ;
}
public String decript(){
String texto = "";
for ( String ctext : cont . split ("\n")) {
int h = ctext . length () /2;
StringBuilder shift_cadena = new StringBuilder ( ctext .
substring (0 ,h) ) ;
for ( char c : ctext.substring(h,ctext.length()).toCharArray
() ) {
if ( Character.isLetter(c))
c += shiftdown ;
    StringBuilder append=shift_cadena.append(c);
}
String shifttext = shift_cadena.reverse().toString() ;
StringBuilder cadena = new StringBuilder () ;
for ( char c : shifttext . toCharArray () ) {
if ( Character . isLetter (c -3) )
c -= shiftup ;
    StringBuilder append = cadena . append (c);
}
texto = texto + cadena . toString () + "\n";
}
cont = texto ;
return texto ;

}
}
