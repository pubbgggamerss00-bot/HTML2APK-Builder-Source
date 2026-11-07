package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.cf1;
import com.google.android.gms.internal.ads.dn;
import com.google.android.gms.internal.ads.fc1;
import com.google.android.gms.internal.ads.fu0;
import com.google.android.gms.internal.ads.hs1;
import com.google.android.gms.internal.ads.i70;
import com.google.android.gms.internal.ads.mf;
import com.google.android.gms.internal.ads.nf;
import com.google.android.gms.internal.ads.wp;
import com.google.android.gms.internal.ads.zn;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final mf zzc;
    private final fc1 zzd;
    private final int zze;
    private final fu0 zzf;
    private final boolean zzg;
    private final hs1 zzh = i70.f5591f;
    private final cf1 zzi;
    private final zzo zzj;
    private final zzf zzk;
    private final zzj zzl;

    public TaggingLibraryJsInterface(WebView webView, mf mfVar, fu0 fu0Var, cf1 cf1Var, fc1 fc1Var, zzo zzoVar, zzf zzfVar, zzj zzjVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = mfVar;
        this.zzf = fu0Var;
        zn.a(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.v9)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.w9)).booleanValue();
        this.zzi = cf1Var;
        this.zzd = fc1Var;
        this.zzj = zzoVar;
        this.zzk = zzfVar;
        this.zzl = zzjVar;
    }

    @JavascriptInterface
    @TargetApi(dn.zzm)
    public String getClickSignals(String str) {
        try {
            long jA = com.google.android.gms.ads.internal.zzv.zzC().a();
            String strZzd = this.zzc.f7110b.zzd(this.zza, str, this.zzb);
            if (!this.zzg) {
                return strZzd;
            }
            zzaa.zzd(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a() - jA)));
            return strZzd;
        } catch (RuntimeException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals. ", e6);
            com.google.android.gms.ads.internal.zzv.zzp().h("TaggingLibraryJsInterface.getClickSignals", e6);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @TargetApi(dn.zzm)
    public String getClickSignalsWithTimeout(final String str, int i6) {
        if (i6 <= 0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid timeout for getting click signals. Timeout=" + i6);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            return (String) i70.f5586a.u(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i6, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals with timeout. ", e6);
            com.google.android.gms.ads.internal.zzv.zzp().h("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e6);
            return e6 instanceof TimeoutException ? "17" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    @TargetApi(dn.zzm)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzv.zzq();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final e eVar = new e(this, string);
        if (((Boolean) wp.f10245c.c()).booleanValue()) {
            this.zzj.zzg(this.zzb, eVar);
            return string;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.y9)).booleanValue()) {
            this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbr
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze(bundle, eVar);
                }
            });
            return string;
        }
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), eVar);
        return string;
    }

    @JavascriptInterface
    @TargetApi(dn.zzm)
    public String getViewSignals() {
        try {
            long jA = com.google.android.gms.ads.internal.zzv.zzC().a();
            String strZzh = this.zzc.f7110b.zzh(this.zza, this.zzb, null);
            if (!this.zzg) {
                return strZzh;
            }
            zzaa.zzd(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().a() - jA)));
            return strZzh;
        } catch (RuntimeException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals. ", e6);
            com.google.android.gms.ads.internal.zzv.zzp().h("TaggingLibraryJsInterface.getViewSignals", e6);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @TargetApi(dn.zzm)
    public String getViewSignalsWithTimeout(int i6) {
        if (i6 <= 0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid timeout for getting view signals. Timeout=" + i6);
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            return (String) i70.f5586a.u(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i6, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals with timeout. ", e6);
            com.google.android.gms.ads.internal.zzv.zzp().h("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e6);
            return e6 instanceof TimeoutException ? "17" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
    }

    @JavascriptInterface
    @TargetApi(dn.zzm)
    public void recordClick(final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.A9)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        i70.f5586a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(str);
            }
        });
    }

    @JavascriptInterface
    @TargetApi(dn.zzm)
    public void reportTouchEvent(String str) throws JSONException {
        int i6;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i7 = jSONObject.getInt("x");
            int i8 = jSONObject.getInt("y");
            int i9 = jSONObject.getInt("duration_ms");
            float f6 = (float) jSONObject.getDouble("force");
            int i10 = jSONObject.getInt("type");
            if (i10 != 0) {
                i6 = 1;
                if (i10 != 1) {
                    i6 = 2;
                    if (i10 != 2) {
                        i6 = 3;
                        if (i10 != 3) {
                            i6 = -1;
                        }
                    }
                }
            } else {
                i6 = 0;
            }
            try {
                this.zzc.f7110b.zzk(MotionEvent.obtain(0L, i9, i6, i7, i8, f6, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e6) {
                e = e6;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzv.zzp().h("TaggingLibraryJsInterface.reportTouchEvent", e);
            } catch (JSONException e7) {
                e = e7;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzv.zzp().h("TaggingLibraryJsInterface.reportTouchEvent", e);
            }
        } catch (RuntimeException | JSONException e8) {
            e = e8;
        }
    }

    public final /* synthetic */ void zze(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzv.zzr().zza(this.zza);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzf(String str) {
        fc1 fc1Var;
        Uri uriA = Uri.parse(str);
        try {
            uriA = (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().a(zn.Rb)).booleanValue() || (fc1Var = this.zzd) == null) ? this.zzc.a(uriA, this.zza, this.zzb, null) : fc1Var.a(uriA, this.zza, this.zzb, null);
        } catch (nf e6) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to append the click signal to URL: ", e6);
            com.google.android.gms.ads.internal.zzv.zzp().h("TaggingLibraryJsInterface.recordClick", e6);
        }
        this.zzi.a(uriA.toString(), null, null);
    }
}
