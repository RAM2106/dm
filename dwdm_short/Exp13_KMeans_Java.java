// Exp 13: K-Means in Java (k=2)
public class Exp13_KMeans_Java {
    public static void main(String[] args) {
        double[][] p = {{1,1},{2,1},{4,3},{5,4},{6,5}};
        double[] c1 = {1,1}, c2 = {5,4};

        for (int it = 0; it < 10; it++) {
            double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
            int n1 = 0, n2 = 0;
            for (double[] q : p) {
                double d1 = Math.hypot(q[0]-c1[0], q[1]-c1[1]);
                double d2 = Math.hypot(q[0]-c2[0], q[1]-c2[1]);
                if (d1 < d2) { x1 += q[0]; y1 += q[1]; n1++; }
                else         { x2 += q[0]; y2 += q[1]; n2++; }
            }
            c1 = new double[]{x1/n1, y1/n1};
            c2 = new double[]{x2/n2, y2/n2};
        }
        System.out.println("C1: " + c1[0] + " " + c1[1]);
        System.out.println("C2: " + c2[0] + " " + c2[1]);
    }
}
