package ca.ualberta.cs.lonelytwitter;

public class TweetTooLongException extends Exception{
    TweetTooLongException(){
        super("The message is too long! Keep your tweets within 140 characters");

    }


}
