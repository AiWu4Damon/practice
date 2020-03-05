package arithmetic;

/**冒泡排序
 * Bubble Sort
 * <br/>
 *算法描述
 * 步骤1: 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 步骤2: 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 * 步骤3: 针对所有的元素重复以上的步骤，除了最后一个；
 * 步骤4: 重复步骤1~3，直到排序完成
 *
 * @author F88886
 * @date 2020/3/5 10:54
 */
public class BubbleSort implements ISort{


    @Override
    public int[] justSort(int[] array) {
        if (array==null || array.length==1){return array;}
        for (int front=0,size=array.length;front<size-1;front++){
            for (int i=0;i<size;i++){
                // i 是 游标
                if (i+1>=size){break;}
                if (array[i]>array[i+1]){
                    int j = array[i];
                    array[i] = array[i+1];
                    array[i+1] = j;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {3,1};
        ISort iSort = new BubbleSort();
        int[] ints = iSort.justSort(a);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}
