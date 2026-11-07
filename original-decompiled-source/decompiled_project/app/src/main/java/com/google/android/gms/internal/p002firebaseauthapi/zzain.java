package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzain extends zzaij {
    private static final String zza = "zzain";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzain zza(String str) throws zzaci {
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (jSONObjectOptJSONObject == null) {
                return this;
            }
            this.zzb = zzae.zza(jSONObjectOptJSONObject.optString("sessionInfo"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzajc.zza(e10, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij, com.google.android.gms.internal.p002firebaseauthapi.zzaer
    public final /* synthetic */ zzaer zza(String str) throws zzaci {
        return (zzain) zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaij
    public final String zza() {
        return this.zzb;
    }
}
