package accessmodifiers;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework {
    protected String courseName;
    protected String description;
    protected Date dueDate;

    public Homework(String courseName, String description, Date dueDate){
        this.courseName = courseName;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getFormattedDueDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        return dateFormat.format(dueDate);
    }

    public void printInfo(){
        System.out.println(this.courseName);
        System.out.println(this.description);
        System.out.println(getFormattedDueDate());
    }
}
