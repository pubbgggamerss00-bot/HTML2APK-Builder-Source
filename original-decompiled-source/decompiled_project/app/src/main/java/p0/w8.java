package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class w8 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21082a;

    public static final w1.d a() {
        w1.d dVar = f21082a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.QueueMusic", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(15.0f, 6.0f);
        eVar.d(3.0f);
        eVar.l(2.0f);
        eVar.e(12.0f);
        eVar.k(6.0f);
        eVar.a();
        eVar.h(15.0f, 10.0f);
        eVar.d(3.0f);
        eVar.l(2.0f);
        eVar.e(12.0f);
        eVar.k(10.0f);
        eVar.a();
        n.a(eVar, 3.0f, 16.0f, 8.0f, -2.0f);
        eVar.d(3.0f);
        eVar.k(16.0f);
        eVar.a();
        eVar.h(17.0f, 6.0f);
        eVar.l(8.18f);
        eVar.b(16.69f, 14.07f, 16.35f, 14.0f, 16.0f, 14.0f);
        eVar.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, 1.34f, -3.0f, 3.0f);
        eVar.j(1.34f, 3.0f, 3.0f, 3.0f);
        eVar.j(3.0f, -1.34f, 3.0f, -3.0f);
        eVar.k(8.0f);
        eVar.e(3.0f);
        eVar.k(6.0f);
        eVar.d(17.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21082a = dVarB;
        return dVarB;
    }
}
