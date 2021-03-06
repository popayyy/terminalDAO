package ua.mamedov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Основной класс запуска приложения
 */
public final class App {

    private App() {
    }

    /**
     * Основной метод запуска
     */
    public static void main(final String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/applicationContext.xml");


//        GreeterService greeterService = context.getBean(GreeterService.class);
//        GreeterDao dao = context.getBean(GreeterDao.class);
//
//        Greeter greeter = new Greeter();
//        greeter.setGreeting("Hello");
//        greeter.setTarget("World");
//
//        dao.addGreet(greeter);
//
//        System.out.println(greeterService.greet());


//        // получаем бины для работы
//        CardDAO cardDAO = context.getBean(CardDAO.class);
//
//        // добавление новой карты
//        Card card = new Card();
//        card.setCardnumber("1234");
//        card.setPin("1234");
//        card.setBalance(10000L);// Суммы указиваем в копейках
//        cardDAO.addCard(card);
//
//        //просмотр списка карт
//        List<Card> cards = cardDAO.getAll();
//        for (Card c : cards) {
//            System.out.println(c);
//        }

        startMenu();

        System.exit(0);
    }


    private static void startMenu() {
        System.out.println("Добро пожаловать в банке nextX");
        while (!autorization()) {
            System.out.println("Неуспешно, повторите авторизацию");
        }

        // авторизация успешна - показываем основное меню пользователя
        System.out.println("Авторизация успешна)");
        mainMenu();
        mainMenuController();
    }


    private static boolean autorization() {
        // Подключаем сканер для ввода информации через консоль
        Scanner in = new Scanner(System.in);
        System.out.println("Для начала работы введите номер карты и пинкод");
        System.out.println("***Пожалуйста каждый ввод информации заканчивайте нажатием кнопки Enter");
        System.out.println("Введите полный номер карты:");
        String cardnumber = in.nextLine();
        System.out.println("Введите пинкод:");
        String pin = in.nextLine();
//        in.close();

        if (cardnumber.equals("1234") && pin.equals("1234")) {
            return true;
        } else {
            return false;
        }

    }


    // Отображение основного экрана
    private static void mainMenu() {
        System.out.println("Выберите операцию:");
        System.out.println("***Для выбора операции необходимо ввести цыфру обозначающию операцию и нажать кнопку Enter");
        System.out.println("1: Информация по карте");
        System.out.println("2: Операции с картой");
        System.out.println("8: Администрирование");
        System.out.println("0: Выйти");
    }


    private static void mainMenuController() {
        Scanner in = new Scanner(System.in);
        String choiceMenu = in.nextLine();
//        in.close();

        if (isNumeric(choiceMenu)) {
            int choice = Integer.parseInt(choiceMenu);
            if (choice >= 0 && choice < 9) {
                // отоборажаем информацию по конкретному разделу
                switch (choice) {
                    case 1:
                        System.out.println("Информация по карте");
                        cardMenu();
                        cardMenuController();
                        break;
                    case 2:
                        System.out.println("Операции с картой");
                        serviceMenu();
                        serviceController();
                        break;
                    case 8:
                        System.out.println("Администрирование");
                        break;
                    case 0:
                        System.out.println("Выход");
                        break;
                }
            } else {
                System.out.println("Такого пункта меню нету. Выберите пожалуйста еще раз пункт меню:");
                mainMenu();
            }
        } else {
            System.out.println("Такого пункта меню нету. Выберите пожалуйста еще раз пункт меню:");
            mainMenu();
        }

    }


    // Отображение основного экрана
    private static void cardMenu() {
        System.out.println("Выберите пункт меню:");
        System.out.println("1: Баланс");
        System.out.println("2: Просмотреть транзакции");
        System.out.println("0: Выйти");
    }

    private static void cardMenuController() {
        Scanner in = new Scanner(System.in);
        String choiceMenu = in.nextLine();
//        in.close();

        if (isNumeric(choiceMenu)) {
            int choice = Integer.parseInt(choiceMenu);
            if (choice >= 0 && choice < 3) {
                // отоборажаем информацию по конкретному разделу
                switch (choice) {
                    case 1:
                        System.out.println("Баланс");
                        break;
                    case 2:
                        System.out.println("Операции по карте");
                        break;
                    case 0:
//                        System.out.println("Выход");
                        mainMenu();
                        mainMenuController();
                        break;
                }
            } else {
                System.out.println("Такого пункта меню нету. Выберите пожалуйста еще раз пункт меню:");
                cardMenu();
            }
        } else {
            System.out.println("Такого пункта меню нету. Выберите пожалуйста еще раз пункт меню:");
            cardMenu();
        }

    }


    // Отображение основного экрана
    private static void serviceMenu() {
        System.out.println("Выберите сервисную операцию из списка:");


        // Запрашиваем список сервисов и отображаем сервисы
        System.out.println("1: название сервиса");


        System.out.println("0: Выйти");

    }


    private static void serviceController() {

        Scanner in = new Scanner(System.in);
        String choiceMenu = in.nextLine();
//        in.close();

        if (isNumeric(choiceMenu)) {
            int choice = Integer.parseInt(choiceMenu);
            if (choice >= 0 && choice < 7) {
                // отоборажаем информацию по конкретному разделу
                switch (choice) {
//                    case 1:
//                        System.out.println("1");
//                        break;
//                    case 2:
//                        System.out.println("2");
//                        break;
//                    case 3:
//                        System.out.println("3");
//                        break;
//                    case 4:
//                        System.out.println("4");
//                        break;
//                    case 5:
//                        System.out.println("5");
//                        break;
//                    case 6:
//                        System.out.println("6");
//                        break;
                    case 0:
//                        System.out.println("0");
                        mainMenu();
                        mainMenuController();
                        break;
                }
            } else {
                System.out.println("Такого пункта меню нету. Выберите пожалуйста еще раз пункт меню:");
                serviceMenu();
            }
        } else {
            System.out.println("Такого пункта меню нету. Выберите пожалуйста еще раз пункт меню:");
            serviceMenu();
        }

    }


    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
        }
    }

    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}
