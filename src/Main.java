public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " +  firstName+ " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + fullName);

        //Zadanie 2
        System.out.println("Zadanie 2");

        String up = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + up);

        //Zadanie 3
        System.out.println("Zadanie 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}