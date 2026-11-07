package y5;

import g5.f;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f15330a;

    static {
        String property;
        f0 f0Var;
        int i6 = b6.w.f2050a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            c6.c cVar = i0.f15349a;
            f.b bVar = b6.p.f2047a;
            bVar.getClass();
            f0Var = !(bVar instanceof f0) ? c0.A : (f0) bVar;
        } else {
            f0Var = c0.A;
        }
        f15330a = f0Var;
    }
}
