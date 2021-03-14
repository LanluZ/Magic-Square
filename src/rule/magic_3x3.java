package rule;

import rule.exchange;

public class magic_3x3 {
    public static void rule(int a[]) {
        /*
        //bug检查
        for(int i = 0; i < 9; i++)
            System.out.print(a[i]);
        System.out.println();
        */

        //获取二维数组
        int b[][] = exchange.InOut(a);

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

        /*for (int i = 0; i < 3; i++) {
            if (a[0 + i * 3] + a[1 + i * 3] + a[2 + i * 3] != 15 ||
                    a[0 + i] + a[3 + i] + a[6 + i] != 15 ||
                    a[0] + a[4] + a[8] != 15 ||
                    a[2] + a[4] + a[6] != 15)
                return;
        }*/

        //重复判断
        /*boolean con = true;
        for (int i = 0, j = 0; i < 9; j++) {
            if (j >= 9) {
                j = 0;
                i++;
            }
            if (i == j || i == 9)
                continue;
            if (a[i] == a[j]) {
                con = false;
                break;
            }
        }*/

        //打印
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(b[i][j] + "\t");
            System.out.println();
        }
        System.out.println("---------");

        /*if (con == true) {
            System.out.println("-----");
            for (int i = 0; i < 9; i++) {
                System.out.print(a[i] + ",");
                if ((i % 3) == 2)
                    System.out.println();
            }
        }*/
        return;
    }

    public static boolean circulate(int a[], int step) {
        for (int j = 0; j < step; j++)
            if (a[j] == a[step])
                return true;
        return false;
    }

    public static void sort(int a[], int step) {
        for (int i = 1; i <= 9; i++) {
            a[step] = i;
            if (step == 8) {
                rule(a);
            }
            if (circulate(a, step - 1))
                break;
            if (step < 8) {
                sort(a, (step + 1));
                continue;
            }
        }
    }
}
