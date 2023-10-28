package UNITTESTS6;

public class Main {
    public static void main(String[] args) {
        InitArrays initArrays = new InitArrays();
        int[] l1 = initArrays.getList1();
        int[] l2 = initArrays.getList2();
        System.out.println(printResult(l1, l2));

    }

    public static String printResult(int[] l1, int[] l2) {
        String result = new CompareResult(new ArrayAverage(l1).arrayAverage(),
                new ArrayAverage(l2).arrayAverage()).compareResult();
        return result;
    }
}
