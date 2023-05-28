public class Main {
    public static void printAllArr(Employee[] arr) {
        for (Employee employee : arr) {
            if (employee != null) {
                System.out.println(employee + " ");
            }
        }
    }

    public static int summ(Employee[] arr) {
        int sum = 0;
        for (Employee employee : arr) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static int max(Employee[] arr) {
        int max = 0;
        for (Employee employee : arr) {
            if (employee != null && max < employee.getSalary()) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    public static void maxName(Employee[] arr) {

        for (Employee employee : arr) {
            if (employee != null && max(arr) == employee.getSalary()) {
                System.out.println("сотрудник с максимальой зарплатой = " + employee);
            }
        }
    }

    public static int min(Employee[] arr) {
        int min = max(arr);
        for (Employee employee : arr) {
            if (employee != null && min > employee.getSalary()) {
                min = employee.getSalary();
            }
        }
        return min;
    }

    public static void minName(Employee[] arr) {

        for (Employee employee : arr) {
            if (employee != null && min(arr) == employee.getSalary()) {
                System.out.println("сотрудник с минимальной зарплатой = " + employee);
            }
        }
    }

    public static double srSalary(Employee[] arr) {
        double srSralary = 0;
        int c = summ(arr) * 100;
        int i = 0;
        for (Employee employee : arr) {
            if (employee != null) {
                i++;
            }
        }
        srSralary = (c / i);
        return srSralary / 100;
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("wf", "wdx", "wfas", 1, 45687);
        employee[1] = new Employee("wf", "wdx", "wfas", 2, 25384);
        employee[2] = new Employee("wf", "wdx", "wfas", 3, 764316);
        printAllArr(employee);
        System.out.println("summ(employee) = " + summ(employee));
        System.out.println("max(employee) = " + max(employee));
        System.out.println("min(employee) = " + min(employee));
        System.out.println("srSalary(employee) = " + srSalary(employee));
        maxName(employee);
        minName(employee);

    }
}