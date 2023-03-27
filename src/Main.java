//Write a Java Program to Count the Number of Occurrences of Substring in a String.
public class Main {
    public static void main(String[] args) {
        String string = "substringsubstring";
        String substring = "sub";
        int count = 0;
        int index = 0;
        while ((index = string.indexOf(substring,index))!=-1){
            count++;
            index+=substring.length();

        }
        System.out.println("Number of occurances "+count);
    }
}