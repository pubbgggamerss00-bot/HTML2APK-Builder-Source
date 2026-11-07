package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class m8 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20947a;

    public static final w1.d a() {
        w1.d dVar = f20947a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.PriorityHigh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(12.0f, 19.0f));
        arrayList.add(new g.n(-2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(2.0f, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 4.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(2.0f, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -4.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(10.0f, 3.0f));
        arrayList2.add(new g.l(4.0f));
        arrayList2.add(new g.r(12.0f));
        arrayList2.add(new g.l(-4.0f));
        arrayList2.add(g.b.f31130c);
        d.a.a(aVar, arrayList2, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20947a = dVarB;
        return dVarB;
    }
}
