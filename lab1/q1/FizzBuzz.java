/* 
Author:Li Pan
Fizz Buzz: The numbers 1 to 100. However, if the number is divisible by 3, instead print the word "Fizz", 
if the number is divisible by 5, print the word "Buzz", and if the number is divisible by both 3 and 5, 
print the word "FizzBuzz".
*/
public class FizzBuzz{
    // mainn funtion 
    public static void main(String[] args){
      
        for (int i=1;i<=100;i++){
            //The number can be diviable by 3 and 5 print out as FizzBuzz
            if(i%3 == 0 && i%5 == 0)
                System.out.println("FizzBuzz");
            //The number can be diviable by 3 print out as Fizz
            else if(i%3 == 0) 
                System.out.println("Fizz");
            //The number can be diviable by 5 print out as Buzz
            else if(i%5 == 0) 
                System.out.println("Buzz");
            //The number cannnot be diviable by both 3 and 5, just print out the number itself
            else 
                System.out.println(i);
        }    
    }

}