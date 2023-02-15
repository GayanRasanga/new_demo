import java.io.*;

public class Day9Method {
    static class  Result {

        /*
         * Complete the 'factorial' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER n as parameter.
         */

        public static int factorial(int n) {
            // Write your code here
            if (n<=1){
                return 1;
            }
            else {
                return n*factorial(n-1); //6!=6*5!
            }
        }

    }
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("input.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(file);

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

