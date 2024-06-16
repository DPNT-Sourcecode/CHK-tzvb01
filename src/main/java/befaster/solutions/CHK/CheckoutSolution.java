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
            }
        }

        return total;
    }
}


