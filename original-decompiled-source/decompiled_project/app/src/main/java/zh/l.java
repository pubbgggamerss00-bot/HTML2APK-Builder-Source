package zh;

import c9.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements eh.p {
    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        kh.c clazz = (kh.c) obj;
        List types = (List) obj2;
        r.e(clazz, "clazz");
        r.e(types, "types");
        ArrayList arrayListD = n.d(ei.c.f8743a, types, true);
        r.b(arrayListD);
        b<? extends Object> bVarA = n.a(clazz, arrayListD, new a1(types, 3));
        if (bVarA != null) {
            return ai.a.d(bVarA);
        }
        return null;
    }
}
