import java.util.Scanner;
class reverseInt {
    public static void main(String args[]) {
        System.out.print("请输入一个正整数：");
        Scanner s = new Scanner(System.in);
        reverse(s.nextInt());
    }
    public static void reverse(int number) {
        char[] num_arr = String.valueOf(number).toCharArray();  // 1. 数字转为字符数组
        int l = num_arr.length;
        for (int i = 0; i < l / 2; i++) {                       // 2. 字符数组反向
            char temp = num_arr[i];
            num_arr[i] = num_arr[l - i - 1];
            num_arr[l - i - 1] = temp;
        }
        int num = Integer.parseInt(String.valueOf(num_arr));    // 3. 反向的字符数组转换回数字类型
        System.out.println("反向后的正整数为：" + num);            // 4. 打印
    }  
}