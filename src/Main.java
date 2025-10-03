import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        char a = 'a';
        char e = 'e';
        char ii = 'i';
        char o = 'o';
        char u = 'u';
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        int contador = 0;
        System.out.println("Escreva um nome e eu irei mostrar quantas vogais tem: ");
        nome = scanner.nextLine();
        int num = nome.length();
        for(int i = 0; i < num; i++){
            char letra = nome.charAt(i);
            if (letra == a){
                contador++;
                contadorA++;
            }
            if (letra == e){
                contador++;
                contadorE++;
            }
            if (letra == ii){
                contador++;
                contadorI++;
            }
            if (letra == o){
                contador++;
                contadorO++;
            }
            if (letra == u){
                contador++;
                contadorU++;
            }
        } System.out.println("Esse nome tem "+contador+" vogais,sendo "+contadorA+" A, "+contadorE+" E, "+contadorI+" I, "+contadorO+" O, "+contadorU+ " U.");
        }

    }