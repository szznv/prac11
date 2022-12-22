import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.*;

public class Main {
    public static void first(){
        System.out.println("Имя разработчика: Иванов Иван Дмитриевич");
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d MMMM, yyyy");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,2022);
        cal.set(Calendar.MONTH,Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH,1);
        System.out.println("Дата выдачи задания: "+ sdf.format(cal.getTime()));
        Date now = new Date();
        System.out.println("Дата сдачи задания: " + sdf.format(now));
    }
    public static void second() throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите дату в следующем виде: **/**/**** ");
        String tempDate = reader.readLine();
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM, yyyy");
        SimpleDateFormat simpleFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        Date date = simpleFormat2.parse(tempDate);
        Date now = new Date();
        int i= date.compareTo(now);
        System.out.print(sdf.format(date));
        if (i<0){
            System.out.println(" BEFORE "+sdf.format(now));
        }
        else System.out.println(" AFTER "+sdf.format(now));
    }
    public static void third() throws ParseException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите дату в следующем виде: **/**/**** ");
        String Date = reader.readLine();
        Student a = new Student(Date);
        System.out.println("Выберете формат: [1] - полный, [2] - средний, [3] - короткий");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        a.to_String(choice);
    }
    public static void fourth(){
        System.out.println("Введите год, месяц, день, час, минуту: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        int hour = in.nextInt();
        int minute = in.nextInt();
        Calendar myCalendar = new GregorianCalendar(year, month, day,hour,minute);
        Date date = myCalendar.getTime();
        System.out.println(date);
    }
    public static void fifth() throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        long start = System.nanoTime();
        list.add(5);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Операция вставки ArrayList, нс: " + elapsed);
        start = System.nanoTime();
        list1.add(5);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Операция вставки LinkedList, нс: " + elapsed);
        start = System.nanoTime();
        list.remove(0);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Операция удаления ArrayList, нс: " + elapsed);
        start = System.nanoTime();
        list1.remove(0);
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Операция удаления LinkedList, нс: " + elapsed);
        list1.add(6);
        list.add(6);
        start = System.nanoTime();
        int n=list.indexOf(6);
        if (n>=0){
            System.out.println("Число найдено");
        }
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Операция поиска ArrayList, нс: " + elapsed);
        start = System.nanoTime();
        n=list1.indexOf(6);
        if (n>=0){
            System.out.println("Число найдено");
        }
        finish = System.nanoTime();
        elapsed = finish - start;
        System.out.println("Операция поиска LinkedList, нс: " + elapsed);

    }
    public static void main(String[] args) throws IOException, ParseException, InterruptedException {
        System.out.println("Задание [1]");
        first();
        System.out.println("Задание [2]");
        second();
        System.out.println("Задание [3]");
        third();
        System.out.println("Задание [4]");
        fourth();
        System.out.println("Задание [5]");
        fifth();
    }
}