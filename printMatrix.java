import java.util.Scanner;
class printMatrix {
    public static void main(String args[]) {
        System.out.print("Enter n: ");
        Scanner s = new Scanner(System.in);
        printMatrix(s.nextInt());
    }
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {                   // 打印每一行的内容
                int num = (int)Math.round(Math.random());   // 随机生成0或1
                System.out.print(num + " ");
            }
            System.out.println();                           // 每行的最后打印换行
        }
    }
}