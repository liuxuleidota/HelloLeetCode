public class Shell extends Example {
    public static void sort(Comparable[] a) throws Exception {
        int N = a.length;
        int h = 1;

        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }

            h = h / 3;
        }

        if (!isSorted(a)) {
            show(a);
            throw new Exception("[lxl] sort failed");
        }
    }

    public static void main(String[] args) { // 从标准输入读取字符串，将它们排序并输出
        Double[] a = SortCompare.randomArray(10);
        try {
            sort(a);
            show(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
