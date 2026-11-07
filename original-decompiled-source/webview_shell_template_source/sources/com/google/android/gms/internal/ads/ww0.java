package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ww0 {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f10286k = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    public final hc0 f10287a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10288b;

    /* renamed from: c, reason: collision with root package name */
    public final VersionInfoParcel f10289c;

    /* renamed from: d, reason: collision with root package name */
    public final ec1 f10290d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f10291e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f10292f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10293g;
    public final he1 h;

    /* renamed from: i, reason: collision with root package name */
    public final zt0 f10294i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f10295j = new Object();

    public ww0(hc0 hc0Var, Context context, VersionInfoParcel versionInfoParcel, ec1 ec1Var, h70 h70Var, String str, he1 he1Var, zt0 zt0Var, ed0 ed0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f10287a = hc0Var;
        this.f10288b = context;
        this.f10289c = versionInfoParcel;
        this.f10290d = ec1Var;
        this.f10291e = h70Var;
        this.f10293g = str;
        this.h = he1Var;
        hc0Var.p();
        this.f10294i = zt0Var;
        this.f10292f = scheduledExecutorService;
    }

    public final cr1 a(String str, String str2) {
        String string;
        c5.a aVarM;
        String str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (TextUtils.isEmpty(str)) {
            return bs1.l(new p21(15, "Invalid ad string."));
        }
        Context context = this.f10288b;
        de1 de1VarE = d0.e(context, 11);
        de1VarE.zzi();
        lx lxVarA = zzv.zzg().a(context, this.f10289c, this.f10287a.r());
        fo foVar = kx.f6519b;
        ox oxVarA = lxVarA.a("google.afma.response.normalize", foVar, foVar);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.S6)).booleanValue();
        zt0 zt0Var = this.f10294i;
        Executor executor = this.f10291e;
        if (zBooleanValue) {
            try {
                string = new JSONObject(str).optString("fetch_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            } catch (JSONException unused) {
                string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (TextUtils.isEmpty(string)) {
                aVarM = bs1.m(str);
                zt0Var.a("sst", "1");
            } else {
                zt0Var.a("sst", "2");
                String str4 = (String) zzbe.zzc().a(zn.U6);
                if (((Boolean) zzbe.zzc().a(zn.T6)).booleanValue()) {
                    Pattern pattern = f10286k;
                    ql1 ql1Var = new ql1(pattern);
                    Matcher matcher = pattern.matcher(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    matcher.getClass();
                    if (matcher.matches()) {
                        throw new IllegalArgumentException(dm1.a("The pattern may not match the empty string: %s", ql1Var));
                    }
                    List listB = new cm1(new xj1(20, ql1Var)).b(string);
                    if (listB.size() < 2) {
                        aVarM = bs1.l(new p21(1, "Invalid fetch URL."));
                    } else {
                        str3 = (String) listB.get(1);
                        zzv.zzq();
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        aVarM = bs1.k((xr1) bs1.q(xr1.p(i70.f5586a.u(new vw0(0, this, new ay0(string, 60000, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4)))), ((Integer) zzbe.zzc().a(zn.V6)).intValue(), TimeUnit.MILLISECONDS, this.f10292f), Exception.class, new sw0(1), executor);
                    }
                } else {
                    aVarM = bs1.k((xr1) bs1.q(xr1.p(i70.f5586a.u(new vw0(0, this, new ay0(string, 60000, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4)))), ((Integer) zzbe.zzc().a(zn.V6)).intValue(), TimeUnit.MILLISECONDS, this.f10292f), Exception.class, new sw0(1), executor);
                }
            }
        } else {
            aVarM = bs1.m(str);
            zt0Var.a("sst", "1");
        }
        gr1 gr1VarP = bs1.p(bs1.p(bs1.p(aVarM, new yq0(1, str2), executor), new rf0(2, oxVarA), executor), new l50(2, this), executor);
        ge1.c(gr1VarP, this.h, de1VarE, false);
        return gr1VarP;
    }

    public final String b(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f10293g));
            }
            return jSONObject.toString();
        } catch (JSONException e6) {
            zzo.zzj("Failed to update the ad types for rendering. ".concat(e6.toString()));
            return str;
        }
    }

    public final void c(xt0 xt0Var) {
        Bundle bundle = this.f10294i.f11577c;
        if (((Boolean) zzbe.zzc().a(zn.X6)).booleanValue()) {
            androidx.camera.camera2.internal.compat.workaround.c.f(xt0Var.s, bundle);
        }
    }
}
