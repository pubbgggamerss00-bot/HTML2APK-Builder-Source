package c0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import java.util.Map;
import x0.j;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f4374a;

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

    public static final class b extends kotlin.jvm.internal.s implements eh.l<Integer, List<? extends pg.n<? extends Integer, ? extends f3.b>>> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4375a = new b(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ List<? extends pg.n<? extends Integer, ? extends f3.b>> invoke(Integer num) {
            num.intValue();
            return qg.z.f22752a;
        }
    }

    static {
        a aVar = new a();
        v.t0 t0Var = v.t0.f30083a;
        f4374a = new l0(null, 0, false, CropImageView.DEFAULT_ASPECT_RATIO, aVar, CropImageView.DEFAULT_ASPECT_RATIO, false, ph.j0.a(tg.i.f28768a), f3.f.a(), 0, b.f4375a, qg.z.f22752a, 0, 0, 0, t0Var, 0, 0);
    }

    public static final w0 a(int i10, int i11, x0.j jVar) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        g1.n nVar = w0.f4504w;
        boolean zI = jVar.i(i10) | jVar.i(0);
        Object objG = jVar.g();
        if (zI || objG == j.a.f31715a) {
            objG = new f1(i10);
            jVar.C(objG);
        }
        return (w0) b0.a0.d(objArr, nVar, (eh.a) objG, jVar, 0, 4);
    }
}
