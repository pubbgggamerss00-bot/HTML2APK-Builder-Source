package kc;

/* loaded from: classes2.dex */
public final class g0 extends c0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f16289g;

    public g0(e eVar) {
        this.f16289g = eVar;
    }

    @Override // kc.c0
    public final void b() {
        synchronized (this.f16289g.f16274f) {
            try {
                if (this.f16289g.f16280l.get() > 0 && this.f16289g.f16280l.decrementAndGet() > 0) {
                    this.f16289g.f16270b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                e eVar = this.f16289g;
                if (eVar.f16282n != null) {
                    eVar.f16270b.b("Unbind from service.", new Object[0]);
                    e eVar2 = this.f16289g;
                    eVar2.f16269a.unbindService(eVar2.f16281m);
                    e eVar3 = this.f16289g;
                    eVar3.f16275g = false;
                    eVar3.f16282n = null;
                    eVar3.f16281m = null;
                }
                this.f16289g.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
