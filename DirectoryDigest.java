import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.security.MessageDigest;
import java.util.Comparator;
import java.util.Scanner;
public class DirectoryDigest {
    // 测试
    public static void main(String args[]) {
        // 获取用户输入的文件目录绝对路径
        System.out.println("请输入文件目录的绝对路径：");
        Scanner s = new Scanner(System.in);
        String path = s.nextLine();
        s.close();
        // 计算文件目录摘要
        try {
            MessageDigest complete = MessageDigest.getInstance("SHA-1");
            dfsFiles(path, complete);
            byte[] sha1 = complete.digest();
            String result = "";
            for (byte b : sha1) {
                result += Integer.toString(b & 0xFF, 16);
            }
            System.out.println("文件目录的hash为：\n" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 深度遍历文件夹，获取文件字节输入流
    private static void dfsFiles(String path, MessageDigest complete) throws Exception {
        // 获取目录下的文件和文件夹组成的数组
        File dir = new File(path);
        File[] fs = dir.listFiles();
        // 对fs按照字典序排序（重写比较器）
        Arrays.sort(fs, new Comparator<File>() {
            @Override
            public int compare(File f1, File f2) {
                return f1.getName().compareTo(f2.getName());
            }
        });
        // 遍历数组，若为文件则将其加入文件字节输入流，若为文件夹则递归遍历
        for (File f : fs) {
            if (f.isFile()) {
                SHA1Checksum(new FileInputStream(f), complete);
            } else if (f.isDirectory()) {
                dfsFiles(f.getPath(), complete);
            }
        }
    }

    // 更新hash
    private static void SHA1Checksum(FileInputStream is, MessageDigest complete) throws Exception {
        byte[] buffer = new byte[1024];
        int num = 0;
        while (num != -1) {
            num = is.read(buffer);
            if (num > 0)
                complete.update(buffer, 0, num);
        }
        is.close();
    }
}