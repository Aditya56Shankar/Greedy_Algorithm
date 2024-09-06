import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int n[][]=new int[a.length][3];
        for (int i = 0; i < a.length; i++) {
            n[i][0]=i;
            n[i][1]=a[i];
            n[i][2]=b[i];
        }
        Arrays.sort(n, Comparator.comparingDouble(o -> o[2]));
        int maxact=1;
        ArrayList <Integer> list=new ArrayList<>();
        list.add(n[0][0]);
        int last=n[0][0];
        for (int i = 1; i < a.length; i++) {
            if (n[i][1]>=last){
                maxact++;
                list.add(n[i][0]);
                last=n[i][2];
            }
        }
        System.out.println("max activity"+maxact);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("A"+list.get(i));
        }


    }
}
