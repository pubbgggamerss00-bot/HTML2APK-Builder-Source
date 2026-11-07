package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class qa {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21004a;

    public static final w1.d a() {
        w1.d dVar = f21004a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.SportsMotorsports", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(12.0f, 11.39f));
        arrayList.add(new g.k(CropImageView.DEFAULT_ASPECT_RATIO, -0.65f, -0.39f, -1.23f, -0.98f, -1.48f));
        arrayList.add(new g.e(5.44f, 7.55f));
        arrayList.add(new g.k(-1.48f, 1.68f, -2.32f, 3.7f, -2.8f, 5.45f));
        arrayList.add(new g.l(7.75f));
        arrayList.add(new g.c(11.28f, 13.0f, 12.0f, 12.28f, 12.0f, 11.39f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA = o0.d.a(21.96f, 11.22f);
        eVarA.c(-0.41f, -4.41f, -4.56f, -7.49f, -8.98f, -7.2f);
        eVarA.c(-2.51f, 0.16f, -4.44f, 0.94f, -5.93f, 2.04f);
        eVarA.g(4.74f, 2.01f);
        eVarA.c(1.33f, 0.57f, 2.2f, 1.87f, 2.2f, 3.32f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.99f, -1.62f, 3.61f, -3.61f, 3.61f);
        eVarA.d(2.21f);
        eVarA.b(2.0f, 16.31f, 2.0f, 17.2f, 2.0f, 17.2f);
        eVarA.k(18.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.e(10.0f);
        eVarA.b(18.67f, 20.0f, 22.41f, 15.99f, 21.96f, 11.22f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f21004a = dVarB;
        return dVarB;
    }
}
