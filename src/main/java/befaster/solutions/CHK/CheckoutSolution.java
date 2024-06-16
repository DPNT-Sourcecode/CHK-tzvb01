package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int len = skus.length();
        int countA = 0, countB = 0, countC = 0, countD = 0;
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
            } else {
                return -1;
            }
        }

        if (countA > 2) {
            while (countA > 2) {
                total += 130;
                countA -= 3;
            }
        }

        if (countB > 1) {
            while (countB > 1) {
                total += 45;
                countB -= 2;
            }
        }

        total = total + countA * 50 + countB * 30 + countC * 20 + countD * 15;

        return total;
    }
}

