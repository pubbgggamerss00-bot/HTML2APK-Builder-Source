package j2;

import android.content.Context;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f14936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f14937b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Context context, x0 x0Var) {
        super(1);
        this.f14936a = context;
        this.f14937b = x0Var;
    }

    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        Context context = this.f14936a;
        Context applicationContext = context.getApplicationContext();
        x0 x0Var = this.f14937b;
        applicationContext.registerComponentCallbacks(x0Var);
        return new v0(context, x0Var);
    }
}
