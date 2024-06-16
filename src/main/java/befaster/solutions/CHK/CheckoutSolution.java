package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int len = skus.length();
        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0, countF = 0, aux;
        int total = 0;
        for (int i = 0; i < len; i++) {
            if (skus.charAt(i) == 'A') {
                countA++;
            } else if (skus.charAt(i) == 'B') {
                countB++;
            } else if (skus.charAt(i) == 'C') {
                countC++;
            } else if (skus.charAt(i) == 'D') {
                countD++;
            } else if (skus.charAt(i) == 'E') {
                countE++;
            } else if (skus.charAt(i) == 'F') {
                countF++;
            } else {
                return -1;
            }
        }

        if (countA > 4) {
            while (countA > 4) {
                total += 200;
                countA -= 5;
            }
        }

        if (countA > 2) {
            while (countA > 2) {
                total += 130;
                countA -= 3;
            }
        }
        aux = countE;
        if (countE > 1) {
            while (countB > 0 && aux > 1) {
                countB -= 1;
                aux -= 2;
            }
        }

        if (countB > 1) {
            while (countB > 1) {
                total += 45;
                countB -= 2;
            }
        }

        aux = countF;
        if (countF > 2) {
            while (countF > 1 && aux > 1) {
                countF -= 1;
                aux -= 3;
            }
        }

        total = total + countA * 50 + countB * 30 + countC * 20 + countD * 15 + countE * 40 + countF * 10;

        return total;
    }
}




