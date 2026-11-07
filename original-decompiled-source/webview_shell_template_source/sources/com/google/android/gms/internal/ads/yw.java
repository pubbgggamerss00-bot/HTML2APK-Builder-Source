package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yw implements q70, MediationAdLoadCallback {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public Object f11094t;

    /* renamed from: u, reason: collision with root package name */
    public Object f11095u;

    /* renamed from: v, reason: collision with root package name */
    public Object f11096v;

    public /* synthetic */ yw() {
        this.s = 4;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((b00) this.f11094t).zzf(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        b00 b00Var = (b00) this.f11094t;
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd != null) {
            try {
                ((l00) this.f11096v).f6543v = mediationRewardedAd;
                b00Var.zzg();
            } catch (RemoteException e6) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            }
            return new m00((my) this.f11095u);
        }
        zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            b00Var.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
            return null;
        }
    }

    public String toString() {
        switch (this.s) {
            case 2:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f11094t);
                sb.append('{');
                s70 s70Var = (s70) ((s70) this.f11095u).f8824u;
                String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                while (s70Var != null) {
                    Object obj = s70Var.f8823t;
                    sb.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                    }
                    s70Var = (s70) s70Var.f8824u;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.q70, com.google.android.gms.internal.ads.ud1
    /* renamed from: zza */
    public void mo5zza() {
        ie1 ie1Var;
        zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (((cx) this.f11096v).f3677a) {
            try {
                zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                ((cx) this.f11096v).h = 1;
                zze.zza("Failed loading new engine. Marking new engine destroyable.");
                ((bx) this.f11094t).f();
                if (((Boolean) mp.f7200d.c()).booleanValue() && (ie1Var = ((cx) this.f11096v).f3681e) != null) {
                    de1 de1Var = (de1) this.f11095u;
                    de1Var.e("Failed loading new engine");
                    de1Var.s(false);
                    ie1Var.b(de1Var.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }

    public /* synthetic */ yw(Object obj, Object obj2, Object obj3, int i6) {
        this.s = i6;
        this.f11094t = obj2;
        this.f11095u = obj3;
        this.f11096v = obj;
    }

    public yw(j jVar, o oVar) {
        this.s = 3;
        this.f11094t = jVar;
        this.f11095u = oVar;
        this.f11096v = new w(new tk2());
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    public yw(String str) {
        this.s = 2;
        s70 s70Var = new s70(6);
        this.f11095u = s70Var;
        this.f11096v = s70Var;
        this.f11094t = str;
    }
}
