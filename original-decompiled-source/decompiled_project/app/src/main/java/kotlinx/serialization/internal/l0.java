package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bi.f[] f16379a = new bi.f[0];

    public static final Set<String> a(bi.f fVar) {
        kotlin.jvm.internal.r.e(fVar, "<this>");
        if (fVar instanceof f) {
            return ((f) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.e());
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            hashSet.add(fVar.f(i10));
        }
        return hashSet;
    }

    public static final bi.f[] b(List<? extends bi.f> list) {
        bi.f[] fVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (bi.f[]) list.toArray(new bi.f[0])) == null) ? f16379a : fVarArr;
    }

    public static final kh.c<Object> c(kh.j jVar) {
        kh.c<Object> cVarH = jVar.h();
        if (cVarH instanceof kh.c) {
            return cVarH;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + cVarH);
    }

    public static final String d(kh.c<?> cVar) {
        kotlin.jvm.internal.r.e(cVar, "<this>");
        String strE = cVar.e();
        if (strE == null) {
            strE = "<local class name not available>";
        }
        return i8.n.d("Serializer for class '", strE, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }
}
