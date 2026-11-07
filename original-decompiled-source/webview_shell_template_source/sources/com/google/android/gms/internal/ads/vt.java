package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vt implements yt {
    @Override // com.google.android.gms.internal.ads.yt
    public final /* bridge */ /* synthetic */ void d(Object obj, Map map) {
        xa0 xa0Var = (xa0) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(xa0Var.getContext()).edit();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                editorEdit.remove(jSONArray.getString(i6));
            }
            editorEdit.apply();
        } catch (JSONException e6) {
            zzv.zzp().h("GMSG clear local storage keys handler", e6);
        }
    }
}
