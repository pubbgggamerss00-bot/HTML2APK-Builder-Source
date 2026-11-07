package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21021a;

    public static final w1.d a() {
        w1.d dVar = f21021a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Architecture", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(6.36f, 18.78f));
        arrayList.add(new g.e(6.61f, 21.0f));
        arrayList.add(new g.m(1.62f, -1.54f));
        arrayList.add(new g.m(2.77f, -7.6f));
        arrayList.add(new g.k(-0.68f, -0.17f, -1.28f, -0.51f, -1.77f, -0.98f));
        arrayList.add(new g.e(6.36f, 18.78f));
        g.b bVar = g.b.f31130c;
        arrayList.add(bVar);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(14.77f, 10.88f));
        arrayList2.add(new g.k(-0.49f, 0.47f, -1.1f, 0.81f, -1.77f, 0.98f));
        arrayList2.add(new g.m(2.77f, 7.6f));
        arrayList2.add(new g.e(17.39f, 21.0f));
        arrayList2.add(new g.m(0.26f, -2.22f));
        arrayList2.add(new g.e(14.77f, 10.88f));
        arrayList2.add(bVar);
        d.a.a(aVar, arrayList2, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        w1.e eVarA = o0.d.a(15.0f, 8.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.3f, -0.84f, -2.4f, -2.0f, -2.82f);
        eVarA.k(3.0f);
        eVarA.e(-2.0f);
        eVarA.l(2.18f);
        eVarA.b(9.84f, 5.6f, 9.0f, 6.7f, 9.0f, 8.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        eVarA.i(15.0f, 9.66f, 15.0f, 8.0f);
        eVarA.a();
        eVarA.h(12.0f, 9.0f);
        eVarA.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        eVarA.j(1.0f, 0.45f, 1.0f, 1.0f);
        eVarA.b(13.0f, 8.55f, 12.55f, 9.0f, 12.0f, 9.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f21021a = dVarB;
        return dVarB;
    }
}
