package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jd0 {

    /* renamed from: a, reason: collision with root package name */
    public final q91 f6029a;

    /* renamed from: b, reason: collision with root package name */
    public final kd0 f6030b;

    /* renamed from: c, reason: collision with root package name */
    public final w92 f6031c;

    /* renamed from: d, reason: collision with root package name */
    public final ji0 f6032d;

    /* renamed from: e, reason: collision with root package name */
    public final ke0 f6033e;

    /* renamed from: f, reason: collision with root package name */
    public final rc0 f6034f;

    /* renamed from: g, reason: collision with root package name */
    public final c51 f6035g;
    public final ee0 h;

    /* renamed from: i, reason: collision with root package name */
    public final t91 f6036i;

    /* renamed from: j, reason: collision with root package name */
    public final v50 f6037j;

    /* renamed from: k, reason: collision with root package name */
    public final w92 f6038k;

    public jd0(kd0 kd0Var, q91 q91Var) {
        this.f6030b = kd0Var;
        this.f6029a = q91Var;
        int i6 = 6;
        this.f6031c = w92.b(new bi0(kd0Var.f6361r, i6));
        ad0 ad0Var = new ad0(8, q91Var);
        cd0 cd0Var = new cd0(12, q91Var);
        qi0 qi0Var = new qi0(6, q91Var);
        oc0 oc0Var = kd0Var.h;
        w92 w92Var = kd0Var.f6337e;
        this.f6032d = new ji0(oc0Var, w92Var, ad0Var, cd0Var, qi0Var);
        this.f6033e = new ke0(oc0Var, 11);
        rc0 rc0Var = new rc0(10, q91Var);
        this.f6034f = new rc0(9, rc0Var);
        this.f6035g = new c51(w92Var, oc0Var, 3);
        this.h = new ee0(i6);
        af0 af0Var = new af0(11, q91Var);
        w92 w92Var2 = kd0Var.Q;
        this.f6036i = new t91(w92Var2, af0Var, qi0Var, rc0Var, w92Var);
        this.f6037j = new v50(rc0Var, w92Var2, w92Var, i6);
        pc0 pc0Var = new pc0(5, q91Var);
        w92 w92VarB = w92.b(fo.E);
        w92 w92VarB2 = w92.b(bq.f3249y);
        w92 w92VarB3 = w92.b(me0.f7101w);
        w92 w92VarB4 = w92.b(y5.T);
        int i7 = z92.f11232b;
        LinkedHashMap linkedHashMapC = ov1.c(4);
        linkedHashMapC.put(yd1.f10930x, w92VarB);
        linkedHashMapC.put(yd1.f10931y, w92VarB2);
        linkedHashMapC.put(yd1.f10932z, w92VarB3);
        linkedHashMapC.put(yd1.A, w92VarB4);
        w92 w92VarB5 = w92.b(new pj0(pc0Var, kd0Var.h, new z92(linkedHashMapC), 1));
        int i8 = ea2.f4188c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(w92VarB5);
        wk0 wk0Var = new wk0(new ea2(list, arrayList), 8);
        this.f6038k = w92.b(new mh0(kd0Var.f6337e, wk0Var, 9));
    }

    public final h91 a() {
        new t60();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        r30 r30Var = this.f6029a.f8279a;
        String string = r30Var.s.getString("ms");
        if (string == null) {
            string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        PackageInfo packageInfo = r30Var.f8528x;
        return new h91(h70Var, string);
    }
}
