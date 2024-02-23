//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class BestemmieGen {
    public static void main(String[] args) {
        System.out.println("\nBenvenuto nel nuovissimo generatore di bestemmie!");
        System.out.println("Bestemmie sempre fresche pronte a vostra disposizione!");

        Scanner num = new Scanner(System.in);
        Scanner scelta = new Scanner(System.in);
        Scanner god = new Scanner(System.in).useDelimiter("\n");

        int ask;

        do {
            System.out.println("Digita 1 per una bestemmia maschile, 2 per una bestemmia femminile:");
            int scelt = scelta.nextInt();

            if (scelt == 1) {
                System.out.println("\nDigita il nome di un santo o di una divinità: ");
                String name = god.next();
                generaBestemmiaMacshile(name);
                System.out.println("\nDigita 1 se vuoi generare un'altra bestemmia, " +
                        "qualsiasi altro numero se vuoi chiudere il programma: ");
                ask = num.nextInt();
            } else if (scelt == 2) {
                System.out.println("\nDigita il nome di una santa o di una divinità: ");
                String name = god.next();
                generaBestemmiaFemminile(name);
                System.out.println("\nDigita 1 se vuoi generare un'altra bestemmia, " +
                        "qualsiasi altro numero se vuoi chiudere il programma: ");
                ask = num.nextInt();
            } else {
                System.out.println("\nNon ho capito cosa hai scritto!");
                System.out.println("\nDigita 1 se vuoi generare un'altra bestemmia, " +
                        "qualsiasi altro numero se vuoi chiudere il programma: ");
                ask = num.nextInt();
            }
        }
         while (ask == 1);
    }

    public static void generaBestemmiaMacshile(String nomeSanto) {
        String[] animali = {"pollo", "cane", "topo", "rospo", "pipistrello", "furetto", "toro",};

        String[] insulti = {"stronzo", "coglione", "bastardo", "inutile", "deficiente", "rincoglionito",};

        String[] verbi = {"inculato", "defenestrato", "castrato", "affogato", "deturpato", "ingroppato",};

        String[] soggetto = {"da Satana", "da tu' madre", "dal prete pedofilo", "da Greg", "da Rocco Siffredi",};

        Random random = new Random();
        int randAnim = random.nextInt(7);
        int randIns = random.nextInt(6);
        int randVer = random.nextInt(6);
        int randSogg = random.nextInt(5);

        System.out.println("\n" + nomeSanto + " " + animali[randAnim] + " " + insulti[randIns] + " "
                + verbi[randVer] + " " + soggetto[randSogg] + "!");
    }

    public static void generaBestemmiaFemminile(String nomeSanta) {
        String[] animali = {"capra", "vacca", "puledra", "maiala", "scrofa",};

        String[] insulti = {"pulla", "deficiente", "rincoglionita", "stronza", "bastarda", "cogliona",};

        String[] verbi = {"inculata", "defenestrata", "scopata", "affogata", "deturpata", "smandrappata"};

        String[] soggetto = {"da Satana", "da tu' madre", "dal prete pedofilo", "da Greg", "da Rocco Siffredi"};

        Random random = new Random();
        int randAnim = random.nextInt(5);
        int randIns = random.nextInt(6);
        int randVer = random.nextInt(6);
        int randSogg = random.nextInt(5);

        System.out.println("\n" + nomeSanta + " " + animali[randAnim] + " " + insulti[randIns] + " "
                + verbi[randVer] + " " + soggetto[randSogg] + "!");
    }
}