package x8;

import android.content.Context;
import android.net.Uri;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import s8.e2;
import x0.j;

/* loaded from: classes.dex */
public final class c5 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f32437b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f32439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c.k<String[], Uri> f32440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f32441f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p5.x f32442g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32443h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<ProjectEntity> f32444j;

    public c5(x0.n1 n1Var, j6 j6Var, x0.n1 n1Var2, x0.r3 r3Var, c.k kVar, Context context, p5.x xVar, x0.n1 n1Var3, x0.n1 n1Var4) {
        this.f32436a = n1Var;
        this.f32437b = j6Var;
        this.f32438c = n1Var2;
        this.f32439d = r3Var;
        this.f32440e = kVar;
        this.f32441f = context;
        this.f32442g = xVar;
        this.f32443h = n1Var3;
        this.f32444j = n1Var4;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r AppDropdownMenu = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(AppDropdownMenu, "$this$AppDropdownMenu");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            f1.b bVar = c.f32344b;
            jVar2.L(-431121995);
            final x0.n1<Boolean> n1Var = this.f32436a;
            boolean zK = jVar2.K(n1Var);
            final j6 j6Var = this.f32437b;
            boolean zL = zK | jVar2.l(j6Var);
            final x0.n1 n1Var2 = this.f32438c;
            boolean zK2 = zL | jVar2.K(n1Var2);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zK2 || objG == c0321a) {
                objG = new eh.a() { // from class: x8.x4
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var.setValue(Boolean.FALSE);
                        boolean z10 = g5.f32665a;
                        boolean z11 = !((Boolean) n1Var2.getValue()).booleanValue();
                        j6 j6Var2 = j6Var;
                        ph.h.c(androidx.lifecycle.x0.a(j6Var2), null, null, new t7(j6Var2, z11, null), 3);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            jVar2.B();
            q8.g.b(bVar, (eh.a) objG, f1.c.b(-1610258218, new b5(n1Var2), jVar2), jVar2, 390, 0);
            f1.b bVar2 = c.f32345c;
            jVar2.L(-431094200);
            boolean zK3 = jVar2.K(n1Var);
            x0.r3<Boolean> r3Var = this.f32439d;
            boolean zK4 = zK3 | jVar2.K(r3Var) | jVar2.l(this.f32440e);
            Context context = this.f32441f;
            boolean zL2 = zK4 | jVar2.l(context);
            p5.x xVar = this.f32442g;
            boolean zL3 = zL2 | jVar2.l(xVar);
            Object objG2 = jVar2.g();
            if (zL3 || objG2 == c0321a) {
                final c.k<String[], Uri> kVar = this.f32440e;
                final Context context2 = this.f32441f;
                final p5.x xVar2 = this.f32442g;
                final x0.r3<Boolean> r3Var2 = this.f32439d;
                eh.a aVar = new eh.a() { // from class: x8.y4
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var.setValue(Boolean.FALSE);
                        if (g5.E(r3Var2)) {
                            hf.a.a(kVar, context2, new String[]{"application/zip", "application/x-zip-compressed", "application/x-zip", "application/octet-stream"}, R.string.launch_no_app);
                        } else {
                            p5.x.c(e2.r.f24648c.f24627a, xVar2);
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(aVar);
                objG2 = aVar;
            }
            jVar2.B();
            q8.g.b(bVar2, (eh.a) objG2, c.f32346d, jVar2, 390, 0);
            f1.b bVar3 = c.f32347e;
            jVar2.L(-431045209);
            boolean zK5 = jVar2.K(n1Var) | jVar2.K(r3Var) | jVar2.K(this.f32443h) | jVar2.l(xVar);
            Object objG3 = jVar2.g();
            if (zK5 || objG3 == c0321a) {
                final p5.x xVar3 = this.f32442g;
                final x0.r3<Boolean> r3Var3 = this.f32439d;
                final x0.n1<ProjectEntity> n1Var3 = this.f32444j;
                final x0.n1<Boolean> n1Var4 = this.f32443h;
                eh.a aVar2 = new eh.a() { // from class: x8.z4
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var.setValue(Boolean.FALSE);
                        if (g5.E(r3Var3)) {
                            n1Var3.setValue(null);
                            g5.l(n1Var4, true);
                        } else {
                            p5.x.c(e2.r.f24648c.f24627a, xVar3);
                        }
                        return pg.f0.f21461a;
                    }
                };
                n1Var = n1Var;
                jVar2.C(aVar2);
                objG3 = aVar2;
            }
            jVar2.B();
            q8.g.b(bVar3, (eh.a) objG3, c.f32348f, jVar2, 390, 0);
            f1.b bVar4 = c.f32349g;
            jVar2.L(-431009092);
            boolean zL4 = jVar2.l(xVar) | jVar2.K(n1Var) | jVar2.K(r3Var) | jVar2.l(j6Var) | jVar2.l(context);
            Object objG4 = jVar2.g();
            if (zL4 || objG4 == c0321a) {
                final Context context3 = this.f32441f;
                final p5.x xVar4 = this.f32442g;
                final x0.r3<Boolean> r3Var4 = this.f32439d;
                eh.a aVar3 = new eh.a() { // from class: x8.a5
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var.setValue(Boolean.FALSE);
                        if (g5.E(r3Var4)) {
                            Context context4 = context3;
                            kotlin.jvm.internal.r.e(context4, "context");
                            j6 j6Var2 = j6Var;
                            ph.h.c(androidx.lifecycle.x0.a(j6Var2), null, null, new x6(context4, null, j6Var2), 3);
                        } else {
                            p5.x.c(e2.r.f24648c.f24627a, xVar4);
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(aVar3);
                objG4 = aVar3;
            }
            jVar2.B();
            q8.g.b(bVar4, (eh.a) objG4, c.f32350h, jVar2, 390, 0);
        }
        return pg.f0.f21461a;
    }
}
