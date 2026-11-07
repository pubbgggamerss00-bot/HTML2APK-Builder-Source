package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21010a;

    public static final w1.d a() {
        w1.d dVar = f21010a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Diamond", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(12.16f, 3.0f));
        arrayList.add(new g.m(-0.32f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.m(-2.63f, 5.25f));
        arrayList.add(new g.m(5.58f, CropImageView.DEFAULT_ASPECT_RATIO));
        g.b bVar = g.b.f31130c;
        arrayList.add(bVar);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(16.46f, 8.25f));
        arrayList2.add(new g.m(5.16f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.m(-2.62f, -5.25f));
        arrayList2.add(new g.m(-5.16f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(bVar);
        d.a.a(aVar, arrayList2, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList3 = new ArrayList(32);
        arrayList3.add(new g.f(21.38f, 9.75f));
        arrayList3.add(new g.m(-8.63f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList3.add(new g.m(CropImageView.DEFAULT_ASPECT_RATIO, 10.35f));
        arrayList3.add(bVar);
        d.a.a(aVar, arrayList3, 0, i2Var3);
        q1.i2 i2Var4 = new q1.i2(j10);
        ArrayList arrayList4 = new ArrayList(32);
        arrayList4.add(new g.f(11.25f, 20.1f));
        arrayList4.add(new g.m(CropImageView.DEFAULT_ASPECT_RATIO, -10.35f));
        arrayList4.add(new g.m(-8.63f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList4.add(bVar);
        d.a.a(aVar, arrayList4, 0, i2Var4);
        q1.i2 i2Var5 = new q1.i2(j10);
        ArrayList arrayList5 = new ArrayList(32);
        arrayList5.add(new g.f(7.54f, 8.25f));
        arrayList5.add(new g.m(2.62f, -5.25f));
        arrayList5.add(new g.m(-5.16f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList5.add(new g.m(-2.62f, 5.25f));
        arrayList5.add(bVar);
        d.a.a(aVar, arrayList5, 0, i2Var5);
        w1.d dVarB = aVar.b();
        f21010a = dVarB;
        return dVarB;
    }
}
