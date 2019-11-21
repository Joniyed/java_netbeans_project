package tweet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JONIYED
 */
public class Tweet implements Twitter{
    
    private List<tweet1> list=new ArrayList<>();

    @Override
    public void addTweet(tweet1 tweet) {
        list.add(tweet);
    }

    @Override
    public void printallTweets() {
       for(tweet1 tweet: list)
       {
           System.out.println(tweet);
       }
    }

    public static void main(String[] args) {
        Twitter jb=new Tweet();
        tweet1 tweet=new tweet1("Welcome to my block.  ", "  joniyed");
        jb.addTweet(tweet);
        System.out.println("");
        jb.printallTweets();
    }
    
}
