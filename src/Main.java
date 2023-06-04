public class Main {
    public static void printAllArr() {
        for (Employee employee : employee) {
            if (employee != null) {
                System.out.println(employee + " ");
            }
        }
    }

    public static int summ() {
        int sum = 0;
        for (Employee employee : employee) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }


    public static void maxName() {
        Employee max = null;
        for (Employee employee : employee) {
            if (employee == null) {
                continue;
            }
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зп " + max);
    }

    public static void minName() {
        Employee min = null;
        for (Employee employee : employee) {
            if (employee == null) {
                continue;
            }
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зп " + min);
    }


    public static double srSalary() {
        double srSralary = 0;
        int c = summ() * 100;

        int i = 0;
        for (Employee employee : employee) {
            if (employee != null) {
                i++;
            }
        }
        srSralary = (c / i);
        return srSralary / 100;
    }

    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = null;
        employee[1] = new Employee("wf", "wdx", "wfas", 1, 45687);
        employee[2] = new Employee("wf", "wdx", "wfas", 2, 25384);
        employee[3] = new Employee("wf", "wdx", "wfas", 3, 764316);
        printAllArr();
        maxName();
        minName();
        System.out.println("srSalary() = " + srSalary());
    }
}