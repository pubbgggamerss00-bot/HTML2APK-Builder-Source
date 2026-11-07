package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21119a;

    public static final w1.d a() {
        w1.d dVar = f21119a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Medication", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(6.0f, 3.0f));
        arrayList.add(new g.l(12.0f));
        arrayList.add(new g.r(2.0f));
        arrayList.add(new g.l(-12.0f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVar = new w1.e();
        eVar.h(17.0f, 6.0f);
        eVar.d(7.0f);
        eVar.b(5.9f, 6.0f, 5.0f, 6.9f, 5.0f, 8.0f);
        eVar.l(11.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.e(10.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.k(8.0f);
        eVar.b(19.0f, 6.9f, 18.1f, 6.0f, 17.0f, 6.0f);
        com.google.android.recaptcha.internal.e.c(eVar, 16.0f, 15.0f, -2.5f, 2.5f);
        eVar.e(-3.0f);
        eVar.k(15.0f);
        eVar.d(8.0f);
        eVar.l(-3.0f);
        eVar.e(2.5f);
        eVar.k(9.5f);
        eVar.e(3.0f);
        eVar.k(12.0f);
        eVar.d(16.0f);
        eVar.k(15.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f21119a = dVarB;
        return dVarB;
    }
}
