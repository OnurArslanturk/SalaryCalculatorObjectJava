public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Kemal", 2000.0, 45, 1985);
        Employee worker2 = new Employee("Mehmet", 1000.0, 55, 1990);

        worker1.tax();
        worker1.bonus();
        worker1.raiseSalary();
        worker1.toStr();
        System.out.println("===================================================");
        worker2.tax();
        worker2.bonus();
        worker2.raiseSalary();
        worker2.toStr();

    }
}

//https://app.patika.dev/onurarslanturk
//www.patika.dev