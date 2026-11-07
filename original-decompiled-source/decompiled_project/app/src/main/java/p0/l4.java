package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20930a;

    public static final w1.d a() {
        w1.d dVar = f20930a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.FolderOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 6.0f);
        eVar.e(-8.0f);
        eVar.g(-2.0f, -2.0f);
        eVar.d(6.83f);
        eVar.g(14.93f, 14.93f);
        eVar.b(21.91f, 18.65f, 22.0f, 18.34f, 22.0f, 18.0f);
        eVar.k(8.0f);
        eVar.b(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA = m.a(2.1f, 2.1f, 0.69f, 3.51f);
        eVarA.g(1.56f, 1.56f);
        eVarA.b(2.1f, 5.35f, 2.01f, 5.66f, 2.01f, 6.0f);
        eVarA.f(2.0f, 18.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.e(13.17f);
        eVarA.g(3.31f, 3.31f);
        id.i.b(eVarA, 1.41f, -1.41f, 2.1f, 2.1f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20930a = dVarB;
        return dVarB;
    }
}
