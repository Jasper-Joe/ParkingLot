public class ParkingLot {
    Level[] levels;
    public ParkingLot(int numLevels, int numSpotsPerLevel) {
        levels = new Level[numLevels];
        for(int i=0;i<levels.length;i++) {
            levels[i] = new Level(numSpotsPerLevel);
        }

    }

    public boolean hasSpot(Vehicle v) {
        for(int i=0;i<levels.length;i++) {
            if(levels[i].hasSpot(v)) {
                return true;
            }
        }
        return false;
    }

    public boolean park(Vehicle v) {
        for(int i=0;i<levels.length;i++) {
            if(levels[i].park(v)) {
                return true;
            }
        }
        return false;

    }

    public boolean leave(Vehicle v) {
        for(int i=0;i<levels.length;i++) {
            if(levels[i].leave(v)) {
                return true;
            }
        }
        return false;
    }
}
