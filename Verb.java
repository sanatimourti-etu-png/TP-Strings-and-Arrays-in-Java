import java.util.Scanner;

public class Verb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un verbe du premier groupe : ");
        String verb = sc.nextLine();
        if (!verb.endsWith("er")){
            System.out.print("Ce n'est pas un verbe du premier groupe.");
            return;
        }

String root = verb.substring(0, verb.length() - 2);

        System.out.println("je " + root + "e");
        System.out.println("tu " + root + "es");
        System.out.println("il/elle " + root + "e");
        System.out.println("nous " + root + "ons");
        System.out.println("vous " + root + "ez");
        System.out.println("ils/elles " + root + "ent");
    }
}

