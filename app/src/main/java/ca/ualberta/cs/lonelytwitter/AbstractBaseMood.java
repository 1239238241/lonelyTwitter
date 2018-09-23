package ca.ualberta.cs.lonelytwitter;
import java.util.Date;
public abstract class AbstractBaseMood {
    public Date date;
    public  String currentMood;

    AbstractBaseMood(){
        this.date = new Date();
    }
    AbstractBaseMood(Date Input_date){
        this.date = Input_date;
    }
    AbstractBaseMood(String inputed_currentMood){
        this.currentMood = inputed_currentMood;
    }

    public Date getDate() {return  this.date;}
    public String returnMood() {return  this.currentMood;}
    public void setDate(Date your_input_Date)    {
        this.date = your_input_Date;
    }
    public abstract Boolean IsHappy();
    public abstract Boolean IsSad();
}
