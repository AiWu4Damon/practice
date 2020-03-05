package arithmetic;

/**
 * 插入排序
 * <br/>
 *算法描述
 *
 * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
 * 步骤1: 从第一个元素开始，该元素可以认为已经被排序；
 * 步骤2: 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 步骤3: 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 步骤4: 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 步骤5: 将新元素插入到该位置后；
 * 步骤6: 重复步骤2~5。
 * @author F88886
 * @date 2020/3/5 11:51
 */
public class InsertionSort implements ISort{
    @Override
    public int[] justSort(int[] array) {
        if (array==null || array.length==1){return array;}
        //默认第一个元素是排序完毕的 [0,sortEnd]
        //从第二个元素开始 [sortEnd+1,array.length-1]
        for (int i=1,size=array.length;i<size;i++){
            for (int j=i-1,ele=i;j>=0;j--){
                if (array[ele]<array[j]){
                    int k = array[ele];
                    array[ele]=array[j];
                    array[j]=k;
                    ele=j;
                }else{
                    break;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] a = {1,3,1,123123,121,0,3,1,5,3,2,8,45};
        ISort iSort = new InsertionSort();
        int[] ints = iSort.justSort(a);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
