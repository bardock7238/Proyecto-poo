public abstract class Vehiculo {
    // Atributos de todos los vehiculos
    protected String nombre;
    protected double capacidadMaxima;
    protected double velocidadPromedio; 
    protected double costobase; // Costo base para el transporte, puede ser utilizado en el cálculo de costos

    //Constructor
    public Vehiculo(String nombre, double capacidadMaxima, double velocidadPromedio, double costobase) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.velocidadPromedio = velocidadPromedio;
        this.costobase = costobase;
    }

    // Métodos abstractos para calcular costo y tiempo
    public abstract double calcularCosto(double peso, double distancia);
    public abstract double calcularTiempo(double distancia);
    public abstract double calcularEmisiones(double distancia);

    // Método para validar si el peso a transportar no excede la capacidad máxima
    public boolean validarCarga(double peso) {
        return peso <= capacidadMaxima;
    }
    //getters 
    public String getNombre() {
        return nombre;
    }
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }
    public double getCostobase() {
        return costobase;
    }
}