public class Auto extends Terrestre {
    public Auto() {
        super("Auto", 500 , 80, 5000); // Valores específicos para un auto
    }

    @Override
    public double calcularCosto(double peso, double distancia) {
        // Costo basado en el peso y la distancia
        return costobase + (peso * 0.5) + (distancia * 0.1);
    }

    @Override
    public double calcularTiempo(double distancia) {
        // Tiempo basado en la distancia y la velocidad promedio
        return distancia / getVelocidadPromedio();
    }

    @Override
    public double calcularEmisiones(double distancia) {
        // Emisiones basadas en la distancia
        return distancia * 0.12; 
    }
    
}
