
package xorencryptor;
import java.util.Scanner;
/**
 *
 * @author Tashi
 */
public class XorEncryptor {
    private int key;
    public XorEncryptor(int key){
        this.key = key;
    }

    public String encrypt(String plainText){
        
        String cipherText="";
        
        for(int i=0;i<plainText.length();i++){
            int ascii = (int) plainText.charAt(i);  //gives ascii of character at index i of plain 
            int xor = key ^ ascii;                  //performs X-OR operation of their binary forms
            cipherText += (char) xor;               //implicitly typecasts char to string
            
        }
        
        return cipherText;
    }
    
    public String decrypt(String cipherText){
        String plainText="";
        
        for(int i=0;i<cipherText.length();i++){
            int ascii = (int) cipherText.charAt(i);
            int xor = key ^ ascii;
            plainText += (char) xor;
        }
        
        return plainText;
    }
    public static void main(String[] args) {
        
        
        Scanner inKey = new Scanner(System.in);
        System.out.println("enter a key:");
        int key = inKey.nextInt();
        
        Scanner inPlainText = new Scanner(System.in);
        System.out.println("enter plain text:");
        String plainText = inPlainText.nextLine();
        
        Scanner inCipherText = new Scanner(System.in);
        System.out.println("enter cipher text:");
        String cipherText = inCipherText.nextLine();
        
        XorEncryptor x1 = new XorEncryptor(key);
        System.out.println( String.format("encrypted plainText = %s",x1.encrypt(plainText)) );
        System.out.println( String.format("decrypted cipherText = %s",x1.decrypt(cipherText)) );
    }
    
}
