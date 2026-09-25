import java.util.Scanner;

public class Tests{
    // Private instance fields

    private double ave;
    private int count;
    private int score;

    // Constructor
    public Tests(){
        this.ave = 0.0;
        this.count = 0;
        this.score = 0;
    }

    // Getter methods
    public double getAve(){
        return ave;
    }
    public int getCount(){
        return count;
    }
    public int getScore(){
        return score;
    }

    // Setter for the score
    public void setScore(int newScore){
        this.score = newScore;
    }

    // Gather scores and computes the average
    public void getAverage() {
        Scanner input = new Scanner(System.in);

        //Local variables
        double sum = 0.0;
        int localCount = 0;

        //Users prompt and set up for the loop
        System.out.print("Enter a test score(-1 to quit): ");
        this.score = input.nextInt();

        //Loop until sentinel value -1 is given
        while (this.score != -1) {
            sum += this.score;
            localCount++;

            System.out.print("Enter a test score (-1 to quit): ");
            this.score = input.nextInt();
        }

        // Instance fields
        this.count = localCount;
        this.ave = sum/localCount;
    }

    @Override
    public String toString(){
        //Formats average to 2 decimal places
        return String.format("The average of the %d scores entered is %.2f.", count, ave);

    }


}














