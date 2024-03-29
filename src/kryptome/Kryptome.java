package kryptome;
import GUI.*;
import java.util.Arrays;
import java.util.Scanner;
import kryptome.Encryptor;


public class Kryptome {
    public static void main(String[] args) throws Exception {
        Container container = new Container();
        container.setVisible(true);
        container.setLocationRelativeTo(null);
        
        
        Encryptor cifradora =  new Encryptor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa mensaje:\n");
        String message = scanner.nextLine();
        
        final byte[] msg_cifrado = cifradora.cifrar(message);
        
        
        
        System.out.println(
         new String(msg_cifrado)
        );
        
        System.out.println("Escribiste esto: " + 
        cifradora.decifrar(msg_cifrado)
        );
        
    }    
    
    
    

}
