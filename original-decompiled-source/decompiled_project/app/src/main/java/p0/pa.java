package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class pa {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20990a;

    public static final w1.d a() {
        w1.d dVar = f20990a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.SportsMartialArts", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = n0.b.a(19.8f, 2.0f, -8.2f, 6.7f);
        eVarA.g(-1.21f, -1.04f);
        eVarA.g(3.6f, -2.08f);
        eVarA.g(-4.58f, -4.58f);
        eVarA.g(-1.41f, 1.41f);
        eVarA.g(2.74f, 2.74f);
        eVarA.g(-5.74f, 3.31f);
        eVarA.g(-1.19f, 4.29f);
        eVarA.g(2.46f, 4.25f);
        eVarA.g(1.73f, -1.0f);
        eVarA.g(-2.03f, -3.52f);
        eVarA.g(0.35f, -1.3f);
        eVarA.g(3.18f, 1.82f);
        eVarA.g(0.5f, 9.0f);
        eVarA.g(2.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        h.b(eVarA, 0.5f, -10.0f, 8.5f, -8.6f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(5.0f, 5.0f));
        arrayList.add(new g.n(-2.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(2.0f, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 4.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(2.0f, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -4.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20990a = dVarB;
        return dVarB;
    }
}
