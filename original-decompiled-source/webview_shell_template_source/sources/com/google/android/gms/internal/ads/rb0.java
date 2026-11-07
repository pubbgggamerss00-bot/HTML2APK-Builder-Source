package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rb0 {

    /* renamed from: a, reason: collision with root package name */
    public final mb0 f8601a;

    /* renamed from: b, reason: collision with root package name */
    public final ck1 f8602b;

    public rb0(mb0 mb0Var, ck1 ck1Var) {
        this.f8602b = ck1Var;
        this.f8601a = mb0Var;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        mb0 mb0Var = this.f8601a;
        mf mfVarB = mb0Var.b();
        if (mfVarB == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        ff ffVar = mfVarB.f7110b;
        if (ffVar == null) {
            zze.zza("Signals object is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (mb0Var.getContext() != null) {
            return ffVar.zze(mb0Var.getContext(), str, mb0Var.zzF(), mb0Var.s.f3029a);
        }
        zze.zza("Context is null, ignoring.");
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @JavascriptInterface
    public String getViewSignals() {
        mb0 mb0Var = this.f8601a;
        mf mfVarB = mb0Var.b();
        if (mfVarB == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        ff ffVar = mfVarB.f7110b;
        if (ffVar == null) {
            zze.zza("Signals object is empty, ignoring.");
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (mb0Var.getContext() != null) {
            return ffVar.zzh(mb0Var.getContext(), mb0Var.zzF(), mb0Var.s.f3029a);
        }
        zze.zza("Context is null, ignoring.");
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzo.zzj("URL is empty, ignoring message");
        } else {
            zzs.zza.post(new ow(2, this, str));
        }
    }
}
