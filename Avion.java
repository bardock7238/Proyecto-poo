public class Avion extends Aereo {
    public Avion() {
        super("Avion", 1000000 , 900, 50000); // Valores específicos para un avión
    }

    @Override
    public double calcularCosto(double peso, double distancia) {
        // Costo basado en el peso y la distancia
        return costobase + (peso * 1500) + (distancia * 500);
    }

    @Override
    public double calcularTiempo(double distancia) {
        // Tiempo basado en la distancia y la velocidad promedio
        return distancia / getVelocidadPromedio();
    }

    @Override
    public double calcularEmisiones(double distancia) {
        // Emisiones basadas en la distancia
        return distancia * 0.5; 
    }
    
}
