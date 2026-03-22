public class Moto extends Terrestre {
    public Moto() {
        super("Moto", 30 , 90, 4000); // Valores específicos para una moto
    }

    @Override
    public double calcularCosto(double peso, double distancia) {
        // Costo basado en el peso y la distancia
        return costobase + (peso * 500) + (distancia * 100);
    }

    @Override
    public double calcularTiempo(double distancia) {
        // Tiempo basado en la distancia y la velocidad promedio
        return distancia / getVelocidadPromedio();
    }

    @Override
    public double calcularEmisiones(double distancia) {
        // Emisiones basadas en la distancia
        return distancia * 0.08; 
    }
    
}

