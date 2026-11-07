package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class n7 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20959a;

    public static final w1.d a() {
        w1.d dVar = f20959a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Nightlight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(14.0f, 2.0f));
        arrayList.add(new g.k(1.82f, CropImageView.DEFAULT_ASPECT_RATIO, 3.53f, 0.5f, 5.0f, 1.35f));
        arrayList.add(new g.c(16.01f, 5.08f, 14.0f, 8.3f, 14.0f, 12.0f));
        arrayList.add(new g.p(2.01f, 6.92f, 5.0f, 8.65f));
        arrayList.add(new g.c(17.53f, 21.5f, 15.82f, 22.0f, 14.0f, 22.0f));
        arrayList.add(new g.c(8.48f, 22.0f, 4.0f, 17.52f, 4.0f, 12.0f));
        arrayList.add(new g.h(8.48f, 2.0f, 14.0f, 2.0f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20959a = dVarB;
        return dVarB;
    }
}
