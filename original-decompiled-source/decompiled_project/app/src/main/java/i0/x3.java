package i0;

import x.o;

/* loaded from: classes.dex */
public final class x3 implements x0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f13678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x.m f13679b;

    public x3(x0.n1 n1Var, x.m mVar) {
        this.f13678a = n1Var;
        this.f13679b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.k0
    public final void a() {
        x0.n1 n1Var = this.f13678a;
        o.b bVar = (o.b) n1Var.getValue();
        if (bVar != null) {
            o.a aVar = new o.a(bVar);
            x.m mVar = this.f13679b;
            if (mVar != null) {
                mVar.a(aVar);
            }
            n1Var.setValue(null);
        }
    }
}
