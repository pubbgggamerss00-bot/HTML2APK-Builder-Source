package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.xb1;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzbs {
    public static Bundle zza(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i6 = 0;
                        Object objOpt2 = null;
                        for (int i7 = 0; objOpt2 == null && i7 < length; i7++) {
                            objOpt2 = !jSONArray.isNull(i7) ? jSONArray.opt(i7) : null;
                        }
                        if (objOpt2 == null) {
                            zzo.zzj("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf(next)));
                        } else if (objOpt2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i6 < length) {
                                bundleArr[i6] = !jSONArray.isNull(i6) ? zza(jSONArray.optJSONObject(i6)) : null;
                                i6++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i6 < length) {
                                dArr[i6] = jSONArray.optDouble(i6);
                                i6++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i6 < length) {
                                strArr[i6] = !jSONArray.isNull(i6) ? jSONArray.optString(i6) : null;
                                i6++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i6 < length) {
                                zArr[i6] = jSONArray.optBoolean(i6);
                                i6++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            zzo.zzj("JSONArray with unsupported type " + objOpt2.getClass().getCanonicalName() + " for key:" + next);
                        }
                    }
                } else if (objOpt instanceof JSONObject) {
                    bundle.putBundle(next, zza((JSONObject) objOpt));
                } else {
                    zzo.zzj("Unsupported type for key:".concat(String.valueOf(next)));
                }
            }
        }
        return bundle;
    }

    public static String zzb(String str, JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectZzn = zzn(jSONObject, strArr);
        return jSONObjectZzn == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : jSONObjectZzn.optString(strArr[0], RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public static List zzc(JSONArray jSONArray, List list) {
        if (list == null) {
            list = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                list.add(jSONArray.getString(i6));
            }
        }
        return list;
    }

    public static List zzd(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static Map zze(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            HashMap map2 = new HashMap();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                map2.put(jsonReader.nextName(), jsonReader.nextString());
            }
            jsonReader.endObject();
            map.put(strNextName, map2);
        }
        jsonReader.endObject();
        return map;
    }

    public static JSONArray zzf(JsonReader jsonReader) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONArray.put(zzf(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONArray.put(zzi(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static JSONObject zzg(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject zzh(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectZzn = zzn(jSONObject, strArr);
        if (jSONObjectZzn == null) {
            return null;
        }
        return jSONObjectZzn.optJSONObject(strArr[1]);
    }

    public static JSONObject zzi(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, zzf(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, zzi(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONObject.put(strNextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void zzj(JsonWriter jsonWriter, JSONArray jSONArray) throws JSONException, IOException {
        try {
            jsonWriter.beginArray();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                Object obj = jSONArray.get(i6);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zzk(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    zzj(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e6) {
            throw new IOException(e6);
        }
    }

    public static void zzk(JsonWriter jsonWriter, JSONObject jSONObject) throws JSONException, IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zzk(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    zzj(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e6) {
            throw new IOException(e6);
        }
    }

    public static boolean zzl(boolean z6, JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectZzn = zzn(jSONObject, strArr);
        if (jSONObjectZzn == null) {
            return false;
        }
        return jSONObjectZzn.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String zzm(xb1 xb1Var) throws JSONException, IOException {
        if (xb1Var == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            zzo(jsonWriter, xb1Var);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e6) {
            zzo.zzh("Error when writing JSON.", e6);
            return null;
        }
    }

    private static JSONObject zzn(JSONObject jSONObject, String[] strArr) {
        for (int i6 = 0; i6 < strArr.length - 1; i6 = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    private static void zzo(JsonWriter jsonWriter, Object obj) throws JSONException, IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof xb1) {
            zzk(jsonWriter, ((xb1) obj).f10475d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzo(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                zzo(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }
}
