public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int[] salary = {1500, 2500, 2850, 3200, 3500};
        int sumSalary = 0;
        for (int i : salary) {
            sumSalary += i;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей\n", sumSalary);

        System.out.println("task 2");
        int[] rangeSalary = {1500, 2500, 2850, 3200, 3500};
        int salaryMax = rangeSalary[0];
        int salaryMin = rangeSalary[0];
        for (int i : rangeSalary) {
            if (i > salaryMax) {
                salaryMax = i;
            }
            if (i < salaryMin) {
                salaryMin = i;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей. Максимальная сумма трат за " +
                "неделю составила %s рублей\n", salaryMin, salaryMax);
        System.out.println("task 3");
        int[] salaryNew = {1500, 2500, 2850, 3200, 3500};
        int sumSalaryNew = 0;
        for (int i : salaryNew) {
            sumSalaryNew += i;
        }
        int weeklySalary = sumSalaryNew / salaryNew.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей\n", weeklySalary);

        System.out.println("task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}