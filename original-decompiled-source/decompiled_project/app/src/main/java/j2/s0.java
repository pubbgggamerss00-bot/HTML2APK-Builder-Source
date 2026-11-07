package j2;

import android.content.Context;

/* loaded from: classes.dex */
public final class s0 implements x0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f14891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f14892b;

    public s0(Context context, u0 u0Var) {
        this.f14891a = context;
        this.f14892b = u0Var;
    }

    @Override // x0.k0
    public final void a() {
        this.f14891a.getApplicationContext().unregisterComponentCallbacks(this.f14892b);
    }
}
