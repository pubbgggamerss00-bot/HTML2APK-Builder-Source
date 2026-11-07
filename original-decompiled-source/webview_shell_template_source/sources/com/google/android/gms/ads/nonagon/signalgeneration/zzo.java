package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.fu0;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.wp;
import com.google.android.gms.internal.ads.zn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzo {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final fu0 zzd;
    private final ExecutorService zze;

    public zzo(Context context, fu0 fu0Var, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = fu0Var;
        this.zze = executorService;
    }

    private final void zzh(final boolean z6) {
        Map map = this.zzb;
        Boolean boolValueOf = Boolean.valueOf(z6);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        this.zzb.put(boolValueOf, new ArrayList());
        this.zze.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zzc(z6);
            }
        });
    }

    private final void zzi(zzq zzqVar, Pair pair, boolean z6) {
        zzqVar.zzd();
        QueryInfo queryInfoZzb = zzqVar.zzb();
        if (queryInfoZzb != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(queryInfoZzb);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzqVar.zzc());
        }
        zzaa.zzd(this.zzd, null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzv.zzC().a() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z6)), new Pair("sgpc_rs", Boolean.toString(zzqVar.zzb() != null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzd(boolean z6, boolean z7) throws Throwable {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z6);
                Map map = this.zza;
                Boolean boolValueOf = Boolean.valueOf(z6);
                zzq zzqVar = (zzq) map.get(boolValueOf);
                int iZza = 0;
                if (z7 && zzqVar != null) {
                    try {
                        iZza = zzqVar.zza() + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                int i6 = iZza;
                zzq zzqVar2 = (zzq) this.zza.get(boolValueOf);
                final zzp zzpVar = new zzp(this, z6, i6, zzqVar2 == null ? null : Boolean.valueOf(zzqVar2.zzf()), this.zzd);
                final AdRequest adRequestBuild = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Va)).booleanValue()) {
                    this.zze.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zza(adRequestBuild, zzpVar);
                        }
                    });
                } else {
                    QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequestBuild, zzpVar);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final /* synthetic */ Object zza(AdRequest adRequest, zzp zzpVar) {
        QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest, zzpVar);
        return Boolean.TRUE;
    }

    public final synchronized void zzb() {
        zzh(true);
        zzh(false);
    }

    public final /* synthetic */ void zzc(boolean z6) throws Throwable {
        zzd(z6, false);
    }

    public final /* synthetic */ void zze(Object obj, Pair pair) {
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof WebView) {
            CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzv.zzr().zza(this.zzc);
            if (cookieManagerZza != null) {
                zAcceptThirdPartyCookies = cookieManagerZza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.zza;
        Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
        zzq zzqVar = (zzq) map.get(boolValueOf);
        if (zzqVar != null && !zzqVar.zze()) {
            zzi(zzqVar, pair, true);
            return;
        }
        List arrayList = (List) this.zzb.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.zzb.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    public final synchronized void zzf(final boolean z6, zzq zzqVar) {
        try {
            Map map = this.zza;
            Boolean boolValueOf = Boolean.valueOf(z6);
            zzq zzqVar2 = (zzq) map.get(boolValueOf);
            if (zzqVar2 == null || zzqVar2.zze() || zzqVar2.zzb() == null || zzqVar.zzb() != null) {
                this.zza.put(boolValueOf, zzqVar);
            }
            long jLongValue = (zzqVar.zzb() != null ? (Long) wp.f10246d.c() : (Long) wp.f10247e.c()).longValue();
            final boolean z7 = zzqVar.zzb() == null;
            i70.f5589d.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.zza.zzd(z6, z7);
                }
            }, jLongValue, TimeUnit.SECONDS);
            List list = (List) this.zzb.get(boolValueOf);
            this.zzb.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzi(zzqVar, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final synchronized void zzg(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a()));
        i70.f5591f.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze(obj, pair);
            }
        });
    }
}
