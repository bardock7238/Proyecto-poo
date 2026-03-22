import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Crear objetos de cada tipo de vehículo
            Vehiculo[] vehiculos = {
            new Auto(),
            new Moto(),
            new Camion(),
            new Bicicleta(),
            new Dron(),
            new Avion()
        };

        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menú de opciones para el usuario
        do {
            System.out.println("\nMenu de sistema de envios");
            System.out.println("1. Calcular costo de envio");
            System.out.println("2. Calcular tiempo de envio");
            System.out.println("3. Validar carga");
            System.out.println("4. Ver reporte comparativo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            double peso, distancia;

            switch (opcion) {
                case 1 -> {// Calcular costo de envío
                    System.out.println("\nIngrese el peso del paquete en kg: ");
                    peso = scanner.nextDouble();
                    System.out.println("Ingrese la distancia a recorrer en km: ");
                    distancia = scanner.nextDouble();
                    for(Vehiculo v : vehiculos){
                        if (v.validarCarga(peso)){
                            System.out.println(v.getNombre() + ": $" + v.calcularCosto(peso, distancia));
                        } else {
                            System.out.println(v.getNombre() + ": No puede transportar esta carga.");
                        }
                    }
                }
                case 2 -> {// Calcular tiempo de envío
                    System.out.println("Ingrese la distancia a recorrer en km: ");
                    distancia = scanner.nextDouble();
                    for(Vehiculo v : vehiculos){// Redondear a 2 decimales
                       double tiempo = (int)(v.calcularTiempo(distancia) * 100) / 100.0;
                       // Mostrar resultados
                       System.out.println(v.getNombre() + ": " + tiempo + " horas");
                    }
                }
                case 3 -> {// Validar carga
                    System.out.println("Ingrese el peso del paquete en kg: ");
                    peso = scanner.nextDouble();
                    for(Vehiculo v : vehiculos){
                        if (v.validarCarga(peso)){
                            System.out.println(v.getNombre() + ": Puede transportar esta carga.");
                        } else {
                            System.out.println(v.getNombre() + ": No puede transportar esta carga.");
                        }
                    }
                }
                case 4 -> {// Ver reporte comparativo
                    System.out.println("\nIngrese el peso del paquete en kg: ");
                    peso = scanner.nextDouble();
                    System.out.println("Ingrese la distancia a recorrer en km: ");
                    distancia = scanner.nextDouble();
                    System.out.println("\nReporte comparativo:");
                    for(Vehiculo v : vehiculos){
                        if (v.validarCarga(peso)) {
                              System.out.println("\n" + v.getNombre());
                              // Redondear a 2 decimales
                              double costo = (int)(v.calcularCosto(peso, distancia) * 100) / 100.0;
                              double tiempo = (int)(v.calcularTiempo(distancia) * 100) / 100.0;
                              double emisiones = (int)(v.calcularEmisiones(distancia) * 100) / 100.0;
                              // Mostrar resultados
                              System.out.println("  Costo:     $" + costo);
                              System.out.println("  Tiempo:    " + tiempo + " horas");
                              System.out.println("  Emisiones: " + emisiones + " kg CO2");
                             } else {
                               System.out.println("\n" + v.getNombre() + ": No puede transportar " + peso + " kg");
                        }
                    }
                }
                default -> { }
            }
        }   while (opcion != 5);
              System.out.println("Saliendo del sistema.");  
              scanner.close();


    }
}