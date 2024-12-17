import java.util.*;
public class numberGame{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int score=0;
        while(true){
            System.out.print("Enter the minimum and maximum range: ");
            int min=sc.nextInt();
            int max=sc.nextInt();
            int randNo=random.nextInt(max-min+1)+min;
            System.out.println("Enter the maximum number of attempts: ");
            int maxAttempts=sc.nextInt();
            int attemptNo=0;
            boolean correct=false;
            System.out.println("Guess the number between "+min+" and "+max+": ");
            while(attemptNo<maxAttempts && !correct){
                int guessedNo=sc.nextInt();
                attemptNo++;
                if(guessedNo==randNo) {
                    System.out.println("You have guessed the correct answer. The number is "+guessedNo+".");
                    score++;//won the round by guessing correct answer
                    correct=true;
                }
                else if(guessedNo<randNo){
                    if(attemptNo<maxAttempts)
                        System.out.println("Too low. Please try again with some other number.");
                    else
                        System.out.println("Too low");
                }
                else{
                    if(attemptNo<maxAttempts)
                        System.out.println("Too high. Please try again with some other number.");
                    else
                        System.out.println("Too high");
                }
                if(attemptNo==maxAttempts && !correct){
                    System.out.println("All your attempts are completed and the number is "+randNo+".");
                }
            }
            System.out.println("Do you want to play again (YES/NO)?");
            String s=sc.next();
            if(!s.equalsIgnoreCase("YES"))
                break;
        } 
        System.out.println("Your total score is: "+score);//how many rounds you have won
    }
}