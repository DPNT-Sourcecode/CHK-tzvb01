package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int len = skus.length();
        int aux;
        int[] prices = { 50, 30, 20, 15, 40, 10, 20, 10, 35, 60, 70, 90, 15, 40, 10, 50, 30, 50, 20, 20, 40, 50, 20, 17,
                20, 21 };
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

        if (counter[0] > 4) {// A
            while (counter[0] > 4) {
                total += 200;
                counter[0] -= 5;
            }
        }

        if (counter[0] > 2) {// A
            while (counter[0] > 2) {
                total += 130;
                counter[0] -= 3;
            }
        }

        aux = counter[4];
        if (counter[4] > 1) {// E
            while (counter[1] > 0 && aux > 1) {
                counter[1] -= 1;
                aux -= 2;
            }
        }

        if (counter[1] > 1) {// B
            while (counter[1] > 1) {
                total += 45;
                counter[1] -= 2;
            }
        }

        aux = counter[5];
        if (counter[5] > 2) {// F
            while (counter[5] > 1 && aux > 1) {
                counter[5] -= 1;
                aux -= 3;
            }
        }

        if (counter[7] > 9) { // H
            while (counter[7] > 9) {
                total += 80;
                counter[7] -= 10;
            }
        }

        if (counter[7] > 4) {// H
            while (counter[7] > 4) {
                total += 45;
                counter[7] -= 5;
            }
        }

        if (counter[10] > 1) {// K
            while (counter[10] > 1) {
                total += 120;
                counter[10] -= 2;
            }
        }

        aux = counter[13];
        if (counter[13] > 2) {// N
            while (counter[12] > 0 && aux > 2) {
                counter[12] -= 1;
                aux -= 3;
            }
        }

        if (counter[15] > 4) {// P
            while (counter[15] > 4) {
                total += 200;
                counter[15] -= 5;
            }
        }

        aux = counter[17];
        if (counter[17] > 2) {// N
            while (counter[16] > 0 && aux > 2) {
                counter[16] -= 1;
                aux -= 3;
            }
        }

        if (counter[16] > 2) {// Q
            while (counter[16] > 2) {
                total += 80;
                counter[16] -= 3;
            }
        }

        aux = counter[20];
        if (counter[20] > 3) {// U
            while (counter[20] > 2 && aux > 2) {
                counter[20] -= 1;
                aux -= 4;
            }
        }

        if (counter[21] > 2) { // V
            while (counter[21] > 2) {
                total += 130;
                counter[21] -= 3;
            }
        }

        if (counter[21] > 1) {// V
            while (counter[21] > 1) {
                total += 90;
                counter[21] -= 2;
            }
        }

        if (counter[25] + counter[24] + counter[23] + counter[19] + counter[18] > 2) {
            if (counter[25] > 2) { // Z
                while (counter[25] > 2) {
                    total += 45;
                    counter[25] -= 3;
                }
            }
            if (counter[25] > 1 && counter[24] > 0) { // ZY
                total += 45;
                counter[25] -= 2;
                counter[24] -= 1;
            }
            if (counter[25] > 1 && counter[19] > 0) { // ZT
                total += 45;
                counter[25] -= 2;
                counter[19] -= 1;
            }
            if (counter[25] > 1 && counter[18] > 0) { // ZS
                total += 45;
                counter[25] -= 2;
                counter[18] -= 1;
            }

            if (counter[25] > 0 && counter[24] > 1) { // ZY
                total += 45;
                counter[25] -= 1;
                counter[24] -= 2;
            }
            if (counter[25] > 0 && counter[19] > 1) { // ZT
                total += 45;
                counter[25] -= 1;
                counter[19] -= 2;
            }
            if (counter[25] > 0 && counter[18] > 1) { // ZS
                total += 45;
                counter[25] -= 1;
                counter[18] -= 2;
            }

            while (counter[25] > 0) {
                if (counter[18] > 0 && counter[19] > 0) {// ZST
                    total += 45;
                    counter[25]--;
                    counter[18]--;
                    counter[19]--;
                }
                if (counter[18] > 0 && counter[24] > 0) {// ZSY
                    total += 45;
                    counter[25]--;
                    counter[18]--;
                    counter[24]--;
                }
                if (counter[19] > 0 && counter[24] > 0) {// ZTY
                    total += 45;
                    counter[25]--;
                    counter[19]--;
                    counter[24]--;
                }
            }

            if (counter[18] > 2) { // S
                while (counter[18] > 2) {
                    total += 45;
                    counter[18] -= 3;
                }
            }
            if (counter[19] > 2) { // T
                while (counter[19] > 2) {
                    total += 45;
                    counter[19] -= 3;
                }
            }
            if (counter[24] > 2) { // Y
                while (counter[24] > 2) {
                    total += 45;
                    counter[24] -= 3;
                }
            }

            if (counter[25] > 1 && counter[23] > 0) { // ZX
                total += 45;
                counter[25] -= 2;
                counter[23] -= 1;
            }
            if (counter[25] > 0 && counter[23] > 1) { // ZX
                total += 45;
                counter[25] -= 1;
                counter[23] -= 2;
            }

            if (counter[18] > 1 && counter[19] > 0) { // ST
                total += 45;
                counter[18] -= 2;
                counter[19] -= 1;
            }
            if (counter[18] > 0 && counter[19] > 1) { // ST
                total += 45;
                counter[18] -= 1;
                counter[19] -= 2;
            }

            if (counter[18] > 1 && counter[24] > 0) { // SY
                total += 45;
                counter[18] -= 2;
                counter[24] -= 1;
            }
            if (counter[18] > 0 && counter[24] > 1) { // SY
                total += 45;
                counter[18] -= 1;
                counter[24] -= 2;
            }

            if (counter[19] > 1 && counter[24] > 0) { // TY
                total += 45;
                counter[19] -= 2;
                counter[24] -= 1;
            }
            if (counter[19] > 0 && counter[24] > 1) { // TY
                total += 45;
                counter[19] -= 1;
                counter[24] -= 2;
            }

            if (counter[23] > 1 && counter[18] > 0) { // XS
                total += 45;
                counter[23] -= 2;
                counter[18] -= 1;
            }
            if (counter[23] > 0 && counter[18] > 1) { // XS
                total += 45;
                counter[23] -= 1;
                counter[18] -= 2;
            }

            if (counter[23] > 1 && counter[19] > 0) { // XT
                total += 45;
                counter[23] -= 2;
                counter[19] -= 1;
            }
            if (counter[23] > 0 && counter[19] > 1) { // XT
                total += 45;
                counter[23] -= 1;
                counter[19] -= 2;
            }

            if (counter[23] > 1 && counter[24] > 0) { // XY
                total += 45;
                counter[23] -= 2;
                counter[24] -= 1;
            }
            if (counter[23] > 0 && counter[24] > 1) { // XY
                total += 45;
                counter[23] -= 1;
                counter[24] -= 2;
            }

            while (counter[23] > 0) {
                if (counter[18] > 0 && counter[19] > 0) {// XST
                    total += 45;
                    counter[23]--;
                    counter[18]--;
                    counter[19]--;
                }
                if (counter[18] > 0 && counter[24] > 0) {// XSY
                    total += 45;
                    counter[23]--;
                    counter[18]--;
                    counter[24]--;
                }
                if (counter[19] > 0 && counter[24] > 0) {// XTY
                    total += 45;
                    counter[23]--;
                    counter[19]--;
                    counter[24]--;
                }
            }

            if (counter[23] > 2) { // X
                while (counter[23] > 2) {
                    total += 45;
                    counter[23] -= 3;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            total += counter[i] * prices[i];
        }
        return total;
    }
}
