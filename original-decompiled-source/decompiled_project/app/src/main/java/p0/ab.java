package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20787a;

    public static final w1.d a() {
        w1.d dVar = f20787a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Subway", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(15.5f, 16.0f));
        arrayList.add(new g.n(-1.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(8.5f, 16.0f));
        arrayList2.add(new g.n(-1.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList2, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        w1.e eVar = new w1.e();
        eVar.h(7.01f, 9.0f);
        eVar.e(10.0f);
        eVar.l(5.0f);
        eVar.e(-10.0f);
        eVar.a();
        eVar.h(17.8f, 2.8f);
        eVar.b(16.0f, 2.09f, 13.86f, 2.0f, 12.0f, 2.0f);
        eVar.c(-1.86f, CropImageView.DEFAULT_ASPECT_RATIO, -4.0f, 0.09f, -5.8f, 0.8f);
        eVar.b(3.53f, 3.84f, 2.0f, 6.05f, 2.0f, 8.86f);
        eVar.f(2.0f, 22.0f);
        eVar.e(20.0f);
        eVar.f(22.0f, 8.86f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -2.81f, -1.53f, -5.02f, -4.2f, -6.06f);
        eVar.a();
        eVar.h(18.0f, 15.88f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.45f, -1.18f, 2.62f, -2.63f, 2.62f);
        eVar.g(1.13f, 1.12f);
        eVar.f(16.5f, 20.0f);
        eVar.f(15.0f, 20.0f);
        eVar.g(-1.5f, -1.5f);
        eVar.e(-2.83f);
        eVar.f(9.17f, 20.0f);
        eVar.f(7.5f, 20.0f);
        eVar.l(-0.38f);
        eVar.g(1.12f, -1.12f);
        eVar.b(7.18f, 18.5f, 6.0f, 17.32f, 6.0f, 15.88f);
        eVar.f(6.0f, 9.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -2.63f, 3.0f, -3.0f, 6.0f, -3.0f);
        eVar.c(3.32f, CropImageView.DEFAULT_ASPECT_RATIO, 6.0f, 0.38f, 6.0f, 3.0f);
        eVar.l(6.88f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f20787a = dVarB;
        return dVarB;
    }
}
