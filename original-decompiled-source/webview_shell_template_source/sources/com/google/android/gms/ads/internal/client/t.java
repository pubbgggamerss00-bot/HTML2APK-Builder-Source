package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t extends zzdk {
    public final /* synthetic */ int s;

    public /* synthetic */ t(int i6) {
        this.s = i6;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(zze zzeVar) {
        switch (this.s) {
            case 0:
                OnAdInspectorClosedListener onAdInspectorClosedListener = zzex.zzf().zzj;
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
                    break;
                }
                break;
        }
    }

    private final void i1(zze zzeVar) {
    }
}
