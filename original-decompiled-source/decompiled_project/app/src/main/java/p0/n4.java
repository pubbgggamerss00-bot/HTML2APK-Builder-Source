package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20956a;

    public static final w1.d a() {
        w1.d dVar = f20956a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Forest", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = n0.b.a(16.0f, 12.0f, -7.0f, -10.0f);
        eVarA.g(-7.0f, 10.0f);
        eVarA.g(1.86f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(-3.86f, 6.0f);
        eVarA.g(7.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, 4.0f);
        eVarA.g(4.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, -4.0f);
        h.b(eVarA, 7.0f, CropImageView.DEFAULT_ASPECT_RATIO, -3.86f, -6.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA2 = n0.b.a(20.14f, 12.0f, 1.86f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA2.g(-7.0f, -10.0f);
        eVarA2.g(-2.39f, 3.41f);
        eVarA2.g(5.31f, 7.59f);
        eVarA2.g(-1.92f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA2.g(-0.03f, CropImageView.DEFAULT_ASPECT_RATIO);
        h.b(eVarA2, 3.22f, 5.0f, 4.81f, CropImageView.DEFAULT_ASPECT_RATIO);
        d.a.a(aVar, eVarA2.f31100a, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(13.0f, 19.0f));
        arrayList.add(new g.l(4.0f));
        arrayList.add(new g.r(3.0f));
        arrayList.add(new g.l(-4.0f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f20956a = dVarB;
        return dVarB;
    }
}
