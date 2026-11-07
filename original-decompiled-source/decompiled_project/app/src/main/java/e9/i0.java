package e9;

import android.content.Context;
import androidx.compose.ui.d;
import c9.u1;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import ph.v1;
import x0.a2;
import x0.j;
import x0.n1;
import x0.r3;
import z.g1;

/* loaded from: classes.dex */
public final class i0 implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f8441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r3<ProjectEntity> f8442b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8443c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f8444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r3<List<String>> f8445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f8446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f8448h;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(Context context, r3<ProjectEntity> r3Var, String str, String str2, r3<? extends List<String>> r3Var2, s0 s0Var, long j10, n1<Boolean> n1Var) {
        this.f8441a = context;
        this.f8442b = r3Var;
        this.f8443c = str;
        this.f8444d = str2;
        this.f8445e = r3Var2;
        this.f8446f = s0Var;
        this.f8447g = j10;
        this.f8448h = n1Var;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(aVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            z.q qVarA = z.o.a(z.b.h(10), d.a.f14614m, jVar2, 6);
            int iD = jVar2.D();
            a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            v1.j(g.a.f13867f, qVarA, jVar2);
            v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            v1.j(g.a.f13865d, dVarC, jVar2);
            jVar2.L(-1593032700);
            final Context context = this.f8441a;
            boolean zL = jVar2.l(context);
            final r3<ProjectEntity> r3Var = this.f8442b;
            boolean zK = zL | jVar2.K(r3Var);
            final String str = this.f8443c;
            boolean zK2 = zK | jVar2.K(str);
            final String str2 = this.f8444d;
            boolean zK3 = zK2 | jVar2.K(str2);
            final r3<List<String>> r3Var2 = this.f8445e;
            boolean zK4 = zK3 | jVar2.K(r3Var2);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zK4 || objG == c0321a) {
                eh.a aVar3 = new eh.a() { // from class: e9.f0
                    @Override // eh.a
                    public final Object invoke() {
                        String packageName;
                        String name;
                        r3 r3Var3 = r3Var;
                        ProjectEntity projectEntity = (ProjectEntity) r3Var3.getValue();
                        String str3 = (projectEntity == null || (name = projectEntity.getName()) == null) ? "" : name;
                        ProjectEntity projectEntity2 = (ProjectEntity) r3Var3.getValue();
                        q0.b(context, str3, (projectEntity2 == null || (packageName = projectEntity2.getPackageName()) == null) ? "" : packageName, str, str2, (List) r3Var2.getValue());
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(aVar3);
                objG = aVar3;
            }
            jVar2.B();
            float f10 = 48;
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), f10);
            float f11 = 12;
            h0.e eVarA = h0.f.a(f11);
            g1 g1Var = t0.m0.f26400a;
            t0.x0.a((eh.a) objG, dVarF, false, eVarA, t0.m0.a(c2.n0.c(4282606062L), 0L, 0L, jVar2, 14), null, null, null, z0.f8620d, jVar2, 805306416, 484);
            jVar2.L(-1592970570);
            final s0 s0Var = this.f8446f;
            boolean zL2 = jVar2.l(s0Var);
            final long j10 = this.f8447g;
            boolean zJ = zL2 | jVar2.j(j10);
            Object objG2 = jVar2.g();
            final n1<Boolean> n1Var = this.f8448h;
            if (zJ || objG2 == c0321a) {
                objG2 = new eh.a() { // from class: e9.g0
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var.setValue(Boolean.FALSE);
                        s0Var.f(j10);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG2);
            }
            jVar2.B();
            t0.x0.a((eh.a) objG2, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), f10), false, h0.f.a(f11), t0.m0.a(c2.n0.c(4294947584L), 0L, 0L, jVar2, 14), null, null, null, z0.f8621e, jVar2, 805306416, 484);
            jVar2.L(-1592922375);
            Object objG3 = jVar2.g();
            if (objG3 == c0321a) {
                objG3 = new eh.a() { // from class: e9.h0
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var.setValue(Boolean.FALSE);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG3);
            }
            jVar2.B();
            t0.x0.a((eh.a) objG3, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f), 44), false, h0.f.a(f11), t0.m0.a(c2.n0.c(4281873223L), 0L, 0L, jVar2, 14), null, null, null, z0.f8622f, jVar2, 805306422, 484);
            jVar2.H();
        }
        return pg.f0.f21461a;
    }
}
