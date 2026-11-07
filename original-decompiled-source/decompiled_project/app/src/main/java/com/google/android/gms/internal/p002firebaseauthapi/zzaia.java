package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import wa.f;

/* loaded from: classes2.dex */
public class zzaia implements zzaer<zzaia> {
    private static final String zza = "zzaia";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaia zza(String str) throws zzaci {
        try {
            this.zzb = f.a(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzajc.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
