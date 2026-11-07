package i7;

import g2.j;
import g2.k0;
import g2.l0;
import g2.m0;
import g2.o0;
import h7.k;
import h9.b1;
import i8.n;
import java.util.List;
import kotlin.jvm.internal.r;
import qg.a0;
import x0.j;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final long f14195a = f3.c.b(0, 0, 5);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14196b = 0;

    public static final class a implements l0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14197a = new a();

        @Override // g2.l0
        public final m0 h(o0 o0Var, List<? extends k0> list, long j10) {
            return o0Var.i0(f3.b.k(j10), f3.b.j(j10), a0.f22708a, new b1(1));
        }
    }

    public static final x7.i a(j jVar, x0.j jVar2) {
        Object obj;
        boolean zA = r.a(jVar, j.a.f11400d);
        boolean zC = jVar2.c(zA);
        Object objG = jVar2.g();
        if (zC || objG == j.a.f31715a) {
            if (zA) {
                obj = x7.i.f32201a;
            } else {
                k kVar = new k();
                kVar.f12321b = f14195a;
                obj = kVar;
            }
            objG = obj;
            jVar2.C(objG);
        }
        return (x7.i) objG;
    }

    public static void b(String str) {
        throw new IllegalArgumentException(b6.a.b("Unsupported type: ", str, ". ", n.d("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
