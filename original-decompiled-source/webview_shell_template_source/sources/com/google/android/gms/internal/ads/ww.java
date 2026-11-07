package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ww implements yt {
    public final /* synthetic */ qw s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzby f10284t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ cx f10285u;

    public ww(cx cxVar, qw qwVar, zzby zzbyVar) {
        this.s = qwVar;
        this.f10284t = zzbyVar;
        this.f10285u = cxVar;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final /* bridge */ /* synthetic */ void d(Object obj, Map map) {
        zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.f10285u.f3677a) {
            try {
                zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                zzo.zzi("JS Engine is requesting an update");
                if (this.f10285u.h == 0) {
                    zzo.zzi("Starting reload.");
                    cx cxVar = this.f10285u;
                    cxVar.h = 2;
                    cxVar.b();
                }
                this.s.Q("/requestReload", (yt) this.f10284t.zza());
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
