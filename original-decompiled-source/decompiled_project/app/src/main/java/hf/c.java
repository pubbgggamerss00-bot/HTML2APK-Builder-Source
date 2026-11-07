package hf;

import cf.l;

/* loaded from: classes2.dex */
public final class c implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    public final cf.d f13005a;

    /* renamed from: b, reason: collision with root package name */
    public final b f13006b;

    public c(b bVar) {
        this.f13006b = bVar;
        cf.d dVar = new cf.d();
        this.f13005a = dVar;
        dVar.O0(l.f5532w2, l.F);
        bVar.f12997a.f5428f.O0(l.Y1, dVar);
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f13005a;
    }

    public c(cf.d dVar, b bVar) {
        this.f13006b = bVar;
        this.f13005a = dVar;
    }
}
