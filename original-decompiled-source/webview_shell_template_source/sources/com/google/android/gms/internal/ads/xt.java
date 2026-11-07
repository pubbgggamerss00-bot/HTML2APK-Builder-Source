package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xt {
    public static final ot A;

    /* renamed from: a, reason: collision with root package name */
    public static final mt f10667a;

    /* renamed from: b, reason: collision with root package name */
    public static final ot f10668b;

    /* renamed from: c, reason: collision with root package name */
    public static final qt f10669c;

    /* renamed from: e, reason: collision with root package name */
    public static final qt f10671e;

    /* renamed from: f, reason: collision with root package name */
    public static final rt f10672f;
    public static final rt h;

    /* renamed from: j, reason: collision with root package name */
    public static final mt f10675j;

    /* renamed from: p, reason: collision with root package name */
    public static final ot f10681p;

    /* renamed from: q, reason: collision with root package name */
    public static final jt f10682q;

    /* renamed from: r, reason: collision with root package name */
    public static final mt f10683r;

    /* renamed from: t, reason: collision with root package name */
    public static final ot f10684t;

    /* renamed from: w, reason: collision with root package name */
    public static final qt f10687w;

    /* renamed from: x, reason: collision with root package name */
    public static final rt f10688x;

    /* renamed from: y, reason: collision with root package name */
    public static final mt f10689y;

    /* renamed from: d, reason: collision with root package name */
    public static final tt f10670d = new tt(1);

    /* renamed from: g, reason: collision with root package name */
    public static final wt f10673g = new wt();

    /* renamed from: i, reason: collision with root package name */
    public static final jt f10674i = new jt(1);

    /* renamed from: k, reason: collision with root package name */
    public static final st f10676k = new st(2);

    /* renamed from: l, reason: collision with root package name */
    public static final g90 f10677l = new g90();

    /* renamed from: m, reason: collision with root package name */
    public static final h90 f10678m = new h90();

    /* renamed from: n, reason: collision with root package name */
    public static final jt f10679n = new jt(0);

    /* renamed from: o, reason: collision with root package name */
    public static final lu f10680o = new lu();
    public static final st s = new st(0);

    /* renamed from: u, reason: collision with root package name */
    public static final jt f10685u = new jt(2);

    /* renamed from: v, reason: collision with root package name */
    public static final tt f10686v = new tt(0);

    /* renamed from: z, reason: collision with root package name */
    public static final st f10690z = new st(1);
    public static final ut B = new ut();
    public static final vt C = new vt();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.mt] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.ot] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.android.gms.internal.ads.ot] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.android.gms.internal.ads.mt] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.android.gms.internal.ads.ot] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.qt] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.google.android.gms.internal.ads.qt] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.google.android.gms.internal.ads.rt] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.google.android.gms.internal.ads.mt] */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.google.android.gms.internal.ads.ot] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.qt] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.rt] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.rt] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.android.gms.internal.ads.mt] */
    static {
        final int i6 = 0;
        f10667a = new yt() { // from class: com.google.android.gms.internal.ads.mt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                switch (i6) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        mt mtVar = xt.f10667a;
                        String str = (String) map.get("urls");
                        if (TextUtils.isEmpty(str)) {
                            zzo.zzj("URLs missing in canOpenURLs GMSG.");
                            break;
                        } else {
                            String[] strArrSplit = str.split(",");
                            HashMap map2 = new HashMap();
                            PackageManager packageManager = sb0Var.getContext().getPackageManager();
                            for (String str2 : strArrSplit) {
                                String[] strArrSplit2 = str2.split(";", 2);
                                Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
                                map2.put(str2, boolValueOf);
                                zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
                            }
                            ((lw) sb0Var).G("openableURLs", map2);
                            break;
                        }
                    case 1:
                        xa0 xa0Var = (xa0) obj;
                        WindowManager windowManager = (WindowManager) xa0Var.getContext().getSystemService("window");
                        zzv.zzq();
                        DisplayMetrics displayMetricsZzu = zzs.zzu(windowManager);
                        int i7 = displayMetricsZzu.widthPixels;
                        int i8 = displayMetricsZzu.heightPixels;
                        int[] iArr = new int[2];
                        HashMap map3 = new HashMap();
                        ((View) xa0Var).getLocationInWindow(iArr);
                        map3.put("xInPixels", Integer.valueOf(iArr[0]));
                        androidx.camera.camera2.internal.compat.workaround.c.e(iArr[1], map3, "yInPixels", i7, "windowWidthInPixels");
                        map3.put("windowHeightInPixels", Integer.valueOf(i8));
                        xa0Var.G("locationReady", map3);
                        zzo.zzj("GET LOCATION COMPILED");
                        break;
                    case 2:
                        zzv.zzk().zzc();
                        break;
                    default:
                        ((xa0) obj).l(!Boolean.parseBoolean((String) map.get("disabled")));
                        break;
                }
            }
        };
        f10668b = new yt() { // from class: com.google.android.gms.internal.ads.ot
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                JSONObject jSONObjectZzb;
                switch (i6) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        mt mtVar = xt.f10667a;
                        if (!((Boolean) zzbe.zzc().a(zn.d8)).booleanValue()) {
                            zzo.zzj("canOpenAppGmsgHandler disabled.");
                            return;
                        }
                        String str = (String) map.get("package_name");
                        if (TextUtils.isEmpty(str)) {
                            zzo.zzj("Package name missing in canOpenApp GMSG.");
                            return;
                        }
                        HashMap map2 = new HashMap();
                        Boolean boolValueOf = Boolean.valueOf(sb0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
                        map2.put(str, boolValueOf);
                        zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
                        ((lw) sb0Var).G("openableApp", map2);
                        return;
                    case 1:
                        xa0 xa0Var = (xa0) obj;
                        nq nqVarZzK = xa0Var.zzK();
                        if (nqVarZzK == null || (jSONObjectZzb = nqVarZzK.zzb()) == null) {
                            xa0Var.j("nativeClickMetaReady", new JSONObject());
                            return;
                        } else {
                            xa0Var.j("nativeClickMetaReady", jSONObjectZzb);
                            return;
                        }
                    case 2:
                        xa0 xa0Var2 = (xa0) obj;
                        try {
                            String str2 = (String) map.get("enabled");
                            if (!rj1.p("true", str2) && !rj1.p("false", str2)) {
                                return;
                            }
                            xj1 xj1VarD = xj1.d(xa0Var2.getContext());
                            boolean z6 = Boolean.parseBoolean(str2);
                            xj1VarD.getClass();
                            synchronized (xj1.class) {
                                ((yj1) xj1VarD.f10619t).a("paidv2_user_option", Boolean.valueOf(z6));
                            }
                            return;
                        } catch (IOException e6) {
                            zzv.zzp().h("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e6);
                            return;
                        }
                    default:
                        xa0 xa0Var3 = (xa0) obj;
                        if (map.keySet().contains("start")) {
                            eb0 eb0VarZzN = xa0Var3.zzN();
                            synchronized (eb0VarZzN.f4193v) {
                            }
                            eb0VarZzN.U++;
                            eb0VarZzN.M();
                            return;
                        }
                        if (map.keySet().contains("stop")) {
                            r5.U--;
                            xa0Var3.zzN().M();
                            return;
                        } else {
                            if (map.keySet().contains("cancel")) {
                                eb0 eb0VarZzN2 = xa0Var3.zzN();
                                kk kkVar = eb0VarZzN2.f4191t;
                                if (kkVar != null) {
                                    kkVar.b(10005);
                                }
                                eb0VarZzN2.T = true;
                                eb0VarZzN2.F = 10004;
                                eb0VarZzN2.G = "Page loaded delay cancel.";
                                eb0VarZzN2.M();
                                eb0VarZzN2.s.destroy();
                                return;
                            }
                            return;
                        }
                }
            }
        };
        f10669c = new yt() { // from class: com.google.android.gms.internal.ads.qt
            /* JADX WARN: Can't wrap try/catch for region: R(14:(3:67|14|15)|(13:69|17|18|23|(10:25|(1:27)|28|(1:30)|31|(1:33)|34|(1:36)|37|(2:39|(1:41)))|42|61|43|(1:49)|63|50|76|56)(1:22)|21|23|(0)|42|61|43|(0)|63|50|76|56|12) */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00ff, code lost:
            
                com.google.android.gms.ads.internal.zzv.zzp().h(r10.toString(), r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0113, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
            
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error constructing openable urls response.", r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
            @Override // com.google.android.gms.internal.ads.yt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(Object obj, Map map) throws JSONException, URISyntaxException {
                int i7;
                String strOptString;
                String strOptString2;
                String strOptString3;
                String strOptString4;
                String strOptString5;
                String strOptString6;
                String strOptString7;
                ResolveInfo resolveInfoResolveActivity;
                Intent uri;
                switch (i6) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        PackageManager packageManager = sb0Var.getContext().getPackageManager();
                        try {
                            try {
                                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                                JSONObject jSONObject = new JSONObject();
                                int i8 = 0;
                                int i9 = 0;
                                while (i9 < jSONArray.length()) {
                                    try {
                                        JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                                        strOptString = jSONObject2.optString("id");
                                        strOptString2 = jSONObject2.optString("u");
                                        strOptString3 = jSONObject2.optString("i");
                                        strOptString4 = jSONObject2.optString("m");
                                        strOptString5 = jSONObject2.optString("p");
                                        strOptString6 = jSONObject2.optString("c");
                                        strOptString7 = jSONObject2.optString("intent_url");
                                        resolveInfoResolveActivity = null;
                                    } catch (JSONException e6) {
                                        i7 = i8;
                                        zzo.zzh("Error parsing the intent data.", e6);
                                    }
                                    if (TextUtils.isEmpty(strOptString7)) {
                                        i7 = i8;
                                    } else {
                                        try {
                                            uri = Intent.parseUri(strOptString7, i8);
                                            i7 = i8;
                                        } catch (URISyntaxException e7) {
                                            i7 = i8;
                                            zzo.zzh("Error parsing the url: ".concat(String.valueOf(strOptString7)), e7);
                                        }
                                        if (uri == null) {
                                            uri = new Intent();
                                            if (!TextUtils.isEmpty(strOptString2)) {
                                                uri.setData(Uri.parse(strOptString2));
                                            }
                                            if (!TextUtils.isEmpty(strOptString3)) {
                                                uri.setAction(strOptString3);
                                            }
                                            if (!TextUtils.isEmpty(strOptString4)) {
                                                uri.setType(strOptString4);
                                            }
                                            if (!TextUtils.isEmpty(strOptString5)) {
                                                uri.setPackage(strOptString5);
                                            }
                                            if (!TextUtils.isEmpty(strOptString6)) {
                                                String[] strArrSplit = strOptString6.split("/", 2);
                                                if (strArrSplit.length == 2) {
                                                    uri.setComponent(new ComponentName(strArrSplit[i7 == true ? 1 : 0], strArrSplit[1]));
                                                }
                                            }
                                        }
                                        Intent intent = uri;
                                        resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                                        jSONObject.put(strOptString, resolveInfoResolveActivity == null ? i7 == true ? 1 : 0 : true);
                                        i9++;
                                        i8 = i7;
                                    }
                                    uri = null;
                                    if (uri == null) {
                                    }
                                    Intent intent2 = uri;
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intent2, 65536);
                                    jSONObject.put(strOptString, resolveInfoResolveActivity == null ? i7 == true ? 1 : 0 : true);
                                    i9++;
                                    i8 = i7;
                                }
                                ((lw) sb0Var).j("openableIntents", jSONObject);
                                break;
                            } catch (JSONException unused) {
                                ((lw) sb0Var).j("openableIntents", new JSONObject());
                                return;
                            }
                        } catch (JSONException unused2) {
                            ((lw) sb0Var).j("openableIntents", new JSONObject());
                            return;
                        }
                    case 1:
                        zzv.zzk().zzg();
                        break;
                    default:
                        ((xa0) obj).j0("1".equals(map.get("custom_close")));
                        break;
                }
            }
        };
        final int i7 = 2;
        f10671e = new yt() { // from class: com.google.android.gms.internal.ads.qt
            /* JADX WARN: Can't wrap try/catch for region: R(14:(3:67|14|15)|(13:69|17|18|23|(10:25|(1:27)|28|(1:30)|31|(1:33)|34|(1:36)|37|(2:39|(1:41)))|42|61|43|(1:49)|63|50|76|56)(1:22)|21|23|(0)|42|61|43|(0)|63|50|76|56|12) */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00ff, code lost:
            
                com.google.android.gms.ads.internal.zzv.zzp().h(r10.toString(), r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0113, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
            
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error constructing openable urls response.", r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
            @Override // com.google.android.gms.internal.ads.yt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(Object obj, Map map) throws JSONException, URISyntaxException {
                int i72;
                String strOptString;
                String strOptString2;
                String strOptString3;
                String strOptString4;
                String strOptString5;
                String strOptString6;
                String strOptString7;
                ResolveInfo resolveInfoResolveActivity;
                Intent uri;
                switch (i7) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        PackageManager packageManager = sb0Var.getContext().getPackageManager();
                        try {
                            try {
                                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                                JSONObject jSONObject = new JSONObject();
                                int i8 = 0;
                                int i9 = 0;
                                while (i9 < jSONArray.length()) {
                                    try {
                                        JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                                        strOptString = jSONObject2.optString("id");
                                        strOptString2 = jSONObject2.optString("u");
                                        strOptString3 = jSONObject2.optString("i");
                                        strOptString4 = jSONObject2.optString("m");
                                        strOptString5 = jSONObject2.optString("p");
                                        strOptString6 = jSONObject2.optString("c");
                                        strOptString7 = jSONObject2.optString("intent_url");
                                        resolveInfoResolveActivity = null;
                                    } catch (JSONException e6) {
                                        i72 = i8;
                                        zzo.zzh("Error parsing the intent data.", e6);
                                    }
                                    if (TextUtils.isEmpty(strOptString7)) {
                                        i72 = i8;
                                    } else {
                                        try {
                                            uri = Intent.parseUri(strOptString7, i8);
                                            i72 = i8;
                                        } catch (URISyntaxException e7) {
                                            i72 = i8;
                                            zzo.zzh("Error parsing the url: ".concat(String.valueOf(strOptString7)), e7);
                                        }
                                        if (uri == null) {
                                            uri = new Intent();
                                            if (!TextUtils.isEmpty(strOptString2)) {
                                                uri.setData(Uri.parse(strOptString2));
                                            }
                                            if (!TextUtils.isEmpty(strOptString3)) {
                                                uri.setAction(strOptString3);
                                            }
                                            if (!TextUtils.isEmpty(strOptString4)) {
                                                uri.setType(strOptString4);
                                            }
                                            if (!TextUtils.isEmpty(strOptString5)) {
                                                uri.setPackage(strOptString5);
                                            }
                                            if (!TextUtils.isEmpty(strOptString6)) {
                                                String[] strArrSplit = strOptString6.split("/", 2);
                                                if (strArrSplit.length == 2) {
                                                    uri.setComponent(new ComponentName(strArrSplit[i72 == true ? 1 : 0], strArrSplit[1]));
                                                }
                                            }
                                        }
                                        Intent intent2 = uri;
                                        resolveInfoResolveActivity = packageManager.resolveActivity(intent2, 65536);
                                        jSONObject.put(strOptString, resolveInfoResolveActivity == null ? i72 == true ? 1 : 0 : true);
                                        i9++;
                                        i8 = i72;
                                    }
                                    uri = null;
                                    if (uri == null) {
                                    }
                                    Intent intent22 = uri;
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intent22, 65536);
                                    jSONObject.put(strOptString, resolveInfoResolveActivity == null ? i72 == true ? 1 : 0 : true);
                                    i9++;
                                    i8 = i72;
                                }
                                ((lw) sb0Var).j("openableIntents", jSONObject);
                                break;
                            } catch (JSONException unused) {
                                ((lw) sb0Var).j("openableIntents", new JSONObject());
                                return;
                            }
                        } catch (JSONException unused2) {
                            ((lw) sb0Var).j("openableIntents", new JSONObject());
                            return;
                        }
                    case 1:
                        zzv.zzk().zzg();
                        break;
                    default:
                        ((xa0) obj).j0("1".equals(map.get("custom_close")));
                        break;
                }
            }
        };
        final int i8 = 0;
        f10672f = new yt() { // from class: com.google.android.gms.internal.ads.rt
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                switch (i8) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        mt mtVar = xt.f10667a;
                        String str = (String) map.get("u");
                        if (str != null) {
                            oa0 oa0Var = (oa0) sb0Var;
                            new zzbw(sb0Var.getContext(), ((xb0) sb0Var).zzn().afmaVersion, str, null, oa0Var.d() != null ? oa0Var.d().f9215x0 : null).zzb();
                            break;
                        } else {
                            zzo.zzj("URL missing from httpTrack GMSG.");
                            break;
                        }
                    case 1:
                        zzv.zzk().zzb();
                        break;
                    default:
                        nq nqVarZzK = ((xa0) obj).zzK();
                        if (nqVarZzK != null) {
                            nqVarZzK.zzc();
                            break;
                        }
                        break;
                }
            }
        };
        final int i9 = 2;
        h = new yt() { // from class: com.google.android.gms.internal.ads.rt
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                switch (i9) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        mt mtVar = xt.f10667a;
                        String str = (String) map.get("u");
                        if (str != null) {
                            oa0 oa0Var = (oa0) sb0Var;
                            new zzbw(sb0Var.getContext(), ((xb0) sb0Var).zzn().afmaVersion, str, null, oa0Var.d() != null ? oa0Var.d().f9215x0 : null).zzb();
                            break;
                        } else {
                            zzo.zzj("URL missing from httpTrack GMSG.");
                            break;
                        }
                    case 1:
                        zzv.zzk().zzb();
                        break;
                    default:
                        nq nqVarZzK = ((xa0) obj).zzK();
                        if (nqVarZzK != null) {
                            nqVarZzK.zzc();
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 3;
        f10675j = new yt() { // from class: com.google.android.gms.internal.ads.mt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                switch (i10) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        mt mtVar = xt.f10667a;
                        String str = (String) map.get("urls");
                        if (TextUtils.isEmpty(str)) {
                            zzo.zzj("URLs missing in canOpenURLs GMSG.");
                            break;
                        } else {
                            String[] strArrSplit = str.split(",");
                            HashMap map2 = new HashMap();
                            PackageManager packageManager = sb0Var.getContext().getPackageManager();
                            for (String str2 : strArrSplit) {
                                String[] strArrSplit2 = str2.split(";", 2);
                                Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
                                map2.put(str2, boolValueOf);
                                zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
                            }
                            ((lw) sb0Var).G("openableURLs", map2);
                            break;
                        }
                    case 1:
                        xa0 xa0Var = (xa0) obj;
                        WindowManager windowManager = (WindowManager) xa0Var.getContext().getSystemService("window");
                        zzv.zzq();
                        DisplayMetrics displayMetricsZzu = zzs.zzu(windowManager);
                        int i72 = displayMetricsZzu.widthPixels;
                        int i82 = displayMetricsZzu.heightPixels;
                        int[] iArr = new int[2];
                        HashMap map3 = new HashMap();
                        ((View) xa0Var).getLocationInWindow(iArr);
                        map3.put("xInPixels", Integer.valueOf(iArr[0]));
                        androidx.camera.camera2.internal.compat.workaround.c.e(iArr[1], map3, "yInPixels", i72, "windowWidthInPixels");
                        map3.put("windowHeightInPixels", Integer.valueOf(i82));
                        xa0Var.G("locationReady", map3);
                        zzo.zzj("GET LOCATION COMPILED");
                        break;
                    case 2:
                        zzv.zzk().zzc();
                        break;
                    default:
                        ((xa0) obj).l(!Boolean.parseBoolean((String) map.get("disabled")));
                        break;
                }
            }
        };
        final int i11 = 3;
        f10681p = new yt() { // from class: com.google.android.gms.internal.ads.ot
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                JSONObject jSONObjectZzb;
                switch (i11) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        mt mtVar = xt.f10667a;
                        if (!((Boolean) zzbe.zzc().a(zn.d8)).booleanValue()) {
                            zzo.zzj("canOpenAppGmsgHandler disabled.");
                            return;
                        }
                        String str = (String) map.get("package_name");
                        if (TextUtils.isEmpty(str)) {
                            zzo.zzj("Package name missing in canOpenApp GMSG.");
                            return;
                        }
                        HashMap map2 = new HashMap();
                        Boolean boolValueOf = Boolean.valueOf(sb0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
                        map2.put(str, boolValueOf);
                        zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
                        ((lw) sb0Var).G("openableApp", map2);
                        return;
                    case 1:
                        xa0 xa0Var = (xa0) obj;
                        nq nqVarZzK = xa0Var.zzK();
                        if (nqVarZzK == null || (jSONObjectZzb = nqVarZzK.zzb()) == null) {
                            xa0Var.j("nativeClickMetaReady", new JSONObject());
                            return;
                        } else {
                            xa0Var.j("nativeClickMetaReady", jSONObjectZzb);
                            return;
                        }
                    case 2:
                        xa0 xa0Var2 = (xa0) obj;
                        try {
                            String str2 = (String) map.get("enabled");
                            if (!rj1.p("true", str2) && !rj1.p("false", str2)) {
                                return;
                            }
                            xj1 xj1VarD = xj1.d(xa0Var2.getContext());
                            boolean z6 = Boolean.parseBoolean(str2);
                            xj1VarD.getClass();
                            synchronized (xj1.class) {
                                ((yj1) xj1VarD.f10619t).a("paidv2_user_option", Boolean.valueOf(z6));
                            }
                            return;
                        } catch (IOException e6) {
                            zzv.zzp().h("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e6);
                            return;
                        }
                    default:
                        xa0 xa0Var3 = (xa0) obj;
                        if (map.keySet().contains("start")) {
                            eb0 eb0VarZzN = xa0Var3.zzN();
                            synchronized (eb0VarZzN.f4193v) {
                            }
                            eb0VarZzN.U++;
                            eb0VarZzN.M();
                            return;
                        }
                        if (map.keySet().contains("stop")) {
                            r5.U--;
                            xa0Var3.zzN().M();
                            return;
                        } else {
                            if (map.keySet().contains("cancel")) {
                                eb0 eb0VarZzN2 = xa0Var3.zzN();
                                kk kkVar = eb0VarZzN2.f4191t;
                                if (kkVar != null) {
                                    kkVar.b(10005);
                                }
                                eb0VarZzN2.T = true;
                                eb0VarZzN2.F = 10004;
                                eb0VarZzN2.G = "Page loaded delay cancel.";
                                eb0VarZzN2.M();
                                eb0VarZzN2.s.destroy();
                                return;
                            }
                            return;
                        }
                }
            }
        };
        f10682q = new jt(i11);
        final int i12 = 1;
        f10683r = new yt() { // from class: com.google.android.gms.internal.ads.mt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                switch (i12) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        mt mtVar = xt.f10667a;
                        String str = (String) map.get("urls");
                        if (TextUtils.isEmpty(str)) {
                            zzo.zzj("URLs missing in canOpenURLs GMSG.");
                            break;
                        } else {
                            String[] strArrSplit = str.split(",");
                            HashMap map2 = new HashMap();
                            PackageManager packageManager = sb0Var.getContext().getPackageManager();
                            for (String str2 : strArrSplit) {
                                String[] strArrSplit2 = str2.split(";", 2);
                                Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
                                map2.put(str2, boolValueOf);
                                zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
                            }
                            ((lw) sb0Var).G("openableURLs", map2);
                            break;
                        }
                    case 1:
                        xa0 xa0Var = (xa0) obj;
                        WindowManager windowManager = (WindowManager) xa0Var.getContext().getSystemService("window");
                        zzv.zzq();
                        DisplayMetrics displayMetricsZzu = zzs.zzu(windowManager);
                        int i72 = displayMetricsZzu.widthPixels;
                        int i82 = displayMetricsZzu.heightPixels;
                        int[] iArr = new int[2];
                        HashMap map3 = new HashMap();
                        ((View) xa0Var).getLocationInWindow(iArr);
                        map3.put("xInPixels", Integer.valueOf(iArr[0]));
                        androidx.camera.camera2.internal.compat.workaround.c.e(iArr[1], map3, "yInPixels", i72, "windowWidthInPixels");
                        map3.put("windowHeightInPixels", Integer.valueOf(i82));
                        xa0Var.G("locationReady", map3);
                        zzo.zzj("GET LOCATION COMPILED");
                        break;
                    case 2:
                        zzv.zzk().zzc();
                        break;
                    default:
                        ((xa0) obj).l(!Boolean.parseBoolean((String) map.get("disabled")));
                        break;
                }
            }
        };
        final int i13 = 1;
        f10684t = new yt() { // from class: com.google.android.gms.internal.ads.ot
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                JSONObject jSONObjectZzb;
                switch (i13) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        mt mtVar = xt.f10667a;
                        if (!((Boolean) zzbe.zzc().a(zn.d8)).booleanValue()) {
                            zzo.zzj("canOpenAppGmsgHandler disabled.");
                            return;
                        }
                        String str = (String) map.get("package_name");
                        if (TextUtils.isEmpty(str)) {
                            zzo.zzj("Package name missing in canOpenApp GMSG.");
                            return;
                        }
                        HashMap map2 = new HashMap();
                        Boolean boolValueOf = Boolean.valueOf(sb0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
                        map2.put(str, boolValueOf);
                        zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
                        ((lw) sb0Var).G("openableApp", map2);
                        return;
                    case 1:
                        xa0 xa0Var = (xa0) obj;
                        nq nqVarZzK = xa0Var.zzK();
                        if (nqVarZzK == null || (jSONObjectZzb = nqVarZzK.zzb()) == null) {
                            xa0Var.j("nativeClickMetaReady", new JSONObject());
                            return;
                        } else {
                            xa0Var.j("nativeClickMetaReady", jSONObjectZzb);
                            return;
                        }
                    case 2:
                        xa0 xa0Var2 = (xa0) obj;
                        try {
                            String str2 = (String) map.get("enabled");
                            if (!rj1.p("true", str2) && !rj1.p("false", str2)) {
                                return;
                            }
                            xj1 xj1VarD = xj1.d(xa0Var2.getContext());
                            boolean z6 = Boolean.parseBoolean(str2);
                            xj1VarD.getClass();
                            synchronized (xj1.class) {
                                ((yj1) xj1VarD.f10619t).a("paidv2_user_option", Boolean.valueOf(z6));
                            }
                            return;
                        } catch (IOException e6) {
                            zzv.zzp().h("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e6);
                            return;
                        }
                    default:
                        xa0 xa0Var3 = (xa0) obj;
                        if (map.keySet().contains("start")) {
                            eb0 eb0VarZzN = xa0Var3.zzN();
                            synchronized (eb0VarZzN.f4193v) {
                            }
                            eb0VarZzN.U++;
                            eb0VarZzN.M();
                            return;
                        }
                        if (map.keySet().contains("stop")) {
                            r5.U--;
                            xa0Var3.zzN().M();
                            return;
                        } else {
                            if (map.keySet().contains("cancel")) {
                                eb0 eb0VarZzN2 = xa0Var3.zzN();
                                kk kkVar = eb0VarZzN2.f4191t;
                                if (kkVar != null) {
                                    kkVar.b(10005);
                                }
                                eb0VarZzN2.T = true;
                                eb0VarZzN2.F = 10004;
                                eb0VarZzN2.G = "Page loaded delay cancel.";
                                eb0VarZzN2.M();
                                eb0VarZzN2.s.destroy();
                                return;
                            }
                            return;
                        }
                }
            }
        };
        final int i14 = 1;
        f10687w = new yt() { // from class: com.google.android.gms.internal.ads.qt
            /* JADX WARN: Can't wrap try/catch for region: R(14:(3:67|14|15)|(13:69|17|18|23|(10:25|(1:27)|28|(1:30)|31|(1:33)|34|(1:36)|37|(2:39|(1:41)))|42|61|43|(1:49)|63|50|76|56)(1:22)|21|23|(0)|42|61|43|(0)|63|50|76|56|12) */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00ff, code lost:
            
                com.google.android.gms.ads.internal.zzv.zzp().h(r10.toString(), r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0113, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
            
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error constructing openable urls response.", r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
            @Override // com.google.android.gms.internal.ads.yt
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void d(Object obj, Map map) throws JSONException, URISyntaxException {
                int i72;
                String strOptString;
                String strOptString2;
                String strOptString3;
                String strOptString4;
                String strOptString5;
                String strOptString6;
                String strOptString7;
                ResolveInfo resolveInfoResolveActivity;
                Intent uri;
                switch (i14) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        PackageManager packageManager = sb0Var.getContext().getPackageManager();
                        try {
                            try {
                                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                                JSONObject jSONObject = new JSONObject();
                                int i82 = 0;
                                int i92 = 0;
                                while (i92 < jSONArray.length()) {
                                    try {
                                        JSONObject jSONObject2 = jSONArray.getJSONObject(i92);
                                        strOptString = jSONObject2.optString("id");
                                        strOptString2 = jSONObject2.optString("u");
                                        strOptString3 = jSONObject2.optString("i");
                                        strOptString4 = jSONObject2.optString("m");
                                        strOptString5 = jSONObject2.optString("p");
                                        strOptString6 = jSONObject2.optString("c");
                                        strOptString7 = jSONObject2.optString("intent_url");
                                        resolveInfoResolveActivity = null;
                                    } catch (JSONException e6) {
                                        i72 = i82;
                                        zzo.zzh("Error parsing the intent data.", e6);
                                    }
                                    if (TextUtils.isEmpty(strOptString7)) {
                                        i72 = i82;
                                    } else {
                                        try {
                                            uri = Intent.parseUri(strOptString7, i82);
                                            i72 = i82;
                                        } catch (URISyntaxException e7) {
                                            i72 = i82;
                                            zzo.zzh("Error parsing the url: ".concat(String.valueOf(strOptString7)), e7);
                                        }
                                        if (uri == null) {
                                            uri = new Intent();
                                            if (!TextUtils.isEmpty(strOptString2)) {
                                                uri.setData(Uri.parse(strOptString2));
                                            }
                                            if (!TextUtils.isEmpty(strOptString3)) {
                                                uri.setAction(strOptString3);
                                            }
                                            if (!TextUtils.isEmpty(strOptString4)) {
                                                uri.setType(strOptString4);
                                            }
                                            if (!TextUtils.isEmpty(strOptString5)) {
                                                uri.setPackage(strOptString5);
                                            }
                                            if (!TextUtils.isEmpty(strOptString6)) {
                                                String[] strArrSplit = strOptString6.split("/", 2);
                                                if (strArrSplit.length == 2) {
                                                    uri.setComponent(new ComponentName(strArrSplit[i72 == true ? 1 : 0], strArrSplit[1]));
                                                }
                                            }
                                        }
                                        Intent intent22 = uri;
                                        resolveInfoResolveActivity = packageManager.resolveActivity(intent22, 65536);
                                        jSONObject.put(strOptString, resolveInfoResolveActivity == null ? i72 == true ? 1 : 0 : true);
                                        i92++;
                                        i82 = i72;
                                    }
                                    uri = null;
                                    if (uri == null) {
                                    }
                                    Intent intent222 = uri;
                                    resolveInfoResolveActivity = packageManager.resolveActivity(intent222, 65536);
                                    jSONObject.put(strOptString, resolveInfoResolveActivity == null ? i72 == true ? 1 : 0 : true);
                                    i92++;
                                    i82 = i72;
                                }
                                ((lw) sb0Var).j("openableIntents", jSONObject);
                                break;
                            } catch (JSONException unused) {
                                ((lw) sb0Var).j("openableIntents", new JSONObject());
                                return;
                            }
                        } catch (JSONException unused2) {
                            ((lw) sb0Var).j("openableIntents", new JSONObject());
                            return;
                        }
                    case 1:
                        zzv.zzk().zzg();
                        break;
                    default:
                        ((xa0) obj).j0("1".equals(map.get("custom_close")));
                        break;
                }
            }
        };
        f10688x = new yt() { // from class: com.google.android.gms.internal.ads.rt
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                switch (i14) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        mt mtVar = xt.f10667a;
                        String str = (String) map.get("u");
                        if (str != null) {
                            oa0 oa0Var = (oa0) sb0Var;
                            new zzbw(sb0Var.getContext(), ((xb0) sb0Var).zzn().afmaVersion, str, null, oa0Var.d() != null ? oa0Var.d().f9215x0 : null).zzb();
                            break;
                        } else {
                            zzo.zzj("URL missing from httpTrack GMSG.");
                            break;
                        }
                    case 1:
                        zzv.zzk().zzb();
                        break;
                    default:
                        nq nqVarZzK = ((xa0) obj).zzK();
                        if (nqVarZzK != null) {
                            nqVarZzK.zzc();
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 2;
        f10689y = new yt() { // from class: com.google.android.gms.internal.ads.mt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                switch (i15) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        mt mtVar = xt.f10667a;
                        String str = (String) map.get("urls");
                        if (TextUtils.isEmpty(str)) {
                            zzo.zzj("URLs missing in canOpenURLs GMSG.");
                            break;
                        } else {
                            String[] strArrSplit = str.split(",");
                            HashMap map2 = new HashMap();
                            PackageManager packageManager = sb0Var.getContext().getPackageManager();
                            for (String str2 : strArrSplit) {
                                String[] strArrSplit2 = str2.split(";", 2);
                                Boolean boolValueOf = Boolean.valueOf(packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) != null);
                                map2.put(str2, boolValueOf);
                                zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
                            }
                            ((lw) sb0Var).G("openableURLs", map2);
                            break;
                        }
                    case 1:
                        xa0 xa0Var = (xa0) obj;
                        WindowManager windowManager = (WindowManager) xa0Var.getContext().getSystemService("window");
                        zzv.zzq();
                        DisplayMetrics displayMetricsZzu = zzs.zzu(windowManager);
                        int i72 = displayMetricsZzu.widthPixels;
                        int i82 = displayMetricsZzu.heightPixels;
                        int[] iArr = new int[2];
                        HashMap map3 = new HashMap();
                        ((View) xa0Var).getLocationInWindow(iArr);
                        map3.put("xInPixels", Integer.valueOf(iArr[0]));
                        androidx.camera.camera2.internal.compat.workaround.c.e(iArr[1], map3, "yInPixels", i72, "windowWidthInPixels");
                        map3.put("windowHeightInPixels", Integer.valueOf(i82));
                        xa0Var.G("locationReady", map3);
                        zzo.zzj("GET LOCATION COMPILED");
                        break;
                    case 2:
                        zzv.zzk().zzc();
                        break;
                    default:
                        ((xa0) obj).l(!Boolean.parseBoolean((String) map.get("disabled")));
                        break;
                }
            }
        };
        final int i16 = 2;
        A = new yt() { // from class: com.google.android.gms.internal.ads.ot
            @Override // com.google.android.gms.internal.ads.yt
            public final void d(Object obj, Map map) {
                JSONObject jSONObjectZzb;
                switch (i16) {
                    case 0:
                        sb0 sb0Var = (sb0) obj;
                        mt mtVar = xt.f10667a;
                        if (!((Boolean) zzbe.zzc().a(zn.d8)).booleanValue()) {
                            zzo.zzj("canOpenAppGmsgHandler disabled.");
                            return;
                        }
                        String str = (String) map.get("package_name");
                        if (TextUtils.isEmpty(str)) {
                            zzo.zzj("Package name missing in canOpenApp GMSG.");
                            return;
                        }
                        HashMap map2 = new HashMap();
                        Boolean boolValueOf = Boolean.valueOf(sb0Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
                        map2.put(str, boolValueOf);
                        zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
                        ((lw) sb0Var).G("openableApp", map2);
                        return;
                    case 1:
                        xa0 xa0Var = (xa0) obj;
                        nq nqVarZzK = xa0Var.zzK();
                        if (nqVarZzK == null || (jSONObjectZzb = nqVarZzK.zzb()) == null) {
                            xa0Var.j("nativeClickMetaReady", new JSONObject());
                            return;
                        } else {
                            xa0Var.j("nativeClickMetaReady", jSONObjectZzb);
                            return;
                        }
                    case 2:
                        xa0 xa0Var2 = (xa0) obj;
                        try {
                            String str2 = (String) map.get("enabled");
                            if (!rj1.p("true", str2) && !rj1.p("false", str2)) {
                                return;
                            }
                            xj1 xj1VarD = xj1.d(xa0Var2.getContext());
                            boolean z6 = Boolean.parseBoolean(str2);
                            xj1VarD.getClass();
                            synchronized (xj1.class) {
                                ((yj1) xj1VarD.f10619t).a("paidv2_user_option", Boolean.valueOf(z6));
                            }
                            return;
                        } catch (IOException e6) {
                            zzv.zzp().h("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e6);
                            return;
                        }
                    default:
                        xa0 xa0Var3 = (xa0) obj;
                        if (map.keySet().contains("start")) {
                            eb0 eb0VarZzN = xa0Var3.zzN();
                            synchronized (eb0VarZzN.f4193v) {
                            }
                            eb0VarZzN.U++;
                            eb0VarZzN.M();
                            return;
                        }
                        if (map.keySet().contains("stop")) {
                            r5.U--;
                            xa0Var3.zzN().M();
                            return;
                        } else {
                            if (map.keySet().contains("cancel")) {
                                eb0 eb0VarZzN2 = xa0Var3.zzN();
                                kk kkVar = eb0VarZzN2.f4191t;
                                if (kkVar != null) {
                                    kkVar.b(10005);
                                }
                                eb0VarZzN2.T = true;
                                eb0VarZzN2.F = 10004;
                                eb0VarZzN2.G = "Page loaded delay cancel.";
                                eb0VarZzN2.M();
                                eb0VarZzN2.s.destroy();
                                return;
                            }
                            return;
                        }
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c5.a a(xa0 xa0Var, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strA;
        final String strReplace;
        Uri uriA = Uri.parse(str);
        try {
            mf mfVarB = xa0Var.b();
            fc1 fc1VarR = xa0Var.R();
            if (!((Boolean) zzbe.zzc().a(zn.Rb)).booleanValue() || fc1VarR == null) {
                if (mfVarB != null && mfVarB.c(uriA)) {
                    uriA = mfVarB.a(uriA, xa0Var.getContext(), xa0Var.zzF(), xa0Var.zzi());
                }
            } else if (mfVarB != null && mfVarB.c(uriA)) {
                uriA = fc1VarR.a(uriA, xa0Var.getContext(), xa0Var.zzF(), xa0Var.zzi());
            }
        } catch (nf unused) {
            zzo.zzj("Unable to append parameter to URL: ".concat(str));
        }
        Map map = new HashMap();
        if (xa0Var.d() != null) {
            map = xa0Var.d().f9213w0;
        }
        Context context = xa0Var.getContext();
        if (zzv.zzo().e(context) && (strA = zzv.zzo().a(context)) != null) {
            String str2 = (String) zzbe.zzc().a(zn.f11472s0);
            String string = uriA.toString();
            if (((Boolean) zzbe.zzc().a(zn.f11467r0)).booleanValue() && string.contains(str2)) {
                b60 b60VarZzo = zzv.zzo();
                Map map2 = (Map) map.get("_ac");
                b60VarZzo.getClass();
                b60VarZzo.k(context, "_ac", strA, b60.f(map2));
                strReplace = c60.c(context, string).replace(str2, strA);
            } else if (TextUtils.isEmpty(uriA.getQueryParameter("fbs_aeid"))) {
                if (((Boolean) zzbe.zzc().a(zn.f11460q0)).booleanValue()) {
                    strReplace = string;
                } else {
                    String string2 = c60.a(c60.c(context, string), "fbs_aeid", strA).toString();
                    b60 b60VarZzo2 = zzv.zzo();
                    Map map3 = (Map) map.get("_ac");
                    b60VarZzo2.getClass();
                    b60VarZzo2.k(context, "_ac", strA, b60.f(map3));
                    strReplace = string2;
                }
            }
        } else {
            strReplace = uriA.toString();
        }
        long jLongValue = ((Long) qp.f8434e.c()).longValue();
        if (jLongValue <= 0 || jLongValue > 244410203) {
            return bs1.m(strReplace);
        }
        xr1 xr1VarP = xr1.p(xa0Var.a0());
        kt ktVar = new kt(0);
        h70 h70Var = i70.f5592g;
        return bs1.j(bs1.o(bs1.j(xr1VarP, Throwable.class, ktVar, h70Var), new pl1() { // from class: com.google.android.gms.internal.ads.lt
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.pl1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                String str3;
                String str4;
                String str5 = (String) obj;
                mt mtVar = xt.f10667a;
                String strReplace2 = strReplace;
                if (str5 != null) {
                    if (((Boolean) qp.f8435f.c()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace2).getHost();
                        for (int i6 = 0; i6 < 3; i6++) {
                            if (host.endsWith(strArr[i6])) {
                                str3 = (String) qp.f8430a.c();
                                str4 = (String) qp.f8431b.c();
                                if (!TextUtils.isEmpty(str3)) {
                                }
                                if (!TextUtils.isEmpty(str4)) {
                                }
                            }
                        }
                    } else {
                        str3 = (String) qp.f8430a.c();
                        str4 = (String) qp.f8431b.c();
                        if (!TextUtils.isEmpty(str3)) {
                            strReplace2 = strReplace2.replace(str3, str5);
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            Uri uri = Uri.parse(strReplace2);
                            if (TextUtils.isEmpty(uri.getQueryParameter(str4))) {
                                return uri.buildUpon().appendQueryParameter(str4, str5).toString();
                            }
                        }
                    }
                }
                return strReplace2;
            }
        }, h70Var), Throwable.class, new ta1(1, strReplace), h70Var);
    }

    public static void b(Map map, on0 on0Var) {
        if (((Boolean) zzbe.zzc().a(zn.Da)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && on0Var != null) {
            on0Var.O();
        }
    }
}
