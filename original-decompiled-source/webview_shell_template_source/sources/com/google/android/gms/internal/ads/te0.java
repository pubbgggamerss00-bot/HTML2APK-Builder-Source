package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class te0 implements re0 {

    /* renamed from: a, reason: collision with root package name */
    public final zzg f9237a;

    public te0(zzj zzjVar) {
        this.f9237a = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.re0
    public final void a(HashMap map) {
        this.f9237a.zzu(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
