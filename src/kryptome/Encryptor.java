package kryptome;
import java.security.Key;
import java.util.Base64;
import java.util.Scanner;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author Issac
 */

public class Encryptor {
    
    public byte[] cifrar(String input_str) throws Exception{
        final byte[] bytes_array = input_str.getBytes("UTF-8");
        final Cipher aes = getCipher(true);
        final byte[] cifrado = aes.doFinal(bytes_array);
        return cifrado;
    }
    
    public String decifrar(byte[] cifrado) throws Exception{
        final Cipher aes = getCipher(false);
        final byte[] bytes = aes.doFinal(cifrado);
        final String decifrado = new String(bytes, "UTF-8");
        return decifrado;
    }
    
    private Cipher getCipher(boolean do_encript) throws Exception{
        final String message = "Issac#corona72216";
        final MessageDigest digest = MessageDigest.getInstance("SHA");
        digest.update(message.getBytes("UTF-8"));
        final SecretKeySpec key = new SecretKeySpec(digest.digest(),0,16,"AES");
        
        final Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
        
        if(do_encript){
            aes.init(Cipher.ENCRYPT_MODE, key);
        }else{
            aes.init(Cipher.DECRYPT_MODE, key);
        }
        return aes;
    }
    
}
