package n1;

import pg.f0;

/* loaded from: classes.dex */
public final class g implements f3.d {

    /* renamed from: a, reason: collision with root package name */
    public b f18310a = m.f18315a;

    /* renamed from: b, reason: collision with root package name */
    public k f18311b;

    @Override // f3.d
    public final float G0() {
        return this.f18310a.getDensity().G0();
    }

    @Override // f3.d
    public final float getDensity() {
        return this.f18310a.getDensity().getDensity();
    }

    public final k m(eh.l<? super s1.c, f0> lVar) {
        k kVar = new k();
        kVar.f18313a = lVar;
        this.f18311b = kVar;
        return kVar;
    }
}
