package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.ep;
import com.google.android.gms.internal.ads.wp;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends QueryInfoGenerationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaggingLibraryJsInterface f2385b;

    public e(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.f2384a = str;
        this.f2385b = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        boolean zBooleanValue = ((Boolean) wp.f10243a.c()).booleanValue();
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.f2385b;
        String strConcat = zBooleanValue ? ",\"as\":".concat(taggingLibraryJsInterface.zzk.zza().toString()) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        Locale locale = Locale.getDefault();
        ep epVar = wp.f10245c;
        final String str2 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", this.f2384a, str, Long.valueOf(((Boolean) epVar.c()).booleanValue() ? ((Long) wp.f10248f.c()).longValue() : 0L), strConcat);
        if (((Boolean) epVar.c()).booleanValue()) {
            try {
                taggingLibraryJsInterface.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.f2385b.zzb.evaluateJavascript(str2, null);
                    }
                });
            } catch (RuntimeException e6) {
                com.google.android.gms.ads.internal.zzv.zzp().g("TaggingLibraryJsInterface.getQueryInfo.onFailure", e6);
            }
        } else {
            taggingLibraryJsInterface.zzb.evaluateJavascript(str2, null);
        }
        if (((Boolean) wp.f10243a.c()).booleanValue() && ((Boolean) wp.f10244b.c()).booleanValue()) {
            taggingLibraryJsInterface.zzl.zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) throws JSONException {
        final String str;
        String str2 = this.f2384a;
        TaggingLibraryJsInterface taggingLibraryJsInterface = this.f2385b;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str2);
            jSONObject.put("signal", query);
            jSONObject.put("sdk_ttl_ms", ((Boolean) wp.f10245c.c()).booleanValue() ? ((Long) wp.f10248f.c()).longValue() : 0L);
            if (((Boolean) wp.f10243a.c()).booleanValue()) {
                jSONObject.put("as", taggingLibraryJsInterface.zzk.zza());
            }
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, queryInfo.getQuery(), Long.valueOf(((Boolean) wp.f10245c.c()).booleanValue() ? ((Long) wp.f10248f.c()).longValue() : 0L), ((Boolean) wp.f10243a.c()).booleanValue() ? ",\"as\":".concat(taggingLibraryJsInterface.zzk.zza().toString()) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        }
        if (((Boolean) wp.f10245c.c()).booleanValue()) {
            try {
                taggingLibraryJsInterface.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.f2385b.zzb.evaluateJavascript(str, null);
                    }
                });
            } catch (RuntimeException e6) {
                com.google.android.gms.ads.internal.zzv.zzp().g("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e6);
            }
        } else {
            taggingLibraryJsInterface.zzb.evaluateJavascript(str, null);
        }
        if (((Boolean) wp.f10243a.c()).booleanValue() && ((Boolean) wp.f10244b.c()).booleanValue()) {
            taggingLibraryJsInterface.zzl.zzb();
        }
    }
}
