package com.example.kucherandroid;

 class Shop extends Thread{
    Account account;
    String name;
    public Shop (String name, Account account){
        this.name = name;
        this.account = account;
    }

    @Override
    public void run() {
        account.buy();
    }

    static class Account{
        public int ammount= 0;
        public synchronized void buy() {
            if (this.ammount >= 70) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.ammount -= 70;
            } else {
                System.out.println("Недостаточно средств");
            }
            System.out.println("Остаток: " + this.ammount + " рублей");
        }
    }
    public static void main(String [] args){
        Account account = new Account();
        account.ammount= 100;
        Shop s1 = new Shop("Березка", account);
        Shop s2 = new Shop("Сушистик",account);
        s1.start();s2.start();
    }
}
