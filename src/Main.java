import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList code = new ArrayList<>();
        String[] array = {
                "А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л",
                "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш",
                "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"
        };
        int what = 0;
        while (what != 2){
            System.out.print("Выбери действие (0 = зашифровать, 1 = расшифровать, 2 = выйти): ");
            what = scanner.nextInt();
            scanner.nextLine();

            if (what == 0){
                System.out.print("Введите текст для шифрования: ");
                String text = scanner.nextLine();
                String[] listText = text.split("");

                for (int i = 0; i < listText.length; i++){
                    String a = listText[i].toUpperCase();
                    int index = Arrays.asList(array).indexOf(a);
                    if (index != -1){
                        code.add(array[(index+3) % array.length]);
                    }
                    else{
                        code.add(a);
                    }

                }
                System.out.println(String.join("", code));
                code.clear();
            }
            else if (what == 1){
                System.out.print("Введите текст для расшифровки: ");
                String ctext = scanner.nextLine();
                String[] clistText = ctext.split("");

                for (int i = 0; i < clistText.length; i++){
                    String b = clistText[i].toUpperCase();
                    int cindex = Arrays.asList(array).indexOf(b);
                    if (cindex != -1){
                        code.add(array[(cindex-3) % array.length]);
                    }
                    else{
                        code.add(b);
                    }
                }
                System.out.println(String.join("", code));
                code.clear();
            }
        }

    }
}