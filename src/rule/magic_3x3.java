package rule;

public class magic_3x3 {
    public static void rule(int[] a) {

        //获取二维数组
        int[][] b = exchange.InOut(a);

        //判断合法
        for (int i = 0; i < 3; i++) {
            if (
                    b[i][0] + b[i][1] + b[i][2] != 15 ||
                            b[0][i] + b[1][i] + b[2][i] != 15
            ) return;
        }
        if (
                b[0][0] + b[1][1] + b[2][2] != 15 ||
                        b[0][2] + b[1][1] + b[2][0] != 15
        ) return;

        //bug检查
//        for(int i = 0; i < 9; i++)
//            System.out.print(a[i]+" ");
//        System.out.println();

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
