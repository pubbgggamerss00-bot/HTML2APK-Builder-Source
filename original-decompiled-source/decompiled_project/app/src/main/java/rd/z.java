package rd;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzv;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final sa.a f23441a = new sa.a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objC = jSONArray.get(i10);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static Map<String, Object> b(String str) {
        com.google.android.gms.common.internal.p.d(str);
        List<String> listZza = zzv.zza('.').zza((CharSequence) str);
        int size = listZza.size();
        sa.a aVar = f23441a;
        if (size < 2) {
            aVar.c(m3.a.a("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        try {
            p.a aVarD = d(new String(p9.d.b(listZza.get(1)), "UTF-8"));
            return aVarD == null ? new HashMap() : aVarD;
        } catch (UnsupportedEncodingException e10) {
            aVar.b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    public static p.a c(JSONObject jSONObject) throws JSONException {
        p.a aVar = new p.a();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            aVar.put(next, objC);
        }
        return aVar;
    }

    public static p.a d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaag(e10);
        }
    }
}
