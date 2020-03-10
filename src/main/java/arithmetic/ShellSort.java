package arithmetic;

/**
 * 希尔排序
 * <br/>
 * 算法描述
 * <p>
 *     我们来看下希尔排序的基本步骤，在此我们选择增量gap=length/2，缩小增量继续以gap = gap/2的方式，这种增量选择我们可以用一个序列来表示，{n/2,(n/2)/2…1}，称为增量序列。希尔排序的增量序列的选择与证明是个数学难题，我们选择的这个增量序列是比较常用的，也是希尔建议的增量，称为希尔增量，但其实这个增量序列不是最优的。此处我们做示例使用希尔增量。
 * <p>
 *     先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述：
 * 步骤1：选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 * 步骤2：按增量序列个数k，对序列进行k 趟排序；
 * 步骤3：每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 *
 * @author F88886
 * @date 2020/3/6 17:12
 */
public class ShellSort implements ISort {

    @Override
    public int[] justSort(int[] array) {
//        if (array==null || array.length==1){return array;}
//        int step = 4,size = array.length;
//        while (step > 0) {
//            for (int i=0;i<step;i++){
//
//            }
//        }
        return null;
    }
}
