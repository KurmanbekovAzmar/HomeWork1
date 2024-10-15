import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();
        employee1.name = "Azmar";
        employee1.age = 15;
        employee1.price = 15500;
        employee1.expirience = 1;
        employee1.employes();

        Employee employee2 = new Employee();
        employee2.name = "Rahmankul";
        employee2.age = 21;
        employee2.price = 40000;
        employee2.expirience = 5;
        employee2.employes();

        Employee employee3 = new Employee();
        employee3.name = "Rahimgon";
        employee3.age = 15;
        employee3.price = 25500;
        employee3.expirience = 4;
        employee3.employes();

        Employee employee4 = new Employee();
        employee4.name = "Adilet";
        employee4.age = 19;
        employee4.price = 15500;
        employee4.expirience = 6;
        employee4.employes();

        Employee employee5 = new Employee();
        employee5.name = "Enes";
        employee5.age = 29;
        employee5.price = 15500;
        employee5.expirience = 9;
        employee5.employes();
        System.out.println(" ");

        Employee[] employes = {employee1, employee2, employee3, employee4, employee5};

        for (; true; ) {
            int num = scanner.nextInt();
            System.out.println("1-get age, 2-get price, 3-get expirience, o-Exit");
            switch (num) {
                case 1: {
                    for (int i = 0; i < employes.length; i++) {
                        employes[i].getAge();
                    }
                }
                break;
                case 2: {
                    for (int i = 0; i < employes.length; i++) {
                        employes[i].getPrice();
                    }
                }
                break;
                case 3: {
                    for (int i = 0; i < employes.length; i++) {
                        employes[i].getExpireance();
                    }
                }
                break;
                default:
                    System.out.println("Жщн жаз !!!!!!");
                    break;

            }
            if (num == 0) {
                break;
            }
        }

    }
}