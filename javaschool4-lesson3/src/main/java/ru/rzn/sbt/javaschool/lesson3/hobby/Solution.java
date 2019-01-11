package ru.rzn.sbt.javaschool.lesson3.hobby;

public class Solution {
    /**
     * Хобби
     * <p>
     * Реализуйте метод detect таким образом, чтобы определить из входного массива students количество
     * студентов, занимающихся музыкой {@link Rockstar}, студентов, увлекающихся мотоциклами {@link Biker} и студентов
     * без хобби {@link Student} (такие студенты не должны быть ни {@link Rockstar}, ни {@link Biker}), и разместите
     * результат в виде объекта класса {@link DetectionResult} с заполненными соответствующими полями.
     * Случаи с null-ссылкой на массив и null-элементами массива следует обрабатывать.
     */
    public static DetectionResult detect(Object[] students) {
        int bikersCount = 0, rockstarsCount = 0, studentsCount = 0;
        DetectionResult result = new DetectionResult();
        if (students != null) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null)
                    if (students[i] instanceof Biker)
                        bikersCount++;
                    else if (students[i] instanceof Rockstar)
                        rockstarsCount++;
                    else if (students[i] instanceof Student)
                        studentsCount++;
            }
            result.setBikersCount(bikersCount);
            result.setRockstarsCount(rockstarsCount);
            result.setPureStudentsCount(studentsCount);
        }
        return result;
    }
}
