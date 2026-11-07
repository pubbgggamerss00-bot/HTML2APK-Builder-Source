package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import qd.w0;
import wa.f;

/* loaded from: classes2.dex */
public class zzaiv implements zzaer<zzaiv> {
    private static final String zza = "zzaiv";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private List<zzahq> zzp;
    private String zzq;

    public final long zza() {
        return this.zze;
    }

    public final w0 zzb() {
        if (TextUtils.isEmpty(this.zzj) && TextUtils.isEmpty(this.zzk)) {
            return null;
        }
        String str = this.zzg;
        String str2 = this.zzk;
        String str3 = this.zzj;
        String str4 = this.zzn;
        String str5 = this.zzl;
        p.e(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new w0(str, str2, str3, null, str4, str5, null);
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final String zzh() {
        return this.zzh;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzo;
    }

    public final List<zzahq> zzk() {
        return this.zzp;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzq);
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzi;
    }

    public final boolean zzo() {
        return this.zzb || !TextUtils.isEmpty(this.zzm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaiv zza(String str) throws zzaci {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = f.a(jSONObject.optString("idToken", null));
            this.zzd = f.a(jSONObject.optString("refreshToken", null));
            this.zze = jSONObject.optLong("expiresIn", 0L);
            f.a(jSONObject.optString("localId", null));
            this.zzf = f.a(jSONObject.optString("email", null));
            f.a(jSONObject.optString("displayName", null));
            f.a(jSONObject.optString("photoUrl", null));
            this.zzg = f.a(jSONObject.optString("providerId", null));
            this.zzh = f.a(jSONObject.optString("rawUserInfo", null));
            this.zzi = jSONObject.optBoolean("isNewUser", false);
            this.zzj = jSONObject.optString("oauthAccessToken", null);
            this.zzk = jSONObject.optString("oauthIdToken", null);
            this.zzm = f.a(jSONObject.optString("errorMessage", null));
            this.zzn = f.a(jSONObject.optString("pendingToken", null));
            this.zzo = f.a(jSONObject.optString("tenantId", null));
            this.zzp = zzahq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzq = f.a(jSONObject.optString("mfaPendingCredential", null));
            this.zzl = f.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzajc.zza(e10, zza, str);
        }
    }
}
