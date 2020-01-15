/*
Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде
готового текста (см. пример). Каждая группа распечатывается в следующем виде:

Роль:
i) текст
j) текст2
...
==перевод строки==

i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии
с порядком ролей. Переводы строк между группами обязательны, переводы строк в конце текста не учитываются.
 */

public class Operators_and_Loops_step10 {

    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuffer sf = new StringBuffer("");
        for(String rol: roles){
            String s = rol + ":";
            sf.append(s);
            sf.append("\n");
            for(int j = 0; j < textLines.length; j++){
                if(textLines[j].startsWith(s)){
                    sf.append((j+1) + ")");
                    sf.append(textLines[j].substring(s.length()));
                    sf.append("\n");
                }
            }
            sf.append("\n");
        }
        return sf.toString();
    }
}
