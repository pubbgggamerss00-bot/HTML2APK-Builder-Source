package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gr0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5124a;

    /* renamed from: b, reason: collision with root package name */
    public final pq0 f5125b;

    /* renamed from: c, reason: collision with root package name */
    public final mf f5126c;

    /* renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f5127d;

    /* renamed from: e, reason: collision with root package name */
    public final zza f5128e;

    /* renamed from: f, reason: collision with root package name */
    public final kk f5129f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f5130g;
    public final oq h;

    /* renamed from: i, reason: collision with root package name */
    public final qr0 f5131i;

    /* renamed from: j, reason: collision with root package name */
    public final ct0 f5132j;

    /* renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f5133k;

    /* renamed from: l, reason: collision with root package name */
    public final ms0 f5134l;

    /* renamed from: m, reason: collision with root package name */
    public final cu0 f5135m;

    /* renamed from: n, reason: collision with root package name */
    public final cf1 f5136n;

    /* renamed from: o, reason: collision with root package name */
    public final dz0 f5137o;

    /* renamed from: p, reason: collision with root package name */
    public final oz0 f5138p;

    /* renamed from: q, reason: collision with root package name */
    public final fc1 f5139q;

    public gr0(Context context, pq0 pq0Var, mf mfVar, VersionInfoParcel versionInfoParcel, zza zzaVar, kk kkVar, h70 h70Var, ec1 ec1Var, qr0 qr0Var, ct0 ct0Var, ScheduledExecutorService scheduledExecutorService, cu0 cu0Var, cf1 cf1Var, dz0 dz0Var, ms0 ms0Var, oz0 oz0Var, fc1 fc1Var) {
        this.f5124a = context;
        this.f5125b = pq0Var;
        this.f5126c = mfVar;
        this.f5127d = versionInfoParcel;
        this.f5128e = zzaVar;
        this.f5129f = kkVar;
        this.f5130g = h70Var;
        this.h = ec1Var.f4213i;
        this.f5131i = qr0Var;
        this.f5132j = ct0Var;
        this.f5133k = scheduledExecutorService;
        this.f5135m = cu0Var;
        this.f5136n = cf1Var;
        this.f5137o = dz0Var;
        this.f5134l = ms0Var;
        this.f5138p = oz0Var;
        this.f5139q = fc1Var;
    }

    public static Integer d(String str, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final zzez e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new zzez(strOptString, strOptString2);
    }

    public final c5.a a(JSONObject jSONObject, boolean z6) {
        if (jSONObject == null) {
            return ds1.f4001t;
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return ds1.f4001t;
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z6) {
            return bs1.m(new mq(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        final pq0 pq0Var = this.f5125b;
        hr1 hr1VarO = bs1.o(bs1.o(pq0Var.f8132a.zza(strOptString), new pl1() { // from class: com.google.android.gms.internal.ads.oq0
            @Override // com.google.android.gms.internal.ads.pl1
            public final Object apply(Object obj) {
                pq0 pq0Var2 = pq0Var;
                pq0Var2.getClass();
                byte[] bArr = ((lb) obj).f6646b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (dOptDouble * 160.0d);
                if (!zOptBoolean) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                if (((Boolean) zzbe.zzc().a(zn.Y5)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    pq0Var2.a(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i6 = options.outWidth * options.outHeight;
                    if (i6 > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i6 - 1) / ((Integer) zzbe.zzc().a(zn.Z5)).intValue())) / 2);
                    }
                }
                return pq0Var2.a(bArr, options);
            }
        }, pq0Var.f8134c), new pl1() { // from class: com.google.android.gms.internal.ads.xq0
            @Override // com.google.android.gms.internal.ads.pl1
            public final Object apply(Object obj) {
                return new mq(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.f5130g);
        return jSONObject.optBoolean("require") ? bs1.p(hr1VarO, new dr0(0, hr1VarO), i70.f5592g) : bs1.k(hr1VarO, Exception.class, new cr0(0), i70.f5592g);
    }

    public final c5.a b(JSONArray jSONArray, boolean z6, boolean z7) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return bs1.m(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z7 ? jSONArray.length() : 1;
        for (int i6 = 0; i6 < length; i6++) {
            arrayList.add(a(jSONArray.optJSONObject(i6), z6));
        }
        return bs1.o(new qr1(bo1.l(arrayList), true), new ar0(0), this.f5130g);
    }

    public final gr1 c(JSONObject jSONObject, final tb1 tb1Var, final vb1 vb1Var) {
        final zzs zzsVar;
        final String strOptString = jSONObject.optString("base_url");
        final String strOptString2 = jSONObject.optString("html");
        int i6 = 0;
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        if (iOptInt == 0) {
            if (iOptInt2 == 0) {
                zzsVar = zzs.zzc();
            }
            final qr0 qr0Var = this.f5131i;
            qr0Var.getClass();
            gr1 gr1VarP = bs1.p(ds1.f4001t, new pr1() { // from class: com.google.android.gms.internal.ads.lr0
                @Override // com.google.android.gms.internal.ads.pr1
                public final c5.a zza(Object obj) {
                    qr0 qr0Var2 = qr0Var;
                    xa0 xa0VarA = qr0Var2.f8447c.a(zzsVar, tb1Var, vb1Var);
                    n70 n70Var = new n70(xa0VarA);
                    if (qr0Var2.f8445a.f4207b != null) {
                        qr0Var2.a(xa0VarA);
                        xa0VarA.h0(new cc0(5, 0, 0));
                    } else {
                        js0 js0Var = qr0Var2.f8448d.f7218a;
                        xa0VarA.zzN().j(js0Var, js0Var, js0Var, js0Var, js0Var, false, null, new zzb(qr0Var2.f8449e, null, null), null, null, qr0Var2.h, qr0Var2.f8451g, qr0Var2.f8450f, null, js0Var, null, null, null, null);
                        qr0.b(xa0VarA);
                    }
                    xa0VarA.zzN().f4196y = new com.google.android.gms.ads.mediation.customevent.b(qr0Var2, xa0VarA, n70Var);
                    xa0VarA.K(strOptString, strOptString2);
                    return n70Var;
                }
            }, qr0Var.f8446b);
            return bs1.p(gr1VarP, new yq0(0, gr1VarP), i70.f5592g);
        }
        i6 = iOptInt;
        zzsVar = new zzs(this.f5124a, new AdSize(i6, iOptInt2));
        final qr0 qr0Var2 = this.f5131i;
        qr0Var2.getClass();
        gr1 gr1VarP2 = bs1.p(ds1.f4001t, new pr1() { // from class: com.google.android.gms.internal.ads.lr0
            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj) {
                qr0 qr0Var22 = qr0Var2;
                xa0 xa0VarA = qr0Var22.f8447c.a(zzsVar, tb1Var, vb1Var);
                n70 n70Var = new n70(xa0VarA);
                if (qr0Var22.f8445a.f4207b != null) {
                    qr0Var22.a(xa0VarA);
                    xa0VarA.h0(new cc0(5, 0, 0));
                } else {
                    js0 js0Var = qr0Var22.f8448d.f7218a;
                    xa0VarA.zzN().j(js0Var, js0Var, js0Var, js0Var, js0Var, false, null, new zzb(qr0Var22.f8449e, null, null), null, null, qr0Var22.h, qr0Var22.f8451g, qr0Var22.f8450f, null, js0Var, null, null, null, null);
                    qr0.b(xa0VarA);
                }
                xa0VarA.zzN().f4196y = new com.google.android.gms.ads.mediation.customevent.b(qr0Var22, xa0VarA, n70Var);
                xa0VarA.K(strOptString, strOptString2);
                return n70Var;
            }
        }, qr0Var2.f8446b);
        return bs1.p(gr1VarP2, new yq0(0, gr1VarP2), i70.f5592g);
    }
}
