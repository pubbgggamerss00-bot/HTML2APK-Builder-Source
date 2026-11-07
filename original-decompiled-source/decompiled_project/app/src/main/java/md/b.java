package md;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.p;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, Object> a(String str) {
        Map<String, Object> mapC;
        p.d(str);
        String[] strArrSplit = str.split("\\.", -1);
        if (strArrSplit.length < 2) {
            Log.e("FirebaseAppCheck", "Invalid token (too few subsections):\n".concat(str), null);
            return Collections.EMPTY_MAP;
        }
        try {
            String str2 = new String(Base64.decode(strArrSplit[1], 11), "UTF-8");
            if (TextUtils.isEmpty(str2)) {
                mapC = null;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject != JSONObject.NULL) {
                        mapC = c(jSONObject);
                    }
                } catch (Exception e10) {
                    String str3 = "Failed to parse JSONObject into Map:\n" + e10;
                    if (Log.isLoggable("FirebaseAppCheck", 3)) {
                        Log.d("FirebaseAppCheck", str3, null);
                    }
                    mapC = Collections.EMPTY_MAP;
                }
            }
            return mapC == null ? Collections.EMPTY_MAP : mapC;
        } catch (UnsupportedEncodingException e11) {
            Log.e("FirebaseAppCheck", "Unable to decode token (charset unknown):\n" + e11, null);
            return Collections.EMPTY_MAP;
        }
    }

    public static ArrayList b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objC = jSONArray.get(i10);
            if (objC instanceof JSONArray) {
                objC = b((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static p.a c(JSONObject jSONObject) throws JSONException {
        p.a aVar = new p.a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = b((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            } else if (objC.equals(JSONObject.NULL)) {
                objC = null;
            }
            aVar.put(next, objC);
        }
        return aVar;
    }
}
