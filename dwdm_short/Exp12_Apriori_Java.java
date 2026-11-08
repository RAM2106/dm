// Exp 12: Apriori in Java (frequent 1-itemsets and 2-itemsets)
public class Exp12_Apriori_Java {
    public static void main(String[] args) {
        int[][] d = {{1,1,0,1},{1,1,1,0},{1,0,1,1},{0,1,1,1}};
        String[] it = {"Milk","Bread","Coffee","Juice"};
        int min = 2;

        System.out.println("Frequent 1-itemsets:");
        for (int j = 0; j < 4; j++) {
            int c = 0;
            for (int[] r : d) c += r[j];
            if (c >= min) System.out.println(it[j] + " : " + c);
        }

        System.out.println("Frequent 2-itemsets:");
        for (int j = 0; j < 4; j++)
            for (int k = j + 1; k < 4; k++) {
                int c = 0;
                for (int[] r : d) if (r[j] == 1 && r[k] == 1) c++;
                if (c >= min) System.out.println(it[j] + "," + it[k] + " : " + c);
            }
    }
}
