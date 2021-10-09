public class powersOf2 {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello!!");

//        Product product = new Product("Aswin");
//        System.out.println(produc t.getName());

    power(22);
    }

    static int power( int n){
        if(n<1){
        return 0;}
        else if(n == 1){
            return 1;
        }
        else{
            int prev = power(n/2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
        }
    }

