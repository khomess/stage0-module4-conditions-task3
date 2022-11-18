package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salaryD = salary;
        if(salaryD>0){
            if (salaryD > 0 && salaryD <= 10000){
                salaryD = salaryD * 0.85;
                System.out.println(salaryD);
            }
            if (salaryD > 10000 && salaryD <= 20000){
                salaryD = salaryD * 0.82;
                System.out.println(salaryD);
            }
            if (salaryD > 20000) {
                salaryD = salaryD * 0.80;
                System.out.println(salaryD);
            }
        } else {
            System.out.println("wrong input!");
        }
    }
}
