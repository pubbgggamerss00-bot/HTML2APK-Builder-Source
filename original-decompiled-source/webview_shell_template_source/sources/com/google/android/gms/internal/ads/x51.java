package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x51 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10387a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10388b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10389c;

    public /* synthetic */ x51(String str, int i6, int i7) {
        this.f10387a = i7;
        this.f10388b = str;
        this.f10389c = i6;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) throws JSONException {
        int i6;
        int i7;
        switch (this.f10387a) {
            case 0:
                Bundle bundle = ((ck0) obj).f3610a;
                String str = this.f10388b;
                if (!TextUtils.isEmpty(str) && (i6 = this.f10389c) != -1) {
                    Bundle bundleA = lc1.a("pii", bundle);
                    bundle.putBundle("pii", bundleA);
                    bundleA.putString("pvid", str);
                    bundleA.putInt("pvid_s", i6);
                    break;
                }
                break;
            default:
                JSONObject jSONObject = (JSONObject) obj;
                String str2 = this.f10388b;
                if (!TextUtils.isEmpty(str2) && (i7 = this.f10389c) != -1) {
                    try {
                        JSONObject jSONObjectZzg = zzbs.zzg(jSONObject, "pii");
                        jSONObjectZzg.put("pvid", str2);
                        jSONObjectZzg.put("pvid_s", i7);
                        break;
                    } catch (JSONException e6) {
                        zze.zzb("Failed putting gms core app set ID info.", e6);
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        int i6 = this.f10387a;
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }
}
