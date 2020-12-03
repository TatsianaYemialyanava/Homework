package by.it.yemialyanava.person.tasks;

import java.util.Scanner;

public class ActionWithMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество купюр наминалом 20");
        int sumMoney20 = scanner.nextInt();
        System.out.println("Введите купюры помещаемые в банкомат наминалом 50");
        int sumMoney50 = scanner.nextInt();
        System.out.println("Введите купюры помещаемые в банкомат наминалом 100");
        int sumMoney100 = scanner.nextInt();
        System.out.println("Введите сумму, которую вы хотите снять из банкомата");
        int withdrawMoney = scanner.nextInt();

        Bankomat cash = new Bankomat(60, 60, 80);

        cash.addMoney20(sumMoney20);
        cash.addMoney50(sumMoney50);
        cash.addMoney100(sumMoney100);
        boolean dengiVudanu = cash.withdraw(withdrawMoney);
        if (dengiVudanu == true){
            System.out.println("Заберите ваши деньги");
        } else {
            System.out.println("Ошибка");
        }
    }
}
