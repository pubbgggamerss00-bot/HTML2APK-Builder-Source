package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class un {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9587a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9588b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9589c = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f9588b;
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            String str = (String) zzbe.zzc().a((tn) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        me0.n(arrayList3, new ep(4, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "gad:dynamite_module:experiment_id"));
        me0.n(arrayList3, y5.f10854v);
        me0.n(arrayList3, y5.f10855w);
        me0.n(arrayList3, y5.f10856x);
        me0.n(arrayList3, y5.f10857y);
        me0.n(arrayList3, y5.f10858z);
        me0.n(arrayList3, y5.P);
        me0.n(arrayList3, y5.A);
        me0.n(arrayList3, y5.H);
        me0.n(arrayList3, y5.I);
        me0.n(arrayList3, y5.J);
        me0.n(arrayList3, y5.K);
        me0.n(arrayList3, y5.L);
        me0.n(arrayList3, y5.M);
        me0.n(arrayList3, y5.N);
        me0.n(arrayList3, y5.O);
        me0.n(arrayList3, y5.B);
        me0.n(arrayList3, y5.C);
        me0.n(arrayList3, y5.D);
        me0.n(arrayList3, y5.E);
        me0.n(arrayList3, y5.F);
        me0.n(arrayList3, y5.G);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList arrayListA = a();
        ArrayList arrayList = this.f9589c;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            String str = (String) zzbe.zzc().a((tn) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayListA.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        me0.n(arrayList2, bq.f3244t);
        arrayListA.addAll(arrayList2);
        return arrayListA;
    }
}
