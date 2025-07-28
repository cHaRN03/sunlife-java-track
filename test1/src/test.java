
import java.util.Scanner;

public class test {


    static public char help(int num){
        if(num>=90){return 'A';}
        else if(num>=80){return 'B';}
        else if(num>=70){return 'C';}
        else if(num>=60){return 'D';}
        else if(num>=50){return 'E';}
        else{return 'F';}
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter N");
        int n = scanner.nextInt();
        int[] ar = new int[n];
        int total=0;
        for (int i = 0; i < n; i++) {
            System.out.println("enter the marks");
            int temp = scanner.nextInt();
            ar[i] = temp;
            total+=temp;
        }
        int average=total/n;

        for (int i = 0; i < n; i++) {
            int temp1=ar[i];
            char res=help(ar[i]);
            System.out.println("marks of student" + (i+1) + " is " + ar[i] + "with grade " + res);

        }
        int highest=ar[0],hi=0;
        for(int i = 0; i < n; i++){
            if(ar[i]>average){


                System.out.println("student " + (i+ 1) + " has marks more than average");
            }
            if(ar[i]>highest){highest=ar[i];hi=i;}
        }
        System.out.println("the student with highest marks is "+ (hi+1)+" with " + highest +" marks ");
        scanner.close();

    }
}