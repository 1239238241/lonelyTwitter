package ca.ualberta.cs.lonelytwitter;
import java.util.Date;
public class MoodSad extends AbstractBaseMood {
    MoodSad(){
        super();
    }
    MoodSad(String SadMood){
        super(SadMood);
    }
    public Date getDate() {return  this.date;}
    public void setDate(Date your_input_Date)    {
        this.date = your_input_Date;
    }
    @Override
    public Boolean IsSad(){return true;};
    public  Boolean IsHappy(){return false;};
}
