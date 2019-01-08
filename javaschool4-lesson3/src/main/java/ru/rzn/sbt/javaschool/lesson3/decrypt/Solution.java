package ru.rzn.sbt.javaschool.lesson3.decrypt;

public class Solution {
    /**
     * Дешфрование строки
     * <p>
     * Реализуйте метод decrypt, осуществляющий расшифровку сроки encrypted с использованием {@link StringBuilder}.
     * <p>
     * Входящая строка зашифрована следующим образом:
     * а) Зашифрованы только символы латинского алфавита, прочие следует оставлять в исходном виде
     * б) Каждый символ зашифрован ASCII кодом со смещением 9, например 'a' -> 'j'
     * в) После символа 'z' шифрование осуществляется циклически, независимо от регистра символа, например,
     * 'x' -> 'g', 'V' -> 'E'
     * <p>
     * Не забудте проверку на null.
     */
    public static String decrypt(String encrypted) {
        if (encrypted == null) {
            return null;
        } else {
            StringBuilder decoded = new StringBuilder(encrypted);
            for (int i = 0; i < decoded.length(); i++) {
//                String curentS = new String(decoded.charAt(i))

            }
            return decoded.toString();
        }
    }
}
