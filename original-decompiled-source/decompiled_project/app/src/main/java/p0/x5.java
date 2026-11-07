package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class x5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21092a;

    public static final w1.d a() {
        w1.d dVar = f21092a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Kitchen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 9.0f);
        eVar.k(4.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        eVar.d(6.0f);
        eVar.b(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        eVar.l(5.0f);
        eVar.d(20.0f);
        eVar.a();
        eVar.h(8.0f, 5.0f);
        eVar.e(2.0f);
        eVar.l(3.0f);
        eVar.d(8.0f);
        eVar.k(5.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVar2 = new w1.e();
        eVar2.h(4.0f, 11.0f);
        eVar2.l(9.0f);
        eVar2.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar2.e(12.0f);
        eVar2.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar2.l(-9.0f);
        eVar2.d(4.0f);
        eVar2.a();
        eVar2.h(10.0f, 17.0f);
        eVar2.d(8.0f);
        eVar2.l(-5.0f);
        eVar2.e(2.0f);
        eVar2.k(17.0f);
        eVar2.a();
        d.a.a(aVar, eVar2.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f21092a = dVarB;
        return dVarB;
    }
}
