public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        boolean isLiteNeeded = clientDeviceYear < 2019;
        if (clientOS == 0) {
            if (isLiteNeeded) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        else if (clientOS == 1) {
            if (isLiteNeeded) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            System.out.println();
            int year = 2022;
            if (year >1584 && (year % 4 == 0) && year % 100 != 0) {
                System.out.println(year + " это высокосный год");
            } else if (year >1584 && (year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
                System.out.println(year + "это высокосный год");
            else {
                System.out.println("Не высокосный год");
            }
            {System.out.println();}
            int deliveryDistance = 95;
            int resultat = 1;
            if(deliveryDistance <20) {
                resultat= resultat;}
            if(deliveryDistance >20 && deliveryDistance <60){
                resultat= resultat +1;}
            if(deliveryDistance >60 && deliveryDistance <100){
                resultat = resultat +2;}
            else{
                    System.out.println("Доставка не осуществляется");
                }
            System.out.println( "Потребуется дней: "+resultat+" дня доставки");
        }{
            System.out.println();}
        {
            int monthNumber = 12;
            switch (monthNumber){
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень.");
                    break;
                default:
                    System.out.println("Такого месяца нет.");
            }
        }

    }
}