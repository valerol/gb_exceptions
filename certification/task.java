package certification;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import certification.CustomException;

public class task {
    static final int subrecordsNum = 6;
    public static void main(String[] args) throws CustomException {
        try {
            dataRecord(dataCheck(dataParce(dataInput())));
        } catch(CustomException e) {
            System.out.println(e);
        } catch(IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static String dataInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите данные через пробел");
        return input.nextLine();
    }

    public static String[] dataParce(String data) throws CustomException {
        String[] dataArray = data.split(" ");
        String[] recordArray = new String[subrecordsNum];
        if (dataArray.length == subrecordsNum) {
            for (int i = 0; i < subrecordsNum; i++) {
                if (dataArray[i].equals("f") || dataArray[i].equals("m")) {
                    recordArray[5] = dataArray[i];
                } else if (dataArray[i].matches("\\d{2}.\\d{2}.\\d{4}")) {
                    recordArray[3] = dataArray[i];
                } else if (dataArray[i].matches("^[0-9]*$")) {
                    recordArray[4] = dataArray[i];
                } else if (recordArray[0] == null) {
                    recordArray[0] = dataArray[i];
                } else if (recordArray[1] == null) {
                    recordArray[1] = dataArray[i];
                } else {
                    recordArray[2] = dataArray[i];
                }
                //System.out.println("recordArray[" + i + "] = " + recordArray[i]);
            }
        } else {
            throw new CustomException("Неверное количество данных", 100);
        }
        return recordArray;
    }

    public static String[] dataCheck(String[] data) throws CustomException {
        for (int i = 0; i < subrecordsNum; i++) {
            //System.out.println("data[" + i + "] = " + data[i]);
        }
        if (data[0] == null) {
            throw new CustomException("Не введено имя", 110);
        } else if (data[1] == null) {
            throw new CustomException("Не введена фамилия", 120);
        } else if (data[2] == null) {
            throw new CustomException("Не введено отчество", 130);
        } else if (data[3] == null) {
            throw new CustomException("Не введена дата рождения или некорректный формат даты", 140);
        } else if (data[4] == null) {
            throw new CustomException("Не введен телефон или некорректный формат", 150);
        } else if (data[5] == null) {
            throw new CustomException("Не введен пол или некорректный формат", 160);
        }
        return data;
    }

    public static void dataRecord(String[] data) throws IOException {
        File f = new File(data[0]); 
        try(
            FileWriter fr = new FileWriter(f, true);
			BufferedWriter br = new BufferedWriter(fr);
			PrintWriter pr = new PrintWriter(br);
        ) {
            String record = String.join(" ", data);
            pr.println(record);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }
}
