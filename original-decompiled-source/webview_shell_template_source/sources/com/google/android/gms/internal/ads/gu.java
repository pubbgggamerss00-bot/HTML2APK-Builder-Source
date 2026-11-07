package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gu implements zzaa {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5159a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zza f5161c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f5162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f5163e;

    public gu(boolean z6, zza zzaVar, HashMap map, Map map2) {
        this.f5160b = z6;
        this.f5161c = zzaVar;
        this.f5162d = map;
        this.f5163e = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z6) {
        if (this.f5159a) {
            return;
        }
        zza zzaVar = this.f5161c;
        if (z6 && this.f5160b) {
            ((on0) zzaVar).O();
        }
        this.f5159a = true;
        String str = (String) this.f5163e.get("event_id");
        Boolean boolValueOf = Boolean.valueOf(z6);
        HashMap map = this.f5162d;
        map.put(str, boolValueOf);
        ((lw) zzaVar).G("openIntentAsync", map);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i6) {
    }
}
