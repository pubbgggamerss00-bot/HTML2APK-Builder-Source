package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ig0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5746a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f5747b;

    /* renamed from: c, reason: collision with root package name */
    public final w92 f5748c;

    public ig0(w92 w92Var, w92 w92Var2) {
        this.f5746a = 3;
        this.f5748c = w92Var;
        this.f5747b = w92Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f5746a) {
            case 0:
                return new hg0(((oc0) this.f5747b).a(), (xh) this.f5748c.zzb());
            case 1:
                return new hj0((i3.a) this.f5747b.zzb(), (v60) this.f5748c.zzb());
            case 2:
                return new zzb((Context) this.f5747b.zzb(), (r50) this.f5748c.zzb(), null);
            default:
                return new kn0((bm0) this.f5748c.zzb(), (Executor) this.f5747b.zzb());
        }
    }

    public /* synthetic */ ig0(ca2 ca2Var, w92 w92Var, int i6) {
        this.f5746a = i6;
        this.f5747b = ca2Var;
        this.f5748c = w92Var;
    }
}
