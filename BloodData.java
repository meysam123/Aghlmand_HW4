public class BloodData {
    private String bloodType;
    private boolean rhFactor;
    public BloodData(){
        this.bloodType="O";
        this.rhFactor=true;
    }
    public BloodData(String bloodType,char rhFactor){
        if(!bloodType.equals("A")&&!bloodType.equals("B")&&!bloodType.equals("AB")&&!bloodType.equals("O"))
            throw new IllegalArgumentException("Valid Blod Type are: A,B,AB,O");
        else
            this.bloodType=bloodType;

        if(rhFactor=='+')
            this.rhFactor=true;
        else if(rhFactor=='-')
            this.rhFactor=false;

    }

    public void setBloodType(String bloodType) {
        if(!bloodType.equals("A")&&!bloodType.equals("B")&&!bloodType.equals("AB")&&!bloodType.equals("O"))
            throw new IllegalArgumentException("Valid Blood Type are: A,B,AB,O");
        else
            this.bloodType = bloodType;
    }

    public void setRhFactor(char rhFactor) {
        if(rhFactor=='+')
            this.rhFactor=true;
        else if(rhFactor=='-')
            this.rhFactor=false;
    }

    public String getBloodType() {
        return bloodType;
    }
    public char getRhFactor(){
        if(this.rhFactor)
            return '+';
        else
            return '-';
    }
}
