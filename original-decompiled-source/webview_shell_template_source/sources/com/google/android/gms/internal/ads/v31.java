package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v31 implements zr1, ve, mi1, InitializationCompleteCallback, om0, zzn, ri0, zzg, v3.d, bm1, em1, eq0, z {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f9702t;

    public /* synthetic */ v31(int i6, Object obj) {
        this.s = i6;
        this.f9702t = obj;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo2a(Object obj) {
        switch (this.s) {
            case 1:
                ((fj0) this.f9702t).f4698f.i(true);
                break;
            default:
                o50.f7603l.remove((c5.a) this.f9702t);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.mi1
    public void c(int i6, long j6) {
        ((xh1) this.f9702t).c(i6, System.currentTimeMillis() - j6);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r2v27 ?? I:??[int, boolean, short, byte, char]), method size: 2840
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.ve
    public void e(byte[] r139, byte[] r140) {
        /*
            Method dump skipped, instructions count: 2840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v31.e(byte[], byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.mi1
    public void f(int i6, String str, long j6) {
        ((xh1) this.f9702t).d(i6, System.currentTimeMillis() - j6, null, null, str);
    }

    @Override // com.google.android.gms.internal.ads.bm1
    public /* bridge */ /* synthetic */ Iterator i(cm1 cm1Var, CharSequence charSequence) {
        return new wl1(charSequence, (ml1) this.f9702t);
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        switch (this.s) {
            case 1:
                ((fj0) this.f9702t).f4698f.i(false);
                break;
            default:
                o50.f7603l.remove((c5.a) this.f9702t);
                break;
        }
    }

    @Override // v3.d
    public void k(Exception exc) {
        hi1 hi1Var = (hi1) this.f9702t;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        hi1Var.f5418c.b(2025, -1L, exc);
    }

    public AtomicReference n(String str) {
        synchronized (this) {
            try {
                if (!((HashMap) this.f9702t).containsKey(str)) {
                    ((HashMap) this.f9702t).put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) ((HashMap) this.f9702t).get(str);
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public void onInitializationFailed(String str) {
        try {
            ((uv) this.f9702t).zze(str);
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public void onInitializationSucceeded() {
        try {
            ((uv) this.f9702t).zzf();
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    public JSONObject t(View view) throws JSONException {
        int currentModeType;
        JSONObject jSONObjectA = gh1.a(0, 0, 0, 0);
        UiModeManager uiModeManager = bq.H;
        int i6 = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : ih1.f5768t;
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        try {
            jSONObjectA.put("noOutputDevice", i7 == 0);
            return jSONObjectA;
        } catch (JSONException e6) {
            d0.f("Error with setting output device status", e6);
            return jSONObjectA;
        }
    }

    @Override // com.google.android.gms.internal.ads.ri0
    public zzeb zza() {
        return ((xa0) this.f9702t).zzq();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
        switch (this.s) {
            case 12:
                ((yn0) this.f9702t).i().onAdClicked();
                break;
            default:
                el2 el2Var = (el2) this.f9702t;
                if (el2Var.f4339c1 != null) {
                    el2Var.l0(0, 1);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzc() {
        yn0 yn0Var = (yn0) this.f9702t;
        yn0Var.m().zza();
        yn0Var.p().zza();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public void zzde() {
        wl0 wl0Var = ((ct0) this.f9702t).f3658g;
        synchronized (wl0Var) {
            try {
                if (wl0Var.f10229z) {
                    return;
                }
                ScheduledFuture scheduledFuture = wl0Var.A;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    wl0Var.f10227x = -1L;
                } else {
                    wl0Var.A.cancel(false);
                    wl0Var.f10227x = wl0Var.f10225v - wl0Var.f10224u.b();
                }
                ScheduledFuture scheduledFuture2 = wl0Var.B;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    wl0Var.f10228y = -1L;
                } else {
                    wl0Var.B.cancel(false);
                    wl0Var.f10228y = wl0Var.f10226w - wl0Var.f10224u.b();
                }
                wl0Var.f10229z = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public void zzdf() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        wl0 wl0Var = ((ct0) this.f9702t).f3658g;
        synchronized (wl0Var) {
            try {
                if (wl0Var.f10229z) {
                    if (wl0Var.f10227x > 0 && (scheduledFuture2 = wl0Var.A) != null && scheduledFuture2.isCancelled()) {
                        wl0Var.r0(wl0Var.f10227x);
                    }
                    if (wl0Var.f10228y > 0 && (scheduledFuture = wl0Var.B) != null && scheduledFuture.isCancelled()) {
                        wl0Var.s0(wl0Var.f10228y);
                    }
                    wl0Var.f10229z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ v31(xc2 xc2Var, w wVar, ra2 ra2Var) {
        this.s = 20;
        this.f9702t = wVar;
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public Object mo7zza() {
        return (xj0) this.f9702t;
    }

    public v31() {
        this.s = 5;
        this.f9702t = new HashMap();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zza(View view) {
    }

    @Override // com.google.android.gms.internal.ads.z
    /* renamed from: zza, reason: collision with other method in class */
    public void mo8zza() {
        el2 el2Var = (el2) this.f9702t;
        Surface surface = el2Var.f4339c1;
        if (surface != null) {
            y yVar = el2Var.S0;
            Handler handler = yVar.f10756a;
            if (handler != null) {
                handler.post(new s(yVar, surface, SystemClock.elapsedRealtime()));
            }
            el2Var.f4342f1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.om0
    /* renamed from: zza */
    public void mo3zza(Object obj) {
        switch (this.s) {
            case 8:
                xk0 xk0Var = (xk0) obj;
                String message = ((io0) this.f9702t).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                xk0Var.e(tc1.d(12, message, null));
                break;
            case 14:
                vd1 vd1Var = (vd1) this.f9702t;
                ((be1) obj).f(vd1Var.f9833t);
                break;
            default:
                ((yc2) obj).k((w) this.f9702t);
                break;
        }
    }
}
