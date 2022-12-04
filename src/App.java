import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado =new Scanner(System.in);
        System.out.print("Informe um número int: ");
        int n= teclado.nextInt();
        teclado.close();
        imprimeNumero(n);
    }

    static void imprimeNumero(int n){
        int c, d;

        for(c=1;c<=n;c++){
            for(d=1;d<=c;d++){
            System.out.print(d+"   ");
            }
            System.out.println();
        }
    }
}
