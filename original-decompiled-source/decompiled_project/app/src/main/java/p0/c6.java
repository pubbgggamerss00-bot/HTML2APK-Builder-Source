package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20809a;

    public static final w1.d a() {
        w1.d dVar = f20809a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.LibraryBooks", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(4.0f, 6.0f);
        eVar.f(2.0f, 6.0f);
        eVar.l(14.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.e(14.0f);
        eVar.l(-2.0f);
        eVar.f(4.0f, 20.0f);
        ji.a.b(eVar, 4.0f, 6.0f, 20.0f, 2.0f);
        eVar.f(8.0f, 2.0f);
        eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVar.l(12.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.e(12.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.f(22.0f, 4.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        l9.i.b(eVar, 19.0f, 11.0f, 9.0f, 11.0f);
        b6.a.c(eVar, 9.0f, 9.0f, 10.0f, 2.0f);
        eVar.h(15.0f, 15.0f);
        id.h.c(eVar, 9.0f, 15.0f, -2.0f, 6.0f);
        eVar.l(2.0f);
        eVar.a();
        eVar.h(19.0f, 7.0f);
        eVar.f(9.0f, 7.0f);
        b6.a.c(eVar, 9.0f, 5.0f, 10.0f, 2.0f);
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20809a = dVarB;
        return dVarB;
    }
}
