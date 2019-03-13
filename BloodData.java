public class BloodData {
    private char bloodType;
    private boolean rhFactor;
    public BloodData(){
        this.bloodType='O';
        this.rhFactor=true;
    }
    public BloodData(char bloodType,char rhFactor){
        this.bloodType=bloodType;

        if(rhFactor=='+')
            this.rhFactor=true;
        else if(rhFactor=='-')
            this.rhFactor=false;

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

    public char getBloodType() {
        return bloodType;
    }
    public char getRhFactor(){
        if(this.rhFactor)
            return '+';
        else
            return '-';
    }
}
