package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class yh implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10980t;

    public /* synthetic */ yh(int i6, Object obj) {
        this.s = i6;
        this.f10980t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        String strA;
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        long j6;
        long j7;
        long j8;
        long j9;
        switch (this.s) {
            case 0:
                ((ci) this.f10980t).c(3);
                return;
            case 1:
                wo woVar = (wo) this.f10980t;
                Context context = woVar.f10237c;
                if (woVar.f10240f != null || context == null || (strA = p.d.a(context)) == null) {
                    return;
                }
                woVar.f14051a = context.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strA)) {
                    intent.setPackage(strA);
                }
                context.bindService(intent, woVar, 33);
                return;
            case 2:
                z70 z70Var = (z70) this.f10980t;
                f80 f80Var = z70Var.H;
                if (f80Var != null) {
                    if (!z70Var.I) {
                        f80Var.h();
                        z70Var.I = true;
                    }
                    z70Var.H.f();
                    return;
                }
                return;
            case 3:
                ((f80) this.f10980t).c("surfaceDestroyed", new String[0]);
                return;
            case 4:
                z90 z90Var = (z90) this.f10980t;
                String strConcat = "cache:".concat(String.valueOf(zzf.zzf(z90Var.f11226w)));
                try {
                    jLongValue = ((Long) zzbe.zzc().a(zn.K)).longValue() * 1000;
                    jIntValue = ((Integer) zzbe.zzc().a(zn.s)).intValue();
                    zBooleanValue = ((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue();
                } catch (Exception e6) {
                    zzo.zzj("Failed to preload url " + z90Var.f11226w + " Exception: " + e6.getMessage());
                    zzv.zzp().g("VideoStreamExoPlayerCache.preload", e6);
                    z90Var.release();
                    z90Var.j(z90Var.f11226w, strConcat, "error", z90.s("error", e6));
                }
                synchronized (z90Var) {
                    if (zzv.zzC().a() - z90Var.A > jLongValue) {
                        throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                    }
                    if (z90Var.f11227x) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!z90Var.f11228y) {
                        uc2 uc2Var = z90Var.f11225v.A;
                        if (!(uc2Var != null)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jB = uc2Var.B();
                        if (jB > 0) {
                            long jA = z90Var.f11225v.A.A();
                            if (jA != z90Var.B) {
                                boolean z6 = jA > 0;
                                String str = z90Var.f11226w;
                                if (zBooleanValue) {
                                    ja0 ja0Var = z90Var.f11225v;
                                    j9 = (ja0Var.M == null || !ja0Var.M.f3815o) ? ja0Var.E : 0L;
                                } else {
                                    j9 = -1;
                                }
                                j6 = jIntValue;
                                j7 = jB;
                                j8 = jA;
                                zzf.zza.post(new m90(z90Var, str, strConcat, j8, j7, j9, zBooleanValue ? z90Var.f11225v.u() : -1L, zBooleanValue ? z90Var.f11225v.q() : -1L, z6, i80.s.get(), i80.f5598t.get()));
                                z90Var.B = j8;
                            } else {
                                j6 = jIntValue;
                                j7 = jB;
                                j8 = jA;
                            }
                            if (j8 >= j7) {
                                zzf.zza.post(new q90(z90Var, z90Var.f11226w, strConcat, j7));
                            } else if (z90Var.f11225v.E >= j6 && j8 > 0) {
                            }
                        }
                        zzs.zza.postDelayed(new yh(4, z90Var), ((Long) zzbe.zzc().a(zn.L)).longValue());
                        return;
                    }
                    zzv.zzz().s.remove(z90Var.f11229z);
                    return;
                }
            case 5:
                xa0 xa0Var = ((eb0) this.f10980t).s;
                xa0Var.X();
                zzm zzmVarZzL = xa0Var.zzL();
                if (zzmVarZzL != null) {
                    zzmVarZzL.zzz();
                    return;
                }
                return;
            case 6:
                ((mb0) this.f10980t).s0();
                return;
            case 7:
                ((r41) this.f10980t).j(new gw0(3));
                return;
            case 8:
                ((xa0) this.f10980t).destroy();
                return;
            case 9:
                ((np0) this.f10980t).zzq();
                return;
            case 10:
                ((dx0) this.f10980t).a();
                return;
            case 11:
                a41 a41Var = (a41) this.f10980t;
                a41Var.getClass();
                a41Var.f2566f.execute(new x(15, a41Var));
                return;
            case 12:
                ((s41) this.f10980t).f8787d.f7595c.k0(tc1.d(6, null, null));
                return;
            case 13:
                boolean zBooleanValue2 = ((Boolean) zzbe.zzc().a(zn.na)).booleanValue();
                Throwable th = (Throwable) this.f10980t;
                if (zBooleanValue2) {
                    zzv.zzp().i("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    zzv.zzp().g("TopicsSignal.fetchTopicsSignal", th);
                    return;
                }
            case 14:
                ((y91) this.f10980t).f10901d.k0(tc1.d(6, null, null));
                return;
            case 15:
                ((eb1) this.f10980t).f4201w.f4593e.t();
                return;
            default:
                ((z) this.f10980t).mo8zza();
                return;
        }
    }

    public /* synthetic */ yh(c cVar, z zVar) {
        this.s = 16;
        this.f10980t = zVar;
    }
}
