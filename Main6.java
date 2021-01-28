
package misrc;


public class Main6 {


    public static void main(String[] args) {
        int a1[] = {4, 2, 7, 1, 6};
        int a2[] = {8, 14, 11, 5, 12, 22, 20, 9, 17};
        
        System.arraycopy(a1, 0, a2, 0, 1);
        System.out.print("array2 = ");
        System.out.print(a2[4] + " ");
        System.out.print(a2[5] + " ");
        System.out.print(a2[6] + " ");
        System.out.print(a2[7] + " ");
        System.out.print(a2[8] + " ");
        System.out.print(a2[9] + " ");
    }
    
}
