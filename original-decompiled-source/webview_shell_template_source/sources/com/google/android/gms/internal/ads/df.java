package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class df implements ff {
    public static df J;
    public final mg B;
    public final eg C;
    public final xj0 D;
    public volatile boolean G;
    public volatile boolean H;
    public final int I;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final wi1 f3890t;

    /* renamed from: u, reason: collision with root package name */
    public final dj1 f3891u;

    /* renamed from: v, reason: collision with root package name */
    public final fj1 f3892v;

    /* renamed from: w, reason: collision with root package name */
    public final yf f3893w;

    /* renamed from: x, reason: collision with root package name */
    public final xh1 f3894x;

    /* renamed from: y, reason: collision with root package name */
    public final Executor f3895y;

    /* renamed from: z, reason: collision with root package name */
    public final f0 f3896z;
    public volatile long E = 0;
    public final Object F = new Object();
    public final CountDownLatch A = new CountDownLatch(1);

    public df(Context context, xh1 xh1Var, wi1 wi1Var, dj1 dj1Var, fj1 fj1Var, yf yfVar, Executor executor, bq bqVar, int i6, mg mgVar, eg egVar, xj0 xj0Var) {
        this.H = false;
        this.s = context;
        this.f3894x = xh1Var;
        this.f3890t = wi1Var;
        this.f3891u = dj1Var;
        this.f3892v = fj1Var;
        this.f3893w = yfVar;
        this.f3895y = executor;
        this.I = i6;
        this.B = mgVar;
        this.C = egVar;
        this.D = xj0Var;
        this.H = false;
        this.f3896z = new f0(bqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8 A[Catch: all -> 0x0098, u52 -> 0x009b, TryCatch #0 {u52 -> 0x009b, blocks: (B:6:0x001d, B:8:0x002b, B:12:0x0031, B:13:0x003f, B:15:0x004d, B:17:0x005b, B:20:0x0068, B:32:0x009e, B:36:0x00b7, B:42:0x00d0, B:43:0x00dd, B:45:0x00e3, B:47:0x00eb, B:48:0x00ee, B:39:0x00c1, B:40:0x00c8, B:23:0x006f, B:25:0x0085, B:49:0x00f8, B:50:0x0105, B:51:0x0112), top: B:58:0x001d, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(df dfVar) {
        String strJ;
        String strI;
        int length;
        boolean zA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zd0 zd0VarE = dfVar.e();
        if (zd0VarE != null) {
            strJ = ((ph) zd0VarE.s).J();
            strI = ((ph) zd0VarE.s).I();
        } else {
            strJ = null;
            strI = null;
        }
        try {
            try {
                bj1 bj1VarC = aa1.c(dfVar.s, dfVar.I, strJ, strI, dfVar.f3894x);
                byte[] bArr = bj1VarC.f3206t;
                if (bArr == null || (length = bArr.length) == 0) {
                    dfVar.f3894x.c(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        e42 e42VarS = g42.s(0, length, bArr);
                        u42 u42Var = u42.f9458b;
                        u62 u62Var = u62.f9474c;
                        nh nhVarB = nh.B(e42VarS, u42.f9459c);
                        if (nhVarB.C().J().isEmpty() || nhVarB.C().I().isEmpty() || nhVarB.D().c().length == 0) {
                            dfVar.f3894x.c(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zd0 zd0VarE2 = dfVar.e();
                            if (zd0VarE2 != null) {
                                ph phVar = (ph) zd0VarE2.s;
                                if (!nhVarB.C().J().equals(phVar.J()) || !nhVarB.C().I().equals(phVar.I())) {
                                }
                            }
                            f0 f0Var = dfVar.f3896z;
                            int i6 = bj1VarC.f3207u;
                            if (!((Boolean) zzbe.zzc().a(zn.f11485u2)).booleanValue()) {
                                zA = dfVar.f3890t.a(nhVarB, f0Var);
                            } else if (i6 == 3) {
                                zA = dfVar.f3891u.a(nhVarB);
                            } else {
                                if (i6 == 4) {
                                    zA = dfVar.f3891u.b(nhVarB, f0Var);
                                }
                                dfVar.f3894x.c(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zA) {
                                zd0 zd0VarE3 = dfVar.e();
                                if (zd0VarE3 != null) {
                                    if (dfVar.f3892v.b(zd0VarE3)) {
                                        dfVar.H = true;
                                    }
                                    dfVar.E = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                dfVar.f3894x.c(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        dfVar.f3894x.c(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (u52 e6) {
                dfVar.f3894x.b(4002, System.currentTimeMillis() - jCurrentTimeMillis, e6);
            }
            dfVar.A.countDown();
        } catch (Throwable th) {
            dfVar.A.countDown();
            throw th;
        }
    }

    public static synchronized df d(Context context, ExecutorService executorService, ai1 ai1Var, boolean z6) {
        try {
            if (J == null) {
                xh1 xh1VarA = xh1.a(context, executorService, z6);
                sf sfVarA = ((Boolean) zzbe.zzc().a(zn.f11499w3)).booleanValue() ? sf.a(context) : null;
                mg mgVarA = ((Boolean) zzbe.zzc().a(zn.f11506x3)).booleanValue() ? mg.a(context, executorService) : null;
                eg egVar = ((Boolean) zzbe.zzc().a(zn.M2)).booleanValue() ? new eg() : null;
                xj0 xj0Var = ((Boolean) zzbe.zzc().a(zn.T2)).booleanValue() ? new xj0(3) : null;
                hi1 hi1VarA = hi1.a(context, executorService, xh1VarA, ai1Var);
                zzavw zzavwVar = new zzavw(context);
                yf yfVar = new yf(ai1Var, hi1VarA, new jg(context, zzavwVar), zzavwVar, sfVarA, mgVarA, egVar, xj0Var);
                int iM = aa1.m(context, xh1VarA);
                bq bqVar = new bq(11, (byte) 0);
                df dfVar = new df(context, xh1VarA, new wi1(context, iM), new dj1(context, iM, new v31(4, xh1VarA), ((Boolean) zzbe.zzc().a(zn.f11498w2)).booleanValue()), new fj1(context, yfVar, xh1VarA, bqVar), yfVar, executorService, bqVar, iM, mgVarA, egVar, xj0Var);
                J = dfVar;
                dfVar.b();
                J.c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return J;
    }

    public final synchronized void b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zd0 zd0VarE = e();
        if (zd0VarE == null) {
            this.f3894x.c(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f3892v.b(zd0VarE)) {
            this.H = true;
            this.A.countDown();
        }
    }

    public final void c() {
        zd0 zd0Var;
        if (this.G) {
            return;
        }
        synchronized (this.F) {
            try {
                if (!this.G) {
                    if ((System.currentTimeMillis() / 1000) - this.E < 3600) {
                        return;
                    }
                    fj1 fj1Var = this.f3892v;
                    synchronized (fj1Var.f4709e) {
                        h20 h20Var = fj1Var.f4708d;
                        zd0Var = h20Var != null ? (zd0) h20Var.f5217u : null;
                    }
                    if (zd0Var == null || ((ph) zd0Var.s).C() - (System.currentTimeMillis() / 1000) < 3600) {
                        int i6 = this.I - 1;
                        if (i6 == 2 || i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                            this.f3895y.execute(new cf(0, this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
    }

    public final zd0 e() {
        int i6 = this.I - 1;
        if (i6 != 2 && i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
            return null;
        }
        if (!((Boolean) zzbe.zzc().a(zn.f11485u2)).booleanValue()) {
            wi1 wi1Var = this.f3890t;
            ph phVarB = wi1Var.b(1);
            if (phVarB == null) {
                return null;
            }
            String strJ = phVarB.J();
            File fileB = xi1.b(strJ, wi1Var.c(), "pcam.jar");
            if (!fileB.exists()) {
                fileB = xi1.b(strJ, wi1Var.c(), "pcam");
            }
            return new zd0(phVarB, fileB, xi1.b(strJ, wi1Var.c(), "pcbc"), xi1.b(strJ, wi1Var.c(), "pcopt"));
        }
        dj1 dj1Var = this.f3891u;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (dj1.f3955f) {
            try {
                ph phVarF = dj1Var.f(1);
                if (phVarF == null) {
                    dj1Var.e(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileC = dj1Var.c(phVarF.J());
                File file = new File(fileC, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileC, "pcam");
                }
                File file2 = new File(fileC, "pcbc");
                File file3 = new File(fileC, "pcopt");
                dj1Var.e(5016, jCurrentTimeMillis);
                return new zd0(phVarF, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zze(Context context, String str, View view, Activity activity) {
        String strG;
        mg mgVar = this.B;
        if (mgVar != null && mgVar.f7143d) {
            mgVar.f7141b = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().a(zn.M2)).booleanValue()) {
            eg egVar = this.C;
            egVar.h = egVar.f4278g;
            egVar.f4278g = SystemClock.uptimeMillis();
        }
        c();
        h20 h20VarA = this.f3892v.a();
        if (h20VarA == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (h20VarA) {
            yf yfVar = (yf) h20VarA.f5218v;
            jg jgVar = yfVar.f10949c;
            HashMap mapB = yfVar.b();
            if (jgVar.D <= -2) {
                WeakReference weakReference = jgVar.f6059z;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    jgVar.D = -3L;
                }
            }
            mapB.put("lts", Long.valueOf(jgVar.D));
            mapB.put("f", "c");
            mapB.put("ctx", context);
            mapB.put("cs", str);
            mapB.put("aid", null);
            mapB.put("view", view);
            mapB.put("act", activity);
            strG = h20.g(h20VarA.h(mapB));
        }
        this.f3894x.d(5000, System.currentTimeMillis() - jCurrentTimeMillis, null, strG, null);
        return strG;
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzf(Context context) {
        String strG;
        mg mgVar = this.B;
        if (mgVar != null && mgVar.f7143d) {
            mgVar.f7141b = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().a(zn.M2)).booleanValue()) {
            eg egVar = this.C;
            egVar.f4273b = egVar.f4272a;
            egVar.f4272a = SystemClock.uptimeMillis();
        }
        c();
        h20 h20VarA = this.f3892v.a();
        if (h20VarA == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (h20VarA) {
            HashMap mapA = ((yf) h20VarA.f5218v).a();
            mapA.put("f", "q");
            mapA.put("ctx", context);
            mapA.put("aid", null);
            strG = h20.g(h20VarA.h(mapA));
        }
        this.f3894x.d(5001, System.currentTimeMillis() - jCurrentTimeMillis, null, strG, null);
        return strG;
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzh(Context context, View view, Activity activity) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String strG;
        mg mgVar = this.B;
        if (mgVar != null && mgVar.f7143d) {
            mgVar.f7141b = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().a(zn.M2)).booleanValue()) {
            this.C.a(context, view);
        }
        c();
        h20 h20VarA = this.f3892v.a();
        if (h20VarA == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (h20VarA) {
            yf yfVar = (yf) h20VarA.f5218v;
            xj0 xj0Var = yfVar.h;
            HashMap mapB = yfVar.b();
            if (xj0Var != null) {
                List list = (List) xj0Var.f10617t;
                xj0Var.f10617t = Collections.EMPTY_LIST;
                mapB.put("vst", list);
            }
            mapB.put("f", "v");
            mapB.put("ctx", context);
            mapB.put("aid", null);
            mapB.put("view", view);
            mapB.put("act", activity);
            strG = h20.g(h20VarA.h(mapB));
        }
        this.f3894x.d(5002, System.currentTimeMillis() - jCurrentTimeMillis, null, strG, null);
        return strG;
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void zzk(MotionEvent motionEvent) {
        h20 h20VarA = this.f3892v.a();
        if (h20VarA != null) {
            try {
                h20VarA.c(motionEvent);
            } catch (ej1 e6) {
                this.f3894x.b(e6.s, -1L, e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void zzl(int i6, int i7, int i8) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) zzbe.zzc().a(zn.Pb)).booleanValue() || (displayMetrics = this.s.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f6 = i6;
        float f7 = displayMetrics.density;
        float f8 = i7;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f6 * f7, f8 * f7, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        float f9 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f6 * f9, f8 * f9, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        float f10 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i8, 1, f6 * f10, f8 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        xj0 xj0Var = this.D;
        if (xj0Var != null) {
            xj0Var.f10617t = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void zzo(View view) {
        this.f3893w.f10949c.a(view);
    }
}
