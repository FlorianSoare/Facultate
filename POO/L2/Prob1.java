import java.util.Scanner;

public class Prob1 {

    private final static float MINCELSIUS = -273.15f;
    private final static float MINFAHRENHITE = -459.67f;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        prob6(in);

        in.close();
    }

    public static void prob1(Scanner in) {
        int sum = 0;
        for (int i = 1; i <= 15; i++)
            sum += i;

        System.out.println("suma[1,15]=" + sum);
    }

    public static void prob2(Scanner in) {
        long p = 1;
        for (int i = 1; i <= 20; i++)
            if (i % 2 == 0)
                p *= i;

        System.out.println("suma[1,20](nr.pare)=" + p);

        p = 1;
        for (int i = 2; i <= 20; i = i + 2)
            p *= i;

        System.out.println("suma[1,20](nr.pare)=" + p);
    }

    public static void prob3(Scanner in) {
        System.out.print("Introdu un numar intre 1 si 12:");
        int luna = in.nextInt();
        switch (luna) {
        case 1:
            System.out.println("Ianuarie");
            break;
        case 2:
            System.out.println("Februarie");
            break;
        case 3:
            System.out.println("Martie");
            break;
        case 4:
            System.out.println("Aprilie");
            break;
        case 5:
            System.out.println("Mai");
            break;
        case 6:
            System.out.println("Iunie");
            break;
        case 7:
            System.out.println("Iulie");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("Septembrie");
            break;
        case 10:
            System.out.println("Octombrie");
            break;
        case 11:
            System.out.println("Noiembrie");
            break;
        case 12:
            System.out.println("Decembrie");
            break;
        default:
            System.out.println("Ati introdus un numar gresit");
        }
    }

    public static void prob4(Scanner in) {
        float cel, far;

        do {
            System.out.print("Introdu grade in celsius:");
            cel = in.nextFloat();
            if (cel < MINCELSIUS) {
                System.out.println();
                System.out.print("Valoarea minima absoluta in celsius este " + MINCELSIUS);
            }

        } while (cel < MINCELSIUS);
        System.out.println("Valorea in grade farenhite este " + transformaInGradeFahrenheit(cel));

        do {
            System.out.print("Introdu grade in fahrenhite:");
            far = in.nextFloat();
            if (far < MINFAHRENHITE) {
                System.out.println();
                System.out.print("Valoarea minima absoluta in celsius este " + MINFAHRENHITE);
            }
        } while (far < MINFAHRENHITE);

        System.out.println("Valorea in grade celsius este " + transformaInGradeCelsius(far));

    }

    public static float transformaInGradeCelsius(float grade) {
        return (5f / 9f) * (grade - 32f);
    }

    public static float transformaInGradeFahrenheit(float grade) {
        return (9f / 5f) * grade + 32f;
    }

    public static void prob5(Scanner in) {
        int a, b;
        System.out.print("Introdu un numar:");
        a = in.nextInt();
        System.out.print("Introdu un numar:");
        b = in.nextInt();

        System.out.println("Suma=" + sumaNr(a, b));
        System.out.println("Diferenta=" + difNr(a, b));
        System.out.println("Produsul=" + prodNr(a, b));
        System.out.println("Maximul=" + maxNr(a, b));
        System.out.println("Minimul=" + minNr(a, b));

    }

    public static int sumaNr(int a, int b) {
        return a + b;
    }

    public static int difNr(int a, int b) {
        return a - b;
    }

    public static int prodNr(int a, int b) {
        return a * b;
    }

    public static int maxNr(int a, int b) {
        if (b > a)
            return b;
        return a;
    }

    public static int minNr(int a, int b) {
        if (b < a)
            return b;
        return a;
    }

    public static void prob6(Scanner in) {
        System.out.print("Introdu lungimea laturii:");
        int latura = in.nextInt();
        afiseazaPatrat(latura);
        afiseazaPatrat(latura,'%');
    }

    public static void afiseazaPatrat(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || j == 0 || i == (a - 1) || j == (a - 1))
                    System.out.print('*');

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void afiseazaPatrat(int a,char x) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || j == 0 || i == (a - 1) || j == (a - 1))
                    System.out.print(x);

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void prob7(Scanner in) {
        double n;
        double e;

        do {
            System.out.print("Introdu epsilon:");
            e = in.nextDouble();
            if (e > 1) {
                System.out.println();
                System.out.print("Epsilon trebuie sa fie mai mic ca 1 ");
            }
        } while (e > 1);

        System.out.print("Introdu puterea lui e:");
        int x = in.nextInt();

        System.out.println("e la " + x + "=" + calculeazaEx(x, e));
        System.out.println(Math.exp(x));
    }

    public static double calculeazaEx(int x, double e) {

        double sum = 1, n;
        int i = 1;
        do {
            n = Math.pow(x, i) / (double) calculeazaFactorial(i);
            sum += n;
            i++;
        } while (n > e);

        return sum;

    }

    public static long calculeazaFactorial(int nr) {
        long fact = 1;
        for (int i = 2; i <= nr; i++) {
            fact *= i;
        }

        return fact;
    }

}