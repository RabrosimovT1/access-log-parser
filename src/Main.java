import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        infinityLoop();
    }
    public static void infinityLoop (){
        //Переменная количества верных путей до файла
        int countFile =0;
        //Бесконечный цикл
        while (true){
            System.out.println("Введите путь до файла ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            //Переменная верного пути к файлу
            boolean fileExists = file.exists();
            //Переменная пути к дирректории
            boolean isDirectory = file.isDirectory();
            if (!fileExists || isDirectory) {
                System.out.println("Указанный путь является путем к папке " +
                        "или указанный файл не существует");
                System.out.println("");
            }else {
                countFile++;
                System.out.println("Путь указан верно - это файл № " + countFile);
            }
            System.out.println("");
        }
    }
}