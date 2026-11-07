package f9;

import kotlinx.serialization.internal.ObjectSerializer;

/* loaded from: classes.dex */
public final /* synthetic */ class i7 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9794b;

    public /* synthetic */ i7(Object obj, int i10) {
        this.f9793a = i10;
        this.f9794b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9793a) {
            case 0:
                fg fgVar = (fg) this.f9794b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                sh.z0 z0Var = fgVar.S0;
                z0Var.getClass();
                z0Var.j(null, bool);
                return pg.f0.f21461a;
            default:
                return ObjectSerializer.descriptor_delegate$lambda$1$lambda$0((ObjectSerializer) this.f9794b, (bi.a) obj);
        }
    }
}
