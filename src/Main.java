public class Main {
    public static void main(String[] args) {
        checkYear(2021);
        setOS(0,2015);
        deliver(95);
    }
    public static void checkYear(int year) {

        System.out.println("Задание номер 1");
        if (year % 4 == 0 && year % 400 == 0 || year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        }
        public static void setOS(int clientOS, int clientDeviceYear ){
            System.out.println("Задание номер 2");
            if (clientOS==1 && clientDeviceYear<=2015){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else if(clientOS==1 && clientDeviceYear>2015)  {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else if(clientOS!=1 && clientDeviceYear<=2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else if(clientOS!=1 && clientDeviceYear>2015) {

                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            }
        }
        public static int deliver(int deliveryDistance){
            System.out.println("Задание номер 3");
            int day=1;
            if (deliveryDistance<20){
                System.out.println("Потребуется дней: "+ day);
                return day;
            }
            else if(deliveryDistance >=20 && deliveryDistance<60){
                System.out.println("Потребуется дней: "+ (day+1));
                return day;

            }
            else if(deliveryDistance >=60 && deliveryDistance<100){
                System.out.println("Потребуется дней: "+ (day+2));
                return day;
            }
            else{
                System.out.println("Доставки нет");
                return day;
            }
        }
    }
