package j9;

import android.net.Uri;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j9.x1;
import java.util.ArrayList;
import java.util.List;
import s8.e2;
import t0.ff;
import t0.nf;
import t0.of;
import x0.j;
import x0.r3;

/* loaded from: classes.dex */
public final class n1 implements eh.q<b0.e, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f15478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.d0 f15479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15480c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f15481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r3<List<x1.a>> f15482e;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(float f10, q8.d0 d0Var, long j10, p5.x xVar, r3<? extends List<x1.a>> r3Var) {
        this.f15478a = f10;
        this.f15479b = d0Var;
        this.f15480c = j10;
        this.f15481d = xVar;
        this.f15482e = r3Var;
    }

    @Override // eh.q
    public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
        b0.e item = eVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.h(androidx.compose.foundation.layout.g.d(aVar, 1.0f), this.f15478a, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 16, 1);
            z.q qVarA = z.o.a(z.b.f34448e, d.a.f14614m, jVar2, 6);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.f13867f, qVarA, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            float f10 = 20;
            ff.b(f3.q.c(R.string.catalog_showcase, jVar2), androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.f.j(aVar, f10, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f10, 7), 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26542e, jVar2, 196656, 0, 65500);
            List<x1.a> value = this.f15482e.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (((x1.a) obj).f15641f != null) {
                    arrayList.add(obj);
                }
            }
            jVar2.L(-1420291388);
            final q8.d0 d0Var = this.f15479b;
            boolean zK = jVar2.K(d0Var);
            final long j10 = this.f15480c;
            boolean zJ = zK | jVar2.j(j10);
            final p5.x xVar = this.f15481d;
            boolean zL = zJ | jVar2.l(xVar);
            Object objG = jVar2.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.p() { // from class: j9.m1
                    @Override // eh.p
                    public final Object invoke(Object obj2, Object obj3) {
                        final String id2 = (String) obj2;
                        q8.e0 origin = (q8.e0) obj3;
                        kotlin.jvm.internal.r.e(id2, "id");
                        kotlin.jvm.internal.r.e(origin, "origin");
                        final p5.x xVar2 = xVar;
                        d0Var.a(origin, j10, new eh.a() { // from class: j9.l1
                            @Override // eh.a
                            public final Object invoke() {
                                e2.y.f24655c.getClass();
                                String templateId = id2;
                                kotlin.jvm.internal.r.e(templateId, "templateId");
                                p5.x.c("template_detail/" + Uri.encode(templateId), xVar2);
                                return pg.f0.f21461a;
                            }
                        });
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            n.a(arrayList, (eh.p) objG, jVar2, 0);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
