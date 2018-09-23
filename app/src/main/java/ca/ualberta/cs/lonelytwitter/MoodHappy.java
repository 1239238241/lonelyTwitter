package ca.ualberta.cs.lonelytwitter;
import java.util.Date;
public class MoodHappy extends AbstractBaseMood {
    MoodHappy(){
        super();
    }
    MoodHappy(String HappyMood){
        super(HappyMood);
    }
    public Date getDate() {return  this.date;}
    public void setDate(Date your_input_Date)    {
        this.date = your_input_Date;
    }
    @Override
    public  Boolean IsHappy(){return true;};
    public  Boolean IsSad(){return false;};
}
