package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21055a;

    public static final w1.d a() {
        w1.d dVar = f21055a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Park", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(17.0f, 12.0f, 2.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(-7.0f, -10.0f);
        eVarA.g(-6.95f, 10.0f);
        eVarA.g(1.95f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(-3.9f, 6.0f);
        eVarA.g(6.92f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, 4.0f);
        eVarA.g(3.96f, CropImageView.DEFAULT_ASPECT_RATIO);
        h.b(eVarA, CropImageView.DEFAULT_ASPECT_RATIO, -4.0f, 7.02f, CropImageView.DEFAULT_ASPECT_RATIO);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21055a = dVarB;
        return dVarB;
    }
}
