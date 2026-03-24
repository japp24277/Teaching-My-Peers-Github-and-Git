package exercises.exercise11_even_odd;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 23;
        /* I never try modulo on program
          but I will try my best
            */
    
        // Task: Write an if-else statement that prints "Even" 
        // if number is even, otherwise print "Odd"
        // Hint: Use modulo operator %
        if(number % 1==1) {
           System.out.prinln("Even");
    } else{
            System.out.println("Odd");
    }
}
}
