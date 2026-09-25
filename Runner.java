public class Runner {
    public static void main(String[] args) {
        Tests testTracker = new Tests();

        //Calls the public getAverage() method to run the input loop
        testTracker.getAverage();

        //Call toString() to show result in 2 decimal format
        System.out.println(testTracker);
    }


}
