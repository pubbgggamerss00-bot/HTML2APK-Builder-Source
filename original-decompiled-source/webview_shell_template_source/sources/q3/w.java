package q3;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Bundle f14183w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f14184x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e0 f14185y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e0 e0Var, Bundle bundle, c cVar) {
        super(e0Var, true);
        this.f14185y = e0Var;
        this.f14183w = bundle;
        this.f14184x = cVar;
    }

    @Override // q3.a0
    public final void a() {
        f fVar = this.f14185y.h;
        com.google.android.gms.common.internal.l.f(fVar);
        fVar.V(this.f14183w, this.f14184x, this.s);
    }

    @Override // q3.a0
    public final void b() {
        this.f14184x.r(null);
    }
}
