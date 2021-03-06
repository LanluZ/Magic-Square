package rule;

public class magic_4x4 {
    public static void rule(int a[]) {

        //bug检查
        /*
        for(int i = 0; i < 16; i++)
            System.out.print(a[i]+" ");
        System.out.println();
        */

        for (int i = 0; i < 4; i++) {
            if (a[0 + i * 4] + a[1 + i * 4] + a[2 + i * 4] + a[3 + i * 4] != 34 ||
                    a[0 + i] + a[4 + i] + a[8 + i] + a[12 + i] != 15 ||
                    a[0] + a[5] + a[10] + a[15] != 15 ||
                    a[3] + a[6] + a[9] + a[12] != 15)
                return;
        }

        boolean con = true;
        for (int i = 0, j = 0; i < 16; j++) {
            if (j >= 16) {
                j = 0;
                i++;
            }
            if (i == j || i == 16)
                continue;
            if (a[i] == a[j]) {
                con = false;
                break;
            }
        }

        if (con == true) {
            System.out.println("-----");
            for (int i = 0; i < 16; i++) {
                System.out.print(a[i] + ",");
                if ((i % 4) == 3)
                    System.out.println();
            }
        }
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
            if (circulate(a, step-1))
                break;
            if (step < 15) {
                sort(a, (step + 1));
                continue;
            }
        }
    }
}

