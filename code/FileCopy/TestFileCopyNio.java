package FileReadAndWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestFileCopyNio {
    /**
     * Nio方式赋值文件
     * @param args
     */
    public static void main(String[] args) {
        Long startTime = System.currentTimeMillis();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("D:\\1\\so.txt"));
            FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\1\\copyFileResult.txt"));
            FileChannel fileReadChannel = fileInputStream.getChannel();
            FileChannel fileWriteChannel = fileOutputStream.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (true){
                buffer.clear();
                int read = fileReadChannel.read(buffer);
                if(read == -1){
                    break;
                }
                buffer.flip();//核心处理逻辑是，limit置为position的位置，position置为0
                fileWriteChannel.write(buffer);
            }
            fileReadChannel.close();
            fileWriteChannel.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        long l = System.currentTimeMillis() - startTime;
        System.out.println("nio耗时"+l);
    }
}
