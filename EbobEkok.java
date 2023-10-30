import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        int n1= input.nextInt();
        System.out.print("ikinci sayıyı giriniz");
        int n2= input.nextInt();
        int buyuk;
        int kucuk;
        int i=1;
        int j=1;
        int ebob=1;
        buyuk=(n1>n2) ? n1 : n2;
        kucuk=(n1<n2) ? n1 : n2;

        do {
            if(n1%i==0 && n2%i==0){
                ebob=i;
            }
            i++;
        }while (kucuk!=i);
        System.out.println("ebob:"+ebob);

        do {
            if(buyuk%n1==0 && buyuk%n2==0){
                System.out.println("Ekok:"+buyuk);
                break;
            }
            buyuk++;

        }while ((n2*n1)!=j);

    }
}

