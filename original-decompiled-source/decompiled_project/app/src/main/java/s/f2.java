package s;

import s.y1;

/* loaded from: classes.dex */
public final class f2 implements x0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1 f23747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1.a f23748b;

    public f2(y1 y1Var, y1.a aVar) {
        this.f23747a = y1Var;
        this.f23748b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.k0
    public final void a() {
        y1 y1Var = this.f23747a;
        y1Var.getClass();
        y1.a.C0268a c0268a = (y1.a.C0268a) this.f23748b.f24014b.getValue();
        if (c0268a != null) {
            y1Var.f24009i.remove(c0268a.f24016a);
        }
    }
}
