//Clase abstracta para los medios de transporte aéreos
public abstract class Aereo extends Vehiculo {
    public Aereo(String nombre, double capacidadMaxima, double velocidadPromedio, double costobase) {
        super(nombre, capacidadMaxima, velocidadPromedio, costobase);
    }
}
