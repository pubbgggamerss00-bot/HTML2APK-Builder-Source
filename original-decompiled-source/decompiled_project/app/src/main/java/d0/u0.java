package d0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f7280a = new t0();

    public static final List a(int i10, int i11, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return qg.z.f22752a;
        }
        ArrayList arrayListE0 = qg.x.e0(list);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            s0 s0Var = (s0) arrayList.get(i12);
            int index = s0Var.getIndex();
            if (i10 <= index && index <= i11) {
                arrayListE0.add(s0Var);
            }
        }
        qg.t.v(arrayListE0, f7280a);
        return arrayListE0;
    }
}
