public class Camion extends Terrestre {
    public Camion() {
        super("Camion", 30000 , 60, 15000); // Valores específicos para un camión
    }

    @Override
    public double calcularCosto(double peso, double distancia) {
        // Costo basado en el peso y la distancia
        return costobase + (peso * 800) + (distancia * 200);
    }

    @Override
    public double calcularTiempo(double distancia) {
        // Tiempo basado en la distancia y la velocidad promedio
        return distancia / getVelocidadPromedio();
    }

    @Override
    public double calcularEmisiones(double distancia) {
        // Emisiones basadas en la distancia
        return distancia * 0.27; 
    }
    
}
