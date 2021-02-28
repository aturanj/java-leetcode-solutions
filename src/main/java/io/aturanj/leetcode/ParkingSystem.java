package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/design-parking-system/
 */
class ParkingSystem {

    int bigCarSpace, mediumCarSpace, smallCarSpace;

    public ParkingSystem(int big, int medium, int small) {
        this.bigCarSpace = big;
        this.mediumCarSpace = medium;
        this.smallCarSpace = small;
    }

    public boolean addCar(int carType) {

        switch (carType) {

            case 1: { //big car
                if (bigCarSpace > 0) {
                    bigCarSpace--;
                    return true;
                } else {
                    return false;
                }
            }

            case 2: { //medium car

                if (mediumCarSpace > 0) {
                    mediumCarSpace--;
                    return true;
                } else {
                    return false;
                }
            }

            case 3: { //small car

                if (smallCarSpace > 0) {
                    smallCarSpace--;
                    return true;
                } else {
                    return false;
                }
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
