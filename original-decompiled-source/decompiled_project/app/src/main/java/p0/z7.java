package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class z7 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21120a;

    public static final w1.d a() {
        w1.d dVar = f21120a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Pets", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(4.5f, 9.5f));
        arrayList.add(new g.n(-2.5f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(2.5f, 2.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 5.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList.add(new g.j(2.5f, 2.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -5.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(9.0f, 5.5f));
        arrayList2.add(new g.n(-2.5f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(2.5f, 2.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 5.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList2.add(new g.j(2.5f, 2.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -5.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList2, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList3 = new ArrayList(32);
        arrayList3.add(new g.f(15.0f, 5.5f));
        arrayList3.add(new g.n(-2.5f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList3.add(new g.j(2.5f, 2.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 5.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList3.add(new g.j(2.5f, 2.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -5.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList3, 0, i2Var3);
        q1.i2 i2Var4 = new q1.i2(j10);
        ArrayList arrayList4 = new ArrayList(32);
        arrayList4.add(new g.f(19.5f, 9.5f));
        arrayList4.add(new g.n(-2.5f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList4.add(new g.j(2.5f, 2.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, 5.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        arrayList4.add(new g.j(2.5f, 2.5f, CropImageView.DEFAULT_ASPECT_RATIO, true, true, -5.0f, CropImageView.DEFAULT_ASPECT_RATIO));
        d.a.a(aVar, arrayList4, 0, i2Var4);
        q1.i2 i2Var5 = new q1.i2(j10);
        w1.e eVarA = o0.d.a(17.34f, 14.86f);
        eVarA.c(-0.87f, -1.02f, -1.6f, -1.89f, -2.48f, -2.91f);
        eVarA.c(-0.46f, -0.54f, -1.05f, -1.08f, -1.75f, -1.32f);
        eVarA.c(-0.11f, -0.04f, -0.22f, -0.07f, -0.33f, -0.09f);
        eVarA.c(-0.25f, -0.04f, -0.52f, -0.04f, -0.78f, -0.04f);
        eVarA.j(-0.53f, CropImageView.DEFAULT_ASPECT_RATIO, -0.79f, 0.05f);
        eVarA.c(-0.11f, 0.02f, -0.22f, 0.05f, -0.33f, 0.09f);
        eVarA.c(-0.7f, 0.24f, -1.28f, 0.78f, -1.75f, 1.32f);
        eVarA.c(-0.87f, 1.02f, -1.6f, 1.89f, -2.48f, 2.91f);
        eVarA.c(-1.31f, 1.31f, -2.92f, 2.76f, -2.62f, 4.79f);
        eVarA.c(0.29f, 1.02f, 1.02f, 2.03f, 2.33f, 2.32f);
        eVarA.c(0.73f, 0.15f, 3.06f, -0.44f, 5.54f, -0.44f);
        eVarA.e(0.18f);
        eVarA.c(2.48f, CropImageView.DEFAULT_ASPECT_RATIO, 4.81f, 0.58f, 5.54f, 0.44f);
        eVarA.c(1.31f, -0.29f, 2.04f, -1.31f, 2.33f, -2.32f);
        eVarA.c(0.31f, -2.04f, -1.3f, -3.49f, -2.61f, -4.8f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var5);
        w1.d dVarB = aVar.b();
        f21120a = dVarB;
        return dVarB;
    }
}
