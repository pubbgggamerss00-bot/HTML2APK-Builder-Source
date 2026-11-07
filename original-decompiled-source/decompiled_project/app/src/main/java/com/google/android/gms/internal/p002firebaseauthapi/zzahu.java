package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzahu implements zzaes {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzahu(String str, String str2, String str3) {
        p.d(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.zza);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }

    public final String zzb() {
        return this.zzb;
    }
}
