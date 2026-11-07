package b0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Map;
import x0.j;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f3451a = new f0(null, 0, false, CropImageView.DEFAULT_ASPECT_RATIO, new a(), CropImageView.DEFAULT_ASPECT_RATIO, false, ph.j0.a(tg.i.f28768a), f3.f.a(), f3.c.b(0, 0, 15), qg.z.f22752a, 0, 0, 0, v.t0.f30083a, 0, 0);

    public static final class a implements g2.m0 {
        @Override // g2.m0
        public final int a() {
            return 0;
        }

        @Override // g2.m0
        public final int getHeight() {
            return 0;
        }

        @Override // g2.m0
        public final Map<g2.a, Integer> r() {
            return qg.a0.f22708a;
        }

        @Override // g2.m0
        public final void s() {
        }
    }

    public static final m0 a(x0.j jVar) {
        Object[] objArr = new Object[0];
        g1.n nVar = m0.f3381w;
        boolean zI = jVar.i(0) | jVar.i(0);
        Object objG = jVar.g();
        if (zI || objG == j.a.f31715a) {
            objG = new v0(0);
            jVar.C(objG);
        }
        return (m0) a0.d(objArr, nVar, (eh.a) objG, jVar, 0, 4);
    }
}
