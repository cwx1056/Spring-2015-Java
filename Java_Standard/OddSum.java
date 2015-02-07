public class OddSum{
    public static void main(String arg[]){
	long result = 0;
	for (int i = 1; i < 100; i+=2){
	    result += i;
	}
	
	System.out.println("result = " + result);
    }
}