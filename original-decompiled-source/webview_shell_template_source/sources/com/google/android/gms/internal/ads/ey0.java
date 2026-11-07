package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ey0 implements td1 {

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f4420v = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final de1 f4421t;

    /* renamed from: u, reason: collision with root package name */
    public final he1 f4422u;

    public ey0(String str, he1 he1Var, de1 de1Var) {
        this.s = str;
        this.f4422u = he1Var;
        this.f4421t = de1Var;
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final Object zza(Object obj) throws gw0 {
        gw0 gw0Var;
        JSONObject jSONObject;
        String strConcat;
        dy0 dy0Var = (dy0) obj;
        int iOptInt = dy0Var.f4058a.optInt("http_timeout_millis", 60000);
        t30 t30Var = dy0Var.f4059b;
        int i6 = t30Var.f9091g;
        String str = t30Var.f9087c;
        de1 de1Var = this.f4421t;
        he1 he1Var = this.f4422u;
        int i7 = 1;
        String strJoin = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (i6 != -2) {
            if (i6 == 1) {
                List list = t30Var.f9085a;
                if (list != null) {
                    strJoin = TextUtils.join(", ", list);
                    zzo.zzg(strJoin);
                }
                gw0Var = new gw0(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                gw0Var = new gw0(1);
            }
            de1Var.g(gw0Var);
            de1Var.s(false);
            he1Var.a(de1Var);
            throw gw0Var;
        }
        HashMap map = new HashMap();
        if (t30Var.f9089e) {
            String str2 = this.s;
            if (!TextUtils.isEmpty(str2)) {
                if (((Boolean) zzbe.zzc().a(zn.Z0)).booleanValue()) {
                    if (TextUtils.isEmpty(str2)) {
                        strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        Matcher matcher = f4420v.matcher(str2);
                        strConcat = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        while (matcher.find()) {
                            String strGroup = matcher.group(i7);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                            i7 = 1;
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str2);
                }
            }
        }
        if (t30Var.f9088d && (jSONObject = dy0Var.f4058a) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                }
            } else {
                zze.zza("DSID signal does not exist.");
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        de1Var.s(true);
        he1Var.a(de1Var);
        return new ay0(t30Var.f9090f, iOptInt, map, str.getBytes(StandardCharsets.UTF_8), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }
}
