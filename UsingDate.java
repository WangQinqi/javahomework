import java.util.Date;
public class UsingDate {
    public static void main(String args[]) {
        long time = 10000;  // 初始化代表流逝时间的变量
        Date d = new Date();    // 创建Date对象
        for (int i = 0; i < 8; i++) {   // 循环更新流逝时间
            d.setTime(time);    // 给Date设置流逝时间
            System.out.println("流逝时间" + time + "，日期为: " + d.toString());    // 用toString()方法打印流逝后的时间
            time *= 10;    // 迭代更新流逝时间
        }
    }
}