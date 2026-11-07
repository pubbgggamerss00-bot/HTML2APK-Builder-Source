package g5;

import g5.f;
import kotlin.jvm.internal.j;
import p5.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a implements f.b {
    public final f.c<?> s;

    public a(f.c<?> cVar) {
        this.s = cVar;
    }

    @Override // g5.f
    public f b(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    @Override // g5.f
    public final f e(f fVar) {
        return f.b.a.c(this, fVar);
    }

    @Override // g5.f.b
    public final f.c<?> getKey() {
        return this.s;
    }

    @Override // g5.f
    public final <R> R s(R r5, p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) f.b.a.a(this, r5, pVar);
    }

    @Override // g5.f
    public <E extends f.b> E t(f.c<E> cVar) {
        j.e("key", cVar);
        if (j.a(getKey(), cVar)) {
            return this;
        }
        return null;
    }
}
