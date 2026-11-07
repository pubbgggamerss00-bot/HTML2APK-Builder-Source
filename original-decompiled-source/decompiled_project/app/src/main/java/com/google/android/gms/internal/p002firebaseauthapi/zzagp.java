package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import com.google.android.gms.common.internal.p;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b;
import qd.d;

/* loaded from: classes2.dex */
public class zzagp implements zzaes {
    private static final String zza = "zzagp";
    private final String zzb;
    private final String zzc;
    private final d zzd;
    private final String zze;
    private final String zzf;

    static {
        String[] strArr = new String[0];
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str);
            }
            sb.append("] ");
        }
        for (int i10 = 2; i10 <= 7 && !Log.isLoggable(zza, i10); i10++) {
        }
    }

    public zzagp(d dVar, String str, String str2) {
        p.f(dVar);
        this.zzd = dVar;
        String str3 = dVar.f22665a;
        p.d(str3);
        this.zzb = str3;
        String str4 = dVar.f22667c;
        p.d(str4);
        this.zzc = str4;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        b bVar;
        String str = this.zzc;
        int i10 = b.f22656c;
        p.d(str);
        try {
            bVar = new b(str);
        } catch (IllegalArgumentException unused) {
            bVar = null;
        }
        String str2 = bVar != null ? bVar.f22657a : null;
        String str3 = bVar != null ? bVar.f22658b : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzajc.zza(jSONObject, "captchaResp", str5);
        } else {
            zzajc.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final d zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
