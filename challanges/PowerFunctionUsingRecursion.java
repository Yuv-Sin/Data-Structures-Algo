package challanges;

// Power Function in Log(n)
// fails for larger power values
public class PowerFunctionUsingRecursion {

    //hint -> pow is even -> (x)^pow/2 * (x)^pow/2
    //        pow is odd  -> (x)^pow/2 * (x)^pow/2 * num
    private static int powerFunction(int num,int pow){
        if(pow==0){
            return 1;
        }
        if(pow%2==0){
            return powerFunction(num,pow/2)*powerFunction(num,pow/2);
        }
        return powerFunction(num,pow/2)*powerFunction(num,pow/2)*num;
    }

    public static void main(String ar[]){
        System.out.print(powerFunction(2,5)); // expected - > 32
    }
}
