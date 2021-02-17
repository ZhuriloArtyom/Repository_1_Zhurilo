import java.sql.Array;

public class Array_Actions_impl implements Array_Actions{
//    private New_Array;
    @Override
    public void Add(int index, int element, int[] Arr) {
        Arr[index] = element;
    }

    @Override
    public int View(int index, int[] Arr) {
        return Arr[index];
    }
}
