package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class s9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21031a;

    public static final w1.d a() {
        w1.d dVar = f21031a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.SelfImprovement", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(12.0f, 6.0f));
        arrayList.add(new g.n(-2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(2.0f, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 4.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(2.0f, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -4.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVar = new w1.e();
        eVar.h(21.0f, 16.0f);
        eVar.l(-2.0f);
        eVar.c(-2.24f, CropImageView.DEFAULT_ASPECT_RATIO, -4.16f, -0.96f, -5.6f, -2.68f);
        eVar.g(-1.34f, -1.6f);
        eVar.b(13.68f, 9.26f, 13.12f, 9.0f, 12.53f, 9.0f);
        eVar.e(-1.05f);
        eVar.c(-0.59f, CropImageView.DEFAULT_ASPECT_RATIO, -1.15f, 0.26f, -1.53f, 0.72f);
        eVar.g(-1.34f, 1.6f);
        eVar.b(7.16f, 13.04f, 5.24f, 14.0f, 3.0f, 14.0f);
        eVar.l(2.0f);
        eVar.c(2.77f, CropImageView.DEFAULT_ASPECT_RATIO, 5.19f, -1.17f, 7.0f, -3.25f);
        eVar.k(15.0f);
        eVar.g(-3.88f, 1.55f);
        eVar.b(5.45f, 16.82f, 5.0f, 17.48f, 5.0f, 18.21f);
        eVar.b(5.0f, 19.2f, 5.8f, 20.0f, 6.79f, 20.0f);
        eVar.d(9.0f);
        eVar.l(-0.5f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        eVar.e(3.0f);
        eVar.c(0.28f, CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 0.22f, 0.5f, 0.5f);
        eVar.i(14.78f, 18.0f, 14.5f, 18.0f);
        eVar.e(-3.0f);
        eVar.c(-0.83f, CropImageView.DEFAULT_ASPECT_RATIO, -1.5f, 0.67f, -1.5f, 1.5f);
        eVar.k(20.0f);
        eVar.e(7.21f);
        eVar.b(18.2f, 20.0f, 19.0f, 19.2f, 19.0f, 18.21f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.73f, -0.45f, -1.39f, -1.12f, -1.66f);
        eVar.f(14.0f, 15.0f);
        eVar.l(-2.25f);
        eVar.b(15.81f, 14.83f, 18.23f, 16.0f, 21.0f, 16.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f21031a = dVarB;
        return dVarB;
    }
}
