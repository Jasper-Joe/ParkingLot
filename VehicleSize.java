public enum VehicleSize {
    Compact(1),
    Large(2);
    int val;
    VehicleSize(int val) {
        this.val = val;
    }
    public int getSize() {
        return val;
    }
}
