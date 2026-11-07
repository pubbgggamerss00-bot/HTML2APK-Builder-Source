package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.c;
import androidx.work.m;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbq {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void zzb(Context context) {
        try {
            j2.k.c(context.getApplicationContext(), new androidx.work.c(new c.a()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(k3.a aVar) {
        Context context = (Context) k3.b.i1(aVar);
        zzb(context);
        try {
            j2.k kVarB = j2.k.b(context);
            kVarB.getClass();
            kVarB.f13477d.a(new s2.b(kVarB));
            androidx.work.e eVar = new androidx.work.e();
            androidx.work.d dVar = new androidx.work.d();
            dVar.f1764a = androidx.work.l.s;
            dVar.f1769f = -1L;
            dVar.f1770g = -1L;
            new androidx.work.e();
            dVar.f1765b = false;
            dVar.f1766c = false;
            dVar.f1764a = androidx.work.l.f1832t;
            dVar.f1767d = false;
            dVar.f1768e = false;
            dVar.h = eVar;
            dVar.f1769f = -1L;
            dVar.f1770g = -1L;
            m.a aVar2 = new m.a(OfflinePingSender.class);
            aVar2.f1853b.f14288j = dVar;
            aVar2.f1854c.add("offline_ping_sender_work");
            kVarB.a(aVar2.a());
        } catch (IllegalStateException e6) {
            zzo.zzk("Failed to instantiate WorkManager.", e6);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(k3.a aVar, String str, String str2) {
        return zzg(aVar, new zza(str, str2, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(k3.a aVar, zza zzaVar) throws Throwable {
        Context context = (Context) k3.b.i1(aVar);
        zzb(context);
        androidx.work.e eVar = new androidx.work.e();
        androidx.work.d dVar = new androidx.work.d();
        dVar.f1764a = androidx.work.l.s;
        dVar.f1769f = -1L;
        dVar.f1770g = -1L;
        new androidx.work.e();
        dVar.f1765b = false;
        dVar.f1766c = false;
        dVar.f1764a = androidx.work.l.f1832t;
        dVar.f1767d = false;
        dVar.f1768e = false;
        dVar.h = eVar;
        dVar.f1769f = -1L;
        dVar.f1770g = -1L;
        HashMap map = new HashMap();
        map.put("uri", zzaVar.zza);
        map.put("gws_query_id", zzaVar.zzb);
        map.put("image_url", zzaVar.zzc);
        androidx.work.f fVar = new androidx.work.f(map);
        androidx.work.f.c(fVar);
        m.a aVar2 = new m.a(OfflineNotificationPoster.class);
        r2.l lVar = aVar2.f1853b;
        lVar.f14288j = dVar;
        lVar.f14284e = fVar;
        aVar2.f1854c.add("offline_notification_work");
        try {
            j2.k.b(context).a(aVar2.a());
            return true;
        } catch (IllegalStateException e6) {
            zzo.zzk("Failed to instantiate WorkManager.", e6);
            return false;
        }
    }
}
