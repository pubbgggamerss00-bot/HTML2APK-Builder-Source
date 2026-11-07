package f9;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class x8 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10939b;

    public /* synthetic */ x8(Object obj, int i10) {
        this.f10938a = i10;
        this.f10939b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f10938a;
        Object obj2 = this.f10939b;
        switch (i10) {
            case 0:
                o1.h0 state = (o1.h0) obj;
                kotlin.jvm.internal.r.e(state, "state");
                ((eh.l) obj2).invoke(Boolean.valueOf(state.b()));
                return pg.f0.f21461a;
            case 1:
                h9.b4 b4Var = (h9.b4) obj2;
                h5.i LifecycleResumeEffect = (h5.i) obj;
                kotlin.jvm.internal.r.e(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
                l5.a aVarA = androidx.lifecycle.x0.a(b4Var);
                wh.c cVar = ph.z0.f21632a;
                ph.h.c(aVarA, wh.b.f31563c, null, new h9.x3(b4Var, null), 2);
                return new h9.t3();
            default:
                List it = (List) obj;
                kotlin.jvm.internal.r.e(it, "it");
                ((eh.l) ((x0.n1) obj2).getValue()).invoke(it);
                return pg.f0.f21461a;
        }
    }
}
