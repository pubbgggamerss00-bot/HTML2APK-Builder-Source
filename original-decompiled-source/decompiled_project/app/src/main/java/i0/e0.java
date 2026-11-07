package i0;

/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.s implements eh.a<t2.b> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n4 f13265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2.b f13266b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(n4 n4Var, t2.b bVar) {
        super(0);
        this.f13265a = n4Var;
        this.f13266b = bVar;
    }

    @Override // eh.a
    public final t2.b invoke() {
        t2.b bVar;
        n4 n4Var = this.f13265a;
        if (n4Var != null) {
            h1.u<eh.l<x2, pg.f0>> uVar = n4Var.f13450c;
            if (uVar.isEmpty()) {
                bVar = n4Var.f13449b;
            } else {
                x2 x2Var = new x2(n4Var.f13449b);
                int size = uVar.size();
                for (int i10 = 0; i10 < size; i10++) {
                    uVar.get(i10).invoke(x2Var);
                }
                bVar = x2Var.f13677b;
            }
            n4Var.f13449b = bVar;
            if (bVar != null) {
                return bVar;
            }
        }
        return this.f13266b;
    }
}
