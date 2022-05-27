import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

public class MD5 {

    public static void main(String[] args) throws NoSuchAlgorithmException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(s.getBytes());
        
            BigInteger n = new BigInteger(1, messageDigest);
            String hashed = n.toString(16);
            while(hashed.length() < 32){
                hashed = "0" + hashed;
            }
            System.out.println(hashed);
        }catch(NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }
}