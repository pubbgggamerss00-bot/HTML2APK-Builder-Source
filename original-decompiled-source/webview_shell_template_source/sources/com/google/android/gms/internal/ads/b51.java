package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b51 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2925a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2926b;

    public /* synthetic */ b51(int i6, Object obj) {
        this.f2925a = i6;
        this.f2926b = obj;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) throws JSONException {
        switch (this.f2925a) {
            case 0:
                String str = (String) this.f2926b;
                ck0 ck0Var = (ck0) obj;
                if (str != null) {
                    ck0Var.f3610a.putString("arek", str);
                    break;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                Bundle bundle = (Bundle) this.f2926b;
                if (bundle != null) {
                    try {
                        zzbs.zzg(zzbs.zzg(jSONObject, "device"), "play_store").put("parental_controls", zzbc.zzb().zzi(bundle));
                        break;
                    } catch (JSONException unused) {
                        zze.zza("Failed putting parental controls bundle.");
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        int i6 = this.f2925a;
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }
}
