package dc;

/* loaded from: classes2.dex */
public final class v extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f7851b;

    public v(w wVar) {
        this.f7851b = wVar;
    }

    @Override // dc.o
    public final void a() {
        x xVar = this.f7851b.f7852a;
        xVar.f7855b.c("unlinkToDeath", new Object[0]);
        xVar.f7866m.asBinder().unlinkToDeath(xVar.f7863j, 0);
        xVar.f7866m = null;
        xVar.f7860g = false;
    }
}
