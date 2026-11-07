package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gh1 {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f5045a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f5046b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f5047c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i6, int i7, int i8, int i9) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i6 / f5047c);
            jSONObject.put("y", i7 / f5047c);
            jSONObject.put("width", i8 / f5047c);
            jSONObject.put("height", i9 / f5047c);
            return jSONObject;
        } catch (JSONException e6) {
            d0.f("Error with creating viewStateObject", e6);
            return jSONObject;
        }
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    public static void c(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e6) {
            d0.f("JSONException during JSONObject.put for name [" + str + "]", e6);
        }
    }

    public static void d(JSONObject jSONObject) throws JSONException {
        float f6;
        float f7;
        if (f5045a != null) {
            Point point = new Point(0, 0);
            f5045a.getDefaultDisplay().getRealSize(point);
            float f8 = point.x;
            float f9 = f5047c;
            f6 = f8 / f9;
            f7 = point.y / f9;
        } else {
            f6 = 0.0f;
            f7 = 0.0f;
        }
        try {
            jSONObject.put("width", f6);
            jSONObject.put("height", f7);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray;
        int i6;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            int i7 = 0;
            while (true) {
                if (i7 < 4) {
                    String str = f5046b[i7];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i7++;
                } else if (jSONObject.optString("adSessionId", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(jSONObject2.optString("adSessionId", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (jSONArrayOptJSONArray2 == null && jSONArrayOptJSONArray3 == null) {
                        jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                        JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("childViews");
                        if (jSONArrayOptJSONArray != null) {
                        }
                        if (jSONArrayOptJSONArray != null) {
                            while (i6 < jSONArrayOptJSONArray.length()) {
                            }
                            return true;
                        }
                        while (i6 < jSONArrayOptJSONArray.length()) {
                        }
                        return true;
                    }
                    if ((jSONArrayOptJSONArray2 == null && jSONArrayOptJSONArray3 == null) || (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray2.length() == jSONArrayOptJSONArray3.length())) {
                        for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                            if (!jSONArrayOptJSONArray2.optString(i8, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(jSONArrayOptJSONArray3.optString(i8, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
                                break;
                            }
                        }
                        jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                        JSONArray jSONArrayOptJSONArray42 = jSONObject2.optJSONArray("childViews");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray42 == null) {
                            return true;
                        }
                        if ((jSONArrayOptJSONArray != null && jSONArrayOptJSONArray42 == null) || (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray42 != null && jSONArrayOptJSONArray.length() == jSONArrayOptJSONArray42.length())) {
                            for (i6 = 0; i6 < jSONArrayOptJSONArray.length(); i6++) {
                                if (e(jSONArrayOptJSONArray.optJSONObject(i6), jSONArrayOptJSONArray42.optJSONObject(i6))) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
