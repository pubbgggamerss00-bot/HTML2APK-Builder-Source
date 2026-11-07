package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20926a;

    public static final w1.d a() {
        w1.d dVar = f20926a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Biotech", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = o0.d.a(7.0f, 19.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.e(14.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        eVarA.e(-4.0f);
        eVarA.l(-2.0f);
        eVarA.e(3.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.e(-8.0f);
        eVarA.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, -1.34f, -3.0f, -3.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.09f, 0.59f, -2.04f, 1.46f, -2.56f);
        eVarA.b(8.17f, 9.03f, 8.0f, 8.54f, 8.0f, 8.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.21f, 0.04f, -0.42f, 0.09f, -0.62f);
        eVarA.b(6.28f, 8.13f, 5.0f, 9.92f, 5.0f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        eVarA.l(2.0f);
        eVarA.d(7.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA2 = o0.d.a(10.56f, 5.51f);
        eVarA2.b(11.91f, 5.54f, 13.0f, 6.64f, 13.0f, 8.0f);
        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.75f, -0.33f, 1.41f, -0.85f, 1.87f);
        eVarA2.g(0.59f, 1.62f);
        eVarA2.g(0.94f, -0.34f);
        eVarA2.g(0.34f, 0.94f);
        eVarA2.g(1.88f, -0.68f);
        eVarA2.g(-0.34f, -0.94f);
        eVarA2.g(0.94f, -0.34f);
        eVarA2.f(13.76f, 2.6f);
        eVarA2.g(-0.94f, 0.34f);
        eVarA2.f(12.48f, 2.0f);
        eVarA2.f(10.6f, 2.68f);
        eVarA2.g(0.34f, 0.94f);
        f0.a(eVarA2, 10.0f, 3.97f, 10.56f, 5.51f);
        d.a.a(aVar, eVarA2.f31100a, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(10.5f, 8.0f));
        arrayList.add(new g.n(-1.5f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(1.5f, 1.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 3.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(1.5f, 1.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -3.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f20926a = dVarB;
        return dVarB;
    }
}
