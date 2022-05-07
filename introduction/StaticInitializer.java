import java.util.*;

/**
 * Java Static Initializer Block
 * These blocks are executed when the class is loaded, and here can initialize static variables
 */
public class StaticInitializer {
    public static int B;
    public static int H;
    public static boolean flag;
    
    static {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the BREADTH of the parallelogram:");
        B = Integer.parseInt(scanner.nextLine());
        //System.out.println("Enter the HEIGHT of the parallelogram:");
        H = Integer.parseInt(scanner.nextLine());
        if(B > 0 && H > 0) {
            flag = true;
        }else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scanner.close();
    }

    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

