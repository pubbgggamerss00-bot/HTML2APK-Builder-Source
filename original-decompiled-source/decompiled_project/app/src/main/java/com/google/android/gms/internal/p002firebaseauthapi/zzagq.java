package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import wa.f;

/* loaded from: classes2.dex */
public class zzagq implements zzaer<zzagq> {
    private static final String zza = "zzagq";
    private String zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagq zza(String str) throws zzaci {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("idToken"));
            this.zzc = f.a(jSONObject.optString("refreshToken"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzajc.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
