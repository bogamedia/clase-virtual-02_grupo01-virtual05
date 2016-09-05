import java.util.*;
import javax.swing.JOptionPane;
/**
 * Clase que recibe el nombre o frase escrita por el usuario 
 * y la retorna en forma de acrónimo
 * 
 * @author Javier Padilla & Carlos Bogarin
 * @version A-200
 */
public class Filologo
{
    private String textoUsuario;
    private JOptionPane interfaz;
    private  String resultadoFinal;
    public Filologo()
    {
        this.textoUsuario = "";
        this.resultadoFinal = "";
        this.interfaz = new JOptionPane();
    }

    public void obtenerAcronimoNombreOFrase()
    {
        //Recibe el nombre o frase del usuario.
        this.textoUsuario = interfaz.showInputDialog(null,
                                            "Digite su nombre y apellido." + 
                                            "\nCada palabra puede estar separada por un espacio " +
                                            "o cualquiera de los siguientes caracteres:" +
                                            "\n ; : - _ ´ + ' / * - % & = . ", 
                                            "Nombre", 
                                            interfaz.INFORMATION_MESSAGE);
                                            
        // Convierte los carácteres del nombre o la frase a mayúscula.
        this.textoUsuario = textoUsuario.toUpperCase();

        /*Itera a través del string escrito por el usuario e imprime 
        la primer letra de cada palabra que encuentre separada por 
        algún caracter o espacio.*/
        
        StringTokenizer generadorAcronimo = new StringTokenizer(textoUsuario, 
                                                                 "; : - _ ´ + ' / * - % & = . ");
        while(generadorAcronimo.hasMoreTokens())
        {
            resultadoFinal = resultadoFinal + generadorAcronimo.nextToken().charAt(0);  
        }
        interfaz.showMessageDialog(null,"El acrónimo es: " + 
                                    resultadoFinal , 
                                    "Acrónimo", 
                                    interfaz.INFORMATION_MESSAGE);
        
        resultadoFinal = "";
    }
}
