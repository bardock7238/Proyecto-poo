import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
            Vehiculo[] vehiculos = {
            new Auto(),
            new Moto(),
            new Camion(),
            new Bicicleta(),
            new Dron(),
            new Avion()
        };

        Scanner scanner = new Scanner(System.in);
        int opcion=0;

        do {
            System.out.println("Menu de sistema de envios");
            System.out.println("1. Calcular costo de envio");
            System.out.println("2. Calcular tiempo de envio");
            System.out.println("3. Validar carga");
            System.out.println("4. Ver reporte comparativo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
        } while (opcion != 5);
        System.out.println("Saliendo del sistema.");  
        scanner.close();

    };
}
