package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v91 implements p81 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9760a;

    public v91(HashMap map) {
        this.f9760a = map;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* bridge */ /* synthetic */ void a(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("video_decoders", zzbc.zzb().zzj(this.f9760a));
        } catch (JSONException e6) {
            zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e6.getMessage())));
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final /* synthetic */ void zza(Object obj) {
    }
}
