package by.it.yemialyanava.person.tasks;

public class Bankomat {
    int money20;
    int money50;
    int money100;

    public Bankomat(int money20, int money50, int money100){
        this.money20 = money20;
        this.money50 = money50;
        this.money100 = money100;
    }

    public void addMoney20(int dengi20){
        this.money20 = money20+1;
    }

    public void addMoney50(int dengi30){
        this.money50 = money50+1;
    }

    public void addMoney100(int dengi100){
        this.money100 = money100+1;
    }

    int amountOfMoney(){
        int summaInBancomat = (money20 * 20) + (money50 * 50) + (money100 * 100);
        return summaInBancomat;
    }

    public boolean withdraw (int summa){
        boolean result = false;
        if (summa <= amountOfMoney()) {
            int money20Withdraw = 0;
            int money50Withdraw = 0;
            int money100Withdraw = 0;

            int ostatokForWithdraw = summa;
            boolean chisloIsEven = chetny(summa);
            if (!chisloIsEven){
                money50Withdraw = 1;
                ostatokForWithdraw = ostatokForWithdraw - 50;
            }
            money100Withdraw = ostatokForWithdraw / 100;
            money20Withdraw = (ostatokForWithdraw % 100) / 20;
            int resultSumma = money20Withdraw * 20 + money50Withdraw * 50 + money100Withdraw * 100;
            if (resultSumma == summa) {
                if ((money20Withdraw < this.money20) &&
                        (money50Withdraw < this.money50) &&
                        (money100Withdraw < this.money100)) {
                    this.money20=this.money20-money20Withdraw;
                    this.money50 =this.money50-money50Withdraw;
                    this.money100 =this.money100- money100Withdraw;
                    result = true;
                } else {
                    System.out.println("Не хватает купюр. 100: " + money100 + "шт. 50: "
                            + money50 + " шт. 20:" + money20 + " шт. Запрос:" + money100Withdraw + "/"
                            + money50Withdraw + "/" + money20Withdraw);
                }
            } else {
                System.out.println("Ошибка системы");
            }
        } else{
            System.out.println("В банкомате недостаточно средств");
        }
        return result;
    }

    /*boolean chetny(int chislo){
        return chislo % 2 == 0;
    }*/
    boolean chetny(int chislo){
        boolean isEven = false;
        if (chislo % 2 == 0){
            isEven = true;
        } else {
            isEven = false;
        }
        return isEven;
    }

}
