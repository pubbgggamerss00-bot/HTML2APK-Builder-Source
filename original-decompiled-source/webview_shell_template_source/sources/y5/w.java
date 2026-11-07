package y5;

import y5.v;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w {
    public static final void a(g5.f fVar, Throwable th) {
        try {
            v vVar = (v) fVar.t(v.a.s);
            if (vVar != null) {
                vVar.j(th);
            } else {
                b0.f(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                b0.a(runtimeException, th);
                th = runtimeException;
            }
            b0.f(fVar, th);
        }
    }
}
