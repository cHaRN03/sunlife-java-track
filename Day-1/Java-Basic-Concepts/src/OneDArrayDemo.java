public class OneDArrayDemo {
    public static void main(String[] args) {
        // Declare and initialize a 1D array
        int[] numbers = {10, 20, 30, 40};
        System.out.println("Elements in the array: ");
        for(int index=0; index<numbers.length; index++){
            System.out.println(numbers[index]);
        }

        String[] names = new String[5];
        names[0] = "John";
        names[1] = "Smith";
        System.out.println("First Name: "+ names[0]);
        System.out.println("Second Name: "+ names[1]);
    }
}
