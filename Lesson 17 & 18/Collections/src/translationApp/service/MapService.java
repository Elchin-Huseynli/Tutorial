package translationApp.service;

import translationApp.service.impl.MapServiceImpl;
import static translationApp.util.InputUtil.*;
import java.util.HashMap;
import java.util.Map;

public class MapService implements MapServiceImpl {
    public void translationEnToAz() {
        byte correctAnswer = 0;
        byte wrongAnswer = 0;

        Map<String, String> map = new HashMap<>();
        map.put("car", "maşın");
        map.put("glass", "şüşə");
        map.put("phone", "telefon");
        map.put("tv", "televizor");
        map.put("door", "qapı");
        map.put("lock", "kilid");
        map.put("light", "işıq");
        map.put("button", "düymə");
        map.put("game", "oyun");
        map.put("delete", "silmək");
        map.put("go", "getmək");
        map.put("home", "ev");
        map.put("print", "çap etmək");
        map.put("break", "sındırmaq");
        map.put("language", "dil");

        System.out.println("-----| Tərcümə |-----");

        for (Map.Entry<String, String> word : map.entrySet()) {
            System.out.print(word.getKey() + " - ");
            String str = inputTypeString("Sözün qarşılığı: ");
            if (str.equals(word.getValue())) {
                correctAnswer++;
            } else {
                wrongAnswer++;
                System.out.println("Correct answer: " + word.getValue());
            }
        }
        System.out.println("\nCorrect answer: " + correctAnswer);
        System.out.println("Wrong answer: " + wrongAnswer);
    }



    public void translationAzToEn() {
        byte correctAnswer = 0;
        byte wrongAnswer = 0;

        Map<String, String> map = new HashMap<>();
        map.put("car", "maşın");
        map.put("glass", "şüşə");
        map.put("phone", "telefon");
        map.put("tv", "televizor");
        map.put("door", "qapı");
        map.put("lock", "kilid");
        map.put("light", "işıq");
        map.put("button", "düymə");
        map.put("game", "oyun");
        map.put("delete", "silmək");
        map.put("go", "getmək");
        map.put("home", "ev");
        map.put("print", "çap etmək");
        map.put("break", "sındırmaq");
        map.put("language", "dil");

        System.out.println("-----| Translate |-----");

        for (Map.Entry word : map.entrySet()) {
            System.out.print(word.getValue() + " - ");
            String str = inputTypeString("Translation: ");
            if (str.equals(word.getKey())) {
                correctAnswer++;
            }
            else {
                wrongAnswer++;
                System.out.println("Correct answer: " + word.getKey());
            }
        }
        System.out.println("\nCorrect answer: " + correctAnswer);
        System.out.println("Wrong answer: " + wrongAnswer);
    }
}
