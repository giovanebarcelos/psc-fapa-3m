package aula12;

import java.util.Arrays;
import java.util.Scanner;

public class Utl {
    public static int getInt(String rotulo) {
        Scanner ler = new Scanner(System.in);
        System.out.print(rotulo);
        return ler.nextInt();
    }

    public static String getString(
            String rotulo, String[] opcoes,
            String msgErro) {
        boolean eureka;
        String str;
        do {
            str = getString(rotulo);
            eureka = Arrays.stream(opcoes).
                    anyMatch(str::equals);
            if (!eureka){
                System.out.println(msgErro);
            }
        } while (!eureka);
        return str;
    }

    public static String getString(String rotulo) {
        Scanner ler = new Scanner(System.in);
        System.out.print(rotulo);
        return ler.nextLine();
    }
}
