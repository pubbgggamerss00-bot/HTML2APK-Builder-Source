package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class x7 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21094a;

    public static final w1.d a() {
        w1.d dVar = f21094a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Percent", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = o0.d.a(7.5f, 11.0f);
        eVarA.b(9.43f, 11.0f, 11.0f, 9.43f, 11.0f, 7.5f);
        eVarA.i(9.43f, 4.0f, 7.5f, 4.0f);
        eVarA.i(4.0f, 5.57f, 4.0f, 7.5f);
        eVarA.i(5.57f, 11.0f, 7.5f, 11.0f);
        eVarA.a();
        eVarA.h(7.5f, 6.0f);
        eVarA.b(8.33f, 6.0f, 9.0f, 6.67f, 9.0f, 7.5f);
        eVarA.i(8.33f, 9.0f, 7.5f, 9.0f);
        eVarA.i(6.0f, 8.33f, 6.0f, 7.5f);
        eVarA.i(6.67f, 6.0f, 7.5f, 6.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(4.002f, 18.583f));
        arrayList.add(new g.m(14.587f, -14.587f));
        arrayList.add(new g.m(1.414f, 1.414f));
        arrayList.add(new g.m(-14.587f, 14.587f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        w1.e eVarA2 = o0.d.a(16.5f, 13.0f);
        eVarA2.c(-1.93f, CropImageView.DEFAULT_ASPECT_RATIO, -3.5f, 1.57f, -3.5f, 3.5f);
        eVarA2.j(1.57f, 3.5f, 3.5f, 3.5f);
        eVarA2.j(3.5f, -1.57f, 3.5f, -3.5f);
        eVarA2.i(18.43f, 13.0f, 16.5f, 13.0f);
        eVarA2.a();
        eVarA2.h(16.5f, 18.0f);
        eVarA2.c(-0.83f, CropImageView.DEFAULT_ASPECT_RATIO, -1.5f, -0.67f, -1.5f, -1.5f);
        eVarA2.j(0.67f, -1.5f, 1.5f, -1.5f);
        eVarA2.j(1.5f, 0.67f, 1.5f, 1.5f);
        eVarA2.i(17.33f, 18.0f, 16.5f, 18.0f);
        eVarA2.a();
        d.a.a(aVar, eVarA2.f31100a, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f21094a = dVarB;
        return dVarB;
    }
}
