package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzaha implements zzaes {
    private String zza;

    public zzaha(String str) {
        p.d(str);
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        return jSONObject.toString();
    }
}
