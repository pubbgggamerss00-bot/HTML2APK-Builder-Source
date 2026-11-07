package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vw implements yt {
    public final /* synthetic */ long s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ bx f9951t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ qw f9952u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ cx f9953v;

    public vw(cx cxVar, long j6, bx bxVar, qw qwVar) {
        this.s = j6;
        this.f9951t = bxVar;
        this.f9952u = qwVar;
        this.f9953v = cxVar;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (zzv.zzC().a() - this.s) + " ms.");
        zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f9953v.f3677a) {
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (((AtomicInteger) this.f9951t.f8824u).get() != -1 && ((AtomicInteger) this.f9951t.f8824u).get() != 1) {
                this.f9953v.h = 0;
                qw qwVar = this.f9952u;
                qwVar.M("/log", xt.f10673g);
                qwVar.M("/result", xt.f10680o);
                ((o70) this.f9951t.f8823t).a(this.f9952u);
                this.f9953v.f3683g = this.f9951t;
                zze.zza("Successfully loaded JS Engine.");
                zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
