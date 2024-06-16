package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int len = skus.length();
        int aux;
        int[] prices = new int[26];
        int[] counter = new int[26];
        int total = 0;
        for (int i = 0; i < len; i++) {
            if (skus.charAt(i) == 'A') {
                counter[0]++;
            } else if (skus.charAt(i) == 'B') {
                counter[1]++;
            } else if (skus.charAt(i) == 'C') {
                counter[2]++;
            } else if (skus.charAt(i) == 'D') {
                counter[3]++;
            } else if (skus.charAt(i) == 'E') {
                counter[4]++;
            } else if (skus.charAt(i) == 'F') {
                counter[5]++;
            } else if (skus.charAt(i) == 'G') {
                counter[6]++;
            } else if (skus.charAt(i) == 'H') {
                counter[7]++;
            } else if (skus.charAt(i) == 'I') {
                counter[8]++;
            } else if (skus.charAt(i) == 'J') {
                counter[9]++;
            } else if (skus.charAt(i) == 'K') {
                counter[10]++;
            } else if (skus.charAt(i) == 'L') {
                counter[11]++;
            } else if (skus.charAt(i) == 'M') {
                counter[12]++;
            } else if (skus.charAt(i) == 'N') {
                counter[13]++;
            } else if (skus.charAt(i) == 'O') {
                counter[14]++;
            } else if (skus.charAt(i) == 'P') {
                counter[15]++;
            } else if (skus.charAt(i) == 'Q') {
                counter[16]++;
            } else if (skus.charAt(i) == 'R') {
                counter[17]++;
            } else if (skus.charAt(i) == 'S') {
                counter[18]++;
            } else if (skus.charAt(i) == 'T') {
                counter[19]++;
            } else if (skus.charAt(i) == 'U') {
                counter[20]++;
            } else if (skus.charAt(i) == 'V') {
                counter[21]++;
            } else if (skus.charAt(i) == 'W') {
                counter[22]++;
            } else if (skus.charAt(i) == 'X') {
                counter[23]++;
            } else if (skus.charAt(i) == 'Y') {
                counter[24]++;
            } else if (skus.charAt(i) == 'Z') {
                counter[25]++;
            } else {
                return -1;
            }
        }

        if (counter[0] > 4) {
            while (counter[0] > 4) {
                total += 200;
                counter[0] -= 5;
            }
        }

        if (counter[0] > 2) {
            while (counter[0] > 2) {
                total += 130;
                counter[0] -= 3;
            }
        }
        aux = counter[4];
        if (counter[4] > 1) {
            while (counter[1] > 0 && aux > 1) {
                counter[1] -= 1;
                aux -= 2;
            }
        }

        if (counter[1] > 1) {
            while (counter[1] > 1) {
                total += 45;
                counter[1] -= 2;
            }
        }

        aux = counter[5];
        if (counter[5] > 2) {
            while (counter[5] > 1 && aux > 1) {
                counter[5] -= 1;
                aux -= 3;
            }
        }

        for (int i = 0; i < 26; i++) {
            total += counter[i] * prices[i];
        }

        return total;
    }
}
