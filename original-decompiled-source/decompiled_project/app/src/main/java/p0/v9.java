package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class v9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21070a;

    public static final w1.d a() {
        w1.d dVar = f21070a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.SentimentSatisfied", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(15.5f, 9.5f));
        arrayList.add(new g.n(-1.5f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(1.5f, 1.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 3.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(1.5f, 1.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -3.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(8.5f, 9.5f));
        arrayList2.add(new g.n(-1.5f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(1.5f, 1.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 3.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(1.5f, 1.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -3.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList2, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        w1.e eVarA = o0.d.a(11.99f, 2.0f);
        eVarA.b(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.j(4.47f, 10.0f, 9.99f, 10.0f);
        eVarA.b(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        eVarA.i(17.52f, 2.0f, 11.99f, 2.0f);
        eVarA.a();
        eVarA.h(12.0f, 20.0f);
        eVarA.c(-4.42f, CropImageView.DEFAULT_ASPECT_RATIO, -8.0f, -3.58f, -8.0f, -8.0f);
        eVarA.j(3.58f, -8.0f, 8.0f, -8.0f);
        eVarA.j(8.0f, 3.58f, 8.0f, 8.0f);
        eVarA.j(-3.58f, 8.0f, -8.0f, 8.0f);
        eVarA.a();
        eVarA.h(12.0f, 16.0f);
        eVarA.c(-0.73f, CropImageView.DEFAULT_ASPECT_RATIO, -1.38f, -0.18f, -1.96f, -0.52f);
        eVarA.c(-0.12f, 0.14f, -0.86f, 0.98f, -1.01f, 1.15f);
        eVarA.c(0.86f, 0.55f, 1.87f, 0.87f, 2.97f, 0.87f);
        eVarA.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 2.12f, -0.33f, 2.98f, -0.88f);
        eVarA.c(-0.97f, -1.09f, -0.01f, -0.02f, -1.01f, -1.15f);
        eVarA.c(-0.59f, 0.35f, -1.24f, 0.53f, -1.97f, 0.53f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f21070a = dVarB;
        return dVarB;
    }
}
