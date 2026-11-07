package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21061a;

    public static final w1.d a() {
        w1.d dVar = f21061a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.BubbleChart", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(7.2f, 14.4f));
        arrayList.add(new g.n(-3.2f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(3.2f, 3.2f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 6.4f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(3.2f, 3.2f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -6.4f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(14.8f, 18.0f));
        arrayList2.add(new g.n(-2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(2.0f, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 4.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(2.0f, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -4.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList2, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList3 = new ArrayList(32);
        arrayList3.add(new g.f(15.2f, 8.8f));
        arrayList3.add(new g.n(-4.8f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList3.add(new g.j(4.8f, 4.8f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 9.6f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList3.add(new g.j(4.8f, 4.8f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -9.6f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList3, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f21061a = dVarB;
        return dVarB;
    }
}
