import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        

        int key,i;
        int value [] = {10,20,30,40,550,60,80,90,100,150};
        System.out.println("Enter to search number --");
        Scanner sc =new Scanner(System.in);

        key = sc.nextInt();

        for( i=0; i<value.length ; i++){

            if(value[i] == key){
                System.out.println(key + " " + " found at the " + (i+1 +" th") + " Location ");
                break;
            }
        }
        if(i == value.length){
            System.out.println(key + " Not found in this Array");
        }


    }
}
