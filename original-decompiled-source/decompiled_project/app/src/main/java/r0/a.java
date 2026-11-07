package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23007a;

    public static final w1.d a() {
        w1.d dVar = f23007a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(18.0f, 13.0f);
        eVar.e(-5.0f);
        eVar.l(5.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        eVar.j(-1.0f, -0.45f, -1.0f, -1.0f);
        eVar.l(-5.0f);
        eVar.d(6.0f);
        eVar.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
        eVar.j(0.45f, -1.0f, 1.0f, -1.0f);
        eVar.e(5.0f);
        eVar.k(6.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        eVar.j(1.0f, 0.45f, 1.0f, 1.0f);
        eVar.l(5.0f);
        eVar.e(5.0f);
        eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.45f, 1.0f, 1.0f);
        eVar.j(-0.45f, 1.0f, -1.0f, 1.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23007a = dVarB;
        return dVarB;
    }
}
