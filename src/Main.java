public class Main {
    public static void main(String[] args) {
        CondicionIf();
        BucleWhile();
        BucleDoWhile();
        BucleFor();
        InterruptorSwitch();
    }

    // 1. IF ELSE
    public static void CondicionIf() {
        int numeroIf = (int) (Math.random() * -10 - 10 + 1) + 10;
        if (numeroIf < 0) {
            System.out.println("El número if es: " + numeroIf + " y es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El número if es: " + numeroIf + " y es positivo");
        } else {
            System.out.println("El número if es: " + numeroIf);
        }
    }

    // 2. WHILE
    public static void BucleWhile() {
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El número while es: " + numeroWhile);
        }
    }

    // 3. DO WHILE
    public static void BucleDoWhile() {
        int numeroDoWhile = 1;
        do {
            System.out.println("El número do while es: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
    }

    // 4. BUCLE FOR
    public static void BucleFor() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("El número for es: " + i);
        }
    }

    // 5. SWITCH
    public static void InterruptorSwitch() {
        var estacion = "Verano";
        switch (estacion) {
            case "Primavera":
                System.out.println("El estación del switch es: " + estacion);
                break;
            case "Verano":
                System.out.println("El estación del switch es: " + estacion);
                break;
            case "Otoño":
                System.out.println("El estación del switch es: " + estacion);
                break;
            default:
                System.out.println("El estación del switch es probablemente: " + estacion);
                break;
        }
    }
}