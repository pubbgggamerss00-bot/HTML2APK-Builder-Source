package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20789a;

    public static final w1.d a() {
        w1.d dVar = f20789a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.AccountBalance", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(4.0f, 10.0f));
        arrayList.add(new g.l(3.0f));
        arrayList.add(new g.r(7.0f));
        arrayList.add(new g.l(-3.0f));
        g.b bVar = g.b.f31130c;
        arrayList.add(bVar);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(10.5f, 10.0f));
        arrayList2.add(new g.l(3.0f));
        arrayList2.add(new g.r(7.0f));
        arrayList2.add(new g.l(-3.0f));
        arrayList2.add(bVar);
        d.a.a(aVar, arrayList2, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList3 = new ArrayList(32);
        arrayList3.add(new g.f(2.0f, 19.0f));
        arrayList3.add(new g.l(20.0f));
        arrayList3.add(new g.r(3.0f));
        arrayList3.add(new g.l(-20.0f));
        arrayList3.add(bVar);
        d.a.a(aVar, arrayList3, 0, i2Var3);
        q1.i2 i2Var4 = new q1.i2(j10);
        ArrayList arrayList4 = new ArrayList(32);
        arrayList4.add(new g.f(17.0f, 10.0f));
        arrayList4.add(new g.l(3.0f));
        arrayList4.add(new g.r(7.0f));
        arrayList4.add(new g.l(-3.0f));
        arrayList4.add(bVar);
        d.a.a(aVar, arrayList4, 0, i2Var4);
        q1.i2 i2Var5 = new q1.i2(j10);
        ArrayList arrayList5 = new ArrayList(32);
        arrayList5.add(new g.f(12.0f, 1.0f));
        arrayList5.add(new g.m(-10.0f, 5.0f));
        arrayList5.add(new g.m(CropImageView.DEFAULT_ASPECT_RATIO, 2.0f));
        arrayList5.add(new g.m(20.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList5.add(new g.m(CropImageView.DEFAULT_ASPECT_RATIO, -2.0f));
        arrayList5.add(bVar);
        d.a.a(aVar, arrayList5, 0, i2Var5);
        w1.d dVarB = aVar.b();
        f20789a = dVarB;
        return dVarB;
    }
}
