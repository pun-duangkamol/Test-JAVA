public class Main{

    public static void main(String[] args){

            Employee e1 = new Employee(); //Create employee
            e1.setID("1");
            e1.setName("Duangkamol");
            e1.setSalary(30000.0);
            
            System.out.println(e1.getName());

            Employee e2 = new Employee(); //Create employee
            e2.setID("2");
            e2.setName("Siri");
            e2.setSalary(20000.0);
            System.out.println(e2.getName());
            
    }
    
}