package i9;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import c2.n0;
import c9.u1;
import com.yalantis.ucrop.view.CropImageView;
import d0.d2;
import g2.l0;
import hh.c;
import i2.e0;
import i2.g;
import j1.d;
import j2.j2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import ph.i0;
import ph.v1;
import q1.b1;
import q1.j0;
import q1.u0;
import q8.x1;
import s.l1;
import s.m2;
import s.p0;
import s.y0;
import t.t0;
import t0.d1;
import t0.ff;
import t0.z0;
import x0.a2;
import x0.h2;
import x0.j;
import x0.k1;
import x0.o0;
import x0.r3;

/* loaded from: classes.dex */
public final class z {

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.support.SupportThankYouOverlayKt$FloatingEmojiParticle$1$1", f = "SupportThankYouOverlay.kt", l = {523, 524}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14407a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f14408b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f14409c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f14410d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s.b<Float, s.o> bVar, s.b<Float, s.o> bVar2, eh.a<pg.f0> aVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f14408b = bVar;
            this.f14409c = bVar2;
            this.f14410d = aVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f14408b, this.f14409c, this.f14410d, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
        
            if (s.b.c(r9.f14409c, r6, r7, null, r9, 12) == r0) goto L15;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            ug.a aVar2 = ug.a.f29706a;
            int i10 = this.f14407a;
            if (i10 == 0) {
                pg.q.b(obj);
                Float f10 = new Float(-70.0f);
                m2 m2VarD = s.m.d(1100, 0, s.d0.f23703a, 2);
                this.f14407a = 1;
                aVar = this;
                if (s.b.c(this.f14408b, f10, m2VarD, null, aVar, 12) != aVar2) {
                }
                return aVar2;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                aVar = this;
                aVar.f14410d.invoke();
                return pg.f0.f21461a;
            }
            pg.q.b(obj);
            aVar = this;
            Float f11 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
            m2 m2VarD2 = s.m.d(300, 0, null, 6);
            aVar.f14407a = 2;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.support.SupportThankYouOverlayKt$SupportThankYouOverlay$2$1", f = "SupportThankYouOverlay.kt", l = {}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1.a f14411a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y1.a aVar, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f14411a = aVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f14411a, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            this.f14411a.a(0);
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.support.SupportThankYouOverlayKt$SupportThankYouOverlay$3$1", f = "SupportThankYouOverlay.kt", l = {157, 158, 159}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f14412a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f14413b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f14414c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f14415d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s.b<Float, s.o> bVar, s.b<Float, s.o> bVar2, s.b<Float, s.o> bVar3, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f14413b = bVar;
            this.f14414c = bVar2;
            this.f14415d = bVar3;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new c(this.f14413b, this.f14414c, this.f14415d, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
        
            if (s.b.c(r12.f14415d, r9, r10, null, r12, 12) != r0) goto L21;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c cVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f14412a;
            if (i10 == 0) {
                pg.q.b(obj);
                Float f10 = new Float(1.0f);
                m2 m2VarD = s.m.d(300, 0, s.d0.f23706d, 2);
                this.f14412a = 1;
                cVar = this;
                if (s.b.c(this.f14413b, f10, m2VarD, null, cVar, 12) != aVar) {
                }
                return aVar;
            }
            if (i10 == 1) {
                pg.q.b(obj);
                cVar = this;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    return pg.f0.f21461a;
                }
                pg.q.b(obj);
                cVar = this;
                Float f11 = new Float(1.0f);
                l1 l1VarC = s.m.c(0.5f, 200.0f, null, 4);
                cVar.f14412a = 3;
            }
            Float f12 = new Float(1.0f);
            m2 m2VarD2 = s.m.d(350, 0, null, 6);
            cVar.f14412a = 2;
            if (s.b.c(cVar.f14414c, f12, m2VarD2, null, cVar, 12) != aVar) {
                Float f112 = new Float(1.0f);
                l1 l1VarC2 = s.m.c(0.5f, 200.0f, null, 4);
                cVar.f14412a = 3;
            }
            return aVar;
        }
    }

    public static final class d implements eh.q<z.n, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1.u<i9.a> f14416a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f14417b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f14418c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f14419d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r3<Float> f14420e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r3<Float> f14421f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ f3.d f14422g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ y1.a f14423h;

        public d(h1.u<i9.a> uVar, s.b<Float, s.o> bVar, s.b<Float, s.o> bVar2, eh.a<pg.f0> aVar, r3<Float> r3Var, r3<Float> r3Var2, f3.d dVar, y1.a aVar2) {
            this.f14416a = uVar;
            this.f14417b = bVar;
            this.f14418c = bVar2;
            this.f14419d = aVar;
            this.f14420e = r3Var;
            this.f14421f = r3Var2;
            this.f14422g = dVar;
            this.f14423h = aVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r18v1 */
        /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r18v3 */
        /* JADX WARN: Type inference failed for: r2v35 */
        /* JADX WARN: Type inference failed for: r2v36, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v43 */
        @Override // eh.q
        public final pg.f0 b(z.n nVar, x0.j jVar, Integer num) {
            Object e0Var;
            ?? r22;
            ?? r18;
            final f0 f0Var;
            int iIntValue;
            z.n BoxWithConstraints = nVar;
            x0.j jVar2 = jVar;
            int iIntValue2 = num.intValue();
            kotlin.jvm.internal.r.e(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue2 & 6) == 0) {
                iIntValue2 |= jVar2.K(BoxWithConstraints) ? 4 : 2;
            }
            if ((iIntValue2 & 19) == 18 && jVar2.s()) {
                jVar2.v();
            } else {
                float fI = f3.b.i(BoxWithConstraints.c());
                float fH = f3.b.h(BoxWithConstraints.c());
                FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
                z.g.a(androidx.compose.foundation.a.a(fillElement, u0.a.c(qg.p.j(new b1(b1.c(0.95f, n0.c(4280949514L))), new b1(b1.c(0.97f, n0.c(4279635461L))), new b1(b1.c(0.98f, n0.c(4278846978L)))), 0L, (fI + fH) * 0.55f, 10)), jVar2, 0);
                z.a(fillElement, jVar2, 6);
                androidx.compose.ui.d dVarF = d0.h.f(androidx.compose.foundation.layout.f.j(fillElement, 24, CropImageView.DEFAULT_ASPECT_RATIO, 2));
                l0 l0VarD = z.g.d(d.a.f14606e, false);
                int iD = jVar2.D();
                a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarF, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                if (jVar2.t() == null) {
                    u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                v1.j(g.a.f13867f, l0VarD, jVar2);
                v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                v1.j(g.a.f13865d, dVarC, jVar2);
                d.a aVar2 = d.a.f1143b;
                androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(aVar2, 1.0f);
                float fFloatValue = this.f14417b.d().floatValue();
                x0.j jVar3 = jVar2;
                tg.e eVar = null;
                d1.a(c9.g.b(d2.c(dVarD, fFloatValue, fFloatValue), this.f14418c.d().floatValue()), h0.f.a(28), z0.a(b1.c(0.94f, n0.c(4280161288L)), jVar2, 6), null, new t.v(2, u0.a.b(qg.p.j(new b1(n0.c(4294956800L)), new b1(n0.c(4294942720L)), new b1(n0.c(4294929259L)), new b1(n0.c(4294956800L))))), f1.c.b(558918657, new c0(this.f14419d, this.f14420e, this.f14421f), jVar2), jVar3, 221184, 8);
                jVar3.H();
                jVar3.L(775593317);
                Object objG = jVar3.g();
                j.a.C0321a c0321a = j.a.f31715a;
                if (objG == c0321a) {
                    List<k8.d> list = k8.e.f16082a;
                    ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((k8.d) it.next()).f16072a);
                    }
                    objG = arrayList.isEmpty() ? qg.p.j("cat_tabby", "cat_ginger", "cat_siamese", "cat_stray") : arrayList;
                    jVar3.C(objG);
                }
                List list2 = (List) objG;
                jVar3.B();
                jVar3.L(775600357);
                boolean zH = jVar3.h(fI) | jVar3.h(fH);
                Object objG2 = jVar3.g();
                Object obj = objG2;
                if (zH || objG2 == c0321a) {
                    ArrayList arrayList2 = new ArrayList(12);
                    int i10 = 0;
                    for (int i11 = 12; i10 < i11; i11 = 12) {
                        c.a aVar3 = hh.c.f13027a;
                        aVar3.getClass();
                        float f10 = fI - 100.0f;
                        float f11 = fH - 160.0f;
                        int i12 = i10;
                        f0 f0Var2 = new f0(i12, hh.c.f13028b.d(46, 56), aVar3.g() * (f10 < 10.0f ? 10.0f : f10), (aVar3.g() * (f11 < 10.0f ? 10.0f : f11)) + 40.0f, (aVar3.g() * 1.5f) + 1.2f, (String) list2.get(i10 % list2.size()));
                        float fG = aVar3.g();
                        if (f10 < 10.0f) {
                            f10 = 10.0f;
                        }
                        x0.u1 u1Var = f0Var2.f14330g;
                        u1Var.e(fG * f10);
                        f0Var2.f14331h.e((aVar3.g() * (f11 >= 10.0f ? f11 : 10.0f)) + 40.0f);
                        f0Var2.f14332i.setValue(Boolean.valueOf(u1Var.getFloatValue() < f0Var2.f14328e.getFloatValue()));
                        arrayList2.add(f0Var2);
                        i10 = i12 + 1;
                    }
                    jVar3.C(arrayList2);
                    obj = arrayList2;
                }
                jVar3.B();
                jVar3.L(775637742);
                Iterator it2 = ((List) obj).iterator();
                x0.j jVar4 = jVar3;
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    final h1.u<i9.a> uVar = this.f14416a;
                    if (!zHasNext) {
                        jVar4.B();
                        ListIterator<i9.a> listIterator = uVar.listIterator();
                        while (true) {
                            h1.c0 c0Var = (h1.c0) listIterator;
                            if (!c0Var.hasNext()) {
                                break;
                            }
                            i9.a aVar4 = (i9.a) c0Var.next();
                            jVar4.L(1280545687);
                            boolean zK = jVar4.K(aVar4);
                            Object objG3 = jVar4.g();
                            if (zK || objG3 == c0321a) {
                                objG3 = new androidx.credentials.playservices.o(1, uVar, aVar4);
                                jVar4.C(objG3);
                            }
                            jVar4.B();
                            z.b(aVar4, (eh.a) objG3, jVar4, 0);
                        }
                    } else {
                        f0 f0Var3 = (f0) it2.next();
                        String str = f0Var3.f14327d;
                        x0.v1 v1Var = f0Var3.f14334k;
                        jVar4.L(1280364412);
                        boolean zK2 = jVar4.K(str);
                        Object objG4 = jVar4.g();
                        if (zK2 || objG4 == c0321a) {
                            objG4 = k8.c.a(f0Var3.f14327d);
                            jVar4.C(objG4);
                        }
                        k8.b bVar = (k8.b) objG4;
                        jVar4.B();
                        e eVarA = f0Var3.a();
                        jVar4.L(1280369493);
                        boolean zK3 = jVar4.K(f0Var3) | jVar4.l(bVar);
                        Object objG5 = jVar4.g();
                        if (zK3 || objG5 == c0321a) {
                            objG5 = new d0(f0Var3, bVar, eVar);
                            jVar4.C(objG5);
                        }
                        jVar4.B();
                        o0.d((eh.p) objG5, eVarA, jVar4);
                        Integer numValueOf = Integer.valueOf(f0Var3.f14324a);
                        jVar4.L(1280395599);
                        f3.d dVar = this.f14422g;
                        boolean zK4 = jVar4.K(dVar) | jVar4.K(f0Var3) | jVar4.h(fI) | jVar4.h(fH);
                        Object objG6 = jVar4.g();
                        if (zK4 || objG6 == c0321a) {
                            r22 = 0;
                            r18 = 0;
                            e0Var = new e0(dVar, fI, fH, f0Var3, null);
                            f0Var = f0Var3;
                            jVar4.C(e0Var);
                        } else {
                            e0Var = objG6;
                            r18 = 0;
                            f0Var = f0Var3;
                            r22 = 0;
                        }
                        jVar4.B();
                        o0.d((eh.p) e0Var, numValueOf, jVar4);
                        int iOrdinal = f0Var.a().ordinal();
                        if (iOrdinal == 0) {
                            List<Integer> list3 = bVar.f16067a;
                            int iG = v1Var.g() % list3.size();
                            iIntValue = ((iG < 0 || iG >= list3.size()) ? Integer.valueOf(list3.get(r22).intValue()) : list3.get(iG)).intValue();
                        } else if (iOrdinal == 1) {
                            List<Integer> list4 = bVar.f16068b;
                            int iG2 = v1Var.g() % list4.size();
                            iIntValue = ((iG2 < 0 || iG2 >= list4.size()) ? Integer.valueOf(list4.get(r22).intValue()) : list4.get(iG2)).intValue();
                        } else {
                            if (iOrdinal != 2) {
                                throw new pg.l();
                            }
                            List<Integer> list5 = bVar.f16070d;
                            int iG3 = v1Var.g() % list5.size();
                            iIntValue = ((iG3 < 0 || iG3 >= list5.size()) ? Integer.valueOf(list5.get(r22).intValue()) : list5.get(iG3)).intValue();
                        }
                        androidx.compose.ui.d dVarC2 = j1.l.c(androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.e.b(aVar2, dVar.v(f0Var.f14328e.getFloatValue()), dVar.v(f0Var.f14329f.getFloatValue())), f0Var.f14325b), 15.0f);
                        jVar4.L(1280495231);
                        Object objG7 = jVar4.g();
                        if (objG7 == c0321a) {
                            objG7 = new x.n();
                            jVar4.C(objG7);
                        }
                        x.m mVar = (x.m) objG7;
                        jVar4.B();
                        jVar4.L(1280499705);
                        final y1.a aVar5 = this.f14423h;
                        boolean zL = jVar4.l(aVar5) | jVar4.K(f0Var);
                        Object objG8 = jVar4.g();
                        if (zL || objG8 == c0321a) {
                            objG8 = new eh.a() { // from class: i9.a0
                                @Override // eh.a
                                public final Object invoke() {
                                    aVar5.a(9);
                                    e eVar2 = e.f14311c;
                                    f0 f0Var4 = f0Var;
                                    f0Var4.f14333j.setValue(eVar2);
                                    List listJ = qg.p.j("❤️", "🐾", "🥰", "✨", "😻", "😽", "💛");
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    c.a aVar6 = hh.c.f13027a;
                                    aVar6.getClass();
                                    hh.a aVar7 = hh.c.f13028b;
                                    uVar.add(new a(jCurrentTimeMillis + aVar7.c(5000), f0Var4.f14328e.getFloatValue() + aVar7.d(-10, 20), f0Var4.f14329f.getFloatValue() - 10.0f, (String) qg.x.Q(listJ, aVar6)));
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar4.C(objG8);
                        }
                        jVar4.B();
                        androidx.compose.ui.d dVarB = androidx.compose.foundation.b.b(dVarC2, mVar, null, false, null, (eh.a) objG8, 28);
                        l0 l0VarD2 = z.g.d(d.a.f14609h, r22);
                        int iD2 = jVar4.D();
                        a2 a2VarY2 = jVar4.y();
                        androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarB, jVar4);
                        i2.g.f13861o.getClass();
                        e0.a aVar6 = g.a.f13863b;
                        if (jVar4.t() == null) {
                            u1.d();
                            throw r18;
                        }
                        jVar4.r();
                        if (jVar4.m()) {
                            jVar4.w(aVar6);
                        } else {
                            jVar4.z();
                        }
                        v1.j(g.a.f13867f, l0VarD2, jVar4);
                        v1.j(g.a.f13866e, a2VarY2, jVar4);
                        g.a.C0128a c0128a2 = g.a.f13868g;
                        if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD2))) {
                            l9.i.a(iD2, jVar4, iD2, c0128a2);
                        }
                        v1.j(g.a.f13865d, dVarC3, jVar4);
                        x0.j jVar5 = jVar4;
                        t0.b(o2.a.a(iIntValue, jVar4), null, d2.c(androidx.compose.foundation.layout.g.f976c, ((Boolean) f0Var.f14332i.getValue()).booleanValue() ? -1.0f : 1.0f, 1.0f), null, jVar5, 48, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
                        x0.j jVar6 = jVar5;
                        jVar6.H();
                        eVar = r18;
                        jVar4 = jVar6;
                    }
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(-1981229057);
        if ((i10 & 3) == 2 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.L(-798393426);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new h1.u();
                kVarP.C(objG);
            }
            final h1.u uVar = (h1.u) objG;
            Object objA = p0.h.a(kVarP, false, -798391140);
            if (objA == c0321a) {
                objA = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objA);
            }
            final k1 k1Var = (k1) objA;
            Object objA2 = p0.h.a(kVarP, false, -798389380);
            if (objA2 == c0321a) {
                objA2 = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objA2);
            }
            final k1 k1Var2 = (k1) objA2;
            kVarP.T(false);
            List listJ = qg.p.j(new b1(n0.c(4294956800L)), new b1(n0.c(4294929259L)), new b1(n0.c(4283354564L)), new b1(n0.c(4282759121L)), new b1(n0.c(4294942720L)), new b1(n0.c(4293467747L)), new b1(n0.c(4294918273L)), new b1(n0.c(4278248908L)));
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(-798377558);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new y(uVar, k1Var, k1Var2, listJ, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            o0.d((eh.p) objG2, f0Var, kVarP);
            kVarP.L(-798316247);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = new eh.l() { // from class: i9.v
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        s1.e Canvas = (s1.e) obj;
                        kotlin.jvm.internal.r.e(Canvas, "$this$Canvas");
                        k1Var.e(Float.intBitsToFloat((int) (Canvas.i() >> 32)));
                        k1Var2.e(Float.intBitsToFloat((int) (Canvas.i() & BodyPartID.bodyIdMax)));
                        ListIterator listIterator = uVar.listIterator();
                        while (true) {
                            h1.c0 c0Var = (h1.c0) listIterator;
                            if (!c0Var.hasNext()) {
                                return pg.f0.f21461a;
                            }
                            b bVar = (b) c0Var.next();
                            float f10 = bVar.f14279c;
                            float f11 = bVar.f14278b;
                            float f12 = bVar.f14277a;
                            float f13 = f10 / 2.0f;
                            if (bVar.f14285i == 1) {
                                s1.e.f0(Canvas, bVar.f14280d, f13, (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f12) << 32), null, 0, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
                            } else {
                                s1.e.X0(Canvas, bVar.f14280d, (Float.floatToRawIntBits(f12 - f13) << 32) | (Float.floatToRawIntBits(f11 - f13) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(0.7f * r5) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(bVar.f14279c) << 32), CropImageView.DEFAULT_ASPECT_RATIO, null, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
                            }
                        }
                    }
                };
                kVarP.C(objG3);
            }
            kVarP.T(false);
            t.w.a(dVar, (eh.l) objG3, kVarP, 54);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: i9.w
                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(7);
                    z.a(this.f14397a, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final i9.a aVar, final eh.a<pg.f0> aVar2, x0.j jVar, final int i10) {
        x0.k kVar;
        x0.k kVarP = jVar.p(773970880);
        int i11 = (kVarP.K(aVar) ? 4 : 2) | i10 | (kVarP.l(aVar2) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            f3.d dVar = (f3.d) kVarP.f(j2.f14779h);
            kVarP.L(1870419795);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = s.d.a(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objG);
            }
            s.b bVar = (s.b) objG;
            Object objA = p0.h.a(kVarP, false, 1870421331);
            if (objA == c0321a) {
                objA = s.d.a(1.0f);
                kVarP.C(objA);
            }
            s.b bVar2 = (s.b) objA;
            kVarP.T(false);
            Long lValueOf = Long.valueOf(aVar.f14270a);
            kVarP.L(1870423279);
            boolean zL = ((i11 & 112) == 32) | kVarP.l(bVar) | kVarP.l(bVar2);
            Object objG2 = kVarP.g();
            if (zL || objG2 == c0321a) {
                objG2 = new a(bVar, bVar2, aVar2, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            o0.d((eh.p) objG2, lValueOf, kVarP);
            kVar = kVarP;
            ff.b(aVar.f14273d, c9.g.b(androidx.compose.foundation.layout.e.b(d.a.f1143b, dVar.v(aVar.f14271b), dVar.v(((Number) bVar.d()).floatValue() + aVar.f14272c)), ((Number) bVar2.d()).floatValue()), 0L, f3.u.c(22), null, null, 0L, null, 0L, 0, false, 0, 0, null, kVar, 3072, 0, 131060);
        }
        h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar2, i10) { // from class: i9.u

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f14393b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    z.b(this.f14392a, this.f14393b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void c(final int i10, eh.a onDismiss, x0.j jVar) {
        s.b bVar;
        s.b bVar2;
        r3 r3VarA;
        r3 r3VarA2;
        final eh.a aVar;
        kotlin.jvm.internal.r.e(onDismiss, "onDismiss");
        x0.k kVarP = jVar.p(1119985916);
        if ((i10 & 3) == 2 && kVarP.s()) {
            kVarP.v();
            aVar = onDismiss;
        } else {
            kVarP.L(-1647485207);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = new f9.v(onDismiss, 2);
                kVarP.C(objG);
            }
            kVarP.T(false);
            c.e.a(0, 1, (eh.a) objG, kVarP, false);
            y1.a aVar2 = (y1.a) kVarP.f(j2.f14783l);
            f3.d dVar = (f3.d) kVarP.f(j2.f14779h);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(-1647481084);
            boolean zL = kVarP.l(aVar2);
            Object objG2 = kVarP.g();
            if (zL || objG2 == obj) {
                objG2 = new b(aVar2, null);
                kVarP.C(objG2);
            }
            kVarP.T(false);
            o0.d((eh.p) objG2, f0Var, kVarP);
            kVarP.L(-1647477963);
            Object objG3 = kVarP.g();
            if (objG3 == obj) {
                objG3 = s.d.a(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objG3);
            }
            s.b bVar3 = (s.b) objG3;
            Object objA = p0.h.a(kVarP, false, -1647476424);
            if (objA == obj) {
                objA = s.d.a(0.65f);
                kVarP.C(objA);
            }
            s.b bVar4 = (s.b) objA;
            Object objA2 = p0.h.a(kVarP, false, -1647474795);
            if (objA2 == obj) {
                objA2 = s.d.a(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objA2);
            }
            s.b bVar5 = (s.b) objA2;
            kVarP.T(false);
            kVarP.L(-1647472742);
            boolean zL2 = kVarP.l(bVar3) | kVarP.l(bVar5) | kVarP.l(bVar4);
            Object objG4 = kVarP.g();
            if (zL2 || objG4 == obj) {
                objG4 = new c(bVar3, bVar5, bVar4, null);
                kVarP.C(objG4);
            }
            kVarP.T(false);
            o0.d((eh.p) objG4, f0Var, kVarP);
            kVarP.L(-1647460915);
            Object objG5 = kVarP.g();
            if (objG5 == obj) {
                objG5 = new h1.u();
                kVarP.C(objG5);
            }
            h1.u uVar = (h1.u) objG5;
            kVarP.T(false);
            boolean zA = x1.a(kVarP);
            s.l0 l0VarC = p0.c("rays", kVarP, 0);
            if (zA) {
                kVarP.L(468628228);
                kVarP.L(-1647450946);
                Object objG6 = kVarP.g();
                if (objG6 == obj) {
                    objG6 = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
                    kVarP.C(objG6);
                }
                r3VarA = (k1) objG6;
                kVarP.T(false);
                kVarP.T(false);
                bVar = bVar4;
                bVar2 = bVar5;
            } else {
                kVarP.L(-1647448770);
                bVar = bVar4;
                bVar2 = bVar5;
                r3VarA = p0.a(l0VarC, CropImageView.DEFAULT_ASPECT_RATIO, 360.0f, s.m.a(s.m.d(14000, 0, s.d0.f23706d, 2), y0.f23998a, 4), "ray_rot", kVarP, 29112, 0);
                kVarP.T(false);
            }
            r3 r3Var = r3VarA;
            if (zA) {
                kVarP.L(468981380);
                kVarP.L(-1647439554);
                Object objG7 = kVarP.g();
                if (objG7 == obj) {
                    objG7 = new x0.u1(1.0f);
                    kVarP.C(objG7);
                }
                r3VarA2 = (k1) objG7;
                kVarP.T(false);
            } else {
                kVarP.L(-1647437364);
                r3VarA2 = p0.a(l0VarC, 0.96f, 1.06f, s.m.a(s.m.d(1200, 0, s.d0.f23703a, 2), y0.f23999b, 4), "badge_pulse", kVarP, 29112, 0);
            }
            kVarP.T(false);
            r3 r3Var2 = r3VarA2;
            androidx.compose.ui.d dVarB = c9.g.b(j1.l.c(androidx.compose.foundation.layout.g.f976c, 10000.0f), ((Number) bVar3.d()).floatValue());
            d dVar2 = new d(uVar, bVar, bVar2, onDismiss, r3Var, r3Var2, dVar, aVar2);
            aVar = onDismiss;
            z.m.a(dVarB, null, f1.c.b(225850194, dVar2, kVarP), kVarP, 3072, 6);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10, aVar) { // from class: i9.t

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ eh.a f14391a;

                {
                    this.f14391a = aVar;
                }

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    z.c(f3.i.n(7), this.f14391a, (x0.j) obj2);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void d(s1.e eVar, long j10, float f10, long j11) {
        float f11 = (float) (6.283185307179586d / 12);
        float f12 = 0.25f * f11;
        for (int i10 = 0; i10 < 12; i10++) {
            float f13 = i10 * f11;
            j0 j0VarA = q1.l0.a();
            int i11 = (int) (j10 >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i11);
            int i12 = (int) (BodyPartID.bodyIdMax & j10);
            j0VarA.l(fIntBitsToFloat, Float.intBitsToFloat(i12));
            double d10 = f13 - f12;
            j0VarA.p((((float) Math.cos(d10)) * f10) + Float.intBitsToFloat(i11), (((float) Math.sin(d10)) * f10) + Float.intBitsToFloat(i12));
            double d11 = f13 + f12;
            j0VarA.p((((float) Math.cos(d11)) * f10) + Float.intBitsToFloat(i11), (((float) Math.sin(d11)) * f10) + Float.intBitsToFloat(i12));
            j0VarA.close();
            s1.e.P0(eVar, j0VarA, j11, null, 0, 60);
        }
    }
}
