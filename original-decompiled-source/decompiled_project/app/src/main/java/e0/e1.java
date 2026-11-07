package e0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;
import w.n;
import x0.j;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f8172a = 56;

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f8173b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f8174c;

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

    public static final class b implements f3.d {
        @Override // f3.d
        public final float G0() {
            return 1.0f;
        }

        @Override // f3.d
        public final float getDensity() {
            return 1.0f;
        }
    }

    static {
        v.t0 t0Var = v.t0.f30083a;
        f8173b = new o0(0, 0, 0, 0, 0, 0, n.a.f31030a, new a(), ph.j0.a(tg.i.f28768a));
        f8174c = new b();
    }

    public static final long a(c0 c0Var, int i10) {
        long jG = (((i10 * (c0Var.g() + c0Var.h())) + c0Var.d()) + c0Var.c()) - c0Var.h();
        int iB = (int) (c0Var.getOrientation() == v.t0.f30084b ? c0Var.b() >> 32 : c0Var.b() & BodyPartID.bodyIdMax);
        c0Var.i().getClass();
        long jM = jG - (iB - jh.j.m(0, 0, iB));
        if (jM < 0) {
            return 0L;
        }
        return jM;
    }

    public static final e0.b b(int i10, eh.a aVar, x0.j jVar) {
        Object[] objArr = new Object[0];
        g1.n nVar = e0.b.I;
        boolean zI = jVar.i(i10) | jVar.h(CropImageView.DEFAULT_ASPECT_RATIO);
        Object objG = jVar.g();
        if (zI || objG == j.a.f31715a) {
            objG = new g1(i10, aVar);
            jVar.C(objG);
        }
        e0.b bVar = (e0.b) b0.a0.d(objArr, nVar, (eh.a) objG, jVar, 0, 4);
        bVar.H.setValue(aVar);
        return bVar;
    }
}
