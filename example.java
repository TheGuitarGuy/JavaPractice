import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        function();
        System.out.println(addFunction(1,2));
        System.out.println("You entered " + getInput());
        double base = getBase();
        double width = getWidth();
        System.out.println(computeAreaTriangle(width,base));
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        findArray(intArray);
    }
        static void function(){
        System.out.println("I am a function!");
    }
    public static int addFunction(int a,int b)
    {
        return a + b;
    }
    public static int[] arrays()
    {
        int[] array = {10, 20, 30, 40};
        return array;
    }
    public static int getInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        return number;
    }
    public static double getBase()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a base: ");
        int number = input.nextInt();
        return number;
    }
    public static double getWidth()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a width: ");
        int number = input.nextInt();
        return number;
    }
    public static double computeAreaTriangle(double b,double h)
    {
        return (b * h)/2;
    }
    public static String findArray(ArrayList<Integer> list)
    {
        System.out.println(list);
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int min = 0;
        int max = 0;
        Collections.sort(arr);
        for (int i = 0, j = 1; i < arr.size() - 1 && j < arr.size() ; i++,j++) {        
            
            min += arr.get(i);
            max += arr.get(j);
            
        }
        
        System.out.print(min + " " + max);

    }
    public static long flippingBits(long n) {
        String binaryString = Long.toBinaryString(n);
        String invBinaryString = "";
        
        while(binaryString.length() < 32)
            binaryString = '0' + binaryString;
        
        for(int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '0')
                invBinaryString += '1';
            else
                invBinaryString += '0';
        }
        
        long result = Long.parseLong(invBinaryString, 2);
        
        return result;

    }
        public static int diagonalDifference(List<List<Integer>> arr) {
    int left = 0;
    int right = 0;
    for(int i = 0; i < arr.size();i++)
    {
        left += arr.get(i).get(i);
        right += arr.get(i).get(arr.size()-i-1);
    }
    int result = Math.abs(left - right);
    return result;
    }
}