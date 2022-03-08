public class Selection extends Example {
    public static void sort(Comparable[] a) throws Exception {
        for (int i = 0; i < a.length; i++) {
            int min = i;

            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }

            exch(a, i, min);
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
