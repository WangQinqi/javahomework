import java.util.Scanner;
import java.text.DecimalFormat;
class matrixDiagonal {
    // 法一：按照题干要求，获取数组并作为参数传入方法sumMajorDiagonal()
    // public static void main(String args[]) {
    //     System.out.println("Enter a 4-by-4 matrix row by row: ");
    //     Scanner s = new Scanner(System.in);
    //     int index = 0;
    //     double sum = 0;
    //     while (index < 4) {
    //         String str = s.nextLine();
    //         String[] strs = str.split(" ");                     // 将每一行输入以空格为分割为数组
    //         double num = Double.valueOf(strs[index]);           // 取每一行主对角线上的数
    //         sum += num;                                         // 累加更新sum和
    //         index++;                                            // 更新行数
    //     }
    //     DecimalFormat df = new DecimalFormat("#.00");           // 定义精度为保留两位小数
    //     System.out.println("Sum of elements in the major diagonal is " + df.format(sum));
    // }

    // 法二：不用获取整个数组
    public static void main(String args[]) {
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        Scanner s = new Scanner(System.in);
        double[][] arr = new double[4][];
        for (int i = 0; i < 4; i++) {                           // 初始化二维数组，保存输入矩阵
            arr[i] = new double[4];
            for (int j = 0; j < 4; j++) {
                arr[i][j] = s.nextDouble();
            }
        }
        DecimalFormat df = new DecimalFormat("#.00");           // 定义精度为保留两位小数
        System.out.println("Sum of elements in the major diagonal is " + df.format(sumMajorDiagonal(arr)));
    }
    public static double sumMajorDiagonal(double[][] a) {
        double sum  = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];                                     // 取当前行主对角线上的元素
        } 
        return sum;
    }
}