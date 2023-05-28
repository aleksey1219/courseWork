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
    public static int min(Employee[] arr) {
        int min=max(arr);
        for (Employee employee : arr) {
            if (employee != null&&min> employee.getSalary()) {
                min= employee.getSalary();
            }
        }
        return min;
    }
    public static double srSalary(Employee[] arr) {
        double srSalary= summ(arr);
        for (Employee employee : arr) {
            if (employee != null) {
                srSalary=srSalary/ arr.length;
            }
        }
        return srSalary;
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("wf", "wdx", "wfas", 1, 5);
        employee[1] = new Employee("wf", "wdx", "wfas", 2, 5);
        employee[2] = new Employee("wf", "wdx", "wfas", 3, 5);
        printAllArr(employee);
        System.out.println("summ(employee) = " + summ(employee));
        System.out.println("max(employee) = " + max(employee));
        System.out.println("min(employee) = " + min(employee));
        System.out.println("srSalary(employee) = " + srSalary(employee));
    }
}