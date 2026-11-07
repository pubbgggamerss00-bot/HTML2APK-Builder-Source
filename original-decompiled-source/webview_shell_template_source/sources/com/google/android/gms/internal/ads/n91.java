package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n91 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7350a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7351b;

    public n91(String str, String str2) {
        this.f7350a = str;
        this.f7351b = str2;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectZzg = zzbs.zzg((JSONObject) obj, "pii");
            jSONObjectZzg.put("doritos", this.f7350a);
            jSONObjectZzg.put("doritos_v2", this.f7351b);
        } catch (JSONException unused) {
            zze.zza("Failed putting doritos string.");
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
