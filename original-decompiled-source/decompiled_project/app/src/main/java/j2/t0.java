package j2;

import android.content.Context;

/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f14899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f14900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, u0 u0Var) {
        super(1);
        this.f14899a = context;
        this.f14900b = u0Var;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        Context context = this.f14899a;
        Context applicationContext = context.getApplicationContext();
        u0 u0Var = this.f14900b;
        applicationContext.registerComponentCallbacks(u0Var);
        return new s0(context, u0Var);
    }
}
