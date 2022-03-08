public class Insertion extends Example {
    public static void sort(Comparable[] a) throws Exception {
        int N = a.length;
        for (int i = 1; i < N; i++) { // 将 a[i] 插入到 a[i-1]、a[i-2]、a[i-3]...之中
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }

        if (!isSorted(a)) {
            show(a);
            throw new Exception("[lxl] sort failed");
        }
    }

    public static void main(String[] args) { // 从标准输入读取字符串，将它们排序并输出
        // String[] a = In.readStrings();
        Double[] a = SortCompare.randomArray(10);
        try {
            sort(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
