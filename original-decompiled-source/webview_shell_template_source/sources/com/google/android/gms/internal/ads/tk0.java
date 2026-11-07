package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class tk0 implements om0 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zze f9317t;

    public /* synthetic */ tk0(int i6, zze zzeVar) {
        this.s = i6;
        this.f9317t = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public final void mo3zza(Object obj) {
        switch (this.s) {
            case 0:
                ((sk0) obj).c(this.f9317t);
                break;
            default:
                ((xk0) obj).e(this.f9317t);
                break;
        }
    }
}
