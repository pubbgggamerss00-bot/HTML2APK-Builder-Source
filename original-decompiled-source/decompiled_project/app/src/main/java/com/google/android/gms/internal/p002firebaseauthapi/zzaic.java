package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import wa.f;

/* loaded from: classes2.dex */
public class zzaic implements zzaer<zzaic> {
    private static final String zza = "zzaic";
    private String zzb;
    private zzahs zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaic zza(String str) throws zzaci {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("email"));
            f.a(jSONObject.optString("passwordHash"));
            jSONObject.optBoolean("emailVerified", false);
            f.a(jSONObject.optString("displayName"));
            f.a(jSONObject.optString("photoUrl"));
            this.zzc = zzahs.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzd = f.a(jSONObject.optString("idToken"));
            this.zze = f.a(jSONObject.optString("refreshToken"));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzajc.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzaht> zze() {
        zzahs zzahsVar = this.zzc;
        if (zzahsVar != null) {
            return zzahsVar.zza();
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }
}
