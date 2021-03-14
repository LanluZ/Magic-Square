package rule;

public class exchange {
    public static int[][] InOut(int a[]) {
        int b[][];
        switch (a.length) {
            case 9:
                b = new int[3][3];
                for (int i = 0, j = 0, index = 0; i < 3; j++, index++) {
                    if (j == 3) {
                        i++;
                        j = 0;
                    }
                    if (i == 3) break;
                    try {
                        b[i][j] = a[index];
                    } catch (Exception ArrayIndexOutOfBoundsException) {
                        System.out.println("error:index is " + index);
                        System.out.println("error:i is " + i);
                        System.out.println("error:j is " + j);
                        System.exit(0);
                    }
                }
                return b;
            case 16:
                b = new int[4][4];
                for (int i = 0, j = 0, index = 0; i < 4; j++, index++) {
                    if (j == 4) {
                        i++;
                        j = 0;
                    }
                    if (i == 4) break;
                    b[i][j] = a[index];
                }
                return b;
        }
        return null;
    }
}