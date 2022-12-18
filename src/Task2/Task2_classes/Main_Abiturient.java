package Task2.Task2_classes;

//__________________________________#16__________________________________//
//4. Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.Создать
//        массив объектов. Вывести:
//        a) список абитуриентов, имеющих неудовлетворительные оценки;
//        b) список абитуриентов, у которых сумма баллов выше заданной;
//        c) выбрать заданное число n абитуриентов, имеющих самую высокую сумму
//        баллов (вывести также полный список абитуриентов, имеющих
//        полупроходную сумму).

import java.util.*;

public class Main_Abiturient {

    public static void main(String[] args){

        System.out.println("Task B #16");

        int TopScoreLen = 5;
        int PassScore = 20;

        Abiturient[] list_tmp = new Abiturient[]{
                new Abiturient(1,"FirstName1", "LastName1", "Patronymic1", "Address1", "89111111111", new int[]{5, 5, 2, 2, 2}),
                new Abiturient(2,"FirstName2", "LastName2", "Patronymic2", "Address2", "89222222222", new int[]{4, 4, 4, 4, 4}),
                new Abiturient(3,"FirstName3", "LastName3", "Patronymic3", "Address3", "89333333333", new int[]{2, 3, 4, 5, 3}),
                new Abiturient(4,"FirstName4", "LastName4", "Patronymic4", "Address4", "89444444444", new int[]{5, 5, 5, 5, 5}),
                new Abiturient(5,"FirstName5", "LastName5", "Patronymic5", "Address5", "89555555555", new int[]{4, 4, 4, 5, 5}),
                new Abiturient(6,"FirstName6", "LastName6", "Patronymic6", "Address6", "89666666666", new int[]{5, 5, 2, 5, 5}),
                new Abiturient(7,"FirstName7", "LastName7", "Patronymic7", "Address7", "89777777777", new int[]{3, 3, 4, 4, 5}),
                new Abiturient(8,"FirstName8", "LastName8", "Patronymic8", "Address8", "89888888888", new int[]{5, 5, 5, 5, 5}),
                new Abiturient(9,"FirstName9", "LastName9", "Patronymic9", "Address9", "89999999999", new int[]{1, 1, 1, 2, 4}),
                new Abiturient(10,"FirstName10", "LastName10", "Patronymic10", "Address10", "891010101010", new int[]{4, 4, 5, 5, 2}),
        };

        ArrayList<Abiturient> list = new ArrayList(Arrays.asList(list_tmp));


        System.out.println("Abiturients with poor grades:");
        for (Abiturient i : list){
            if (i.isBadGrades())
                System.out.println(i.toString());
        }

        System.out.println("\n\n\n\n\n\nPassing Score List:");
        for (Abiturient i : list){
            if (i.GetEvaluationSum() >= PassScore)
                System.out.println(i.toString());
        }

        System.out.println("\n\n\n\n\n\nTop Abiturients List:");
        Collections.sort(list, new EvaluationSum_Comparator());
        int top = 0;
        for (Abiturient i : list){
            if (top < TopScoreLen) {
                System.out.println(i.toString());
                top++;
            }
            else
                break;
        }

        System.out.println("\n\n\n\n\n\nSemi-pass Scores");
        for (int i = top; list.get(i).GetEvaluationSum() >= PassScore; ++i){
            System.out.println(list.get(i).toString());
        }

    }
}
