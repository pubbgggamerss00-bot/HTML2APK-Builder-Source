package e5;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class l extends k {
    public static <T> int b(List<? extends T> list) {
        kotlin.jvm.internal.j.e("<this>", list);
        return list.size() - 1;
    }

    public static <T> List<T> c(T... tArr) {
        kotlin.jvm.internal.j.e("elements", tArr);
        if (tArr.length <= 0) {
            return s.s;
        }
        List<T> listAsList = Arrays.asList(tArr);
        kotlin.jvm.internal.j.d("asList(...)", listAsList);
        return listAsList;
    }
}
