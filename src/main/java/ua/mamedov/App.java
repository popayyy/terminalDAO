package ua.mamedov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mamedov.dao.CardDAO;
import ua.mamedov.dao.GreeterDao;
import ua.mamedov.entity.Card;
import ua.mamedov.entity.Greeter;
import ua.mamedov.service.GreeterService;

import java.util.List;
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


        // получаем бины для работы
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


        System.out.println("Добро пожаловать в банке nextX");
//        while (!autorization()) {
//            System.out.println("Неуспешно, повторите авторизацию");
//        }
//
//        // авторизация успешна - показываем основное меню пользователя
//        System.out.println("Авторизация успешна)");
//        showMainMenu();
//        mainMenuController();


        System.exit(0);
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
    private static void showMainMenu() {
        System.out.println("Выберите операцию:");
        System.out.println("***Для выбора операции необходимо ввести цыфру обозначающию операцию и нажать кнопку Enter");
        System.out.println("1: Баланс");
        System.out.println("2: Снять наличные");
        System.out.println("3: Пополнить номер телефона");
        System.out.println("4: Пополнить баланс");
        System.out.println("5: Перевод на другую карту");
        System.out.println("6: История операций");
        System.out.println("0: Выйти");
    }

    private static void mainMenuController() {

        Scanner in = new Scanner(System.in);
        String choiceMenu = in.nextLine();
//        in.close();

        if (isNumeric(choiceMenu)) {
            int choice = Integer.parseInt(choiceMenu);
            if (choice >= 0 && choice < 7) {
                // отоборажаем информацию по конкретному разделу
                switch (choice) {
                    case 1:
                        System.out.println("1");
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                    case 4:
                        System.out.println("4");
                        break;
                    case 5:
                        System.out.println("5");
                        break;
                    case 6:
                        System.out.println("6");
                        break;
                    case 0:
                        System.out.println("0");
                        break;
                }
            } else {
                System.out.println("Такого пункта меню нету. Выберите пожалуйста еще раз пункт меню:");
                mainMenuController();
            }
        } else {
            System.out.println("Такого пункта меню нету. Выберите пожалуйста еще раз пункт меню:");
            mainMenuController();
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
