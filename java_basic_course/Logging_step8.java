/*
В этой задаче вам нужно реализовать метод, настраивающий параметры логирования. Конфигурирование в коде позволяет
выполнить более тонкую и хитрую настройку, чем при помощи properties-файла.

Требуется выставить такие настройки, чтобы:

Логгер с именем "org.stepic.java.logging.ClassA" принимал сообщения всех уровней.
Логгер с именем "org.stepic.java.logging.ClassB" принимал только сообщения уровня WARNING и серьезнее.
Все сообщения, пришедшие от нижестоящих логгеров на уровень "org.stepic.java", независимо от серьезности
сообщения печатались в консоль в формате XML (*) и не передавались вышестоящим обработчикам
на уровнях "org.stepic", "org" и "".
 */

import java.util.logging.*;

public class Logging_step8 {

    private static void configureLogging() {
        Logger L1 =  Logger.getLogger("org.stepic.java.logging.ClassA");
        L1.setLevel(Level.ALL);

        Logger L2 =  Logger.getLogger("org.stepic.java.logging.ClassB");
        L2.setLevel(Level.WARNING);

        Logger L3 =  Logger.getLogger("org.stepic.java");

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        L3.addHandler(handler);
        L3.setUseParentHandlers(false);
    }
}
