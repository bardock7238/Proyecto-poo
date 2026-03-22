public class Dron extends Aereo {
    public Dron() {
        super("Dron", 5 , 60,8000); // Valores específicos para un dron
    }

    @Override
    public double calcularCosto(double peso, double distancia) {
        // Costo basado en el peso y la distancia
        return costobase + (peso * 1000) + (distancia * 300);
    }

    @Override
    public double calcularTiempo(double distancia) {
        // Tiempo basado en la distancia y la velocidad promedio
        return distancia / getVelocidadPromedio();
    }

    @Override
    public double calcularEmisiones(double distancia) {
       return distancia * 0.02; //Emisiones basadas en la electricidad 
    }
    
}
