package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ut implements yt {
    @Override // com.google.android.gms.internal.ads.yt
    public final /* bridge */ /* synthetic */ void d(Object obj, Map map) throws JSONException {
        xa0 xa0Var = (xa0) obj;
        try {
            JSONObject jSONObject = new JSONObject((String) map.get("args"));
            Iterator<String> itKeys = jSONObject.keys();
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(xa0Var.getContext()).edit();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj2 = jSONObject.get(next);
                if (obj2 instanceof Integer) {
                    editorEdit.putInt(next, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    editorEdit.putLong(next, ((Long) obj2).longValue());
                } else if (obj2 instanceof Double) {
                    editorEdit.putFloat(next, ((Double) obj2).floatValue());
                } else if (obj2 instanceof Float) {
                    editorEdit.putFloat(next, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Boolean) {
                    editorEdit.putBoolean(next, ((Boolean) obj2).booleanValue());
                } else if (obj2 instanceof String) {
                    editorEdit.putString(next, (String) obj2);
                }
            }
            editorEdit.apply();
        } catch (JSONException e6) {
            zzv.zzp().h("GMSG write local storage KV pairs handler", e6);
        }
    }
}
