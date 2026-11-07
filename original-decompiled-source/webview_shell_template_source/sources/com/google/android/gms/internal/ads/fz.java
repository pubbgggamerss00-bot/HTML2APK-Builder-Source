package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzc;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fz extends iy {
    public MediationRewardedAd A;
    public MediationInterscrollerAd B;
    public MediationAppOpenAd C;
    public final String D = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public final MediationExtrasReceiver s;

    /* renamed from: t, reason: collision with root package name */
    public hz f4819t;

    /* renamed from: u, reason: collision with root package name */
    public k40 f4820u;

    /* renamed from: v, reason: collision with root package name */
    public k3.a f4821v;

    /* renamed from: w, reason: collision with root package name */
    public View f4822w;

    /* renamed from: x, reason: collision with root package name */
    public MediationInterstitialAd f4823x;

    /* renamed from: y, reason: collision with root package name */
    public UnifiedNativeAdMapper f4824y;

    /* renamed from: z, reason: collision with root package name */
    public NativeAdMapper f4825z;

    public fz(Adapter adapter) {
        this.s = adapter;
    }

    public static final boolean g2(zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        zzbc.zzb();
        return zzf.zzr();
    }

    public static final String h2(zzm zzmVar, String str) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void A1(k3.a aVar) {
        Context context = (Context) k3.b.i1(aVar);
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof OnContextChangedListener) {
            ((OnContextChangedListener) mediationExtrasReceiver).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void C(k3.a aVar, zzm zzmVar, String str, String str2, my myVar, oq oqVar, ArrayList arrayList) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver;
        MediationExtrasReceiver mediationExtrasReceiver2 = this.s;
        boolean z6 = mediationExtrasReceiver2 instanceof MediationNativeAdapter;
        if (!z6 && !(mediationExtrasReceiver2 instanceof Adapter)) {
            zzo.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver2.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Requesting native ad from adapter.");
        if (z6) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) mediationExtrasReceiver2;
                List list = zzmVar.zze;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j6 = zzmVar.zzb;
                Date date = j6 == -1 ? null : new Date(j6);
                int i6 = zzmVar.zzd;
                Location location = zzmVar.zzk;
                boolean zG2 = g2(zzmVar);
                int i7 = zzmVar.zzg;
                boolean z7 = zzmVar.zzr;
                h2(zzmVar, str);
                kz kzVar = new kz(date, i6, hashSet, location, zG2, i7, oqVar, arrayList, z7);
                Bundle bundle = zzmVar.zzm;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f4819t = new hz(myVar);
                mediationNativeAdapter.requestNativeAd((Context) k3.b.i1(aVar), this.f4819t, f2(str, zzmVar, str2), kzVar, bundle2);
                return;
            } catch (Throwable th) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                me0.i(aVar, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (!(mediationExtrasReceiver2 instanceof Adapter)) {
            return;
        }
        try {
            mediationExtrasReceiver = mediationExtrasReceiver2;
            try {
                ((Adapter) mediationExtrasReceiver2).loadNativeAdMapper(new MediationNativeAdConfiguration((Context) k3.b.i1(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, f2(str, zzmVar, str2), e2(zzmVar), g2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, h2(zzmVar, str), this.D, oqVar), new cz(this, myVar));
            } catch (Throwable th2) {
                th = th2;
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                me0.i(aVar, th, "adapter.loadNativeAdMapper");
                String message = th.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((Adapter) mediationExtrasReceiver).loadNativeAd(new MediationNativeAdConfiguration((Context) k3.b.i1(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, f2(str, zzmVar, str2), e2(zzmVar), g2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, h2(zzmVar, str), this.D, oqVar), new bz(this, myVar));
                } catch (Throwable th3) {
                    zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th3);
                    me0.i(aVar, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        } catch (Throwable th4) {
            th = th4;
            mediationExtrasReceiver = mediationExtrasReceiver2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.jy
    public final void C0(k3.a aVar, uv uvVar, ArrayList arrayList) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            throw new RemoteException();
        }
        v31 v31Var = new v31(6, uvVar);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            zv zvVar = (zv) obj;
            String str = zvVar.s;
            AdFormat adFormat = null;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        adFormat = AdFormat.NATIVE;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                        break;
                    }
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        break;
                    }
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) zzbe.zzc().a(zn.Ib)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            break;
                        }
                    }
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        break;
                    }
                    break;
            }
            if (adFormat != null) {
                arrayList2.add(new MediationConfiguration(adFormat, zvVar.f11585t));
            }
        }
        ((Adapter) mediationExtrasReceiver).initialize((Context) k3.b.i1(aVar), v31Var, arrayList2);
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void E(k3.a aVar, zzs zzsVar, zzm zzmVar, String str, String str2, my myVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Requesting interscroller ad from adapter.");
        try {
            Adapter adapter = (Adapter) mediationExtrasReceiver;
            adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) k3.b.i1(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, f2(str, zzmVar, str2), e2(zzmVar), g2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, h2(zzmVar, str), zzc.zze(zzsVar.zze, zzsVar.zzb), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new xy(this, myVar, adapter));
        } catch (Exception e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            me0.i(aVar, e6, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void G1(k3.a aVar, zzm zzmVar, String str, my myVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zze("Requesting app open ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadAppOpenAd(new MediationAppOpenAdConfiguration((Context) k3.b.i1(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, f2(str, zzmVar, null), e2(zzmVar), g2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, h2(zzmVar, str), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new ez(this, myVar));
                return;
            } catch (Exception e6) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                me0.i(aVar, e6, "adapter.loadAppOpenAd");
                throw new RemoteException();
            }
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void H(k3.a aVar, zzm zzmVar, String str, my myVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) k3.b.i1(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, f2(str, zzmVar, null), e2(zzmVar), g2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, h2(zzmVar, str), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new dz(this, myVar));
                return;
            } catch (Exception e6) {
                me0.i(aVar, e6, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void J1(k3.a aVar, zzm zzmVar, String str, my myVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzo.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedAd(new MediationRewardedAdConfiguration((Context) k3.b.i1(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, f2(str, zzmVar, null), e2(zzmVar), g2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, h2(zzmVar, str), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), new dz(this, myVar));
                return;
            } catch (Exception e6) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                me0.i(aVar, e6, "adapter.loadRewardedAd");
                throw new RemoteException();
            }
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void N0(k3.a aVar, k40 k40Var, List list) throws RemoteException {
        zzo.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void V0(k3.a aVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (!(mediationExtrasReceiver instanceof Adapter) && !(mediationExtrasReceiver instanceof MediationInterstitialAdapter)) {
            zzo.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            b();
            return;
        }
        zzo.zze("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.f4823x;
        if (mediationInterstitialAd == null) {
            zzo.zzg("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        try {
            mediationInterstitialAd.showAd((Context) k3.b.i1(aVar));
        } catch (RuntimeException e6) {
            me0.i(aVar, e6, "adapter.interstitial.showAd");
            throw e6;
        }
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void Z(k3.a aVar, zzs zzsVar, zzm zzmVar, String str, String str2, my myVar) throws RemoteException {
        String str3;
        MediationBannerAdapter mediationBannerAdapter;
        wy wyVar;
        Bundle bundle;
        Context context;
        hz hzVar;
        Bundle bundleF2;
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        boolean z6 = mediationExtrasReceiver instanceof MediationBannerAdapter;
        if (!z6 && !(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Requesting banner ad from adapter.");
        AdSize adSizeZzd = zzsVar.zzn ? zzc.zzd(zzsVar.zze, zzsVar.zzb) : zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza);
        if (!z6) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadBannerAd(new MediationBannerAdConfiguration((Context) k3.b.i1(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, f2(str, zzmVar, str2), e2(zzmVar), g2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, h2(zzmVar, str), adSizeZzd, this.D), new yy(this, myVar));
                    return;
                } catch (Throwable th) {
                    zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                    me0.i(aVar, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            mediationBannerAdapter = (MediationBannerAdapter) mediationExtrasReceiver;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j6 = zzmVar.zzb;
            Date date = j6 == -1 ? null : new Date(j6);
            int i6 = zzmVar.zzd;
            Location location = zzmVar.zzk;
            boolean zG2 = g2(zzmVar);
            int i7 = zzmVar.zzg;
            boolean z7 = zzmVar.zzr;
            h2(zzmVar, str);
            wyVar = new wy(date, i6, hashSet, location, zG2, i7, z7);
            Bundle bundle2 = zzmVar.zzm;
            bundle = bundle2 != null ? bundle2.getBundle(mediationBannerAdapter.getClass().getName()) : null;
            context = (Context) k3.b.i1(aVar);
            hzVar = new hz(myVar);
            bundleF2 = f2(str, zzmVar, str2);
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } catch (Throwable th2) {
            th = th2;
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            mediationBannerAdapter.requestBannerAd(context, hzVar, bundleF2, adSizeZzd, wyVar, bundle);
        } catch (Throwable th3) {
            th = th3;
            zzo.zzh(str3, th);
            me0.i(aVar, th, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void b() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            zzo.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) mediationExtrasReceiver).showInterstitial();
                return;
            } catch (Throwable th) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
        zzo.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void d1(zzm zzmVar, String str) throws RemoteException {
        i1(zzmVar, str);
    }

    public final Bundle e2(zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.s.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    public final Bundle f2(String str, zzm zzmVar, String str2) throws RemoteException {
        zzo.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.s instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzmVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzmVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            throw new RemoteException();
        }
    }

    public final void i1(zzm zzmVar, String str) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof Adapter) {
            J1(this.f4821v, zzmVar, str, new iz((Adapter) mediationExtrasReceiver, this.f4820u));
            return;
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void j1(boolean z6) {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) mediationExtrasReceiver).onImmersiveModeUpdated(z6);
                return;
            } catch (Throwable th) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                return;
            }
        }
        zzo.zze(OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void k1(k3.a aVar, zzm zzmVar, k40 k40Var, String str) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f4821v = aVar;
            this.f4820u = k40Var;
            k40Var.Z0(new k3.b(mediationExtrasReceiver));
            return;
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void m0(k3.a aVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Show app open ad from adapter.");
        MediationAppOpenAd mediationAppOpenAd = this.C;
        if (mediationAppOpenAd == null) {
            zzo.zzg("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        try {
            mediationAppOpenAd.showAd((Context) k3.b.i1(aVar));
        } catch (RuntimeException e6) {
            me0.i(aVar, e6, "adapter.appOpen.showAd");
            throw e6;
        }
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void o1(k3.a aVar, zzm zzmVar, String str, String str2, my myVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        boolean z6 = mediationExtrasReceiver instanceof MediationInterstitialAdapter;
        if (!z6 && !(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Requesting interstitial ad from adapter.");
        if (!z6) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) k3.b.i1(aVar), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, f2(str, zzmVar, str2), e2(zzmVar), g2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, h2(zzmVar, str), this.D), new az(this, myVar));
                    return;
                } catch (Throwable th) {
                    zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                    me0.i(aVar, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) mediationExtrasReceiver;
            List list = zzmVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j6 = zzmVar.zzb;
            Date date = j6 == -1 ? null : new Date(j6);
            int i6 = zzmVar.zzd;
            Location location = zzmVar.zzk;
            boolean zG2 = g2(zzmVar);
            int i7 = zzmVar.zzg;
            boolean z7 = zzmVar.zzr;
            h2(zzmVar, str);
            wy wyVar = new wy(date, i6, hashSet, location, zG2, i7, z7);
            Bundle bundle = zzmVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) k3.b.i1(aVar), new hz(myVar), f2(str, zzmVar, str2), wyVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th2);
            me0.i(aVar, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final qy p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void t1(k3.a aVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzo.zze("Show rewarded ad from adapter.");
        MediationRewardedAd mediationRewardedAd = this.A;
        if (mediationRewardedAd == null) {
            zzo.zzg("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) k3.b.i1(aVar));
        } catch (RuntimeException e6) {
            me0.i(aVar, e6, "adapter.rewarded.showAd");
            throw e6;
        }
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void zzE() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onPause();
            } catch (Throwable th) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void zzF() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onResume();
            } catch (Throwable th) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void zzL() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        MediationRewardedAd mediationRewardedAd = this.A;
        if (mediationRewardedAd == null) {
            zzo.zzg("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        try {
            mediationRewardedAd.showAd((Context) k3.b.i1(this.f4821v));
        } catch (RuntimeException e6) {
            me0.i(this.f4821v, e6, "adapter.showVideo");
            throw e6;
        }
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final boolean zzM() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final boolean zzN() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if ((mediationExtrasReceiver instanceof Adapter) || Objects.equals(mediationExtrasReceiver.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f4820u != null;
        }
        zzo.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final py zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final zzeb zzh() {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof zza) {
            try {
                return ((zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final oy zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.B;
        if (mediationInterscrollerAd != null) {
            return new gz(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final ty zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof MediationNativeAdapter) {
            hz hzVar = this.f4819t;
            if (hzVar == null || (unifiedNativeAdMapper = hzVar.f5517b) == null) {
                return null;
            }
            return new lz(unifiedNativeAdMapper);
        }
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            return null;
        }
        NativeAdMapper nativeAdMapper = this.f4825z;
        if (nativeAdMapper != null) {
            return new jz(nativeAdMapper);
        }
        UnifiedNativeAdMapper unifiedNativeAdMapper2 = this.f4824y;
        if (unifiedNativeAdMapper2 != null) {
            return new lz(unifiedNativeAdMapper2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final n00 zzl() {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof Adapter) {
            return n00.l(((Adapter) mediationExtrasReceiver).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final n00 zzm() {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof Adapter) {
            return n00.l(((Adapter) mediationExtrasReceiver).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final k3.a zzn() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof MediationBannerAdapter) {
            try {
                return new k3.b(((MediationBannerAdapter) mediationExtrasReceiver).getBannerView());
            } catch (Throwable th) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
        if (mediationExtrasReceiver instanceof Adapter) {
            return new k3.b(this.f4822w);
        }
        zzo.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.jy
    public final void zzo() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.s;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onDestroy();
            } catch (Throwable th) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
                throw new RemoteException();
            }
        }
    }

    public fz(MediationAdapter mediationAdapter) {
        this.s = mediationAdapter;
    }
}
