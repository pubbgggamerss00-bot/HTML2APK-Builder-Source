package d5;

import d5.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {
    public static final d.a a(Throwable th) {
        kotlin.jvm.internal.j.e("exception", th);
        return new d.a(th);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof d.a) {
            throw ((d.a) obj).s;
        }
    }
}
