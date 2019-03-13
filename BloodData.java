public class BloodData {
    private char bloodType;
    private boolean rhFactor;
    public BloodData(){
        this.bloodType='O';
        this.rhFactor=true;
    }
    public BloodData(char bloodType,boolean rhFactor){
        this.bloodType=bloodType;
        this.rhFactor=rhFactor;
    }

    public void setBloodType(char bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(char rhFactor) {
        if(rhFactor=='+')
            this.rhFactor=true;
        else if(rhFactor=='-')
            this.rhFactor=false;
    }
}
