package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ch1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3576a;

    /* renamed from: c, reason: collision with root package name */
    public long f3578c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public int f3579d = 1;

    /* renamed from: b, reason: collision with root package name */
    public wh1 f3577b = new wh1(null);

    public ch1(String str) {
        this.f3576a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView a() {
        return (WebView) this.f3577b.get();
    }

    public void b() {
        this.f3577b.clear();
    }

    public final void c(Date date) throws JSONException {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        gh1.c(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        xg1.a(a(), "setLastActivity", jSONObject);
    }

    public void d(fg1 fg1Var, dg1 dg1Var) throws JSONException {
        e(fg1Var, dg1Var, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(fg1 fg1Var, dg1 dg1Var, JSONObject jSONObject) throws JSONException {
        char c7;
        String str;
        String str2 = fg1Var.f4657g;
        JSONObject jSONObject2 = new JSONObject();
        gh1.c(jSONObject2, "environment", "app");
        gh1.c(jSONObject2, "adSessionType", dg1Var.f3932g);
        JSONObject jSONObject3 = new JSONObject();
        gh1.c(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        gh1.c(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        gh1.c(jSONObject3, "os", "Android");
        gh1.c(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = bq.H;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            c7 = 1;
            if (currentModeType == 1) {
                c7 = 2;
            } else if (currentModeType != 4) {
                c7 = 3;
            }
        }
        if (c7 == 1) {
            str = "ctv";
        } else if (c7 == 2) {
            str = "mobile";
        } else {
            if (c7 != 3) {
                throw null;
            }
            str = "other";
        }
        gh1.c(jSONObject2, "deviceCategory", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        gh1.c(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        mo moVar = dg1Var.f3926a;
        gh1.c(jSONObject4, "partnerName", moVar.f7194a);
        gh1.c(jSONObject4, "partnerVersion", moVar.f7195b);
        gh1.c(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        gh1.c(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        gh1.c(jSONObject5, "appId", wg1.f10196t.s.getApplicationContext().getPackageName());
        gh1.c(jSONObject2, "app", jSONObject5);
        String str3 = dg1Var.f3931f;
        if (str3 != null) {
            gh1.c(jSONObject2, "contentUrl", str3);
        }
        String str4 = dg1Var.f3930e;
        if (str4 != null) {
            gh1.c(jSONObject2, "customReferenceData", str4);
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList(dg1Var.f3928c).iterator();
        if (it.hasNext()) {
            throw null;
        }
        xg1.a(a(), "startSession", str2, jSONObject2, jSONObject6, jSONObject);
    }

    public void f() {
    }
}
