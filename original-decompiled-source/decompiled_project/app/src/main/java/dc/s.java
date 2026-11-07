package dc;

/* loaded from: classes2.dex */
public final class s extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f7848b;

    public s(x xVar) {
        this.f7848b = xVar;
    }

    @Override // dc.o
    public final void a() {
        synchronized (this.f7848b.f7859f) {
            try {
                if (this.f7848b.f7864k.get() > 0 && this.f7848b.f7864k.decrementAndGet() > 0) {
                    this.f7848b.f7855b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                x xVar = this.f7848b;
                if (xVar.f7866m != null) {
                    xVar.f7855b.c("Unbind from service.", new Object[0]);
                    x xVar2 = this.f7848b;
                    xVar2.f7854a.unbindService(xVar2.f7865l);
                    x xVar3 = this.f7848b;
                    xVar3.f7860g = false;
                    xVar3.f7866m = null;
                    xVar3.f7865l = null;
                }
                this.f7848b.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
