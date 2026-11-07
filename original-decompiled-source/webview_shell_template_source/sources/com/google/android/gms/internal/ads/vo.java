package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vo extends p.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wo f9904a;

    public vo(wo woVar) {
        this.f9904a = woVar;
    }

    @Override // p.b
    public final void g(Bundle bundle, int i6) {
        if (((Boolean) zzbe.zzc().a(zn.F4)).booleanValue()) {
            wo woVar = this.f9904a;
            if (woVar.f10238d != null) {
                i70.f5586a.execute(new uo(i6, 0, woVar));
            }
        }
    }
}
