package b9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.text.format.Formatter;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b9.o1;
import c0.b;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.y1;
import t0.dc;
import t0.ff;
import t0.k4;
import t0.md;
import t0.nf;
import t0.of;
import t0.p7;
import t0.s4;
import t0.t4;
import t0.ua;
import t0.w9;
import t0.z9;
import w1.d;
import w1.g;
import x0.j;
import z.b;
import z.x1;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f3959a = q8.o1.b(ProjectKind.PDF).f22292a;

    /* renamed from: b, reason: collision with root package name */
    public static final q1.d1 f3960b;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfReaderScreenKt$GoToPageDialog$1$1", f = "PdfReaderScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o1.c0 f3961a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o1.c0 c0Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f3961a = c0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f3961a, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            o1.c0.b(this.f3961a);
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f3962a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f3963b;

        public b(eh.a<pg.f0> aVar, Integer num) {
            this.f3962a = aVar;
            this.f3963b = num;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(-1584748422);
                eh.a<pg.f0> aVar = this.f3962a;
                boolean zK = jVar2.K(aVar);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new p1(aVar, 0);
                    jVar2.C(objG);
                }
                eh.a aVar2 = (eh.a) objG;
                jVar2.B();
                t0.x0.d(aVar2, null, this.f3963b != null, null, null, null, b9.a.f3694j, jVar2, 805306368, 506);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f3964a;

        public c(eh.a<pg.f0> aVar) {
            this.f3964a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f3964a, null, false, null, null, null, b9.a.f3695k, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Integer f3965a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f3966b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o1.c0 f3967c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f3968d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.n1<y2.c0> f3969e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x0.k1 f3970f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ eh.l<Integer, pg.f0> f3971g;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Integer num, eh.a<pg.f0> aVar, o1.c0 c0Var, int i10, x0.n1<y2.c0> n1Var, x0.k1 k1Var, eh.l<? super Integer, pg.f0> lVar) {
            this.f3965a = num;
            this.f3966b = aVar;
            this.f3967c = c0Var;
            this.f3968d = i10;
            this.f3969e = n1Var;
            this.f3970f = k1Var;
            this.f3971g = lVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                boolean z10 = false;
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, qVarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                final x0.n1<y2.c0> n1Var = this.f3969e;
                y2.c0 value = n1Var.getValue();
                if (n1Var.getValue().f33682a.f27761b.length() > 0 && this.f3965a == null) {
                    z10 = true;
                }
                i0.h2 h2Var = new i0.h2(3, 2, 115);
                jVar2.L(-114812391);
                eh.a<pg.f0> aVar3 = this.f3966b;
                boolean zK = jVar2.K(aVar3);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (zK || objG == c0321a) {
                    objG = new q1(aVar3, 0);
                    jVar2.C(objG);
                }
                jVar2.B();
                i0.g2 g2Var = new i0.g2(null, (eh.l) objG, 61);
                androidx.compose.ui.d dVarA = androidx.compose.ui.focus.b.a(androidx.compose.foundation.layout.g.d(aVar, 1.0f), this.f3967c);
                jVar2.L(-114838267);
                final int i10 = this.f3968d;
                boolean zI = jVar2.i(i10);
                Object objG2 = jVar2.g();
                boolean z11 = z10;
                final x0.k1 k1Var = this.f3970f;
                if (zI || objG2 == c0321a) {
                    objG2 = new eh.l() { // from class: b9.r1
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            y2.c0 value2 = (y2.c0) obj;
                            kotlin.jvm.internal.r.e(value2, "value");
                            String str = value2.f33682a.f27761b;
                            StringBuilder sb = new StringBuilder();
                            int length = str.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                char cCharAt = str.charAt(i11);
                                if (Character.isDigit(cCharAt)) {
                                    sb.append(cCharAt);
                                }
                            }
                            String strB0 = mh.y.b0(6, sb.toString());
                            int length2 = strB0.length();
                            y2.c0 c0VarA = y2.c0.a(value2, strB0, t2.k0.a(length2, length2), 4);
                            q1.d1 d1Var = o1.f3960b;
                            n1Var.setValue(c0VarA);
                            Integer numG = mh.s.g(strB0);
                            if (numG != null) {
                                int iIntValue = numG.intValue();
                                if (1 > iIntValue || iIntValue > i10) {
                                    numG = null;
                                }
                                if (numG != null) {
                                    k1Var.e(numG.intValue());
                                }
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG2);
                }
                jVar2.B();
                w9.b(value, (eh.l) objG2, dVarA, false, null, f1.c.b(2140119722, new v1(i10), jVar2), f1.c.b(-1904746295, new w1(i10), jVar2), z11, null, h2Var, g2Var, true, 0, 0, null, null, jVar2, 0, 12779952, 8144888);
                x0.j jVar3 = jVar2;
                jVar3.L(-114807467);
                if (i10 > 1) {
                    float floatValue = k1Var.getFloatValue();
                    jh.d dVar2 = new jh.d(1.0f, i10);
                    androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    jVar3.L(-114804015);
                    Object objG3 = jVar3.g();
                    if (objG3 == c0321a) {
                        objG3 = new s1(0, k1Var, n1Var);
                        jVar3.C(objG3);
                    }
                    jVar3.B();
                    dc.a(floatValue, (eh.l) objG3, dVarL, false, dVar2, 0, null, null, jVar3, 432, 488);
                    jVar3 = jVar3;
                    androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                    z.m1 m1VarA = z.k1.a(z.b.f34450g, d.a.f14611j, jVar3, 6);
                    int iD2 = jVar3.D();
                    x0.a2 a2VarY2 = jVar3.y();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarD, jVar3);
                    if (jVar3.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar3.r();
                    if (jVar3.m()) {
                        jVar3.w(aVar2);
                    } else {
                        jVar3.z();
                    }
                    ph.v1.j(bVar, m1VarA, jVar3);
                    ph.v1.j(dVar, a2VarY2, jVar3);
                    if (jVar3.m() || !kotlin.jvm.internal.r.a(jVar3.g(), Integer.valueOf(iD2))) {
                        l9.i.a(iD2, jVar3, iD2, c0128a);
                    }
                    ph.v1.j(cVar, dVarC2, jVar3);
                    jVar3.L(1546646007);
                    final eh.l<Integer, pg.f0> lVar = this.f3971g;
                    boolean zK2 = jVar3.K(lVar);
                    Object objG4 = jVar3.g();
                    if (zK2 || objG4 == c0321a) {
                        objG4 = new t1(lVar, 0);
                        jVar3.C(objG4);
                    }
                    jVar3.B();
                    t0.x0.d((eh.a) objG4, null, false, null, null, null, b9.a.f3697m, jVar3, 805306368, 510);
                    jVar3.L(1546649955);
                    boolean zK3 = jVar3.K(lVar) | jVar3.i(i10);
                    Object objG5 = jVar3.g();
                    if (zK3 || objG5 == c0321a) {
                        objG5 = new eh.a() { // from class: b9.u1
                            @Override // eh.a
                            public final Object invoke() {
                                lVar.invoke(Integer.valueOf(i10 - 1));
                                return pg.f0.f21461a;
                            }
                        };
                        jVar3.C(objG5);
                    }
                    jVar3.B();
                    t0.x0.d((eh.a) objG5, null, false, null, null, null, b9.a.f3698n, jVar3, 805306368, 510);
                    jVar3.H();
                }
                jVar3.B();
                jVar3.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3972a;

        public e(String str) {
            this.f3972a = str;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(this.f3972a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w1.d f3973a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f3974b;

        public f(w1.d dVar, long j10) {
            this.f3973a = dVar;
            this.f3974b = j10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(this.f3973a, null, null, this.f3974b, jVar2, 48, 4);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfReaderScreenKt$PageOverviewSheet$1$1", f = "PdfReaderScreen.kt", l = {504}, m = "invokeSuspend")
    public static final class g extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f3975a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0.w0 f3976b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y2 f3977c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f3978d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c0.w0 w0Var, y2 y2Var, x0.n1<Boolean> n1Var, tg.e<? super g> eVar) {
            super(2, eVar);
            this.f3976b = w0Var;
            this.f3977c = y2Var;
            this.f3978d = n1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new g(this.f3976b, this.f3977c, this.f3978d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            int iG;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f3975a;
            if (i10 == 0) {
                pg.q.b(obj);
                q1.d1 d1Var = o1.f3960b;
                int i11 = 0;
                if (!this.f3978d.getValue().booleanValue() && (iG = this.f3977c.f4160d.g()) >= 0) {
                    i11 = iG;
                }
                this.f3975a = 1;
                if (c0.w0.j(this.f3976b, i11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f3979a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0.w0 f3980b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a3 f3981c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y2 f3982d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ eh.l<Integer, pg.f0> f3983e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f3984f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f3985g;

        /* JADX WARN: Multi-variable type inference failed */
        public h(List<Integer> list, c0.w0 w0Var, a3 a3Var, y2 y2Var, eh.l<? super Integer, pg.f0> lVar, Context context, x0.n1<Boolean> n1Var) {
            this.f3979a = list;
            this.f3980b = w0Var;
            this.f3981c = a3Var;
            this.f3982d = y2Var;
            this.f3983e = lVar;
            this.f3984f = context;
            this.f3985g = n1Var;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            e0.a aVar;
            g.a.C0128a c0128a;
            int i10;
            z.r ModalBottomSheet = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(ModalBottomSheet, "$this$ModalBottomSheet");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar2 = d.a.f1143b;
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                b.k kVar = z.b.f34446c;
                z.q qVarA = z.o.a(kVar, d.a.f14614m, jVar2, 0);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, qVarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a2);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                String strC = f3.q.c(R.string.pdf_reader_pages, jVar2);
                x0.e2 e2Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(e2Var)).f26544g;
                x2.p pVar = x2.p.f32032e;
                x0.e2 e2Var2 = t0.f2.f25858a;
                ff.b(strC, null, ((t0.e2) jVar2.f(e2Var2)).f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                jVar2.L(814118444);
                StringBuilder sb = new StringBuilder();
                final y2 y2Var = this.f3982d;
                x0.v1 v1Var = y2Var.f4161e;
                x0.w1 w1Var = y2Var.f4162f;
                sb.append(f3.q.a(R.plurals.pdf_reader_page_count, v1Var.g(), new Object[]{Integer.valueOf(y2Var.f4161e.g())}, jVar2));
                if (w1Var.b() > 0) {
                    sb.append(" · ");
                    sb.append(Formatter.formatShortFileSize(this.f3984f, w1Var.b()));
                }
                String string = sb.toString();
                jVar2.B();
                ff.b(string, null, ((t0.e2) jVar2.f(e2Var2)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(e2Var)).f26548k, jVar2, 0, 0, 65530);
                float f10 = 12;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(aVar2, CropImageView.DEFAULT_ASPECT_RATIO, f10, CropImageView.DEFAULT_ASPECT_RATIO, 4, 5);
                float f11 = 8;
                z.m1 m1VarA = z.k1.a(z.b.h(f11), d.a.f14611j, jVar2, 6);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    aVar = aVar3;
                    jVar2.w(aVar);
                } else {
                    aVar = aVar3;
                    jVar2.z();
                }
                ph.v1.j(bVar, m1VarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    c0128a = c0128a2;
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                } else {
                    c0128a = c0128a2;
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                float f12 = t0.v3.f27221a;
                long j10 = o1.f3959a;
                g.a.C0128a c0128a3 = c0128a;
                ua uaVarA = t0.v3.a(((t0.e2) jVar2.f(e2Var2)).f25773s, q1.b1.c(0.16f, j10), j10, j10, jVar2, 2427);
                x0.n1<Boolean> n1Var = this.f3985g;
                boolean z10 = !n1Var.getValue().booleanValue();
                jVar2.L(-447974920);
                boolean zK = jVar2.K(n1Var);
                Object objG = jVar2.g();
                Object obj = j.a.f31715a;
                if (zK || objG == obj) {
                    i10 = 0;
                    objG = new x1(n1Var, 0);
                    jVar2.C(objG);
                } else {
                    i10 = 0;
                }
                jVar2.B();
                int i11 = i10;
                e0.a aVar4 = aVar;
                t0.d2.b(z10, (eh.a) objG, b9.a.f3691g, null, false, b9.a.f3692h, null, uaVarA, null, null, jVar2, 196992, 3800);
                boolean zBooleanValue = n1Var.getValue().booleanValue();
                jVar2.L(-447962057);
                boolean zK2 = jVar2.K(n1Var);
                Object objG2 = jVar2.g();
                if (zK2 || objG2 == obj) {
                    objG2 = new y1(n1Var, i11);
                    jVar2.C(objG2);
                }
                jVar2.B();
                t0.d2.b(zBooleanValue, (eh.a) objG2, f1.c.b(-614964261, new a2(y2Var), jVar2), null, false, b9.a.f3693i, null, uaVarA, null, null, jVar2, 196992, 3800);
                jVar2.H();
                jVar2.H();
                final List<Integer> list = this.f3979a;
                if (list.isEmpty()) {
                    jVar2.L(-609521475);
                    androidx.compose.ui.d dVarF = d0.h.f(androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), 32, 48));
                    z.q qVarA2 = z.o.a(kVar, d.a.f14615n, jVar2, 48);
                    int iD3 = jVar2.D();
                    x0.a2 a2VarY3 = jVar2.y();
                    androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarF, jVar2);
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar4);
                    } else {
                        jVar2.z();
                    }
                    ph.v1.j(bVar, qVarA2, jVar2);
                    ph.v1.j(dVar, a2VarY3, jVar2);
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                        l9.i.a(iD3, jVar2, iD3, c0128a3);
                    }
                    ph.v1.j(cVar, dVarC3, jVar2);
                    t4.b(r0.f.a(), null, androidx.compose.foundation.layout.g.n(aVar2, 40), ((t0.e2) jVar2.f(e2Var2)).f25773s, jVar2, 432, 0);
                    ff.b(pd.d.a(aVar2, f10, jVar2, R.string.pdf_document_no_bookmarks, jVar2), null, ((t0.e2) jVar2.f(e2Var2)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) jVar2.f(e2Var)).f26548k, jVar2, 0, 0, 65018);
                    jVar2.H();
                    jVar2.B();
                } else {
                    jVar2.L(-608744770);
                    b.a aVar5 = new b.a(96);
                    float f13 = 16;
                    z.g1 g1Var = new z.g1(f13, f11, f13, 24);
                    b.i iVarH = z.b.h(f10);
                    b.i iVarH2 = z.b.h(f13);
                    androidx.compose.ui.d dVarF2 = d0.h.f(androidx.compose.foundation.layout.g.d(aVar2, 1.0f));
                    jVar2.L(118925398);
                    boolean zL = jVar2.l(list);
                    final a3 a3Var = this.f3981c;
                    boolean zL2 = zL | jVar2.l(a3Var) | jVar2.K(y2Var);
                    final eh.l<Integer, pg.f0> lVar = this.f3983e;
                    boolean zK3 = zL2 | jVar2.K(lVar);
                    Object objG3 = jVar2.g();
                    if (zK3 || objG3 == obj) {
                        objG3 = new eh.l() { // from class: b9.z1
                            @Override // eh.l
                            public final Object invoke(Object obj2) {
                                c0.p0 LazyVerticalGrid = (c0.p0) obj2;
                                kotlin.jvm.internal.r.e(LazyVerticalGrid, "$this$LazyVerticalGrid");
                                w0 w0Var = new w0(0);
                                List list2 = list;
                                LazyVerticalGrid.e(list2.size(), new d2(w0Var, list2), new e2(c2.f3772a, list2), new f1.b(699646206, true, new f2(list2, a3Var, y2Var, lVar)));
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG3);
                    }
                    jVar2.B();
                    c0.h.a(aVar5, dVarF2, this.f3980b, g1Var, iVarH2, iVarH, null, false, null, (eh.l) objG3, jVar2, 1769472, 912);
                    jVar2.B();
                }
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfReaderScreenKt$PageThumbnail$bitmap$2$1", f = "PdfReaderScreen.kt", l = {606}, m = "invokeSuspend")
    public static final class i extends vg.i implements eh.p<x0.c2<Bitmap>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f3986a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f3987b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a3 f3988c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f3989d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(a3 a3Var, int i10, tg.e<? super i> eVar) {
            super(2, eVar);
            this.f3988c = a3Var;
            this.f3989d = i10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            i iVar = new i(this.f3988c, this.f3989d, eVar);
            iVar.f3987b = obj;
            return iVar;
        }

        @Override // eh.p
        public final Object invoke(x0.c2<Bitmap> c2Var, tg.e<? super pg.f0> eVar) {
            return ((i) create(c2Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            x0.c2 c2Var;
            Bitmap bitmap;
            x0.c2 c2Var2;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f3986a;
            if (i10 == 0) {
                pg.q.b(obj);
                c2Var = (x0.c2) this.f3987b;
                if (c2Var.getValue() == 0) {
                    a3 a3Var = this.f3988c;
                    if (a3Var != null) {
                        this.f3987b = c2Var;
                        this.f3986a = 1;
                        Object objP = a3Var.p(this.f3989d, this);
                        if (objP == aVar) {
                            return aVar;
                        }
                        c2Var2 = c2Var;
                        obj = objP;
                    } else {
                        bitmap = null;
                        c2Var.setValue(bitmap);
                    }
                }
                return pg.f0.f21461a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2Var2 = (x0.c2) this.f3987b;
            pg.q.b(obj);
            x0.c2 c2Var3 = c2Var2;
            bitmap = (Bitmap) obj;
            c2Var = c2Var3;
            c2Var.setValue(bitmap);
            return pg.f0.f21461a;
        }
    }

    public static final class j implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y2 f3990a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f3991b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f3992c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t0.e2 f3993d;

        public j(y2 y2Var, j0 j0Var, eh.a<pg.f0> aVar, t0.e2 e2Var) {
            this.f3990a = y2Var;
            this.f3991b = j0Var;
            this.f3992c = aVar;
            this.f3993d = e2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            g.a.c cVar;
            boolean z10;
            t0.j4 j4VarC;
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                float f10 = 4;
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar, f10);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar2 = g.a.f13865d;
                ph.v1.j(cVar2, dVarC, jVar2);
                final y2 y2Var = this.f3990a;
                boolean zBooleanValue = ((Boolean) y2Var.f4168l.getValue()).booleanValue();
                x0.v1 v1Var = y2Var.f4161e;
                x0.v1 v1Var2 = y2Var.f4160d;
                w1.d dVarA = zBooleanValue ? r0.k.a() : r0.f0.a();
                w1.d dVarA2 = ((Boolean) y2Var.f4168l.getValue()).booleanValue() ? r0.l.a() : r0.e0.a();
                jVar2.L(923088685);
                final j0 j0Var = this.f3991b;
                boolean zK = jVar2.K(j0Var) | jVar2.K(y2Var);
                Object objG = jVar2.g();
                Object obj = j.a.f31715a;
                if (zK || objG == obj) {
                    objG = new eh.a() { // from class: b9.g2
                        @Override // eh.a
                        public final Object invoke() {
                            j0Var.f3895b.invoke(Integer.valueOf(y2Var.f4160d.g() - 1));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                eh.a aVar3 = (eh.a) objG;
                jVar2.B();
                if (v1Var2.g() > 0) {
                    cVar = cVar2;
                    z10 = true;
                } else {
                    cVar = cVar2;
                    z10 = false;
                }
                w1.d dVar2 = dVarA2;
                g.a.c cVar3 = cVar;
                s4.c(aVar3, null, z10, null, f1.c.b(-438584710, new i2(dVarA), jVar2), jVar2, 196608, 26);
                androidx.compose.ui.d dVarC2 = androidx.compose.foundation.b.c(e1.d.d(aVar, h0.f.a(20)), false, f3.q.c(R.string.pdf_document_go_to_page, jVar2), null, this.f3992c, 5);
                t0.e2 e2Var = this.f3993d;
                long j10 = e2Var.H;
                y1.a aVar4 = q1.y1.f21750a;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.s(androidx.compose.foundation.a.b(dVarC2, j10, aVar4), 84, CropImageView.DEFAULT_ASPECT_RATIO, 2), 14, 10);
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarI, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, l0VarD, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar3, dVarC3, jVar2);
                ff.b(f3.q.d(R.string.pdf_document_page_short, new Object[]{Integer.valueOf(v1Var2.g() + 1), Integer.valueOf(v1Var.g())}, jVar2), null, e2Var.f25771q, 0L, x2.p.f32032e, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26550m, jVar2, 196608, 0, 65498);
                jVar2.H();
                jVar2.L(923120909);
                boolean zK2 = jVar2.K(j0Var) | jVar2.K(y2Var);
                Object objG2 = jVar2.g();
                if (zK2 || objG2 == obj) {
                    objG2 = new h2(0, j0Var, y2Var);
                    jVar2.C(objG2);
                }
                eh.a aVar5 = (eh.a) objG2;
                jVar2.B();
                s4.c(aVar5, null, v1Var2.g() + 1 < v1Var.g(), null, f1.c.b(-679151631, new j2(dVar2), jVar2), jVar2, 196608, 26);
                z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.r(androidx.compose.foundation.layout.f.j(aVar, f10, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1), 24), e2Var.B, aVar4), jVar2, 0);
                s4.c(j0Var.f3896c, null, false, null, f1.c.b(539127986, new k2(((List) y2Var.f4164h.getValue()).contains(Integer.valueOf(v1Var2.g())), e2Var), jVar2), jVar2, 196608, 30);
                b9.m mVar = j0Var.f3897d;
                if (((Boolean) y2Var.f4163g.getValue()).booleanValue()) {
                    jVar2.L(-1447070044);
                    long j11 = o1.f3959a;
                    long jC = q1.b1.c(0.16f, j11);
                    long j12 = q1.b1.f21654h;
                    long jC2 = q1.b1.c(0.38f, j11);
                    t0.e2 e2Var2 = (t0.e2) jVar2.f(t0.f2.f25858a);
                    long j13 = ((q1.b1) jVar2.f(t0.p2.f26666a)).f21656a;
                    t0.j4 j4Var = e2Var2.U;
                    if (j4Var == null) {
                        long j14 = q1.b1.f21653g;
                        j4Var = new t0.j4(j14, j13, j14, q1.b1.c(0.38f, j13));
                        e2Var2.U = j4Var;
                    }
                    j4VarC = j4Var.a(jC, j11, j12, jC2);
                    jVar2.B();
                } else {
                    jVar2.L(923157083);
                    j4VarC = k4.c(jVar2);
                    jVar2.B();
                }
                s4.c(mVar, null, false, j4VarC, f1.c.b(1757407603, new l2(y2Var), jVar2), jVar2, 196608, 22);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class k implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y2 f3994a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t0.e2 f3995b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j0 f3996c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f3997d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f3998e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f3999f;

        public k(y2 y2Var, t0.e2 e2Var, j0 j0Var, eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, eh.a<pg.f0> aVar3) {
            this.f3994a = y2Var;
            this.f3995b = e2Var;
            this.f3996c = j0Var;
            this.f3997d = aVar;
            this.f3998e = aVar2;
            this.f3999f = aVar3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            g.a.C0128a c0128a;
            String strD;
            float f10;
            float fG;
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarG = d0.h.g(aVar);
                b.k kVar = z.b.f34446c;
                f.a aVar2 = d.a.f14614m;
                z.q qVarA = z.o.a(kVar, aVar2, jVar2, 0);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, qVarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a2);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar, 1.0f);
                WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
                float f11 = 4;
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.f(z.y1.a(dVarD, new z.b1(x1.a.c(jVar2).f34677k, hf.a.f12994e)), 64), f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, m1VarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a2);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                j0 j0Var = this.f3996c;
                s4.c(j0Var.f3894a, null, false, null, b9.a.f3685a, jVar2, 196608, 30);
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 36);
                long j10 = o1.f3959a;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarN, q1.b1.c(0.14f, j10), h0.f.a(10));
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD3 = jVar2.D();
                x0.a2 a2VarY3 = jVar2.y();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, l0VarD, jVar2);
                ph.v1.j(dVar, a2VarY3, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                    c0128a = c0128a2;
                    l9.i.a(iD3, jVar2, iD3, c0128a);
                } else {
                    c0128a = c0128a2;
                }
                ph.v1.j(cVar, dVarC3, jVar2);
                t4.b(r0.j0.a(), null, androidx.compose.foundation.layout.g.n(aVar, 20), j10, jVar2, 3504, 0);
                jVar2.H();
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(new LayoutWeightElement(1.0f, true), 12, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                z.q qVarA2 = z.o.a(kVar, aVar2, jVar2, 0);
                int iD4 = jVar2.D();
                x0.a2 a2VarY4 = jVar2.y();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarL, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, qVarA2, jVar2);
                ph.v1.j(dVar, a2VarY4, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                    l9.i.a(iD4, jVar2, iD4, c0128a);
                }
                ph.v1.j(cVar, dVarC4, jVar2);
                y2 y2Var = this.f3994a;
                String strB = y2Var.b();
                x0.x1 x1Var = y2Var.f4159c;
                x0.v1 v1Var = y2Var.f4160d;
                x0.v1 v1Var2 = y2Var.f4161e;
                x0.s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26545h;
                x2.p pVar = x2.p.f32032e;
                t0.e2 e2Var = this.f3995b;
                ff.b(strB, null, e2Var.f25771q, 0L, pVar, null, 0L, null, 0L, 2, false, 1, 0, l0Var, jVar2, 196608, 3120, 55258);
                if (((Boolean) x1Var.getValue()).booleanValue()) {
                    strD = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -962108094, R.string.pdf_reader_failed_short, jVar2);
                } else if (y2Var.a()) {
                    jVar2.L(-962102269);
                    strD = f3.q.d(R.string.pdf_document_page, new Object[]{Integer.valueOf(v1Var.g() + 1), Integer.valueOf(v1Var2.g())}, jVar2);
                    jVar2.B();
                } else {
                    strD = com.google.crypto.tink.shaded.protobuf.t0.b(jVar2, -962105115, R.string.pdf_document_loading, jVar2);
                }
                ff.b(strD, null, e2Var.f25773s, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, ((nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 3072, 57338);
                jVar2.H();
                jVar2.L(142313316);
                if (y2Var.a()) {
                    o1.k(y2Var, j0Var, this.f3997d, this.f3998e, this.f3999f, jVar2, 0);
                }
                jVar2.B();
                jVar2.H();
                if (v1Var2.g() > 0) {
                    f10 = 1.0f;
                    fG = (v1Var.g() + 1.0f) / v1Var2.g();
                } else {
                    f10 = 1.0f;
                    fG = 0.0f;
                }
                x0.r3 r3VarB = s.g.b(fG, null, "readingProgress", jVar2, 3072, 22);
                x0.j jVar3 = jVar2;
                if (y2Var.a()) {
                    jVar3.L(496976405);
                    jVar3.L(154580864);
                    boolean zK = jVar3.K(r3VarB);
                    Object objG = jVar3.g();
                    j.a.C0321a c0321a = j.a.f31715a;
                    if (zK || objG == c0321a) {
                        objG = new o2(r3VarB, 0);
                        jVar3.C(objG);
                    }
                    eh.a aVar4 = (eh.a) objG;
                    jVar3.B();
                    androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, f10), 2);
                    long jC = q1.b1.c(0.4f, e2Var.B);
                    jVar3.L(154588438);
                    Object objG2 = jVar3.g();
                    if (objG2 == c0321a) {
                        objG2 = new p2();
                        jVar3.C(objG2);
                    }
                    jVar3.B();
                    z9.b(aVar4, dVarF, j10, jC, 0, CropImageView.DEFAULT_ASPECT_RATIO, (eh.l) objG2, jVar3, 1573296, 48);
                    jVar3 = jVar3;
                    jVar3.B();
                } else {
                    jVar3.L(496692600);
                    if (((Boolean) x1Var.getValue()).booleanValue()) {
                        jVar3.L(496879561);
                        p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 2), jVar3);
                        jVar3.B();
                    } else {
                        jVar3.L(496725398);
                        z9.c(CropImageView.DEFAULT_ASPECT_RATIO, 0, 438, 24, j10, q1.b1.f21653g, androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar, f10), 2), jVar3);
                        jVar3 = jVar3;
                        jVar3.B();
                    }
                    jVar3.B();
                }
                jVar3.H();
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.PdfReaderScreenKt$RenameDialog$1$1", f = "PdfReaderScreen.kt", l = {}, m = "invokeSuspend")
    public static final class l extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o1.c0 f4000a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(o1.c0 c0Var, tg.e<? super l> eVar) {
            super(2, eVar);
            this.f4000a = c0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new l(this.f4000a, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            o1.c0.b(this.f4000a);
            return pg.f0.f21461a;
        }
    }

    public static final class m implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f4001a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f4002b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1<y2.c0> f4003c;

        public m(eh.l lVar, x0.n1 n1Var, boolean z10) {
            this.f4001a = lVar;
            this.f4002b = z10;
            this.f4003c = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(-552039951);
                eh.l<String, pg.f0> lVar = this.f4001a;
                boolean zK = jVar2.K(lVar);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new q2(0, lVar, this.f4003c);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, this.f4002b, null, null, null, b9.a.f3699o, jVar2, 805306368, 506);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class n implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f4004a;

        public n(eh.a<pg.f0> aVar) {
            this.f4004a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f4004a, null, false, null, null, null, b9.a.f3700p, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class o implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f4005a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f4006b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o1.c0 f4007c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0.n1<y2.c0> f4008d;

        /* JADX WARN: Multi-variable type inference failed */
        public o(boolean z10, eh.l<? super String, pg.f0> lVar, o1.c0 c0Var, x0.n1<y2.c0> n1Var) {
            this.f4005a = z10;
            this.f4006b = lVar;
            this.f4007c = c0Var;
            this.f4008d = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                final x0.n1<y2.c0> n1Var = this.f4008d;
                y2.c0 value = n1Var.getValue();
                i0.h2 h2Var = new i0.h2(0, 7, 119);
                jVar2.L(-552046148);
                final boolean z10 = this.f4005a;
                boolean zC = jVar2.c(z10);
                final eh.l<String, pg.f0> lVar = this.f4006b;
                boolean zK = zC | jVar2.K(lVar);
                Object objG = jVar2.g();
                Object obj = j.a.f31715a;
                if (zK || objG == obj) {
                    objG = new eh.l() { // from class: b9.r2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.l
                        public final Object invoke(Object obj2) {
                            i0.f2 KeyboardActions = (i0.f2) obj2;
                            kotlin.jvm.internal.r.e(KeyboardActions, "$this$KeyboardActions");
                            if (z10) {
                                q1.d1 d1Var = o1.f3960b;
                                lVar.invoke(((y2.c0) n1Var.getValue()).f33682a.f27761b);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                i0.g2 g2Var = new i0.g2((eh.l) objG, null, 62);
                androidx.compose.ui.d dVarA = androidx.compose.ui.focus.b.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), this.f4007c);
                jVar2.L(-552052991);
                Object objG2 = jVar2.g();
                if (objG2 == obj) {
                    objG2 = new s2(n1Var, 0);
                    jVar2.C(objG2);
                }
                jVar2.B();
                w9.b(value, (eh.l) objG2, dVarA, false, null, null, null, false, null, h2Var, g2Var, true, 0, 0, null, null, jVar2, 48, 12779520, 8159224);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class p implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y2 f4009a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f4010b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f4011c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f4012d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f4013e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f4014f;

        public p(y2 y2Var, j0 j0Var, eh.a<pg.f0> aVar, eh.a<pg.f0> aVar2, x0.n1<Boolean> n1Var, x0.n1<Boolean> n1Var2) {
            this.f4009a = y2Var;
            this.f4010b = j0Var;
            this.f4011c = aVar;
            this.f4012d = aVar2;
            this.f4013e = n1Var;
            this.f4014f = n1Var2;
        }

        public static final void a(eh.a aVar, x0.n1 n1Var) {
            q1.d1 d1Var = o1.f3960b;
            n1Var.setValue(Boolean.FALSE);
            aVar.invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            Object obj;
            x0.x1 x1Var;
            x0.x1 x1Var2;
            final x0.n1<Boolean> n1Var;
            final j0 j0Var;
            x0.x1 x1Var3;
            x0.x1 x1Var4;
            float f10;
            float f11;
            float f12;
            x0.j jVar2;
            x0.j jVar3;
            d.a aVar;
            float f13;
            float f14;
            float f15;
            boolean z10;
            x0.j jVar4;
            w1.d dVar;
            char c10;
            boolean z11;
            w1.d dVar2;
            z.r DropdownMenu = rVar;
            x0.j jVar5 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(DropdownMenu, "$this$DropdownMenu");
            if ((iIntValue & 17) == 16 && jVar5.s()) {
                jVar5.v();
            } else {
                jVar5.L(-1178419420);
                y2 y2Var = this.f4009a;
                x0.x1 x1Var5 = y2Var.f4170n;
                x0.x1 x1Var6 = y2Var.f4174r;
                x0.x1 x1Var7 = y2Var.f4172p;
                x0.x1 x1Var8 = y2Var.f4171o;
                x0.x1 x1Var9 = y2Var.f4166j;
                boolean zBooleanValue = ((Boolean) x1Var5.getValue()).booleanValue();
                Object obj2 = j.a.f31715a;
                x0.n1<Boolean> n1Var2 = this.f4013e;
                j0 j0Var2 = this.f4010b;
                if (zBooleanValue) {
                    w1.d dVarA = r0.b.a();
                    String strC = f3.q.c(R.string.menu_convert_to_app, jVar5);
                    long j10 = q8.o1.b(ProjectKind.APK).f22292a;
                    boolean z12 = !((Boolean) x1Var9.getValue()).booleanValue();
                    jVar5.L(-1178412986);
                    boolean zK = jVar5.K(j0Var2);
                    Object objG = jVar5.g();
                    if (zK || objG == obj2) {
                        objG = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.l(1, j0Var2, n1Var2);
                        jVar5.C(objG);
                    }
                    eh.a aVar2 = (eh.a) objG;
                    jVar5.B();
                    x1Var2 = x1Var7;
                    obj = obj2;
                    j0Var = j0Var2;
                    x1Var = x1Var6;
                    n1Var = n1Var2;
                    o1.b(0, 0, j10, aVar2, strC, dVarA, jVar5, z12);
                } else {
                    obj = obj2;
                    x1Var = x1Var6;
                    x1Var2 = x1Var7;
                    n1Var = n1Var2;
                    j0Var = j0Var2;
                }
                jVar5.B();
                jVar5.L(-1178411009);
                if (((Boolean) y2Var.f4173q.getValue()).booleanValue()) {
                    w1.d dVarA2 = r0.w.a();
                    String strC2 = f3.q.c(R.string.pdf_edit_title, jVar5);
                    long j11 = o1.f3959a;
                    boolean z13 = !((Boolean) x1Var9.getValue()).booleanValue();
                    jVar5.L(-1178406466);
                    boolean zK2 = jVar5.K(j0Var);
                    Object objG2 = jVar5.g();
                    if (zK2 || objG2 == obj) {
                        objG2 = new eh.a() { // from class: b9.t2
                            @Override // eh.a
                            public final Object invoke() {
                                o1.p.a(j0Var.f3905l, n1Var);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar5.C(objG2);
                    }
                    jVar5.B();
                    o1.b(384, 0, j11, (eh.a) objG2, strC2, dVarA2, jVar5, z13);
                }
                jVar5.B();
                jVar5.L(-1178404760);
                if (((Boolean) x1Var8.getValue()).booleanValue()) {
                    w1.d dVar3 = r0.v.f23049a;
                    if (dVar3 != null) {
                        x1Var3 = x1Var8;
                        x1Var4 = x1Var9;
                        dVar2 = dVar3;
                        z11 = false;
                        c10 = 41943;
                    } else {
                        d.a aVar3 = new d.a("Rounded.DriveFileRenameOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = w1.m.f31210a;
                        long j12 = q1.b1.f21648b;
                        q1.i2 i2Var = new q1.i2(j12);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new g.f(15.0f, 16.0f));
                        arrayList.add(new g.m(-4.0f, 4.0f));
                        arrayList.add(new g.l(8.0f));
                        arrayList.add(new g.k(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f));
                        arrayList.add(new g.r(CropImageView.DEFAULT_ASPECT_RATIO));
                        arrayList.add(new g.k(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f));
                        arrayList.add(new g.d(15.0f));
                        g.b bVar = g.b.f31130c;
                        arrayList.add(bVar);
                        d.a.a(aVar3, arrayList, 0, i2Var);
                        q1.i2 i2Var2 = new q1.i2(j12);
                        x1Var3 = x1Var8;
                        w1.e eVarA = n0.b.a(12.06f, 7.19f, -8.77f, 8.77f);
                        eVarA.b(3.11f, 16.14f, 3.0f, 16.4f, 3.0f, 16.66f);
                        eVarA.k(19.0f);
                        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        eVarA.e(2.34f);
                        eVarA.c(0.27f, CropImageView.DEFAULT_ASPECT_RATIO, 0.52f, -0.11f, 0.71f, -0.29f);
                        x1Var4 = x1Var9;
                        id.i.b(eVarA, 8.77f, -8.77f, 12.06f, 7.19f);
                        d.a.a(aVar3, eVarA.f31100a, 0, i2Var2);
                        q1.i2 i2Var3 = new q1.i2(j12);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new g.f(18.71f, 8.04f));
                        arrayList2.add(new g.k(0.39f, -0.39f, 0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f));
                        arrayList2.add(new g.m(-2.34f, -2.34f));
                        arrayList2.add(new g.k(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO));
                        arrayList2.add(new g.m(-1.83f, 1.83f));
                        arrayList2.add(new g.m(3.75f, 3.75f));
                        c10 = 41943;
                        arrayList2.add(new g.e(18.71f, 8.04f));
                        arrayList2.add(bVar);
                        z11 = false;
                        d.a.a(aVar3, arrayList2, 0, i2Var3);
                        w1.d dVarB = aVar3.b();
                        r0.v.f23049a = dVarB;
                        dVar2 = dVarB;
                    }
                    String strC3 = f3.q.c(R.string.home_menu_rename, jVar5);
                    jVar5.L(-1178400806);
                    final eh.a<pg.f0> aVar4 = this.f4011c;
                    boolean zK3 = jVar5.K(aVar4);
                    Object objG3 = jVar5.g();
                    if (zK3 || objG3 == obj) {
                        objG3 = new eh.a() { // from class: b9.u2
                            @Override // eh.a
                            public final Object invoke() {
                                o1.p.a(aVar4, n1Var);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar5.C(objG3);
                    }
                    jVar5.B();
                    f10 = 4.0f;
                    o1.b(0, 12, 0L, (eh.a) objG3, strC3, dVar2, jVar5, false);
                } else {
                    x1Var3 = x1Var8;
                    x1Var4 = x1Var9;
                    f10 = 4.0f;
                }
                jVar5.B();
                jVar5.L(-1178399130);
                if (!((Boolean) x1Var2.getValue()).booleanValue() || ((Boolean) x1Var.getValue()).booleanValue()) {
                    f11 = 20.0f;
                    f12 = 6.0f;
                    jVar2 = jVar5;
                } else {
                    w1.d dVar4 = r0.g0.f23020a;
                    if (dVar4 != null) {
                        dVar = dVar4;
                        jVar4 = jVar5;
                    } else {
                        d.a aVar5 = new d.a("Rounded.LibraryAdd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = w1.m.f31210a;
                        jVar4 = jVar5;
                        q1.i2 i2Var4 = new q1.i2(q1.b1.f21648b);
                        w1.e eVarA2 = o0.d.a(3.0f, 6.0f);
                        eVarA2.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, 0.45f, -1.0f, 1.0f);
                        eVarA2.l(13.0f);
                        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        eVarA2.e(13.0f);
                        eVarA2.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
                        eVarA2.j(-0.45f, -1.0f, -1.0f, -1.0f);
                        eVarA2.f(5.0f, 20.0f);
                        eVarA2.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
                        eVarA2.f(f10, 7.0f);
                        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        l9.i.b(eVarA2, 20.0f, 2.0f, 8.0f, 2.0f);
                        eVarA2.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
                        eVarA2.l(12.0f);
                        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        eVarA2.e(12.0f);
                        eVarA2.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                        eVarA2.f(22.0f, f10);
                        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        com.google.android.recaptcha.internal.e.c(eVarA2, 18.0f, 11.0f, -3.0f, 3.0f);
                        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        eVarA2.j(-1.0f, -0.45f, -1.0f, -1.0f);
                        eVarA2.l(-3.0f);
                        eVarA2.e(-3.0f);
                        eVarA2.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
                        eVarA2.j(0.45f, -1.0f, 1.0f, -1.0f);
                        eVarA2.e(3.0f);
                        eVarA2.f(13.0f, 6.0f);
                        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        eVarA2.j(1.0f, 0.45f, 1.0f, 1.0f);
                        eVarA2.l(3.0f);
                        eVarA2.e(3.0f);
                        eVarA2.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.45f, 1.0f, 1.0f);
                        eVarA2.j(-0.45f, 1.0f, -1.0f, 1.0f);
                        eVarA2.a();
                        d.a.a(aVar5, eVarA2.f31100a, 0, i2Var4);
                        w1.d dVarB2 = aVar5.b();
                        r0.g0.f23020a = dVarB2;
                        dVar = dVarB2;
                    }
                    x0.j jVar6 = jVar4;
                    String strC4 = f3.q.c(R.string.pdf_add_to_library, jVar6);
                    long j13 = o1.f3959a;
                    boolean z14 = !((Boolean) x1Var4.getValue()).booleanValue();
                    jVar6.L(-1178392634);
                    boolean zK4 = jVar6.K(j0Var);
                    Object objG4 = jVar6.g();
                    if (zK4 || objG4 == obj) {
                        objG4 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.n(1, j0Var, n1Var);
                        jVar6.C(objG4);
                    }
                    eh.a aVar6 = (eh.a) objG4;
                    jVar6.B();
                    x0.j jVar7 = jVar6;
                    f11 = 20.0f;
                    f12 = 6.0f;
                    o1.b(384, 0, j13, aVar6, strC4, dVar, jVar7, z14);
                    jVar2 = jVar7;
                }
                jVar2.B();
                jVar2.L(-1178390695);
                boolean zBooleanValue2 = ((Boolean) y2Var.f4170n.getValue()).booleanValue();
                d.a aVar7 = d.a.f1143b;
                if (zBooleanValue2 || ((Boolean) x1Var3.getValue()).booleanValue() || (((Boolean) x1Var2.getValue()).booleanValue() && !((Boolean) x1Var.getValue()).booleanValue())) {
                    jVar3 = jVar2;
                    t0.v2.a(androidx.compose.foundation.layout.f.j(aVar7, CropImageView.DEFAULT_ASPECT_RATIO, 4, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, jVar3, 6, 6);
                } else {
                    jVar3 = jVar2;
                }
                jVar3.B();
                w1.d dVarB3 = r0.z.f23055a;
                if (dVarB3 != null) {
                    aVar = aVar7;
                } else {
                    d.a aVar8 = new d.a("Rounded.FindInPage", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = w1.m.f31210a;
                    aVar = aVar7;
                    q1.i2 i2Var5 = new q1.i2(q1.b1.f21648b);
                    w1.e eVar = new w1.e();
                    eVar.h(f11, 19.59f);
                    eVar.k(8.83f);
                    eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
                    eVar.g(-4.83f, -4.83f);
                    eVar.c(-0.37f, -0.38f, -0.88f, -0.59f, -1.41f, -0.59f);
                    eVar.d(f12);
                    eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -1.99f, 0.9f, -1.99f, 2.0f);
                    eVar.f(4.0f, f11);
                    eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
                    eVar.d(18.0f);
                    eVar.c(0.45f, CropImageView.DEFAULT_ASPECT_RATIO, 0.85f, -0.15f, 1.19f, -0.4f);
                    eVar.g(-4.43f, -4.43f);
                    eVar.c(-0.86f, 0.56f, -1.89f, 0.88f, -3.0f, 0.82f);
                    eVar.c(-2.37f, -0.11f, -4.4f, -1.96f, -4.72f, -4.31f);
                    eVar.c(-0.44f, -3.35f, 2.45f, -6.18f, 5.83f, -5.61f);
                    eVar.c(1.95f, 0.33f, 3.57f, 1.85f, 4.0f, 3.78f);
                    eVar.c(0.33f, 1.46f, 0.01f, 2.82f, -0.7f, 3.9f);
                    ji.a.b(eVar, f11, 19.59f, 9.0f, 13.0f);
                    eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                    eVar.j(3.0f, -1.34f, 3.0f, -3.0f);
                    eVar.j(-1.34f, -3.0f, -3.0f, -3.0f);
                    eVar.j(-3.0f, 1.34f, -3.0f, 3.0f);
                    eVar.a();
                    d.a.a(aVar8, eVar.f31100a, 0, i2Var5);
                    dVarB3 = aVar8.b();
                    r0.z.f23055a = dVarB3;
                }
                w1.d dVar5 = dVarB3;
                String strC5 = f3.q.c(R.string.pdf_document_go_to_page, jVar3);
                jVar3.L(-1178382884);
                Object obj3 = this.f4012d;
                boolean zK5 = jVar3.K(obj3);
                Object objG5 = jVar3.g();
                if (zK5 || objG5 == obj) {
                    objG5 = new v2(0, obj3, n1Var);
                    jVar3.C(objG5);
                }
                jVar3.B();
                x0.j jVar8 = jVar3;
                d.a aVar9 = aVar;
                o1.b(0, 12, 0L, (eh.a) objG5, strC5, dVar5, jVar8, false);
                jVar8.L(-1178381719);
                if (this.f4014f.getValue().booleanValue()) {
                    w1.d dVarB4 = r0.w0.f23052a;
                    if (dVarB4 != null) {
                        z10 = false;
                    } else {
                        d.a aVar10 = new d.a("Rounded.ZoomOutMap", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = w1.m.f31210a;
                        q1.i2 i2Var6 = new q1.i2(q1.b1.f21648b);
                        w1.e eVarA3 = p0.m.a(15.85f, 3.85f, 17.3f, 5.3f);
                        eVarA3.g(-2.18f, 2.16f);
                        eVarA3.c(-0.39f, 0.39f, -0.39f, 1.03f, CropImageView.DEFAULT_ASPECT_RATIO, 1.42f);
                        z10 = false;
                        eVarA3.g(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVarA3.c(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVarA3.f(18.7f, 6.7f);
                        eVarA3.g(1.45f, 1.45f);
                        eVarA3.b(20.46f, 8.46f, 21.0f, 8.24f, 21.0f, 7.79f);
                        eVarA3.k(3.5f);
                        eVarA3.b(21.0f, 3.22f, 20.78f, 3.0f, 20.5f, 3.0f);
                        eVarA3.e(-4.29f);
                        eVarA3.b(15.76f, 3.0f, 15.54f, 3.54f, 15.85f, 3.85f);
                        l9.i.b(eVarA3, 3.85f, 8.15f, 5.3f, 6.7f);
                        eVarA3.g(2.16f, 2.18f);
                        eVarA3.c(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVarA3.g(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVarA3.c(0.39f, -0.39f, 0.39f, -1.03f, CropImageView.DEFAULT_ASPECT_RATIO, -1.42f);
                        eVarA3.f(6.7f, 5.3f);
                        eVarA3.g(1.45f, -1.45f);
                        eVarA3.b(8.46f, 3.54f, 8.24f, 3.0f, 7.79f, 3.0f);
                        eVarA3.d(3.5f);
                        eVarA3.b(3.22f, 3.0f, 3.0f, 3.22f, 3.0f, 3.5f);
                        eVarA3.l(4.29f);
                        eVarA3.b(3.0f, 8.24f, 3.54f, 8.46f, 3.85f, 8.15f);
                        l9.i.b(eVarA3, 8.15f, 20.15f, 6.7f, 18.7f);
                        eVarA3.g(2.18f, -2.16f);
                        eVarA3.c(0.39f, -0.39f, 0.39f, -1.03f, CropImageView.DEFAULT_ASPECT_RATIO, -1.42f);
                        eVarA3.g(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVarA3.c(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVarA3.f(5.3f, 17.3f);
                        eVarA3.g(-1.45f, -1.45f);
                        eVarA3.b(3.54f, 15.54f, 3.0f, 15.76f, 3.0f, 16.21f);
                        eVarA3.l(4.29f);
                        eVarA3.b(3.0f, 20.78f, 3.22f, 21.0f, 3.5f, 21.0f);
                        eVarA3.e(4.29f);
                        eVarA3.b(8.24f, 21.0f, 8.46f, 20.46f, 8.15f, 20.15f);
                        l9.i.b(eVarA3, 20.15f, 15.85f, 18.7f, 17.3f);
                        eVarA3.g(-2.16f, -2.18f);
                        eVarA3.c(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVarA3.g(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVarA3.c(-0.39f, 0.39f, -0.39f, 1.03f, CropImageView.DEFAULT_ASPECT_RATIO, 1.42f);
                        eVarA3.g(2.18f, 2.16f);
                        eVarA3.g(-1.45f, 1.45f);
                        eVarA3.b(15.54f, 20.46f, 15.76f, 21.0f, 16.21f, 21.0f);
                        eVarA3.e(4.29f);
                        eVarA3.c(0.28f, CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, -0.22f, 0.5f, -0.5f);
                        eVarA3.l(-4.29f);
                        eVarA3.b(21.0f, 15.76f, 20.46f, 15.54f, 20.15f, 15.85f);
                        eVarA3.a();
                        d.a.a(aVar10, eVarA3.f31100a, 0, i2Var6);
                        dVarB4 = aVar10.b();
                        r0.w0.f23052a = dVarB4;
                    }
                    w1.d dVar6 = dVarB4;
                    String strC6 = f3.q.c(R.string.pdf_document_reset_zoom, jVar8);
                    jVar8.L(-1178378557);
                    boolean zK6 = jVar8.K(j0Var);
                    Object objG6 = jVar8.g();
                    if (zK6 || objG6 == obj) {
                        objG6 = new eh.a() { // from class: b9.w2
                            @Override // eh.a
                            public final Object invoke() {
                                o1.p.a(j0Var.f3899f, n1Var);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar8.C(objG6);
                    }
                    jVar8.B();
                    o1.b(0, 12, 0L, (eh.a) objG6, strC6, dVar6, jVar8, false);
                }
                jVar8.B();
                if (((Boolean) y2Var.f4169m.getValue()).booleanValue()) {
                    t0.v2.a(androidx.compose.foundation.layout.f.j(aVar9, CropImageView.DEFAULT_ASPECT_RATIO, 4, 1), CropImageView.DEFAULT_ASPECT_RATIO, 0L, jVar8, 6, 6);
                    w1.d dVarB5 = r0.q0.f23040a;
                    if (dVarB5 == null) {
                        d.a aVar11 = new d.a("Rounded.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i14 = w1.m.f31210a;
                        q1.i2 i2Var7 = new q1.i2(q1.b1.f21648b);
                        w1.e eVarA4 = o0.d.a(18.0f, 16.08f);
                        eVarA4.c(-0.76f, CropImageView.DEFAULT_ASPECT_RATIO, -1.44f, 0.3f, -1.96f, 0.77f);
                        eVarA4.f(8.91f, 12.7f);
                        eVarA4.c(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
                        eVarA4.j(-0.04f, -0.47f, -0.09f, -0.7f);
                        eVarA4.g(7.05f, -4.11f);
                        eVarA4.c(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
                        eVarA4.c(1.66f, CropImageView.DEFAULT_ASPECT_RATIO, 3.0f, -1.34f, 3.0f, -3.0f);
                        eVarA4.j(-1.34f, -3.0f, -3.0f, -3.0f);
                        eVarA4.j(-3.0f, 1.34f, -3.0f, 3.0f);
                        eVarA4.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
                        eVarA4.f(8.04f, 9.81f);
                        eVarA4.b(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
                        eVarA4.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, 1.34f, -3.0f, 3.0f);
                        eVarA4.j(1.34f, 3.0f, 3.0f, 3.0f);
                        eVarA4.c(0.79f, CropImageView.DEFAULT_ASPECT_RATIO, 1.5f, -0.31f, 2.04f, -0.81f);
                        eVarA4.g(7.12f, 4.16f);
                        eVarA4.c(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                        eVarA4.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
                        eVarA4.j(2.92f, -1.31f, 2.92f, -2.92f);
                        eVarA4.j(-1.31f, -2.92f, -2.92f, -2.92f);
                        eVarA4.a();
                        d.a.a(aVar11, eVarA4.f31100a, 0, i2Var7);
                        dVarB5 = aVar11.b();
                        r0.q0.f23040a = dVarB5;
                    }
                    w1.d dVar7 = dVarB5;
                    String strC7 = f3.q.c(R.string.pdf_document_share, jVar8);
                    jVar8.L(-1178371265);
                    boolean zK7 = jVar8.K(j0Var);
                    Object objG7 = jVar8.g();
                    if (zK7 || objG7 == obj) {
                        objG7 = new x2(j0Var, n1Var, 0);
                        jVar8.C(objG7);
                    }
                    jVar8.B();
                    o1.b(0, 12, 0L, (eh.a) objG7, strC7, dVar7, jVar8, false);
                    w1.d dVarB6 = r0.n0.f23034a;
                    if (dVarB6 != null) {
                        f13 = 1.0f;
                        f14 = 0.45f;
                        f15 = -1.0f;
                    } else {
                        d.a aVar12 = new d.a("Rounded.SaveAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i15 = w1.m.f31210a;
                        q1.i2 i2Var8 = new q1.i2(q1.b1.f21648b);
                        w1.e eVar2 = new w1.e();
                        eVar2.h(19.0f, 13.0f);
                        eVar2.l(5.0f);
                        eVar2.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        eVar2.f(6.0f, 19.0f);
                        eVar2.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
                        eVar2.l(-5.0f);
                        eVar2.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        f13 = 1.0f;
                        f14 = 0.45f;
                        f15 = -1.0f;
                        eVar2.j(-1.0f, 0.45f, -1.0f, 1.0f);
                        eVar2.l(6.0f);
                        eVar2.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        eVar2.e(14.0f);
                        eVar2.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                        eVar2.l(-6.0f);
                        eVar2.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        eVar2.j(-1.0f, 0.45f, -1.0f, 1.0f);
                        l9.y.a(eVar2, 13.0f, 12.67f, 1.88f, -1.88f);
                        eVar2.c(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVar2.c(0.39f, 0.39f, 0.39f, 1.02f, CropImageView.DEFAULT_ASPECT_RATIO, 1.41f);
                        eVar2.g(-3.59f, 3.59f);
                        eVar2.c(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVar2.f(7.7f, 12.2f);
                        eVar2.c(-0.39f, -0.39f, -0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
                        eVar2.c(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVar2.f(11.0f, 12.67f);
                        eVar2.f(11.0f, 4.0f);
                        eVar2.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        eVar2.j(1.0f, 0.45f, 1.0f, 1.0f);
                        eVar2.l(8.67f);
                        eVar2.a();
                        d.a.a(aVar12, eVar2.f31100a, 0, i2Var8);
                        dVarB6 = aVar12.b();
                        r0.n0.f23034a = dVarB6;
                    }
                    w1.d dVar8 = dVarB6;
                    String strC8 = f3.q.c(R.string.pdf_document_save, jVar8);
                    jVar8.L(-1178367394);
                    boolean zK8 = jVar8.K(j0Var);
                    Object objG8 = jVar8.g();
                    if (zK8 || objG8 == obj) {
                        objG8 = new a9.o1(1, j0Var, n1Var);
                        jVar8.C(objG8);
                    }
                    jVar8.B();
                    float f16 = f13;
                    float f17 = f14;
                    o1.b(0, 12, 0L, (eh.a) objG8, strC8, dVar8, jVar8, false);
                    w1.d dVarB7 = r0.l0.f23030a;
                    if (dVarB7 == null) {
                        d.a aVar13 = new d.a("Rounded.Print", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i16 = w1.m.f31210a;
                        q1.i2 i2Var9 = new q1.i2(q1.b1.f21648b);
                        w1.e eVarA5 = p0.m.a(19.0f, 8.0f, 5.0f, 8.0f);
                        eVarA5.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, 1.34f, -3.0f, 3.0f);
                        eVarA5.l(4.0f);
                        eVarA5.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        eVarA5.e(2.0f);
                        eVarA5.l(2.0f);
                        eVarA5.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        eVarA5.e(8.0f);
                        eVarA5.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                        eVarA5.l(-2.0f);
                        eVarA5.e(2.0f);
                        eVarA5.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                        eVarA5.l(-4.0f);
                        eVarA5.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                        l9.i.b(eVarA5, 15.0f, 19.0f, 9.0f, 19.0f);
                        eVarA5.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
                        eVarA5.l(-4.0f);
                        eVarA5.e(8.0f);
                        eVarA5.l(4.0f);
                        eVarA5.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        eVarA5.a();
                        eVarA5.h(19.0f, 12.0f);
                        eVarA5.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
                        eVarA5.j(f17, f15, f16, f15);
                        eVarA5.j(f16, f17, f16, f16);
                        eVarA5.j(-0.45f, f16, f15, f16);
                        l9.i.b(eVarA5, 17.0f, 3.0f, 7.0f, 3.0f);
                        eVarA5.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, 0.45f, -1.0f, 1.0f);
                        eVarA5.l(2.0f);
                        eVarA5.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        eVarA5.e(10.0f);
                        eVarA5.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
                        eVarA5.f(18.0f, 4.0f);
                        eVarA5.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        eVarA5.a();
                        d.a.a(aVar13, eVarA5.f31100a, 0, i2Var9);
                        dVarB7 = aVar13.b();
                        r0.l0.f23030a = dVarB7;
                    }
                    w1.d dVar9 = dVarB7;
                    String strC9 = f3.q.c(R.string.pdf_document_print, jVar8);
                    jVar8.L(-1178363585);
                    boolean zK9 = jVar8.K(j0Var);
                    Object objG9 = jVar8.g();
                    if (zK9 || objG9 == obj) {
                        objG9 = new a9.p1(1, j0Var, n1Var);
                        jVar8.C(objG9);
                    }
                    jVar8.B();
                    o1.b(0, 12, 0L, (eh.a) objG9, strC9, dVar9, jVar8, false);
                }
            }
            return pg.f0.f21461a;
        }
    }

    static {
        float[] fArr = {-1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 255.0f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 255.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, CropImageView.DEFAULT_ASPECT_RATIO, 255.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO};
        q1.d1 d1Var = new q1.d1(new ColorMatrixColorFilter(fArr));
        d1Var.f21683b = fArr;
        f3960b = d1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i10, final int i11, final eh.l<? super Integer, pg.f0> lVar, final eh.a<pg.f0> aVar, x0.j jVar, final int i12) {
        x0.k kVar;
        int iIntValue;
        x0.k kVarP = jVar.p(1749952543);
        int i13 = i12 | (kVarP.i(i10) ? 4 : 2) | (kVarP.i(i11) ? 32 : 16) | (kVarP.l(lVar) ? 256 : 128) | (kVarP.l(aVar) ? 2048 : 1024);
        if ((i13 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            int i14 = i10 + 1;
            String strValueOf = String.valueOf(i14);
            kVarP.L(-660659715);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(new y2.c0(strValueOf, t2.k0.a(0, strValueOf.length()), 4));
                kVarP.C(objG);
            }
            x0.n1 n1Var = (x0.n1) objG;
            Object objA = p0.h.a(kVarP, false, -660656632);
            if (objA == c0321a) {
                objA = new x0.u1(i14);
                kVarP.C(objA);
            }
            x0.k1 k1Var = (x0.k1) objA;
            kVarP.T(false);
            Integer numG = mh.s.g(((y2.c0) n1Var.getValue()).f33682a.f27761b);
            if (numG == null || 1 > (iIntValue = numG.intValue()) || iIntValue > i11) {
                numG = null;
            }
            kVarP.L(-660651988);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new o1.c0();
                kVarP.C(objG2);
            }
            o1.c0 c0Var = (o1.c0) objG2;
            kVarP.T(false);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(-660650233);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = new a(c0Var, null);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG3, f0Var, kVarP);
            kVarP.L(-660648881);
            boolean zK = kVarP.K(numG) | ((i13 & 896) == 256);
            Object objG4 = kVarP.g();
            if (zK || objG4 == c0321a) {
                objG4 = new androidx.credentials.playservices.controllers.identityauth.getsigninintent.m(1, numG, lVar);
                kVarP.C(objG4);
            }
            eh.a aVar2 = (eh.a) objG4;
            kVarP.T(false);
            kVar = kVarP;
            t0.r.a(aVar, f1.c.b(-1191207833, new b(aVar2, numG), kVarP), null, f1.c.b(1315889641, new c(aVar), kVarP), null, b9.a.f3696l, f1.c.b(-1365915092, new d(numG, aVar2, c0Var, i11, n1Var, k1Var, lVar), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i13 >> 9) & 14) | 1772592, 0, 16276);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, i11, lVar, aVar, i12) { // from class: b9.s0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f4087a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f4088b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f4089c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f4090d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    o1.a(this.f4087a, this.f4088b, this.f4089c, this.f4090d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final int i10, final int i11, long j10, final eh.a aVar, final String str, final w1.d dVar, x0.j jVar, boolean z10) {
        final long j11;
        final boolean z11;
        int i12;
        boolean z12;
        x0.k kVar;
        x0.k kVarP = jVar.p(-1156303315);
        int i13 = (kVarP.K(dVar) ? 4 : 2) | i10 | (kVarP.K(str) ? 32 : 16);
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                j11 = j10;
                int i14 = kVarP.j(j11) ? 256 : 128;
                i13 |= i14;
            } else {
                j11 = j10;
            }
            i13 |= i14;
        } else {
            j11 = j10;
        }
        int i15 = i11 & 8;
        if (i15 != 0) {
            i12 = i13 | 3072;
            z11 = z10;
        } else {
            z11 = z10;
            i12 = i13 | (kVarP.c(z11) ? 2048 : 1024);
        }
        int i16 = i12 | (kVarP.l(aVar) ? 16384 : 8192);
        if ((i16 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVarP.r0();
            if ((i10 & 1) == 0 || kVarP.a0()) {
                if ((i11 & 4) != 0) {
                    j11 = ((t0.e2) kVarP.f(t0.f2.f25858a)).f25773s;
                    i16 &= -897;
                }
                if (i15 != 0) {
                    z12 = true;
                }
                kVarP.U();
                kVar = kVarP;
                t0.w.b(f1.c.b(-2030711715, new e(str), kVarP), aVar, null, f1.c.b(810789114, new f(dVar, j11), kVarP), null, z12, null, null, kVar, ((i16 >> 9) & 112) | 3078 | ((i16 << 6) & 458752), 468);
                z11 = z12;
            } else {
                kVarP.v();
                if ((i11 & 4) != 0) {
                    i16 &= -897;
                }
            }
            z12 = z11;
            kVarP.U();
            kVar = kVarP;
            t0.w.b(f1.c.b(-2030711715, new e(str), kVarP), aVar, null, f1.c.b(810789114, new f(dVar, j11), kVarP), null, z12, null, null, kVar, ((i16 >> 9) & 112) | 3078 | ((i16 << 6) & 458752), 468);
            z11 = z12;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: b9.h1
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o1.b(f3.i.n(i10 | 1), i11, j11, aVar, str, dVar, (x0.j) obj, z11);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final y2 y2Var, final eh.a<a3> aVar, final eh.l<? super Integer, pg.f0> lVar, final eh.a<pg.f0> aVar2, x0.j jVar, final int i10) {
        List list;
        x0.k kVar;
        x0.k kVarP = jVar.p(-313041836);
        int i11 = i10 | (kVarP.K(y2Var) ? 4 : 2);
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(aVar) ? 32 : 16;
        }
        int i12 = i11 | (kVarP.l(lVar) ? 256 : 128) | (kVarP.l(aVar2) ? 2048 : 1024);
        if ((i12 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            kVarP.L(1717691067);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = (a3) aVar.invoke();
                kVarP.C(objG);
            }
            a3 a3Var = (a3) objG;
            kVarP.T(false);
            Object[] objArr = new Object[0];
            kVarP.L(1717693243);
            Object objG2 = kVarP.g();
            if (objG2 == obj) {
                objG2 = new u0();
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG2, kVarP, 3072, 6);
            if (((Boolean) n1Var.getValue()).booleanValue()) {
                list = (List) y2Var.f4164h.getValue();
            } else {
                int iG = y2Var.f4161e.g();
                ArrayList arrayList = new ArrayList(iG);
                for (int i13 = 0; i13 < iG; i13++) {
                    arrayList.add(Integer.valueOf(i13));
                }
                list = arrayList;
            }
            int iG2 = y2Var.f4160d.g();
            if (iG2 < 0) {
                iG2 = 0;
            }
            c0.w0 w0VarA = c0.e1.a(iG2, 2, kVarP);
            Boolean bool = (Boolean) n1Var.getValue();
            bool.getClass();
            kVarP.L(1717701215);
            boolean zK = kVarP.K(w0VarA) | kVarP.K(n1Var) | ((i12 & 14) == 4);
            Object objG3 = kVarP.g();
            if (zK || objG3 == obj) {
                objG3 = new g(w0VarA, y2Var, n1Var, null);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG3, bool, kVarP);
            p7.a(aVar2, null, p7.f(6, 2, kVarP), CropImageView.DEFAULT_ASPECT_RATIO, null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, f1.c.b(-927176489, new h(list, w0VarA, a3Var, y2Var, lVar, context, n1Var), kVarP), kVarP, (i12 >> 9) & 14, 4058);
            kVar = kVarP;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: b9.v0
                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    o1.c(y2Var, aVar, lVar, aVar2, (x0.j) obj2, f3.i.n(i10 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final int i10, final a3 a3Var, final boolean z10, final boolean z11, final boolean z12, final eh.a<pg.f0> aVar, x0.j jVar, final int i11) {
        x0.n1 n1Var;
        d.a aVar2;
        long j10;
        boolean z13;
        float f10;
        int i12;
        Bitmap bitmap;
        x0.k kVar;
        long j11;
        boolean z14;
        d.a aVar3;
        long j12;
        x0.k kVarP = jVar.p(1886368439);
        int i13 = i11 | (kVarP.i(i10) ? 4 : 2) | (kVarP.l(a3Var) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128) | (kVarP.c(z11) ? 2048 : 1024) | (kVarP.c(z12) ? 16384 : 8192) | (kVarP.l(aVar) ? 131072 : 65536);
        if ((74899 & i13) == 74898 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.e2 e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
            Bitmap bitmap2 = a3Var != null ? a3Var.f3735g.get(Integer.valueOf(i10)) : null;
            Integer numValueOf = Integer.valueOf(i10);
            kVarP.L(-1564852505);
            boolean z15 = ((i13 & 112) == 32 || kVarP.l(a3Var)) | ((i13 & 14) == 4);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (z15 || objG == obj) {
                objG = new i(a3Var, i10, null);
                kVarP.C(objG);
            }
            kVarP.T(false);
            int i14 = i13 << 3;
            x0.n1 n1VarJ = bg.b.j(bitmap2, numValueOf, a3Var, (eh.p) objG, kVarP, (i14 & 112) | 512 | (i14 & 896));
            h0.e eVarA = h0.f.a(10);
            h0.e eVarA2 = h0.f.a(12);
            d.a aVar4 = d.a.f1143b;
            float f11 = 4;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.b.c(e1.d.d(aVar4, eVarA2), false, null, null, aVar, 7), f11);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
            int i15 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar5 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar5);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O) {
                n1Var = n1VarJ;
            } else {
                n1Var = n1VarJ;
                if (!kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, kVarP);
                androidx.compose.ui.d dVarA = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.g.d(aVar4, 1.0f), 0.72f, false);
                float f12 = !z10 ? (float) 2.5d : 1;
                long j13 = f3959a;
                if (z10) {
                    aVar2 = aVar4;
                    j10 = e2Var.B;
                } else {
                    aVar2 = aVar4;
                    j10 = j13;
                }
                androidx.compose.ui.d dVarA2 = t.o.a(dVarA, f12, j10, eVarA);
                if (z10) {
                    z13 = true;
                    f10 = 1;
                } else {
                    f10 = 3;
                    z13 = true;
                }
                androidx.compose.ui.d dVarD = e1.d.d(androidx.compose.foundation.layout.f.h(dVarA2, f10), h0.f.a(8));
                long j14 = e2Var.H;
                long j15 = e2Var.f25773s;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD, j14, q1.y1.f21750a);
                g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
                i12 = kVarP.P;
                x0.a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.z();
                } else {
                    kVarP.w(aVar5);
                }
                ph.v1.j(bVar, l0VarD, kVarP);
                ph.v1.j(dVar, a2VarP2, kVarP);
                if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                }
                ph.v1.j(cVar, dVarC2, kVarP);
                bitmap = (Bitmap) n1Var.getValue();
                if (bitmap == null) {
                    kVarP.L(965104093);
                    kVarP.L(-1077244849);
                    boolean zK = kVarP.K(bitmap);
                    Object objG2 = kVarP.g();
                    if (zK || objG2 == obj) {
                        objG2 = new q1.e0(bitmap);
                        kVarP.C(objG2);
                    }
                    q1.n1 n1Var2 = (q1.n1) objG2;
                    z14 = false;
                    kVarP.T(false);
                    j11 = j15;
                    t.t0.b(n1Var2, null, androidx.compose.foundation.layout.g.f976c, z12 ? f3960b : null, kVarP, 25008, 168);
                    kVar = kVarP;
                    kVar.T(false);
                } else {
                    kVar = kVarP;
                    j11 = j15;
                    z14 = false;
                    kVar.L(965451789);
                    t4.b(r0.j0.a(), null, null, q1.b1.c(0.35f, j11), kVar, 48, 4);
                    kVar.T(false);
                }
                kVar.L(-1077229912);
                if (z11) {
                    aVar3 = aVar2;
                    j12 = j13;
                } else {
                    aVar3 = aVar2;
                    j12 = j13;
                    t4.b(r0.g.a(), null, androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.b.f961a.b(aVar3, d.a.f14604c), f11), 20), j12, kVar, 3120, 0);
                }
                kVar.T(z14);
                kVar.T(z13);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar3, 6), kVar);
                x0.k kVar2 = kVar;
                ff.b(String.valueOf(i10 + 1), null, !z10 ? j12 : j11, 0L, !z10 ? x2.p.f32033f : x2.p.f32030c, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVar.f(of.f26647a)).f26551n, kVar2, 0, 0, 65498);
                kVarP = kVar2;
                kVarP.T(z13);
            }
            org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, kVarP);
            androidx.compose.ui.d dVarA3 = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.g.d(aVar4, 1.0f), 0.72f, false);
            if (!z10) {
            }
            long j132 = f3959a;
            if (z10) {
            }
            androidx.compose.ui.d dVarA22 = t.o.a(dVarA3, f12, j10, eVarA);
            if (z10) {
            }
            androidx.compose.ui.d dVarD2 = e1.d.d(androidx.compose.foundation.layout.f.h(dVarA22, f10), h0.f.a(8));
            long j142 = e2Var.H;
            long j152 = e2Var.f25773s;
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(dVarD2, j142, q1.y1.f21750a);
            g2.l0 l0VarD2 = z.g.d(d.a.f14606e, false);
            i12 = kVarP.P;
            x0.a2 a2VarP22 = kVarP.P();
            androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(dVarB2, kVarP);
            kVarP.r();
            if (kVarP.O) {
            }
            ph.v1.j(bVar, l0VarD2, kVarP);
            ph.v1.j(dVar, a2VarP22, kVarP);
            if (!kVarP.O) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                ph.v1.j(cVar2, dVarC22, kVarP);
                bitmap = (Bitmap) n1Var.getValue();
                if (bitmap == null) {
                }
                kVar.L(-1077229912);
                if (z11) {
                }
                kVar.T(z14);
                kVar.T(z13);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar3, 6), kVar);
                x0.k kVar22 = kVar;
                ff.b(String.valueOf(i10 + 1), null, !z10 ? j12 : j11, 0L, !z10 ? x2.p.f32033f : x2.p.f32030c, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVar.f(of.f26647a)).f26551n, kVar22, 0, 0, 65498);
                kVarP = kVar22;
                kVarP.T(z13);
            }
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, a3Var, z10, z11, z12, aVar, i11) { // from class: b9.g1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f3838a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a3 f3839b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f3840c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f3841d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f3842e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f3843f;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(65);
                    o1.d(this.f3838a, this.f3839b, this.f3840c, this.f3841d, this.f3842e, this.f3843f, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v19 */
    public static final void e(final y2 state, final View view, final boolean z10, final eh.a<a3> thumbnails, j0 j0Var, x0.j jVar, final int i10) {
        boolean z11;
        Object obj;
        int i11;
        boolean z12;
        Object obj2;
        final j0 j0Var2;
        boolean z13;
        Object obj3;
        ?? r13;
        boolean z14;
        x0.k kVar;
        int i12;
        j.a.C0321a c0321a;
        int i13;
        int i14;
        ?? r42;
        x0.k kVar2;
        kotlin.jvm.internal.r.e(state, "state");
        kotlin.jvm.internal.r.e(thumbnails, "thumbnails");
        x0.k kVarP = jVar.p(1304097312);
        int i15 = i10 | (kVarP.K(state) ? 4 : 2) | (kVarP.l(view) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128) | (kVarP.l(thumbnails) ? 2048 : 1024) | (kVarP.K(j0Var) ? 16384 : 8192);
        if ((i15 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            j0Var2 = j0Var;
            kVar2 = kVarP;
        } else {
            Object[] objArr = new Object[0];
            kVarP.L(369924645);
            Object objG = kVarP.g();
            j.a.C0321a c0321a2 = j.a.f31715a;
            Object obj4 = objG;
            if (objG == c0321a2) {
                k0 k0Var = new k0();
                kVarP.C(k0Var);
                obj4 = k0Var;
            }
            kVarP.T(false);
            final x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) obj4, kVarP, 3072, 6);
            Object[] objArr2 = new Object[0];
            kVarP.L(369926661);
            Object objG2 = kVarP.g();
            Object obj5 = objG2;
            if (objG2 == c0321a2) {
                n1 n1Var2 = new n1();
                kVarP.C(n1Var2);
                obj5 = n1Var2;
            }
            kVarP.T(false);
            final x0.n1 n1Var3 = (x0.n1) b0.a0.d(objArr2, null, (eh.a) obj5, kVarP, 3072, 6);
            Object[] objArr3 = new Object[0];
            kVarP.L(369928741);
            Object objG3 = kVarP.g();
            Object obj6 = objG3;
            if (objG3 == c0321a2) {
                l0 l0Var = new l0();
                kVarP.C(l0Var);
                obj6 = l0Var;
            }
            kVarP.T(false);
            final x0.n1 n1Var4 = (x0.n1) b0.a0.d(objArr3, null, (eh.a) obj6, kVarP, 3072, 6);
            kVarP.L(369930112);
            int i16 = 57344 & i15;
            boolean z15 = i16 == 16384;
            Object objG4 = kVarP.g();
            Object obj7 = objG4;
            if (z15 || objG4 == c0321a2) {
                m0 m0Var = new m0(j0Var, 0);
                kVarP.C(m0Var);
                obj7 = m0Var;
            }
            kVarP.T(false);
            c.e.a(0, 1, (eh.a) obj7, kVarP, false);
            long jC = c2.n0.c((z10 || ((Boolean) state.f4163g.getValue()).booleanValue()) ? 4280229924L : 4293651953L);
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(fillElement, jC, q1.y1.f21750a);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i17 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i17))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i17, kVarP, i17, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            kVarP.L(-944664481);
            boolean zK = kVarP.K(n1Var);
            Object objG5 = kVarP.g();
            if (zK || objG5 == c0321a2) {
                z11 = false;
                n0 n0Var = new n0(n1Var, 0);
                kVarP.C(n0Var);
                obj = n0Var;
            } else {
                z11 = false;
                obj = objG5;
            }
            eh.a aVar2 = (eh.a) obj;
            kVarP.T(z11);
            kVarP.L(-944662978);
            boolean zK2 = kVarP.K(n1Var3);
            Object objG6 = kVarP.g();
            if (zK2 || objG6 == c0321a2) {
                i11 = i15;
                z12 = false;
                o0 o0Var = new o0(n1Var3, 0);
                kVarP.C(o0Var);
                obj2 = o0Var;
            } else {
                i11 = i15;
                z12 = false;
                obj2 = objG6;
            }
            eh.a aVar3 = (eh.a) obj2;
            kVarP.T(z12);
            kVarP.L(-944661568);
            boolean zK3 = kVarP.K(n1Var4);
            Object objG7 = kVarP.g();
            Object obj8 = objG7;
            if (zK3 || objG7 == c0321a2) {
                androidx.credentials.playservices.controllers.identityauth.getsigninintent.i iVar = new androidx.credentials.playservices.controllers.identityauth.getsigninintent.i(n1Var4, 1);
                kVarP.C(iVar);
                obj8 = iVar;
            }
            kVarP.T(false);
            int i18 = i11 & 14;
            i(state, j0Var, aVar2, aVar3, (eh.a) obj8, kVarP, i18 | ((i11 >> 9) & 112));
            j0Var2 = j0Var;
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(new LayoutWeightElement(1.0f, true), 1.0f);
            WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
            androidx.compose.ui.d dVarA = z.y1.a(dVarD, new z.b1(x1.a.c(kVarP).f34677k, hf.a.f12994e | 32));
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i19 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarA, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar, l0VarD, kVarP);
            ph.v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i19))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i19, kVarP, i19, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            kVarP.L(1229679188);
            boolean zL = kVarP.l(view);
            Object objG8 = kVarP.g();
            if (zL || objG8 == c0321a2) {
                z13 = false;
                p0 p0Var = new p0(view, 0);
                kVarP.C(p0Var);
                obj3 = p0Var;
            } else {
                z13 = false;
                obj3 = objG8;
            }
            kVarP.T(z13);
            androidx.compose.ui.viewinterop.a.b((eh.l) obj3, fillElement, null, kVarP, 48);
            kVarP.L(1229681121);
            if (((Boolean) state.f4159c.getValue()).booleanValue()) {
                r13 = 0;
                h(j0Var2.f3894a, kVarP, 0);
            } else {
                r13 = 0;
            }
            kVarP.T(r13);
            kVarP.L(1229684765);
            boolean zK4 = kVarP.K(n1Var3);
            Object objG9 = kVarP.g();
            Object obj9 = objG9;
            if (zK4 || objG9 == c0321a2) {
                q0 q0Var = new q0(n1Var3, r13);
                kVarP.C(q0Var);
                obj9 = q0Var;
            }
            kVarP.T(r13);
            int i20 = i11 >> 6;
            g(state, j0Var2, (eh.a) obj9, kVarP, ((i11 << 3) & 112) | 6 | (i20 & 896));
            kVarP.T(true);
            kVarP.T(true);
            kVarP.L(369962144);
            if (((Boolean) n1Var.getValue()).booleanValue() && state.a()) {
                kVarP.L(369964768);
                boolean zK5 = (i16 == 16384) | kVarP.K(n1Var);
                Object objG10 = kVarP.g();
                Object obj10 = objG10;
                if (zK5 || objG10 == c0321a2) {
                    eh.l lVar = new eh.l() { // from class: b9.r0
                        @Override // eh.l
                        public final Object invoke(Object obj11) {
                            Integer num = (Integer) obj11;
                            num.getClass();
                            j0Var2.f3895b.invoke(num);
                            n1Var.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(lVar);
                    obj10 = lVar;
                }
                eh.l lVar2 = (eh.l) obj10;
                kVarP.T(false);
                kVarP.L(369967841);
                boolean zK6 = kVarP.K(n1Var);
                Object objG11 = kVarP.g();
                Object obj11 = objG11;
                if (zK6 || objG11 == c0321a2) {
                    t0 t0Var = new t0(n1Var, 0);
                    kVarP.C(t0Var);
                    obj11 = t0Var;
                }
                kVarP.T(false);
                z14 = false;
                c(state, thumbnails, lVar2, (eh.a) obj11, kVarP, (i20 & 112) | i18);
            } else {
                z14 = false;
            }
            kVarP.T(z14);
            kVarP.L(369969090);
            if (((Boolean) n1Var3.getValue()).booleanValue() && state.a()) {
                int iG = state.f4160d.g();
                int iG2 = state.f4161e.g();
                kVarP.L(369971839);
                boolean zK7 = (i16 == 16384) | kVarP.K(n1Var3);
                Object objG12 = kVarP.g();
                Object obj12 = objG12;
                if (zK7 || objG12 == c0321a2) {
                    eh.l lVar3 = new eh.l() { // from class: b9.e1
                        @Override // eh.l
                        public final Object invoke(Object obj13) {
                            Integer num = (Integer) obj13;
                            num.getClass();
                            j0Var2.f3895b.invoke(num);
                            n1Var3.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(lVar3);
                    obj12 = lVar3;
                }
                eh.l lVar4 = (eh.l) obj12;
                kVarP.T(false);
                kVarP.L(369974880);
                boolean zK8 = kVarP.K(n1Var3);
                Object objG13 = kVarP.g();
                Object obj13 = objG13;
                if (zK8 || objG13 == c0321a2) {
                    i1 i1Var = new i1(n1Var3, 0);
                    kVarP.C(i1Var);
                    obj13 = i1Var;
                }
                eh.a aVar4 = (eh.a) obj13;
                kVarP.T(false);
                i12 = i16;
                x0.j jVar2 = kVarP;
                r42 = 0;
                c0321a = c0321a2;
                i13 = 16384;
                i14 = 1;
                a(iG, iG2, lVar4, aVar4, jVar2, 0);
                kVar = jVar2;
            } else {
                kVar = kVarP;
                i12 = i16;
                c0321a = c0321a2;
                i13 = 16384;
                i14 = 1;
                r42 = 0;
            }
            kVar.T(r42);
            kVar.L(369976073);
            if (((Boolean) n1Var4.getValue()).booleanValue()) {
                String strB = state.b();
                kVar.L(369977983);
                int i21 = (i12 == i13 ? i14 : r42) | (kVar.K(n1Var4) ? 1 : 0);
                Object objG14 = kVar.g();
                Object obj14 = objG14;
                if (i21 != 0 || objG14 == c0321a) {
                    eh.l lVar5 = new eh.l() { // from class: b9.j1
                        @Override // eh.l
                        public final Object invoke(Object obj15) {
                            String name = (String) obj15;
                            kotlin.jvm.internal.r.e(name, "name");
                            j0Var2.f3906m.invoke(name);
                            n1Var4.setValue(Boolean.FALSE);
                            return pg.f0.f21461a;
                        }
                    };
                    kVar.C(lVar5);
                    obj14 = lVar5;
                }
                eh.l lVar6 = (eh.l) obj14;
                kVar.T(r42);
                kVar.L(369981026);
                boolean zK9 = kVar.K(n1Var4);
                Object objG15 = kVar.g();
                Object obj15 = objG15;
                if (zK9 || objG15 == c0321a) {
                    k1 k1Var = new k1(n1Var4, r42);
                    kVar.C(k1Var);
                    obj15 = k1Var;
                }
                kVar.T(r42);
                j(strB, lVar6, (eh.a) obj15, kVar, r42);
            }
            kVar.T(r42);
            String str = (String) state.f4167k.getValue();
            kVar2 = kVar;
            if (str != null) {
                kVar.L(-944622505);
                int i22 = (i12 == i13 ? i14 : r42) | (i18 == 4 ? i14 : r42);
                Object objG16 = kVar.g();
                Object obj16 = objG16;
                if (i22 != 0 || objG16 == c0321a) {
                    eh.a aVar5 = new eh.a() { // from class: b9.l1
                        @Override // eh.a
                        public final Object invoke() {
                            state.f4167k.setValue(null);
                            j0Var2.f3907n.invoke();
                            return pg.f0.f21461a;
                        }
                    };
                    kVar.C(aVar5);
                    obj16 = aVar5;
                }
                eh.a aVar6 = (eh.a) obj16;
                kVar.T(r42);
                kVar.L(-944619675);
                int i23 = i18 == 4 ? i14 : r42;
                Object objG17 = kVar.g();
                Object obj17 = objG17;
                if (i23 != 0 || objG17 == c0321a) {
                    a9.s sVar = new a9.s(state, i14);
                    kVar.C(sVar);
                    obj17 = sVar;
                }
                kVar.T(r42);
                q8.o1.a(str, aVar6, (eh.a) obj17, kVar, r42);
                pg.f0 f0Var = pg.f0.f21461a;
                kVar2 = kVar;
            }
        }
        x0.h2 h2VarV = kVar2.V();
        if (h2VarV != null) {
            final j0 j0Var3 = j0Var2;
            h2VarV.f31703d = new eh.p(view, z10, thumbnails, j0Var3, i10) { // from class: b9.m1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f3940b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f3941c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f3942d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ j0 f3943e;

                @Override // eh.p
                public final Object invoke(Object obj18, Object obj19) {
                    ((Integer) obj19).getClass();
                    int iN = f3.i.n(1);
                    o1.e(this.f3939a, this.f3940b, this.f3941c, this.f3942d, this.f3943e, (x0.j) obj18, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void f(final y2 y2Var, final j0 j0Var, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(163887220);
        if ((((kVarP.K(y2Var) ? 4 : 2) | i10 | (kVarP.K(j0Var) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.e2 e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
            h0.e eVarA = h0.f.a(28);
            md.a(n1.q.a(d.a.f1143b, 10, eVarA), eVarA, e2Var.G, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, a9.d2.a(1, q1.b1.c(0.5f, e2Var.B)), f1.c.b(-1292916295, new j(y2Var, j0Var, aVar, e2Var), kVarP), kVarP, 12582912, 56);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(j0Var, aVar, i10) { // from class: b9.b1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j0 f3757b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f3758c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    o1.f(this.f3756a, this.f3757b, this.f3758c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final y2 y2Var, final j0 j0Var, final eh.a aVar, x0.j jVar, final int i10) {
        int i11;
        x0.k kVarP = jVar.p(-1884608589);
        int i12 = i10 & 6;
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f961a;
        if (i12 == 0) {
            i11 = (kVarP.K(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(y2Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.K(j0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(aVar) ? 2048 : 1024;
        }
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            boolean z10 = y2Var.a() && ((Boolean) y2Var.f4165i.getValue()).booleanValue();
            kVarP.L(693256235);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new w0(0);
                kVarP.C(objG);
            }
            kVarP.T(false);
            s.o2 o2Var = r.w0.f22973a;
            long j10 = 1;
            long j11 = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
            r.v1 v1VarB = new r.v1(new r.p2((r.y1) null, new r.l2(new r.q1((eh.l) objG), s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new f3.m(j11), 1)), (r.j0) null, (r.f2) null, (LinkedHashMap) null, 61)).b(r.w0.c(null, 3));
            kVarP.L(693257931);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new w0(0);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            androidx.compose.animation.d.c(z10, androidx.compose.foundation.layout.f.l(bVar.b(d.a.f1143b, d.a.f14609h), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 20, 7), v1VarB, new r.x1(new r.p2((r.y1) null, new r.l2(new r.s1((eh.l) objG2), s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new f3.m(j11), 1)), (r.j0) null, (r.f2) null, (LinkedHashMap) null, 61)).b(r.w0.d(null, 3)), null, f1.c.b(196169179, new m2(y2Var, j0Var, aVar), kVarP), kVarP, 200064, 16);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: b9.x0
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(i10 | 1);
                    o1.g(y2Var, j0Var, aVar, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void h(final b9.i iVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(2056950811);
        if ((((kVarP.l(iVar) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            float f10 = 24;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.f976c, f10);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int i11 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            md.a(null, h0.f.a(f10), ((t0.e2) kVarP.f(t0.f2.f25858a)).G, 0L, 2, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(1407368636, new n2(iVar), kVarP), kVarP, 12607488, 105);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: b9.z0
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    o1.h(this.f4187a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void i(final y2 y2Var, final j0 j0Var, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, final eh.a<pg.f0> aVar3, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1591952791);
        int i11 = i10 | (kVarP.K(y2Var) ? 4 : 2);
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(j0Var) ? 32 : 16;
        }
        if (((i11 | (kVarP.l(aVar) ? 256 : 128) | (kVarP.l(aVar2) ? 2048 : 1024) | (kVarP.l(aVar3) ? 16384 : 8192)) & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            t0.e2 e2Var = (t0.e2) kVarP.f(t0.f2.f25858a);
            md.a(null, null, e2Var.f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 3, null, f1.c.b(489800988, new k(y2Var, e2Var, j0Var, aVar, aVar2, aVar3), kVarP), kVarP, 12779520, 91);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: b9.a1
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o1.i(y2Var, j0Var, aVar, aVar2, aVar3, (x0.j) obj, f3.i.n(i10 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(final String str, final eh.l<? super String, pg.f0> lVar, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(227844306);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.l(lVar) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVarP.L(1348611373);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(new y2.c0(str, t2.k0.a(0, str.length()), 4));
                kVarP.C(objG);
            }
            x0.n1 n1Var = (x0.n1) objG;
            Object objA = p0.h.a(kVarP, false, 1348614488);
            if (objA == c0321a) {
                objA = new o1.c0();
                kVarP.C(objA);
            }
            o1.c0 c0Var = (o1.c0) objA;
            kVarP.T(false);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(1348616243);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new l(c0Var, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, f0Var, kVarP);
            boolean z10 = !mh.x.A(((y2.c0) n1Var.getValue()).f33682a.f27761b);
            kVar = kVarP;
            t0.r.a(aVar, f1.c.b(-1098329718, new m(lVar, n1Var, z10), kVarP), null, f1.c.b(-680441016, new n(aVar), kVarP), null, b9.a.f3701q, f1.c.b(2093875685, new o(z10, lVar, c0Var, n1Var), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i11 >> 6) & 14) | 1772592, 0, 16276);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, lVar, aVar, i10) { // from class: b9.y0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f4152a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f4153b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f4154c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    o1.j(this.f4152a, this.f4153b, this.f4154c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(final y2 y2Var, final j0 j0Var, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, final eh.a<pg.f0> aVar3, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVar2;
        x0.k kVarP = jVar.p(-589006471);
        int i11 = i10 | (kVarP.K(y2Var) ? 4 : 2) | (kVarP.K(j0Var) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128) | (kVarP.l(aVar2) ? 2048 : 1024) | (kVarP.l(aVar3) ? 16384 : 8192);
        if ((i11 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            kVar2 = kVarP;
        } else {
            kVarP.L(1473026371);
            if (((Boolean) y2Var.f4173q.getValue()).booleanValue()) {
                d0 d0Var = j0Var.f3905l;
                boolean z10 = !((Boolean) y2Var.f4166j.getValue()).booleanValue();
                long j10 = f3959a;
                s4.b(d0Var, null, z10, null, k4.b(q1.b1.c(0.16f, j10), j10, kVarP, 54), b9.a.f3686b, kVarP, 1572864, 42);
                kVar = kVarP;
            } else {
                kVar = kVarP;
            }
            kVar.T(false);
            x0.k kVar3 = kVar;
            s4.c(aVar, null, false, null, b9.a.f3687c, kVar3, ((i11 >> 6) & 14) | 196608, 30);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i12 = kVar3.P;
            x0.a2 a2VarP = kVar3.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(d.a.f1143b, kVar3);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            kVar3.r();
            if (kVar3.O) {
                kVar3.w(aVar4);
            } else {
                kVar3.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, kVar3);
            ph.v1.j(g.a.f13866e, a2VarP, kVar3);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVar3.O || !kotlin.jvm.internal.r.a(kVar3.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVar3, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVar3);
            kVar3.L(1600091083);
            Object objG = kVar3.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(Boolean.FALSE);
                kVar3.C(objG);
            }
            final x0.n1 n1Var = (x0.n1) objG;
            Object objA = p0.h.a(kVar3, false, 1600092907);
            if (objA == c0321a) {
                objA = bg.b.h(Boolean.FALSE);
                kVar3.C(objA);
            }
            final x0.n1 n1Var2 = (x0.n1) objA;
            kVar3.T(false);
            kVar3.L(1600094996);
            boolean z11 = (i11 & 112) == 32;
            Object objG2 = kVar3.g();
            if (z11 || objG2 == c0321a) {
                objG2 = new eh.a() { // from class: b9.c1
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var2.setValue((Boolean) j0Var.f3898e.invoke());
                        n1Var.setValue(Boolean.TRUE);
                        return pg.f0.f21461a;
                    }
                };
                kVar3.C(objG2);
            }
            kVar3.T(false);
            s4.c((eh.a) objG2, null, false, null, b9.a.f3688d, kVar3, 196608, 30);
            boolean zBooleanValue = ((Boolean) n1Var.getValue()).booleanValue();
            kVar3.L(1600105337);
            Object objG3 = kVar3.g();
            if (objG3 == c0321a) {
                objG3 = new d1(n1Var, 0);
                kVar3.C(objG3);
            }
            kVar3.T(false);
            t0.w.a(zBooleanValue, (eh.a) objG3, null, 0L, null, null, h0.f.a(16), 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(25900260, new p(y2Var, j0Var, aVar3, aVar2, n1Var, n1Var2), kVar3), kVar3, 48, 48, 1980);
            kVar2 = kVar3;
            kVar2.T(true);
        }
        x0.h2 h2VarV = kVar2.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(j0Var, aVar, aVar2, aVar3, i10) { // from class: b9.f1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j0 f3825b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f3826c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f3827d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f3828e;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    o1.k(this.f3824a, this.f3825b, this.f3826c, this.f3827d, this.f3828e, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
