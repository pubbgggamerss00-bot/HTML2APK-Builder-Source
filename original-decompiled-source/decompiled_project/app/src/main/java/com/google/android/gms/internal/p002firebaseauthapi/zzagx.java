package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzagx implements zzagr {
    private String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzagx(String str, String str2, String str3, String str4, String str5) {
        p.d(str);
        this.zza = str;
        p.d(str2);
        this.zzb = str2;
        p.d(str3);
        this.zzc = str3;
        p.d(str4);
        this.zzd = str4;
        this.zze = str5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagr
    public final /* synthetic */ zzagr zza(String str) {
        this.zza = str;
        return this;
    }

    public static zzagx zza(String str, String str2, String str3, String str4, String str5) {
        return new zzagx(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("displayName", this.zzb);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(this.zzc)) {
            jSONObject2.put("sessionInfo", this.zzc);
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject2.put("verificationCode", this.zzd);
        }
        jSONObject.put("totpVerificationInfo", jSONObject2);
        if (!TextUtils.isEmpty(this.zze)) {
            jSONObject.put("tenantId", this.zze);
        }
        return jSONObject.toString();
    }
}
