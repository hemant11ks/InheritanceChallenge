public class Main {

    public static void main(String[] args){
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1995", "03/03/2022", 35000);
        System.out.println(joe);
        // System.out.println("Age = " + joe.getAge());
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());

        /*
        Each method call, madeon these objects, points t the code that will actually be eecuted
        When joe or mary call getAge(), the methods implementation is on Worker and not overridden by any other class,
        so the getAge method on Worker is executed

        When joe or mary call toString() this method has been overridden twice, first by Worker and then by Employee. But ut wasnot
        overridden by either SalariedEmployee or HourlyEmployee so the method from the Employee method from the Employee
        class is the one thats sed.

        Looking at the collectPay() method this method was overridden by both SalariedEmployee and HourlyEmployee.

        Joe will execute the method on SalariedEmployee.

        SalariedEmployee has a method retire thats not overridden meaning its only on that class its method specific
        to a Salaried employee.
         */

    }
}