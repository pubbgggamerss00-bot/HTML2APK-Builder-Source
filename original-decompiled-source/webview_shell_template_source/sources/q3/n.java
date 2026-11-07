package q3;

import android.app.Activity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Activity f14154w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f14155x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f14156y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e0 f14157z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e0 e0Var, Activity activity, String str, String str2) {
        super(e0Var, true);
        this.f14157z = e0Var;
        this.f14154w = activity;
        this.f14155x = str;
        this.f14156y = str2;
    }

    @Override // q3.a0
    public final void a() {
        f fVar = this.f14157z.h;
        com.google.android.gms.common.internal.l.f(fVar);
        k3.b bVar = new k3.b(this.f14154w);
        fVar.A0(this.s, this.f14155x, this.f14156y, bVar);
    }
}
