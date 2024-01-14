public class MotorizedVehicle extends Vehicle{
    private double volumeDisplacement;
    public MotorizedVehicle(String name, int wheels, double volumeDisplacement) {
        super(name, wheels);
        this.volumeDisplacement = volumeDisplacement;
    }
    public double housePower(){
        return getWheels() * this.volumeDisplacement;
    }
    public String toString(){
        return super.toString() + "\nVolume Displacement:" + volumeDisplacement;
    }
    
}
