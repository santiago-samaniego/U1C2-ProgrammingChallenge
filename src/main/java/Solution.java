public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4) / 4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) average;
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        return roundedAverage >= 65;
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return (shares + price);
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer

        double posTotal = Math.abs(totalStock);
        int sign = (int) (totalStock / posTotal);
        int roundedNum = (int) (posTotal + 0.5);
        roundedNum = sign * roundedNum;
        
        return (int) roundedNum;
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer

        long num = Math.round(userDouble * 100);
        long num1 = (num % 10 + 1) % 10;
        long num2 = ((num / 10) % 10 + 1) % 10;
        long num3 = ((num) % 10 + 1) % 10;
        long num4 = ((num / 1000) % 10 + 1) % 10;
        long num5 = ((num / 10000) % 10 + 1) % 10;
        double newnum = num1 * 10000 + num2 * 1000 + num3 * 100 + num4 * 10 + num5;

        return newnum / 100.0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.roundValueChange(12.40));
        System.out.println(s.adjustDigits(12.40));
        //23.01
    }

}
