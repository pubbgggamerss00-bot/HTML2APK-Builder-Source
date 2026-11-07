package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g91 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final AdvertisingIdClient.Info f4953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4954b;

    /* renamed from: c, reason: collision with root package name */
    public final y2 f4955c;

    public g91(AdvertisingIdClient.Info info, String str, y2 y2Var) {
        this.f4953a = info;
        this.f4954b = str;
        this.f4955c = y2Var;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final void a(Object obj) throws JSONException {
        y2 y2Var = this.f4955c;
        long j6 = y2Var.f10780a;
        try {
            JSONObject jSONObjectZzg = zzbs.zzg((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.f4953a;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.f4954b;
                if (str != null) {
                    jSONObjectZzg.put("pdid", str);
                    jSONObjectZzg.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzg.put("rdid", info.getId());
            jSONObjectZzg.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectZzg.put("idtype", "adid");
            String str2 = (String) y2Var.f10781b;
            if (str2 != null && j6 > 0) {
                jSONObjectZzg.put("paidv1_id_android_3p", str2);
                jSONObjectZzg.put("paidv1_creation_time_android_3p", j6);
            }
        } catch (JSONException e6) {
            zze.zzb("Failed putting Ad ID.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
