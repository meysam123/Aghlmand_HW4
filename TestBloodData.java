public class TestBloodData {
    public static void main(String[] args) {
        BloodData test1=new BloodData();
        System.out.println("the Default Blood type is: "+test1.getBloodType());
        System.out.println("the Default RHFactor is: "+test1.getRhFactor());
        test1.setBloodType("B");
        test1.setRhFactor('-');
        System.out.println("\n"+"Bloodtype after set: "+test1.getBloodType());
        System.out.println("\n"+"Rhfactor after set: "+test1.getRhFactor());
        System.out.println("setiing invalid Bloodtype! ");
        test1.setBloodType("C");
    }
}
