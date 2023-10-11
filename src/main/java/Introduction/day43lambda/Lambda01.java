package Introduction.day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        Course turkishDay = new Course("Turkish DayTime QA", 213, "Spring", 97);
        Course turkishNight = new Course("Turkish NightTime QA", 245, "Winter", 98);
        Course englishDay = new Course("English DayTime Java Dev", 121, "Spring", 91);
        Course englishNight = new Course("English NightTime Java Dev", 137, "Winter", 95);

        List<Course> courseList = new ArrayList<>();

        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(isAvgScoreGreaterThanANumber(courseList, 92));

        System.out.println(isAnyCourseNameContainsQA(courseList, "QA"));

        System.out.println(getCourseNamesWhoAvgMax(courseList));

        System.out.println(getCourseBetterThanLastTwo(courseList));

        System.out.println(getHighestThird(courseList));


    }

    //Example 1: Tum average score'larin 90 dan buyuk olup olmadigini kontrol eden method'u olusturunuz


    public static boolean isAvgScoreGreaterThanANumber(List<Course> courseList, int avg) {

        return courseList.
                stream().
                allMatch(t -> t.getAverageScore() > avg);

    }

    //Example 2 : En az bir kurs isminin Qa icerip icermedigini kontrol eden method'u olusturunuz

    public static boolean isAnyCourseNameContainsQA(List<Course> courseList, String word) {
        return courseList.
                stream().
                anyMatch(t -> t.getCourseName().
                        contains(word));
    }

    //Example 3: En yuksek average score'a sahip kurs ismini veren code'u yaziniz.

    public static String getCourseNamesWhoAvgMax(List<Course> courseList) {
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                findFirst().
                get().
                getCourseName();


    }

    //Example 4 : Avarage score'u en dusuk olan ilk iki course disindaki tum kurslari return eden method'u olusturunuz.

    public static List<Course> getCourseBetterThanLastTwo(List<Course> courseList) {

        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                collect(Collectors.toList());

    }

    //Example 5: Average score'u ustten ucuncu olan kursu veren method'u olusturunuz.

    public static Course getHighestThird(List<Course> courseList) {

        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList()).
                get(0);
    }

    //Example 6 : Ogrenci sayisi 150'den az olan kurslari return eden mehod'u olusturunuz.

    public static List<Course> getCourseWhoseRegisteredStdLessThanANumber(List<Course>courseList,int numOfStd){

        return courseList.
                stream().
                filter(t->t.getNumOfStudents()<numOfStd).
                collect(Collectors.toList());
    }




}
