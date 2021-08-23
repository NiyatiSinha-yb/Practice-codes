//Time Complexity: O(1)
//Space Complexity: O(1)
//https://leetcode.com/problems/design-parking-system/submissions/

class ParkingSystem {
        int big,med,sml;
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        med=medium;
        sml=small;
    }
    
    public boolean addCar(int carType) {
        
        if(carType==1 && big>=1)
        {
            big--;
            return true;
        }
        else if(carType==2 && med>=1)
        {
            med--;
            return true;
        }
        else if(carType==3 && sml>=1)
        {
            sml--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
