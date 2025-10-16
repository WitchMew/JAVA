import java.io.*;
class SumAvg {
    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[5];
        int sum = 0;
        System.out.println("Enter five numbers : ");
        for(int i = 0; i<5; i++){
        num[i] = integer.parseInt(br.readLine());
        sum = sum + num[i];
        System.out.println("Sum = "+sum);
    }
}

