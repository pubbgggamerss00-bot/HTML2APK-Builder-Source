package q3;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f14158w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e0 f14159x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f14160y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(e0 e0Var, Object obj, int i6) {
        super(e0Var, true);
        this.f14158w = i6;
        this.f14159x = e0Var;
        this.f14160y = obj;
    }

    @Override // q3.a0
    public final void a() {
        switch (this.f14158w) {
            case 0:
                f fVar = this.f14159x.h;
                com.google.android.gms.common.internal.l.f(fVar);
                fVar.C1((Bundle) this.f14160y, this.s);
                break;
            default:
                f fVar2 = this.f14159x.h;
                com.google.android.gms.common.internal.l.f(fVar2);
                fVar2.g1((c) this.f14160y);
                break;
        }
    }

    @Override // q3.a0
    public void b() {
        switch (this.f14158w) {
            case 1:
                ((c) this.f14160y).r(null);
                break;
        }
    }
}
