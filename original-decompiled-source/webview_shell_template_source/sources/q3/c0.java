package q3;

import android.app.Activity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c0 extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Activity f14125w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f14126x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d0 f14127y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, Activity activity, c cVar) {
        super(d0Var.s, true);
        this.f14127y = d0Var;
        this.f14125w = activity;
        this.f14126x = cVar;
    }

    @Override // q3.a0
    public final void a() {
        f fVar = this.f14127y.s.h;
        com.google.android.gms.common.internal.l.f(fVar);
        fVar.k0(new k3.b(this.f14125w), this.f14126x, this.f14117t);
    }
}
