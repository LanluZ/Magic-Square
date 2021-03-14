package rule;
import rule.exchange;

public class magic_4x4 {
    public static void rule(int a[]) {

        //bug检查
        /*
        for(int i = 0; i < 16; i++)
            System.out.print(a[i]+" ");
        System.out.println();
        */

        //获取二维数组
        int b[][] = exchange.InOut(a);

        //判断合法
        for (int i = 0; i < 3; i++) {
            if (
                    b[i][0] + b[i][1] + b[i][2] + b[i][3] != 34 ||
                            b[0][i] + b[1][i] + b[2][i] + b[3][i] != 34
            ) return;
        }
        if (
                b[0][0] + b[1][1] + b[2][2] + b[3][3] != 34 ||
                        b[0][2] + b[1][1] + b[2][0] + b[3][0] != 34
        ) return;

        //打印
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(b[i][j] + "\t");
            System.out.println();
        }
        System.out.println("---------");

        return;
    }

    public static boolean circulate(int a[], int step) {
        for (int j = 0; j < step; j++)
            if (a[j] == a[step])
                return true;
        return false;
    }

    public static void sort(int a[], int step) {
        for (int i = 1; i <= 16; i++) {
            a[step] = i;
            if (step == 15) {
                rule(a);
            }
            if (circulate(a, step - 1))
                break;
            if (step < 15) {
                sort(a, (step + 1));
                continue;
            }
        }
    }
}

