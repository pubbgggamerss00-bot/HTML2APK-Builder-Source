package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class jb {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20909a;

    public static final w1.d a() {
        w1.d dVar = f20909a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Timer", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(9.0f, 1.0f));
        arrayList.add(new g.l(6.0f));
        arrayList.add(new g.r(2.0f));
        arrayList.add(new g.l(-6.0f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA = n0.b.a(19.03f, 7.39f, 1.42f, -1.42f);
        eVarA.c(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
        eVarA.g(-1.42f, 1.42f);
        eVarA.b(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
        eVarA.c(-4.97f, CropImageView.DEFAULT_ASPECT_RATIO, -9.0f, 4.03f, -9.0f, 9.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
        eVarA.j(9.0f, -4.03f, 9.0f, -9.0f);
        eVarA.b(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f);
        eVarA.a();
        eVarA.h(13.0f, 14.0f);
        eVarA.e(-2.0f);
        eVarA.k(8.0f);
        eVarA.e(2.0f);
        eVarA.k(14.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20909a = dVarB;
        return dVarB;
    }
}
