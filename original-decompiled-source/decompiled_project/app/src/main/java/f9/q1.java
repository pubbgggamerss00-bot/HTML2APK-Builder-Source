package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import w1.d;
import x0.j;

/* loaded from: classes.dex */
public final class q1 implements eh.q<z.r, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10272c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f10276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f10277h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f10278j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f10279k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f10280l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ eh.l<Float, pg.f0> f10281m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f10282n;

    /* JADX WARN: Multi-variable type inference failed */
    public q1(eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, eh.a<pg.f0> aVar3, eh.a<pg.f0> aVar4, eh.a<pg.f0> aVar5, eh.a<pg.f0> aVar6, eh.a<pg.f0> aVar7, x0.n1<Boolean> n1Var, boolean z10, boolean z11, float f10, eh.l<? super Float, pg.f0> lVar, long j10) {
        this.f10270a = aVar;
        this.f10271b = aVar2;
        this.f10272c = aVar3;
        this.f10273d = aVar4;
        this.f10274e = aVar5;
        this.f10275f = aVar6;
        this.f10276g = aVar7;
        this.f10277h = n1Var;
        this.f10278j = z10;
        this.f10279k = z11;
        this.f10280l = f10;
        this.f10281m = lVar;
        this.f10282n = j10;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        z.r DropdownMenu = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(DropdownMenu, "$this$DropdownMenu");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            jVar2.L(-76800493);
            int i10 = 0;
            d.a aVar = d.a.f1143b;
            eh.a<pg.f0> aVar2 = this.f10270a;
            final x0.n1<Boolean> n1Var = this.f10277h;
            j.a.C0321a c0321a = j.a.f31715a;
            if (aVar2 != null) {
                w1.d dVarA = r0.b.a();
                String strC = f3.q.c(R.string.menu_convert_to_app, jVar2);
                long j10 = q8.o1.b(ProjectKind.APK).f22292a;
                jVar2.L(-76794655);
                boolean zK = jVar2.K(aVar2);
                Object objG = jVar2.g();
                if (zK || objG == c0321a) {
                    objG = new f1(aVar2, n1Var, i10);
                    jVar2.C(objG);
                }
                jVar2.B();
                d1.s(dVarA, strC, j10, (eh.a) objG, jVar2, 0, 0);
                t0.v2.a(androidx.compose.foundation.layout.f.j(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, jVar2, 6, 6);
                jVar2 = jVar2;
            }
            jVar2.B();
            w1.d dVarA2 = r0.a0.a();
            String strC2 = f3.q.c(R.string.editor_html_find_replace, jVar2);
            jVar2.L(-76788064);
            final eh.a<pg.f0> aVar3 = this.f10271b;
            boolean zK2 = jVar2.K(aVar3);
            Object objG2 = jVar2.g();
            if (zK2 || objG2 == c0321a) {
                objG2 = new eh.a() { // from class: f9.g1
                    @Override // eh.a
                    public final Object invoke() {
                        List<String> list = d1.f9265a;
                        n1Var.setValue(Boolean.FALSE);
                        aVar3.invoke();
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG2);
            }
            jVar2.B();
            d1.s(dVarA2, strC2, 0L, (eh.a) objG2, jVar2, 0, 4);
            w1.d dVarA3 = r0.b0.a();
            String strC3 = f3.q.c(R.string.editor_html_go_to_line, jVar2);
            jVar2.L(-76784003);
            final eh.a<pg.f0> aVar4 = this.f10272c;
            boolean zK3 = jVar2.K(aVar4);
            Object objG3 = jVar2.g();
            if (zK3 || objG3 == c0321a) {
                objG3 = new eh.a() { // from class: f9.h1
                    @Override // eh.a
                    public final Object invoke() {
                        List<String> list = d1.f9265a;
                        n1Var.setValue(Boolean.FALSE);
                        aVar4.invoke();
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG3);
            }
            jVar2.B();
            d1.s(dVarA3, strC3, 0L, (eh.a) objG3, jVar2, 0, 4);
            w1.d dVarB = r0.q.f23039a;
            if (dVarB == null) {
                d.a aVar5 = new d.a("Rounded.ContentPaste", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i11 = w1.m.f31210a;
                q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
                w1.e eVar = new w1.e();
                eVar.h(19.0f, 2.0f);
                eVar.e(-4.18f);
                eVar.b(14.4f, 0.84f, 13.3f, CropImageView.DEFAULT_ASPECT_RATIO, 12.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                eVar.i(9.6f, 0.84f, 9.18f, 2.0f);
                eVar.f(5.0f, 2.0f);
                eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
                eVar.l(16.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                eVar.e(14.0f);
                eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                eVar.f(21.0f, 4.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                eVar.a();
                eVar.h(12.0f, 2.0f);
                eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.45f, 1.0f, 1.0f);
                eVar.j(-0.45f, 1.0f, -1.0f, 1.0f);
                eVar.j(-1.0f, -0.45f, -1.0f, -1.0f);
                eVar.j(0.45f, -1.0f, 1.0f, -1.0f);
                l9.i.b(eVar, 18.0f, 20.0f, 6.0f, 20.0f);
                eVar.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
                eVar.f(5.0f, 5.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                eVar.e(1.0f);
                eVar.l(1.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                eVar.e(6.0f);
                eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                eVar.f(17.0f, 4.0f);
                eVar.e(1.0f);
                eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.45f, 1.0f, 1.0f);
                eVar.l(14.0f);
                eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                eVar.a();
                d.a.a(aVar5, eVar.f31100a, 0, i2Var);
                dVarB = aVar5.b();
                r0.q.f23039a = dVarB;
            }
            String strC4 = f3.q.c(R.string.editor_paste_from_clipboard, jVar2);
            jVar2.L(-76780070);
            final eh.a<pg.f0> aVar6 = this.f10273d;
            boolean zK4 = jVar2.K(aVar6);
            Object objG4 = jVar2.g();
            if (zK4 || objG4 == c0321a) {
                objG4 = new eh.a() { // from class: f9.i1
                    @Override // eh.a
                    public final Object invoke() {
                        List<String> list = d1.f9265a;
                        n1Var.setValue(Boolean.FALSE);
                        aVar6.invoke();
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG4);
            }
            jVar2.B();
            d1.s(dVarB, strC4, 0L, (eh.a) objG4, jVar2, 0, 4);
            w1.d dVarA4 = r0.t0.a();
            String strC5 = f3.q.c(R.string.editor_html_validate, jVar2);
            jVar2.L(-76776579);
            final eh.a<pg.f0> aVar7 = this.f10274e;
            boolean zK5 = jVar2.K(aVar7);
            Object objG5 = jVar2.g();
            if (zK5 || objG5 == c0321a) {
                objG5 = new eh.a() { // from class: f9.j1
                    @Override // eh.a
                    public final Object invoke() {
                        List<String> list = d1.f9265a;
                        n1Var.setValue(Boolean.FALSE);
                        aVar7.invoke();
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG5);
            }
            jVar2.B();
            d1.s(dVarA4, strC5, 0L, (eh.a) objG5, jVar2, 0, 4);
            x0.j jVar3 = jVar2;
            t0.v2.a(androidx.compose.foundation.layout.f.j(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, jVar3, 6, 6);
            t0.w.b(c.f9147h, this.f10275f, null, c.f9148i, f1.c.b(-1661503512, new l1(this.f10278j), jVar3), false, null, null, jVar3, 27654, 484);
            t0.w.b(c.f9149j, this.f10276g, null, c.f9150k, f1.c.b(-1897904865, new m1(this.f10279k), jVar3), false, null, null, jVar3, 27654, 484);
            f1.b bVar = c.f9151l;
            jVar3.L(-76691509);
            Object objG6 = jVar3.g();
            if (objG6 == c0321a) {
                objG6 = new k1(0);
                jVar3.C(objG6);
            }
            jVar3.B();
            t0.w.b(bVar, (eh.a) objG6, null, c.f9152m, f1.c.b(497145952, new p1(this.f10280l, this.f10282n, this.f10281m), jVar3), false, null, null, jVar3, 27702, 484);
        }
        return pg.f0.f21461a;
    }
}
