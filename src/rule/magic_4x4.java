package rule;

public class magic_4x4 extends judgement {
    public static void rule(int[] a) {

        //获取二维数组
        int[][] b = exchange.InOut(a);

        //判断合法
        if (judgement(b, 3))
            return;

        //打印
        exchange.C_Print(b);
        System.exit(0);

    }

    public static boolean circulate(int[] a, int step) {
        for (int j = 0; j < step; j++)
            if (a[j] == a[step])
                return true;
        return false;
    }

    public static void sort(int[] a, int step) {
        for (int i = 1; i <= 16; i++) {
            a[step] = i;
            if (step == 15) {
                rule(a);
            }
            if (circulate(a, step - 1))
                break;
            if (step < 15) {
                sort(a, (step + 1));
            }
        }
    }
}

