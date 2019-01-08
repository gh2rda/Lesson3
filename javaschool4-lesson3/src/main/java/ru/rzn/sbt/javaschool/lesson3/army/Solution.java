package ru.rzn.sbt.javaschool.lesson3.army;

public class Solution {
    /**
     * Сравнение армий
     * <p>
     * 1. В классах {@link Warrior} и {@link Weapon} переопределите метод equals, чтобы можно было осуществлять
     * сравнение объектов
     * <p>
     * 2. Перепишите тело метода {{@link Solution#armyEquals(Warrior[], Warrior[])}} таким образом, чтобы она возвращал
     * true, если а) оба аргумента отличны от null, оба массива имеют одинаковый размер,  по одинаковым индексам в
     * массивах расположены равные объекты класса Warrior
     */
    public static boolean armyEquals(Warrior[] alpha, Warrior[] beta) {
        boolean result = false;
        if (!(alpha == null || beta == null || (alpha.length != beta.length))) {
            result = true;

            for (int i = 0; i < alpha.length; i++) {
                if (!alpha[i].equals(beta[i])) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
