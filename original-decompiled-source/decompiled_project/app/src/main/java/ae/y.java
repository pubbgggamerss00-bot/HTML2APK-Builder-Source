package ae;

import androidx.datastore.preferences.protobuf.z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class y {
    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        }
        if (!(obj instanceof JSONObject)) {
            if (!(obj instanceof JSONArray)) {
                if (obj == JSONObject.NULL) {
                    return null;
                }
                throw new IllegalArgumentException(z0.a(obj, "Object cannot be decoded from JSON: "));
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(a(jSONArray.opt(i10)));
            }
            return arrayList;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.has("@type")) {
            String strOptString = jSONObject.optString("@type");
            String value = jSONObject.optString("value");
            if (kotlin.jvm.internal.r.a(strOptString, "type.googleapis.com/google.protobuf.Int64Value")) {
                try {
                    kotlin.jvm.internal.r.d(value, "value");
                    return Long.valueOf(Long.parseLong(value));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(m3.a.a("Invalid Long format:", value));
                }
            }
            if (kotlin.jvm.internal.r.a(strOptString, "type.googleapis.com/google.protobuf.UInt64Value")) {
                try {
                    kotlin.jvm.internal.r.d(value, "value");
                    return Long.valueOf(Long.parseLong(value));
                } catch (NumberFormatException unused2) {
                    throw new IllegalArgumentException(m3.a.a("Invalid Long format:", value));
                }
            }
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object objA = a(jSONObject.opt(key));
            kotlin.jvm.internal.r.d(key, "key");
            map.put(key, objA);
        }
        return map;
    }

    public static Object b(Object obj) throws JSONException {
        boolean z10;
        boolean z11;
        if (obj == null || obj == JSONObject.NULL) {
            Object NULL = JSONObject.NULL;
            kotlin.jvm.internal.r.d(NULL, "NULL");
            return NULL;
        }
        if (obj instanceof Long) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("@type", "type.googleapis.com/google.protobuf.Int64Value");
                jSONObject.put("value", String.valueOf(((Number) obj).longValue()));
                return jSONObject;
            } catch (JSONException e10) {
                throw new RuntimeException("Error encoding Long.", e10);
            }
        }
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean) || ((z10 = obj instanceof JSONObject)) || ((z11 = obj instanceof JSONArray))) {
            return obj;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject2 = new JSONObject();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                if (!(obj2 instanceof String)) {
                    throw new IllegalArgumentException("Object keys must be strings.");
                }
                try {
                    jSONObject2.put((String) obj2, b(map.get(obj2)));
                } catch (JSONException e11) {
                    throw new RuntimeException(e11);
                }
            }
            return jSONObject2;
        }
        if (obj instanceof List) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next()));
            }
            return jSONArray;
        }
        if (!z10) {
            if (!z11) {
                throw new IllegalArgumentException(z0.a(obj, "Object cannot be encoded in JSON: "));
            }
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = (JSONArray) obj;
            int length = jSONArray3.length();
            for (int i10 = 0; i10 < length; i10++) {
                jSONArray2.put(b(jSONArray3.opt(i10)));
            }
            return jSONArray2;
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject4.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next == null) {
                throw new IllegalArgumentException("Object keys cannot be null.");
            }
            try {
                jSONObject3.put(next, b(jSONObject4.opt(next)));
            } catch (JSONException e12) {
                throw new RuntimeException(e12);
            }
        }
        return jSONObject3;
    }
}
