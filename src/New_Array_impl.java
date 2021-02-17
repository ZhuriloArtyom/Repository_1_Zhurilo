import java.sql.Array;

public class New_Array_impl implements New_Array{

    private Array[] Ar;

    @Override
    public Array[] create(int length) {
        Array[] Ar = new Array[length];
        return Ar;
    }
}
