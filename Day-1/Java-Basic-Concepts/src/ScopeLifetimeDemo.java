public class ScopeLifetimeDemo {
    // Instance variable
    int count = 10;

    // Instance Method
    void showCount(){
        System.out.println("Count using Instance method: "+ count);
    }
    void show(){
        // Local variable
        int localVariable = 100;
        System.out.println("Local Variable Value: "+ localVariable);
    }

    public static void main(String[] args) {
        // Create Object for the Class
        ScopeLifetimeDemo obj = new ScopeLifetimeDemo();
        obj.show();
        obj.showCount();
        System.out.println("Count using obj: "+ obj.count);
        // Block variable
        if(obj.count==10){
            int blockVariable = 200;
            System.out.println("Block variable value: "+ blockVariable);
        }
//        System.out.println("Not possible to access Block variable: "+ blockVariable);
    }
}
