package com.htmltoapk.template;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class AlarmStore {
    public static final AlarmStore INSTANCE = new AlarmStore();
    private static final String PREFS = "htmltoapk_alarms";

    private AlarmStore() {
    }

    public final List<AlarmRecord> all(Context context) {
        AlarmRecord alarmRecord;
        kotlin.jvm.internal.j.e("context", context);
        try {
            Map<String, ?> all = context.getSharedPreferences(PREFS, 0).getAll();
            kotlin.jvm.internal.j.d("getAll(...)", all);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                try {
                    kotlin.jvm.internal.j.c("null cannot be cast to non-null type kotlin.String", value);
                    JSONObject jSONObject = new JSONObject((String) value);
                    kotlin.jvm.internal.j.b(key);
                    String strOptString = jSONObject.optString("title");
                    kotlin.jvm.internal.j.d("optString(...)", strOptString);
                    String strOptString2 = jSONObject.optString("message");
                    kotlin.jvm.internal.j.d("optString(...)", strOptString2);
                    alarmRecord = new AlarmRecord(key, strOptString, strOptString2, jSONObject.optLong("triggerAt"), jSONObject.optLong("repeat"));
                } catch (Exception e6) {
                    Log.w("AlarmStore", "skipping corrupt record '" + key + "': " + e6.getMessage());
                    alarmRecord = null;
                }
                if (alarmRecord != null) {
                    arrayList.add(alarmRecord);
                }
            }
            return arrayList;
        } catch (Exception e7) {
            Log.w("AlarmStore", "kayitli hatirlatmalar okunamadi: " + e7.getMessage());
            return e5.s.s;
        }
    }

    public final void remove(Context context, String str) {
        kotlin.jvm.internal.j.e("context", context);
        kotlin.jvm.internal.j.e("id", str);
        try {
            context.getSharedPreferences(PREFS, 0).edit().remove(str).apply();
        } catch (Exception e6) {
            Log.w("AlarmStore", "remove failed: " + e6.getMessage());
        }
    }

    public final void save(Context context, String str, String str2, String str3, long j6, long j7) throws JSONException {
        kotlin.jvm.internal.j.e("context", context);
        kotlin.jvm.internal.j.e("id", str);
        kotlin.jvm.internal.j.e("title", str2);
        kotlin.jvm.internal.j.e("message", str3);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("title", str2);
            jSONObject.put("message", str3);
            jSONObject.put("triggerAt", j6);
            jSONObject.put("repeat", j7);
            context.getSharedPreferences(PREFS, 0).edit().putString(str, jSONObject.toString()).apply();
        } catch (Exception e6) {
            Log.w("AlarmStore", "save failed: " + e6.getMessage());
        }
    }
}
