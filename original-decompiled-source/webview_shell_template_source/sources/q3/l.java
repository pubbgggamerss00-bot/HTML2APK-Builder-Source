package q3;

import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f14146w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14147x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Bundle f14148y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e0 f14149z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e0 e0Var, String str, String str2, Bundle bundle) {
        super(e0Var, true);
        this.f14149z = e0Var;
        this.f14146w = str;
        this.f14147x = str2;
        this.f14148y = bundle;
    }

    @Override // q3.a0
    public final void a() {
        f fVar = this.f14149z.h;
        com.google.android.gms.common.internal.l.f(fVar);
        fVar.l0(this.f14146w, this.f14148y, this.f14147x);
    }
}
