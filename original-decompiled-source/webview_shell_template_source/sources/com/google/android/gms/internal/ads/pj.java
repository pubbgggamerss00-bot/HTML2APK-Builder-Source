package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pj {

    /* renamed from: a, reason: collision with root package name */
    public zzby f8087a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8088b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8089c;

    /* renamed from: d, reason: collision with root package name */
    public final zzei f8090d;

    /* renamed from: e, reason: collision with root package name */
    @AppOpenAd.AppOpenAdOrientation
    public final int f8091e;

    /* renamed from: f, reason: collision with root package name */
    public final AppOpenAd.AppOpenAdLoadCallback f8092f;

    /* renamed from: g, reason: collision with root package name */
    public final dy f8093g = new dy();
    public final zzr h = zzr.zza;

    public pj(Context context, String str, zzei zzeiVar, @AppOpenAd.AppOpenAdOrientation int i6, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f8088b = context;
        this.f8089c = str;
        this.f8090d = zzeiVar;
        this.f8091e = i6;
        this.f8092f = appOpenAdLoadCallback;
    }

    public final void a() {
        zzei zzeiVar = this.f8090d;
        String str = this.f8089c;
        Context context = this.f8088b;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzby zzbyVarZze = zzbc.zza().zze(context, zzs.zzb(), str, this.f8093g);
            this.f8087a = zzbyVarZze;
            if (zzbyVarZze != null) {
                int i6 = this.f8091e;
                if (i6 != 3) {
                    this.f8087a.zzI(new zzy(i6));
                }
                zzeiVar.zzq(jCurrentTimeMillis);
                this.f8087a.zzH(new bj(this.f8092f, str));
                this.f8087a.zzab(this.h.zza(context, zzeiVar));
            }
        } catch (RemoteException e6) {
            zzo.zzl("#007 Could not call remote method.", e6);
        }
    }
}
