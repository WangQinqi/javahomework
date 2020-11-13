import java.util.ArrayList;
public class SortArrList {
    // 测试函数
    public static void main(String args[]) {
        // 构造list
        ArrayList<Number> arrList = new ArrayList<>();
        arrList.add(3.4);
        arrList.add(2.1);
        arrList.add(5);
        arrList.add(3.6);
        arrList.add(8.1);
        arrList.add(4.16);
        arrList.add(2.03);
        arrList.add(6.1);
        // 打印原list
        System.out.println("原list为：");
        printList(arrList);
        // 排序
        sort(arrList);
        // 打印排序后的list
        System.out.println("\n降序排序后的list为：");
        printList(arrList);
    }

    // 排序函数
    public static void sort(ArrayList<Number> list) {
        // 冒泡排序的思想，每次遍历将当前没确定位置的元素中最大的交换到最前面，逐位确定元素后得到list的降序排列
        for (int i = 0; i < list.size() - 1; i++) {
            double max = Double.MIN_VALUE;  // 记录最大值
            int index = i;  // 记录最大值的位置
            for (int j = i; j < list.size(); j++) {
                double curr = list.get(j).doubleValue();
                if (curr > max) {   // 更新最大值和位置
                    max = curr;
                    index = j;
                }
            }
            if (i != index) // 如果最大值不在最前面则与最前面的交换
                swap(list, i, index);
        }
    }

    // 交换list中指定两元素
    private static void swap(ArrayList<Number> list, int firstIndex, int maxIndex) {
        Number n = list.get(firstIndex);
        list.set(firstIndex, list.get(maxIndex));
        list.set(maxIndex, n);
    }

    // 打印lsit
    public static void printList(ArrayList<Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
    }
}