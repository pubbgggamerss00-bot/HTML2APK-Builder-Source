package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class rd0 {

    /* renamed from: a, reason: collision with root package name */
    public final w92 f8611a;

    public /* synthetic */ rd0(kd0 kd0Var, Context context, String str, zzs zzsVar) {
        y92 y92VarA = y92.a(context);
        y92 y92VarA2 = y92.a(zzsVar);
        y92 y92VarA3 = y92.a(str);
        int i6 = 8;
        w92 w92VarB = w92.b(new ke0(kd0Var.f6376z, i6));
        w92 w92VarB2 = w92.b(new cf0(i6, kd0Var.H0));
        this.f8611a = w92.b(new et0(y92VarA, y92VarA2, y92VarA3, w92.b(new qo0(y92VarA, kd0Var.f6335d, kd0Var.C, w92VarB, w92VarB2, 3)), w92VarB, w92VarB2, kd0Var.f6348k, kd0Var.E, kd0Var.f6376z));
    }

    public rd0(kd0 kd0Var, qd0 qd0Var, androidx.camera.view.b bVar, ni0 ni0Var) {
        int i6 = 3;
        rc0 rc0Var = new rc0(i6, bVar);
        int i7 = 1;
        qi0 qi0Var = new qi0(i7, bVar);
        int i8 = ea2.f4188c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(qd0Var.O);
        arrayList.add(qd0Var.P);
        w92 w92VarB = w92.b(new wk0(new ea2(list, arrayList), i7));
        ArrayList arrayList2 = new ArrayList(4);
        ArrayList arrayList3 = new ArrayList(4);
        arrayList2.add(qd0Var.f8319g0);
        arrayList3.add(qd0Var.f8320h0);
        arrayList2.add(qd0Var.f8322i0);
        arrayList2.add(qd0Var.f8324j0);
        arrayList3.add(qd0Var.f8342t0);
        arrayList3.add(qd0Var.f8344u0);
        arrayList3.add(qd0Var.f8346v0);
        arrayList2.add(qd0Var.f8326k0);
        w92 w92VarB2 = w92.b(new il0(new ea2(arrayList2, arrayList3), 0));
        ji0 ji0Var = new ji0(qi0Var, new pc0(i6, bVar), qd0Var.I, new qc0(2, bVar), qd0Var.f8333o);
        w92 w92VarB3 = w92.b(me0.f7099u);
        ArrayList arrayList4 = new ArrayList(1);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add(qd0Var.f8350x0);
        arrayList4.add(qd0Var.f8352y0);
        ok0 ok0Var = new ok0(new ea2(arrayList4, arrayList5), 1);
        List list2 = Collections.EMPTY_LIST;
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add(qd0Var.f8313d0);
        this.f8611a = w92.b(new gi0(new nj0(rc0Var, qi0Var, w92VarB, w92VarB2, qd0Var.f8348w0, ji0Var, w92VarB3, ok0Var, w92.b(new il0(new ea2(list2, arrayList6), i6))), new af0(i7, ni0Var), new cd0(i6, ni0Var), kd0Var.f6335d, 0));
    }
}
