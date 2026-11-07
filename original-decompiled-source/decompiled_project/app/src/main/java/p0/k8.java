package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class k8 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20920a;

    public static final w1.d a() {
        w1.d dVar = f20920a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Pool", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = o0.d.a(22.0f, 21.0f);
        eVarA.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -1.73f, -0.37f, -2.18f, -0.64f);
        eVarA.c(-0.37f, -0.22f, -0.6f, -0.36f, -1.15f, -0.36f);
        eVarA.c(-0.56f, CropImageView.DEFAULT_ASPECT_RATIO, -0.78f, 0.13f, -1.15f, 0.36f);
        eVarA.c(-0.46f, 0.27f, -1.07f, 0.64f, -2.18f, 0.64f);
        eVarA.j(-1.73f, -0.37f, -2.18f, -0.64f);
        eVarA.c(-0.37f, -0.22f, -0.6f, -0.36f, -1.15f, -0.36f);
        eVarA.c(-0.56f, CropImageView.DEFAULT_ASPECT_RATIO, -0.78f, 0.13f, -1.15f, 0.36f);
        eVarA.c(-0.46f, 0.27f, -1.08f, 0.64f, -2.19f, 0.64f);
        eVarA.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -1.73f, -0.37f, -2.18f, -0.64f);
        eVarA.c(-0.37f, -0.23f, -0.6f, -0.36f, -1.15f, -0.36f);
        eVarA.j(-0.78f, 0.13f, -1.15f, 0.36f);
        eVarA.c(-0.46f, 0.27f, -1.08f, 0.64f, -2.19f, 0.64f);
        eVarA.l(-2.0f);
        eVarA.c(0.56f, CropImageView.DEFAULT_ASPECT_RATIO, 0.78f, -0.13f, 1.15f, -0.36f);
        eVarA.c(0.46f, -0.27f, 1.08f, -0.64f, 2.19f, -0.64f);
        eVarA.j(1.73f, 0.37f, 2.18f, 0.64f);
        eVarA.c(0.37f, 0.23f, 0.59f, 0.36f, 1.15f, 0.36f);
        eVarA.c(0.56f, CropImageView.DEFAULT_ASPECT_RATIO, 0.78f, -0.13f, 1.15f, -0.36f);
        eVarA.c(0.46f, -0.27f, 1.08f, -0.64f, 2.19f, -0.64f);
        eVarA.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 1.73f, 0.37f, 2.18f, 0.64f);
        eVarA.c(0.37f, 0.22f, 0.6f, 0.36f, 1.15f, 0.36f);
        eVarA.j(0.78f, -0.13f, 1.15f, -0.36f);
        eVarA.c(0.45f, -0.27f, 1.07f, -0.64f, 2.18f, -0.64f);
        eVarA.j(1.73f, 0.37f, 2.18f, 0.64f);
        eVarA.c(0.37f, 0.23f, 0.59f, 0.36f, 1.15f, 0.36f);
        eVarA.l(2.0f);
        eVarA.a();
        eVarA.h(22.0f, 16.5f);
        eVarA.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -1.73f, -0.37f, -2.18f, -0.64f);
        eVarA.c(-0.37f, -0.22f, -0.6f, -0.36f, -1.15f, -0.36f);
        eVarA.c(-0.56f, CropImageView.DEFAULT_ASPECT_RATIO, -0.78f, 0.13f, -1.15f, 0.36f);
        eVarA.c(-0.45f, 0.27f, -1.07f, 0.64f, -2.18f, 0.64f);
        eVarA.j(-1.73f, -0.37f, -2.18f, -0.64f);
        eVarA.c(-0.37f, -0.22f, -0.6f, -0.36f, -1.15f, -0.36f);
        eVarA.c(-0.56f, CropImageView.DEFAULT_ASPECT_RATIO, -0.78f, 0.13f, -1.15f, 0.36f);
        eVarA.c(-0.45f, 0.27f, -1.07f, 0.64f, -2.18f, 0.64f);
        eVarA.j(-1.73f, -0.37f, -2.18f, -0.64f);
        eVarA.c(-0.37f, -0.22f, -0.6f, -0.36f, -1.15f, -0.36f);
        eVarA.j(-0.78f, 0.13f, -1.15f, 0.36f);
        eVarA.c(-0.47f, 0.27f, -1.09f, 0.64f, -2.2f, 0.64f);
        eVarA.l(-2.0f);
        eVarA.c(0.56f, CropImageView.DEFAULT_ASPECT_RATIO, 0.78f, -0.13f, 1.15f, -0.36f);
        eVarA.c(0.45f, -0.27f, 1.07f, -0.64f, 2.18f, -0.64f);
        eVarA.j(1.73f, 0.37f, 2.18f, 0.64f);
        eVarA.c(0.37f, 0.22f, 0.6f, 0.36f, 1.15f, 0.36f);
        eVarA.c(0.56f, CropImageView.DEFAULT_ASPECT_RATIO, 0.78f, -0.13f, 1.15f, -0.36f);
        eVarA.c(0.45f, -0.27f, 1.07f, -0.64f, 2.18f, -0.64f);
        eVarA.j(1.73f, 0.37f, 2.18f, 0.64f);
        eVarA.c(0.37f, 0.22f, 0.6f, 0.36f, 1.15f, 0.36f);
        eVarA.j(0.78f, -0.13f, 1.15f, -0.36f);
        eVarA.c(0.45f, -0.27f, 1.07f, -0.64f, 2.18f, -0.64f);
        eVarA.j(1.73f, 0.37f, 2.18f, 0.64f);
        eVarA.c(0.37f, 0.22f, 0.6f, 0.36f, 1.15f, 0.36f);
        eVarA.l(2.0f);
        eVarA.a();
        eVarA.h(8.67f, 12.0f);
        eVarA.c(0.56f, CropImageView.DEFAULT_ASPECT_RATIO, 0.78f, -0.13f, 1.15f, -0.36f);
        eVarA.c(0.46f, -0.27f, 1.08f, -0.64f, 2.19f, -0.64f);
        eVarA.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 1.73f, 0.37f, 2.18f, 0.64f);
        eVarA.c(0.37f, 0.22f, 0.6f, 0.36f, 1.15f, 0.36f);
        eVarA.j(0.78f, -0.13f, 1.15f, -0.36f);
        eVarA.c(0.12f, -0.07f, 0.26f, -0.15f, 0.41f, -0.23f);
        eVarA.f(10.48f, 5.0f);
        eVarA.b(8.93f, 3.45f, 7.5f, 2.99f, 5.0f, 3.0f);
        eVarA.l(2.5f);
        eVarA.c(1.82f, -0.01f, 2.89f, 0.39f, 4.0f, 1.5f);
        eVarA.g(1.0f, 1.0f);
        eVarA.g(-3.25f, 3.25f);
        eVarA.c(0.31f, 0.12f, 0.56f, 0.27f, 0.77f, 0.39f);
        eVarA.c(0.37f, 0.23f, 0.59f, 0.36f, 1.15f, 0.36f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(16.5f, 5.5f));
        arrayList.add(new g.n(-2.5f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(2.5f, 2.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 5.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(2.5f, 2.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -5.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20920a = dVarB;
        return dVarB;
    }
}
