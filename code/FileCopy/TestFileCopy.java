package FileReadAndWrite;

import java.io.*;

public class TestFileCopy {
    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        try {
            File writeFile = new File("D:\\1\\copyFileResult1.txt");
            FileWriter fileWriter = new FileWriter(writeFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            BufferedReader br = new BufferedReader(new FileReader(new File("D:\\1\\so.txt")));//构造一个BufferedReader类来读取文件
            String s = null;
            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            br.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long l = System.currentTimeMillis() - startTime;
        System.out.println("耗时"+l);
    }
}
