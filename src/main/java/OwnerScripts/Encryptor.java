package OwnerScripts;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encryptor {
    private final String secret_key_str;
    private final SecretKeySpec secret_key;
    
   // Contructor
    public Encryptor(String secret_key) throws Exception{
        this.secret_key_str = secret_key; // User secret_key input
        this.secret_key = generateSecretKey(); // SecretKeySpec generated
    }
    
    
     // Private methods for the class
    private SecretKeySpec generateSecretKey() throws Exception{
        /*
            This method generate a hash value from the secret key
            of the user.
            After create a SecretKeySpec to use with the Cipher
        */
        final MessageDigest digest = MessageDigest.getInstance("SHA");
        digest.update(this.secret_key_str.getBytes("UTF-8"));
        final SecretKeySpec key = new SecretKeySpec(digest.digest(), 0, 16, "AES");
        return key;
    }
    
    
    private Cipher getCipherManager(boolean is_encryption) throws Exception{
        final Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
        if(is_encryption){
            aes.init(Cipher.ENCRYPT_MODE, this.secret_key);
        }else{
            aes.init(Cipher.DECRYPT_MODE, this.secret_key);
        }
        return aes;
    }
    
    
    // Public methods      
    public String encryptInput(String input_str) throws Exception{
        final byte[] input_bytes_array = input_str.getBytes("UTF-8");
        final Cipher aes_encryptor = getCipherManager(true);
        final byte[] input_encrypted = aes_encryptor.doFinal(input_bytes_array);
        
        String input_encrypted_str = Base64.getEncoder().encodeToString(input_encrypted);
        return input_encrypted_str;
    }
    
   
    public String decryptInput(String inputString) throws Exception{
        final byte[] input_encrypted = Base64.getDecoder().decode(inputString);
        final Cipher aes_decryptor = getCipherManager(false);
        final byte[] input_decrypter_array = aes_decryptor.doFinal(input_encrypted);
        return new String(input_decrypter_array, "UTF-8");
    }
    
}
