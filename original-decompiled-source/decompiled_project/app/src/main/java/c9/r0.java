package c9;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b9.a3;
import b9.d3;
import c0.b;
import c9.r0;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import j2.c3;
import j2.j2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import q1.i2;
import q1.y1;
import t0.af;
import t0.d2;
import t0.e2;
import t0.f2;
import t0.ff;
import t0.he;
import t0.ie;
import t0.ke;
import t0.md;
import t0.me;
import t0.nf;
import t0.of;
import t0.s4;
import t0.t4;
import t0.tc;
import t0.uc;
import t0.v3;
import t0.w9;
import t0.z9;
import w1.d;
import x0.a2;
import x0.c2;
import x0.h2;
import x0.j;
import x0.s3;
import z.b;
import z.x1;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f5187a = q8.o1.b(ProjectKind.PDF).f22292a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5188b = 0;

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5189a;

        public a(String str) {
            this.f5189a = str;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(aVar, 24, 20);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, jVar2);
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
                ph.v1.j(g.a.f13867f, m1VarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                z9.a(3, 0, 438, 24, r0.f5187a, 0L, androidx.compose.foundation.layout.g.n(aVar, 28), jVar2);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, 16), jVar2);
                ff.b(this.f5189a, null, ((e2) jVar2.f(f2.f25858a)).f25771q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26547j, jVar2, 0, 0, 65530);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f5190a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f5191b;

        public b(String str, boolean z10) {
            this.f5190a = str;
            this.f5191b = z10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(this.f5190a, null, 0L, 0L, this.f5191b ? x2.p.f32032e : x2.p.f32030c, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131038);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w1.d f5192a;

        public c(w1.d dVar) {
            this.f5192a = dVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t4.b(this.f5192a, null, null, 0L, jVar2, 48, 12);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.q<List<? extends ie>, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f5193a;

        public d(int i10) {
            this.f5193a = i10;
        }

        @Override // eh.q
        public final pg.f0 b(List<? extends ie> list, x0.j jVar, Integer num) {
            List<? extends ie> positions = list;
            x0.j jVar2 = jVar;
            num.intValue();
            kotlin.jvm.internal.r.e(positions, "positions");
            ie ieVar = positions.get(this.f5193a);
            c3.a aVar = c3.f14686a;
            me meVar = new me(ieVar);
            ke.f26292a.b(androidx.compose.ui.c.a(d.a.f1143b, aVar, meVar), 3, r0.f5187a, jVar2, 432, 0);
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f5194a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<Integer, pg.f0> f5195b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(int i10, eh.l<? super Integer, pg.f0> lVar) {
            this.f5194a = i10;
            this.f5195b = lVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                int i10 = this.f5194a;
                boolean z10 = i10 == 0;
                w1.d dVarA = r0.c0.a();
                String strC = f3.q.c(R.string.pdf_reader_pages, jVar2);
                jVar2.L(-2041522704);
                eh.l<Integer, pg.f0> lVar = this.f5195b;
                boolean zK = jVar2.K(lVar);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (zK || objG == c0321a) {
                    objG = new b9.x1(lVar, 1);
                    jVar2.C(objG);
                }
                jVar2.B();
                r0.d(z10, dVarA, strC, (eh.a) objG, jVar2, 0);
                boolean z11 = i10 == 1;
                w1.d dVarA2 = r0.u.a();
                String strC2 = f3.q.c(R.string.pdf_edit_tab_markup, jVar2);
                jVar2.L(-2041518479);
                boolean zK2 = jVar2.K(lVar);
                Object objG2 = jVar2.g();
                if (zK2 || objG2 == c0321a) {
                    objG2 = new b9.y1(lVar, 1);
                    jVar2.C(objG2);
                }
                jVar2.B();
                r0.d(z11, dVarA2, strC2, (eh.a) objG2, jVar2, 0);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f5196a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1 f5197b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f5198c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e2 f5199d;

        public f(eh.a<pg.f0> aVar, s1 s1Var, eh.a<pg.f0> aVar2, e2 e2Var) {
            this.f5196a = aVar;
            this.f5197b = s1Var;
            this.f5198c = aVar2;
            this.f5199d = e2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            s1 s1Var;
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarG = d0.h.g(aVar);
                WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
                float f10 = 4;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(z.y1.a(dVarG, new z.b1(x1.a.c(jVar2).f34677k, hf.a.f12994e)), 1.0f), 64), f10, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
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
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, m1VarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                s4.c(this.f5196a, null, false, null, c9.a.f5023e, jVar2, 196608, 30);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                androidx.compose.ui.d dVarL2 = androidx.compose.foundation.layout.f.l(new LayoutWeightElement(1.0f, true), f10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL2, jVar2);
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
                ph.v1.j(bVar, qVarA, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                String strC = f3.q.c(R.string.pdf_edit_title, jVar2);
                s3 s3Var = of.f26647a;
                t2.l0 l0Var = ((nf) jVar2.f(s3Var)).f26545h;
                x2.p pVar = x2.p.f32032e;
                e2 e2Var = this.f5199d;
                boolean z10 = false;
                ff.b(strC, null, e2Var.f25771q, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, jVar2, 196608, 0, 65498);
                s1 s1Var2 = this.f5197b;
                x0.x1 x1Var = s1Var2.f5272d;
                x0.x1 x1Var2 = s1Var2.f5275g;
                ff.b((String) x1Var.getValue(), null, e2Var.f25773s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((nf) jVar2.f(s3Var)).f26549l, jVar2, 0, 3120, 55290);
                jVar2.H();
                jVar2.L(1857070151);
                boolean zL = jVar2.l(s1Var2);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (zL || objG == c0321a) {
                    s1Var = s1Var2;
                    s0 s0Var = new s0(0, s1Var, s1.class, "undo", "undo()V", 0);
                    jVar2.C(s0Var);
                    objG = s0Var;
                } else {
                    s1Var = s1Var2;
                }
                jVar2.B();
                s4.c((eh.a) ((kh.e) objG), null, s1Var.i() && ((Integer) x1Var2.getValue()) == null, null, c9.a.f5024f, jVar2, 196608, 26);
                jVar2.L(1857077543);
                boolean zL2 = jVar2.l(s1Var);
                Object objG2 = jVar2.g();
                if (zL2 || objG2 == c0321a) {
                    t0 t0Var = new t0(0, s1Var, s1.class, "redo", "redo()V", 0);
                    jVar2.C(t0Var);
                    objG2 = t0Var;
                }
                jVar2.B();
                s4.c((eh.a) ((kh.e) objG2), null, s1Var.f5286r.g() >= 0 && !s1Var.f5288t.isEmpty() && ((Integer) x1Var2.getValue()) == null, null, c9.a.f5025g, jVar2, 196608, 26);
                p1.d.b(androidx.compose.foundation.layout.g.r(aVar, f10), jVar2);
                if (s1Var.i() && ((Integer) x1Var2.getValue()) == null) {
                    z10 = true;
                }
                z.g1 g1Var = t0.m0.f26400a;
                t0.x0.a(this.f5198c, null, z10, null, t0.m0.a(r0.f5187a, q1.b1.f21650d, 0L, jVar2, 12), null, null, androidx.compose.foundation.layout.f.c(18, CropImageView.DEFAULT_ASPECT_RATIO, 2), c9.a.f5026h, jVar2, 817889280, 362);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1 f5200a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h1.u<Float> f5201b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.l<pg.n<Float, Float>, pg.f0> f5202c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c9.b f5203d;

        @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorScreenKt$MarkupCanvas$1$1$1", f = "PdfEditorScreen.kt", l = {557, 575}, m = "invokeSuspend")
        public static final class a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public c2.b0 f5204a;

            /* renamed from: b, reason: collision with root package name */
            public String f5205b;

            /* renamed from: c, reason: collision with root package name */
            public int f5206c;

            /* renamed from: d, reason: collision with root package name */
            public int f5207d;

            /* renamed from: e, reason: collision with root package name */
            public int f5208e;

            /* renamed from: f, reason: collision with root package name */
            public int f5209f;

            /* renamed from: g, reason: collision with root package name */
            public /* synthetic */ Object f5210g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ s1 f5211h;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ h1.u<Float> f5212j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ eh.l<pg.n<Float, Float>, pg.f0> f5213k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ c9.b f5214l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(s1 s1Var, h1.u<Float> uVar, eh.l<? super pg.n<Float, Float>, pg.f0> lVar, c9.b bVar, tg.e<? super a> eVar) {
                super(2, eVar);
                this.f5211h = s1Var;
                this.f5212j = uVar;
                this.f5213k = lVar;
                this.f5214l = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
            
                r7 = r2;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x015c A[LOOP:1: B:14:0x0055->B:54:0x015c, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x016f A[EDGE_INSN: B:97:0x016f->B:60:0x016f BREAK  A[LOOP:1: B:14:0x0055->B:54:0x015c], SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final void e(s1 s1Var, c9.b bVar, c2.c cVar, long j10) throws Throwable {
                Object next;
                Throwable th2;
                int i10;
                Object next2;
                float f10;
                float f11;
                Iterator<T> it = s1Var.j().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((c9.b) next).f5057a == bVar.f5057a) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                c9.b bVar2 = (c9.b) next;
                if (bVar2 == null) {
                    return;
                }
                pg.n<Float, Float> nVarG = g(cVar, bVar, j10);
                float fFloatValue = nVarG.f21469a.floatValue();
                float fFloatValue2 = nVarG.f21470b.floatValue();
                List<v1> marks = bVar2.f5063g;
                float f12 = bVar2.f5060d / bVar2.f5061e;
                kotlin.jvm.internal.r.e(marks, "marks");
                float f13 = fFloatValue2 / f12;
                int size = marks.size() - 1;
                int i11 = 0;
                if (size >= 0) {
                    loop1: while (true) {
                        int i12 = size - 1;
                        v1 v1Var = marks.get(size);
                        if (v1Var instanceof c9.e) {
                            c9.e eVar = (c9.e) v1Var;
                            float f14 = (eVar.f5086c / 2) + 0.02f;
                            float[] fArr = eVar.f5084a;
                            if (fArr.length == 2) {
                                float f15 = fArr[i11] - fFloatValue;
                                float f16 = (fArr[1] / f12) - f13;
                                if ((f16 * f16) + (f15 * f15) <= f14 * f14) {
                                    th2 = null;
                                    break;
                                }
                                int i13 = i11;
                                do {
                                    int i14 = i13 + 3;
                                    if (i14 < fArr.length) {
                                        float f17 = fArr[i13];
                                        float f18 = fArr[i13 + 1] / f12;
                                        i13 += 2;
                                        float f19 = fArr[i13] - f17;
                                        float f20 = (fArr[i14] / f12) - f18;
                                        float f21 = (f20 * f20) + (f19 * f19);
                                        th2 = null;
                                        float fL = CropImageView.DEFAULT_ASPECT_RATIO;
                                        if (f21 != CropImageView.DEFAULT_ASPECT_RATIO) {
                                            fL = jh.j.l((((f13 - f18) * f20) + ((fFloatValue - f17) * f19)) / f21, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                                        }
                                        f10 = ((f19 * fL) + f17) - fFloatValue;
                                        f11 = ((fL * f20) + f18) - f13;
                                    } else {
                                        th2 = null;
                                        if (i12 >= 0) {
                                            break;
                                        }
                                        size = i12;
                                        i11 = 0;
                                    }
                                } while ((f11 * f11) + (f10 * f10) > f14 * f14);
                            }
                        } else {
                            th2 = null;
                            if (!(v1Var instanceof z1)) {
                                throw new pg.l();
                            }
                            z1 z1Var = (z1) v1Var;
                            float f22 = z1Var.f5336e;
                            Iterator it2 = mh.x.E(z1Var.f5334c).iterator();
                            if (!it2.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            int length = ((String) it2.next()).length();
                            while (it2.hasNext()) {
                                int length2 = ((String) it2.next()).length();
                                if (length < length2) {
                                    length = length2;
                                }
                            }
                            float f23 = length * f22 * 0.55f;
                            float size2 = r7.size() * f22 * 1.2f;
                            pg.n nVarB = c9.f.b(fFloatValue - z1Var.f5332a, f13 - (z1Var.f5333b / f12), -z1Var.f5337f);
                            float fFloatValue3 = ((Number) nVarB.f21469a).floatValue();
                            float fFloatValue4 = ((Number) nVarB.f21470b).floatValue();
                            if (fFloatValue3 <= f23 + 0.02f && -0.02f <= fFloatValue3 && fFloatValue4 <= size2 + 0.02f && -0.02f <= fFloatValue4) {
                                break;
                            }
                            if (i12 >= 0) {
                            }
                        }
                        if (i10 < 0) {
                            long j11 = bVar.f5057a;
                            Iterator<T> it3 = s1Var.j().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                    if (((c9.b) next2).f5057a == j11) {
                                        break;
                                    }
                                } else {
                                    next2 = th2;
                                    break;
                                }
                            }
                            c9.b bVar3 = (c9.b) next2;
                            if (bVar3 == null) {
                                return;
                            }
                            List<v1> list = bVar3.f5063g;
                            if (i10 < 0 || i10 >= list.size()) {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            int i15 = 0;
                            for (Object obj : list) {
                                int i16 = i15 + 1;
                                if (i15 < 0) {
                                    qg.p.o();
                                    throw th2;
                                }
                                if (i15 != i10) {
                                    arrayList.add(obj);
                                }
                                i15 = i16;
                            }
                            s1Var.q(j11, arrayList);
                            return;
                        }
                        return;
                    }
                }
                th2 = null;
                i10 = -1;
                if (i10 < 0) {
                }
            }

            public static final pg.n<Float, Float> g(c2.c cVar, c9.b bVar, long j10) {
                float fL = jh.j.l(Float.intBitsToFloat((int) (j10 >> 32)) / ((int) (cVar.a() >> 32)), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                float fL2 = jh.j.l(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) / ((int) (BodyPartID.bodyIdMax & cVar.a())), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
                int i10 = ((bVar.f5062f % 360) + 360) % 360;
                return i10 != 90 ? i10 != 180 ? i10 != 270 ? new pg.n<>(Float.valueOf(fL), Float.valueOf(fL2)) : new pg.n<>(Float.valueOf(1.0f - fL2), Float.valueOf(fL)) : new pg.n<>(Float.valueOf(1.0f - fL), Float.valueOf(1.0f - fL2)) : new pg.n<>(Float.valueOf(fL2), Float.valueOf(1.0f - fL));
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                a aVar = new a(this.f5211h, this.f5212j, this.f5213k, this.f5214l, eVar);
                aVar.f5210g = obj;
                return aVar;
            }

            @Override // eh.p
            public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
                return ((a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
            
                if (r10 == r1) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
            
                if (r15 != r1) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
            
                return r1;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Iterable, java.lang.Object] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c3 -> B:30:0x00c6). Please report as a decompilation issue!!! */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                c2.c cVar;
                Object objC;
                String str;
                int i10;
                c2.c cVar2;
                c2.b0 b0Var;
                int i11;
                int i12;
                Object objC1;
                int i13;
                ug.a aVar;
                int i14;
                int i15;
                int i16;
                c9.e eVarR;
                ug.a aVar2 = ug.a.f29706a;
                int i17 = this.f5209f;
                int i18 = 2;
                s1 s1Var = this.f5211h;
                c9.b bVar = this.f5214l;
                h1.u<Float> uVar = this.f5212j;
                int i19 = 1;
                if (i17 == 0) {
                    pg.q.b(obj);
                    cVar = (c2.c) this.f5210g;
                    this.f5210g = cVar;
                    this.f5209f = 1;
                    objC = v.t1.c(cVar, this, 3);
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i11 = this.f5208e;
                        i12 = this.f5207d;
                        i10 = this.f5206c;
                        str = this.f5205b;
                        b0Var = this.f5204a;
                        cVar2 = (c2.c) this.f5210g;
                        pg.q.b(obj);
                        objC1 = obj;
                        c2.r rVar = (c2.r) objC1;
                        int i20 = i18;
                        ?? r42 = rVar.f4687a;
                        Object obj2 = null;
                        if (r42 == 0 || !r42.isEmpty()) {
                            Iterator it = r42.iterator();
                            int i21 = 0;
                            while (it.hasNext()) {
                                if (((c2.b0) it.next()).f4596d && (i21 = i21 + 1) < 0) {
                                    qg.p.n();
                                    throw null;
                                }
                            }
                            i13 = i21;
                        } else {
                            i13 = 0;
                        }
                        if (i13 > i19) {
                            i16 = i12;
                        } else {
                            Iterator it2 = rVar.f4687a.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = aVar2;
                                    i14 = i11;
                                    i15 = i19;
                                    i16 = i12;
                                    break;
                                }
                                Object next = it2.next();
                                i15 = i19;
                                i16 = i12;
                                aVar = aVar2;
                                i14 = i11;
                                if (b0.a0.b(((c2.b0) next).f4593a, b0Var.f4593a)) {
                                    obj2 = next;
                                    break;
                                }
                                i12 = i16;
                                aVar2 = aVar;
                                i19 = i15;
                                i11 = i14;
                            }
                            c2.b0 b0Var2 = (c2.b0) obj2;
                            if (b0Var2 != null) {
                                long j10 = b0Var2.f4595c;
                                if (b0Var2.f4596d) {
                                    i12 = p1.c.c(p1.c.f(j10, b0Var.f4595c)) > cVar2.getViewConfiguration().f() ? i15 : i16;
                                    if (i10 != 0) {
                                        pg.n<Float, Float> nVarG = g(cVar2, bVar, j10);
                                        float fFloatValue = nVarG.f21469a.floatValue();
                                        float fFloatValue2 = nVarG.f21470b.floatValue();
                                        float fFloatValue3 = fFloatValue - uVar.get(uVar.size() - 2).floatValue();
                                        float fFloatValue4 = fFloatValue2 - uVar.get(uVar.size() - 1).floatValue();
                                        if ((fFloatValue4 * fFloatValue4) + (fFloatValue3 * fFloatValue3) > 2.5E-6f) {
                                            uVar.add(new Float(fFloatValue));
                                            uVar.add(new Float(fFloatValue2));
                                        }
                                    } else if (kotlin.jvm.internal.r.a(str, "eraser")) {
                                        e(s1Var, bVar, cVar2, j10);
                                    }
                                    b0Var2.a();
                                    aVar2 = aVar;
                                    i18 = i20;
                                    i19 = i15;
                                    i11 = i14;
                                    this.f5210g = cVar2;
                                    this.f5204a = b0Var;
                                    this.f5205b = str;
                                    this.f5206c = i10;
                                    this.f5207d = i12;
                                    this.f5208e = i11;
                                    this.f5209f = i18;
                                    objC1 = cVar2.C1(c2.t.f4695b, this);
                                }
                            }
                            i19 = i14;
                        }
                        if (i10 != 0 && i19 == 0 && !uVar.isEmpty() && (eVarR = r0.r(s1Var, qg.x.a0(uVar))) != null) {
                            s1Var.g(bVar.f5057a, eVarR);
                        }
                        uVar.clear();
                        if (kotlin.jvm.internal.r.a(str, "text") && i16 == 0 && i19 == 0) {
                            this.f5213k.invoke(g(cVar2, bVar, b0Var.f4595c));
                        }
                        return pg.f0.f21461a;
                    }
                    cVar = (c2.c) this.f5210g;
                    pg.q.b(obj);
                    objC = obj;
                }
                c2.b0 b0Var3 = (c2.b0) objC;
                String str2 = (String) s1Var.f5280l.getValue();
                int i22 = (kotlin.jvm.internal.r.a(str2, "pen") || kotlin.jvm.internal.r.a(str2, "highlighter")) ? 1 : 0;
                uVar.clear();
                if (i22 != 0) {
                    pg.n<Float, Float> nVarG2 = g(cVar, bVar, b0Var3.f4595c);
                    float fFloatValue5 = nVarG2.f21469a.floatValue();
                    float fFloatValue6 = nVarG2.f21470b.floatValue();
                    uVar.add(new Float(fFloatValue5));
                    uVar.add(new Float(fFloatValue6));
                }
                if (kotlin.jvm.internal.r.a(str2, "eraser")) {
                    e(s1Var, bVar, cVar, b0Var3.f4595c);
                }
                b0Var3.a();
                int i23 = i22;
                str = str2;
                i10 = i23;
                cVar2 = cVar;
                b0Var = b0Var3;
                i11 = 0;
                i12 = 0;
                this.f5210g = cVar2;
                this.f5204a = b0Var;
                this.f5205b = str;
                this.f5206c = i10;
                this.f5207d = i12;
                this.f5208e = i11;
                this.f5209f = i18;
                objC1 = cVar2.C1(c2.t.f4695b, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(s1 s1Var, h1.u<Float> uVar, eh.l<? super pg.n<Float, Float>, pg.f0> lVar, c9.b bVar) {
            this.f5200a = s1Var;
            this.f5201b = uVar;
            this.f5202c = lVar;
            this.f5203d = bVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
            Object objC = v.c0.c(j0Var, new a(this.f5200a, this.f5201b, this.f5202c, this.f5203d, null), eVar);
            return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorScreenKt$MarkupCanvas$bitmap$2$1", f = "PdfEditorScreen.kt", l = {545}, m = "invokeSuspend")
    public static final class h extends vg.i implements eh.p<c2<Bitmap>, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5215a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5216b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c9.b f5217c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a3 f5218d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f5219e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(c9.b bVar, a3 a3Var, int i10, tg.e<? super h> eVar) {
            super(2, eVar);
            this.f5217c = bVar;
            this.f5218d = a3Var;
            this.f5219e = i10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            h hVar = new h(this.f5217c, this.f5218d, this.f5219e, eVar);
            hVar.f5216b = obj;
            return hVar;
        }

        @Override // eh.p
        public final Object invoke(c2<Bitmap> c2Var, tg.e<? super pg.f0> eVar) {
            return ((h) create(c2Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            c2 c2Var;
            Bitmap bitmap;
            a3 a3Var;
            c2 c2Var2;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f5215a;
            if (i10 == 0) {
                pg.q.b(obj);
                c2Var = (c2) this.f5216b;
                c9.b bVar = this.f5217c;
                bitmap = null;
                if (bVar.f5058b != -1 && (a3Var = this.f5218d) != null) {
                    int i11 = bVar.f5059c;
                    int i12 = this.f5219e;
                    this.f5216b = c2Var;
                    this.f5215a = 1;
                    Object objE = a3Var.f3734f ? null : ph.h.e(a3Var.f3731c, new d3(a3Var, i11, i12, null), this);
                    if (objE == aVar) {
                        return aVar;
                    }
                    c2Var2 = c2Var;
                    obj = objE;
                }
                c2Var.setValue(bitmap);
                return pg.f0.f21461a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2Var2 = (c2) this.f5216b;
            pg.q.b(obj);
            bitmap = (Bitmap) obj;
            c2Var = c2Var2;
            c2Var.setValue(bitmap);
            return pg.f0.f21461a;
        }
    }

    public static final class i implements eh.q<z.n, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c9.b f5220a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1 f5221b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.n1<pg.n<Float, Float>> f5222c;

        public i(c9.b bVar, s1 s1Var, x0.n1<pg.n<Float, Float>> n1Var) {
            this.f5220a = bVar;
            this.f5221b = s1Var;
            this.f5222c = n1Var;
        }

        @Override // eh.q
        public final pg.f0 b(z.n nVar, x0.j jVar, Integer num) {
            z.n BoxWithConstraints = nVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 6) == 0) {
                iIntValue |= jVar2.K(BoxWithConstraints) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && jVar2.s()) {
                jVar2.v();
            } else {
                c9.b bVar = this.f5220a;
                float f10 = bVar.f5061e;
                float f11 = bVar.f5060d;
                float f12 = bVar.f5062f % 180 == 0 ? f11 / f10 : f10 / f11;
                float fMin = Math.min(BoxWithConstraints.a(), BoxWithConstraints.d() * f12);
                jVar2.L(7091307);
                Object objG = jVar2.g();
                if (objG == j.a.f31715a) {
                    objG = new u0(this.f5222c, 0);
                    jVar2.C(objG);
                }
                jVar2.B();
                r0.g(this.f5221b, this.f5220a, (eh.l) objG, androidx.compose.foundation.layout.g.o(d.a.f1143b, fMin, fMin / f12), jVar2, 448);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class j implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1 f5223a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2 f5224b;

        public j(s1 s1Var, e2 e2Var) {
            this.f5223a = s1Var;
            this.f5224b = e2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x04a1  */
        @Override // eh.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final pg.f0 invoke(x0.j jVar, Integer num) throws Throwable {
            Throwable th2;
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                float f10 = 8;
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(d0.h.f(androidx.compose.foundation.layout.g.d(aVar, 1.0f)), CropImageView.DEFAULT_ASPECT_RATIO, f10, 1);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarJ, jVar2);
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
                g.a.b bVar = g.a.f13867f;
                ph.v1.j(bVar, qVarA, jVar2);
                g.a.d dVar = g.a.f13866e;
                ph.v1.j(dVar, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m()) {
                    th2 = null;
                } else {
                    th2 = null;
                    if (!kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    }
                    g.a.c cVar = g.a.f13865d;
                    ph.v1.j(cVar, dVarC, jVar2);
                    androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(aVar, 1.0f), f10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    z.m1 m1VarA = z.k1.a(z.b.f34449f, d.a.f14611j, jVar2, 6);
                    int iD2 = jVar2.D();
                    a2 a2VarY2 = jVar2.y();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ2, jVar2);
                    if (jVar2.t() != null) {
                        u1.d();
                        throw th2;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar2);
                    } else {
                        jVar2.z();
                    }
                    ph.v1.j(bVar, m1VarA, jVar2);
                    ph.v1.j(dVar, a2VarY2, jVar2);
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                        l9.i.a(iD2, jVar2, iD2, c0128a);
                    }
                    ph.v1.j(cVar, dVarC2, jVar2);
                    w1.d dVarB = r0.r.f23041a;
                    if (dVarB == null) {
                        d.a aVar3 = new d.a("Rounded.Create", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = w1.m.f31210a;
                        i2 i2Var = new i2(q1.b1.f21648b);
                        w1.e eVar = new w1.e();
                        eVar.h(3.0f, 17.46f);
                        eVar.l(3.04f);
                        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
                        eVar.e(3.04f);
                        eVar.c(0.13f, CropImageView.DEFAULT_ASPECT_RATIO, 0.26f, -0.05f, 0.35f, -0.15f);
                        eVar.f(17.81f, 9.94f);
                        eVar.g(-3.75f, -3.75f);
                        eVar.f(3.15f, 17.1f);
                        eVar.c(-0.1f, 0.1f, -0.15f, 0.22f, -0.15f, 0.36f);
                        eVar.a();
                        eVar.h(20.71f, 7.04f);
                        eVar.c(0.39f, -0.39f, 0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
                        eVar.g(-2.34f, -2.34f);
                        eVar.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVar.g(-1.83f, 1.83f);
                        p0.h.b(eVar, 3.75f, 3.75f, 1.83f, -1.83f);
                        d.a.a(aVar3, eVar.f31100a, 0, i2Var);
                        dVarB = aVar3.b();
                        r0.r.f23041a = dVarB;
                    }
                    w1.d dVar2 = dVarB;
                    s1 s1Var = this.f5223a;
                    r0.o(s1Var, "pen", dVar2, R.string.pdf_edit_tool_pen, jVar2, 48);
                    w1.d dVarB2 = r0.h.f23021a;
                    if (dVarB2 == null) {
                        d.a aVar4 = new d.a("Rounded.BorderColor", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = w1.m.f31210a;
                        i2 i2Var2 = new i2(q1.b1.f21648b);
                        w1.e eVar2 = new w1.e();
                        eVar2.h(20.0f, 24.0f);
                        eVar2.d(4.0f);
                        eVar2.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, -0.9f, -2.0f, -2.0f);
                        eVar2.l(CropImageView.DEFAULT_ASPECT_RATIO);
                        eVar2.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
                        eVar2.e(16.0f);
                        eVar2.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, 0.9f, 2.0f, 2.0f);
                        eVar2.l(CropImageView.DEFAULT_ASPECT_RATIO);
                        eVar2.b(22.0f, 23.1f, 21.1f, 24.0f, 20.0f, 24.0f);
                        l9.y.a(eVar2, 13.06f, 5.19f, 3.75f, 3.75f);
                        eVar2.g(-8.77f, 8.77f);
                        eVar2.b(7.86f, 17.9f, 7.6f, 18.0f, 7.34f, 18.0f);
                        eVar2.d(5.0f);
                        eVar2.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
                        eVar2.l(-2.34f);
                        eVar2.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.27f, 0.11f, -0.52f, 0.29f, -0.71f);
                        ji.a.b(eVar2, 13.06f, 5.19f, 17.88f, 7.87f);
                        eVar2.g(-3.75f, -3.75f);
                        eVar2.g(1.83f, -1.83f);
                        eVar2.c(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVar2.g(2.34f, 2.34f);
                        eVar2.c(0.39f, 0.39f, 0.39f, 1.02f, CropImageView.DEFAULT_ASPECT_RATIO, 1.41f);
                        eVar2.f(17.88f, 7.87f);
                        eVar2.a();
                        d.a.a(aVar4, eVar2.f31100a, 0, i2Var2);
                        dVarB2 = aVar4.b();
                        r0.h.f23021a = dVarB2;
                    }
                    r0.o(s1Var, "highlighter", dVarB2, R.string.pdf_edit_tool_highlighter, jVar2, 48);
                    r0.o(s1Var, "text", r0.s0.a(), R.string.pdf_edit_tool_text, jVar2, 48);
                    w1.d dVarB3 = r0.m.f23031a;
                    if (dVarB3 == null) {
                        d.a aVar5 = new d.a("Rounded.CleaningServices", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = w1.m.f31210a;
                        i2 i2Var3 = new i2(q1.b1.f21648b);
                        w1.e eVar3 = new w1.e();
                        eVar3.h(16.0f, 11.0f);
                        eVar3.e(-1.0f);
                        eVar3.k(4.0f);
                        eVar3.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                        eVar3.e(CropImageView.DEFAULT_ASPECT_RATIO);
                        eVar3.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, 1.34f, -3.0f, 3.0f);
                        eVar3.l(7.0f);
                        eVar3.d(8.0f);
                        eVar3.c(-2.76f, CropImageView.DEFAULT_ASPECT_RATIO, -5.0f, 2.24f, -5.0f, 5.0f);
                        eVar3.l(5.0f);
                        eVar3.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        eVar3.e(14.0f);
                        eVar3.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                        eVar3.l(-5.0f);
                        eVar3.b(21.0f, 13.24f, 18.76f, 11.0f, 16.0f, 11.0f);
                        com.google.android.recaptcha.internal.e.c(eVar3, 19.0f, 21.0f, -2.0f, -3.0f);
                        eVar3.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        eVar3.j(-1.0f, 0.45f, -1.0f, 1.0f);
                        eVar3.l(3.0f);
                        eVar3.e(-2.0f);
                        eVar3.l(-3.0f);
                        eVar3.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        eVar3.j(-1.0f, 0.45f, -1.0f, 1.0f);
                        eVar3.l(3.0f);
                        eVar3.d(9.0f);
                        eVar3.l(-3.0f);
                        eVar3.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        eVar3.j(-1.0f, 0.45f, -1.0f, 1.0f);
                        eVar3.l(3.0f);
                        eVar3.d(5.0f);
                        eVar3.l(-5.0f);
                        eVar3.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
                        eVar3.e(8.0f);
                        eVar3.c(1.65f, CropImageView.DEFAULT_ASPECT_RATIO, 3.0f, 1.35f, 3.0f, 3.0f);
                        eVar3.k(21.0f);
                        eVar3.a();
                        d.a.a(aVar5, eVar3.f31100a, 0, i2Var3);
                        dVarB3 = aVar5.b();
                        r0.m.f23031a = dVarB3;
                    }
                    r0.o(s1Var, "eraser", dVarB3, R.string.pdf_edit_tool_eraser, jVar2, 48);
                    jVar2.H();
                    androidx.compose.animation.b.a((String) s1Var.f5280l.getValue(), null, null, null, "toolOptions", null, f1.c.b(-1261996739, new x0(s1Var, this.f5224b), jVar2), jVar2, 1597440);
                    jVar2.H();
                }
                l9.i.a(iD, jVar2, iD, c0128a);
                g.a.c cVar2 = g.a.f13865d;
                ph.v1.j(cVar2, dVarC, jVar2);
                androidx.compose.ui.d dVarJ22 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(aVar, 1.0f), f10, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                z.m1 m1VarA2 = z.k1.a(z.b.f34449f, d.a.f14611j, jVar2, 6);
                int iD22 = jVar2.D();
                a2 a2VarY22 = jVar2.y();
                androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(dVarJ22, jVar2);
                if (jVar2.t() != null) {
                }
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorScreenKt$PagesTab$1$1", f = "PdfEditorScreen.kt", l = {311}, m = "invokeSuspend")
    public static final class k extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5225a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1 f5226b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c0.w0 f5227c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(s1 s1Var, c0.w0 w0Var, tg.e<? super k> eVar) {
            super(2, eVar);
            this.f5226b = s1Var;
            this.f5227c = w0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new k(this.f5226b, this.f5227c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f5225a;
            if (i10 == 0) {
                pg.q.b(obj);
                s1 s1Var = this.f5226b;
                Long l10 = (Long) s1Var.f5279k.getValue();
                if (l10 == null) {
                    return pg.f0.f21461a;
                }
                long jLongValue = l10.longValue();
                s1Var.f5279k.setValue(null);
                Iterator<c9.b> it = s1Var.j().iterator();
                int i11 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i11 = -1;
                        break;
                    }
                    if (it.next().f5057a == jLongValue) {
                        break;
                    }
                    i11++;
                }
                if (i11 >= 0) {
                    this.f5225a = 1;
                    g1.n nVar = c0.w0.f4504w;
                    c0.w0 w0Var = this.f5227c;
                    w0Var.getClass();
                    Object objC = w0Var.c(t.b1.f25167a, new c0.x0(w0Var, i11, null), this);
                    if (objC != ug.a.f29706a) {
                        objC = pg.f0.f21461a;
                    }
                    if (objC == aVar) {
                        return aVar;
                    }
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

    public /* synthetic */ class l extends kotlin.jvm.internal.p implements eh.a<pg.f0> {
        @Override // eh.a
        public final pg.f0 invoke() {
            s1 s1Var = (s1) this.receiver;
            List<c9.b> listJ = s1Var.j();
            HashSet hashSet = new HashSet();
            Iterator<T> it = listJ.iterator();
            while (it.hasNext()) {
                hashSet.add(Long.valueOf(((c9.b) it.next()).f5057a));
            }
            s1Var.f5277i.setValue(hashSet);
            return pg.f0.f21461a;
        }
    }

    public /* synthetic */ class m extends kotlin.jvm.internal.p implements eh.a<pg.f0> {
        @Override // eh.a
        public final pg.f0 invoke() {
            s1 s1Var = (s1) this.receiver;
            s1Var.f5277i.setValue(qg.b0.f22711a);
            return pg.f0.f21461a;
        }
    }

    public static final class n implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1 f5228a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c9.b f5229b;

        public n(s1 s1Var, c9.b bVar) {
            this.f5228a = s1Var;
            this.f5229b = bVar;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            long j10 = this.f5229b.f5057a;
            s1 s1Var = this.f5228a;
            s1Var.f5277i.setValue(s1Var.k().contains(Long.valueOf(j10)) ? qg.n0.b(s1Var.k(), Long.valueOf(j10)) : qg.n0.d(s1Var.k(), Long.valueOf(j10)));
            return pg.f0.f21461a;
        }
    }

    public static final class o implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Set<Long> f5230a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1 f5231b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f5232c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.l<Long, pg.f0> f5233d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<c9.b> f5234e;

        /* JADX WARN: Multi-variable type inference failed */
        public o(Set<Long> set, s1 s1Var, eh.a<pg.f0> aVar, eh.l<? super Long, pg.f0> lVar, List<c9.b> list) {
            this.f5230a = set;
            this.f5231b = s1Var;
            this.f5232c = aVar;
            this.f5233d = lVar;
            this.f5234e = list;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            d.a aVar;
            char c10;
            Object obj;
            Object obj2;
            float f10;
            float f11;
            float f12;
            float f13;
            char c11;
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar2 = d.a.f1143b;
                androidx.compose.ui.d dVarF = d0.h.f(androidx.compose.foundation.layout.g.d(aVar2, 1.0f));
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, jVar2, 48);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarF, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar3 = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
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
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, jVar2);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(ph.m0.e(new LayoutWeightElement(1.0f, true), ph.m0.c(jVar2), false), 8, 6);
                z.m1 m1VarA2 = z.k1.a(z.b.f34448e, d.a.f14611j, jVar2, 6);
                int iD2 = jVar2.D();
                a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarI, jVar2);
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar3);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar, m1VarA2, jVar2);
                ph.v1.j(dVar, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                Set<Long> set = this.f5230a;
                boolean zIsEmpty = set.isEmpty();
                Object obj3 = j.a.f31715a;
                Object obj4 = this.f5231b;
                Object obj5 = this.f5233d;
                List<c9.b> list = this.f5234e;
                if (zIsEmpty) {
                    jVar2.L(704966258);
                    w1.d dVarA = r0.k0.a();
                    String strC = f3.q.c(R.string.pdf_edit_add_blank, jVar2);
                    jVar2.L(1131122770);
                    boolean zL = jVar2.l(obj4);
                    Object objG = jVar2.g();
                    if (zL || objG == obj3) {
                        objG = new c1(0, obj4, s1.class, "insertBlank", "insertBlank()V", 0);
                        obj2 = obj4;
                        jVar2.C(objG);
                    } else {
                        obj2 = obj4;
                    }
                    jVar2.B();
                    aVar = aVar2;
                    r0.a(0, 12, 0L, (eh.a) ((kh.e) objG), strC, dVarA, jVar2, false);
                    r0.a(0, 12, 0L, this.f5232c, f3.q.c(R.string.pdf_edit_add_pdf, jVar2), r0.j0.a(), jVar2, false);
                    w1.d dVarA2 = r0.u.a();
                    String strC2 = f3.q.c(R.string.pdf_edit_tab_markup, jVar2);
                    jVar2.L(1131131014);
                    boolean zK = jVar2.K(obj5) | jVar2.l(obj2) | jVar2.l(list);
                    Object objG2 = jVar2.g();
                    if (zK || objG2 == obj3) {
                        objG2 = new y0(obj5, obj2, list, 0);
                        jVar2.C(objG2);
                    }
                    jVar2.B();
                    r0.a(0, 12, 0L, (eh.a) objG2, strC2, dVarA2, jVar2, false);
                    jVar2.B();
                    f12 = 9.0f;
                    f13 = 10.0f;
                } else {
                    aVar = aVar2;
                    jVar2.L(705493227);
                    w1.d dVarB = o0.f.f18844a;
                    if (dVarB != null) {
                        c10 = 20972;
                    } else {
                        d.a aVar4 = new d.a("AutoMirrored.Rounded.RotateLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i10 = w1.m.f31210a;
                        i2 i2Var = new i2(q1.b1.f21648b);
                        w1.e eVarA = o0.d.a(6.56f, 7.98f);
                        eVarA.b(6.1f, 7.52f, 5.31f, 7.6f, 5.0f, 8.17f);
                        eVarA.c(-0.28f, 0.51f, -0.5f, 1.03f, -0.67f, 1.58f);
                        eVarA.c(-0.19f, 0.63f, 0.31f, 1.25f, 0.96f, 1.25f);
                        eVarA.e(0.01f);
                        eVarA.c(0.43f, CropImageView.DEFAULT_ASPECT_RATIO, 0.82f, -0.28f, 0.94f, -0.7f);
                        eVarA.c(0.12f, -0.4f, 0.28f, -0.79f, 0.48f, -1.17f);
                        eVarA.c(0.22f, -0.37f, 0.15f, -0.84f, -0.16f, -1.15f);
                        p0.d0.a(eVarA, 5.31f, 13.0f, -0.02f);
                        eVarA.c(-0.65f, CropImageView.DEFAULT_ASPECT_RATIO, -1.15f, 0.62f, -0.96f, 1.25f);
                        eVarA.c(0.16f, 0.54f, 0.38f, 1.07f, 0.66f, 1.58f);
                        eVarA.c(0.31f, 0.57f, 1.11f, 0.66f, 1.57f, 0.2f);
                        eVarA.c(0.3f, -0.31f, 0.38f, -0.77f, 0.17f, -1.15f);
                        eVarA.c(-0.2f, -0.37f, -0.36f, -0.76f, -0.48f, -1.16f);
                        eVarA.c(-0.12f, -0.44f, -0.51f, -0.72f, -0.94f, -0.72f);
                        eVarA.a();
                        eVarA.h(8.16f, 19.02f);
                        eVarA.c(0.51f, 0.28f, 1.04f, 0.5f, 1.59f, 0.66f);
                        eVarA.c(0.62f, 0.18f, 1.24f, -0.32f, 1.24f, -0.96f);
                        eVarA.l(-0.03f);
                        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.43f, -0.28f, -0.82f, -0.7f, -0.94f);
                        eVarA.c(-0.4f, -0.12f, -0.78f, -0.28f, -1.15f, -0.48f);
                        eVarA.c(-0.38f, -0.21f, -0.86f, -0.14f, -1.16f, 0.17f);
                        eVarA.g(-0.03f, 0.03f);
                        eVarA.c(-0.45f, 0.45f, -0.36f, 1.24f, 0.21f, 1.55f);
                        eVarA.a();
                        eVarA.h(13.0f, 4.07f);
                        eVarA.l(-0.66f);
                        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
                        eVarA.f(9.17f, 4.83f);
                        eVarA.c(-0.4f, 0.4f, -0.4f, 1.04f, CropImageView.DEFAULT_ASPECT_RATIO, 1.43f);
                        c10 = 20972;
                        eVarA.g(2.13f, 2.08f);
                        eVarA.c(0.63f, 0.62f, 1.7f, 0.17f, 1.7f, -0.72f);
                        eVarA.f(13.0f, 6.09f);
                        eVarA.c(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.91f);
                        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.73f, -1.82f, 5.02f, -4.32f, 5.75f);
                        eVarA.c(-0.41f, 0.12f, -0.68f, 0.51f, -0.68f, 0.94f);
                        eVarA.l(0.02f);
                        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.65f, 0.61f, 1.14f, 1.23f, 0.96f);
                        eVarA.b(17.57f, 18.71f, 20.0f, 15.64f, 20.0f, 12.0f);
                        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -4.08f, -3.05f, -7.44f, -7.0f, -7.93f);
                        eVarA.a();
                        d.a.a(aVar4, eVarA.f31100a, 0, i2Var);
                        dVarB = aVar4.b();
                        o0.f.f18844a = dVarB;
                    }
                    String strC3 = f3.q.c(R.string.pdf_edit_rotate_left, jVar2);
                    jVar2.L(1131139229);
                    boolean zL2 = jVar2.l(obj4);
                    Object objG3 = jVar2.g();
                    if (zL2 || objG3 == obj3) {
                        objG3 = new z0(obj4, 0);
                        jVar2.C(objG3);
                    }
                    jVar2.B();
                    r0.a(0, 12, 0L, (eh.a) objG3, strC3, dVarB, jVar2, false);
                    w1.d dVarB2 = o0.g.f18845a;
                    if (dVarB2 == null) {
                        d.a aVar5 = new d.a("AutoMirrored.Rounded.RotateRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i11 = w1.m.f31210a;
                        i2 i2Var2 = new i2(q1.b1.f21648b);
                        w1.e eVarA2 = p0.m.a(14.83f, 4.83f, 12.7f, 2.7f);
                        eVarA2.c(-0.62f, -0.62f, -1.7f, -0.18f, -1.7f, 0.71f);
                        eVarA2.l(0.66f);
                        eVarA2.b(7.06f, 4.56f, 4.0f, 7.92f, 4.0f, 12.0f);
                        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, 3.64f, 2.43f, 6.71f, 5.77f, 7.68f);
                        eVarA2.c(0.62f, 0.18f, 1.23f, -0.32f, 1.23f, -0.96f);
                        eVarA2.l(-0.03f);
                        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.43f, -0.27f, -0.82f, -0.68f, -0.94f);
                        eVarA2.b(7.82f, 17.03f, 6.0f, 14.73f, 6.0f, 12.0f);
                        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, -2.97f, 2.16f, -5.43f, 5.0f, -5.91f);
                        eVarA2.l(1.53f);
                        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.89f, 1.07f, 1.33f, 1.7f, 0.71f);
                        eVarA2.g(2.13f, -2.08f);
                        eVarA2.c(0.4f, -0.38f, 0.4f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.42f);
                        eVarA2.a();
                        eVarA2.h(19.67f, 9.76f);
                        eVarA2.c(-0.16f, -0.55f, -0.38f, -1.08f, -0.66f, -1.59f);
                        eVarA2.c(-0.31f, -0.57f, -1.1f, -0.66f, -1.56f, -0.2f);
                        eVarA2.g(-0.01f, 0.01f);
                        eVarA2.c(-0.31f, 0.31f, -0.38f, 0.78f, -0.17f, 1.16f);
                        eVarA2.c(0.2f, 0.37f, 0.36f, 0.76f, 0.48f, 1.16f);
                        eVarA2.c(0.12f, 0.42f, 0.51f, 0.7f, 0.94f, 0.7f);
                        eVarA2.e(0.02f);
                        eVarA2.c(0.65f, CropImageView.DEFAULT_ASPECT_RATIO, 1.15f, -0.62f, 0.96f, -1.24f);
                        eVarA2.a();
                        eVarA2.h(13.0f, 18.68f);
                        eVarA2.l(0.02f);
                        eVarA2.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.65f, 0.62f, 1.14f, 1.24f, 0.96f);
                        eVarA2.c(0.55f, -0.16f, 1.08f, -0.38f, 1.59f, -0.66f);
                        eVarA2.c(0.57f, -0.31f, 0.66f, -1.1f, 0.2f, -1.56f);
                        eVarA2.g(-0.02f, -0.02f);
                        eVarA2.c(-0.31f, -0.31f, -0.78f, -0.38f, -1.16f, -0.17f);
                        eVarA2.c(-0.37f, 0.21f, -0.76f, 0.37f, -1.16f, 0.49f);
                        eVarA2.c(-0.41f, 0.12f, -0.69f, 0.51f, -0.69f, 0.94f);
                        eVarA2.a();
                        eVarA2.h(17.44f, 16.03f);
                        eVarA2.c(0.46f, 0.46f, 1.25f, 0.37f, 1.56f, -0.2f);
                        eVarA2.c(0.28f, -0.51f, 0.5f, -1.04f, 0.67f, -1.59f);
                        eVarA2.c(0.18f, -0.62f, -0.31f, -1.24f, -0.96f, -1.24f);
                        eVarA2.e(-0.02f);
                        eVarA2.c(-0.44f, CropImageView.DEFAULT_ASPECT_RATIO, -0.82f, 0.28f, -0.94f, 0.7f);
                        eVarA2.c(-0.12f, 0.4f, -0.28f, 0.79f, -0.48f, 1.17f);
                        eVarA2.c(-0.21f, 0.38f, -0.13f, 0.86f, 0.17f, 1.16f);
                        eVarA2.a();
                        d.a.a(aVar5, eVarA2.f31100a, 0, i2Var2);
                        dVarB2 = aVar5.b();
                        o0.g.f18845a = dVarB2;
                    }
                    w1.d dVar2 = dVarB2;
                    String strC4 = f3.q.c(R.string.pdf_edit_rotate_right, jVar2);
                    jVar2.L(1131144316);
                    boolean zL3 = jVar2.l(obj4);
                    Object objG4 = jVar2.g();
                    if (zL3 || objG4 == obj3) {
                        objG4 = new a1(obj4, 0);
                        jVar2.C(objG4);
                    }
                    jVar2.B();
                    r0.a(0, 12, 0L, (eh.a) objG4, strC4, dVar2, jVar2, false);
                    w1.d dVarB3 = r0.c.f23011a;
                    if (dVarB3 != null) {
                        obj = obj4;
                    } else {
                        d.a aVar6 = new d.a("Rounded.ArrowCircleLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = w1.m.f31210a;
                        obj = obj4;
                        i2 i2Var3 = new i2(q1.b1.f21648b);
                        w1.e eVarA3 = o0.d.a(2.0f, 12.0f);
                        eVarA3.c(CropImageView.DEFAULT_ASPECT_RATIO, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
                        eVarA3.c(5.52f, CropImageView.DEFAULT_ASPECT_RATIO, 10.0f, -4.48f, 10.0f, -10.0f);
                        eVarA3.i(17.52f, 2.0f, 12.0f, 2.0f);
                        eVarA3.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        l9.i.b(eVarA3, 12.0f, 9.21f, 12.0f, 11.0f);
                        eVarA3.g(3.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVarA3.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.45f, 1.0f, 1.0f);
                        eVarA3.j(-0.45f, 1.0f, -1.0f, 1.0f);
                        eVarA3.g(-3.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                        eVarA3.g(CropImageView.DEFAULT_ASPECT_RATIO, 1.79f);
                        eVarA3.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
                        eVarA3.g(-2.79f, -2.79f);
                        eVarA3.c(-0.2f, -0.2f, -0.2f, -0.51f, CropImageView.DEFAULT_ASPECT_RATIO, -0.71f);
                        eVarA3.g(2.79f, -2.79f);
                        eVarA3.b(11.46f, 8.54f, 12.0f, 8.76f, 12.0f, 9.21f);
                        eVarA3.a();
                        d.a.a(aVar6, eVarA3.f31100a, 0, i2Var3);
                        dVarB3 = aVar6.b();
                        r0.c.f23011a = dVarB3;
                    }
                    w1.d dVar3 = dVarB3;
                    String strC5 = f3.q.c(R.string.pdf_edit_move_earlier, jVar2);
                    boolean z10 = !r0.q(list, set);
                    jVar2.L(1131151642);
                    obj2 = obj;
                    boolean zL4 = jVar2.l(obj2);
                    Object objG5 = jVar2.g();
                    if (zL4 || objG5 == obj3) {
                        objG5 = new b1(obj2, 0);
                        jVar2.C(objG5);
                    }
                    jVar2.B();
                    r0.a(0, 8, 0L, (eh.a) objG5, strC5, dVar3, jVar2, z10);
                    w1.d dVarB4 = r0.d.f23013a;
                    if (dVarB4 != null) {
                        f11 = 9.0f;
                        f10 = 10.0f;
                    } else {
                        d.a aVar7 = new d.a("Rounded.ArrowCircleRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = w1.m.f31210a;
                        i2 i2Var4 = new i2(q1.b1.f21648b);
                        w1.e eVarA4 = o0.d.a(22.0f, 12.0f);
                        eVarA4.c(CropImageView.DEFAULT_ASPECT_RATIO, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
                        eVarA4.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        f10 = 10.0f;
                        eVarA4.j(4.48f, 10.0f, 10.0f, 10.0f);
                        eVarA4.b(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                        eVarA4.a();
                        eVarA4.h(12.0f, 14.79f);
                        eVarA4.k(13.0f);
                        f11 = 9.0f;
                        eVarA4.d(9.0f);
                        eVarA4.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
                        eVarA4.j(0.45f, -1.0f, 1.0f, -1.0f);
                        eVarA4.e(3.0f);
                        eVarA4.k(9.21f);
                        eVarA4.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
                        eVarA4.g(2.79f, 2.79f);
                        eVarA4.c(0.2f, 0.2f, 0.2f, 0.51f, CropImageView.DEFAULT_ASPECT_RATIO, 0.71f);
                        eVarA4.g(-2.79f, 2.79f);
                        eVarA4.b(12.54f, 15.46f, 12.0f, 15.24f, 12.0f, 14.79f);
                        eVarA4.a();
                        d.a.a(aVar7, eVarA4.f31100a, 0, i2Var4);
                        dVarB4 = aVar7.b();
                        r0.d.f23013a = dVarB4;
                    }
                    w1.d dVar4 = dVarB4;
                    String strC6 = f3.q.c(R.string.pdf_edit_move_later, jVar2);
                    boolean z11 = !r0.q(new qg.l0(list), set);
                    jVar2.L(1131159289);
                    boolean zL5 = jVar2.l(obj2);
                    Object objG6 = jVar2.g();
                    if (zL5 || objG6 == obj3) {
                        objG6 = new a9.o0(obj2, 2);
                        jVar2.C(objG6);
                    }
                    jVar2.B();
                    f12 = f11;
                    f13 = f10;
                    r0.a(0, 8, 0L, (eh.a) objG6, strC6, dVar4, jVar2, z11);
                    w1.d dVarB5 = r0.p.f23037a;
                    if (dVarB5 != null) {
                        c11 = 0;
                    } else {
                        d.a aVar8 = new d.a("Rounded.ContentCopy", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i14 = w1.m.f31210a;
                        i2 i2Var5 = new i2(q1.b1.f21648b);
                        w1.e eVar = new w1.e();
                        eVar.h(15.0f, 20.0f);
                        eVar.d(5.0f);
                        eVar.k(7.0f);
                        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        eVar.e(CropImageView.DEFAULT_ASPECT_RATIO);
                        eVar.b(3.45f, 6.0f, 3.0f, 6.45f, 3.0f, 7.0f);
                        eVar.l(13.0f);
                        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        eVar.e(f13);
                        eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
                        eVar.l(CropImageView.DEFAULT_ASPECT_RATIO);
                        eVar.b(16.0f, 20.45f, 15.55f, 20.0f, 15.0f, 20.0f);
                        eVar.a();
                        eVar.h(20.0f, 16.0f);
                        c11 = 0;
                        eVar.k(4.0f);
                        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        eVar.d(f12);
                        eVar.b(7.9f, 2.0f, 7.0f, 2.9f, 7.0f, 4.0f);
                        eVar.l(12.0f);
                        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        eVar.e(f12);
                        eVar.b(19.1f, 18.0f, 20.0f, 17.1f, 20.0f, 16.0f);
                        eVar.a();
                        eVar.h(18.0f, 16.0f);
                        eVar.d(f12);
                        eVar.k(4.0f);
                        eVar.e(f12);
                        eVar.k(16.0f);
                        eVar.a();
                        d.a.a(aVar8, eVar.f31100a, 0, i2Var5);
                        dVarB5 = aVar8.b();
                        r0.p.f23037a = dVarB5;
                    }
                    w1.d dVar5 = dVarB5;
                    String strC7 = f3.q.c(R.string.pdf_edit_duplicate, jVar2);
                    jVar2.L(1131164056);
                    boolean zL6 = jVar2.l(obj2);
                    Object objG7 = jVar2.g();
                    if (zL6 || objG7 == obj3) {
                        objG7 = new d1(0, obj2, s1.class, "duplicateSelected", "duplicateSelected()V", 0);
                        jVar2.C(objG7);
                    }
                    jVar2.B();
                    r0.a(0, 12, 0L, (eh.a) ((kh.e) objG7), strC7, dVar5, jVar2, false);
                    jVar2.L(1131165947);
                    if (set.size() == 1) {
                        w1.d dVarA3 = r0.u.a();
                        String strC8 = f3.q.c(R.string.pdf_edit_tab_markup, jVar2);
                        jVar2.L(1131170075);
                        boolean zK2 = jVar2.K(obj5) | jVar2.l(set);
                        Object objG8 = jVar2.g();
                        if (zK2 || objG8 == obj3) {
                            objG8 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.g(1, obj5, set);
                            jVar2.C(objG8);
                        }
                        jVar2.B();
                        r0.a(0, 12, 0L, (eh.a) objG8, strC8, dVarA3, jVar2, false);
                    }
                    jVar2.B();
                    w1.d dVarA4 = r0.k0.a();
                    String strC9 = f3.q.c(R.string.pdf_edit_add_blank, jVar2);
                    jVar2.L(1131175602);
                    boolean zL7 = jVar2.l(obj2);
                    Object objG9 = jVar2.g();
                    if (zL7 || objG9 == obj3) {
                        objG9 = new e1(0, obj2, s1.class, "insertBlank", "insertBlank()V", 0);
                        jVar2.C(objG9);
                    }
                    jVar2.B();
                    r0.a(0, 12, 0L, (eh.a) ((kh.e) objG9), strC9, dVarA4, jVar2, false);
                    jVar2.B();
                }
                jVar2.H();
                jVar2.L(-594994216);
                if (!set.isEmpty()) {
                    androidx.compose.ui.d dVarF2 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.r(aVar, 1), 40);
                    x0.e2 e2Var = f2.f25858a;
                    z.g.a(androidx.compose.foundation.a.b(dVarF2, ((e2) jVar2.f(e2Var)).B, q1.y1.f21750a), jVar2, 0);
                    w1.d dVarB6 = r0.t.f23045a;
                    if (dVarB6 == null) {
                        d.a aVar9 = new d.a("Rounded.DeleteOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i15 = w1.m.f31210a;
                        i2 i2Var6 = new i2(q1.b1.f21648b);
                        w1.e eVarA5 = o0.d.a(6.0f, 19.0f);
                        eVarA5.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        eVarA5.e(8.0f);
                        eVarA5.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
                        eVarA5.f(18.0f, f12);
                        eVarA5.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        eVarA5.f(8.0f, 7.0f);
                        eVarA5.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
                        eVarA5.l(f13);
                        eVarA5.a();
                        eVarA5.h(f12, f12);
                        eVarA5.e(6.0f);
                        eVarA5.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.45f, 1.0f, 1.0f);
                        eVarA5.l(8.0f);
                        eVarA5.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        eVarA5.f(f12, 19.0f);
                        eVarA5.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
                        eVarA5.l(-8.0f);
                        eVarA5.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        l9.y.a(eVarA5, 15.5f, 4.0f, -0.71f, -0.71f);
                        eVarA5.c(-0.18f, -0.18f, -0.44f, -0.29f, -0.7f, -0.29f);
                        eVarA5.f(9.91f, 3.0f);
                        eVarA5.c(-0.26f, CropImageView.DEFAULT_ASPECT_RATIO, -0.52f, 0.11f, -0.7f, 0.29f);
                        eVarA5.f(8.5f, 4.0f);
                        eVarA5.f(6.0f, 4.0f);
                        eVarA5.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, 0.45f, -1.0f, 1.0f);
                        eVarA5.j(0.45f, 1.0f, 1.0f, 1.0f);
                        eVarA5.e(12.0f);
                        eVarA5.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
                        eVarA5.j(-0.45f, -1.0f, -1.0f, -1.0f);
                        eVarA5.e(-2.5f);
                        eVarA5.a();
                        d.a.a(aVar9, eVarA5.f31100a, 0, i2Var6);
                        dVarB6 = aVar9.b();
                        r0.t.f23045a = dVarB6;
                    }
                    w1.d dVar6 = dVarB6;
                    String strC10 = f3.q.c(R.string.common_delete, jVar2);
                    long j10 = ((e2) jVar2.f(e2Var)).f25777w;
                    jVar2.L(-594981866);
                    boolean zL8 = jVar2.l(obj2);
                    Object objG10 = jVar2.g();
                    if (zL8 || objG10 == obj3) {
                        objG10 = new f1(0, obj2, s1.class, "deleteSelected", "deleteSelected()V", 0);
                        jVar2.C(objG10);
                    }
                    jVar2.B();
                    r0.a(0, 4, j10, (eh.a) ((kh.e) objG10), strC10, dVar6, jVar2, false);
                }
                jVar2.B();
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class p extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c9.y f5235a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f5236b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(c9.y yVar, List list) {
            super(1);
            this.f5235a = yVar;
            this.f5236b = list;
        }

        @Override // eh.l
        public final Object invoke(Integer num) {
            int iIntValue = num.intValue();
            return this.f5235a.invoke(Integer.valueOf(iIntValue), this.f5236b.get(iIntValue));
        }
    }

    public static final class q extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f5237a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List list) {
            super(1);
            this.f5237a = list;
        }

        @Override // eh.l
        public final Object invoke(Integer num) {
            this.f5237a.get(num.intValue());
            return null;
        }
    }

    public static final class r extends kotlin.jvm.internal.s implements eh.r<c0.v, Integer, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f5238a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f5239b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s1 f5240c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(List list, Set set, s1 s1Var) {
            super(4);
            this.f5238a = list;
            this.f5239b = set;
            this.f5240c = s1Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.r
        public final pg.f0 f(c0.v vVar, Integer num, x0.j jVar, Integer num2) {
            int i10;
            char c10;
            Bitmap bitmap;
            s1 s1Var;
            Bitmap bitmap2;
            c0.v vVar2 = vVar;
            int iIntValue = num.intValue();
            x0.j jVar2 = jVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i10 = (jVar2.K(vVar2) ? 4 : 2) | iIntValue2;
            } else {
                i10 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i10 |= jVar2.i(iIntValue) ? 32 : 16;
            }
            if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
                c9.b bVar = (c9.b) this.f5238a.get(iIntValue);
                jVar2.L(704057494);
                boolean zContains = this.f5239b.contains(Long.valueOf(bVar.f5057a));
                jVar2.L(173155391);
                int i11 = bVar.f5058b;
                boolean z10 = i11 == -1;
                int i12 = bVar.f5059c;
                j.a.C0321a c0321a = j.a.f31715a;
                s1 s1Var2 = this.f5240c;
                if (z10) {
                    jVar2.B();
                    s1Var = s1Var2;
                    bitmap2 = null;
                    c10 = ' ';
                } else {
                    a3 a3Var = (a3) qg.x.E(i11, s1Var2.f5290v);
                    if (a3Var != null) {
                        c10 = ' ';
                        bitmap = a3Var.f3735g.get(Integer.valueOf(i12));
                    } else {
                        c10 = ' ';
                        bitmap = null;
                    }
                    Integer numValueOf = Integer.valueOf(i11);
                    Integer numValueOf2 = Integer.valueOf(i12);
                    jVar2.L(558706850);
                    boolean zL = jVar2.l(a3Var) | jVar2.l(bVar);
                    Object objG = jVar2.g();
                    if (zL || objG == c0321a) {
                        objG = new n1(a3Var, bVar, null);
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    s1Var = s1Var2;
                    Bitmap bitmap3 = (Bitmap) bg.b.j(bitmap, numValueOf, numValueOf2, (eh.p) objG, jVar2, 0).getValue();
                    jVar2.B();
                    bitmap2 = bitmap3;
                }
                jVar2.L(1131097091);
                boolean zL2 = jVar2.l(s1Var) | jVar2.l(bVar);
                Object objG2 = jVar2.g();
                if (zL2 || objG2 == c0321a) {
                    objG2 = new n(s1Var, bVar);
                    jVar2.C(objG2);
                }
                jVar2.B();
                long j10 = 1;
                r0.j(bVar, iIntValue, zContains, bitmap2, (eh.a) objG2, vVar2.a(d.a.f1143b, s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5), s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new f3.m((j10 << c10) | (j10 & BodyPartID.bodyIdMax)), 1), s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5)), jVar2, 8 | (i10 & 112));
                jVar2.B();
            } else {
                jVar2.v();
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorScreenKt$PdfEditorScreen$2$1", f = "PdfEditorScreen.kt", l = {136}, m = "invokeSuspend")
    public static final class s extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5241a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1 f5242b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ uc f5243c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f5244d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(s1 s1Var, uc ucVar, Context context, tg.e<? super s> eVar) {
            super(2, eVar);
            this.f5242b = s1Var;
            this.f5243c = ucVar;
            this.f5244d = context;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new s(this.f5242b, this.f5243c, this.f5244d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f5241a;
            if (i10 == 0) {
                pg.q.b(obj);
                s1 s1Var = this.f5242b;
                pg.n nVar = (pg.n) s1Var.f5285q.getValue();
                if (nVar == null) {
                    return pg.f0.f21461a;
                }
                int iIntValue = ((Number) nVar.f21469a).intValue();
                String str = (String) nVar.f21470b;
                s1Var.f5285q.setValue(null);
                Context context = this.f5244d;
                String string = str != null ? context.getString(iIntValue, str) : context.getString(iIntValue);
                kotlin.jvm.internal.r.b(string);
                this.f5241a = 1;
                if (uc.b(this.f5243c, string, null, this, 14) == aVar) {
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

    public static final class t implements eh.r<r.n, Integer, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1 f5245a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.k<String[], Uri> f5246b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.l1 f5247c;

        public t(s1 s1Var, c.k<String[], Uri> kVar, x0.l1 l1Var) {
            this.f5245a = s1Var;
            this.f5246b = kVar;
            this.f5247c = l1Var;
        }

        @Override // eh.r
        public final pg.f0 f(r.n nVar, Integer num, x0.j jVar, Integer num2) {
            r.n AnimatedContent = nVar;
            int iIntValue = num.intValue();
            x0.j jVar2 = jVar;
            num2.intValue();
            kotlin.jvm.internal.r.e(AnimatedContent, "$this$AnimatedContent");
            s1 s1Var = this.f5245a;
            if (iIntValue == 0) {
                jVar2.L(-1725326406);
                jVar2.L(-1579672696);
                c.k<String[], Uri> kVar = this.f5246b;
                boolean zL = jVar2.l(kVar);
                Object objG = jVar2.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (zL || objG == c0321a) {
                    objG = new a9.q0(kVar, 1);
                    jVar2.C(objG);
                }
                eh.a aVar = (eh.a) objG;
                jVar2.B();
                jVar2.L(-1579669611);
                boolean zL2 = jVar2.l(s1Var);
                x0.l1 l1Var = this.f5247c;
                boolean zK = zL2 | jVar2.K(l1Var);
                Object objG2 = jVar2.g();
                if (zK || objG2 == c0321a) {
                    objG2 = new g1(0, s1Var, l1Var);
                    jVar2.C(objG2);
                }
                jVar2.B();
                r0.k(s1Var, aVar, (eh.l) objG2, jVar2, 0);
                jVar2.B();
            } else {
                jVar2.L(-1724902946);
                r0.h(s1Var, jVar2, 0);
                jVar2.B();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class u implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f5248a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f5249b;

        public u(eh.a aVar, x0.n1 n1Var) {
            this.f5248a = n1Var;
            this.f5249b = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(681784695);
                x0.n1<Boolean> n1Var = this.f5248a;
                boolean zK = jVar2.K(n1Var);
                eh.a<pg.f0> aVar = this.f5249b;
                boolean zK2 = zK | jVar2.K(aVar);
                Object objG = jVar2.g();
                if (zK2 || objG == j.a.f31715a) {
                    objG = new h1(0, aVar, n1Var);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, false, null, null, null, c9.a.f5019a, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class v implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<Boolean> f5250a;

        public v(x0.n1<Boolean> n1Var) {
            this.f5250a = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(681793237);
                x0.n1<Boolean> n1Var = this.f5250a;
                boolean zK = jVar2.K(n1Var);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new i1(n1Var, 0);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, false, null, null, null, c9.a.f5020b, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.preview.edit.PdfEditorScreenKt$TextMarkDialog$1$1", f = "PdfEditorScreen.kt", l = {}, m = "invokeSuspend")
    public static final class w extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o1.c0 f5251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(o1.c0 c0Var, tg.e<? super w> eVar) {
            super(2, eVar);
            this.f5251a = c0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new w(this.f5251a, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            o1.c0.b(this.f5251a);
            return pg.f0.f21461a;
        }
    }

    public static final class x implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.p<String, Integer, pg.f0> f5252a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f5253b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.l1 f5254c;

        /* JADX WARN: Multi-variable type inference failed */
        public x(eh.p<? super String, ? super Integer, pg.f0> pVar, x0.n1<String> n1Var, x0.l1 l1Var) {
            this.f5252a = pVar;
            this.f5253b = n1Var;
            this.f5254c = l1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                jVar2.L(-365262924);
                final eh.p<String, Integer, pg.f0> pVar = this.f5252a;
                boolean zK = jVar2.K(pVar);
                final x0.n1<String> n1Var = this.f5253b;
                boolean zK2 = zK | jVar2.K(n1Var);
                final x0.l1 l1Var = this.f5254c;
                boolean zK3 = zK2 | jVar2.K(l1Var);
                Object objG = jVar2.g();
                if (zK3 || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: c9.j1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.a
                        public final Object invoke() {
                            CharSequence charSequenceSubSequence;
                            int i10 = r0.f5188b;
                            String str = (String) n1Var.getValue();
                            kotlin.jvm.internal.r.e(str, "<this>");
                            int length = str.length() - 1;
                            if (length >= 0) {
                                while (true) {
                                    int i11 = length - 1;
                                    if (!g8.w.j(str.charAt(length))) {
                                        charSequenceSubSequence = str.subSequence(0, length + 1);
                                        break;
                                    }
                                    if (i11 < 0) {
                                        break;
                                    }
                                    length = i11;
                                }
                                charSequenceSubSequence = "";
                            } else {
                                charSequenceSubSequence = "";
                            }
                            pVar.invoke(charSequenceSubSequence.toString(), Integer.valueOf(l1Var.g()));
                            return pg.f0.f21461a;
                        }
                    };
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, !mh.x.A(n1Var.getValue()), null, null, null, c9.a.f5031m, jVar2, 805306368, 506);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class y implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f5255a;

        public y(eh.a<pg.f0> aVar) {
            this.f5255a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f5255a, null, false, null, null, null, c9.a.f5032n, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class z implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o1.c0 f5256a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f5257b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x0.l1 f5258c;

        public z(o1.c0 c0Var, x0.n1<String> n1Var, x0.l1 l1Var) {
            this.f5256a = c0Var;
            this.f5257b = n1Var;
            this.f5258c = l1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar, jVar2);
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
                x0.n1<String> n1Var = this.f5257b;
                String value = n1Var.getValue();
                androidx.compose.ui.d dVarA = androidx.compose.ui.focus.b.a(androidx.compose.foundation.layout.g.d(aVar, 1.0f), this.f5256a);
                jVar2.L(746428646);
                boolean zK = jVar2.K(n1Var);
                Object objG = jVar2.g();
                Object obj = j.a.f31715a;
                if (zK || objG == obj) {
                    objG = new k1(n1Var, 0);
                    jVar2.C(objG);
                }
                jVar2.B();
                Object obj2 = obj;
                w9.a(value, (eh.l) objG, dVarA, false, false, null, null, c9.a.f5034p, null, null, null, null, false, null, null, null, false, 6, 2, null, null, jVar2, 12582912, 905969664, 7602040);
                x0.j jVar3 = jVar2;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(aVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                z.m1 m1VarA = z.k1.a(z.b.h(8), d.a.f14611j, jVar3, 6);
                int iD2 = jVar3.D();
                a2 a2VarY2 = jVar3.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, jVar3);
                if (jVar3.t() == null) {
                    u1.d();
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
                jVar3.L(906985536);
                final int i10 = 0;
                for (Object obj3 : qg.p.j(Integer.valueOf(R.string.pdf_edit_size_small), Integer.valueOf(R.string.pdf_edit_size_medium), Integer.valueOf(R.string.pdf_edit_size_large))) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        qg.p.o();
                        throw null;
                    }
                    int iIntValue = ((Number) obj3).intValue();
                    final x0.l1 l1Var = this.f5258c;
                    boolean z10 = l1Var.g() == i10;
                    jVar3.L(776270146);
                    boolean zK2 = jVar3.K(l1Var) | jVar3.i(i10);
                    Object objG2 = jVar3.g();
                    Object obj4 = obj2;
                    if (zK2 || objG2 == obj4) {
                        objG2 = new eh.a() { // from class: c9.l1
                            @Override // eh.a
                            public final Object invoke() {
                                int i12 = r0.f5188b;
                                l1Var.f(i10);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar3.C(objG2);
                    }
                    eh.a aVar3 = (eh.a) objG2;
                    jVar3.B();
                    f1.b bVarB = f1.c.b(-1609307731, new m1(iIntValue), jVar3);
                    float f10 = v3.f27221a;
                    long j10 = r0.f5187a;
                    x0.j jVar4 = jVar3;
                    d2.b(z10, aVar3, bVarB, null, false, null, null, v3.a(0L, q1.b1.c(0.16f, j10), j10, 0L, jVar3, 3455), null, null, jVar4, 384, 3832);
                    jVar3 = jVar4;
                    i10 = i11;
                    obj2 = obj4;
                }
                x0.j jVar5 = jVar3;
                jVar5.B();
                jVar5.H();
                jVar5.H();
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i10, final int i11, long j10, final eh.a aVar, final String str, final w1.d dVar, x0.j jVar, boolean z10) {
        boolean z11;
        int i12;
        long j11;
        int i13;
        int i14;
        g.a.C0128a c0128a;
        final boolean z12;
        final long j12;
        h2 h2VarV;
        x0.k kVarP = jVar.p(-1123329190);
        int i15 = i10 | (kVarP.K(dVar) ? 4 : 2) | (kVarP.K(str) ? 32 : 16);
        int i16 = i11 & 4;
        if (i16 != 0) {
            i12 = i15 | 384;
            z11 = z10;
        } else {
            z11 = z10;
            i12 = i15 | (kVarP.c(z11) ? 256 : 128);
        }
        if ((i11 & 8) == 0) {
            j11 = j10;
            int i17 = kVarP.j(j11) ? 2048 : 1024;
            i13 = i12 | i17 | (!kVarP.l(aVar) ? 16384 : 8192);
            if ((i13 & 9363) == 9362 || !kVarP.s()) {
                kVarP.r0();
                if ((i10 & 1) != 0 || kVarP.a0()) {
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        j11 = ((e2) kVarP.f(f2.f25858a)).f25771q;
                        i13 &= -7169;
                    }
                    boolean z13 = z11;
                    long j13 = j11;
                    kVarP.U();
                    float f10 = z13 ? 1.0f : 0.38f;
                    h0.e eVarA = h0.f.a(14);
                    d.a aVar2 = d.a.f1143b;
                    androidx.compose.ui.d dVarS = androidx.compose.foundation.layout.g.s(androidx.compose.foundation.b.c(e1.d.d(aVar2, eVarA), z13, null, null, aVar, 6), 72, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    float f11 = 8;
                    androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(dVarS, f11, f11);
                    z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
                    i14 = kVarP.P;
                    a2 a2VarP = kVarP.P();
                    androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
                    i2.g.f13861o.getClass();
                    e0.a aVar3 = g.a.f13863b;
                    kVarP.r();
                    if (kVarP.O) {
                        kVarP.w(aVar3);
                    } else {
                        kVarP.z();
                    }
                    ph.v1.j(g.a.f13867f, qVarA, kVarP);
                    ph.v1.j(g.a.f13866e, a2VarP, kVarP);
                    c0128a = g.a.f13868g;
                    if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
                    }
                    ph.v1.j(g.a.f13865d, dVarC, kVarP);
                    t4.b(dVar, null, null, q1.b1.c(f10, j13), kVarP, (i13 & 14) | 48, 4);
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar2, 4), kVarP);
                    ff.b(str, null, q1.b1.c(f10, j13), 0L, null, null, 0L, null, 0L, 0, false, 1, 0, ((nf) kVarP.f(of.f26647a)).f26552o, kVarP, (i13 >> 3) & 14, 3072, 57338);
                    kVarP = kVarP;
                    kVarP.T(true);
                    z12 = z13;
                    j12 = j13;
                } else {
                    kVarP.v();
                    if ((i11 & 8) != 0) {
                        i13 &= -7169;
                    }
                    boolean z132 = z11;
                    long j132 = j11;
                    kVarP.U();
                    float f102 = z132 ? 1.0f : 0.38f;
                    h0.e eVarA2 = h0.f.a(14);
                    d.a aVar22 = d.a.f1143b;
                    androidx.compose.ui.d dVarS2 = androidx.compose.foundation.layout.g.s(androidx.compose.foundation.b.c(e1.d.d(aVar22, eVarA2), z132, null, null, aVar, 6), 72, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                    float f112 = 8;
                    androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.f.i(dVarS2, f112, f112);
                    z.q qVarA2 = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
                    i14 = kVarP.P;
                    a2 a2VarP2 = kVarP.P();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarI2, kVarP);
                    i2.g.f13861o.getClass();
                    e0.a aVar32 = g.a.f13863b;
                    kVarP.r();
                    if (kVarP.O) {
                    }
                    ph.v1.j(g.a.f13867f, qVarA2, kVarP);
                    ph.v1.j(g.a.f13866e, a2VarP2, kVarP);
                    c0128a = g.a.f13868g;
                    if (kVarP.O) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
                        ph.v1.j(g.a.f13865d, dVarC2, kVarP);
                        t4.b(dVar, null, null, q1.b1.c(f102, j132), kVarP, (i13 & 14) | 48, 4);
                        p1.d.b(androidx.compose.foundation.layout.g.f(aVar22, 4), kVarP);
                        ff.b(str, null, q1.b1.c(f102, j132), 0L, null, null, 0L, null, 0L, 0, false, 1, 0, ((nf) kVarP.f(of.f26647a)).f26552o, kVarP, (i13 >> 3) & 14, 3072, 57338);
                        kVarP = kVarP;
                        kVarP.T(true);
                        z12 = z132;
                        j12 = j132;
                    }
                }
            } else {
                kVarP.v();
                z12 = z11;
                j12 = j11;
            }
            h2VarV = kVarP.V();
            if (h2VarV == null) {
                h2VarV.f31703d = new eh.p(i10, i11, j12, aVar, str, dVar, z12) { // from class: c9.g0

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ w1.d f5094a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ String f5095b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ boolean f5096c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ long f5097d;

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ eh.a f5098e;

                    /* renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ int f5099f;

                    {
                        this.f5094a = dVar;
                        this.f5095b = str;
                        this.f5096c = z12;
                        this.f5097d = j12;
                        this.f5098e = aVar;
                        this.f5099f = i11;
                    }

                    @Override // eh.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        r0.a(f3.i.n(1), this.f5099f, this.f5097d, this.f5098e, this.f5095b, this.f5094a, (x0.j) obj, this.f5096c);
                        return pg.f0.f21461a;
                    }
                };
                return;
            }
            return;
        }
        j11 = j10;
        i13 = i12 | i17 | (!kVarP.l(aVar) ? 16384 : 8192);
        if ((i13 & 9363) == 9362) {
            kVarP.r0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                }
                if ((i11 & 8) != 0) {
                }
                boolean z1322 = z11;
                long j1322 = j11;
                kVarP.U();
                float f1022 = z1322 ? 1.0f : 0.38f;
                h0.e eVarA22 = h0.f.a(14);
                d.a aVar222 = d.a.f1143b;
                androidx.compose.ui.d dVarS22 = androidx.compose.foundation.layout.g.s(androidx.compose.foundation.b.c(e1.d.d(aVar222, eVarA22), z1322, null, null, aVar, 6), 72, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                float f1122 = 8;
                androidx.compose.ui.d dVarI22 = androidx.compose.foundation.layout.f.i(dVarS22, f1122, f1122);
                z.q qVarA22 = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
                i14 = kVarP.P;
                a2 a2VarP22 = kVarP.P();
                androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(dVarI22, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar322 = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                }
                ph.v1.j(g.a.f13867f, qVarA22, kVarP);
                ph.v1.j(g.a.f13866e, a2VarP22, kVarP);
                c0128a = g.a.f13868g;
                if (kVarP.O) {
                }
            }
        }
        h2VarV = kVarP.V();
        if (h2VarV == null) {
        }
    }

    public static final void b(String str, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(217577082);
        if ((((kVarP.K(str) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f976c, q1.b1.c(0.45f, q1.b1.f21648b), q1.y1.f21750a);
            kVarP.L(388958986);
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new c9.l();
                kVarP.C(objG);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarC = androidx.compose.foundation.b.c(dVarB, true, null, null, (eh.a) objG, 6);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int i11 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarC, kVarP);
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
            ph.v1.j(g.a.f13865d, dVarC2, kVarP);
            md.a(null, h0.f.a(20), ((e2) kVarP.f(f2.f25858a)).G, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1260635173, new a(str), kVarP), kVarP, 12582912, 121);
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new c9.m(str, i10, 0);
        }
    }

    public static final void c(final int i10, final int i11, eh.a aVar, x0.j jVar, final boolean z10) {
        final eh.a aVar2;
        long j10;
        x0.k kVarP = jVar.p(1988278250);
        if ((((kVarP.i(i10) ? 4 : 2) | i11 | (kVarP.c(z10) ? 32 : 16) | (kVarP.l(aVar) ? 256 : 128)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
            aVar2 = aVar;
        } else {
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(d.a.f1143b, 34);
            h0.e eVar = h0.f.f12083a;
            aVar2 = aVar;
            androidx.compose.ui.d dVarC = androidx.compose.foundation.b.c(e1.d.d(dVarN, eVar), false, null, null, aVar2, 7);
            float f10 = z10 ? 3 : 1;
            if (z10) {
                kVarP.L(-408685639);
                j10 = ((e2) kVarP.f(f2.f25858a)).f25771q;
            } else {
                kVarP.L(-408684322);
                j10 = ((e2) kVarP.f(f2.f25858a)).B;
            }
            kVarP.T(false);
            z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.f.h(t.o.a(dVarC, f10, j10, eVar), z10 ? 5 : 3), c2.n0.b(i10), eVar), kVarP, 0);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, i11, aVar2, z10) { // from class: c9.h0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f5105a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f5106b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f5107c;

                {
                    this.f5106b = z10;
                    this.f5107c = aVar2;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    r0.c(this.f5105a, iN, this.f5107c, (x0.j) obj, this.f5106b);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void d(final boolean z10, final w1.d dVar, final String str, final eh.a<pg.f0> aVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1544662067);
        int i11 = i10 | (kVarP.c(z10) ? 4 : 2) | (kVarP.K(dVar) ? 32 : 16) | (kVarP.K(str) ? 256 : 128) | (kVarP.l(aVar) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            he.b(z10, aVar, null, false, f1.c.b(169133363, new b(str, z10), kVarP), f1.c.b(-1773045102, new c(dVar), kVarP), f5187a, ((e2) kVarP.f(f2.f25858a)).f25773s, kVarP, (i11 & 14) | 1794048 | ((i11 >> 6) & 112), 268);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(z10, dVar, str, aVar, i10) { // from class: c9.a0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f5051a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w1.d f5052b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f5053c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f5054d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    r0.d(this.f5051a, this.f5052b, this.f5053c, this.f5054d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void e(final int i10, final eh.l<? super Integer, pg.f0> lVar, x0.j jVar, final int i11) {
        x0.k kVarP = jVar.p(1667828733);
        int i12 = (kVarP.i(i10) ? 4 : 2) | i11 | (kVarP.l(lVar) ? 32 : 16);
        if ((i12 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            s3 s3Var = f2.f25858a;
            af.b(i10, null, ((e2) kVarP.f(s3Var)).f25770p, ((e2) kVarP.f(s3Var)).f25771q, f1.c.b(549539221, new d(i10), kVarP), null, f1.c.b(1999830933, new e(i10, lVar), kVarP), kVarP, (i12 & 14) | 1597440, 34);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, lVar, i11) { // from class: c9.k

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f5120a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.l f5121b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    r0.e(this.f5120a, this.f5121b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void f(final s1 s1Var, final eh.a<pg.f0> aVar, final eh.a<pg.f0> aVar2, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1428937086);
        if ((((kVarP.l(s1Var) ? 4 : 2) | i10 | (kVarP.l(aVar) ? 32 : 16) | (kVarP.l(aVar2) ? 256 : 128)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            e2 e2Var = (e2) kVarP.f(f2.f25858a);
            md.a(null, null, e2Var.f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, f1.c.b(-1589469117, new f(aVar, s1Var, aVar2, e2Var), kVarP), kVarP, 12582912, 123);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar, aVar2, i10) { // from class: c9.q0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f5179b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f5180c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    r0.f(this.f5178a, this.f5179b, this.f5180c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final s1 s1Var, final c9.b bVar, eh.l<? super pg.n<Float, Float>, pg.f0> lVar, final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        eh.l<? super pg.n<Float, Float>, pg.f0> lVar2;
        x0.k kVarP = jVar.p(503417338);
        int i11 = i10 | (kVarP.l(s1Var) ? 4 : 2) | (kVarP.l(bVar) ? 32 : 16) | (kVarP.K(dVar) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            lVar2 = lVar;
        } else {
            a3 a3Var = (a3) qg.x.E(bVar.f5058b, s1Var.f5290v);
            int iN0 = (int) ((f3.d) kVarP.f(j2.f14779h)).N0(1400);
            if (iN0 > 2000) {
                iN0 = 2000;
            }
            Integer numValueOf = Integer.valueOf(bVar.f5058b);
            Integer numValueOf2 = Integer.valueOf(bVar.f5059c);
            kVarP.L(850144840);
            int i12 = i11 & 112;
            boolean zL = (i12 == 32 || kVarP.l(bVar)) | kVarP.l(a3Var) | kVarP.i(iN0);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL || objG == c0321a) {
                objG = new h(bVar, a3Var, iN0, null);
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1VarJ = bg.b.j(null, numValueOf, numValueOf2, (eh.p) objG, kVarP, 6);
            kVarP = kVarP;
            kVarP.L(850148151);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new h1.u();
                kVarP.C(objG2);
            }
            h1.u uVar = (h1.u) objG2;
            kVarP.T(false);
            c9.e eVarR = uVar.isEmpty() ? null : r(s1Var, qg.x.a0(uVar));
            Bitmap bitmap = (Bitmap) n1VarJ.getValue();
            androidx.compose.ui.d dVarA = n1.q.a(dVar, 6, h0.f.a(4));
            Long lValueOf = Long.valueOf(bVar.f5057a);
            Integer numValueOf3 = Integer.valueOf(bVar.f5062f);
            kVarP.L(850162236);
            boolean zL2 = (i12 == 32 || kVarP.l(bVar)) | kVarP.l(s1Var);
            Object objG3 = kVarP.g();
            if (zL2 || objG3 == c0321a) {
                lVar2 = lVar;
                objG3 = new g(s1Var, uVar, lVar2, bVar);
                kVarP.C(objG3);
            } else {
                lVar2 = lVar;
            }
            kVarP.T(false);
            c2.r rVar = c2.s0.f4692a;
            y1.a(bVar, bitmap, dVarA.h(new SuspendPointerInputElement(lValueOf, numValueOf3, (PointerInputEventHandler) objG3, 4)), eVarR, 0, kVarP, ((i11 >> 3) & 14) | 4104, 16);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            final eh.l<? super pg.n<Float, Float>, pg.f0> lVar3 = lVar2;
            h2VarV.f31703d = new eh.p(bVar, lVar3, dVar, i10) { // from class: c9.e0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f5089b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f5090c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f5091d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(449);
                    r0.g(this.f5088a, this.f5089b, this.f5090c, this.f5091d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final s1 s1Var, x0.j jVar, final int i10) {
        int i11;
        int i12;
        boolean zL;
        Object objG;
        boolean zL2;
        Object objG2;
        pg.n nVar;
        final x0.n1 n1Var;
        x0.k kVarP = jVar.p(412446844);
        int i13 = i10 | (kVarP.l(s1Var) ? 4 : 2);
        if ((i13 & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            final List<c9.b> listJ = s1Var.j();
            Iterator<c9.b> it = listJ.iterator();
            int i14 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                }
                long j10 = it.next().f5057a;
                Long l10 = (Long) s1Var.f5278j.getValue();
                if (l10 != null && j10 == l10.longValue()) {
                    break;
                } else {
                    i14++;
                }
            }
            Integer numValueOf = Integer.valueOf(i14);
            if (i14 < 0) {
                numValueOf = null;
            }
            final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            final c9.b bVar = listJ.get(iIntValue);
            kVarP.L(665514676);
            Object objG3 = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG3 == obj) {
                objG3 = bg.b.h(null);
                kVarP.C(objG3);
            }
            x0.n1 n1Var2 = (x0.n1) objG3;
            kVarP.T(false);
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i15 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            ph.v1.j(bVar2, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O) {
                i11 = i13;
            } else {
                i11 = i13;
                if (!kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, kVarP);
                d.a aVar2 = d.a.f1143b;
                androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(aVar2, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 4, 1);
                z.m1 m1VarA = z.k1.a(z.b.f34448e, d.a.f14612k, kVarP, 54);
                i12 = kVarP.P;
                a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarJ, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.z();
                } else {
                    kVarP.w(aVar);
                }
                ph.v1.j(bVar2, m1VarA, kVarP);
                ph.v1.j(dVar, a2VarP2, kVarP);
                if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                }
                ph.v1.j(cVar, dVarC2, kVarP);
                kVarP.L(7053066);
                zL = kVarP.l(s1Var) | kVarP.l(listJ) | kVarP.i(iIntValue);
                objG = kVarP.g();
                if (!zL || objG == obj) {
                    objG = new eh.a() { // from class: c9.n
                        @Override // eh.a
                        public final Object invoke() {
                            s1Var.f5278j.setValue(Long.valueOf(((b) listJ.get(iIntValue - 1)).f5057a));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG);
                }
                eh.a aVar3 = (eh.a) objG;
                kVarP.T(false);
                s4.c(aVar3, null, iIntValue <= 0, null, c9.a.f5029k, kVarP, 196608, 26);
                int i16 = iIntValue + 1;
                ff.b(f3.q.d(R.string.pdf_document_page, new Object[]{Integer.valueOf(i16), Integer.valueOf(listJ.size())}, kVarP), androidx.compose.foundation.layout.g.s(aVar2, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((e2) kVarP.f(f2.f25858a)).f25771q, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26546i, kVarP, 48, 0, 65016);
                kVarP.L(7071882);
                zL2 = kVarP.l(s1Var) | kVarP.l(listJ) | kVarP.i(iIntValue);
                objG2 = kVarP.g();
                if (!zL2 || objG2 == obj) {
                    objG2 = new eh.a() { // from class: c9.o
                        @Override // eh.a
                        public final Object invoke() {
                            s1Var.f5278j.setValue(Long.valueOf(((b) listJ.get(iIntValue + 1)).f5057a));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG2);
                }
                eh.a aVar4 = (eh.a) objG2;
                kVarP.T(false);
                s4.c(aVar4, null, i16 >= listJ.size(), null, c9.a.f5030l, kVarP, 196608, 26);
                kVarP.T(true);
                if (1.0f <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                z.m.a(androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(new LayoutWeightElement(1.0f, true), 1.0f), 16, 8), d.a.f14606e, f1.c.b(-835663544, new i(bVar, s1Var, n1Var2), kVarP), kVarP, 3120, 4);
                kVarP = kVarP;
                i(s1Var, kVarP, i11 & 14);
                kVarP.T(true);
                nVar = (pg.n) n1Var2.getValue();
                if (nVar != null) {
                    final float fFloatValue = ((Number) nVar.f21469a).floatValue();
                    final float fFloatValue2 = ((Number) nVar.f21470b).floatValue();
                    int iG = s1Var.f5284p.g();
                    kVarP.L(584931640);
                    boolean zL3 = kVarP.l(s1Var) | kVarP.l(bVar) | kVarP.h(fFloatValue) | kVarP.h(fFloatValue2);
                    Object objG4 = kVarP.g();
                    if (zL3 || objG4 == obj) {
                        n1Var = n1Var2;
                        eh.p pVar = new eh.p() { // from class: c9.p
                            @Override // eh.p
                            public final Object invoke(Object obj2, Object obj3) {
                                String text = (String) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                kotlin.jvm.internal.r.e(text, "text");
                                s1 s1Var2 = s1Var;
                                s1Var2.f5284p.f(iIntValue2);
                                b bVar3 = bVar;
                                s1Var2.g(bVar3.f5057a, new z1(fFloatValue, fFloatValue2, text, s1Var2.f5281m.g(), s1.E.get(iIntValue2).floatValue(), (((-bVar3.f5062f) % 360) + 360) % 360));
                                n1Var.setValue(null);
                                return pg.f0.f21461a;
                            }
                        };
                        kVarP.C(pVar);
                        objG4 = pVar;
                    } else {
                        n1Var = n1Var2;
                    }
                    eh.p pVar2 = (eh.p) objG4;
                    Object objA = p0.h.a(kVarP, false, 584942254);
                    if (objA == obj) {
                        objA = new c9.q(n1Var, 0);
                        kVarP.C(objA);
                    }
                    kVarP.T(false);
                    n(iG, pVar2, (eh.a) objA, kVarP, 384);
                    pg.f0 f0Var = pg.f0.f21461a;
                }
            }
            org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, kVarP);
            d.a aVar22 = d.a.f1143b;
            androidx.compose.ui.d dVarJ2 = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.d(aVar22, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 4, 1);
            z.m1 m1VarA2 = z.k1.a(z.b.f34448e, d.a.f14612k, kVarP, 54);
            i12 = kVarP.P;
            a2 a2VarP22 = kVarP.P();
            androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(dVarJ2, kVarP);
            kVarP.r();
            if (kVarP.O) {
            }
            ph.v1.j(bVar2, m1VarA2, kVarP);
            ph.v1.j(dVar, a2VarP22, kVarP);
            if (!kVarP.O) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
                ph.v1.j(cVar2, dVarC22, kVarP);
                kVarP.L(7053066);
                zL = kVarP.l(s1Var) | kVarP.l(listJ) | kVarP.i(iIntValue);
                objG = kVarP.g();
                if (!zL) {
                    objG = new eh.a() { // from class: c9.n
                        @Override // eh.a
                        public final Object invoke() {
                            s1Var.f5278j.setValue(Long.valueOf(((b) listJ.get(iIntValue - 1)).f5057a));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG);
                    eh.a aVar32 = (eh.a) objG;
                    kVarP.T(false);
                    s4.c(aVar32, null, iIntValue <= 0, null, c9.a.f5029k, kVarP, 196608, 26);
                    int i162 = iIntValue + 1;
                    ff.b(f3.q.d(R.string.pdf_document_page, new Object[]{Integer.valueOf(i162), Integer.valueOf(listJ.size())}, kVarP), androidx.compose.foundation.layout.g.s(aVar22, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, CropImageView.DEFAULT_ASPECT_RATIO, 2), ((e2) kVarP.f(f2.f25858a)).f25771q, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26546i, kVarP, 48, 0, 65016);
                    kVarP.L(7071882);
                    zL2 = kVarP.l(s1Var) | kVarP.l(listJ) | kVarP.i(iIntValue);
                    objG2 = kVarP.g();
                    if (!zL2) {
                        objG2 = new eh.a() { // from class: c9.o
                            @Override // eh.a
                            public final Object invoke() {
                                s1Var.f5278j.setValue(Long.valueOf(((b) listJ.get(iIntValue + 1)).f5057a));
                                return pg.f0.f21461a;
                            }
                        };
                        kVarP.C(objG2);
                        eh.a aVar42 = (eh.a) objG2;
                        kVarP.T(false);
                        s4.c(aVar42, null, i162 >= listJ.size(), null, c9.a.f5030l, kVarP, 196608, 26);
                        kVarP.T(true);
                        if (1.0f <= 0.0d) {
                        }
                        z.m.a(androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.d(new LayoutWeightElement(1.0f, true), 1.0f), 16, 8), d.a.f14606e, f1.c.b(-835663544, new i(bVar, s1Var, n1Var2), kVarP), kVarP, 3120, 4);
                        kVarP = kVarP;
                        i(s1Var, kVarP, i11 & 14);
                        kVarP.T(true);
                        nVar = (pg.n) n1Var2.getValue();
                        if (nVar != null) {
                        }
                    }
                }
            }
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: c9.r
                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(1);
                    r0.h(this.f5186a, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void i(final s1 s1Var, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1331065150);
        if ((((kVarP.l(s1Var) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            e2 e2Var = (e2) kVarP.f(f2.f25858a);
            md.a(null, null, e2Var.f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 8, null, f1.c.b(877557469, new j(s1Var, e2Var), kVarP), kVarP, 12779520, 91);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: c9.z
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    r0.i(this.f5329a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void j(final c9.b bVar, final int i10, final boolean z10, final Bitmap bitmap, final eh.a aVar, final androidx.compose.ui.d dVar, x0.j jVar, final int i11) {
        int i12;
        eh.a aVar2;
        e0.a aVar3;
        float f10;
        d.a aVar4;
        j1.f fVar;
        g.a.C0128a c0128a;
        boolean z11;
        x0.k kVar;
        g.a.c cVar;
        boolean z12;
        e2 e2Var;
        x0.k kVarP = jVar.p(1230881305);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? kVarP.K(bVar) : kVarP.l(bVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= kVarP.i(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= kVarP.c(z10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= kVarP.l(bitmap) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            aVar2 = aVar;
            i12 |= kVarP.l(aVar2) ? 16384 : 8192;
        } else {
            aVar2 = aVar;
        }
        if ((196608 & i11) == 0) {
            i12 |= kVarP.K(dVar) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && kVarP.s()) {
            kVarP.v();
        } else {
            e2 e2Var2 = (e2) kVarP.f(f2.f25858a);
            float f11 = 4;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.b.c(e1.d.d(dVar, h0.f.a(12)), false, null, null, aVar2, 7), f11);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
            int i13 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar5 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar5);
            } else {
                kVarP.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            ph.v1.j(bVar2, qVarA, kVarP);
            g.a.d dVar2 = g.a.f13866e;
            ph.v1.j(dVar2, a2VarP, kVarP);
            g.a.C0128a c0128a2 = g.a.f13868g;
            int i14 = i12;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a2);
            }
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, kVarP);
            d.a aVar6 = d.a.f1143b;
            androidx.compose.ui.d dVarA = androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.g.d(aVar6, 1.0f), 0.75f, false);
            j1.f fVar2 = d.a.f14606e;
            g2.l0 l0VarD = z.g.d(fVar2, false);
            int i15 = kVarP.P;
            a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarA, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar5);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar2, l0VarD, kVarP);
            ph.v1.j(dVar2, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a2);
            }
            ph.v1.j(cVar2, dVarC2, kVarP);
            float f12 = bVar.f5061e;
            float f13 = bVar.f5060d;
            float f14 = bVar.f5062f % 180 == 0 ? f13 / f12 : f12 / f13;
            float f15 = 6;
            h0.e eVarA = h0.f.a(f15);
            androidx.compose.ui.d dVarD = e1.d.d(n1.q.a(androidx.compose.foundation.layout.a.a(aVar6, f14, f14 < 0.75f), z10 ? f15 : 2, eVarA), eVarA);
            long j10 = f5187a;
            t.v vVarA = z10 ? a9.d2.a(3, j10) : a9.d2.a(1, e2Var2.B);
            y1.a(bVar, bitmap, t.o.b(dVarD, vVarA.f25389a, vVarA.f25390b, eVarA), null, 0, kVarP, (i14 & 14) | 8 | ((i14 >> 6) & 112), 24);
            kVarP.L(195022632);
            androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.f961a;
            if (z10) {
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.h(bVar3.b(aVar6, d.a.f14604c), f11), 24), j10, h0.f.f12083a);
                g2.l0 l0VarD2 = z.g.d(fVar2, false);
                int i16 = kVarP.P;
                a2 a2VarP3 = kVarP.P();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.w(aVar5);
                } else {
                    kVarP.z();
                }
                ph.v1.j(bVar2, l0VarD2, kVarP);
                ph.v1.j(dVar2, a2VarP3, kVarP);
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                    c0128a = c0128a2;
                    org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
                } else {
                    c0128a = c0128a2;
                }
                ph.v1.j(cVar2, dVarC3, kVarP);
                w1.d dVarA2 = r0.j.a();
                long j11 = q1.b1.f21650d;
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar6, 16);
                fVar = fVar2;
                aVar3 = aVar5;
                f10 = f11;
                cVar = cVar2;
                aVar4 = aVar6;
                t4.b(dVarA2, null, dVarN, j11, kVarP, 3504, 0);
                kVar = kVarP;
                z11 = true;
                kVar.T(true);
            } else {
                aVar3 = aVar5;
                f10 = f11;
                aVar4 = aVar6;
                fVar = fVar2;
                c0128a = c0128a2;
                z11 = true;
                kVar = kVarP;
                cVar = cVar2;
            }
            kVar.T(false);
            kVar.L(195035318);
            if (bVar.f5063g.isEmpty()) {
                kVarP = kVar;
                z12 = z11;
                e2Var = e2Var2;
            } else {
                androidx.compose.ui.d dVarN2 = androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.f.h(bVar3.b(aVar4, d.a.f14608g), f10), 22);
                e2Var = e2Var2;
                androidx.compose.ui.d dVarB2 = androidx.compose.foundation.a.b(dVarN2, e2Var.f25775u, h0.f.f12083a);
                g2.l0 l0VarD3 = z.g.d(fVar, false);
                int i17 = kVar.P;
                a2 a2VarP4 = kVar.P();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarB2, kVar);
                kVar.r();
                if (kVar.O) {
                    kVar.w(aVar3);
                } else {
                    kVar.z();
                }
                ph.v1.j(bVar2, l0VarD3, kVar);
                ph.v1.j(dVar2, a2VarP4, kVar);
                if (kVar.O || !kotlin.jvm.internal.r.a(kVar.g(), Integer.valueOf(i17))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i17, kVar, i17, c0128a);
                }
                ph.v1.j(cVar, dVarC4, kVar);
                x0.k kVar2 = kVar;
                z12 = true;
                t4.b(r0.u.a(), null, androidx.compose.foundation.layout.g.n(aVar4, 13), e2Var.f25776v, kVar2, 432, 0);
                kVarP = kVar2;
                kVarP.T(true);
            }
            kVarP.T(false);
            kVarP.T(z12);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, f15), kVarP);
            ff.b(String.valueOf(i10 + 1), null, z10 ? j10 : e2Var.f25773s, 0L, z10 ? x2.p.f32033f : x2.p.f32030c, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26551n, kVarP, 0, 0, 65498);
            kVarP.T(z12);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p() { // from class: c9.b0
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r0.j(bVar, i10, z10, bitmap, aVar, dVar, (x0.j) obj, f3.i.n(i11 | 1));
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(final s1 s1Var, eh.a<pg.f0> aVar, eh.l<? super Long, pg.f0> lVar, x0.j jVar, final int i10) {
        Set<Long> set;
        int i11;
        String strA;
        double d10;
        x0.k kVar;
        float f10;
        j.a.C0321a c0321a;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        j.a.C0321a c0321a2;
        boolean z12;
        float f11;
        final Set<Long> set2;
        final List<c9.b> list;
        boolean zL;
        Object objG;
        final eh.a<pg.f0> aVar2;
        final eh.l<? super Long, pg.f0> lVar2;
        x0.k kVar2;
        Object mVar;
        char c10;
        boolean z13;
        boolean z14;
        j.a.C0321a c0321a3;
        int i14;
        float f12;
        float f13;
        Object lVar3;
        char c11;
        boolean z15;
        boolean z16;
        j.a.C0321a c0321a4;
        int i15;
        x0.k kVarP = jVar.p(1352085699);
        if ((((kVarP.l(s1Var) ? 4 : 2) | i10 | (kVarP.l(aVar) ? 32 : 16) | (kVarP.l(lVar) ? 256 : 128)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar2 = kVarP;
            aVar2 = aVar;
            lVar2 = lVar;
        } else {
            Set<Long> setK = s1Var.k();
            List<c9.b> listJ = s1Var.j();
            c0.w0 w0VarA = c0.e1.a(0, 3, kVarP);
            Long l10 = (Long) s1Var.f5279k.getValue();
            kVarP.L(-1731802775);
            boolean zL2 = kVarP.l(s1Var) | kVarP.K(w0VarA);
            Object objG2 = kVarP.g();
            j.a.C0321a c0321a5 = j.a.f31715a;
            if (zL2 || objG2 == c0321a5) {
                objG2 = new k(s1Var, w0VarA, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, l10, kVarP);
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i16 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, qVarA, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O) {
                set = setK;
            } else {
                set = setK;
                if (!kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                }
                g.a.c cVar = g.a.f13865d;
                ph.v1.j(cVar, dVarC, kVarP);
                float f14 = 8;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), 20, f14, f14, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
                i11 = kVarP.P;
                a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarL, kVarP);
                kVarP.r();
                if (kVarP.O) {
                    kVarP.z();
                } else {
                    kVarP.w(aVar3);
                }
                ph.v1.j(bVar, m1VarA, kVarP);
                ph.v1.j(dVar, a2VarP2, kVarP);
                if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
                }
                ph.v1.j(cVar, dVarC2, kVarP);
                if (set.isEmpty()) {
                    kVarP.L(-1207350033);
                    strA = f3.q.a(R.plurals.pdf_edit_selected, set.size(), new Object[]{Integer.valueOf(set.size())}, kVarP);
                    kVarP.T(false);
                } else {
                    kVarP.L(-1207352213);
                    strA = f3.q.c(R.string.pdf_edit_select_hint, kVarP);
                    kVarP.T(false);
                }
                String str = strA;
                t2.l0 l0Var = ((nf) kVarP.f(of.f26647a)).f26548k;
                kVarP.L(-1207344659);
                long j10 = !set.isEmpty() ? ((e2) kVarP.f(f2.f25858a)).f25773s : f5187a;
                kVarP.T(false);
                x2.p pVar = !set.isEmpty() ? x2.p.f32030c : x2.p.f32032e;
                char c12 = 0;
                d10 = 1.0f;
                if (d10 <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                boolean z17 = true;
                ff.b(str, new LayoutWeightElement(1.0f, true), j10, 0L, pVar, null, 0L, null, 0L, 0, false, 0, 0, l0Var, kVarP, 0, 0, 65496);
                kVar = kVarP;
                kVar.L(-1207336512);
                if (set.size() >= listJ.size()) {
                    kVar.L(-1207334350);
                    boolean zL3 = kVar.l(s1Var);
                    Object objG3 = kVar.g();
                    if (zL3 || objG3 == c0321a5) {
                        f13 = f14;
                        c11 = 0;
                        z15 = true;
                        z16 = false;
                        c0321a4 = c0321a5;
                        i15 = 16;
                        lVar3 = new l(0, s1Var, s1.class, "selectAll", "selectAll()V", 0);
                        kVar.C(lVar3);
                    } else {
                        f13 = f14;
                        c0321a4 = c0321a5;
                        z16 = false;
                        c11 = 0;
                        lVar3 = objG3;
                        i15 = 16;
                        z15 = true;
                    }
                    kVar.T(z16);
                    c12 = c11;
                    z17 = z15;
                    i12 = i15;
                    f10 = f13;
                    c0321a = c0321a4;
                    z10 = z16;
                    t0.x0.d((eh.a) ((kh.e) lVar3), null, false, null, null, null, c9.a.f5027i, kVar, 805306368, 510);
                    kVar = kVar;
                } else {
                    f10 = f14;
                    c0321a = c0321a5;
                    z10 = false;
                    i12 = 16;
                }
                kVar.T(z10);
                kVar.L(-1207330907);
                if (set.isEmpty()) {
                    kVar.L(-1207328905);
                    boolean zL4 = kVar.l(s1Var);
                    Object objG4 = kVar.g();
                    if (zL4 || objG4 == c0321a) {
                        c10 = c12;
                        z13 = z17;
                        z14 = z10;
                        c0321a3 = c0321a;
                        i14 = i12;
                        f12 = f10;
                        mVar = new m(0, s1Var, s1.class, "clearSelection", "clearSelection()V", 0);
                        kVar.C(mVar);
                    } else {
                        c0321a3 = c0321a;
                        i14 = i12;
                        z14 = z10;
                        c10 = c12;
                        mVar = objG4;
                        f12 = f10;
                        z13 = z17;
                    }
                    kVar.T(z14);
                    c0321a2 = c0321a3;
                    f11 = f12;
                    i13 = i14;
                    z11 = z14;
                    x0.k kVar3 = kVar;
                    list = listJ;
                    z12 = z13;
                    set2 = set;
                    t0.x0.d((eh.a) ((kh.e) mVar), null, false, null, null, null, c9.a.f5028j, kVar3, 805306368, 510);
                    kVar = kVar3;
                } else {
                    boolean z18 = z10;
                    i13 = i12;
                    z11 = z18;
                    c0321a2 = c0321a;
                    z12 = z17;
                    f11 = f10;
                    set2 = set;
                    list = listJ;
                }
                kVar.T(z11);
                kVar.T(z12);
                b.a aVar4 = new b.a(HeaderItem.DATA_SIZE_OFFSET);
                float f15 = i13;
                z.g1 g1Var = new z.g1(f15, f11, f15, f15);
                b.i iVarH = z.b.h(14);
                b.i iVarH2 = z.b.h(f15);
                if (d10 <= 0.0d) {
                    a0.a.a("invalid weight; must be greater than zero");
                }
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(new LayoutWeightElement(1.0f, z12), 1.0f);
                kVar.L(-214186515);
                zL = kVar.l(list) | kVar.l(set2) | kVar.l(s1Var);
                objG = kVar.g();
                if (!zL || objG == c0321a2) {
                    objG = new eh.l() { // from class: c9.s
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            c0.p0 LazyVerticalGrid = (c0.p0) obj;
                            kotlin.jvm.internal.r.e(LazyVerticalGrid, "$this$LazyVerticalGrid");
                            y yVar = new y(0);
                            List list2 = list;
                            LazyVerticalGrid.e(list2.size(), new r0.p(yVar, list2), new r0.q(list2), new f1.b(1229287273, true, new r0.r(list2, set2, s1Var)));
                            return pg.f0.f21461a;
                        }
                    };
                    kVar.C(objG);
                }
                kVar.T(z11);
                x0.k kVar4 = kVar;
                c0.h.a(aVar4, dVarD, w0VarA, g1Var, iVarH2, iVarH, null, false, null, (eh.l) objG, kVar4, 1769472, 912);
                aVar2 = aVar;
                lVar2 = lVar;
                md.a(null, null, ((e2) kVar4.f(f2.f25858a)).f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, f11, null, f1.c.b(611618002, new o(set2, s1Var, aVar2, lVar2, list), kVar4), kVar4, 12779520, 91);
                kVar2 = kVar4;
                kVar2.T(true);
            }
            org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
            g.a.c cVar2 = g.a.f13865d;
            ph.v1.j(cVar2, dVarC, kVarP);
            float f142 = 8;
            androidx.compose.ui.d dVarL2 = androidx.compose.foundation.layout.f.l(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), 20, f142, f142, CropImageView.DEFAULT_ASPECT_RATIO, 8);
            z.m1 m1VarA2 = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            i11 = kVarP.P;
            a2 a2VarP22 = kVarP.P();
            androidx.compose.ui.d dVarC22 = androidx.compose.ui.c.c(dVarL2, kVarP);
            kVarP.r();
            if (kVarP.O) {
            }
            ph.v1.j(bVar, m1VarA2, kVarP);
            ph.v1.j(dVar, a2VarP22, kVarP);
            if (!kVarP.O) {
                org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a);
                ph.v1.j(cVar2, dVarC22, kVarP);
                if (set.isEmpty()) {
                }
                String str2 = strA;
                t2.l0 l0Var2 = ((nf) kVarP.f(of.f26647a)).f26548k;
                kVarP.L(-1207344659);
                if (!set.isEmpty()) {
                }
                kVarP.T(false);
                x2.p pVar2 = !set.isEmpty() ? x2.p.f32030c : x2.p.f32032e;
                char c122 = 0;
                d10 = 1.0f;
                if (d10 <= 0.0d) {
                }
                boolean z172 = true;
                ff.b(str2, new LayoutWeightElement(1.0f, true), j10, 0L, pVar2, null, 0L, null, 0L, 0, false, 0, 0, l0Var2, kVarP, 0, 0, 65496);
                kVar = kVarP;
                kVar.L(-1207336512);
                if (set.size() >= listJ.size()) {
                }
                kVar.T(z10);
                kVar.L(-1207330907);
                if (set.isEmpty()) {
                }
                kVar.T(z11);
                kVar.T(z12);
                b.a aVar42 = new b.a(HeaderItem.DATA_SIZE_OFFSET);
                float f152 = i13;
                z.g1 g1Var2 = new z.g1(f152, f11, f152, f152);
                b.i iVarH3 = z.b.h(14);
                b.i iVarH22 = z.b.h(f152);
                if (d10 <= 0.0d) {
                }
                androidx.compose.ui.d dVarD2 = androidx.compose.foundation.layout.g.d(new LayoutWeightElement(1.0f, z12), 1.0f);
                kVar.L(-214186515);
                zL = kVar.l(list) | kVar.l(set2) | kVar.l(s1Var);
                objG = kVar.g();
                if (!zL) {
                    objG = new eh.l() { // from class: c9.s
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            c0.p0 LazyVerticalGrid = (c0.p0) obj;
                            kotlin.jvm.internal.r.e(LazyVerticalGrid, "$this$LazyVerticalGrid");
                            y yVar = new y(0);
                            List list2 = list;
                            LazyVerticalGrid.e(list2.size(), new r0.p(yVar, list2), new r0.q(list2), new f1.b(1229287273, true, new r0.r(list2, set2, s1Var)));
                            return pg.f0.f21461a;
                        }
                    };
                    kVar.C(objG);
                    kVar.T(z11);
                    x0.k kVar42 = kVar;
                    c0.h.a(aVar42, dVarD2, w0VarA, g1Var2, iVarH22, iVarH3, null, false, null, (eh.l) objG, kVar42, 1769472, 912);
                    aVar2 = aVar;
                    lVar2 = lVar;
                    md.a(null, null, ((e2) kVar42.f(f2.f25858a)).f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, f11, null, f1.c.b(611618002, new o(set2, s1Var, aVar2, lVar2, list), kVar42), kVar42, 12779520, 91);
                    kVar2 = kVar42;
                    kVar2.T(true);
                }
            }
        }
        h2 h2VarV = kVar2.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar2, lVar2, i10) { // from class: c9.t

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f5296b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f5297c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    r0.k(this.f5295a, this.f5296b, this.f5297c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final void l(final s1 viewModel, final eh.a<pg.f0> onClose, final eh.l<? super int[], pg.f0> onSaved, x0.j jVar, final int i10) {
        ?? r15;
        androidx.compose.foundation.layout.b bVar;
        x0.n1 n1Var;
        boolean z10;
        Object obj;
        d.a aVar;
        uc ucVar;
        x0.k kVar;
        boolean z11;
        x0.k kVar2;
        ?? r12;
        final eh.a<pg.f0> aVar2;
        x0.k kVar3;
        kotlin.jvm.internal.r.e(viewModel, "viewModel");
        kotlin.jvm.internal.r.e(onClose, "onClose");
        kotlin.jvm.internal.r.e(onSaved, "onSaved");
        x0.k kVarP = jVar.p(-1572911551);
        int i11 = i10 | (kVarP.l(viewModel) ? 4 : 2) | (kVarP.l(onClose) ? 32 : 16) | (kVarP.l(onSaved) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            aVar2 = onClose;
            kVar3 = kVarP;
        } else {
            Context context = (Context) kVarP.f(AndroidCompositionLocals_androidKt.f1281b);
            Object[] objArr = new Object[0];
            kVarP.L(1170130876);
            Object objG = kVarP.g();
            Object obj2 = j.a.f31715a;
            if (objG == obj2) {
                objG = new c9.j();
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.l1 l1Var = (x0.l1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            Object[] objArr2 = new Object[0];
            kVarP.L(1170133301);
            Object objG2 = kVarP.g();
            if (objG2 == obj2) {
                objG2 = new c9.u();
                kVarP.C(objG2);
            }
            kVarP.T(false);
            final x0.n1 n1Var2 = (x0.n1) b0.a0.d(objArr2, null, (eh.a) objG2, kVarP, 3072, 6);
            kVarP.L(1170134748);
            Object objG3 = kVarP.g();
            if (objG3 == obj2) {
                objG3 = new uc();
                kVarP.C(objG3);
            }
            uc ucVar2 = (uc) objG3;
            kVarP.T(false);
            f.d dVar = new f.d();
            kVarP.L(1170138830);
            boolean zL = kVarP.l(viewModel);
            Object objG4 = kVarP.g();
            if (zL || objG4 == obj2) {
                objG4 = new f0(viewModel, 0);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            c.k kVarA = c.d.a(dVar, (eh.l) objG4, kVarP, 0);
            kVarP.L(1170141019);
            int i12 = i11 & 112;
            boolean zL2 = kVarP.l(viewModel) | kVarP.K(n1Var2) | (i12 == 32);
            Object objG5 = kVarP.g();
            if (zL2 || objG5 == obj2) {
                objG5 = new eh.a() { // from class: c9.k0
                    @Override // eh.a
                    public final Object invoke() {
                        if (viewModel.i()) {
                            r0.m(n1Var2, true);
                        } else {
                            onClose.invoke();
                        }
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG5);
            }
            kVarP.T(false);
            c.e.a(0, 1, (eh.a) objG5, kVarP, false);
            pg.n nVar = (pg.n) viewModel.f5285q.getValue();
            kVarP.L(1170144444);
            boolean zL3 = kVarP.l(viewModel) | kVarP.l(context);
            Object objG6 = kVarP.g();
            if (zL3 || objG6 == obj2) {
                objG6 = new s(viewModel, ucVar2, context, null);
                kVarP.C(objG6);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG6, nVar, kVarP);
            FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
            s3 s3Var = f2.f25858a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(fillElement, ((e2) kVarP.f(s3Var)).I, q1.y1.f21750a);
            j1.f fVar = d.a.f14602a;
            g2.l0 l0VarD = z.g.d(fVar, false);
            int i13 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            ph.v1.j(bVar2, l0VarD, kVarP);
            g.a.d dVar2 = g.a.f13866e;
            ph.v1.j(dVar2, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
            int i14 = kVarP.P;
            a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(fillElement, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar2, qVarA, kVarP);
            ph.v1.j(dVar2, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            kVarP.L(1736301657);
            boolean zL4 = kVarP.l(viewModel) | kVarP.K(n1Var2) | (i12 == 32);
            Object objG7 = kVarP.g();
            if (zL4 || objG7 == obj2) {
                objG7 = new l0(viewModel, onClose, n1Var2);
                kVarP.C(objG7);
            }
            eh.a aVar4 = (eh.a) objG7;
            kVarP.T(false);
            kVarP.L(1736304501);
            boolean zL5 = kVarP.l(viewModel) | ((i11 & 896) == 256);
            Object objG8 = kVarP.g();
            if (zL5 || objG8 == obj2) {
                objG8 = new m0(viewModel, onSaved);
                kVarP.C(objG8);
            }
            kVarP.T(false);
            f(viewModel, aVar4, (eh.a) objG8, kVarP, i11 & 14);
            int iG = l1Var.g();
            kVarP.L(1736306976);
            boolean zL6 = kVarP.l(viewModel) | kVarP.K(l1Var);
            Object objG9 = kVarP.g();
            if (zL6 || objG9 == obj2) {
                r15 = 0;
                objG9 = new n0(0, viewModel, l1Var);
                kVarP.C(objG9);
            } else {
                r15 = 0;
            }
            kVarP.T(r15);
            e(iG, (eh.l) objG9, kVarP, r15);
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(new LayoutWeightElement(1.0f, true), 1.0f);
            WeakHashMap<View, z.x1> weakHashMap = z.x1.f34666v;
            androidx.compose.ui.d dVarA = z.y1.a(dVarD, new z.b1(x1.a.c(kVarP).f34677k, hf.a.f12994e));
            g2.l0 l0VarD2 = z.g.d(fVar, false);
            int i15 = kVarP.P;
            a2 a2VarP3 = kVarP.P();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarA, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar2, l0VarD2, kVarP);
            ph.v1.j(dVar2, a2VarP3, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            }
            ph.v1.j(cVar, dVarC3, kVarP);
            boolean zBooleanValue = ((Boolean) viewModel.f5273e.getValue()).booleanValue();
            j1.f fVar2 = d.a.f14606e;
            d.a aVar5 = d.a.f1143b;
            androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.f961a;
            if (zBooleanValue) {
                kVarP.L(-2128035644);
                bVar = bVar3;
                z9.a(CropImageView.DEFAULT_ASPECT_RATIO, 0, 48, 28, f5187a, 0L, bVar3.b(aVar5, fVar2), kVarP);
                x0.k kVar4 = kVarP;
                kVar4.T(false);
                n1Var = n1Var2;
                obj = obj2;
                r12 = 0;
                aVar = aVar5;
                z11 = true;
                ucVar = ucVar2;
                kVar2 = kVar4;
            } else {
                bVar = bVar3;
                if (((Boolean) viewModel.f5274f.getValue()).booleanValue()) {
                    kVarP.L(-1544469042);
                    n1Var = n1Var2;
                    obj = obj2;
                    aVar = aVar5;
                    z10 = false;
                    ucVar = ucVar2;
                    ff.b(f3.q.c(R.string.pdf_document_error, kVarP), androidx.compose.foundation.layout.f.h(bVar.b(aVar5, fVar2), 32), ((e2) kVarP.f(s3Var)).f25773s, 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, null, kVarP, 0, 0, 130552);
                    x0.k kVar5 = kVarP;
                    kVar5.T(false);
                    kVar = kVar5;
                } else {
                    n1Var = n1Var2;
                    z10 = false;
                    obj = obj2;
                    aVar = aVar5;
                    ucVar = ucVar2;
                    kVarP.L(-2128020234);
                    androidx.compose.animation.b.a(Integer.valueOf(l1Var.g()), null, null, null, "editorTab", null, f1.c.b(729088270, new t(viewModel, kVarA, l1Var), kVarP), kVarP, 1597440);
                    x0.k kVar6 = kVarP;
                    kVar6.T(false);
                    kVar = kVar6;
                }
                z11 = true;
                r12 = z10;
                kVar2 = kVar;
            }
            kVar2.T(z11);
            kVar2.T(z11);
            tc.b(ucVar, androidx.compose.foundation.layout.f.l(d0.h.f(bVar.b(aVar, d.a.f14609h)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 96, 7), null, kVar2, 6);
            Integer num = (Integer) viewModel.f5275g.getValue();
            kVar2.L(681772514);
            if (num != null) {
                b(f3.q.c(num.intValue(), kVar2), kVar2, r12);
                pg.f0 f0Var = pg.f0.f21461a;
            }
            kVar2.T(r12);
            kVar2.T(true);
            if (((Boolean) n1Var.getValue()).booleanValue()) {
                kVar2.L(1170226550);
                x0.n1 n1Var3 = n1Var;
                boolean zK = kVar2.K(n1Var3);
                Object objG10 = kVar2.g();
                if (zK || objG10 == obj) {
                    objG10 = new o0(n1Var3, r12);
                    kVar2.C(objG10);
                }
                kVar2.T(r12);
                aVar2 = onClose;
                x0.k kVar7 = kVar2;
                t0.r.a((eh.a) objG10, f1.c.b(903563732, new u(aVar2, n1Var3), kVar2), null, f1.c.b(1412342546, new v(n1Var3), kVar2), null, c9.a.f5021c, c9.a.f5022d, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar7, 1772592, 0, 16276);
                kVar3 = kVar7;
            } else {
                aVar2 = onClose;
                kVar3 = kVar2;
            }
        }
        h2 h2VarV = kVar3.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar2, onSaved, i10) { // from class: c9.p0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f5168b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f5169c;

                @Override // eh.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iN = f3.i.n(1);
                    r0.l(this.f5167a, this.f5168b, this.f5169c, (x0.j) obj3, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void m(x0.n1<Boolean> n1Var, boolean z10) {
        n1Var.setValue(Boolean.valueOf(z10));
    }

    public static final void n(final int i10, final eh.p<? super String, ? super Integer, pg.f0> pVar, final eh.a<pg.f0> aVar, x0.j jVar, final int i11) {
        x0.k kVarP = jVar.p(1807078265);
        int i12 = i11 | (kVarP.i(i10) ? 4 : 2) | (kVarP.l(pVar) ? 32 : 16);
        if ((i12 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            Object[] objArr = new Object[0];
            kVarP.L(1162757287);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new c9.v();
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 3072, 6);
            Object[] objArr2 = new Object[0];
            kVarP.L(1162759251);
            boolean z10 = (i12 & 14) == 4;
            Object objG2 = kVarP.g();
            if (z10 || objG2 == c0321a) {
                objG2 = new eh.a() { // from class: c9.w
                    @Override // eh.a
                    public final Object invoke() {
                        return new x0.v1(i10);
                    }
                };
                kVarP.C(objG2);
            }
            kVarP.T(false);
            x0.l1 l1Var = (x0.l1) b0.a0.d(objArr2, null, (eh.a) objG2, kVarP, 0, 6);
            kVarP.L(1162760878);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = new o1.c0();
                kVarP.C(objG3);
            }
            o1.c0 c0Var = (o1.c0) objG3;
            kVarP.T(false);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(1162762633);
            Object objG4 = kVarP.g();
            if (objG4 == c0321a) {
                objG4 = new w(c0Var, null);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG4, f0Var, kVarP);
            t0.r.a(aVar, f1.c.b(825419825, new x(pVar, n1Var, l1Var), kVarP), null, f1.c.b(1236030191, new y(aVar), kVarP), null, c9.a.f5033o, f1.c.b(-295537908, new z(c0Var, n1Var, l1Var), kVarP), null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVarP, 1772598, 0, 16276);
            kVarP = kVarP;
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, pVar, aVar, i11) { // from class: c9.x

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f5312a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.p f5313b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f5314c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(385);
                    r0.n(this.f5312a, this.f5313b, this.f5314c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(final s1 s1Var, final String str, final w1.d dVar, final int i10, x0.j jVar, final int i11) {
        x0.k kVarP = jVar.p(-1096967859);
        int i12 = i11 | (kVarP.l(s1Var) ? 4 : 2) | (kVarP.K(dVar) ? 256 : 128) | (kVarP.i(i10) ? 2048 : 1024);
        if ((i12 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            boolean zA = kotlin.jvm.internal.r.a((String) s1Var.f5280l.getValue(), str);
            e2 e2Var = (e2) kVarP.f(f2.f25858a);
            h0.e eVarA = h0.f.a(16);
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarD = e1.d.d(aVar, eVarA);
            long j10 = f5187a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD, zA ? q1.b1.c(0.14f, j10) : q1.b1.f21653g, q1.y1.f21750a);
            kVarP.L(1819826930);
            boolean zL = kVarP.l(s1Var);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.a() { // from class: c9.c0
                    @Override // eh.a
                    public final Object invoke() {
                        s1 s1Var2 = s1Var;
                        s1Var2.getClass();
                        s1Var2.f5280l.setValue(str);
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.f.i(androidx.compose.foundation.layout.g.s(androidx.compose.foundation.b.c(dVarB, false, null, null, (eh.a) objG, 7), 76, CropImageView.DEFAULT_ASPECT_RATIO, 2), 10, 8);
            z.q qVarA = z.o.a(z.b.f34446c, d.a.f14615n, kVarP, 48);
            int i13 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarI, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar2);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, qVarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            t4.b(dVar, null, null, zA ? j10 : e2Var.f25773s, kVarP, ((i12 >> 6) & 14) | 48, 4);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar, 2), kVarP);
            ff.b(f3.q.c(i10, kVarP), null, zA ? j10 : e2Var.f25773s, 0L, zA ? x2.p.f32032e : x2.p.f32030c, null, 0L, null, 0L, 0, false, 0, 0, ((nf) kVarP.f(of.f26647a)).f26552o, kVarP, 0, 0, 65498);
            kVarP = kVarP;
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, dVar, i10, i11) { // from class: c9.d0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f5081b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w1.d f5082c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f5083d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    r0.o(this.f5080a, this.f5081b, this.f5082c, this.f5083d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void p(final s1 s1Var, final int i10, x0.j jVar, final int i11) {
        x0.k kVarP = jVar.p(-230752032);
        if ((((kVarP.l(s1Var) ? 4 : 2) | i11 | (kVarP.i(i10) ? 32 : 16)) & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            h0.e eVarA = h0.f.a(18);
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarD = e1.d.d(aVar, eVarA);
            long j10 = ((e2) kVarP.f(f2.f25858a)).H;
            y1.a aVar2 = q1.y1.f21750a;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.a.b(dVarD, j10, aVar2), 2);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            int i12 = kVarP.P;
            a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarH, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar3 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar3);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, m1VarA, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            kVarP.L(-430078373);
            boolean z10 = false;
            final int i13 = 0;
            while (i13 < i10) {
                boolean z11 = s1Var.f5283o.g() == i13 ? true : z10;
                androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(aVar, 36);
                h0.e eVar = h0.f.f12083a;
                androidx.compose.ui.d dVarD2 = e1.d.d(dVarN, eVar);
                long j11 = f5187a;
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarD2, z11 ? q1.b1.c(0.18f, j11) : q1.b1.f21653g, aVar2);
                kVarP.L(-1922881341);
                boolean zL = kVarP.l(s1Var) | kVarP.i(i13);
                Object objG = kVarP.g();
                if (zL || objG == j.a.f31715a) {
                    objG = new eh.a() { // from class: c9.i0
                        @Override // eh.a
                        public final Object invoke() {
                            s1Var.f5283o.f(i13);
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG);
                }
                kVarP.T(z10);
                androidx.compose.ui.d dVarC2 = androidx.compose.foundation.b.c(dVarB, false, null, null, (eh.a) objG, 7);
                g2.l0 l0VarD = z.g.d(d.a.f14606e, z10);
                int i14 = kVarP.P;
                a2 a2VarP2 = kVarP.P();
                androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarC2, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar4 = g.a.f13863b;
                kVarP.r();
                int i15 = i13;
                if (kVarP.O) {
                    kVarP.w(aVar4);
                } else {
                    kVarP.z();
                }
                ph.v1.j(g.a.f13867f, l0VarD, kVarP);
                ph.v1.j(g.a.f13866e, a2VarP2, kVarP);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i14))) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i14, kVarP, i14, c0128a2);
                }
                ph.v1.j(g.a.f13865d, dVarC3, kVarP);
                androidx.compose.ui.d dVarN2 = androidx.compose.foundation.layout.g.n(aVar, (i15 * 5) + 5);
                kVarP.L(1569436486);
                if (!z11) {
                    j11 = ((e2) kVarP.f(f2.f25858a)).f25773s;
                }
                kVarP.T(false);
                z.g.a(androidx.compose.foundation.a.b(dVarN2, j11, eVar), kVarP, 0);
                kVarP.T(true);
                i13 = i15 + 1;
                z10 = false;
            }
            kVarP.T(z10);
            kVarP.T(true);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, i11) { // from class: c9.j0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f5116b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    r0.p(this.f5115a, this.f5116b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final boolean q(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!set.contains(Long.valueOf(((c9.b) obj).f5057a))) {
                break;
            }
            arrayList.add(obj);
        }
        return arrayList.size() == set.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c9.e r(s1 s1Var, float[] fArr) {
        if (fArr.length == 0) {
            return null;
        }
        boolean zA = kotlin.jvm.internal.r.a((String) s1Var.f5280l.getValue(), "highlighter");
        return new c9.e(fArr, zA ? s1Var.f5282n.g() : s1Var.f5281m.g(), (zA ? s1.D : s1.C).get(s1Var.f5283o.g()).floatValue(), zA);
    }
}
