package g5;

import g5.f;
import java.io.Serializable;
import kotlin.jvm.internal.j;
import p5.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g implements f, Serializable {
    public static final g s = new g();

    @Override // g5.f
    public final f b(f.c<?> cVar) {
        j.e("key", cVar);
        return this;
    }

    @Override // g5.f
    public final f e(f fVar) {
        j.e("context", fVar);
        return fVar;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // g5.f
    public final <R> R s(R r5, p<? super R, ? super f.b, ? extends R> pVar) {
        j.e("operation", pVar);
        return r5;
    }

    @Override // g5.f
    public final <E extends f.b> E t(f.c<E> cVar) {
        j.e("key", cVar);
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
