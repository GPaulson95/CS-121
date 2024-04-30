public class GCD {
    int n1;
    int n2;
    int gcd;
    public GCD(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int findGCDLoop(int n1, int n2) {
        int smallest = Math.min(n1, n2);
        for (int i = 1; i < smallest; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public int findGCDWhileLoop(int n1, int n2) {
        int gcd = 0;
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n1;
    }

    public int findGCDRecursively(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return findGCDRecursively(n2, n1 % n2);
    }

    public int findGCDNegative(int n1, int n2){
        int greatest = Math.max(n1, n2);
        for (int i = 1; i < greatest; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}