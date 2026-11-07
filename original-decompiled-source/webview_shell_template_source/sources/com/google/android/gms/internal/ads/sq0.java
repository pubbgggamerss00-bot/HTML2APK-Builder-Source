package com.google.android.gms.internal.ads;

import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class sq0 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        JSONArray jSONArray = (JSONArray) obj;
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i6);
            if (jSONObjectOptJSONObject.optString("key").equals("afma_video_player_type")) {
                return jSONObjectOptJSONObject.optString("value");
            }
        }
        return null;
    }
}
