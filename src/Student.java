import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student{
    private String date;
    private String name;
    public Student(){
        name="Степан";
        date="08/11/2003";
    }
    public Student(String date){
        name="Степан";
        this.date=date;
    }
    public void to_String(int a) throws ParseException {
        if (a==1){
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d MMMM, yyyy");
            SimpleDateFormat simpleFormat2 = new SimpleDateFormat("MM/dd/yyyy");
            Date d = simpleFormat2.parse(date);
            System.out.println(sdf.format(d));
        }
        else if(a==2){
            SimpleDateFormat sdf = new SimpleDateFormat("d MMM, yyyy");
            SimpleDateFormat simpleFormat2 = new SimpleDateFormat("dd/MM/yyyy");
            Date d = simpleFormat2.parse(date);
            System.out.println(sdf.format(d));
        }
        else{
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy");
            SimpleDateFormat simpleFormat2 = new SimpleDateFormat("dd/MM/yyyy");
            Date d = simpleFormat2.parse(date);
            System.out.println(sdf.format(d));
        }
    }
}