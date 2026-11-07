package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vb0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f9771a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f9772b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(tb1 tb1Var) throws JSONException {
        if (((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue()) {
            boolean z6 = tb1Var.T;
            l2 l2Var = tb1Var.V;
            if (z6) {
                l2Var.getClass();
                if (((JSONObject) l2Var.f6565t).optBoolean((String) zzbe.zzc().a(zn.f11406h5), true) && tb1Var.f9173b != 4) {
                    int i6 = l2Var.d() == 1 ? 3 : 1;
                    String str = tb1Var.f9193l0;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("creativeType", androidx.camera.view.g.b(i6));
                        jSONObject.put("contentUrl", str);
                        return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (JSONException e6) {
                        zzo.zzk("Unable to build OMID ENV JSON", e6);
                    }
                }
            }
        }
        return null;
    }

    public static String b(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f9771a.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!f9772b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
