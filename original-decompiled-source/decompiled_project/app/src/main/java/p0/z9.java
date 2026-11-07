package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class z9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21122a;

    public static final w1.d a() {
        w1.d dVar = f21122a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Shield", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(12.0f, 1.0f));
        arrayList.add(new g.e(3.0f, 5.0f));
        arrayList.add(new g.r(6.0f));
        arrayList.add(new g.k(CropImageView.DEFAULT_ASPECT_RATIO, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f));
        arrayList.add(new g.k(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f));
        arrayList.add(new g.s(5.0f));
        arrayList.add(new g.m(-9.0f, -4.0f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21122a = dVarB;
        return dVarB;
    }
}
