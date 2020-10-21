class cntRandomNum {
    public static void main(String args[]) {
        int[] randomNums = new int[10];
        genetrator(randomNums);
        for (int i = 0; i < randomNums.length; i++)
            System.out.println(i + " 的个数为：" + randomNums[i]);
    }
    public static void genetrator(int[] nums) {
        for (int i = 0; i < 100; i++) {                 // 循环100次生成随机数
            int random = (int)(Math.random() * 10);
            nums[random]++;                             // 在数组中更新随机数的个数               
        }
    }
}