package q3;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b0 extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Bundle f14121w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Activity f14122x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d0 f14123y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, Bundle bundle, Activity activity) {
        super(d0Var.s, true);
        this.f14123y = d0Var;
        this.f14121w = bundle;
        this.f14122x = activity;
    }

    @Override // q3.a0
    public final void a() {
        Bundle bundle;
        if (this.f14121w != null) {
            bundle = new Bundle();
            if (this.f14121w.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f14121w.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        f fVar = this.f14123y.s.h;
        com.google.android.gms.common.internal.l.f(fVar);
        fVar.T1(new k3.b(this.f14122x), bundle, this.f14117t);
    }
}
