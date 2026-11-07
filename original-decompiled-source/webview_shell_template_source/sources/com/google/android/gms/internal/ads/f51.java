package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f51 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4489a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4490b;

    public /* synthetic */ f51(String str, int i6) {
        this.f4489a = i6;
        this.f4490b = str;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) throws JSONException {
        switch (this.f4489a) {
            case 0:
                ((ck0) obj).f3610a.putString("ms", this.f4490b);
                break;
            case 1:
                try {
                    ((JSONObject) obj).put("ms", this.f4490b);
                    break;
                } catch (JSONException e6) {
                    zze.zzb("Failed putting Ad ID.", e6);
                    return;
                }
            default:
                String str = this.f4490b;
                JSONObject jSONObject = (JSONObject) obj;
                try {
                    if (!TextUtils.isEmpty(str)) {
                        zzbs.zzg(jSONObject, "pii").put("adsid", str);
                        break;
                    }
                } catch (JSONException e7) {
                    zzo.zzk("Failed putting trustless token.", e7);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
        int i6 = this.f4489a;
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    private final /* synthetic */ void d(Object obj) {
    }
}
