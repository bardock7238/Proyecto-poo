public class Bicicleta extends Terrestre {
    public Bicicleta() {
        super("Bicicleta", 15 , 15, 2000); // Valores específicos para una bicicleta
    }

    @Override
    public double calcularCosto(double peso, double distancia) {
        // Costo basado en el peso y la distancia
        return costobase + (peso * 100) + (distancia * 50);
    }

    @Override
    public double calcularTiempo(double distancia) {
        // Tiempo basado en la distancia y la velocidad promedio
        return distancia / getVelocidadPromedio();
    }

    @Override
    public double calcularEmisiones(double distancia) {
        return 0; // Las bicicletas no emiten gases contaminantes
    }
    
}
