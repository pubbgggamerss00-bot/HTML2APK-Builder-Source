package f9;

import kotlinx.serialization.SealedClassSerializer;

/* loaded from: classes.dex */
public final /* synthetic */ class cd implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9248b;

    public /* synthetic */ cd(Object obj, int i10) {
        this.f9247a = i10;
        this.f9248b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f9247a) {
            case 0:
                fg fgVar = (fg) this.f9248b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                sh.z0 z0Var = fgVar.H0;
                z0Var.getClass();
                z0Var.j(null, bool);
                return pg.f0.f21461a;
            default:
                return SealedClassSerializer.descriptor_delegate$lambda$3$lambda$2((SealedClassSerializer) this.f9248b, (bi.a) obj);
        }
    }
}
