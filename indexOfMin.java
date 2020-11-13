import java.util.Scanner;
class indexOfMin {
    public static void main(String args[]) {
        System.out.print("请依序输入10个数字：");
        Scanner s = new Scanner(System.in);
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {                                            // 根据用户输入初始化数组
            array[i] = s.nextDouble();
        }
        System.out.println("最小数字的下标为：" + indexOfSmallestElement(array));    // 输出
    }
    public static int indexOfSmallestElement(double[] array) {
        double min = Double.MAX_VALUE;
        int min_index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {                                                 // 不断更新最小值和索引
                min = array[i];
                min_index = i;
            }
        }
        return min_index;
    }
}