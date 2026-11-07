package r;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import s.y1;
import x0.j;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.y1<Object> f22914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.e0<Float> f22915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s.y1 y1Var, s.e0 e0Var, Object obj) {
        super(2);
        f1.b bVar = b9.a.f3685a;
        this.f22914a = y1Var;
        this.f22915b = e0Var;
        this.f22916c = obj;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            q0 q0Var = new q0(this.f22915b);
            s.o2 o2Var = s.p2.f23868a;
            s.y1<Object> y1Var = this.f22914a;
            Object objV = y1Var.f24001a.V();
            jVar2.L(-438678252);
            Object obj = this.f22916c;
            boolean zA = kotlin.jvm.internal.r.a(objV, obj);
            float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
            float f11 = zA ? 1.0f : 0.0f;
            jVar2.B();
            Float fValueOf = Float.valueOf(f11);
            T value = y1Var.f24004d.getValue();
            jVar2.L(-438678252);
            if (kotlin.jvm.internal.r.a(value, obj)) {
                f10 = 1.0f;
            }
            jVar2.B();
            y1.d dVarC = s.c2.c(y1Var, fValueOf, Float.valueOf(f10), q0Var.b(y1Var.f(), jVar2, 0), o2Var, jVar2, 0);
            boolean zK = jVar2.K(dVarC);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new q2.z(dVarC, 1);
                jVar2.C(objG);
            }
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(d.a.f1143b, (eh.l) objG);
            f1.b bVar = b9.a.f3689e;
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarA, jVar2);
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
            ph.v1.j(g.a.f13865d, dVarC2, jVar2);
            bVar.b(obj, jVar2, 0);
            jVar2.H();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
