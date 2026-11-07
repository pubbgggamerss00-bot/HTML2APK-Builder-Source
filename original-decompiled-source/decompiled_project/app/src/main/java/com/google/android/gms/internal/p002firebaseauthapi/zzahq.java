package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wa.f;

/* loaded from: classes2.dex */
public final class zzahq {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzair zze;

    private zzahq(String str, String str2, String str3, long j10, zzair zzairVar) {
        if (!TextUtils.isEmpty(str) && zzairVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        p.d(str2);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j10;
        this.zze = zzairVar;
    }

    private static long zza(String str) {
        try {
            return zzaoe.zza(zzaoe.zza(str));
        } catch (ParseException e10) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e10);
            return 0L;
        }
    }

    public final zzair zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public static zzahq zza(JSONObject jSONObject) {
        zzahq zzahqVar = new zzahq(f.a(jSONObject.optString("phoneInfo")), f.a(jSONObject.optString("mfaEnrollmentId")), f.a(jSONObject.optString("displayName")), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzair() : null);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzahqVar;
    }

    public static List<zzahq> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(zza(jSONArray.getJSONObject(i10)));
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
