package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f71 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4515a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f4516b;

    public f71(Context context, Intent intent) {
        this.f4515a = context;
        this.f4516b = intent;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) zzbe.zzc().a(zn.Gc)).booleanValue()) {
            return bs1.m(new g71(0, null));
        }
        boolean z6 = false;
        try {
            if (this.f4516b.resolveActivity(this.f4515a.getPackageManager()) != null) {
                zze.zza("HSDP intent is supported");
                z6 = true;
            }
        } catch (Exception e6) {
            zzv.zzp().h("HsdpMigrationSignal.isHsdpMigrationSupported", e6);
        }
        return bs1.m(new g71(0, Boolean.valueOf(z6)));
    }
}
