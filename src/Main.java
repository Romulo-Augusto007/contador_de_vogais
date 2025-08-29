import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        char a = 'a';
        int contador = 0;
        System.out.println("Escreva um nome e eu irei mostrar quantas vogais tem: ");
        nome = scanner.nextLine();
        int num = nome.length();
        for(int i = 0; i < num; i++){
            char letra = nome.charAt(i);
            if (letra == a){
                contador++;
            }
        } System.out.println("Esse nome tem "+contador+" vogais.");
        }

    }