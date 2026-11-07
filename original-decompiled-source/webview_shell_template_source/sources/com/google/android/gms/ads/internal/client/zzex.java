package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.dh0;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.pp;
import com.google.android.gms.internal.ads.rv;
import com.google.android.gms.internal.ads.wx;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.yv;
import com.google.android.gms.internal.ads.zn;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzex {
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    private static zzex zzb;
    private zzcz zzi;
    private final Object zzc = new Object();
    private final Object zzd = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private final Object zzh = new Object();
    private OnAdInspectorClosedListener zzj = null;
    private RequestConfiguration zzk = new RequestConfiguration.Builder().build();
    private final ArrayList zze = new ArrayList();

    private zzex() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzA(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rv rvVar = (rv) it.next();
            map.put(rvVar.s, new yv(rvVar.f8708t ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, rvVar.f8710v, rvVar.f8709u));
        }
        return new dh0(7, map);
    }

    private final void zzB(Context context, String str) {
        try {
            if (xx.f10736b == null) {
                xx.f10736b = new xx();
            }
            Object obj = null;
            if (xx.f10736b.f10737a.compareAndSet(false, true)) {
                new Thread(new wx(0, context, obj)).start();
            }
            this.zzi.zzk();
            this.zzi.zzl(null, new k3.b(null));
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("MobileAdsSettingManager initialization failed", e6);
        }
    }

    private final void zzC(Context context) {
        if (this.zzi == null) {
            this.zzi = (zzcz) new m(zzbc.zza(), context).d(context, false);
        }
    }

    private final void zzD(RequestConfiguration requestConfiguration) {
        try {
            this.zzi.zzu(new zzfv(requestConfiguration));
        } catch (RemoteException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set request configuration parcel.", e6);
        }
    }

    public static zzex zzf() {
        zzex zzexVar;
        synchronized (zzex.class) {
            try {
                if (zzb == null) {
                    zzb = new zzex();
                }
                zzexVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzexVar;
    }

    public static /* bridge */ /* synthetic */ Optional zzk(zzex zzexVar, zzft zzftVar) {
        String str = zzftVar.zza;
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return Optional.empty();
        }
        zzm zzmVar = zzftVar.zzc;
        final AdRequest.Builder builder = new AdRequest.Builder();
        List list = zzmVar.zze;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.addKeyword((String) it.next());
            }
        }
        builder.zzc(zzmVar.zzm);
        for (String str2 : zzmVar.zzn.keySet()) {
            builder.addCustomTargeting(str2, zzmVar.zzn.getString(str2));
        }
        builder.setAdString(zzmVar.zzx);
        Optional.ofNullable(zzmVar.zzl).ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.setContentUrl((String) obj);
            }
        });
        builder.setNeighboringContentUrls(zzmVar.zzv);
        builder.setRequestAgent(zzmVar.zzp);
        AdRequest adRequestBuild = builder.build();
        PreloadConfiguration.Builder builder2 = new PreloadConfiguration.Builder(str, adFormat);
        builder2.setAdRequest(adRequestBuild);
        builder2.setBufferSize(zzftVar.zzd);
        return Optional.of(builder2.build());
    }

    public final float zza() {
        synchronized (this.zzh) {
            zzcz zzczVar = this.zzi;
            float fZze = 1.0f;
            if (zzczVar == null) {
                return 1.0f;
            }
            try {
                fZze = zzczVar.zze();
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get app volume.", e6);
            }
            return fZze;
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzk;
    }

    public final InitializationStatus zze() {
        InitializationStatus initializationStatusZzA;
        synchronized (this.zzh) {
            try {
                com.google.android.gms.common.internal.l.h("MobileAds.initialize() must be called prior to getting initialization status.", this.zzi != null);
                try {
                    initializationStatusZzA = zzA(this.zzi.zzg());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get Initialization status.");
                    return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzem
                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            HashMap map = new HashMap();
                            map.put("com.google.android.gms.ads.MobileAds", new s());
                            return map;
                        }
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return initializationStatusZzA;
    }

    public final Status zzg(Context context, List list, PreloadCallback preloadCallback) {
        boolean z6;
        Status status;
        int bufferSize;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String strD = androidx.activity.m.d(String.valueOf(preloadConfiguration.getAdFormat()), "#", preloadConfiguration.getAdUnitId());
            map.put(strD, Integer.valueOf(((Integer) map.getOrDefault(strD, 0)).intValue() + 1));
        }
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z6 = false;
                break;
            }
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z6 = true;
                break;
            }
        }
        HashMap map2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                map2.compute(adFormat, new BiFunction() { // from class: com.google.android.gms.ads.internal.client.zzen
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        Integer num = (Integer) obj2;
                        Set set = zzex.zza;
                        return Integer.valueOf(num != null ? 1 + num.intValue() : 1);
                    }
                });
                if (preloadConfiguration2.getBufferSize() > 15) {
                    Locale locale = Locale.US;
                    hashSet.add("Preload configurations' buffer size exceeds the maximum limit 15 for " + adFormat.name());
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    Locale locale2 = Locale.US;
                    hashSet.add("Preload configurations' buffer size less than 0 for " + adFormat.name());
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            }
            z6 = true;
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AdFormat.APP_OPEN_AD, (Integer) zzbe.zzc().a(zn.B4)), new AbstractMap.SimpleEntry(AdFormat.INTERSTITIAL, (Integer) zzbe.zzc().a(zn.f11520z4)), new AbstractMap.SimpleEntry(AdFormat.REWARDED, (Integer) zzbe.zzc().a(zn.A4))};
        HashMap map3 = new HashMap(3);
        for (int i6 = 0; i6 < 3; i6++) {
            Map.Entry entry = entryArr[i6];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map3.put(key, value) != null) {
                key.toString();
                throw new IllegalArgumentException("duplicate key: ".concat(String.valueOf(key)));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        for (Map.Entry entry2 : map2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry2.getKey();
            int iIntValue = ((Integer) entry2.getValue()).intValue();
            Integer num = (Integer) mapUnmodifiableMap.getOrDefault(adFormat2, 0);
            if (iIntValue > num.intValue()) {
                Locale locale3 = Locale.US;
                hashSet.add("Preload configurations' size exceeds the maximum limit " + num + " for " + adFormat2.name());
                z6 = true;
            }
        }
        if (z6) {
            StringBuilder sb = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                if (it4.hasNext()) {
                    sb.append(", ");
                }
            }
            String string = sb.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzg(string);
            status = new Status(13, string, null, null);
        } else {
            status = Status.f2395w;
        }
        String str = status.f2399t;
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        com.google.android.gms.common.internal.l.a(str, status.s <= 0);
        zn.a(context);
        synchronized (this.zzd) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    PreloadConfiguration preloadConfiguration3 = (PreloadConfiguration) it5.next();
                    zzm zzmVarZza = zzr.zza.zza(context, preloadConfiguration3.getAdRequest().zza());
                    zzmVarZza.zzc.putBoolean("is_sdk_preload", true);
                    if (preloadConfiguration3.getBufferSize() <= 0) {
                        int iOrdinal = preloadConfiguration3.getAdFormat().ordinal();
                        bufferSize = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 1 : ((Integer) zzbe.zzc().a(zn.E)).intValue() : ((Integer) zzbe.zzc().a(zn.G)).intValue() : ((Integer) zzbe.zzc().a(zn.F)).intValue();
                    } else {
                        bufferSize = preloadConfiguration3.getBufferSize();
                    }
                    int iOrdinal2 = preloadConfiguration3.getAdFormat().ordinal();
                    int iMax = Math.max(Math.min(iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 5 ? 1 : ((Integer) zzbe.zzc().a(zn.B)).intValue() : ((Integer) zzbe.zzc().a(zn.D)).intValue() : ((Integer) zzbe.zzc().a(zn.C)).intValue(), 15), 1);
                    int iOrdinal3 = preloadConfiguration3.getAdFormat().ordinal();
                    arrayList.add(new zzft(preloadConfiguration3.getAdUnitId(), preloadConfiguration3.getAdFormat().getValue(), zzmVarZza, Math.max(Math.min(bufferSize, iMax), Math.min(iOrdinal3 != 1 ? iOrdinal3 != 2 ? iOrdinal3 != 5 ? 1 : ((Integer) zzbe.zzc().a(zn.H)).intValue() : ((Integer) zzbe.zzc().a(zn.J)).intValue() : ((Integer) zzbe.zzc().a(zn.I)).intValue(), iMax))));
                }
                try {
                    com.google.android.gms.ads.zzb.zza(context).zzi(arrayList, new r(this, preloadCallback));
                } catch (RemoteException e6) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to start preload.", e6);
                    return Status.f2396x;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Status.f2395w;
    }

    public final String zzi() {
        String strZzf;
        synchronized (this.zzh) {
            com.google.android.gms.common.internal.l.h("MobileAds.initialize() must be called prior to getting version string.", this.zzi != null);
            try {
                strZzf = this.zzi.zzf();
                if (strZzf == null) {
                    strZzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get internal version.", e6);
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
        }
        return strZzf;
    }

    public final void zzn(Context context) {
        synchronized (this.zzh) {
            zzC(context);
            try {
                this.zzi.zzi();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, RemoteException -> 0x005f, blocks: (B:25:0x0033, B:27:0x0053, B:37:0x006c, B:39:0x007e, B:41:0x0090, B:48:0x00d3, B:42:0x00a0, B:44:0x00ae, B:46:0x00c0, B:47:0x00cb, B:34:0x0061, B:36:0x0067), top: B:56:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, RemoteException -> 0x005f, blocks: (B:25:0x0033, B:27:0x0053, B:37:0x006c, B:39:0x007e, B:41:0x0090, B:48:0x00d3, B:42:0x00a0, B:44:0x00ae, B:46:0x00c0, B:47:0x00cb, B:34:0x0061, B:36:0x0067), top: B:56:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzo(final Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzc) {
            try {
                if (this.zzf) {
                    if (onInitializationCompleteListener != null) {
                        this.zze.add(onInitializationCompleteListener);
                    }
                    return;
                }
                if (this.zzg) {
                    if (onInitializationCompleteListener != null) {
                        onInitializationCompleteListener.onInitializationComplete(zze());
                    }
                    return;
                }
                this.zzf = true;
                if (onInitializationCompleteListener != null) {
                    this.zze.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.zzh) {
                    try {
                        zzC(context);
                        this.zzi.zzs(new u(this));
                        this.zzi.zzo(new dy());
                        if (this.zzk.getTagForChildDirectedTreatment() != -1 || this.zzk.getTagForUnderAgeOfConsent() != -1) {
                            zzD(this.zzk);
                        }
                    } catch (RemoteException e6) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("MobileAdsSettingManager initialization failed", e6);
                    } finally {
                    }
                    zn.a(context);
                    final String str2 = null;
                    if (((Boolean) pp.f8115a.c()).booleanValue()) {
                        if (((Boolean) zzbe.zzc().a(zn.Za)).booleanValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on bg thread");
                            com.google.android.gms.ads.internal.util.client.zzb.zza.execute(new Runnable(context, str2) { // from class: com.google.android.gms.ads.internal.client.zzeo
                                public final /* synthetic */ Context zzb;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zzp(this.zzb, null);
                                }
                            });
                        } else if (((Boolean) pp.f8116b.c()).booleanValue()) {
                            if (((Boolean) zzbe.zzc().a(zn.Za)).booleanValue()) {
                                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable(context, str2) { // from class: com.google.android.gms.ads.internal.client.zzep
                                    public final /* synthetic */ Context zzb;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.zza.zzq(this.zzb, null);
                                    }
                                });
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on calling thread");
                                zzB(context, null);
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final /* synthetic */ void zzp(Context context, String str) {
        synchronized (this.zzh) {
            zzB(context, null);
        }
    }

    public final /* synthetic */ void zzq(Context context, String str) {
        synchronized (this.zzh) {
            zzB(context, null);
        }
    }

    public final void zzr(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzh) {
            zzC(context);
            this.zzj = onAdInspectorClosedListener;
            try {
                this.zzi.zzm(new t(0));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzs(Context context, String str) {
        synchronized (this.zzh) {
            com.google.android.gms.common.internal.l.h("MobileAds.initialize() must be called prior to opening debug menu.", this.zzi != null);
            try {
                this.zzi.zzn(new k3.b(context), str);
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to open debug menu.", e6);
            }
        }
    }

    public final void zzt(Class cls) {
        synchronized (this.zzh) {
            try {
                this.zzi.zzh(cls.getCanonicalName());
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to register RtbAdapter", e6);
            }
        }
    }

    public final void zzu(boolean z6) {
        synchronized (this.zzh) {
            com.google.android.gms.common.internal.l.h("MobileAds.initialize() must be called prior to setting app muted state.", this.zzi != null);
            try {
                this.zzi.zzp(z6);
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set app mute state.", e6);
            }
        }
    }

    public final void zzv(float f6) {
        boolean z6 = true;
        com.google.android.gms.common.internal.l.a("The app volume must be a value between 0 and 1 inclusive.", f6 >= 0.0f && f6 <= 1.0f);
        synchronized (this.zzh) {
            if (this.zzi == null) {
                z6 = false;
            }
            com.google.android.gms.common.internal.l.h("MobileAds.initialize() must be called prior to setting the app volume.", z6);
            try {
                this.zzi.zzq(f6);
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set app volume.", e6);
            }
        }
    }

    public final void zzw(String str) {
        synchronized (this.zzh) {
            com.google.android.gms.common.internal.l.h("MobileAds.initialize() must be called prior to setting the plugin.", this.zzi != null);
            try {
                this.zzi.zzt(str);
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set plugin.", e6);
            }
        }
    }

    public final void zzx(RequestConfiguration requestConfiguration) {
        com.google.android.gms.common.internal.l.a("Null passed to setRequestConfiguration.", requestConfiguration != null);
        synchronized (this.zzh) {
            try {
                RequestConfiguration requestConfiguration2 = this.zzk;
                this.zzk = requestConfiguration;
                if (this.zzi == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    zzD(requestConfiguration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzy() {
        synchronized (this.zzh) {
            zzcz zzczVar = this.zzi;
            boolean zZzv = false;
            if (zzczVar == null) {
                return false;
            }
            try {
                zZzv = zzczVar.zzv();
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get app mute state.", e6);
            }
            return zZzv;
        }
    }

    public final boolean zzz(boolean z6) {
        synchronized (this.zzh) {
            try {
                com.google.android.gms.common.internal.l.h("MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.", this.zzi != null);
                try {
                    this.zzi.zzj(z6);
                } catch (RemoteException e6) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to " + (z6 ? "enable" : "disable") + " the publisher first-party ID.", e6);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
