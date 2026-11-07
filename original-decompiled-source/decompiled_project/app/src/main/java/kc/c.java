package kc;

/* loaded from: classes2.dex */
public final class c extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f16264g;

    public c(d dVar) {
        this.f16264g = dVar;
    }

    @Override // kc.c0
    public final void b() {
        e eVar = this.f16264g.f16266a;
        eVar.f16270b.b("unlinkToDeath", new Object[0]);
        eVar.f16282n.asBinder().unlinkToDeath(eVar.f16279k, 0);
        eVar.f16282n = null;
        eVar.f16275g = false;
    }
}
