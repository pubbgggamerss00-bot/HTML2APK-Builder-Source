package x8;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class b5 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32332a;

    public b5(x0.n1 n1Var) {
        this.f32332a = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        w1.d dVarB;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            boolean z10 = g5.f32665a;
            if (((Boolean) this.f32332a.getValue()).booleanValue()) {
                dVarB = p0.k1.f20913a;
                if (dVarB == null) {
                    d.a aVar = new d.a("Filled.CheckBox", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i10 = w1.m.f31210a;
                    q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                    w1.e eVarA = p0.m.a(19.0f, 3.0f, 5.0f, 3.0f);
                    eVarA.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
                    eVarA.l(14.0f);
                    eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                    eVarA.e(14.0f);
                    eVarA.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                    eVarA.f(21.0f, 5.0f);
                    eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
                    l9.y.a(eVarA, 10.0f, 17.0f, -5.0f, -5.0f);
                    eVarA.g(1.41f, -1.41f);
                    eVarA.f(10.0f, 14.17f);
                    eVarA.g(7.59f, -7.59f);
                    eVarA.f(19.0f, 8.0f);
                    eVarA.g(-9.0f, 9.0f);
                    eVarA.a();
                    d.a.a(aVar, eVarA.f31100a, 0, i2Var);
                    dVarB = aVar.b();
                    p0.k1.f20913a = dVarB;
                }
            } else {
                dVarB = p0.l1.f20927a;
                if (dVarB == null) {
                    d.a aVar2 = new d.a("Filled.CheckBoxOutlineBlank", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = w1.m.f31210a;
                    q1.i2 i2Var2 = new q1.i2(q1.b1.f21648b);
                    w1.e eVar = new w1.e();
                    eVar.h(19.0f, 5.0f);
                    eVar.l(14.0f);
                    eVar.d(5.0f);
                    eVar.k(5.0f);
                    eVar.e(14.0f);
                    g.n nVar = new g.n(CropImageView.DEFAULT_ASPECT_RATIO, -2.0f);
                    ArrayList<w1.g> arrayList = eVar.f31100a;
                    arrayList.add(nVar);
                    eVar.d(5.0f);
                    eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
                    eVar.l(14.0f);
                    eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    eVar.e(14.0f);
                    eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                    eVar.k(5.0f);
                    eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    eVar.a();
                    d.a.a(aVar2, arrayList, 0, i2Var2);
                    dVarB = aVar2.b();
                    p0.l1.f20927a = dVarB;
                }
            }
            t0.t4.b(dVarB, null, androidx.compose.foundation.layout.g.n(d.a.f1143b, 20), ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s, jVar2, 432, 0);
        }
        return pg.f0.f21461a;
    }
}
