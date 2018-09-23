package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable{

    public Date date2; //every body could access
    private Date date; //only this class has acces to this date
    private String message, a_mood;
    public ArrayList tweetMoodsList;
    public AbstractBaseMood the_mood;
    private static final Integer MAX_INTEGER = 140;

    Tweet() {
        this.date = new Date();
        this.tweetMoodsList = new ArrayList<String>();
        this.message = "I am a default message";

    }

    Tweet(String message){
        this.date = new Date();
        this.message = message; // Tweet myTweet = new Tweet('adasdasd');

    }
    public Date getDate() {return  this.date;}
    public String getMessage() {return  this.message;}
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= this.MAX_INTEGER){
            this.message = message;
        }else{
            throw new TweetTooLongException();
        }
    }
    public void getMood(){
        a_mood = the_mood.returnMood();
        tweetMoodsList.add(a_mood);
    }

    public abstract Boolean IsImportant();


}
