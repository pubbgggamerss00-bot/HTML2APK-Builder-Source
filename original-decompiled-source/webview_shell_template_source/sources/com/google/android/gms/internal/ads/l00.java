package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzc;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l00 extends d00 {

    /* renamed from: t, reason: collision with root package name */
    public final RtbAdapter f6541t;

    /* renamed from: u, reason: collision with root package name */
    public MediationInterstitialAd f6542u;

    /* renamed from: v, reason: collision with root package name */
    public MediationRewardedAd f6543v;

    /* renamed from: w, reason: collision with root package name */
    public MediationAppOpenAd f6544w;

    /* renamed from: x, reason: collision with root package name */
    public String f6545x;

    public l00(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f6545x = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.f6541t = rtbAdapter;
    }

    public static final Bundle e2(String str) throws RemoteException {
        zzo.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
            throw new RemoteException();
        }
    }

    public static final boolean f2(zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        zzbc.zzb();
        return zzf.zzr();
    }

    public static final String g2(zzm zzmVar, String str) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void M(String str, String str2, zzm zzmVar, k3.b bVar, w11 w11Var, my myVar) throws RemoteException {
        Y(str, str2, zzmVar, bVar, w11Var, myVar, null);
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void O1(String str, String str2, zzm zzmVar, k3.a aVar, rz rzVar, my myVar, zzs zzsVar) throws RemoteException {
        try {
            this.f6541t.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) k3.b.i1(aVar), str, e2(str2), i1(zzmVar), f2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, g2(zzmVar, str2), zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza), this.f6545x), new j00(0, rzVar, myVar));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render banner ad.", th);
            me0.i(aVar, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void P(String str, String str2, zzm zzmVar, k3.a aVar, b00 b00Var, my myVar) throws RemoteException {
        try {
            this.f6541t.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) k3.b.i1(aVar), str, e2(str2), i1(zzmVar), f2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, g2(zzmVar, str2), this.f6545x), new yw(this, b00Var, myVar, 1));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render rewarded ad.", th);
            me0.i(aVar, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void R0(String str, String str2, zzm zzmVar, k3.a aVar, oz ozVar, my myVar) throws RemoteException {
        try {
            k00 k00Var = new k00();
            k00Var.s = ozVar;
            k00Var.f6201t = myVar;
            k00Var.f6202u = this;
            this.f6541t.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) k3.b.i1(aVar), str, e2(str2), i1(zzmVar), f2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, g2(zzmVar, str2), this.f6545x), k00Var);
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render app open ad.", th);
            me0.i(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void S1(String str) {
        this.f6545x = str;
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void Y(String str, String str2, zzm zzmVar, k3.a aVar, xz xzVar, my myVar, oq oqVar) throws RemoteException {
        RtbAdapter rtbAdapter = this.f6541t;
        try {
            rtbAdapter.loadRtbNativeAdMapper(new MediationNativeAdConfiguration((Context) k3.b.i1(aVar), str, e2(str2), i1(zzmVar), f2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, g2(zzmVar, str2), this.f6545x, oqVar), new ro0(xzVar, myVar));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render native ad.", th);
            me0.i(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                rtbAdapter.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) k3.b.i1(aVar), str, e2(str2), i1(zzmVar), f2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, g2(zzmVar, str2), this.f6545x, oqVar), new ni0(4, xzVar, myVar));
            } catch (Throwable th2) {
                zzo.zzh("Adapter failed to render native ad.", th2);
                me0.i(aVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.e00
    public final void h1(k3.a aVar, String str, Bundle bundle, Bundle bundle2, zzs zzsVar, h00 h00Var) throws RemoteException {
        AdFormat adFormat;
        try {
            xj1 xj1Var = new xj1(6, h00Var);
            RtbAdapter rtbAdapter = this.f6541t;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                        MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(mediationConfiguration);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) k3.b.i1(aVar), arrayList, bundle, zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), xj1Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -1052618729:
                    if (str.equals("native")) {
                        adFormat = AdFormat.NATIVE;
                        MediationConfiguration mediationConfiguration2 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(mediationConfiguration2);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) k3.b.i1(aVar), arrayList2, bundle, zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), xj1Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -239580146:
                    if (str.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                        MediationConfiguration mediationConfiguration22 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList22 = new ArrayList();
                        arrayList22.add(mediationConfiguration22);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) k3.b.i1(aVar), arrayList22, bundle, zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), xj1Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 604727084:
                    if (str.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                        MediationConfiguration mediationConfiguration222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList222 = new ArrayList();
                        arrayList222.add(mediationConfiguration222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) k3.b.i1(aVar), arrayList222, bundle, zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), xj1Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1167692200:
                    if (str.equals("app_open")) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        MediationConfiguration mediationConfiguration2222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList2222 = new ArrayList();
                        arrayList2222.add(mediationConfiguration2222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) k3.b.i1(aVar), arrayList2222, bundle, zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), xj1Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) zzbe.zzc().a(zn.Ib)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            MediationConfiguration mediationConfiguration22222 = new MediationConfiguration(adFormat, bundle2);
                            ArrayList arrayList22222 = new ArrayList();
                            arrayList22222.add(mediationConfiguration22222);
                            rtbAdapter.collectSignals(new RtbSignalData((Context) k3.b.i1(aVar), arrayList22222, bundle, zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), xj1Var);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        MediationConfiguration mediationConfiguration222222 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList222222 = new ArrayList();
                        arrayList222222.add(mediationConfiguration222222);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) k3.b.i1(aVar), arrayList222222, bundle, zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), xj1Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            zzo.zzh("Error generating signals for RTB", th);
            me0.i(aVar, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    public final Bundle i1(zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f6541t.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final boolean k(k3.a aVar) {
        MediationAppOpenAd mediationAppOpenAd = this.f6544w;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((Context) k3.b.i1(aVar));
            return true;
        } catch (Throwable th) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            me0.i(aVar, th, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final boolean l(k3.a aVar) {
        MediationInterstitialAd mediationInterstitialAd = this.f6542u;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) k3.b.i1(aVar));
            return true;
        } catch (Throwable th) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            me0.i(aVar, th, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void o0(String str, String str2, zzm zzmVar, k3.a aVar, uz uzVar, my myVar) throws RemoteException {
        try {
            com.google.android.gms.ads.mediation.customevent.b bVar = new com.google.android.gms.ads.mediation.customevent.b();
            bVar.s = uzVar;
            bVar.f2374t = myVar;
            bVar.f2375u = this;
            this.f6541t.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) k3.b.i1(aVar), str, e2(str2), i1(zzmVar), f2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, g2(zzmVar, str2), this.f6545x), bVar);
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render interstitial ad.", th);
            me0.i(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void w(String str, String str2, zzm zzmVar, k3.a aVar, b00 b00Var, my myVar) throws RemoteException {
        try {
            this.f6541t.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) k3.b.i1(aVar), str, e2(str2), i1(zzmVar), f2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, g2(zzmVar, str2), this.f6545x), new yw(this, b00Var, myVar, 1));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render rewarded interstitial ad.", th);
            me0.i(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final boolean x0(k3.a aVar) {
        MediationRewardedAd mediationRewardedAd = this.f6543v;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) k3.b.i1(aVar));
            return true;
        } catch (Throwable th) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            me0.i(aVar, th, "adapter.showRtbRewardedAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final void x1(String str, String str2, zzm zzmVar, k3.a aVar, rz rzVar, my myVar, zzs zzsVar) throws RemoteException {
        try {
            this.f6541t.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) k3.b.i1(aVar), str, e2(str2), i1(zzmVar), f2(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, g2(zzmVar, str2), zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza), this.f6545x), new com.google.android.gms.ads.mediation.customevent.a(3, rzVar, myVar));
        } catch (Throwable th) {
            zzo.zzh("Adapter failed to render interscroller ad.", th);
            me0.i(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final zzeb zze() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f6541t;
        if (mediationExtrasReceiver instanceof zza) {
            try {
                return ((zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final n00 zzf() {
        return n00.l(this.f6541t.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.e00
    public final n00 zzg() {
        return n00.l(this.f6541t.getSDKVersionInfo());
    }
}
