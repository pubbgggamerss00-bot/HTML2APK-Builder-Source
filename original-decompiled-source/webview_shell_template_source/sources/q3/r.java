package q3;

import android.app.Activity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f14167w = 1;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f14168x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f14169y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(d0 d0Var, Activity activity) {
        super(d0Var.s, true);
        this.f14169y = d0Var;
        this.f14168x = activity;
    }

    @Override // q3.a0
    public final void a() {
        switch (this.f14167w) {
            case 0:
                f fVar = ((e0) this.f14169y).h;
                com.google.android.gms.common.internal.l.f(fVar);
                fVar.F0((c) this.f14168x);
                break;
            default:
                f fVar2 = ((d0) this.f14169y).s.h;
                com.google.android.gms.common.internal.l.f(fVar2);
                fVar2.x(new k3.b((Activity) this.f14168x), this.f14117t);
                break;
        }
    }

    @Override // q3.a0
    public void b() {
        switch (this.f14167w) {
            case 0:
                ((c) this.f14168x).r(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e0 e0Var, c cVar) {
        super(e0Var, true);
        this.f14169y = e0Var;
        this.f14168x = cVar;
    }
}
