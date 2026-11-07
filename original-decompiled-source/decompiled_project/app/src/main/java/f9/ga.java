package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.util.List;
import x0.j;
import x2.p;
import z.b;

/* loaded from: classes.dex */
public final class ga implements eh.q<z.r, x0.j, Integer, pg.f0> {
    public final /* synthetic */ String A;
    public final /* synthetic */ eh.l<String, pg.f0> B;
    public final /* synthetic */ String C;
    public final /* synthetic */ eh.l<String, pg.f0> D;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f9681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f9683c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f9684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f9685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f9686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f9687g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f9688h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f9689j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f9690k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f9691l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f9692m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f9693n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f9694p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9695q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9696r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List<pg.n<String, String>> f9697s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f9698t;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f9699v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f9700w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f9701x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f9702y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ eh.l<String, pg.f0> f9703z;

    /* JADX WARN: Multi-variable type inference failed */
    public ga(eh.l<? super Boolean, pg.f0> lVar, boolean z10, eh.l<? super Boolean, pg.f0> lVar2, boolean z11, eh.l<? super Boolean, pg.f0> lVar3, boolean z12, eh.l<? super Boolean, pg.f0> lVar4, boolean z13, eh.l<? super Boolean, pg.f0> lVar5, boolean z14, boolean z15, eh.l<? super Boolean, pg.f0> lVar6, boolean z16, eh.a<pg.f0> aVar, x0.n1<Boolean> n1Var, x0.n1<Boolean> n1Var2, List<pg.n<String, String>> list, String str, eh.l<? super String, pg.f0> lVar7, String str2, eh.l<? super String, pg.f0> lVar8, String str3, eh.l<? super String, pg.f0> lVar9, String str4, eh.l<? super String, pg.f0> lVar10, String str5, eh.l<? super String, pg.f0> lVar11) {
        this.f9681a = lVar;
        this.f9682b = z10;
        this.f9683c = lVar2;
        this.f9684d = z11;
        this.f9685e = lVar3;
        this.f9686f = z12;
        this.f9687g = lVar4;
        this.f9688h = z13;
        this.f9689j = lVar5;
        this.f9690k = z14;
        this.f9691l = z15;
        this.f9692m = lVar6;
        this.f9693n = z16;
        this.f9694p = aVar;
        this.f9695q = n1Var;
        this.f9696r = n1Var2;
        this.f9697s = list;
        this.f9698t = str;
        this.f9699v = lVar7;
        this.f9700w = str2;
        this.f9701x = lVar8;
        this.f9702y = str3;
        this.f9703z = lVar9;
        this.A = str4;
        this.B = lVar10;
        this.C = str5;
        this.D = lVar11;
    }

    @Override // eh.q
    public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
        long jC;
        long jC2;
        long jC3;
        int i10;
        z.r EditorCard = rVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(EditorCard, "$this$EditorCard");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(EditorCard) ? 4 : 2;
        }
        int i11 = iIntValue;
        if ((i11 & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            String strC = f3.q.c(R.string.editor_section_display, jVar2);
            t2.l0 l0VarC = b3.l.b(jVar2).c();
            x2.p pVar = x2.p.f32029b;
            t0.ff.b(strC, null, b3.l.a(jVar2).a(), 0L, p.a.a(), null, 0L, null, 0L, 0, false, 0, 0, l0VarC, jVar2, 196608, 0, 65498);
            x0.n1<Boolean> n1Var = this.f9696r;
            boolean zBooleanValue = n1Var.getValue().booleanValue();
            jVar2.L(81339080);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new l9(n1Var, 0);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.o3.a(zBooleanValue, (eh.l) objG, null, f1.c.b(-2141752767, new fa(this.f9699v, this.f9698t, this.f9697s, n1Var), jVar2), jVar2, 3120);
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(81374835);
            final eh.l<Boolean, pg.f0> lVar = this.f9681a;
            boolean zK = jVar2.K(lVar);
            final boolean z10 = this.f9682b;
            boolean zC = zK | jVar2.c(z10);
            Object objG2 = jVar2.g();
            if (zC || objG2 == obj) {
                objG2 = new eh.a() { // from class: f9.m9
                    @Override // eh.a
                    public final Object invoke() {
                        lVar.invoke(Boolean.valueOf(!z10));
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG2);
            }
            jVar2.B();
            androidx.compose.ui.d dVarC = androidx.compose.foundation.b.c(dVarD, false, null, null, (eh.a) objG2, 7);
            float f10 = 6;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(dVarC, CropImageView.DEFAULT_ASPECT_RATIO, f10, 1);
            b.j jVar3 = z.b.f34444a;
            f.b bVar = d.a.f14612k;
            z.m1 m1VarA = z.k1.a(jVar3, bVar, jVar2, 48);
            int iC = c9.u1.c(jVar2);
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVarA = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), m1VarA, jVar2);
            ph.v1.j(g.a.e(), a2VarY, jVar2);
            g.a.C0128a c0128aB = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC))) {
                l9.i.a(iC, jVar2, iC, c0128aB);
            }
            ph.v1.j(g.a.d(), dVarC2, jVar2);
            t0.m1.a(this.f9682b, this.f9681a, null, false, null, jVar2, 0, 60);
            z.o1 o1Var = z.o1.f34600a;
            androidx.compose.ui.d dVarA = o1Var.a(aVar, 1.0f);
            b.k kVar = z.b.f34446c;
            f.a aVar2 = d.a.f14614m;
            z.q qVarA = z.o.a(kVar, aVar2, jVar2, 0);
            int iC2 = c9.u1.c(jVar2);
            x0.a2 a2VarY2 = jVar2.y();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarA, jVar2);
            e0.a aVarA2 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA2);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), qVarA, jVar2);
            ph.v1.j(g.a.e(), a2VarY2, jVar2);
            g.a.C0128a c0128aB2 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC2))) {
                l9.i.a(iC2, jVar2, iC2, c0128aB2);
            }
            ph.v1.j(g.a.d(), dVarC3, jVar2);
            t0.ff.b(f3.q.c(R.string.editor_show_header, jVar2), null, b3.l.a(jVar2).a(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).a(), jVar2, 0, 0, 65530);
            t0.ff.b(f3.q.c(R.string.editor_show_header_desc, jVar2), null, b3.l.a(jVar2).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).b(), jVar2, 0, 0, 65530);
            jVar2.H();
            jVar2.H();
            androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(81403833);
            final eh.l<Boolean, pg.f0> lVar2 = this.f9683c;
            boolean zK2 = jVar2.K(lVar2);
            final boolean z11 = this.f9684d;
            boolean zC2 = zK2 | jVar2.c(z11);
            Object objG3 = jVar2.g();
            if (zC2 || objG3 == obj) {
                objG3 = new eh.a() { // from class: f9.n9
                    @Override // eh.a
                    public final Object invoke() {
                        lVar2.invoke(Boolean.valueOf(!z11));
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG3);
            }
            jVar2.B();
            androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD2, false, null, null, (eh.a) objG3, 7), CropImageView.DEFAULT_ASPECT_RATIO, f10, 1);
            z.m1 m1VarA2 = z.k1.a(jVar3, bVar, jVar2, 48);
            int iC3 = c9.u1.c(jVar2);
            x0.a2 a2VarY3 = jVar2.y();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarJ2, jVar2);
            e0.a aVarA3 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA3);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), m1VarA2, jVar2);
            ph.v1.j(g.a.e(), a2VarY3, jVar2);
            g.a.C0128a c0128aB3 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC3))) {
                l9.i.a(iC3, jVar2, iC3, c0128aB3);
            }
            ph.v1.j(g.a.d(), dVarC4, jVar2);
            t0.m1.a(this.f9684d, this.f9683c, null, false, null, jVar2, 0, 60);
            androidx.compose.ui.d dVarA2 = o1Var.a(aVar, 1.0f);
            z.q qVarA2 = z.o.a(kVar, aVar2, jVar2, 0);
            int iC4 = c9.u1.c(jVar2);
            x0.a2 a2VarY4 = jVar2.y();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarA2, jVar2);
            e0.a aVarA4 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA4);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), qVarA2, jVar2);
            ph.v1.j(g.a.e(), a2VarY4, jVar2);
            g.a.C0128a c0128aB4 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC4))) {
                l9.i.a(iC4, jVar2, iC4, c0128aB4);
            }
            ph.v1.j(g.a.d(), dVarC5, jVar2);
            t0.ff.b(f3.q.c(R.string.editor_show_action_bar, jVar2), null, b3.l.a(jVar2).a(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).a(), jVar2, 0, 0, 65530);
            t0.ff.b(f3.q.c(R.string.editor_show_action_bar_desc, jVar2), null, b3.l.a(jVar2).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).b(), jVar2, 0, 0, 65530);
            jVar2.H();
            jVar2.H();
            androidx.compose.ui.d dVarD3 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(81433463);
            final eh.l<Boolean, pg.f0> lVar3 = this.f9685e;
            boolean zK3 = jVar2.K(lVar3);
            final boolean z12 = this.f9686f;
            boolean zC3 = zK3 | jVar2.c(z12);
            Object objG4 = jVar2.g();
            if (zC3 || objG4 == obj) {
                objG4 = new eh.a() { // from class: f9.o9
                    @Override // eh.a
                    public final Object invoke() {
                        lVar3.invoke(Boolean.valueOf(!z12));
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG4);
            }
            jVar2.B();
            androidx.compose.ui.d dVarJ3 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD3, false, null, null, (eh.a) objG4, 7), CropImageView.DEFAULT_ASPECT_RATIO, f10, 1);
            z.m1 m1VarA3 = z.k1.a(jVar3, bVar, jVar2, 48);
            int iC5 = c9.u1.c(jVar2);
            x0.a2 a2VarY5 = jVar2.y();
            androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(dVarJ3, jVar2);
            e0.a aVarA5 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA5);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), m1VarA3, jVar2);
            ph.v1.j(g.a.e(), a2VarY5, jVar2);
            g.a.C0128a c0128aB5 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC5))) {
                l9.i.a(iC5, jVar2, iC5, c0128aB5);
            }
            ph.v1.j(g.a.d(), dVarC6, jVar2);
            t0.m1.a(this.f9686f, this.f9685e, null, false, null, jVar2, 0, 60);
            androidx.compose.ui.d dVarA3 = o1Var.a(aVar, 1.0f);
            z.q qVarA3 = z.o.a(kVar, aVar2, jVar2, 0);
            int iC6 = c9.u1.c(jVar2);
            x0.a2 a2VarY6 = jVar2.y();
            androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(dVarA3, jVar2);
            e0.a aVarA6 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA6);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), qVarA3, jVar2);
            ph.v1.j(g.a.e(), a2VarY6, jVar2);
            g.a.C0128a c0128aB6 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC6))) {
                l9.i.a(iC6, jVar2, iC6, c0128aB6);
            }
            ph.v1.j(g.a.d(), dVarC7, jVar2);
            t0.ff.b(f3.q.c(R.string.editor_keep_screen_on, jVar2), null, b3.l.a(jVar2).a(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).a(), jVar2, 0, 0, 65530);
            t0.ff.b(f3.q.c(R.string.editor_keep_screen_on_desc, jVar2), null, b3.l.a(jVar2).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).b(), jVar2, 0, 0, 65530);
            jVar2.H();
            jVar2.H();
            final boolean z13 = !z11;
            androidx.compose.ui.d dVarD4 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(81465151);
            final eh.l<Boolean, pg.f0> lVar4 = this.f9687g;
            boolean zK4 = jVar2.K(lVar4);
            final boolean z14 = this.f9688h;
            boolean zC4 = zK4 | jVar2.c(z14);
            Object objG5 = jVar2.g();
            if (zC4 || objG5 == obj) {
                objG5 = new eh.a() { // from class: f9.p9
                    @Override // eh.a
                    public final Object invoke() {
                        lVar4.invoke(Boolean.valueOf(!z14));
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG5);
            }
            jVar2.B();
            androidx.compose.ui.d dVarJ4 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD4, z13, null, null, (eh.a) objG5, 6), CropImageView.DEFAULT_ASPECT_RATIO, f10, 1);
            z.m1 m1VarA4 = z.k1.a(jVar3, bVar, jVar2, 48);
            int iC7 = c9.u1.c(jVar2);
            x0.a2 a2VarY7 = jVar2.y();
            androidx.compose.ui.d dVarC8 = androidx.compose.ui.c.c(dVarJ4, jVar2);
            e0.a aVarA7 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA7);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), m1VarA4, jVar2);
            ph.v1.j(g.a.e(), a2VarY7, jVar2);
            g.a.C0128a c0128aB7 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC7))) {
                l9.i.a(iC7, jVar2, iC7, c0128aB7);
            }
            ph.v1.j(g.a.d(), dVarC8, jVar2);
            boolean z15 = z14 && !z11;
            jVar2.L(1350329539);
            boolean zC5 = jVar2.c(z13) | jVar2.K(lVar4);
            Object objG6 = jVar2.g();
            if (zC5 || objG6 == obj) {
                objG6 = new eh.l() { // from class: f9.q9
                    @Override // eh.l
                    public final Object invoke(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        bool.booleanValue();
                        if (z13) {
                            lVar4.invoke(bool);
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG6);
            }
            jVar2.B();
            t0.m1.a(z15, (eh.l) objG6, null, z13, null, jVar2, 0, 52);
            androidx.compose.ui.d dVarA4 = o1Var.a(aVar, 1.0f);
            z.q qVarA4 = z.o.a(kVar, aVar2, jVar2, 0);
            int iC8 = c9.u1.c(jVar2);
            x0.a2 a2VarY8 = jVar2.y();
            androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(dVarA4, jVar2);
            e0.a aVarA8 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA8);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), qVarA4, jVar2);
            ph.v1.j(g.a.e(), a2VarY8, jVar2);
            g.a.C0128a c0128aB8 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC8))) {
                l9.i.a(iC8, jVar2, iC8, c0128aB8);
            }
            ph.v1.j(g.a.d(), dVarC9, jVar2);
            String strC2 = f3.q.c(R.string.editor_show_camera_cutout, jVar2);
            t2.l0 l0VarA = b3.l.b(jVar2).a();
            if (z11) {
                jVar2.L(-208416575);
                jC = q1.b1.c(0.38f, b3.l.a(jVar2).a());
            } else {
                jVar2.L(-208418217);
                jC = b3.l.a(jVar2).a();
            }
            jVar2.B();
            t0.ff.b(strC2, null, jC, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0VarA, jVar2, 0, 0, 65530);
            String strB = z11 ? com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 2129128804, R.string.editor_show_camera_cutout_disabled_hint, jVar2) : com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, 2129245581, R.string.editor_show_camera_cutout_desc, jVar2);
            t2.l0 l0VarB = b3.l.b(jVar2).b();
            if (z11) {
                jVar2.L(-208399552);
                jC2 = q1.b1.c(0.5f, b3.l.a(jVar2).b());
            } else {
                jVar2.L(-208401634);
                jC2 = b3.l.a(jVar2).b();
            }
            jVar2.B();
            t0.ff.b(strB, null, jC2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0VarB, jVar2, 0, 0, 65530);
            jVar2.H();
            jVar2.H();
            androidx.compose.ui.d dVarD5 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(81510933);
            final eh.l<Boolean, pg.f0> lVar5 = this.f9689j;
            boolean zK5 = jVar2.K(lVar5);
            final boolean z16 = this.f9690k;
            boolean zC6 = zK5 | jVar2.c(z16);
            Object objG7 = jVar2.g();
            if (zC6 || objG7 == obj) {
                objG7 = new eh.a() { // from class: f9.r9
                    @Override // eh.a
                    public final Object invoke() {
                        lVar5.invoke(Boolean.valueOf(!z16));
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG7);
            }
            jVar2.B();
            androidx.compose.ui.d dVarJ5 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD5, false, null, null, (eh.a) objG7, 7), CropImageView.DEFAULT_ASPECT_RATIO, f10, 1);
            z.m1 m1VarA5 = z.k1.a(jVar3, bVar, jVar2, 48);
            int iC9 = c9.u1.c(jVar2);
            x0.a2 a2VarY9 = jVar2.y();
            androidx.compose.ui.d dVarC10 = androidx.compose.ui.c.c(dVarJ5, jVar2);
            e0.a aVarA9 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA9);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), m1VarA5, jVar2);
            ph.v1.j(g.a.e(), a2VarY9, jVar2);
            g.a.C0128a c0128aB9 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC9))) {
                l9.i.a(iC9, jVar2, iC9, c0128aB9);
            }
            ph.v1.j(g.a.d(), dVarC10, jVar2);
            t0.m1.a(this.f9690k, this.f9689j, null, false, null, jVar2, 0, 60);
            androidx.compose.ui.d dVarA5 = o1Var.a(aVar, 1.0f);
            z.q qVarA5 = z.o.a(kVar, aVar2, jVar2, 0);
            int iC10 = c9.u1.c(jVar2);
            x0.a2 a2VarY10 = jVar2.y();
            androidx.compose.ui.d dVarC11 = androidx.compose.ui.c.c(dVarA5, jVar2);
            e0.a aVarA10 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA10);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), qVarA5, jVar2);
            ph.v1.j(g.a.e(), a2VarY10, jVar2);
            g.a.C0128a c0128aB10 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC10))) {
                l9.i.a(iC10, jVar2, iC10, c0128aB10);
            }
            ph.v1.j(g.a.d(), dVarC11, jVar2);
            t0.ff.b(f3.q.c(R.string.editor_desktop_mode, jVar2), null, b3.l.a(jVar2).a(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).a(), jVar2, 0, 0, 65530);
            t0.ff.b(f3.q.c(R.string.editor_desktop_mode_desc, jVar2), null, b3.l.a(jVar2).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).b(), jVar2, 0, 0, 65530);
            jVar2.H();
            jVar2.H();
            androidx.compose.ui.d dVarD6 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(81540153);
            final boolean z17 = this.f9691l;
            boolean zC7 = jVar2.c(z17);
            final eh.l<Boolean, pg.f0> lVar6 = this.f9692m;
            boolean zK6 = zC7 | jVar2.K(lVar6);
            final boolean z18 = this.f9693n;
            boolean zC8 = zK6 | jVar2.c(z18);
            final eh.a<pg.f0> aVar3 = this.f9694p;
            boolean zK7 = zC8 | jVar2.K(aVar3);
            Object objG8 = jVar2.g();
            if (zK7 || objG8 == obj) {
                objG8 = new eh.a() { // from class: f9.s9
                    @Override // eh.a
                    public final Object invoke() {
                        if (z17) {
                            lVar6.invoke(Boolean.valueOf(!z18));
                        } else {
                            aVar3.invoke();
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG8);
            }
            jVar2.B();
            androidx.compose.ui.d dVarJ6 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD6, false, null, null, (eh.a) objG8, 7), CropImageView.DEFAULT_ASPECT_RATIO, f10, 1);
            z.m1 m1VarA6 = z.k1.a(jVar3, bVar, jVar2, 48);
            int iC11 = c9.u1.c(jVar2);
            x0.a2 a2VarY11 = jVar2.y();
            androidx.compose.ui.d dVarC12 = androidx.compose.ui.c.c(dVarJ6, jVar2);
            e0.a aVarA11 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA11);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), m1VarA6, jVar2);
            ph.v1.j(g.a.e(), a2VarY11, jVar2);
            g.a.C0128a c0128aB11 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC11))) {
                l9.i.a(iC11, jVar2, iC11, c0128aB11);
            }
            ph.v1.j(g.a.d(), dVarC12, jVar2);
            final boolean z19 = this.f9691l;
            if (!z19) {
                z18 = true;
            }
            jVar2.L(1350405484);
            boolean zC9 = jVar2.c(z19) | jVar2.K(lVar6) | jVar2.K(aVar3);
            Object objG9 = jVar2.g();
            if (zC9 || objG9 == obj) {
                objG9 = new eh.l() { // from class: f9.t9
                    @Override // eh.l
                    public final Object invoke(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        bool.booleanValue();
                        if (z19) {
                            lVar6.invoke(bool);
                        } else {
                            aVar3.invoke();
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG9);
            }
            jVar2.B();
            t0.m1.a(z18, (eh.l) objG9, null, z19, null, jVar2, 0, 52);
            androidx.compose.ui.d dVarA6 = o1Var.a(aVar, 1.0f);
            z.q qVarA6 = z.o.a(kVar, aVar2, jVar2, 0);
            int iC12 = c9.u1.c(jVar2);
            x0.a2 a2VarY12 = jVar2.y();
            androidx.compose.ui.d dVarC13 = androidx.compose.ui.c.c(dVarA6, jVar2);
            e0.a aVarA12 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA12);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), qVarA6, jVar2);
            ph.v1.j(g.a.e(), a2VarY12, jVar2);
            g.a.C0128a c0128aB12 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC12))) {
                l9.i.a(iC12, jVar2, iC12, c0128aB12);
            }
            ph.v1.j(g.a.d(), dVarC13, jVar2);
            String strC3 = f3.q.c(R.string.editor_show_watermark, jVar2);
            t2.l0 l0VarA2 = b3.l.b(jVar2).a();
            if (z19) {
                jVar2.L(-208342441);
                jC3 = b3.l.a(jVar2).a();
            } else {
                jVar2.L(-208340800);
                jC3 = q1.b1.c(0.6f, b3.l.a(jVar2).a());
            }
            jVar2.B();
            t0.ff.b(strC3, null, jC3, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, l0VarA2, jVar2, 0, 0, 65530);
            t0.ff.b(f3.q.c(R.string.editor_show_watermark_desc, jVar2), null, q1.b1.c(z19 ? 1.0f : 0.6f, b3.l.a(jVar2).b()), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).b(), jVar2, 0, 0, 65530);
            jVar2.H();
            jVar2.L(1350431602);
            if (!z19) {
                t0.t4.b(p0.t6.a(), f3.q.c(R.string.premium_required, jVar2), androidx.compose.foundation.layout.g.n(aVar, 18), b3.l.a(jVar2).d(), jVar2, 384, 0);
            }
            jVar2.B();
            jVar2.H();
            t0.v2.a(androidx.compose.foundation.layout.f.j(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, 1), CropImageView.DEFAULT_ASPECT_RATIO, b3.l.a(jVar2).c(), jVar2, 6, 2);
            androidx.compose.ui.d dVarD7 = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
            jVar2.L(81593080);
            x0.n1<Boolean> n1Var2 = this.f9695q;
            boolean zK8 = jVar2.K(n1Var2);
            Object objG10 = jVar2.g();
            if (zK8 || objG10 == obj) {
                i10 = 0;
                objG10 = new u9(n1Var2, 0);
                jVar2.C(objG10);
            } else {
                i10 = 0;
            }
            jVar2.B();
            androidx.compose.ui.d dVarJ7 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.b.c(dVarD7, false, null, null, (eh.a) objG10, 7), CropImageView.DEFAULT_ASPECT_RATIO, 4, 1);
            z.m1 m1VarA7 = z.k1.a(jVar3, bVar, jVar2, 48);
            int iC13 = c9.u1.c(jVar2);
            x0.a2 a2VarY13 = jVar2.y();
            androidx.compose.ui.d dVarC14 = androidx.compose.ui.c.c(dVarJ7, jVar2);
            e0.a aVarA13 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA13);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), m1VarA7, jVar2);
            ph.v1.j(g.a.e(), a2VarY13, jVar2);
            g.a.C0128a c0128aB13 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC13))) {
                l9.i.a(iC13, jVar2, iC13, c0128aB13);
            }
            ph.v1.j(g.a.d(), dVarC14, jVar2);
            androidx.compose.ui.d dVarA7 = o1Var.a(aVar, 1.0f);
            z.q qVarA7 = z.o.a(kVar, aVar2, jVar2, i10);
            int iC14 = c9.u1.c(jVar2);
            x0.a2 a2VarY14 = jVar2.y();
            androidx.compose.ui.d dVarC15 = androidx.compose.ui.c.c(dVarA7, jVar2);
            e0.a aVarA14 = g.a.a();
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVarA14);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.c(), qVarA7, jVar2);
            ph.v1.j(g.a.e(), a2VarY14, jVar2);
            g.a.C0128a c0128aB14 = g.a.b();
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iC14))) {
                l9.i.a(iC14, jVar2, iC14, c0128aB14);
            }
            ph.v1.j(g.a.d(), dVarC15, jVar2);
            t0.ff.b(f3.q.c(R.string.editor_section_advanced, jVar2), null, b3.l.a(jVar2).a(), 0L, p.a.a(), null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).c(), jVar2, 196608, 0, 65498);
            t0.ff.b(f3.q.c(R.string.editor_section_advanced_desc, jVar2), null, b3.l.a(jVar2).b(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, b3.l.b(jVar2).b(), jVar2, 0, 0, 65530);
            jVar2.H();
            t0.t4.b(n1Var2.getValue().booleanValue() ? p0.p3.a() : p0.q3.a(), f3.q.c(R.string.howto_expand_hint, jVar2), null, b3.l.a(jVar2).b(), jVar2, 0, 4);
            jVar2.H();
            androidx.compose.animation.d.b(EditorCard, n1Var2.getValue().booleanValue(), null, null, null, null, f1.c.b(-162423165, new y9(this.f9684d, this.f9700w, this.f9701x, this.f9702y, this.f9703z, this.A, this.B, this.C, this.D), jVar2), jVar2, (i11 & 14) | 1572864, 30);
        }
        return pg.f0.f21461a;
    }
}
