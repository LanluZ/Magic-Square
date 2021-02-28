package rule;

public class magic_2x2 {
    public static void rule(int a[]) {
        /*
        //bug检查
        for (int i = 0; i < 4; i++)
            System.out.print(a[i]);
        System.out.println();
        */

        boolean con = true;
        for (int i = 0, j = 0; i < 4; j++) {
            if (j >= 4) {
                j = 0;
                i++;
            }
            if (i == j || i == 4)
                continue;
            if (a[i] == a[j]) {
                con = false;
                break;
            }
        }

        if (con == true) {
            System.out.println("-----");
            for (int i = 0; i < 4; i++) {
                System.out.print(a[i] + ",");
                if ((i % 2) == 1)
                    System.out.println();
            }
        }
        return;
    }

    public static void sort(int a[], int step) {
        for (int i = 1; i <= 4; i++) {
            a[step] = i;
            if (step == 3) {
                rule(a);
            }
            if (step < 3) {
                sort(a, (step + 1));
                continue;
            }
        }
    }
}
