class ParkingSystem {
    int b = 0, m = 0, s = 0;
    public ParkingSystem(int big, int medium, int small) {
        this.b = big;
        this.m = medium;
        this.s = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(b >= 1) {
                b--;
                return true;
            }
        }
        else if (carType == 2) {
            if(m >= 1) {
                m--;
                return true;
            }
        }
        else {
            if(s >= 1) {
                s--;
                return true;
            }
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */