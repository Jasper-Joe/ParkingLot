public class Level {
    private ParkingSpot[] spots;
    public Level(int numOfSpots) {
        spots = new ParkingSpot[numOfSpots];
        int half = numOfSpots%2 == 0 ? numOfSpots/2: numOfSpots/2 + 1;
        for(int i=0;i<half;i++) {
            spots[i] = new ParkingSpot(VehicleSize.Large);
        }
        for(int i=half;i<numOfSpots;i++) {
            spots[i] = new ParkingSpot(VehicleSize.Compact);
        }
    }

    public boolean hasSpot(Vehicle v) {
        for(int i=0;i<spots.length;i++) {
            if(spots[i].getVehicle() == null) {
                return true;
            }
        }
        return false;
    }

    public boolean park(Vehicle v) {
        for(int i=0;i<spots.length;i++) {
            if(v.getSize().getSize() <= spots[i].getSize().getSize() && spots[i].getVehicle() == null) {
                spots[i].park(v);
                return true;
            }
        }
        return false;
    }

    public boolean leave(Vehicle v) {
        for(int i=0;i<spots.length;i++) {
            if(spots[i].getVehicle() == v) {
                spots[i].leave();
                return true;
            }
        }
        return false;
    }
}
