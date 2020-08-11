package vn.edu.vtc;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(final String[] args) throws NoSuchAlgorithmException {
        final String s = "This is a password";
        final MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(s.getBytes(), 0, s.length());
        System.out.println("MD5: " + new BigInteger(1, m.digest()).toString(16));
    }
}
