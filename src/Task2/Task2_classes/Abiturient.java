package Task2.Task2_classes;
//__________________________________#16__________________________________//
//4. Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.Создать
//        массив объектов. Вывести:
//        a) список абитуриентов, имеющих неудовлетворительные оценки;
//        b) список абитуриентов, у которых сумма баллов выше заданной;
//        c) выбрать заданное число n абитуриентов, имеющих самую высокую сумму
//        баллов (вывести также полный список абитуриентов, имеющих
//        полупроходную сумму).

import java.util.Arrays;

public class Abiturient {
    private int id;
    private String FirstName;
    private String LastName;
    private String Patronymic;
    private String Address;
    private String Mobile;
    private int[] Grades;
    private int EvaluationSum;
    boolean BadGrades;

    public Abiturient(){
        this.id = 0;
        this.FirstName = "";
        this.LastName = "";
        this.Patronymic = "";
        this.Address = "";
        this.Mobile = "";
        this.Grades = new int[0];
        this.EvaluationSum = 0;
        this.BadGrades = false;
    }

    public Abiturient(int id, String FirstName, String LastName, String Patronymic, String Address, String Mobile, int[] Grades){
        this.id = id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Patronymic = Patronymic;
        this.Address = Address;
        this.Mobile = Mobile;
        this.Grades = Grades;
        for (int i : Grades){
            this.EvaluationSum += i;
            if (i < 3)
                this.BadGrades = true;
        }
    }


    //BadGrades

    //Setters
    public void SetId(int id){
        this.id = id;
    }

    public void SetFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public void SetLastName(String LastName){
        this.LastName = LastName;
    }

    public void SetPatronymic(String Patronymic){
        this.Patronymic = Patronymic;
    }

    public void Address(String Address){
        this.Address = Address;
    }

    public void SetMobile(String Mobile){
        this.Mobile = Mobile;
    }

    public void SetGrades(int[] Grades){
        this.Grades = Grades;
        for (int i : this.Grades){
            this.EvaluationSum += i;
            if (i < 3)
                BadGrades = true;
        }
    }

    //Getters
    public int GetId(){ return id; }

    public String GetFirstName(){ return FirstName; }

    public String GetLastName(){ return LastName; }

    public String GetPatronymic(){ return Patronymic; }

    public String GetAddress(){ return Address; }

    public String GetMobile(){ return Mobile; }

    public int[] GetGrades(){ return Grades; }

    public int GetEvaluationSum(){ return EvaluationSum; }

    public boolean isBadGrades() {return BadGrades;}

    @Override
    public String toString() {
        return "------------------------------\n" +
                "Abiturient id: "+ id + "\n" +
                "FirstName: " + FirstName + "\n" +
                "LastName: " + LastName + "\n" +
                "Patronymic: " + Patronymic + "\n" +
                "Address: " + Address + "\n" +
                "Mobile: " + Mobile + "\n" +
                "Grades: " + Arrays.toString(Grades) + "\n" +
                "EvaluationSum: " + EvaluationSum + "\n" +
                "BadGrades: " + BadGrades + "\n" +
                "------------------------------\n";
    }

}













