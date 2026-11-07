package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends zzdk {
    public final /* synthetic */ Context s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzay f2345t;

    public b(zzay zzayVar, Context context) {
        this.s = context;
        this.f2345t = zzayVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.f2345t.zzi(this.s, zzeVar.zzb, true, true);
    }
}
