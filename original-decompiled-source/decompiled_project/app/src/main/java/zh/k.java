package zh;

import c9.z0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements eh.p {
    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        kh.c clazz = (kh.c) obj;
        List types = (List) obj2;
        r.e(clazz, "clazz");
        r.e(types, "types");
        ArrayList arrayListD = n.d(ei.c.f8743a, types, true);
        r.b(arrayListD);
        return n.a(clazz, arrayListD, new z0(types, 2));
    }
}
