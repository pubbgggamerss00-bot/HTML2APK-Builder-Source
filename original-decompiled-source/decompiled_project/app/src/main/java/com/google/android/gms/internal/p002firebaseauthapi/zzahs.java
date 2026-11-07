package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wa.f;

/* loaded from: classes2.dex */
public final class zzahs {
    private List<zzaht> zza;

    public zzahs() {
        this.zza = new ArrayList();
    }

    public static zzahs zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzahs(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(jSONObject == null ? new zzaht() : new zzaht(f.a(jSONObject.optString("federatedId")), f.a(jSONObject.optString("displayName")), f.a(jSONObject.optString("photoUrl")), f.a(jSONObject.optString("providerId")), null, f.a(jSONObject.optString("phoneNumber")), f.a(jSONObject.optString("email"))));
        }
        return new zzahs(arrayList);
    }

    private zzahs(List<zzaht> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.EMPTY_LIST;
        }
    }

    public final List<zzaht> zza() {
        return this.zza;
    }
}
