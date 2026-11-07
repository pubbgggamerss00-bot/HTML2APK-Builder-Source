package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xw implements Runnable {
    public final /* synthetic */ bx s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ qw f10721t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10722u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f10723v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cx f10724w;

    public xw(long j6, qw qwVar, bx bxVar, cx cxVar, ArrayList arrayList) {
        this.s = bxVar;
        this.f10721t = qwVar;
        this.f10722u = arrayList;
        this.f10723v = j6;
        this.f10724w = cxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.f10724w.f3677a) {
            try {
                zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (((AtomicInteger) this.s.f8824u).get() != -1 && ((AtomicInteger) this.s.f8824u).get() != 1) {
                    if (((Boolean) zzbe.zzc().a(zn.B7)).booleanValue()) {
                        this.s.b("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                    } else {
                        this.s.a();
                    }
                    i70.f5591f.execute(new p(1, this.f10721t));
                    String strValueOf = String.valueOf(zzbe.zzc().a(zn.f11365c));
                    int i6 = ((AtomicInteger) this.s.f8824u).get();
                    int i7 = this.f10724w.h;
                    String strConcat = this.f10722u.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.f10722u.get(0)));
                    zze.zza("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + i6 + ". Update status(fullLoadTimeout) is " + i7 + strConcat + " ms. Total latency(fullLoadTimeout) is " + (zzv.zzC().a() - this.f10723v) + " ms at timeout. Rejecting.");
                    zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
