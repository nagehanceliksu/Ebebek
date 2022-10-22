public class EmpDriver {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1985,45,2000.0,"Kemal");
        System.out.println("1) Kemal");
        emp1.toString(emp1);
        Employee emp2 = new Employee(1999 , 10,3500.0,"Ayşe");
        System.out.println("2) Ayşe");
        emp2.toString(emp2);
        Employee emp3 = new Employee(2013,30,5500,"Nagehan");
        System.out.println("3) Nagehan");
        emp3.toString(emp3);




    }
}
