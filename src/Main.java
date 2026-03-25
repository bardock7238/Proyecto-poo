import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Crear objetos de cada tipo de vehículo y almacenarlos en un arreglo
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

            double peso, distancia;
            opcion = 0;

            try {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("\nIngrese el peso del paquete en kg: ");
                        peso = scanner.nextDouble();
                        if (peso <= 0) {
                            System.out.println("El peso debe ser mayor a 0.");
                            break;
                        }
                        System.out.println("Ingrese la distancia a recorrer en km: ");
                        distancia = scanner.nextDouble();
                            if (distancia <= 0) {
                            System.out.println("La distancia debe ser mayor a 0.");
                            break;
                            }
                        for (Vehiculo v : vehiculos) {
                            if (v.validarCarga(peso)) {
                                System.out.println(v.getNombre() + ": $" + v.calcularCosto(peso, distancia));
                            } else {
                                System.out.println(v.getNombre() + ": No puede transportar esta carga.");
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("Ingrese la distancia a recorrer en km: ");
                        distancia = scanner.nextDouble();
                        if (distancia <= 0) {
                            System.out.println("La distancia debe ser mayor a 0.");
                            break;
                        }
                        for (Vehiculo v : vehiculos) {
                            double tiempo = (int)(v.calcularTiempo(distancia) * 100) / 100.0;
                            System.out.println(v.getNombre() + ": " + tiempo + " horas");
                        }
                    }
                    case 3 -> {
                        System.out.println("Ingrese el peso del paquete en kg: ");
                        peso = scanner.nextDouble();
                        if (peso <= 0) {
                            System.out.println("El peso debe ser mayor a 0.");
                            break;
                        }
                        for (Vehiculo v : vehiculos) {
                            if (v.validarCarga(peso)) {
                                System.out.println(v.getNombre() + ": Puede transportar esta carga.");
                            } else {
                                System.out.println(v.getNombre() + ": No puede transportar esta carga.");
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("\nIngrese el peso del paquete en kg: ");
                        peso = scanner.nextDouble();
                        if (peso <= 0) {
                            System.out.println("El peso debe ser mayor a 0.");
                            break;
                        }
                        System.out.println("Ingrese la distancia a recorrer en km: ");
                        distancia = scanner.nextDouble();
                        if (distancia <= 0) {
                             System.out.println("La distancia debe ser mayor a 0.");
                             break;
                        }
                        System.out.println("\nReporte comparativo:");
                        for (Vehiculo v : vehiculos) {
                            if (v.validarCarga(peso)) {
                                System.out.println("\n" + v.getNombre());
                                double costo = (int)(v.calcularCosto(peso, distancia) * 100) / 100.0;
                                double tiempo = (int)(v.calcularTiempo(distancia) * 100) / 100.0;
                                double emisiones = (int)(v.calcularEmisiones(distancia) * 100) / 100.0;
                                System.out.println("  Costo:     $" + costo);
                                System.out.println("  Tiempo:    " + tiempo + " horas");
                                System.out.println("  Emisiones: " + emisiones + " kg CO2");
                            } else {
                                System.out.println("\n" + v.getNombre() + ": No puede transportar " + peso + " kg");
                            }
                        }
                    }
                    case 5 -> System.out.println("Saliendo del sistema.");
                    default -> System.out.println("Opcion no valida, intente de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Error: ingrese un valor numerico valido.");
                scanner.nextLine();
            }

        } while (opcion != 5);

        scanner.close();
    }
}