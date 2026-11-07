package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u11 implements s11 {

    /* renamed from: a, reason: collision with root package name */
    public final uo0 f9425a;

    /* renamed from: b, reason: collision with root package name */
    public final hs1 f9426b;

    /* renamed from: c, reason: collision with root package name */
    public final wq0 f9427c;

    /* renamed from: d, reason: collision with root package name */
    public final sc1 f9428d;

    /* renamed from: e, reason: collision with root package name */
    public final ms0 f9429e;

    /* renamed from: f, reason: collision with root package name */
    public final zt0 f9430f;

    public u11(uo0 uo0Var, hs1 hs1Var, wq0 wq0Var, sc1 sc1Var, ms0 ms0Var, zt0 zt0Var) {
        this.f9425a = uo0Var;
        this.f9426b = hs1Var;
        this.f9427c = wq0Var;
        this.f9428d = sc1Var;
        this.f9429e = ms0Var;
        this.f9430f = zt0Var;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final boolean a(ac1 ac1Var, tb1 tb1Var) {
        xb1 xb1Var = tb1Var.s;
        return (xb1Var == null || xb1Var.f10474c == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final c5.a b(ac1 ac1Var, tb1 tb1Var) {
        c5.a aVarA = this.f9428d.a();
        ux0 ux0Var = new ux0(1, this, tb1Var);
        hs1 hs1Var = this.f9426b;
        return bs1.p(bs1.p(aVarA, ux0Var, hs1Var), new g01(this, ac1Var, tb1Var), hs1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tr1 c(final ac1 ac1Var, final tb1 tb1Var, final JSONObject jSONObject) {
        c5.a aVar;
        c5.a aVar2;
        String str;
        boolean z6;
        c5.a aVarP;
        int i6;
        gr0 gr0Var;
        zzs zzsVar;
        final JSONObject jSONObjectOptJSONObject;
        c5.a aVarP2;
        JSONObject jSONObjectZzh;
        c5.a aVar3;
        c5.a aVar4;
        hs1 hs1Var;
        c5.a aVarC;
        ds1 ds1VarM;
        JSONArray jSONArrayOptJSONArray;
        boolean z7;
        c5.a aVarO;
        String strOptString;
        JSONArray jSONArray;
        int i7;
        kr0 kr0Var;
        Future futureO;
        JSONObject jSONObjectOptJSONObject2;
        c5.a aVarP3;
        final c5.a aVar5;
        ArrayList arrayList;
        gr1 gr1VarP;
        final tb1 tb1Var2 = tb1Var;
        if (((Boolean) zzbe.zzc().a(zn.f11437m2)).booleanValue()) {
            androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-creation-start", this.f9430f.f11577c);
        }
        c5.a aVarA = this.f9428d.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.qq0
            @Override // java.util.concurrent.Callable
            public final Object call() throws p21 {
                jp0 jp0Var = new jp0();
                JSONObject jSONObject2 = jSONObject;
                int iOptInt = jSONObject2.optInt("template_id", -1);
                synchronized (jp0Var) {
                    jp0Var.f6123a = iOptInt;
                }
                String strOptString2 = jSONObject2.optString("custom_template_id");
                synchronized (jp0Var) {
                    jp0Var.f6141u = strOptString2;
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("omid_settings");
                String strOptString3 = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("omid_partner_name") : null;
                ac1 ac1Var2 = ac1Var;
                synchronized (jp0Var) {
                    jp0Var.f6145y = strOptString3;
                }
                ec1 ec1Var = (ec1) ac1Var2.f2647a.f9702t;
                if (!ec1Var.f4212g.contains(Integer.toString(jp0Var.g()))) {
                    throw new p21(1, androidx.camera.camera2.internal.compat.workaround.c.d(jp0Var.g(), "Invalid template ID: "));
                }
                if (jp0Var.g() == 3) {
                    if (jp0Var.a() == null) {
                        throw new p21(1, "No custom template id for custom template ad response.");
                    }
                    if (!ec1Var.h.contains(jp0Var.a())) {
                        throw new p21(1, "Unexpected custom template id in the response.");
                    }
                }
                tb1 tb1Var3 = tb1Var2;
                double dOptDouble = jSONObject2.optDouble("rating", -1.0d);
                synchronized (jp0Var) {
                    jp0Var.f6139r = dOptDouble;
                }
                String strOptString4 = jSONObject2.optString("headline", null);
                if (tb1Var3.M) {
                    zzv.zzq();
                    strOptString4 = androidx.activity.m.d(com.google.android.gms.ads.internal.util.zzs.zzz(), " : ", strOptString4);
                }
                jp0Var.d("headline", strOptString4);
                jp0Var.d("body", jSONObject2.optString("body", null));
                jp0Var.d("call_to_action", jSONObject2.optString("call_to_action", null));
                jp0Var.d("store", jSONObject2.optString("store", null));
                jp0Var.d("price", jSONObject2.optString("price", null));
                jp0Var.d("advertiser", jSONObject2.optString("advertiser", null));
                return jp0Var;
            }
        };
        wq0 wq0Var = this.f9427c;
        hs1 hs1Var2 = wq0Var.f10251a;
        final c5.a aVarU = hs1Var2.u(callable);
        final gr0 gr0Var2 = wq0Var.f10252b;
        oq oqVar = gr0Var2.h;
        c5.a aVarB = gr0Var2.b(jSONObject.optJSONArray("images"), oqVar.f7838t, oqVar.f7840v);
        final vb1 vb1Var = (vb1) ac1Var.f2648b.f1103u;
        if (((Boolean) zzbe.zzc().a(zn.S9)).booleanValue()) {
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("images");
            if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                aVar = aVarA;
                aVar2 = aVarB;
                str = "html";
                z6 = true;
                aVarP = ds1.f4001t;
            } else {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(0);
                if (jSONObjectOptJSONObject3 == null) {
                    aVarP = ds1.f4001t;
                } else {
                    final String strOptString2 = jSONObjectOptJSONObject3.optString("base_url");
                    final String strOptString3 = jSONObjectOptJSONObject3.optString("html");
                    aVar = aVarA;
                    int iOptInt = jSONObjectOptJSONObject3.optInt("width", 0);
                    int iOptInt2 = jSONObjectOptJSONObject3.optInt("height", 0);
                    if (iOptInt != 0) {
                        i6 = iOptInt;
                    } else if (iOptInt2 != 0) {
                        i6 = 0;
                    } else {
                        zzsVar = zzs.zzc();
                        gr0Var = gr0Var2;
                        if (TextUtils.isEmpty(strOptString3)) {
                            aVar2 = aVarB;
                            str = "html";
                            gr0Var2 = gr0Var;
                            final zzs zzsVar2 = zzsVar;
                            z6 = true;
                            tb1Var2 = tb1Var;
                            gr1 gr1VarP2 = bs1.p(ds1.f4001t, new pr1() { // from class: com.google.android.gms.internal.ads.zq0
                                @Override // com.google.android.gms.internal.ads.pr1
                                public final c5.a zza(Object obj) {
                                    gr0 gr0Var3 = gr0Var2;
                                    zzs zzsVar3 = zzsVar2;
                                    tb1 tb1Var3 = tb1Var;
                                    vb1 vb1Var2 = vb1Var;
                                    String str2 = strOptString2;
                                    String str3 = strOptString3;
                                    xa0 xa0VarA = gr0Var3.f5132j.a(zzsVar3, tb1Var3, vb1Var2);
                                    n70 n70Var = new n70(xa0VarA);
                                    js0 js0Var = gr0Var3.f5134l.f7218a;
                                    xa0VarA.zzN().j(js0Var, js0Var, js0Var, js0Var, js0Var, false, null, new zzb(gr0Var3.f5124a, null, null), null, null, gr0Var3.f5137o, gr0Var3.f5136n, gr0Var3.f5135m, null, js0Var, null, null, null, null);
                                    xa0VarA.Z("/getNativeAdViewSignals", xt.s);
                                    xa0VarA.Z("/getNativeClickMeta", xt.f10684t);
                                    eb0 eb0VarZzN = xa0VarA.zzN();
                                    synchronized (eb0VarZzN.f4193v) {
                                        eb0VarZzN.K = true;
                                    }
                                    xa0VarA.zzN().f4196y = new l2(9, n70Var);
                                    xa0VarA.K(str2, str3);
                                    return n70Var;
                                }
                            }, i70.f5591f);
                            aVarP = bs1.p(gr1VarP2, new l50(1, gr1VarP2), i70.f5592g);
                        } else {
                            aVarP = ds1.f4001t;
                            tb1Var2 = tb1Var;
                            aVar2 = aVarB;
                            str = "html";
                            gr0Var2 = gr0Var;
                            z6 = true;
                        }
                    }
                    gr0Var = gr0Var2;
                    zzsVar = new zzs(gr0Var2.f5124a, new AdSize(i6, iOptInt2));
                    if (TextUtils.isEmpty(strOptString3)) {
                    }
                }
            }
            final c5.a aVarA2 = gr0Var2.a(jSONObject.optJSONObject("secondary_image"), oqVar.f7838t);
            c5.a aVarA3 = gr0Var2.a(jSONObject.optJSONObject("app_icon"), oqVar.f7838t);
            jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
            if (jSONObjectOptJSONObject != null) {
                aVarP2 = ds1.f4001t;
            } else {
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("images");
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("image");
                if (jSONArrayOptJSONArray3 == null && jSONObjectOptJSONObject4 != null) {
                    jSONArrayOptJSONArray3 = new JSONArray();
                    jSONArrayOptJSONArray3.put(jSONObjectOptJSONObject4);
                }
                hr1 hr1VarO = bs1.o(gr0Var2.b(jSONArrayOptJSONArray3, false, z6), new pl1() { // from class: com.google.android.gms.internal.ads.br0
                    @Override // com.google.android.gms.internal.ads.pl1
                    public final Object apply(Object obj) throws JSONException {
                        int i8;
                        Integer num;
                        Integer num2;
                        Integer num3;
                        List list = (List) obj;
                        gr0 gr0Var3 = gr0Var2;
                        gr0Var3.getClass();
                        if (list == null || list.isEmpty()) {
                            return null;
                        }
                        JSONObject jSONObject2 = jSONObjectOptJSONObject;
                        String strOptString4 = jSONObject2.optString("text");
                        Integer numD = gr0.d("bg_color", jSONObject2);
                        Integer numD2 = gr0.d("text_color", jSONObject2);
                        int iOptInt3 = jSONObject2.optInt("text_size", -1);
                        jSONObject2.optBoolean("allow_pub_rendering");
                        int iOptInt4 = jSONObject2.optInt("animation_ms", CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
                        int iOptInt5 = jSONObject2.optInt("presentation_ms", 4000);
                        if (iOptInt3 > 0) {
                            Integer numValueOf = Integer.valueOf(iOptInt3);
                            i8 = iOptInt5;
                            num = numD;
                            num2 = numD2;
                            num3 = numValueOf;
                        } else {
                            i8 = iOptInt5;
                            num = numD;
                            num2 = numD2;
                            num3 = null;
                        }
                        return new kq(strOptString4, list, num, num2, num3, i8 + iOptInt4, gr0Var3.h.f7841w);
                    }
                }, gr0Var2.f5130g);
                aVarP2 = jSONObjectOptJSONObject.optBoolean("require") ? bs1.p(hr1VarO, new dr0(0, hr1VarO), i70.f5592g) : bs1.k(hr1VarO, Exception.class, new cr0(0), i70.f5592g);
            }
            vb1 vb1Var2 = (vb1) ac1Var.f2648b.f1103u;
            jSONObjectZzh = zzbs.zzh(jSONObject, "html_containers", "instream");
            if (jSONObjectZzh != null) {
                JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("video");
                if (jSONObjectOptJSONObject5 == null) {
                    aVarC = ds1.f4001t;
                    aVar3 = aVarA3;
                    aVar4 = aVarP2;
                    hs1Var = hs1Var2;
                } else {
                    String strOptString4 = jSONObjectOptJSONObject5.optString("vast_xml");
                    hs1Var = hs1Var2;
                    boolean z8 = ((Boolean) zzbe.zzc().a(zn.R9)).booleanValue() && jSONObjectOptJSONObject5.has(str);
                    if (!TextUtils.isEmpty(strOptString4)) {
                        if (!z8) {
                            qr0 qr0Var = gr0Var2.f5131i;
                            qr0Var.getClass();
                            ds1 ds1Var = ds1.f4001t;
                            aVar4 = aVarP2;
                            rf0 rf0Var = new rf0(1, qr0Var);
                            Executor executor = qr0Var.f8446b;
                            aVar3 = aVarA3;
                            gr1VarP = bs1.p(bs1.p(ds1Var, rf0Var, executor), new qf0(1, qr0Var, jSONObjectOptJSONObject5), executor);
                        }
                        aVarC = bs1.k(bs1.q(gr1VarP, ((Integer) zzbe.zzc().a(zn.S3)).intValue(), TimeUnit.SECONDS, gr0Var2.f5133k), Exception.class, new cr0(0), i70.f5592g);
                    } else if (!z8) {
                        zzo.zzj("Required field 'vast_xml' or 'html' is missing");
                        aVarC = ds1.f4001t;
                        aVar3 = aVarA3;
                        aVar4 = aVarP2;
                    }
                    aVar3 = aVarA3;
                    aVar4 = aVarP2;
                    gr1VarP = gr0Var2.c(jSONObjectOptJSONObject5, tb1Var2, vb1Var2);
                    aVarC = bs1.k(bs1.q(gr1VarP, ((Integer) zzbe.zzc().a(zn.S3)).intValue(), TimeUnit.SECONDS, gr0Var2.f5133k), Exception.class, new cr0(0), i70.f5592g);
                }
            } else {
                aVar3 = aVarA3;
                aVar4 = aVarP2;
                hs1Var = hs1Var2;
                aVarC = gr0Var2.c(jSONObjectZzh, tb1Var2, vb1Var2);
            }
            if (((Boolean) zzbe.zzc().a(zn.Oc)).booleanValue() || ((Integer) Optional.ofNullable(jSONObject.optJSONObject("video")).map(new rq0()).map(new sq0()).map(new tq0()).orElse(0)).intValue() != 3) {
                ds1VarM = bs1.m(new Bundle());
            } else {
                o70 o70Var = new o70();
                aVarC.addListener(new as1(0, aVarC, new fr0(o70Var)), i70.f5591f);
                ds1VarM = o70Var;
            }
            final ds1 ds1Var2 = ds1VarM;
            kr0 kr0Var2 = wq0Var.f10253c;
            Executor executor2 = kr0Var2.f6484a;
            jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
            if (jSONArrayOptJSONArray != null) {
                aVarO = bs1.m(Collections.EMPTY_LIST);
                z7 = false;
            } else {
                ArrayList arrayList2 = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                int i8 = 0;
                while (i8 < length) {
                    JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray.optJSONObject(i8);
                    if (jSONObjectOptJSONObject6 == null || (strOptString = jSONObjectOptJSONObject6.optString("name")) == null) {
                        Future future = ds1.f4001t;
                        kr0Var = kr0Var2;
                        jSONArray = jSONArrayOptJSONArray;
                        i7 = length;
                        futureO = future;
                        arrayList2.add(futureO);
                        i8++;
                        jSONArrayOptJSONArray = jSONArray;
                        length = i7;
                        kr0Var2 = kr0Var;
                    } else {
                        jSONArray = jSONArrayOptJSONArray;
                        String strOptString5 = jSONObjectOptJSONObject6.optString("type");
                        i7 = length;
                        if ("string".equals(strOptString5)) {
                            kr0Var = kr0Var2;
                            futureO = bs1.m(new jr0(strOptString, jSONObjectOptJSONObject6.optString("string_value")));
                            arrayList2.add(futureO);
                            i8++;
                            jSONArrayOptJSONArray = jSONArray;
                            length = i7;
                            kr0Var2 = kr0Var;
                        } else {
                            if ("image".equals(strOptString5)) {
                                gr0 gr0Var3 = kr0Var2.f6485b;
                                kr0Var = kr0Var2;
                                futureO = bs1.o(gr0Var3.a(jSONObjectOptJSONObject6.optJSONObject("image_value"), gr0Var3.h.f7838t), new ir0(0, strOptString), executor2);
                            } else {
                                kr0Var = kr0Var2;
                                futureO = ds1.f4001t;
                            }
                            arrayList2.add(futureO);
                            i8++;
                            jSONArrayOptJSONArray = jSONArray;
                            length = i7;
                            kr0Var2 = kr0Var;
                        }
                    }
                }
                z7 = false;
                aVarO = bs1.o(new qr1(bo1.l(arrayList2), true), new a6(1), executor2);
            }
            if (jSONObject.optBoolean("enable_omid") || (jSONObjectOptJSONObject2 = jSONObject.optJSONObject("omid_settings")) == null) {
                aVarP3 = ds1.f4001t;
            } else {
                String strOptString6 = jSONObjectOptJSONObject2.optString("omid_html");
                aVarP3 = !TextUtils.isEmpty(strOptString6) ? ds1.f4001t : bs1.p(ds1.f4001t, new pt(1, gr0Var2, strOptString6), i70.f5591f);
            }
            aVar5 = aVarP3;
            arrayList = new ArrayList();
            arrayList.add(aVarU);
            final c5.a aVar6 = aVar2;
            arrayList.add(aVar6);
            arrayList.add(aVarP);
            arrayList.add(aVarA2);
            final c5.a aVar7 = aVar3;
            arrayList.add(aVar7);
            final c5.a aVar8 = aVar4;
            arrayList.add(aVar8);
            arrayList.add(aVarC);
            arrayList.add(ds1Var2);
            arrayList.add(aVarO);
            if (((Boolean) zzbe.zzc().a(zn.f11433l5)).booleanValue() || jSONObject.optInt("template_id") == 3) {
                arrayList.add(aVar5);
            }
            bo1 bo1VarL = bo1.l(arrayList);
            final c5.a aVar9 = aVarC;
            final c5.a aVar10 = aVarO;
            final c5.a aVar11 = aVarP;
            boolean z9 = z7;
            Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.ads.uq0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    JSONArray jSONArrayOptJSONArray4;
                    List listL;
                    JSONObject jSONObjectOptJSONObject7;
                    c5.a aVar12 = aVarU;
                    c5.a aVar13 = aVar6;
                    c5.a aVar14 = aVar7;
                    c5.a aVar15 = aVarA2;
                    c5.a aVar16 = aVar8;
                    JSONObject jSONObject2 = jSONObject;
                    c5.a aVar17 = aVar9;
                    c5.a aVar18 = ds1Var2;
                    c5.a aVar19 = aVar11;
                    c5.a aVar20 = aVar5;
                    c5.a aVar21 = aVar10;
                    jp0 jp0Var = (jp0) aVar12.get();
                    List list = (List) aVar13.get();
                    synchronized (jp0Var) {
                        jp0Var.f6127e = list;
                    }
                    yq yqVar = (yq) aVar14.get();
                    synchronized (jp0Var) {
                        jp0Var.s = yqVar;
                    }
                    yq yqVar2 = (yq) aVar15.get();
                    synchronized (jp0Var) {
                        jp0Var.f6140t = yqVar2;
                    }
                    sq sqVar = (sq) aVar16.get();
                    synchronized (jp0Var) {
                        jp0Var.f6125c = sqVar;
                    }
                    JSONObject jSONObjectOptJSONObject8 = jSONObject2.optJSONObject("mute");
                    if (jSONObjectOptJSONObject8 == null || (jSONArrayOptJSONArray4 = jSONObjectOptJSONObject8.optJSONArray("reasons")) == null || jSONArrayOptJSONArray4.length() <= 0) {
                        zn1 zn1Var = bo1.f3236t;
                        listL = cp1.f3636w;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i9 = 0; i9 < jSONArrayOptJSONArray4.length(); i9++) {
                            zzez zzezVarE = gr0.e(jSONArrayOptJSONArray4.optJSONObject(i9));
                            if (zzezVarE != null) {
                                arrayList3.add(zzezVarE);
                            }
                        }
                        listL = bo1.l(arrayList3);
                    }
                    synchronized (jp0Var) {
                        jp0Var.f6128f = listL;
                    }
                    JSONObject jSONObjectOptJSONObject9 = jSONObject2.optJSONObject("mute");
                    zzez zzezVarE2 = (jSONObjectOptJSONObject9 == null || (jSONObjectOptJSONObject7 = jSONObjectOptJSONObject9.optJSONObject("default_reason")) == null) ? null : gr0.e(jSONObjectOptJSONObject7);
                    synchronized (jp0Var) {
                        jp0Var.f6129g = zzezVarE2;
                    }
                    xa0 xa0Var = (xa0) aVar17.get();
                    if (xa0Var != null) {
                        synchronized (jp0Var) {
                            jp0Var.f6130i = xa0Var;
                        }
                        View viewZzF = xa0Var.zzF();
                        synchronized (jp0Var) {
                            jp0Var.f6136o = viewZzF;
                        }
                        ob0 ob0VarZzq = xa0Var.zzq();
                        synchronized (jp0Var) {
                            jp0Var.f6124b = ob0VarZzq;
                        }
                    }
                    jp0Var.h().putAll((Bundle) aVar18.get());
                    xa0 xa0Var2 = (xa0) aVar19.get();
                    if (xa0Var2 != null) {
                        synchronized (jp0Var) {
                            jp0Var.f6131j = xa0Var2;
                        }
                        View viewZzF2 = xa0Var2.zzF();
                        synchronized (jp0Var) {
                            jp0Var.f6137p = viewZzF2;
                        }
                    }
                    if (!((Boolean) zzbe.zzc().a(zn.f11433l5)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                        xa0 xa0Var3 = (xa0) aVar20.get();
                        if (xa0Var3 != null) {
                            synchronized (jp0Var) {
                                jp0Var.f6132k = xa0Var3;
                            }
                        }
                    } else {
                        synchronized (jp0Var) {
                            jp0Var.f6134m = aVar20;
                        }
                        o70 o70Var2 = new o70();
                        synchronized (jp0Var) {
                            jp0Var.f6135n = o70Var2;
                        }
                    }
                    for (jr0 jr0Var : (List) aVar21.get()) {
                        if (jr0Var.f6155a != 1) {
                            String str2 = jr0Var.f6156b;
                            mq mqVar = jr0Var.f6158d;
                            synchronized (jp0Var) {
                                if (mqVar == null) {
                                    jp0Var.f6142v.remove(str2);
                                } else {
                                    jp0Var.f6142v.put(str2, mqVar);
                                }
                            }
                        } else {
                            jp0Var.d(jr0Var.f6156b, jr0Var.f6157c);
                        }
                    }
                    return jp0Var;
                }
            };
            final tr1 tr1Var = new tr1(bo1VarL, z9, z9);
            tr1Var.H = new sr1(tr1Var, callable2, hs1Var);
            tr1Var.u();
            c5.a[] aVarArr = new c5.a[2];
            aVarArr[z9 ? 1 : 0] = aVar;
            aVarArr[1] = tr1Var;
            cp1 cp1VarM = bo1.m(aVarArr);
            final c5.a aVar12 = aVar;
            Callable callable3 = new Callable() { // from class: com.google.android.gms.internal.ads.t11
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object call() {
                    xa0 xa0Var;
                    u11 u11Var = this.f9065a;
                    tr1 tr1Var2 = tr1Var;
                    c5.a aVar13 = aVar12;
                    ac1 ac1Var2 = ac1Var;
                    tb1 tb1Var3 = tb1Var;
                    JSONObject jSONObject2 = jSONObject;
                    jp0 jp0Var = (jp0) tr1Var2.get();
                    gs0 gs0Var = (gs0) aVar13.get();
                    nn nnVar = zn.f11437m2;
                    if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                        androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-creation-end", u11Var.f9430f.f11577c);
                    }
                    sd0 sd0VarA = u11Var.f9425a.a(new androidx.camera.view.b(ac1Var2, tb1Var3, null), new ck1(5, jp0Var), new j00(3, jSONObject2, gs0Var));
                    if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                        long jA = zzv.zzC().a();
                        u11Var.f9430f.f11577c.putLong("rendering-ad-component-creation-end", jA);
                        u11Var.f9430f.f11577c.putLong("rendering-configure-webview-start", jA);
                    }
                    pp0 pp0Var = (pp0) sd0VarA.f8902v.f5680a.s;
                    ih1.j(pp0Var);
                    w92 w92Var = sd0VarA.f8904x;
                    j00 j00Var = sd0VarA.f8901u;
                    jp0 jp0Var2 = (jp0) sd0VarA.f8900t.f3613t;
                    ih1.j(jp0Var2);
                    gs0 gs0Var2 = (gs0) j00Var.f5892u;
                    ih1.j(gs0Var2);
                    xr0 xr0Var = new xr0(pp0Var, jp0Var2, gs0Var2, w92.a(w92Var));
                    if (xr0Var.s != null) {
                        xr0Var.f10665t.c("/nativeAdCustomClick", xr0Var);
                    }
                    ds0 ds0Var = (ds0) sd0VarA.f8905y.zzb();
                    fl0 fl0Var = ds0Var.f3995b;
                    yr0 yr0Var = gs0Var.f5140a;
                    Objects.requireNonNull(fl0Var);
                    cs0 cs0Var = new cs0(0, fl0Var);
                    nk0 nk0Var = ds0Var.f3994a;
                    ml0 ml0Var = ds0Var.f3996c;
                    rl0 rl0Var = ds0Var.f3997d;
                    gm0 gm0Var = ds0Var.f3998e;
                    synchronized (yr0Var) {
                        yr0Var.s = nk0Var;
                        yr0Var.f11064t = ml0Var;
                        yr0Var.f11065u = rl0Var;
                        yr0Var.f11066v = gm0Var;
                        yr0Var.f11067w = cs0Var;
                    }
                    tb1 tb1Var4 = ds0Var.f3999f;
                    vb1 vb1Var3 = ds0Var.f4000g;
                    vf0 vf0Var = ds0Var.h;
                    synchronized (gs0Var) {
                        hr1 hr1Var = gs0Var.f5151m;
                        if (hr1Var != null) {
                            mx mxVar = new mx(gs0Var, tb1Var4, vb1Var3, vf0Var, 1);
                            hr1Var.addListener(new as1(0, hr1Var, mxVar), gs0Var.f5144e);
                        }
                    }
                    pr0 pr0Var = (pr0) sd0VarA.f8906z.zzb();
                    final xa0 xa0VarM = jp0Var.m();
                    vf0 vf0Var2 = pr0Var.f8138d;
                    sg0 sg0Var = pr0Var.f8136b;
                    Executor executor3 = pr0Var.f8135a;
                    ln0 ln0Var = pr0Var.f8137c;
                    if (xa0VarM != null) {
                        ln0Var.p0(xa0VarM.zzF());
                        ln0Var.l0(new bi() { // from class: com.google.android.gms.internal.ads.nr0
                            @Override // com.google.android.gms.internal.ads.bi
                            public final void C(ai aiVar) {
                                eb0 eb0VarZzN = xa0VarM.zzN();
                                Rect rect = aiVar.f2767d;
                                eb0VarZzN.c0(rect.left, rect.top);
                            }
                        }, executor3);
                        ln0Var.l0(new or0(xa0VarM, 0), executor3);
                        ln0Var.l0(sg0Var, executor3);
                        sg0Var.s = xa0VarM;
                        eb0 eb0VarZzN = xa0VarM.zzN();
                        if (((Boolean) zzbe.zzc().a(zn.Y9)).booleanValue() && eb0VarZzN != null) {
                            eb0VarZzN.f("/click");
                            eb0VarZzN.a("/click", new nt(eb0VarZzN.C, vf0Var2));
                            eb0VarZzN.e(vf0Var2, null, null);
                        }
                        xa0VarM.Z("/trackActiveViewUnit", new au(3, pr0Var));
                        xa0VarM.Z("/untrackActiveViewUnit", new nu(2, pr0Var));
                    }
                    ls0 ls0Var = (ls0) sd0VarA.A.zzb();
                    ms0 ms0Var = u11Var.f9429e;
                    synchronized (jp0Var) {
                        xa0Var = jp0Var.f6131j;
                    }
                    ls0Var.getClass();
                    js0 js0Var = ms0Var.f7218a;
                    final fl0 fl0Var2 = ls0Var.f6840b;
                    Objects.requireNonNull(fl0Var2);
                    zzac zzacVar = new zzac() { // from class: com.google.android.gms.internal.ads.ks0
                        @Override // com.google.android.gms.ads.internal.overlay.zzac
                        public final void zzg() {
                            fl0Var2.zzb();
                        }
                    };
                    nk0 nk0Var2 = ls0Var.f6839a;
                    ml0 ml0Var2 = ls0Var.f6841c;
                    rl0 rl0Var2 = ls0Var.f6842d;
                    gm0 gm0Var2 = ls0Var.f6843e;
                    nn0 nn0Var = ls0Var.f6844f;
                    synchronized (js0Var) {
                        synchronized (js0Var) {
                            js0Var.s = nk0Var2;
                            js0Var.f11064t = ml0Var2;
                            js0Var.f11065u = rl0Var2;
                            js0Var.f11066v = gm0Var2;
                            js0Var.f11067w = zzacVar;
                        }
                        if (((Boolean) zzbe.zzc().a(zn.Z9)).booleanValue() && xa0Var != null && xa0Var.zzN() != null) {
                            eb0 eb0VarZzN2 = xa0Var.zzN();
                            eb0VarZzN2.c(ls0Var.f6847j, ls0Var.f6846i, ls0Var.h);
                            eb0VarZzN2.e(ls0Var.f6847j, ls0Var.f6846i, ls0Var.f6845g);
                        }
                        if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                            androidx.camera.camera2.internal.compat.workaround.c.f("rendering-configure-webview-end", u11Var.f9430f.f11577c);
                        }
                        return (fp0) sd0VarA.f8903w.zzb();
                    }
                    js0Var.f6161x = nn0Var;
                    if (((Boolean) zzbe.zzc().a(zn.Z9)).booleanValue()) {
                        eb0 eb0VarZzN22 = xa0Var.zzN();
                        eb0VarZzN22.c(ls0Var.f6847j, ls0Var.f6846i, ls0Var.h);
                        eb0VarZzN22.e(ls0Var.f6847j, ls0Var.f6846i, ls0Var.f6845g);
                    }
                    if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    }
                    return (fp0) sd0VarA.f8903w.zzb();
                }
            };
            tr1 tr1Var2 = new tr1(cp1VarM, true, z9);
            tr1Var2.H = new sr1(tr1Var2, callable3, this.f9426b);
            tr1Var2.u();
            return tr1Var2;
        }
        aVarP = ds1.f4001t;
        aVar = aVarA;
        aVar2 = aVarB;
        str = "html";
        z6 = true;
        final c5.a aVarA22 = gr0Var2.a(jSONObject.optJSONObject("secondary_image"), oqVar.f7838t);
        c5.a aVarA32 = gr0Var2.a(jSONObject.optJSONObject("app_icon"), oqVar.f7838t);
        jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject != null) {
        }
        vb1 vb1Var22 = (vb1) ac1Var.f2648b.f1103u;
        jSONObjectZzh = zzbs.zzh(jSONObject, "html_containers", "instream");
        if (jSONObjectZzh != null) {
        }
        if (((Boolean) zzbe.zzc().a(zn.Oc)).booleanValue()) {
            ds1VarM = bs1.m(new Bundle());
        }
        final c5.a ds1Var22 = ds1VarM;
        kr0 kr0Var22 = wq0Var.f10253c;
        Executor executor22 = kr0Var22.f6484a;
        jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray != null) {
        }
        if (jSONObject.optBoolean("enable_omid")) {
            aVarP3 = ds1.f4001t;
        } else {
            String strOptString62 = jSONObjectOptJSONObject2.optString("omid_html");
            if (!TextUtils.isEmpty(strOptString62)) {
            }
        }
        aVar5 = aVarP3;
        arrayList = new ArrayList();
        arrayList.add(aVarU);
        final c5.a aVar62 = aVar2;
        arrayList.add(aVar62);
        arrayList.add(aVarP);
        arrayList.add(aVarA22);
        final c5.a aVar72 = aVar3;
        arrayList.add(aVar72);
        final c5.a aVar82 = aVar4;
        arrayList.add(aVar82);
        arrayList.add(aVarC);
        arrayList.add(ds1Var22);
        arrayList.add(aVarO);
        if (((Boolean) zzbe.zzc().a(zn.f11433l5)).booleanValue()) {
            arrayList.add(aVar5);
        }
        bo1 bo1VarL2 = bo1.l(arrayList);
        final c5.a aVar92 = aVarC;
        final c5.a aVar102 = aVarO;
        final c5.a aVar112 = aVarP;
        boolean z92 = z7;
        Callable callable22 = new Callable() { // from class: com.google.android.gms.internal.ads.uq0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArrayOptJSONArray4;
                List listL;
                JSONObject jSONObjectOptJSONObject7;
                c5.a aVar122 = aVarU;
                c5.a aVar13 = aVar62;
                c5.a aVar14 = aVar72;
                c5.a aVar15 = aVarA22;
                c5.a aVar16 = aVar82;
                JSONObject jSONObject2 = jSONObject;
                c5.a aVar17 = aVar92;
                c5.a aVar18 = ds1Var22;
                c5.a aVar19 = aVar112;
                c5.a aVar20 = aVar5;
                c5.a aVar21 = aVar102;
                jp0 jp0Var = (jp0) aVar122.get();
                List list = (List) aVar13.get();
                synchronized (jp0Var) {
                    jp0Var.f6127e = list;
                }
                yq yqVar = (yq) aVar14.get();
                synchronized (jp0Var) {
                    jp0Var.s = yqVar;
                }
                yq yqVar2 = (yq) aVar15.get();
                synchronized (jp0Var) {
                    jp0Var.f6140t = yqVar2;
                }
                sq sqVar = (sq) aVar16.get();
                synchronized (jp0Var) {
                    jp0Var.f6125c = sqVar;
                }
                JSONObject jSONObjectOptJSONObject8 = jSONObject2.optJSONObject("mute");
                if (jSONObjectOptJSONObject8 == null || (jSONArrayOptJSONArray4 = jSONObjectOptJSONObject8.optJSONArray("reasons")) == null || jSONArrayOptJSONArray4.length() <= 0) {
                    zn1 zn1Var = bo1.f3236t;
                    listL = cp1.f3636w;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (int i9 = 0; i9 < jSONArrayOptJSONArray4.length(); i9++) {
                        zzez zzezVarE = gr0.e(jSONArrayOptJSONArray4.optJSONObject(i9));
                        if (zzezVarE != null) {
                            arrayList3.add(zzezVarE);
                        }
                    }
                    listL = bo1.l(arrayList3);
                }
                synchronized (jp0Var) {
                    jp0Var.f6128f = listL;
                }
                JSONObject jSONObjectOptJSONObject9 = jSONObject2.optJSONObject("mute");
                zzez zzezVarE2 = (jSONObjectOptJSONObject9 == null || (jSONObjectOptJSONObject7 = jSONObjectOptJSONObject9.optJSONObject("default_reason")) == null) ? null : gr0.e(jSONObjectOptJSONObject7);
                synchronized (jp0Var) {
                    jp0Var.f6129g = zzezVarE2;
                }
                xa0 xa0Var = (xa0) aVar17.get();
                if (xa0Var != null) {
                    synchronized (jp0Var) {
                        jp0Var.f6130i = xa0Var;
                    }
                    View viewZzF = xa0Var.zzF();
                    synchronized (jp0Var) {
                        jp0Var.f6136o = viewZzF;
                    }
                    ob0 ob0VarZzq = xa0Var.zzq();
                    synchronized (jp0Var) {
                        jp0Var.f6124b = ob0VarZzq;
                    }
                }
                jp0Var.h().putAll((Bundle) aVar18.get());
                xa0 xa0Var2 = (xa0) aVar19.get();
                if (xa0Var2 != null) {
                    synchronized (jp0Var) {
                        jp0Var.f6131j = xa0Var2;
                    }
                    View viewZzF2 = xa0Var2.zzF();
                    synchronized (jp0Var) {
                        jp0Var.f6137p = viewZzF2;
                    }
                }
                if (!((Boolean) zzbe.zzc().a(zn.f11433l5)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                    xa0 xa0Var3 = (xa0) aVar20.get();
                    if (xa0Var3 != null) {
                        synchronized (jp0Var) {
                            jp0Var.f6132k = xa0Var3;
                        }
                    }
                } else {
                    synchronized (jp0Var) {
                        jp0Var.f6134m = aVar20;
                    }
                    o70 o70Var2 = new o70();
                    synchronized (jp0Var) {
                        jp0Var.f6135n = o70Var2;
                    }
                }
                for (jr0 jr0Var : (List) aVar21.get()) {
                    if (jr0Var.f6155a != 1) {
                        String str2 = jr0Var.f6156b;
                        mq mqVar = jr0Var.f6158d;
                        synchronized (jp0Var) {
                            if (mqVar == null) {
                                jp0Var.f6142v.remove(str2);
                            } else {
                                jp0Var.f6142v.put(str2, mqVar);
                            }
                        }
                    } else {
                        jp0Var.d(jr0Var.f6156b, jr0Var.f6157c);
                    }
                }
                return jp0Var;
            }
        };
        final tr1 tr1Var3 = new tr1(bo1VarL2, z92, z92);
        tr1Var3.H = new sr1(tr1Var3, callable22, hs1Var);
        tr1Var3.u();
        c5.a[] aVarArr2 = new c5.a[2];
        aVarArr2[z92 ? 1 : 0] = aVar;
        aVarArr2[1] = tr1Var3;
        cp1 cp1VarM2 = bo1.m(aVarArr2);
        final c5.a aVar122 = aVar;
        Callable callable32 = new Callable() { // from class: com.google.android.gms.internal.ads.t11
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:51:0x01dd  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                xa0 xa0Var;
                u11 u11Var = this.f9065a;
                tr1 tr1Var22 = tr1Var3;
                c5.a aVar13 = aVar122;
                ac1 ac1Var2 = ac1Var;
                tb1 tb1Var3 = tb1Var;
                JSONObject jSONObject2 = jSONObject;
                jp0 jp0Var = (jp0) tr1Var22.get();
                gs0 gs0Var = (gs0) aVar13.get();
                nn nnVar = zn.f11437m2;
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-creation-end", u11Var.f9430f.f11577c);
                }
                sd0 sd0VarA = u11Var.f9425a.a(new androidx.camera.view.b(ac1Var2, tb1Var3, null), new ck1(5, jp0Var), new j00(3, jSONObject2, gs0Var));
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    long jA = zzv.zzC().a();
                    u11Var.f9430f.f11577c.putLong("rendering-ad-component-creation-end", jA);
                    u11Var.f9430f.f11577c.putLong("rendering-configure-webview-start", jA);
                }
                pp0 pp0Var = (pp0) sd0VarA.f8902v.f5680a.s;
                ih1.j(pp0Var);
                w92 w92Var = sd0VarA.f8904x;
                j00 j00Var = sd0VarA.f8901u;
                jp0 jp0Var2 = (jp0) sd0VarA.f8900t.f3613t;
                ih1.j(jp0Var2);
                gs0 gs0Var2 = (gs0) j00Var.f5892u;
                ih1.j(gs0Var2);
                xr0 xr0Var = new xr0(pp0Var, jp0Var2, gs0Var2, w92.a(w92Var));
                if (xr0Var.s != null) {
                    xr0Var.f10665t.c("/nativeAdCustomClick", xr0Var);
                }
                ds0 ds0Var = (ds0) sd0VarA.f8905y.zzb();
                fl0 fl0Var = ds0Var.f3995b;
                yr0 yr0Var = gs0Var.f5140a;
                Objects.requireNonNull(fl0Var);
                cs0 cs0Var = new cs0(0, fl0Var);
                nk0 nk0Var = ds0Var.f3994a;
                ml0 ml0Var = ds0Var.f3996c;
                rl0 rl0Var = ds0Var.f3997d;
                gm0 gm0Var = ds0Var.f3998e;
                synchronized (yr0Var) {
                    yr0Var.s = nk0Var;
                    yr0Var.f11064t = ml0Var;
                    yr0Var.f11065u = rl0Var;
                    yr0Var.f11066v = gm0Var;
                    yr0Var.f11067w = cs0Var;
                }
                tb1 tb1Var4 = ds0Var.f3999f;
                vb1 vb1Var3 = ds0Var.f4000g;
                vf0 vf0Var = ds0Var.h;
                synchronized (gs0Var) {
                    hr1 hr1Var = gs0Var.f5151m;
                    if (hr1Var != null) {
                        mx mxVar = new mx(gs0Var, tb1Var4, vb1Var3, vf0Var, 1);
                        hr1Var.addListener(new as1(0, hr1Var, mxVar), gs0Var.f5144e);
                    }
                }
                pr0 pr0Var = (pr0) sd0VarA.f8906z.zzb();
                final xa0 xa0VarM = jp0Var.m();
                vf0 vf0Var2 = pr0Var.f8138d;
                sg0 sg0Var = pr0Var.f8136b;
                Executor executor3 = pr0Var.f8135a;
                ln0 ln0Var = pr0Var.f8137c;
                if (xa0VarM != null) {
                    ln0Var.p0(xa0VarM.zzF());
                    ln0Var.l0(new bi() { // from class: com.google.android.gms.internal.ads.nr0
                        @Override // com.google.android.gms.internal.ads.bi
                        public final void C(ai aiVar) {
                            eb0 eb0VarZzN = xa0VarM.zzN();
                            Rect rect = aiVar.f2767d;
                            eb0VarZzN.c0(rect.left, rect.top);
                        }
                    }, executor3);
                    ln0Var.l0(new or0(xa0VarM, 0), executor3);
                    ln0Var.l0(sg0Var, executor3);
                    sg0Var.s = xa0VarM;
                    eb0 eb0VarZzN = xa0VarM.zzN();
                    if (((Boolean) zzbe.zzc().a(zn.Y9)).booleanValue() && eb0VarZzN != null) {
                        eb0VarZzN.f("/click");
                        eb0VarZzN.a("/click", new nt(eb0VarZzN.C, vf0Var2));
                        eb0VarZzN.e(vf0Var2, null, null);
                    }
                    xa0VarM.Z("/trackActiveViewUnit", new au(3, pr0Var));
                    xa0VarM.Z("/untrackActiveViewUnit", new nu(2, pr0Var));
                }
                ls0 ls0Var = (ls0) sd0VarA.A.zzb();
                ms0 ms0Var = u11Var.f9429e;
                synchronized (jp0Var) {
                    xa0Var = jp0Var.f6131j;
                }
                ls0Var.getClass();
                js0 js0Var = ms0Var.f7218a;
                final fl0 fl0Var2 = ls0Var.f6840b;
                Objects.requireNonNull(fl0Var2);
                zzac zzacVar = new zzac() { // from class: com.google.android.gms.internal.ads.ks0
                    @Override // com.google.android.gms.ads.internal.overlay.zzac
                    public final void zzg() {
                        fl0Var2.zzb();
                    }
                };
                nk0 nk0Var2 = ls0Var.f6839a;
                ml0 ml0Var2 = ls0Var.f6841c;
                rl0 rl0Var2 = ls0Var.f6842d;
                gm0 gm0Var2 = ls0Var.f6843e;
                nn0 nn0Var = ls0Var.f6844f;
                synchronized (js0Var) {
                    synchronized (js0Var) {
                        js0Var.s = nk0Var2;
                        js0Var.f11064t = ml0Var2;
                        js0Var.f11065u = rl0Var2;
                        js0Var.f11066v = gm0Var2;
                        js0Var.f11067w = zzacVar;
                    }
                    if (((Boolean) zzbe.zzc().a(zn.Z9)).booleanValue() && xa0Var != null && xa0Var.zzN() != null) {
                        eb0 eb0VarZzN22 = xa0Var.zzN();
                        eb0VarZzN22.c(ls0Var.f6847j, ls0Var.f6846i, ls0Var.h);
                        eb0VarZzN22.e(ls0Var.f6847j, ls0Var.f6846i, ls0Var.f6845g);
                    }
                    if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                        androidx.camera.camera2.internal.compat.workaround.c.f("rendering-configure-webview-end", u11Var.f9430f.f11577c);
                    }
                    return (fp0) sd0VarA.f8903w.zzb();
                }
                js0Var.f6161x = nn0Var;
                if (((Boolean) zzbe.zzc().a(zn.Z9)).booleanValue()) {
                    eb0 eb0VarZzN222 = xa0Var.zzN();
                    eb0VarZzN222.c(ls0Var.f6847j, ls0Var.f6846i, ls0Var.h);
                    eb0VarZzN222.e(ls0Var.f6847j, ls0Var.f6846i, ls0Var.f6845g);
                }
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                }
                return (fp0) sd0VarA.f8903w.zzb();
            }
        };
        tr1 tr1Var22 = new tr1(cp1VarM2, true, z92);
        tr1Var22.H = new sr1(tr1Var22, callable32, this.f9426b);
        tr1Var22.u();
        return tr1Var22;
    }
}
