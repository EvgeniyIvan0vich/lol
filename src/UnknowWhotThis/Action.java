package UnknowWhotThis;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Action {
    public void Jmyak() {
        int random;

        String fp = "C:\\Users\\Ivan_Igorevich\\Downloads\\-09876543.jpg";
        String fpt = "C:\\Users\\Ivan_Igorevich\\Downloads\\5a30646a627f41604d083fa3.png";

        File file = new File(fp);
        File filet = new File(fpt);
        String comand = "cmd /c start %windir%\\system32\\mspaint.exe C:\\Users\\Ivan_Igorevich\\Downloads\\-09876543.jpg";
        String comandt = "cmd /c start %windir%\\system32\\mspaint.exe C:\\Users\\Ivan_Igorevich\\Downloads\\5a30646a627f41604d083fa3.png";

        Random rand = new Random();
        random = rand.nextInt();
        if (random % 2 == 0) {
            try {
                //Desktop.getDesktop().open(file);
                Runtime.getRuntime().exec(comand) ;
            } catch (IOException e) {
                System.out.println("Ошибка открытия файла" + e.getMessage());
            }
        } else {
            try {
                //Desktop.getDesktop().open(filet);
                Runtime.getRuntime().exec(comandt) ;
            } catch (IOException e) {
                System.out.println("Ошибка открытия файла" + e.getMessage());
            }

        }
    }
}
