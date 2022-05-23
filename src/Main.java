import java.util.Scanner;

    public class Main {
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            boolean booleanExit = true;
            do {
                KursValuta();
            }while (exit(booleanExit));
        }
        public  static  void KursValuta(){
            System.out.println("Добро пожаловать в Обменку \"Киты\"");
            Euro euro = new Euro();
            euro.setNameVal("EURO");
            euro.setBuyValute(79);
            euro.setSellValute(80);
            USD usd = new USD();
            usd.setNameVal("USD");
            usd.setBuyValute(69);
            usd.setSellValute(70);
            System.out.println("Валюта  " + "Покупка / " + "Продажа");
            System.out.println(usd);
            System.out.println(euro);
            Choice(usd,euro);
        }
        public static void  Choice(USD usd,Euro euro){
            System.out.print("Выберите Курс:\n" +
                    "Наличные - 1\n" +
                    "Безналичные - 2\n" +
                    "Выбор: ");
            int choiceKurs = sc.nextInt();
            System.out.print("\nЕсли хотите купить введите-1\n" +
                    "Если хотите продать введите-2\n" +
                    "Выбор: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("\nВыберите валюту для покупки\n" +
                        "Доллар - 1\n" +
                        "Евро - 2\n" +
                        "Выбор: ");
                if(choiceKurs == 1){
                    BuyMoney(usd.getBuyValute(), euro.getBuyValute());
                }
                else if(choiceKurs == 2){
                    BuyElectronicMoney(usd.getBuyValute(), euro.getBuyValute());
                }

            }else if(choice == 2) {
                System.out.print("\nВыберите валюту для продажи\n" +
                        "Доллар - 1\n" +
                        "Евро - 2\n" +
                        "Выбор: ");
                if(choiceKurs == 1){
                    SellMoney(usd.getSellValute(), euro.getSellValute());
                }
                else if(choiceKurs == 2){
                    SellElectronicMoney(usd.getSellValute(), euro.getSellValute());
                }
            }
        }
        public static void BuyMoney(double usd, double euro){
            int valyt = sc.nextInt();
            switch (valyt) {
                case 1:
                    System.out.print("Введите сумму в сомах: ");
                    double sum = 0;
                    int sum1 = sc.nextInt();
                    sum = sum1 / usd;
                    System.out.println("Вы получили "+sum+" долларов");
                    break;
                case 2:
                    System.out.print("Введите сумму в сомах: ");
                    int sum2 = sc.nextInt();
                    sum = sum2 / euro;
                    System.out.println("Вы получили "+sum+" евро");
                    break;

            }
        }public static void SellMoney(double usd, double euro) {
            int valyt = sc.nextInt();
            switch (valyt) {
                case 1:
                    System.out.print("Введите сумму в долларах: ");
                    double sum = 0;
                    int sum1 = sc.nextInt();
                    sum = sum1 * usd;
                    System.out.println("Вы получили "+sum+" сом");
                    break;
                case 2:
                    System.out.print("Введите сумму в евро: ");
                    int sum2 = sc.nextInt();
                    sum = sum2 * euro;
                    System.out.println("Вы получили "+sum+" сом");
                    break;
            }
        }
        public static void BuyElectronicMoney(double usd, double euro){
            int valyt = sc.nextInt();
            switch (valyt) {
                case 1:
                    System.out.print("Введите сумму в сомах: ");
                    double sum = 0;
                    int sum1 = sc.nextInt();
                    sum1 = sum1-((sum1/100)*2);
                    sum = sum1 / usd;
                    System.out.println(sum);
                    break;
                case 2:
                    System.out.print("Введите сумму в сомах: ");
                    int sum2 = sc.nextInt();
                    sum2 = sum2-((sum2/100)*2);
                    sum = sum2 / euro;
                    System.out.println(sum);
                    break;

            }
        }public static void SellElectronicMoney(double usd, double euro) {
            int valyt = sc.nextInt();
            switch (valyt) {
                case 1:
                    System.out.print("Введите сумму в долларах: ");
                    double sum = 0;
                    int sum1 = sc.nextInt();
                    sum1 = sum1-((sum1/100)*2);
                    sum = sum1 * usd;
                    System.out.println(sum);
                    break;
                case 2:
                    System.out.print("Введите сумму в евро: ");
                    int sum2 = sc.nextInt();
                    sum2 = sum2-((sum2/100)*2);
                    sum = sum2 * euro;
                    System.out.println(sum);
                    break;
            }
        }
        public static boolean exit(boolean booleanExit){
            System.out.println("Если хотите выйти введите\"exit\"\n" +
                    "Еслии нет\"любую кнопку\"");
            String exit = sc.next();
            if(exit.equals("exit")){
                System.out.println("До скорой встречи!");
                booleanExit = false;
            }
            return booleanExit;
        }
    }




