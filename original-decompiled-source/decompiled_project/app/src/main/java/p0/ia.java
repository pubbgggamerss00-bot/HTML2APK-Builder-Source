package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class ia {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20894a;

    public static final w1.d a() {
        w1.d dVar = f20894a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Spa", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(8.55f, 12.0f));
        arrayList.add(new g.k(-1.07f, -0.71f, -2.25f, -1.27f, -3.53f, -1.61f));
        arrayList.add(new g.k(1.28f, 0.34f, 2.46f, 0.9f, 3.53f, 1.61f));
        g.b bVar = g.b.f31130c;
        arrayList.add(bVar);
        arrayList.add(new g.f(18.98f, 10.39f));
        arrayList.add(new g.k(-1.29f, 0.34f, -2.49f, 0.91f, -3.57f, 1.64f));
        arrayList.add(new g.k(1.08f, -0.73f, 2.28f, -1.3f, 3.57f, -1.64f));
        arrayList.add(bVar);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA = o0.d.a(15.49f, 9.63f);
        eVarA.c(-0.18f, -2.79f, -1.31f, -5.51f, -3.43f, -7.63f);
        eVarA.c(-2.14f, 2.14f, -3.32f, 4.86f, -3.55f, 7.63f);
        eVarA.c(1.28f, 0.68f, 2.46f, 1.56f, 3.49f, 2.63f);
        eVarA.c(1.03f, -1.06f, 2.21f, -1.94f, 3.49f, -2.63f);
        eVarA.a();
        eVarA.h(8.99f, 12.28f);
        eVarA.c(-0.14f, -0.1f, -0.3f, -0.19f, -0.45f, -0.29f);
        eVarA.c(0.15f, 0.11f, 0.31f, 0.19f, 0.45f, 0.29f);
        eVarA.a();
        eVarA.h(15.41f, 12.03f);
        eVarA.c(-0.13f, 0.09f, -0.27f, 0.16f, -0.4f, 0.26f);
        eVarA.c(0.13f, -0.1f, 0.27f, -0.17f, 0.4f, -0.26f);
        eVarA.a();
        eVarA.h(12.0f, 15.45f);
        eVarA.b(9.85f, 12.17f, 6.18f, 10.0f, 2.0f, 10.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 5.32f, 3.36f, 9.82f, 8.03f, 11.49f);
        eVarA.c(0.63f, 0.23f, 1.29f, 0.4f, 1.97f, 0.51f);
        eVarA.c(0.68f, -0.12f, 1.33f, -0.29f, 1.97f, -0.51f);
        eVarA.b(18.64f, 19.82f, 22.0f, 15.32f, 22.0f, 10.0f);
        eVarA.c(-4.18f, CropImageView.DEFAULT_ASPECT_RATIO, -7.85f, 2.17f, -10.0f, 5.45f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20894a = dVarB;
        return dVarB;
    }
}
