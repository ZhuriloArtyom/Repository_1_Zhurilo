import java.sql.Array;

public class New_Array_impl implements New_Array{

    private Array[] Ar;

    @Override
    public int[] create(int length) {
        int[] Ar = new int[length];
        return Ar;
    }
}
