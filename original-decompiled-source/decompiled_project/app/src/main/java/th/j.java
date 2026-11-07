package th;

import pg.f0;

/* loaded from: classes2.dex */
public final class j<T> extends i<T, T> {
    public j(sh.f fVar, tg.h hVar, int i10, rh.a aVar, int i11) {
        super(fVar, (i11 & 2) != 0 ? tg.i.f28768a : hVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? rh.a.f23576a : aVar);
    }

    @Override // th.g
    public final g<T> f(tg.h hVar, int i10, rh.a aVar) {
        return new j(this.f28796d, hVar, i10, aVar);
    }

    @Override // th.g
    public final sh.f<T> g() {
        return (sh.f<T>) this.f28796d;
    }

    @Override // th.i
    public final Object i(sh.g<? super T> gVar, tg.e<? super f0> eVar) {
        Object objB = this.f28796d.b(gVar, eVar);
        return objB == ug.a.f29706a ? objB : f0.f21461a;
    }
}
