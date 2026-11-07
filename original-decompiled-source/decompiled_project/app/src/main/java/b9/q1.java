package b9;

import f9.fg;
import kotlinx.serialization.ContextualSerializer;

/* loaded from: classes.dex */
public final /* synthetic */ class q1 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4067b;

    public /* synthetic */ q1(Object obj, int i10) {
        this.f4066a = i10;
        this.f4067b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f4066a) {
            case 0:
                eh.a aVar = (eh.a) this.f4067b;
                i0.f2 KeyboardActions = (i0.f2) obj;
                kotlin.jvm.internal.r.e(KeyboardActions, "$this$KeyboardActions");
                aVar.invoke();
                return pg.f0.f21461a;
            case 1:
                fg fgVar = (fg) this.f4067b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = fgVar.E0;
                z0Var.getClass();
                z0Var.j(null, it);
                return pg.f0.f21461a;
            default:
                return ContextualSerializer.descriptor$lambda$0((ContextualSerializer) this.f4067b, (bi.a) obj);
        }
    }
}
