package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.cc;
import com.google.android.gms.internal.ads.ic;
import com.google.android.gms.internal.ads.mc;
import com.google.android.gms.internal.ads.o70;
import com.google.android.gms.internal.ads.s70;
import com.google.android.gms.internal.ads.sb;
import com.google.android.gms.internal.ads.ya;
import com.google.android.gms.internal.ads.zn;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbo {
    private static sb zza;
    private static final Object zzb = new Object();

    public zzbo(Context context) {
        sb sbVar;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            try {
                if (zza == null) {
                    zn.a(context);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.f11500w4)).booleanValue()) {
                        sbVar = zzaz.zzb(context);
                    } else {
                        sbVar = new sb(new ic(new s70(context.getApplicationContext())), new cc(new mc()));
                        sbVar.c();
                    }
                    zza = sbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c5.a zza(String str) {
        o70 o70Var = new o70();
        zza.a(new zzbm(str, null, o70Var));
        return o70Var;
    }

    public final c5.a zzb(int i6, String str, Map map, byte[] bArr) {
        g gVar = new g();
        e eVar = new e(str, gVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        f fVar = new f(i6, str, gVar, eVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, "GET", fVar.zzl(), bArr == null ? null : bArr);
            } catch (ya e6) {
                zzo.zzj(e6.getMessage());
            }
        }
        zza.a(fVar);
        return gVar;
    }
}
