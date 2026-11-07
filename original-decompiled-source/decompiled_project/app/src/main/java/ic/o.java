package ic;

/* loaded from: classes2.dex */
public final class o extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f14455b;

    public o(p pVar) {
        this.f14455b = pVar;
    }

    @Override // ic.h
    public final void a() {
        q qVar = this.f14455b.f14456a;
        qVar.f14459b.a("unlinkToDeath", new Object[0]);
        qVar.f14470m.asBinder().unlinkToDeath(qVar.f14467j, 0);
        qVar.f14470m = null;
        qVar.f14464g = false;
    }
}
