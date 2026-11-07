package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class v6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21067a;

    public static final w1.d a() {
        w1.d dVar = f21067a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.LunchDining", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(22.0f, 10.0f));
        arrayList.add(new g.k(0.32f, -3.28f, -4.28f, -6.0f, -9.99f, -6.0f));
        arrayList.add(new g.c(6.3f, 4.0f, 1.7f, 6.72f, 2.02f, 10.0f));
        arrayList.add(new g.d(22.0f));
        g.b bVar = g.b.f31130c;
        arrayList.add(bVar);
        d.a.a(aVar, arrayList, 1, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA = o0.d.a(5.35f, 13.5f);
        eVarA.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 0.78f, 0.14f, 1.15f, 0.36f);
        eVarA.c(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        eVarA.j(1.73f, -0.37f, 2.18f, -0.64f);
        eVarA.c(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        eVarA.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 0.78f, 0.14f, 1.15f, 0.36f);
        eVarA.c(0.45f, 0.27f, 1.07f, 0.64f, 2.18f, 0.64f);
        eVarA.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 1.73f, -0.37f, 2.18f, -0.64f);
        eVarA.c(0.37f, -0.23f, 0.59f, -0.36f, 1.15f, -0.36f);
        eVarA.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 0.78f, 0.14f, 1.15f, 0.36f);
        eVarA.c(0.45f, 0.27f, 1.07f, 0.63f, 2.17f, 0.64f);
        eVarA.l(-1.98f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, -0.79f, -0.16f, -1.16f, -0.38f);
        eVarA.c(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        eVarA.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -1.73f, 0.37f, -2.18f, 0.64f);
        eVarA.c(-0.37f, 0.23f, -0.6f, 0.36f, -1.15f, 0.36f);
        eVarA.j(-0.78f, -0.14f, -1.15f, -0.36f);
        eVarA.c(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        eVarA.j(-1.73f, 0.37f, -2.18f, 0.64f);
        eVarA.c(-0.37f, 0.23f, -0.59f, 0.36f, -1.15f, 0.36f);
        eVarA.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -0.78f, -0.14f, -1.15f, -0.36f);
        eVarA.c(-0.45f, -0.27f, -1.07f, -0.64f, -2.18f, -0.64f);
        eVarA.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -1.73f, 0.37f, -2.18f, 0.64f);
        eVarA.b(2.78f, 12.37f, 2.56f, 12.5f, 2.0f, 12.5f);
        eVarA.l(2.0f);
        eVarA.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 1.73f, -0.37f, 2.21f, -0.64f);
        eVarA.b(4.58f, 13.63f, 4.8f, 13.5f, 5.35f, 13.5f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 1, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(2.0f, 16.0f));
        arrayList2.add(new g.r(2.0f));
        arrayList2.add(new g.k(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f));
        arrayList2.add(new g.l(16.0f));
        arrayList2.add(new g.k(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f));
        arrayList2.add(new g.r(-2.0f));
        arrayList2.add(new g.d(2.0f));
        arrayList2.add(bVar);
        d.a.a(aVar, arrayList2, 1, i2Var3);
        w1.d dVarB = aVar.b();
        f21067a = dVarB;
        return dVarB;
    }
}
