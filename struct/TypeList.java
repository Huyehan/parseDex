package parsedex.struct;

import java.util.ArrayList;
import java.util.List;

public class TypeList {
    /**
     * struct type_list
     {
     uint size;
     ushort type_idx[size];
     }
     */

    public int size;
    public List<Short> type_idx = new ArrayList<Short>();
}
