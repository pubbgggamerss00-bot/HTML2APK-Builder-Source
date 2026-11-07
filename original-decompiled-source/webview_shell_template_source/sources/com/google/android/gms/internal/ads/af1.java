package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class af1 {

    /* renamed from: a, reason: collision with root package name */
    public final n21 f2739a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2740b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2741c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2742d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2743e;

    /* renamed from: f, reason: collision with root package name */
    public final bc1 f2744f;

    /* renamed from: g, reason: collision with root package name */
    public final cc1 f2745g;
    public final i3.a h;

    /* renamed from: i, reason: collision with root package name */
    public final mf f2746i;

    public af1(n21 n21Var, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, bc1 bc1Var, cc1 cc1Var, i3.a aVar, mf mfVar) {
        this.f2739a = n21Var;
        this.f2740b = versionInfoParcel.afmaVersion;
        this.f2741c = str;
        this.f2742d = str2;
        this.f2743e = context;
        this.f2744f = bc1Var;
        this.f2745g = cc1Var;
        this.h = aVar;
        this.f2746i = mfVar;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList a(ac1 ac1Var, tb1 tb1Var, List list) {
        return b(ac1Var, tb1Var, false, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, list);
    }

    public final ArrayList b(ac1 ac1Var, tb1 tb1Var, boolean z6, String str, String str2, List list) {
        long j6;
        n21 n21Var = this.f2739a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z7 = true;
            String strC = c(c(c((String) it.next(), "@gw_adlocid@", ((ec1) ac1Var.f2647a.f9702t).f4211f), "@gw_adnetrefresh@", true != z6 ? "0" : "1"), "@gw_sdkver@", this.f2740b);
            if (tb1Var != null) {
                strC = c60.b(c(c(c(strC, "@gw_qdata@", tb1Var.f9216y), "@gw_adnetid@", tb1Var.f9214x), "@gw_allocid@", tb1Var.f9212w), this.f2743e, tb1Var.W, tb1Var.f9213w0);
            }
            String strC2 = c(strC, "@gw_adnetstatus@", n21Var.b());
            synchronized (n21Var) {
                j6 = n21Var.h;
            }
            String strC3 = c(c(c(strC2, "@gw_ttr@", Long.toString(j6, 10)), "@gw_seqnum@", this.f2741c), "@gw_sessid@", this.f2742d);
            boolean z8 = false;
            if (((Boolean) zzbe.zzc().a(zn.E3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z8 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z9 = !zIsEmpty;
            if (z8) {
                z7 = z9;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strC3);
            }
            if (this.f2746i.c(Uri.parse(strC3))) {
                Uri.Builder builderBuildUpon = Uri.parse(strC3).buildUpon();
                if (z8) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z7) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strC3 = builderBuildUpon.build().toString();
            }
            arrayList.add(strC3);
        }
        return arrayList;
    }
}
