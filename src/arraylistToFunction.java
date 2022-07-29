import java.util.ArrayList;
import java.util.Scanner;

public class arraylistToFunction {
    public static void main(String[] args) {
        var a=new ArrayList<>();
        input(a,4);
        outputs(a);
        ArrayList<Object> b = new ArrayList<>();
        input(b,4);
        outputs(b);
    }
    public static void input(ArrayList a,int size){
        System.out.println("Enter the Elements of Array");
        for (int i=0;i<size;i++){
            a.add(new Scanner(System.in).nextInt());
        }
    }
    public static void outputs(ArrayList a){
        for (int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
