package q3;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f14143w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f14144x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f14145y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(e0 e0Var, Object obj, int i6) {
        super(e0Var, true);
        this.f14143w = i6;
        this.f14144x = e0Var;
        this.f14145y = obj;
    }

    @Override // q3.a0
    public final void a() {
        switch (this.f14143w) {
            case 0:
                f fVar = ((e0) this.f14144x).h;
                com.google.android.gms.common.internal.l.f(fVar);
                fVar.y((Bundle) this.f14145y, this.s);
                break;
            case 1:
                f fVar2 = ((e0) this.f14144x).h;
                com.google.android.gms.common.internal.l.f(fVar2);
                fVar2.M1((String) this.f14145y, this.f14117t);
                break;
            case 2:
                f fVar3 = ((e0) this.f14144x).h;
                com.google.android.gms.common.internal.l.f(fVar3);
                fVar3.V1(new k3.b((Exception) this.f14145y), new k3.b(null), new k3.b(null));
                break;
            default:
                f fVar4 = ((d0) this.f14144x).s.h;
                com.google.android.gms.common.internal.l.f(fVar4);
                fVar4.v0(new k3.b((Activity) this.f14145y), this.f14117t);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d0 d0Var, Activity activity) {
        super(d0Var.s, true);
        this.f14143w = 3;
        this.f14144x = d0Var;
        this.f14145y = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e0 e0Var, Exception exc) {
        super(e0Var, false);
        this.f14143w = 2;
        this.f14144x = e0Var;
        this.f14145y = exc;
    }
}
