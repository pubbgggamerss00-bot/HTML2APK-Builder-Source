package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzaiy implements zzaes {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaiy() {
    }

    public static zzaiy zza(String str, String str2, boolean z10) {
        zzaiy zzaiyVar = new zzaiy();
        p.d(str);
        zzaiyVar.zzb = str;
        p.d(str2);
        zzaiyVar.zzc = str2;
        zzaiyVar.zzf = z10;
        return zzaiyVar;
    }

    public static zzaiy zzb(String str, String str2, boolean z10) {
        zzaiy zzaiyVar = new zzaiy();
        p.d(str);
        zzaiyVar.zza = str;
        p.d(str2);
        zzaiyVar.zzd = str2;
        zzaiyVar.zzf = z10;
        return zzaiyVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
