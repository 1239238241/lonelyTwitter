package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet{
    NormalTweet(){
        super();
    }
    NormalTweet(String message) {super(message);}
    @Override
    public Boolean IsImportant() {return  false;}
}
