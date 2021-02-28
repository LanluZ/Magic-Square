package rule;

public class magic_3x3 {
    public static void rule(int a[]) {
        /*
        //bug检查
        for(int i = 0; i < 9; i++)
            System.out.print(a[i]);
        System.out.println();
        */

        for (int i = 0; i < 3; i++) {
            if (a[0 + i * 3] + a[1 + i * 3] + a[2 + i * 3] != 15 ||
                    a[0 + i] + a[3 + i] + a[6 + i] != 15 ||
                    a[0] + a[4] + a[8] != 15 ||
                    a[2] + a[4] + a[6] != 15)
                return;
        }
        boolean con = true;
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
        }

        if (con == true) {
            System.out.println("-----");
            for (int i = 0; i < 9; i++) {
                System.out.print(a[i] + ",");
                if ((i % 3) == 2)
                    System.out.println();
            }
        }
        return;
    }

    public static void sort(int a[], int step) {
        for (int i = 1; i <= 9; i++) {
            a[step] = i;
            if (step == 8) {
                rule(a);
            }
            if (step < 8) {
                sort(a, (step + 1));
                continue;
            }
        }
    }
}
