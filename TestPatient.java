public class TestPatient {
    public static void main(String[] args) {
        Patient test=new Patient();
        System.out.println("Checking the defualt Constuctor:");
        System.out.println("-------------------------------");
        System.out.println("defualt Age: "+test.getAge());
        System.out.println("defualt IdNumber: "+test.getIdNumber());
        System.out.println("default Bloodtype: "+test.getBloodData().getBloodType());
        BloodData bloodData=new BloodData("AB",'+');
        Patient test1=new Patient(5,31,bloodData);
        System.out.println("Checking the overloaded Constructor");
        System.out.println("-------------------------------");
        System.out.println("defualt Age: "+test1.getAge());
        System.out.println("defualt IdNumber: "+test1.getIdNumber());
        System.out.println("default Bloodtype: "+test1.getBloodData().getBloodType());
    }
}
