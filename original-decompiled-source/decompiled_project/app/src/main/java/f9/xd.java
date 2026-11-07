package f9;

import l9.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class xd implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10949b;

    public /* synthetic */ xd(Object obj, int i10) {
        this.f10948a = i10;
        this.f10949b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f10948a) {
            case 0:
                x0.n1 n1Var = (x0.n1) this.f10949b;
                n1Var.setValue(Integer.valueOf(((Number) n1Var.getValue()).intValue() + 50));
                return pg.f0.f21461a;
            case 1:
                ((x0.n1) this.f10949b).setValue(Boolean.FALSE);
                return pg.f0.f21461a;
            default:
                f0.b bVar = (f0.b) this.f10949b;
                return Float.valueOf(bVar.f16801b / bVar.f16802c);
        }
    }
}
