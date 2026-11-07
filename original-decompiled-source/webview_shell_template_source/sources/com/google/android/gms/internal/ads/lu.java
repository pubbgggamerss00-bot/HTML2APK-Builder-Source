package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lu implements yt {
    public final Object s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f6852t = new HashMap();

    public final void a(String str, ku kuVar) {
        synchronized (this.s) {
            this.f6852t.put(str, kuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : "\n".concat(String.valueOf(str4));
        synchronized (this.s) {
            try {
                ku kuVar = (ku) this.f6852t.remove(str);
                if (kuVar == null) {
                    zzo.zzj("Received result for unexpected method invocation: " + str);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    kuVar.zza(str3 + strConcat);
                    return;
                }
                if (str5 == null) {
                    kuVar.a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (zze.zzc()) {
                        zze.zza("Result GMSG: " + jSONObject.toString(2));
                    }
                    kuVar.a(jSONObject);
                } catch (JSONException e6) {
                    kuVar.zza(e6.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
