package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qd.n0;
import wa.f;

/* loaded from: classes2.dex */
public class zzahd implements zzaer<zzahd> {
    private static final String zza = "zzahd";
    private zzahf zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahd zza(String str) throws JSONException, zzaci {
        zzahf zzahfVar;
        int i10;
        zzahc zzahcVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzahfVar = new zzahf(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z10 = false;
                    int i11 = 0;
                    while (i11 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                        if (jSONObject2 == null) {
                            zzahcVar = new zzahc();
                            i10 = i11;
                        } else {
                            i10 = i11;
                            zzahcVar = new zzahc(f.a(jSONObject2.optString("localId", null)), f.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z10), f.a(jSONObject2.optString("displayName", null)), f.a(jSONObject2.optString("photoUrl", null)), zzahs.zza(jSONObject2.optJSONArray("providerUserInfo")), f.a(jSONObject2.optString("rawPassword", null)), f.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzahq.zza(jSONObject2.optJSONArray("mfaInfo")), n0.d(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzahcVar);
                        i11 = i10 + 1;
                        z10 = false;
                    }
                    zzahfVar = new zzahf(arrayList);
                }
            } else {
                zzahfVar = new zzahf();
            }
            this.zzb = zzahfVar;
            return this;
        } catch (NullPointerException e10) {
            e = e10;
            throw zzajc.zza(e, zza, str);
        } catch (JSONException e11) {
            e = e11;
            throw zzajc.zza(e, zza, str);
        }
    }

    public final List<zzahc> zza() {
        return this.zzb.zza();
    }
}
