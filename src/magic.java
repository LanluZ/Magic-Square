import java.util.Arrays;

class magic {
    public static void rule(int a[]) {
        /*
        for(int i = 0; i < 9; i++)
            System.out.print(a[i]);
        System.out.println();
        */

        for (int i = 0; i < 3; i++) {
            if (((a[0 + i] + a[1 + i] + a[2 + i]) != 15) ||
                    ((a[0 + i] + a[3 + i] + a[6 + i]) != 15) ||
                    ((a[0] + a[4] + a[8] != 15)) ||
                    ((a[0] + a[1] + a[2]) != 15))
                return;
        }
        boolean con = false;
        for (int i = 0, j = 0; i < 9; j++) {
            if (j == 9) {
                j = 0;
                i++;
            }
            if (i == j)
                continue;
            if (a[i] == a[j]) {
                con = true;
                break;
            }
        }
        if (con == false) {
            System.out.println("[");
            for (int i = 0; i < 9; i++) {
                System.out.print(a[i] + ",");
                if ((i % 3) == 0)
                    System.out.println();
            }
        }
        return;
    }

    public static void sort(int a[], int step) {
        //System.out.print(step);
        for (int i = 1; i <= 9; i++) {
            a[step] = i;
            if (step == 8) {
                rule(a);
                return;
            }
            if (step < 8) {
                sort(a, (step + 1));
                //System.out.print("["+step+"]");
                continue;
            }
        }
    }

    public static void main(String args[]) {
        int a[] = new int[9];
        int step = 0;
        sort(a, step);
    }
}
