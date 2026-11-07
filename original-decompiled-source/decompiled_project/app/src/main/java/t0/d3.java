package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final d3 f25640a = new d3();

    static {
        float f10 = o3.f26577a;
        float f11 = 0;
        if (!((f10 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f10 >= CropImageView.DEFAULT_ASPECT_RATIO) & (f11 >= CropImageView.DEFAULT_ASPECT_RATIO)) || !(f11 >= CropImageView.DEFAULT_ASPECT_RATIO)) {
            a0.a.a("Padding must be non-negative");
        }
    }

    public final void a(boolean z10, androidx.compose.ui.d dVar, x0.j jVar, int i10) {
        androidx.compose.ui.d dVar2;
        x0.k kVarP = jVar.p(-1987096744);
        if ((((kVarP.c(z10) ? 4 : 2) | i10 | 48) & 19) == 18 && kVarP.s()) {
            kVarP.v();
            dVar2 = dVar;
        } else {
            w1.d dVarB = p0.t.f21034a;
            if (dVarB == null) {
                d.a aVar = new d.a("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i11 = w1.m.f31210a;
                q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new g.f(7.0f, 10.0f));
                arrayList.add(new g.m(5.0f, 5.0f));
                arrayList.add(new g.m(5.0f, -5.0f));
                arrayList.add(g.b.f31130c);
                d.a.a(aVar, arrayList, 0, i2Var);
                dVarB = aVar.b();
                p0.t.f21034a = dVarB;
            }
            w1.d dVar3 = dVarB;
            float f10 = z10 ? 180.0f : CropImageView.DEFAULT_ASPECT_RATIO;
            dVar2 = d.a.f1143b;
            t4.b(dVar3, null, e3.k.b(dVar2, f10), 0L, kVarP, 48, 8);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c3(this, z10, dVar2, i10);
        }
    }
}
