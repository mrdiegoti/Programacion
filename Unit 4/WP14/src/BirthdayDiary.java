import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BirthdayDiary {
    private ArrayList<Birthday> birthdayList;

    public BirthdayDiary(){
        birthdayList = new ArrayList<>();
    }

    public void addBirthday(String name, int day, int month, int year){
        birthdayList.add(new Birthday(name, day, month, year));
    }

    public Calendar getBirthdayFor(String name){
        for (Birthday birthdayElemetn: birthdayList){
            if (name == birthdayElemetn.getName()){
                Calendar calendar = new GregorianCalendar();
                calendar.set(Calendar.DAY_OF_MONTH, birthdayElemetn.getDay());
                calendar.set(Calendar.MONTH, birthdayElemetn.getMonth() - 1);
                calendar.set(calendar.YEAR, birthdayElemetn.getYear());
                return calendar;
            }
        }
        return Calendar.getInstance();
    }

    public void printDiary(){
        for (Birthday birthdayElement: birthdayList){
            System.out.println(birthdayElement.getName() + " -> " + birthdayElement.getDay() + "/" +
                                                                    birthdayElement.getMonth() + "/" +
                                                                    birthdayElement.getYear());
        }
    }
}
class Birthday{
    private String name;
    private int day;
    private int month;
    private int year;

    public Birthday(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}

class testBirthdayDiary{
    public static void main(String[] args) {
        BirthdayDiary myBirthdayList = new BirthdayDiary();
        myBirthdayList.addBirthday("Lucas", 6, 3, 2004);
        myBirthdayList.addBirthday("Dario", 14, 12, 1980);
        myBirthdayList.addBirthday("Samuel", 10, 9, 1990);
        myBirthdayList.printDiary();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/M/yyyy");
        System.out.println(formateador.format(myBirthdayList.getBirthdayFor("Dario").getTime()));
    }
}