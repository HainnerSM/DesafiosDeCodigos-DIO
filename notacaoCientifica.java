/*Números em ponto flutuante podem ser bastante extensos para mostrar. Nesses casos, é conveniente usar a notação científica.

Você deve escrever um programa que, dado um número em ponto flutuante, mostre este número na notação científica: sempre mostre o sinal da mantissa; sempre mostre 4 casas decimais na mantissa; use o caractere 'E' para separar a mantissa do expoente; sempre mostre o sinal do expoente; e mostre o expoente com pelo menos 2 dígitos.

Entrada
A entrada é um número em ponto flutuante de dupla precisão X (de acordo com o padrão IEEE 754-2008). Nunca haverá um número com mais de 110 caracteres nem com mais de 6 casas decimais.

Saída
A saída é o número X em uma única linha na notação científica detalhada acima. Veja os exemplos abaixo.*/

 
    
import java.io.IOException;
import java.util.Scanner;

public class DIO {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double X, note;
        int count = 0;
        String a;


        X = leitor.nextDouble();
        note =X;
        if(X>-1 && X<0){
            count=0;
            do{
                note=note *10;
                count++;
            }while(note > -1);
            a = String.format("%02d", count);
            if (count <= 9) {
                System.out.printf("%.4fE-", note);
                System.out.printf(a);
            } else {
                System.out.printf("%.4fE-", note);
                System.out.println(count);
            }
        }

        if (X == 0) {
            System.out.println("-0.0000E+00");
        }
        if (X >= 1) {
            if (X < 10) {
                System.out.printf("+");
                System.out.printf("%.4fE+00", X);

            } else {
                note = X;
                do {
                    note = note / 10;
                    count++;
                } while (note >= 10);

                a = String.format("%02d", count);
                if (count <= 9) {
                    System.out.printf("+");
                    System.out.printf("%.4fE+", note);
                    System.out.printf(a);
                } else {
                    System.out.printf("+");
                    System.out.printf("%.4fE+", note);
                    System.out.println(count);

                }

            }
        } else if(X > -10 && X<= -1) {
            System.out.printf("%.4fE+00", X);

        }else if (X <= -1) {
                count = 0;
                note =X;
                do {
                    note = note / 10;
                    count++;
                } while (note< -10);

                a = String.format("%02d", count);
                if (count <= 9) {
                    System.out.printf("%.4fE+", note);
                    System.out.printf(a);
                } else {

                    System.out.printf("%.4fE+", note);
                    System.out.println(count);

                }

            } else {
                if (X > 0 && X < 1) {
                    note = X;
                    count=0;
                    do {
                        note = note * 10;
                        count++;
                    }while(note <1);

                    a = String.format("%02d", count);
                    if (count <= 9) {
                        System.out.printf("+");
                        System.out.printf("%.4fE-", note);
                        System.out.printf(a);
                    } else {
                        System.out.printf("+");
                        System.out.printf("%.4fE-", note);
                        System.out.println(count);

                    }

                }

            }


        }

    }

