package arithmetic;

/**
 * 选择排序
 * <br/>
 *算法描述
 *
 *     n个记录的直接选择排序可经过n-1趟直接选择排序得到有序结果。具体算法描述如下：
 * 步骤1：初始状态：无序区为R[1…n]，有序区为空；
 * 步骤2：第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1…i-1]和R(i…n）。该趟排序从当前无序区中-选出关键字最小的记录 R[k]，将它与无序区的第1个记录R交换，使R[1…i]和R[i+1…n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；
 * 步骤3：n-1趟结束，数组有序化了
 * @author F88886
 * @date 2020/3/5 11:32
 */
public class SelectionSort implements ISort{
    @Override
    public int[] justSort(int[] array) {
        if (array==null || array.length==1){return array;}
        for (int front=0,size=array.length;front<size-1;front++){
            //最小值
            int min = array[front];
            //最小值的位置索引
            int minIndex = front;
            for (int i=front+1;i<size;i++){
                if (array[i]<array[minIndex]){
                    minIndex = i;
                }
            }
            //如果最小值不是最前面一个 则换位置
            if (minIndex != front) {
                int j = array[minIndex];
                array[minIndex] = array[front];
                array[front] = j;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] a = {3,1,123123,121,0,3,1,5};
        ISort iSort = new SelectionSort();
        int[] ints = iSort.justSort(a);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
