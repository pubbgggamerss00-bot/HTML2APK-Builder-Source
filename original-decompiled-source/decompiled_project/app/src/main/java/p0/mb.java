package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class mb {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20950a;

    public static final w1.d a() {
        w1.d dVar = f20950a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Toll", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = o0.d.a(15.0f, 4.0f);
        eVarA.c(-4.42f, CropImageView.DEFAULT_ASPECT_RATIO, -8.0f, 3.58f, -8.0f, 8.0f);
        eVarA.j(3.58f, 8.0f, 8.0f, 8.0f);
        eVarA.j(8.0f, -3.58f, 8.0f, -8.0f);
        eVarA.j(-3.58f, -8.0f, -8.0f, -8.0f);
        eVarA.a();
        eVarA.h(15.0f, 18.0f);
        eVarA.c(-3.31f, CropImageView.DEFAULT_ASPECT_RATIO, -6.0f, -2.69f, -6.0f, -6.0f);
        eVarA.j(2.69f, -6.0f, 6.0f, -6.0f);
        eVarA.j(6.0f, 2.69f, 6.0f, 6.0f);
        eVarA.j(-2.69f, 6.0f, -6.0f, 6.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(3.0f, 12.0f));
        arrayList.add(new g.k(CropImageView.DEFAULT_ASPECT_RATIO, -2.61f, 1.67f, -4.83f, 4.0f, -5.65f));
        arrayList.add(new g.s(4.26f));
        arrayList.add(new g.c(3.55f, 5.15f, 1.0f, 8.27f, 1.0f, 12.0f));
        arrayList.add(new g.p(2.55f, 6.85f, 6.0f, 7.74f));
        arrayList.add(new g.r(-2.09f));
        arrayList.add(new g.k(-2.33f, -0.82f, -4.0f, -3.04f, -4.0f, -5.65f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20950a = dVarB;
        return dVarB;
    }
}
