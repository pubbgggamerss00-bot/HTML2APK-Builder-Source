package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20874a;

    public static final w1.d a() {
        w1.d dVar = f20874a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.FlashlightOn", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(6.0f, 2.0f));
        arrayList.add(new g.l(12.0f));
        arrayList.add(new g.r(3.0f));
        arrayList.add(new g.l(-12.0f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVar = new w1.e();
        eVar.h(6.0f, 7.0f);
        eVar.l(1.0f);
        eVar.g(2.0f, 3.0f);
        eVar.l(11.0f);
        eVar.e(8.0f);
        eVar.k(11.0f);
        eVar.g(2.0f, -3.0f);
        eVar.k(7.0f);
        eVar.d(6.0f);
        eVar.a();
        eVar.h(12.0f, 15.5f);
        eVar.c(-0.83f, CropImageView.DEFAULT_ASPECT_RATIO, -1.5f, -0.67f, -1.5f, -1.5f);
        eVar.j(0.67f, -1.5f, 1.5f, -1.5f);
        eVar.j(1.5f, 0.67f, 1.5f, 1.5f);
        eVar.i(12.83f, 15.5f, 12.0f, 15.5f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20874a = dVarB;
        return dVarB;
    }
}
