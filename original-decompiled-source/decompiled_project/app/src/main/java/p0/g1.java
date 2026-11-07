package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20858a;

    public static final w1.d a() {
        w1.d dVar = f20858a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Category", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(12.0f, 2.0f));
        arrayList.add(new g.m(-5.5f, 9.0f));
        arrayList.add(new g.l(11.0f));
        g.b bVar = g.b.f31130c;
        arrayList.add(bVar);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(17.5f, 17.5f));
        arrayList2.add(new g.n(-4.5f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(4.5f, 4.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 9.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(4.5f, 4.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -9.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList2, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList3 = new ArrayList(32);
        arrayList3.add(new g.f(3.0f, 13.5f));
        arrayList3.add(new g.l(8.0f));
        arrayList3.add(new g.r(8.0f));
        arrayList3.add(new g.d(3.0f));
        arrayList3.add(bVar);
        d.a.a(aVar, arrayList3, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f20858a = dVarB;
        return dVarB;
    }
}
