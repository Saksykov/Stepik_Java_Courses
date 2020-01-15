/*
Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.

Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод,
вызвавший данный утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший
getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.
 */

public class Getting_Exceptions_step10 {

    public static String getCallerClassAndMethodName() {
        try{
            StackTraceElement[] stackTraceElements =  new Throwable().getStackTrace();
            if(stackTraceElements.length<3) return null;
            return stackTraceElements[2].getClassName() + '#' + stackTraceElements[2].getMethodName();
        } catch(Exception e) {
            return null;
        }
    }
}
