package q3;

import android.app.Activity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f14173w = 1;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f14174x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f14175y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(d0 d0Var, Activity activity) {
        super(d0Var.s, true);
        this.f14175y = d0Var;
        this.f14174x = activity;
    }

    @Override // q3.a0
    public final void a() {
        switch (this.f14173w) {
            case 0:
                f fVar = ((e0) this.f14175y).h;
                com.google.android.gms.common.internal.l.f(fVar);
                fVar.q1((c) this.f14174x);
                break;
            default:
                f fVar2 = ((d0) this.f14175y).s.h;
                com.google.android.gms.common.internal.l.f(fVar2);
                fVar2.A(new k3.b((Activity) this.f14174x), this.f14117t);
                break;
        }
    }

    @Override // q3.a0
    public void b() {
        switch (this.f14173w) {
            case 0:
                ((c) this.f14174x).r(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(e0 e0Var, c cVar) {
        super(e0Var, true);
        this.f14175y = e0Var;
        this.f14174x = cVar;
    }
}
