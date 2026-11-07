package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class a9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20785a;

    public static final w1.d a() {
        w1.d dVar = f20785a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.ReceiptLong", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = m.a(19.5f, 3.5f, 18.0f, 2.0f);
        eVarA.g(-1.5f, 1.5f);
        eVarA.f(15.0f, 2.0f);
        eVarA.g(-1.5f, 1.5f);
        eVarA.f(12.0f, 2.0f);
        eVarA.g(-1.5f, 1.5f);
        eVarA.f(9.0f, 2.0f);
        eVarA.f(7.5f, 3.5f);
        eVarA.f(6.0f, 2.0f);
        eVarA.l(14.0f);
        eVarA.d(3.0f);
        eVarA.l(3.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        eVarA.e(12.0f);
        eVarA.c(1.66f, CropImageView.DEFAULT_ASPECT_RATIO, 3.0f, -1.34f, 3.0f, -3.0f);
        eVarA.k(2.0f);
        eVarA.f(19.5f, 3.5f);
        eVarA.a();
        eVarA.h(19.0f, 19.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        eVarA.j(-1.0f, -0.45f, -1.0f, -1.0f);
        eVarA.l(-3.0f);
        eVarA.d(8.0f);
        eVarA.k(5.0f);
        eVarA.e(11.0f);
        eVarA.k(19.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(9.0f, 7.0f));
        arrayList.add(new g.l(6.0f));
        arrayList.add(new g.r(2.0f));
        arrayList.add(new g.l(-6.0f));
        g.b bVar = g.b.f31130c;
        arrayList.add(bVar);
        d.a.a(aVar, arrayList, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(16.0f, 7.0f));
        arrayList2.add(new g.l(2.0f));
        arrayList2.add(new g.r(2.0f));
        arrayList2.add(new g.l(-2.0f));
        arrayList2.add(bVar);
        d.a.a(aVar, arrayList2, 0, i2Var3);
        q1.i2 i2Var4 = new q1.i2(j10);
        ArrayList arrayList3 = new ArrayList(32);
        arrayList3.add(new g.f(9.0f, 10.0f));
        arrayList3.add(new g.l(6.0f));
        arrayList3.add(new g.r(2.0f));
        arrayList3.add(new g.l(-6.0f));
        arrayList3.add(bVar);
        d.a.a(aVar, arrayList3, 0, i2Var4);
        q1.i2 i2Var5 = new q1.i2(j10);
        ArrayList arrayList4 = new ArrayList(32);
        arrayList4.add(new g.f(16.0f, 10.0f));
        arrayList4.add(new g.l(2.0f));
        arrayList4.add(new g.r(2.0f));
        arrayList4.add(new g.l(-2.0f));
        arrayList4.add(bVar);
        d.a.a(aVar, arrayList4, 0, i2Var5);
        w1.d dVarB = aVar.b();
        f20785a = dVarB;
        return dVarB;
    }
}
