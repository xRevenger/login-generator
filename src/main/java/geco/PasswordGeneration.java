package geco;

import java.util.*;
import java.security.SecureRandom;

public class PasswordGeneration {

    public PasswordGeneration(){

    }

    public static String getRandomPassword(int length){
        // ASCII range - alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        SecureRandom random = new SecureRandom();
        StringBuilder stringBuilder = new StringBuilder();

        // each iteration of loop choose a character randomly from the given ASCII range
        // and append it to StringBuilder instance

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(chars.length());
            stringBuilder.append(chars.charAt(randomIndex));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int length = 8;
        System.out.println(getRandomPassword(length));
    }
}
