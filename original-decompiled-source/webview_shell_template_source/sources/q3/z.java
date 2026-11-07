package q3;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14190w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14191x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Bundle f14192y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e0 f14193z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, String str, String str2, Bundle bundle) {
        super(e0Var, true);
        this.f14193z = e0Var;
        this.f14190w = str;
        this.f14191x = str2;
        this.f14192y = bundle;
    }

    @Override // q3.a0
    public final void a() {
        long j6 = this.s;
        f fVar = this.f14193z.h;
        com.google.android.gms.common.internal.l.f(fVar);
        fVar.U0(this.f14190w, this.f14191x, this.f14192y, j6);
    }
}
