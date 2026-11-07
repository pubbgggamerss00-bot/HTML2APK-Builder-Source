package t0;

import androidx.compose.ui.d;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import i2.e0;
import i2.g;
import j1.d;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c9 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t8 f25589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<x0.j, Integer, pg.f0> f25592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f25593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.b f25594f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(t8 t8Var, boolean z10, boolean z11, eh.p pVar, boolean z12, f1.b bVar) {
        super(2);
        this.f25589a = t8Var;
        this.f25590b = z10;
        this.f25591c = z11;
        this.f25592d = pVar;
        this.f25593e = z12;
        this.f25594f = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        androidx.compose.ui.d clearAndSetSemanticsElement;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            boolean z10 = this.f25591c;
            boolean z11 = this.f25590b;
            t8 t8Var = this.f25589a;
            x0.r3 r3VarA = r.g2.a(!z10 ? t8Var.f27063f : z11 ? t8Var.f27058a : t8Var.f27061d, s.m.d(150, 0, null, 6), null, jVar2, 48, 12);
            if (this.f25592d == null || !(this.f25593e || z11)) {
                clearAndSetSemanticsElement = d.a.f1143b;
            } else {
                AtomicInteger atomicInteger = q2.q.f21804a;
                clearAndSetSemanticsElement = new ClearAndSetSemanticsElement(b9.f25536a);
            }
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(clearAndSetSemanticsElement, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, jVar2);
            x0.y.a(com.android.aapt.a.b(((q1.b1) r3VarA.getValue()).f21656a, p2.f26666a), this.f25594f, jVar2, 8);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
