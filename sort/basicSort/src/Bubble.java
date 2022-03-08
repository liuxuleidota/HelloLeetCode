public class Bubble extends Example {
    public static void sort(Comparable[] a) throws Exception {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (less(a[j + 1], a[j])) {
                    exch(a, j, j + 1);
                }
            }
        }

        if (!isSorted(a)) {
            show(a);
            throw new Exception("[lxl] sort failed");
        }
    }

    public static void staticMethod() {
        System.out.println("1静态方法");
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
