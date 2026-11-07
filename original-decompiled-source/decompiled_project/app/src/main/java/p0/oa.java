package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class oa {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20976a;

    public static final w1.d a() {
        w1.d dVar = f20976a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.SportsGolf", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = o0.d.a(12.0f, 16.0f);
        eVarA.c(3.87f, CropImageView.DEFAULT_ASPECT_RATIO, 7.0f, -3.13f, 7.0f, -7.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        eVarA.i(5.0f, 5.13f, 5.0f, 9.0f);
        eVarA.b(5.0f, 12.87f, 8.13f, 16.0f, 12.0f, 16.0f);
        eVarA.a();
        eVarA.h(12.0f, 4.0f);
        eVarA.c(2.76f, CropImageView.DEFAULT_ASPECT_RATIO, 5.0f, 2.24f, 5.0f, 5.0f);
        eVarA.j(-2.24f, 5.0f, -5.0f, 5.0f);
        eVarA.j(-5.0f, -2.24f, -5.0f, -5.0f);
        eVarA.i(9.24f, 4.0f, 12.0f, 4.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(10.0f, 8.0f));
        arrayList.add(new g.n(-1.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(14.0f, 8.0f));
        arrayList2.add(new g.n(-1.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList2, 0, i2Var3);
        q1.i2 i2Var4 = new q1.i2(j10);
        ArrayList arrayList3 = new ArrayList(32);
        arrayList3.add(new g.f(12.0f, 6.0f));
        arrayList3.add(new g.n(-1.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList3.add(new g.j(1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList3.add(new g.j(1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList3, 0, i2Var4);
        q1.i2 i2Var5 = new q1.i2(j10);
        w1.e eVar = new w1.e();
        eVar.h(7.0f, 19.0f);
        eVar.e(2.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, 0.9f, 2.0f, 2.0f);
        eVar.l(1.0f);
        eVar.e(2.0f);
        eVar.l(-1.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        eVar.e(2.0f);
        eVar.l(-2.0f);
        eVar.d(7.0f);
        eVar.k(19.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var5);
        w1.d dVarB = aVar.b();
        f20976a = dVarB;
        return dVarB;
    }
}
