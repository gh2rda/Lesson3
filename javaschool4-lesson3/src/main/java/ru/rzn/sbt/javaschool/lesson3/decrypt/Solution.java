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
            StringBuilder lim = new StringBuilder("azAZ");//граничные символы
            int lenAlfabet = lim.codePointAt(1) - lim.codePointAt(0) + 1;//число символов(26) для англиского алфавита

            StringBuilder decoded = new StringBuilder(encrypted);
            int newCodePoint[];
            newCodePoint = new int[1];
            String newSymb;
            for (int i = 0; i < decoded.length(); i++) {
                if ((decoded.codePointAt(i) >= lim.codePointAt(0)) && (decoded.codePointAt(i) <= lim.codePointAt(1))) {
                    if ((decoded.codePointAt(i) - 9)<lim.codePointAt(0)) {
                        newCodePoint[0] = lim.codePointAt(1) - (8 - (decoded.codePointAt(i) - lim.codePointAt(0)));
                    }
                    else{
                        newCodePoint[0] = decoded.codePointAt(i) - 9;
                    }

                    newSymb = new String(newCodePoint, 0, 1);
                    decoded.replace(i, i + 1, newSymb);

                } else {
                    if ((decoded.codePointAt(i) >= lim.codePointAt(2)) && (decoded.codePointAt(i) <= lim.codePointAt(3))) {
                        if ((decoded.codePointAt(i) - 9)<lim.codePointAt(2)) {
                            newCodePoint[0] = lim.codePointAt(3) - (8 - (decoded.codePointAt(i) - lim.codePointAt(2)));
                        }
                    else{
                            newCodePoint[0] = decoded.codePointAt(i) - 9;
                        }

                        newSymb = new String(newCodePoint, 0, 1);
                        decoded.replace(i, i + 1, newSymb);
                    }

                }
            }
            return decoded.toString();
        }
    }
}
