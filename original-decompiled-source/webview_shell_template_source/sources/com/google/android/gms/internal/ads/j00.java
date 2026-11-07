package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j00 implements MediationAdLoadCallback, zr1, nq, rn1, vq0 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f5891t;

    /* renamed from: u, reason: collision with root package name */
    public Object f5892u;

    public /* synthetic */ j00(int i6, Object obj, Object obj2) {
        this.s = i6;
        this.f5891t = obj;
        this.f5892u = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public void mo2a(Object obj) {
        switch (this.s) {
            case 1:
                ((r70) this.f5891t).mo3zza(obj);
                break;
            default:
                String str = (String) obj;
                try {
                    l30 l30Var = (l30) this.f5892u;
                    c30 c30Var = (c30) this.f5891t;
                    Parcel parcelZza = l30Var.zza();
                    parcelZza.writeString(str);
                    th.c(parcelZza, c30Var);
                    l30Var.zzda(1, parcelZza);
                    break;
                } catch (RemoteException e6) {
                    zze.zzb("Service can't call client", e6);
                }
        }
    }

    public /* bridge */ j00 b(com.google.android.gms.internal.consent_sdk.s sVar) {
        this.f5892u = sVar;
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnTouchListener, com.google.android.gms.internal.ads.sh] */
    @Override // com.google.android.gms.internal.ads.nq
    public void c(MotionEvent motionEvent) {
        ((sh) this.f5891t).onTouch(null, motionEvent);
    }

    public com.google.android.gms.internal.consent_sdk.f d() {
        com.google.android.gms.internal.consent_sdk.s sVar = (com.google.android.gms.internal.consent_sdk.s) this.f5892u;
        if (sVar != null) {
            return new com.google.android.gms.internal.consent_sdk.f((com.google.android.gms.internal.consent_sdk.e) this.f5891t, sVar);
        }
        throw new IllegalStateException(String.valueOf(com.google.android.gms.internal.consent_sdk.s.class.getCanonicalName()).concat(" must be set"));
    }

    @Override // com.google.android.gms.internal.ads.vq0
    public void e(Object obj, dj2 dj2Var) {
        yc2 yc2Var = (yc2) obj;
        yc2Var.g((q72) this.f5892u, new lo(dj2Var, ((bd2) this.f5891t).f3045e));
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        switch (this.s) {
            case 1:
                ((q70) this.f5892u).mo5zza();
                break;
            default:
                try {
                    l30 l30Var = (l30) this.f5892u;
                    zzbb zzbbVarZzb = zzbb.zzb(th);
                    Parcel parcelZza = l30Var.zza();
                    th.c(parcelZza, zzbbVarZzb);
                    l30Var.zzda(2, parcelZza);
                    break;
                } catch (RemoteException e6) {
                    zze.zzb("Service can't call client", e6);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(AdError adError) {
        try {
            ((rz) this.f5891t).zzf(adError.zza());
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public Object onSuccess(Object obj) {
        rz rzVar = (rz) this.f5891t;
        MediationBannerAd mediationBannerAd = (MediationBannerAd) obj;
        if (mediationBannerAd != null) {
            try {
                rzVar.t(new k3.b(mediationBannerAd.getView()));
            } catch (RemoteException e6) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            }
            return new m00((my) this.f5892u);
        }
        zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            rzVar.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e7) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.rn1
    public lo1 zza() {
        qu1 qu1Var = (qu1) this.f5892u;
        return new xt1((Context) this.f5891t, new yw1(null, qu1Var.f8456t, qu1Var.f8457u, false, qu1Var.s));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    @Override // com.google.android.gms.internal.ads.nq
    public JSONObject zzb() {
        return ((sh) this.f5891t).zzp();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View$OnClickListener, com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    @Override // com.google.android.gms.internal.ads.nq
    public void zzc() {
        cp1 cp1Var = tp0.G;
        ?? r12 = (sh) this.f5891t;
        Map mapZzm = r12.zzm();
        if (mapZzm == null) {
            return;
        }
        int i6 = cp1Var.f3638v;
        int i7 = 0;
        while (i7 < i6) {
            Object obj = mapZzm.get((String) cp1Var.get(i7));
            i7++;
            if (obj != null) {
                r12.onClick((ViewGroup) this.f5892u);
                return;
            }
        }
    }

    public j00(l30 l30Var, c30 c30Var) {
        this.s = 5;
        this.f5892u = l30Var;
        this.f5891t = c30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j00(hq0 hq0Var, ViewGroup viewGroup) {
        this.s = 4;
        this.f5891t = (sh) hq0Var;
        this.f5892u = viewGroup;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    public /* synthetic */ j00(com.google.android.gms.internal.consent_sdk.e eVar) {
        this.s = 8;
        this.f5891t = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    @Override // com.google.android.gms.internal.ads.nq, com.google.android.gms.internal.ads.em1
    /* renamed from: zza, reason: collision with other method in class */
    public JSONObject mo7zza() {
        return ((sh) this.f5891t).zzo();
    }

    public j00(Context context) {
        this.s = 6;
        qu1 qu1Var = new qu1();
        this.f5891t = context.getApplicationContext();
        this.f5892u = qu1Var;
    }
}
