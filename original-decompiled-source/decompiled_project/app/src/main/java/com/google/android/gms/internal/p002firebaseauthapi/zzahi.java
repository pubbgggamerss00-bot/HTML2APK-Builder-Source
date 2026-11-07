package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class zzahi implements zzaer<zzahi> {
    private static final String zza = "zzahi";
    private List<String> zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahi zza(String str) throws zzaci {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.zzb.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            return this;
        } catch (JSONException e10) {
            throw zzajc.zza(e10, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
