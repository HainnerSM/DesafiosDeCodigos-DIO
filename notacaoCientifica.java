
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

