package y5;

import g5.f;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o1 implements f.b, f.c<o1> {
    public static final o1 s = new o1();

    @Override // g5.f
    public final g5.f b(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    @Override // g5.f
    public final g5.f e(g5.f fVar) {
        return f.b.a.c(this, fVar);
    }

    @Override // g5.f
    public final <R> R s(R r5, p5.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) f.b.a.a(this, r5, pVar);
    }

    @Override // g5.f
    public final <E extends f.b> E t(f.c<E> cVar) {
        kotlin.jvm.internal.j.e("key", cVar);
        if (kotlin.jvm.internal.j.a(this, cVar)) {
            return this;
        }
        return null;
    }

    @Override // g5.f.b
    public final f.c<?> getKey() {
        return this;
    }
}
