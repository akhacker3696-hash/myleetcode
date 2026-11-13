
class ParkingSystem {
    int a = 0; // Big
    int b = 0; // Medium
    int c = 0; // Small

    public ParkingSystem(int big, int medium, int small) {
        this.a = big;
        this.b = medium;
        this.c = small;
    }

    public boolean addCar(int n) {
        if (n == 1 && a > 0) {
            a--;
            return true;
        } 
        else if (n == 2 && b > 0) {
            b--;
            return true;
        } 
        else if (n == 3 && c > 0) {
            c--;
            return true;
        } 
        else {
            return false;
        }
    }
}
