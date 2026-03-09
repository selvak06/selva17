public class Main {
    public static void main(String[] args) {
        Worker Bob = new Worker("Bob" ,"04/06/1970" );
        System.out.println(Bob.toString());

        Employee Tom = new Employee("Bob" ,"04/06/1975" , "12/06/2012");
        System.out.println(Tom.toString());
        System.out.println(Tom.getAge());
        System.out.println(Tom.collectPay());

        SalariedEmployee Sim = new SalariedEmployee("Sim","04/06/1970", " 12/06/2012",  100000);
        System.out.println(Sim.toString());
        Sim.retire();
        System.out.println(Sim.collectPay());

        HourlyEmployee Hum = new HourlyEmployee("Sim" ,"04/06/1965" ," 12/06/2012",  100);
        System.out.println(Hum.toString());
        System.out.println(Hum.collectPay());
        System.out.println(Hum.getDoublePay());
    }
}
