package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.c1;
import com.google.android.gms.common.internal.p;
import org.json.JSONException;
import org.json.JSONObject;
import qa.a;
import wa.f;

/* loaded from: classes2.dex */
public class zzahn extends a implements zzaer<zzahn> {
    public static final Parcelable.Creator<zzahn> CREATOR = new zzahm();
    private static final String zza = "zzahn";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzahn() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahn zza(String str) throws zzaci {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("refresh_token"));
            this.zzc = f.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = f.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzajc.zza(e10, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iQ = c1.q(20293, parcel);
        c1.m(parcel, 2, this.zzb, false);
        c1.m(parcel, 3, this.zzc, false);
        c1.k(parcel, 4, Long.valueOf(zza()));
        c1.m(parcel, 5, this.zze, false);
        Long l10 = this.zzf;
        l10.getClass();
        c1.k(parcel, 6, l10);
        c1.r(iQ, parcel);
    }

    public final long zza() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzaag(e10);
        }
    }

    public final boolean zzg() {
        return System.currentTimeMillis() + 300000 < (this.zzd.longValue() * 1000) + this.zzf.longValue();
    }

    public static zzahn zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahn zzahnVar = new zzahn();
            zzahnVar.zzb = jSONObject.optString("refresh_token", null);
            zzahnVar.zzc = jSONObject.optString("access_token", null);
            zzahnVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahnVar.zze = jSONObject.optString("token_type", null);
            zzahnVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahnVar;
        } catch (JSONException e10) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzaag(e10);
        }
    }

    public final void zzc(String str) {
        p.d(str);
        this.zzb = str;
    }

    public zzahn(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzahn(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }

    public final String zzd() {
        return this.zzb;
    }
}
