package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzac;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class cs0 implements zzac {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3651t;

    public /* synthetic */ cs0(int i6, Object obj) {
        this.s = i6;
        this.f3651t = obj;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzac
    public final void zzg() {
        switch (this.s) {
            case 0:
                ((fl0) this.f3651t).zzb();
                break;
            default:
                ((bt0) this.f3651t).f3272c.zzb();
                break;
        }
    }
}
