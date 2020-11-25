package by.it.yemialyanava.person.tasks;

public class Task8 {
    public static void main(String[] args) {
        int i = 121;
        int prelastNumber = i % 100 / 10;
        if (prelastNumber == 1) {
            System.out.println(i + " рублей ");
        } else {
            switch (i % 10) {
                case 1:
                    System.out.println(i + " рубль ");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(i + " рубля ");
                    break;
                default:
                    System.out.println(i + " рублей ");

            }
        }
    }
}
