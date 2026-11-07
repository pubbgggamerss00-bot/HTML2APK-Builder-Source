package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c91 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final zzg f3474a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3475b;

    /* renamed from: c, reason: collision with root package name */
    public final hs1 f3476c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f3477d;

    /* renamed from: e, reason: collision with root package name */
    public final xz0 f3478e;

    /* renamed from: f, reason: collision with root package name */
    public final ec1 f3479f;

    /* renamed from: g, reason: collision with root package name */
    public final VersionInfoParcel f3480g;

    public c91(zzj zzjVar, Context context, hs1 hs1Var, ScheduledExecutorService scheduledExecutorService, xz0 xz0Var, ec1 ec1Var, VersionInfoParcel versionInfoParcel) {
        this.f3474a = zzjVar;
        this.f3475b = context;
        this.f3476c = hs1Var;
        this.f3477d = scheduledExecutorService;
        this.f3478e = xz0Var;
        this.f3479f = ec1Var;
        this.f3480g = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        if (java.util.Arrays.asList(r1.split(",")).contains(r5.f3475b.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    @Override // com.google.android.gms.internal.ads.q81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c5.a zzb() {
        c5.a aVarL;
        ScheduledExecutorService scheduledExecutorService = this.f3477d;
        if (((Boolean) zzbe.zzc().a(zn.ma)).booleanValue() && this.f3474a.zzO()) {
            if (((Boolean) zzbe.zzc().a(zn.qa)).booleanValue()) {
                if (this.f3479f.f4209d.zzy != RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) {
                    if (this.f3480g.clientJarVersion >= ((Integer) zzbe.zzc().a(zn.ka)).intValue()) {
                        if (Build.VERSION.SDK_INT >= ((Integer) zzbe.zzc().a(zn.la)).intValue()) {
                            if (((Boolean) zzbe.zzc().a(zn.ia)).booleanValue()) {
                                String str = (String) zzbe.zzc().a(zn.ja);
                                if (!TextUtils.isEmpty(str)) {
                                }
                            }
                            try {
                                aVarL = bs1.q(this.f3478e.a(false), ((Integer) zzbe.zzc().a(zn.oa)).intValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
                            } catch (Exception e6) {
                                aVarL = bs1.l(e6);
                            }
                            xr1 xr1VarP = xr1.p(aVarL);
                            sw0 sw0Var = new sw0(4);
                            hs1 hs1Var = this.f3476c;
                            return bs1.q(bs1.k(bs1.p(xr1VarP, sw0Var, hs1Var), Throwable.class, new nv(1, this), hs1Var), ((Integer) zzbe.zzc().a(zn.oa)).intValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
                        }
                    }
                }
            }
        }
        return bs1.m(new d91(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, -1));
    }
}
