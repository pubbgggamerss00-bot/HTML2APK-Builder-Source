package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.JsonWriter;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ku0 implements AppEventListener, yl0, zza, pk0, al0, bl0, jl0, rk0, be1 {
    public final List s;

    /* renamed from: t, reason: collision with root package name */
    public final ju0 f6491t;

    /* renamed from: u, reason: collision with root package name */
    public long f6492u;

    public ku0(ju0 ju0Var, hc0 hc0Var) {
        this.f6491t = ju0Var;
        this.s = Collections.singletonList(hc0Var);
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void a(Context context) throws IOException {
        w(bl0.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void c(yd1 yd1Var, String str, Throwable th) throws IOException {
        w(xd1.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void e(Context context) throws IOException {
        w(bl0.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void f(String str) throws IOException {
        w(xd1.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final void i(Context context) throws IOException {
        w(bl0.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void j(yd1 yd1Var, String str) throws IOException {
        w(xd1.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void k(r30 r30Var) throws IOException {
        this.f6492u = zzv.zzC().b();
        w(yl0.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.rk0
    public final void k0(zze zzeVar) throws IOException {
        w(rk0.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.be1
    public final void n(yd1 yd1Var, String str) throws IOException {
        w(xd1.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() throws IOException {
        w(zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) throws IOException {
        w(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final void t() throws IOException {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (zzv.zzC().b() - this.f6492u));
        w(jl0.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void v(y30 y30Var, String str, String str2) throws IOException {
        w(pk0.class, "onRewarded", y30Var, str, str2);
    }

    public final void w(Class cls, String str, Object... objArr) throws IOException {
        String simpleName = cls.getSimpleName();
        List list = this.s;
        String strConcat = "Event-".concat(simpleName);
        ju0 ju0Var = this.f6491t;
        ju0Var.getClass();
        if (((Boolean) tp.f9357a.c()).booleanValue()) {
            long jA = ju0Var.f6165a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(jA);
                jsonWriter.name("source").value(strConcat);
                jsonWriter.name("event").value(str);
                jsonWriter.name("components").beginArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jsonWriter.value(it.next().toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i6 = 0; i6 < length; i6++) {
                    Object obj = objArr[i6];
                    jsonWriter.value(obj != null ? obj.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e6) {
                zzo.zzh("unable to log", e6);
            }
            zzo.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zza() throws IOException {
        w(pk0.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzb() throws IOException {
        w(pk0.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzc() throws IOException {
        w(pk0.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zze() throws IOException {
        w(pk0.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.pk0
    public final void zzf() throws IOException {
        w(pk0.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final void zzr() throws IOException {
        w(al0.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void b0(ac1 ac1Var) {
    }
}
