package rule;

public class judgement {
    protected static boolean judgement(int[][] b, int mode) {
        switch (mode) {
            case 2 -> {//3x3
                for (int i = 0; i < 3; i++) {
                    if (
                            b[i][0] + b[i][1] + b[i][2] != 15 ||
                                    b[0][i] + b[1][i] + b[2][i] != 15
                    ) return true;
                }
                return b[0][0] + b[1][1] + b[2][2] != 15 ||
                        b[0][2] + b[1][1] + b[2][0] != 15;
            }
            case 3 -> {//4x4
                for (int i = 0; i < 3; i++) {
                    if (
                            b[i][0] + b[i][1] + b[i][2] + b[i][3] != 34 ||
                                    b[0][i] + b[1][i] + b[2][i] + b[3][i] != 34
                    ) return true;
                }
                if (
                        b[0][0] + b[1][1] + b[2][2] + b[3][3] != 34 ||
                                b[0][2] + b[1][1] + b[2][0] + b[3][0] != 34
                ) return true;
            }
        }
        return false;
    }
}
