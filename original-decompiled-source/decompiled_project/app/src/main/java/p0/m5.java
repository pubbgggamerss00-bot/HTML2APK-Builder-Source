package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class m5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20944a;

    public static final w1.d a() {
        w1.d dVar = f20944a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Icecream", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(8.79f, 12.4f, 3.26f, 6.22f);
        eVarA.g(3.17f, -6.21f);
        eVarA.c(-0.11f, -0.08f, -0.21f, -0.16f, -0.3f, -0.25f);
        eVarA.b(14.08f, 12.69f, 13.07f, 13.0f, 12.0f, 13.0f);
        eVarA.j(-2.08f, -0.31f, -2.92f, -0.84f);
        eVarA.b(8.99f, 12.25f, 8.89f, 12.33f, 8.79f, 12.4f);
        eVarA.a();
        eVarA.h(6.83f, 12.99f);
        eVarA.b(5.25f, 12.9f, 4.0f, 11.6f, 4.0f, 10.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.49f, 1.09f, -2.73f, 2.52f, -2.96f);
        eVarA.b(6.75f, 4.22f, 9.12f, 2.0f, 12.0f, 2.0f);
        eVarA.j(5.25f, 2.22f, 5.48f, 5.04f);
        eVarA.b(18.91f, 7.27f, 20.0f, 8.51f, 20.0f, 10.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.59f, -1.24f, 2.9f, -2.81f, 2.99f);
        f0.a(eVarA, 12.07f, 23.0f, 6.83f, 12.99f);
        d.a.a(aVar, eVarA.f31100a, 1, i2Var);
        w1.d dVarB = aVar.b();
        f20944a = dVarB;
        return dVarB;
    }
}
