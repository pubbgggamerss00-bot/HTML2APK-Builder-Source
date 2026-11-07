package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import org.json.JSONException;
import org.json.JSONObject;
import qd.a;

/* loaded from: classes2.dex */
public final class zzahe implements zzaes {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private a zze;
    private String zzf;
    private String zzg;

    public zzahe(int i10) {
        this.zza = zza(i10);
    }

    public static zzahe zza(a aVar, String str, String str2) {
        p.d(str);
        p.d(str2);
        p.f(aVar);
        return new zzahe(7, aVar, null, str2, str, null, null);
    }

    public final a zzb() {
        return this.zze;
    }

    public final zzahe zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzahe zzd(String str) {
        p.d(str);
        this.zzd = str;
        return this;
    }

    public final zzahe zzb(String str) {
        p.d(str);
        this.zzb = str;
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    private zzahe(int i10, a aVar, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        p.f(aVar);
        this.zze = aVar;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzahe zza(a aVar) {
        p.f(aVar);
        this.zze = aVar;
        return this;
    }

    public final zzahe zza(String str) {
        this.zzg = str;
        return this;
    }

    private static String zza(int i10) {
        if (i10 == 1) {
            return "PASSWORD_RESET";
        }
        if (i10 == 4) {
            return "VERIFY_EMAIL";
        }
        if (i10 == 6) {
            return "EMAIL_SIGNIN";
        }
        if (i10 != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
        return "VERIFY_AND_CHANGE_EMAIL";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() throws JSONException {
        int i10;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.getClass();
        i10 = 1;
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i10 = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i10 = 7;
                break;
            case "EMAIL_SIGNIN":
                i10 = 6;
                break;
            default:
                i10 = 0;
                break;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        a aVar = this.zze;
        if (aVar != null) {
            jSONObject.put("androidInstallApp", aVar.f22649e);
            jSONObject.put("canHandleCodeInApp", this.zze.f22651g);
            String str5 = this.zze.f22645a;
            if (str5 != null) {
                jSONObject.put("continueUrl", str5);
            }
            String str6 = this.zze.f22646b;
            if (str6 != null) {
                jSONObject.put("iosBundleId", str6);
            }
            String str7 = this.zze.f22647c;
            if (str7 != null) {
                jSONObject.put("iosAppStoreId", str7);
            }
            String str8 = this.zze.f22648d;
            if (str8 != null) {
                jSONObject.put("androidPackageName", str8);
            }
            String str9 = this.zze.f22650f;
            if (str9 != null) {
                jSONObject.put("androidMinimumVersion", str9);
            }
            String str10 = this.zze.f22654k;
            if (str10 != null) {
                jSONObject.put("dynamicLinkDomain", str10);
            }
            String str11 = this.zze.f22655l;
            if (str11 != null) {
                jSONObject.put("linkDomain", str11);
            }
        }
        String str12 = this.zzf;
        if (str12 != null) {
            jSONObject.put("tenantId", str12);
        }
        String str13 = this.zzg;
        if (str13 != null) {
            zzajc.zza(jSONObject, "captchaResp", str13);
        } else {
            zzajc.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
