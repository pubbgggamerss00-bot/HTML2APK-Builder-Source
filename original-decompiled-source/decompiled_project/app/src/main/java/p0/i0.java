package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20884a;

    public static final w1.d a() {
        w1.d dVar = f20884a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.BatteryFull", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(15.67f, 4.0f);
        eVar.d(14.0f);
        eVar.k(2.0f);
        eVar.e(-4.0f);
        eVar.l(2.0f);
        eVar.d(8.33f);
        eVar.b(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        eVar.l(15.33f);
        eVar.b(7.0f, 21.4f, 7.6f, 22.0f, 8.33f, 22.0f);
        eVar.e(7.33f);
        eVar.c(0.74f, CropImageView.DEFAULT_ASPECT_RATIO, 1.34f, -0.6f, 1.34f, -1.33f);
        eVar.k(5.33f);
        eVar.b(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20884a = dVarB;
        return dVarB;
    }
}
