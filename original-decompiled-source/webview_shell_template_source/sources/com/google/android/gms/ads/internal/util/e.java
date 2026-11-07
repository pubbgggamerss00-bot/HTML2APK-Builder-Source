package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.tb;
import com.google.android.gms.internal.ads.xb;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e implements tb {
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f2358t;

    public e(String str, g gVar) {
        this.s = str;
        this.f2358t = gVar;
    }

    @Override // com.google.android.gms.internal.ads.tb
    public final void a(xb xbVar) {
        zzo.zzj("Failed to load URL: " + this.s + "\n" + xbVar.toString());
        this.f2358t.a(null);
    }
}
