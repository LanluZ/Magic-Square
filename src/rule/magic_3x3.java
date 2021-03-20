package rule;

public class magic_3x3 extends judgement {
    public static void rule(int[] a) {

        //获取二维数组
        int[][] b = exchange.InOut(a);

        //判断合法
        if (judgement(b, 2))
            return;

        //打印
        exchange.C_Print(b);
        System.exit(0);
    }

    public static boolean circulate(int[] a, int step) {
        for (int j = 0; j < step; j++)
            //终止(重复)
            if (a[j] == a[step])
                return true;
        return false;
    }

    public static void sort(int[] a, int step) {
        for (int i = 1; i <= 9; i++) {
            a[step] = i;
            if (step == 8) {
                rule(a);
            }
            if (circulate(a, step - 1))
                break;
            if (step < 8) {
                sort(a, (step + 1));
            }
        }
    }
}
