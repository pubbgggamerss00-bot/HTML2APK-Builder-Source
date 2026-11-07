package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20887a;

    public static final w1.d a() {
        w1.d dVar = f20887a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.EmojiFoodBeverage", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 3.0f);
        eVar.d(9.0f);
        eVar.l(2.4f);
        eVar.g(1.81f, 1.45f);
        eVar.b(10.93f, 6.94f, 11.0f, 7.09f, 11.0f, 7.24f);
        eVar.l(4.26f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        eVar.e(-4.0f);
        eVar.b(6.22f, 12.0f, 6.0f, 11.78f, 6.0f, 11.5f);
        eVar.k(7.24f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.15f, 0.07f, -0.3f, 0.19f, -0.39f);
        eVar.f(8.0f, 5.4f);
        eVar.k(3.0f);
        eVar.d(4.0f);
        eVar.l(10.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        eVar.e(6.0f);
        eVar.c(2.21f, CropImageView.DEFAULT_ASPECT_RATIO, 4.0f, -1.79f, 4.0f, -4.0f);
        eVar.l(-3.0f);
        eVar.e(2.0f);
        eVar.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.k(5.0f);
        eVar.b(22.0f, 3.89f, 21.11f, 3.0f, 20.0f, 3.0f);
        eVar.a();
        eVar.h(20.0f, 8.0f);
        eVar.e(-2.0f);
        eVar.k(5.0f);
        eVar.e(2.0f);
        eVar.k(8.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(4.0f, 19.0f));
        arrayList.add(new g.l(16.0f));
        arrayList.add(new g.r(2.0f));
        arrayList.add(new g.l(-16.0f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20887a = dVarB;
        return dVarB;
    }
}
