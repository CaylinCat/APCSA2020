package ConsumerLab;
import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
//
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
 
  
  private static final String SPACE = " ";
  
  static{
    try {
      Scanner input = new Scanner(new File("src/ConsumerLab/cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("src/ConsumerLab/negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }
  
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

/** Activity 2: totalSentiment()
  * Write the code to total up the sentimentVals of each word in a review.
 */
  public static double totalSentiment(String filename)
  {
    // read in the file contents into a string using the textToString method with the filename
	  String words = textToString(filename);
    // set up a sentimentTotal variable
	  double sentimentTotal = 0;
    // loop through the file contents 
	 while(words.length() >0) {
       // find each word
		  int x = words.indexOf(" ");
		  if (x > 0) {
       // add in its sentimentVal
			  sentimentTotal+=sentimentVal(words.substring(0, x));
       // set the file contents to start after this word
			  words = words.replace(words.substring(0,x+1), "");
			  x = words.indexOf(" ");
		  } else {
			  sentimentTotal+=sentimentVal(words.substring(0));
			  break;
		  }
	  }
	  //System.out.println(sentimentTotal);
   
   



   return sentimentTotal; 
  }


  /** Activity 2 starRating method
     Write the starRating method here which returns the number of stars for the review based on its totalSentiment.
  */
  public static int starRating(String filename)
  {
    // call the totalSentiment method with the fileName
	  double totalSentiment = totalSentiment(filename);
    // determine number of stars between 0 and 4 based on totalSentiment value 
    int stars = 0;
    // write if statements here
    if (totalSentiment >= 15) {
    	stars = 4;
    } else if (totalSentiment > 10) {
    	stars = 3;
    } else if (totalSentiment > 5) {
    	stars = 2;
    } else if (totalSentiment > 0) {
    	stars = 1;
    } else {
    	stars = 0;
    }

  
    // return number of stars
    return stars; 
  }
  /** Activity 3 Autogenerate a Fake Review
  */
  public static String fakeReview(String filename)
  {
	  String word = textToString(filename);
	  int x = word.indexOf("*");
	  int y = word.indexOf(" ");
	  while(x>=0 && y>=0){
	  	word= word.replace(word.substring(x,y), randomAdjective());
		x = word.indexOf("*");
	  	y = word.indexOf(" ");
		  //uwu
	  }
	  return word;
  }
  /** Activity 4 Positive/Negative Review
  */
  public static String positiveReview(String filename)
  {
	  String words = textToString(filename);
	  String changed = textToString(filename);
	  String thisWord = " ";
	  int x = changed.indexOf(" ");
	  while(x>0){
		thisWord = changed.substring(0,x);
		if(sentimentVal(thisWord) < 0){
			words = words.replace(words.substring(words.indexOf(thisWord),thisWord.length()), randomPositiveAdj());
		}
		changed = changed.replace(changed.substring(0,x+1), "");
		x = changed.indexOf(" ");
		if(x < 0){
			if(sentimentVal(changed) < 0){
				words = words.replace(words.substring(words.indexOf(changed), randomPositiveAdj());
			}
			break;
		}
	  }
	  return words;
  }
  public static String negativeReview(String filename)
  {
	  String words = textToString(filename);
	  String changed = textToString(filename);
	  String thisWord = " ";
	  int x = changed.indexOf(" ");
	  while(x>0){
		thisWord = changed.substring(0,x);
		if(sentimentVal(thisWord) > 0){
			words = words.replace(words.substring(words.indexOf(thisWord),thisWord.length()), randomNegativeAdj());
		}
		changed = changed.replace(changed.substring(0,x+1), "");
		x = changed.indexOf(" ");
		if(x < 0){
			if(sentimentVal(changed) > 0){
				words = words.replace(words.substring(words.indexOf(changed), randomNegativeAdj());
			}
			break;
		}
	  }
	  return words;
  }
}
