package ic;

/* loaded from: classes2.dex */
public final class l extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f14452b;

    public l(q qVar) {
        this.f14452b = qVar;
    }

    @Override // ic.h
    public final void a() {
        synchronized (this.f14452b.f14463f) {
            try {
                if (this.f14452b.f14468k.get() > 0 && this.f14452b.f14468k.decrementAndGet() > 0) {
                    this.f14452b.f14459b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                q qVar = this.f14452b;
                if (qVar.f14470m != null) {
                    qVar.f14459b.a("Unbind from service.", new Object[0]);
                    q qVar2 = this.f14452b;
                    qVar2.f14458a.unbindService(qVar2.f14469l);
                    q qVar3 = this.f14452b;
                    qVar3.f14464g = false;
                    qVar3.f14470m = null;
                    qVar3.f14469l = null;
                }
                this.f14452b.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
