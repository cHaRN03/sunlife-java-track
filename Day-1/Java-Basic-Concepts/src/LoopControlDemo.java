import java.util.Scanner;

public class LoopControlDemo {

    public static void processNumbers(int numbers[]){
        int total =0;
        for(int num: numbers){
            if(num<0){
                System.out.println("Invalid number found, stopped proccessing.");
                return;
            }
            total+= num;
            System.out.println("Processed number: "+ num);
        }
        System.out.println("All number were processed successfully");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter the 5 numbers: ");
        for (int index=0; index< numbers.length; index++){
            numbers[index]= scanner.nextInt();
        }

        // Stop the sum up process if any invalid numbers
        int total = 0;
        for(int index=0; index< numbers.length; index++){
            if(numbers[index]< 0){
                System.out.println("Stopped sum up with invalid number: "+ numbers[index]);
                break;
            }
            System.out.println("Sum up process for the number: "+ numbers[index]);
            total+=numbers[index];
        }
        System.out.println("Sum up total: "+ total);

        // Sup up all the valid numbers
        total =0;
        for(int index =0; index<numbers.length; index++){
            if(numbers[index]<0){
                System.out.println("Skipped the invalid number: "+ numbers[index]);
                continue;
            }
            System.out.println("Processed numbers: "+ numbers[index]);
            total+= numbers[index];
        }
        System.out.println("Sum of all valid numbers: "+ total);
        processNumbers(numbers);
    }
}
