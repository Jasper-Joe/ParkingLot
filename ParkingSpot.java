public class ParkingSpot {
    private VehicleSize size;
    private Vehicle v;
    public ParkingSpot(VehicleSize size) {
        this.size = size;
    }

    public VehicleSize getSize() {
        return this.size;
    }

    public void park(Vehicle v) {
        if(v.getSize().getSize() > size.getSize()) return;
        if(this.v != null) return;
        this.v = v;
    }

    public void leave() {
        this.v = null;
    }

    public Vehicle getVehicle() {
        return v;
    }
}
