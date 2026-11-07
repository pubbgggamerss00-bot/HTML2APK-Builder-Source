package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import b6.v;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.aa1;
import com.google.android.gms.internal.ads.df;
import com.google.android.gms.internal.ads.dj1;
import com.google.android.gms.internal.ads.fe;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.ge;
import com.google.android.gms.internal.ads.hf;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.ke;
import com.google.android.gms.internal.ads.kf;
import com.google.android.gms.internal.ads.le;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.ue;
import com.google.android.gms.internal.ads.vs1;
import com.google.android.gms.internal.ads.xc;
import com.google.android.gms.internal.ads.xh1;
import com.google.android.gms.internal.ads.yc;
import com.google.android.gms.internal.ads.zh1;
import com.google.android.gms.internal.ads.zn;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzk implements Runnable, ff {
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final xh1 zzi;
    private Context zzj;
    private final Context zzk;
    private VersionInfoParcel zzl;
    private final VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = versionInfoParcel;
        this.zzm = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.y2)).booleanValue();
        this.zzn = zBooleanValue;
        this.zzi = xh1.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzf = ((Boolean) zzbe.zzc().a(zn.v2)).booleanValue();
        this.zzg = ((Boolean) zzbe.zzc().a(zn.f11518z2)).booleanValue();
        if (((Boolean) zzbe.zzc().a(zn.f11505x2)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzbe.zzc().a(zn.A3)).booleanValue()) {
            this.zza = zzi();
        }
        if (((Boolean) zzbe.zzc().a(zn.f11486u3)).booleanValue()) {
            i70.f5586a.execute(this);
            return;
        }
        zzbc.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzu()) {
            i70.f5586a.execute(this);
        } else {
            run();
        }
    }

    private final ff zzq() {
        return zzm() == 2 ? (ff) this.zze.get() : (ff) this.zzd.get();
    }

    private final void zzr() {
        List list = this.zzc;
        ff ffVarZzq = zzq();
        if (list.isEmpty() || ffVarZzq == null) {
            return;
        }
        for (Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                ffVarZzq.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                ffVarZzq.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzs(boolean z6) {
        String str = this.zzl.afmaVersion;
        Context contextZzt = zzt(this.zzj);
        xc xcVarB = yc.B();
        xcVarB.i();
        yc.F((yc) xcVarB.f4126t, z6);
        xcVarB.i();
        yc.G((yc) xcVarB.f4126t, str);
        this.zzd.set(kf.m(contextZzt, new hf((yc) xcVarB.g())));
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final df zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z6, boolean z7) {
        df dfVarD;
        xc xcVarB = yc.B();
        xcVarB.i();
        yc.F((yc) xcVarB.f4126t, z6);
        String str = versionInfoParcel.afmaVersion;
        xcVarB.i();
        yc.G((yc) xcVarB.f4126t, str);
        yc ycVar = (yc) xcVarB.g();
        Context contextZzt = zzt(context);
        synchronized (df.class) {
            zh1 zh1Var = new zh1(3);
            zh1Var.f11294u = false;
            byte b7 = (byte) (zh1Var.f11298y | 1);
            zh1Var.f11295v = true;
            zh1Var.f11296w = 100L;
            zh1Var.f11297x = 300L;
            zh1Var.f11298y = (byte) (((byte) (((byte) (((byte) (((byte) (b7 | 2)) | 4)) | 8)) | 16)) | 32);
            String strE = ycVar.E();
            if (strE == null) {
                throw new NullPointerException("Null clientVersion");
            }
            zh1Var.f11293t = strE;
            zh1Var.f11294u = ycVar.H();
            zh1Var.f11298y = (byte) (zh1Var.f11298y | 1);
            dfVarD = df.d(contextZzt, Executors.newCachedThreadPool(), zh1Var.q(), z7);
        }
        return dfVarD;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        try {
            if (((Boolean) zzbe.zzc().a(zn.A3)).booleanValue()) {
                this.zza = zzi();
            }
            boolean z7 = this.zzl.isClientJar;
            final boolean z8 = false;
            if (!((Boolean) zzbe.zzc().a(zn.f11390f1)).booleanValue() && z7) {
                z8 = true;
            }
            if (zzm() == 1) {
                zzs(z8);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc(z8);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    df dfVarZzu = zzu(this.zzj, this.zzl, z8, this.zzn);
                    this.zze.set(dfVarZzu);
                    if (this.zzg) {
                        synchronized (dfVarZzu) {
                            z6 = dfVarZzu.H;
                        }
                        if (!z6) {
                            this.zzo = 1;
                            zzs(z8);
                        }
                    }
                } catch (NullPointerException e6) {
                    this.zzo = 1;
                    zzs(z8);
                    this.zzi.b(2031, System.currentTimeMillis() - jCurrentTimeMillis, e6);
                }
            }
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
            throw th;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        ff ffVarZzq;
        if (!zzj() || (ffVarZzq = zzq()) == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzr();
        return ffVarZzq.zzf(zzt(context));
    }

    public final /* synthetic */ void zzc(boolean z6) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzu(this.zzk, this.zzm, z6, this.zzn).c();
        } catch (NullPointerException e6) {
            this.zzi.b(2027, System.currentTimeMillis() - jCurrentTimeMillis, e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zze(Context context, String str, View view, Activity activity) {
        if (!zzj()) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        ff ffVarZzq = zzq();
        if (((Boolean) zzbe.zzc().a(zn.za)).booleanValue()) {
            zzv.zzq();
            zzs.zzK(view, 4, null);
        }
        if (ffVarZzq == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzr();
        return ffVarZzq.zze(zzt(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzf(Context context) {
        return zzb(context, null);
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzg(final Context context) {
        Callable callable = new Callable() { // from class: com.google.android.gms.ads.internal.zzh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb(context, null);
            }
        };
        Executor executor = this.zzh;
        vs1 vs1Var = new vs1(callable);
        executor.execute(vs1Var);
        try {
            return (String) vs1Var.get(((Integer) zzbe.zzc().a(zn.P2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.zzm.afmaVersion;
            try {
                fe feVarB = ge.B();
                feVarB.i();
                ge.D((ge) feVarB.f4126t, str);
                feVarB.i();
                ge.C((ge) feVarB.f4126t);
                String packageName = context.getPackageName();
                feVarB.i();
                ge.E((ge) feVarB.f4126t, packageName);
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                feVarB.i();
                ge.F((ge) feVarB.f4126t, jCurrentTimeMillis);
                try {
                    long j6 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    feVarB.i();
                    ge.G((ge) feVarB.f4126t, j6);
                } catch (PackageManager.NameNotFoundException unused3) {
                    feVarB.i();
                    ge.G((ge) feVarB.f4126t, -1L);
                }
                ke keVarA = ue.a(null, ((ge) feVarB.g()).i());
                keVarA.i();
                le.F((le) keVarA.f4126t);
                keVarA.i();
                le.E((le) keVarA.f4126t, 2);
                return Base64.encodeToString(((le) keVarA.g()).i(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzbe.zzc().a(zn.ya)).booleanValue()) {
            ff ffVarZzq = zzq();
            if (((Boolean) zzbe.zzc().a(zn.za)).booleanValue()) {
                zzv.zzq();
                zzs.zzK(view, 2, null);
            }
            return ffVarZzq != null ? ffVarZzq.zzh(context, view, activity) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (!zzj()) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        ff ffVarZzq2 = zzq();
        if (((Boolean) zzbe.zzc().a(zn.za)).booleanValue()) {
            zzv.zzq();
            zzs.zzK(view, 2, null);
        }
        return ffVarZzq2 != null ? ffVarZzq2.zzh(context, view, activity) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public final boolean zzi() throws IOException {
        Context context = this.zzj;
        v vVar = new v(1, this);
        dj1 dj1Var = new dj1(context, aa1.m(context, this.zzi), vVar, ((Boolean) zzbe.zzc().a(zn.f11498w2)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (dj1.f3955f) {
            try {
                ph phVarF = dj1Var.f(1);
                if (phVarF == null) {
                    dj1Var.e(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileC = dj1Var.c(phVarF.J());
                if (!new File(fileC, "pcam.jar").exists()) {
                    dj1Var.e(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileC, "pcbc").exists()) {
                    dj1Var.e(5019, jCurrentTimeMillis);
                    return true;
                }
                dj1Var.e(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzj() throws InterruptedException {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e6) {
            zzo.zzk("Interrupted during GADSignals creation.", e6);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void zzk(MotionEvent motionEvent) {
        ff ffVarZzq = zzq();
        if (ffVarZzq == null) {
            this.zzc.add(new Object[]{motionEvent});
        } else {
            zzr();
            ffVarZzq.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void zzl(int i6, int i7, int i8) {
        ff ffVarZzq = zzq();
        if (ffVarZzq == null) {
            this.zzc.add(new Object[]{Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)});
        } else {
            zzr();
            ffVarZzq.zzl(i6, i7, i8);
        }
    }

    public final int zzm() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        ff ffVarZzq;
        ff ffVarZzq2;
        if (((Boolean) zzbe.zzc().a(zn.U2)).booleanValue()) {
            if (this.zzb.getCount() != 0 || (ffVarZzq2 = zzq()) == null) {
                return;
            }
            ffVarZzq2.zzn(stackTraceElementArr);
            return;
        }
        if (!zzj() || (ffVarZzq = zzq()) == null) {
            return;
        }
        ffVarZzq.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void zzo(View view) {
        ff ffVarZzq = zzq();
        if (ffVarZzq != null) {
            ffVarZzq.zzo(view);
        }
    }

    public final int zzp() {
        return this.zzo;
    }
}
