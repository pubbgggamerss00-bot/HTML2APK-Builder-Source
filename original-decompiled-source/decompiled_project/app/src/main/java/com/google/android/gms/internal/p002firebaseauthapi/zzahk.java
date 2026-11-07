package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.p;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wa.f;

/* loaded from: classes2.dex */
public class zzahk implements zzaer<zzahk> {
    private static final String zza = "zzahk";
    private String zzb;
    private zzaj<zzahv> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahk zza(String str) throws JSONException, zzaci {
        zzaj<zzahv> zzajVarZza;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzajVarZza = zzaj.zza(new ArrayList());
                } else {
                    zzam zzamVarZzg = zzaj.zzg();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                        zzamVarZzg.zza(jSONObject2 == null ? zzahv.zza(null, null) : zzahv.zza(f.a(jSONObject2.optString("provider")), f.a(jSONObject2.optString("enforcementState"))));
                    }
                    zzajVarZza = zzamVarZzg.zza();
                }
                this.zzc = zzajVarZza;
            }
            return this;
        } catch (NullPointerException e10) {
            e = e10;
            throw zzajc.zza(e, zza, str);
        } catch (JSONException e11) {
            e = e11;
            throw zzajc.zza(e, zza, str);
        }
    }

    public final String zzb(String str) {
        p.d(str);
        zzaj<zzahv> zzajVar = this.zzc;
        if (zzajVar == null || zzajVar.isEmpty()) {
            return null;
        }
        zzaj<zzahv> zzajVar2 = this.zzc;
        int size = zzajVar2.size();
        int i10 = 0;
        while (i10 < size) {
            zzahv zzahvVar = zzajVar2.get(i10);
            i10++;
            zzahv zzahvVar2 = zzahvVar;
            String strZza = zzahvVar2.zza();
            String strZzb = zzahvVar2.zzb();
            if (strZza != null && strZzb != null && strZzb.equals(str)) {
                return zzahvVar2.zza();
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String strZzb = zzb(str);
        if (strZzb == null) {
            return false;
        }
        return strZzb.equals("ENFORCE") || strZzb.equals("AUDIT");
    }

    public final String zza() {
        return this.zzb;
    }
}
