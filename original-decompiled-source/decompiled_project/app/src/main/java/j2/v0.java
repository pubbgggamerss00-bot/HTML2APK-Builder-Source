package j2;

import android.content.Context;

/* loaded from: classes.dex */
public final class v0 implements x0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f14924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f14925b;

    public v0(Context context, x0 x0Var) {
        this.f14924a = context;
        this.f14925b = x0Var;
    }

    @Override // x0.k0
    public final void a() {
        this.f14924a.getApplicationContext().unregisterComponentCallbacks(this.f14925b);
    }
}
