import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProjectOne {

    /**
     * You have string "number", get each character from the string and return the char array
     * Hint: use toCharArray method
     */
    public char[] getChars(String number) {
        char[] eachWord = {};
        // write your code here
        eachWord=number.toCharArray();
        // end of code
        return eachWord;
    }

    /**
     * You have string "sentence", get each word from the string and return string array
     * Hint: use split method
     */
    public String[] getWords(String sentence) {
        String[] eachWord = {};
         eachWord=sentence.split(" ");
        return eachWord;
    }

    /**
     * Calculate sum of numbers
     * ex: arrayList is: 1, 2 ,3 ,4
     * 1+2+3+4 = 10
     * total should be 10;
     */
    public int total(ArrayList<Integer> myList) {
        int total = Integer.MIN_VALUE;
         total=0;
         for(int i:myList ){
           total +=i;
      }

        return total;
    }

    /**
     * Calculate sum of even numbers
     * <p>
     * ex: arrayList is: 1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9
     * 2+4+6+8 = 20
     * total should be 20;
     */
    public int evenTotal(ArrayList<Integer> myList) {
        int total = 0;
       for(int i:myList){
           if(i%2==0){
               total +=i;
           }
       }
        return total;
    }

    /**
     * Calculate sum of odd numbers
     * <p>
     * ex: arrayList is: 1, 2 ,3 ,4 ,5 ,6 ,7 ,8 ,9
     * 1+3+5+7+9 = 25
     * total should be 25;
     */
    public int oddTotal(ArrayList<Integer> myList) {
        int total = 0;
        for (int i : myList) {
            if (i % 2 != 0) {
                total += i;
            }
        }
        return total;
    }

    /**
     * Make the name upper case
     */
    public String getUpperCase(String name) {
        String upperCaseName = null;
       upperCaseName=name.toUpperCase();

        return upperCaseName;
    }


    public String getLowerCase(String name) {
        String lowerCaseName = null;
        lowerCaseName=name.toLowerCase();

        return lowerCaseName;
    }

    /**
     * Convert int to string
     * 1 => "1"
     */
    public String convertToString(int number) {
        String result = "";
        result=String.valueOf(number);
        return result;
    }

    /**
     * Return first 3 letters of the string
     * "abcdef" => "abc"
     */
    public String getFirst3Letters(String word) {
        String result = null;
        result = word.substring(0,3);

        return result;
    }

    /**
     * Return last 2 letters of the string
     * ex: "abcde" => "de"
     */
    public String getLast2Letters(String word) {
        String result = "";
        result = word.substring((word.length() - 2), (word.length() - 1));

        return result;
    }

    /**
     * Check if integer and string representation of number are equal
     * ex: (1, "1") => true
     */
    public boolean compareIntAndString(int a, String b) {
        boolean result = false;
        if (b.equals(String.valueOf(a))) {
            result = true;
        }
        return result;
    }

    /**
     * Remove white spaces around string
     */
    public String removeWhiteSpacesAround(String str) {
        String result = null;
      result=str.trim();

        return result;
    }

    /**
     * return a list where each integer is multiplied by 2
     * ex: {1,2} => {2,4}
     */
    public List<Integer> multipliedBy2(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for(int i:numbers){
            result.add((i)*2);
        }
        return result;
    }

    /**
     * return a list where each string is doubled
     * ex: "Apple" => "AppleApple"
     */
    public List<String> doubledWord(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String s: words) {
            result.add(s + s);
        }
        return result;
    }

    /**
     * Check if array has duplicates
     */
    public boolean hasDuplicates(Character[] characters) {
        boolean result = false;

        HashSet<Character> hashSet = new HashSet<>();
        for (char x: characters) {
            hashSet.add(x);
        }

        if (hashSet.size() == characters.length) {
            result = false;
        }
        else if (hashSet.size() != characters.length) {
            result = true;
        }
        else if (hashSet.isEmpty()) {
            result = false;
        }

        return result;
    }

}
