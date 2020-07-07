package retornasoma;
import java.util.Scanner;
public class RetornaSoma 
{
    public static void main(String[] args) 
    {
        int exit = 1;
        while(exit != 0)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe um n° inteiro: ");
            int n = sc.nextInt();
            int i ;
            int soma;
            soma = 0;
            i = 1;

            while (i <= n)
            {
                soma = soma + i;
                i = i + 1;
            }
            System.out.println("O resultado da soma é:" + soma);
            System.out.println("sair? digite 0: ");
            exit = sc.nextInt();
        }
    }   
}
