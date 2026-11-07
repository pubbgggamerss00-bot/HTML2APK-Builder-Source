package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20912a;

    public static final w1.d a() {
        w1.d dVar = f20912a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Bedtime", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(12.34f, 2.02f));
        arrayList.add(new g.c(6.59f, 1.82f, 2.0f, 6.42f, 2.0f, 12.0f));
        arrayList.add(new g.k(CropImageView.DEFAULT_ASPECT_RATIO, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f));
        arrayList.add(new g.k(3.71f, CropImageView.DEFAULT_ASPECT_RATIO, 6.93f, -2.02f, 8.66f, -5.02f));
        arrayList.add(new g.c(13.15f, 16.73f, 8.57f, 8.55f, 12.34f, 2.02f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20912a = dVarB;
        return dVarB;
    }
}
