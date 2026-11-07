package t2;

import android.util.Log;
import e3.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.b1;
import q1.e2;
import t2.b;
import t2.i;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final g1.n f27891a;

    /* renamed from: b, reason: collision with root package name */
    public static final g1.n f27892b;

    /* renamed from: c, reason: collision with root package name */
    public static final g1.n f27893c;

    /* renamed from: d, reason: collision with root package name */
    public static final g1.n f27894d;

    /* renamed from: e, reason: collision with root package name */
    public static final g1.n f27895e;

    /* renamed from: f, reason: collision with root package name */
    public static final g1.n f27896f;

    /* renamed from: g, reason: collision with root package name */
    public static final g1.n f27897g;

    /* renamed from: h, reason: collision with root package name */
    public static final g1.n f27898h;

    /* renamed from: i, reason: collision with root package name */
    public static final g1.n f27899i;

    /* renamed from: j, reason: collision with root package name */
    public static final g1.n f27900j;

    /* renamed from: k, reason: collision with root package name */
    public static final g1.n f27901k;

    /* renamed from: l, reason: collision with root package name */
    public static final g1.n f27902l;

    /* renamed from: m, reason: collision with root package name */
    public static final g1.n f27903m;

    /* renamed from: n, reason: collision with root package name */
    public static final g1.n f27904n;

    /* renamed from: o, reason: collision with root package name */
    public static final g1.n f27905o;

    /* renamed from: p, reason: collision with root package name */
    public static final t2.z f27906p;

    /* renamed from: q, reason: collision with root package name */
    public static final t2.z f27907q;

    /* renamed from: r, reason: collision with root package name */
    public static final t2.z f27908r;

    /* renamed from: s, reason: collision with root package name */
    public static final g1.n f27909s;

    /* renamed from: t, reason: collision with root package name */
    public static final g1.n f27910t;

    /* renamed from: u, reason: collision with root package name */
    public static final g1.n f27911u;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<g1.o, t2.b, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27912a = new a(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, t2.b bVar) {
            t2.b bVar2 = bVar;
            return qg.p.f(bVar2.f27761b, y.a(bVar2.f27760a, y.f27891a, oVar));
        }
    }

    public static final class a0 extends kotlin.jvm.internal.s implements eh.p<g1.o, e2, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final a0 f27913a = new a0(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, e2 e2Var) {
            g1.o oVar2 = oVar;
            e2 e2Var2 = e2Var;
            return qg.p.f(y.a(new b1(e2Var2.f21688a), y.f27906p, oVar2), y.a(new p1.c(e2Var2.f21689b), y.f27908r, oVar2), Float.valueOf(e2Var2.f21690c));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<Object, t2.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27914a = new b(1);

        @Override // eh.l
        public final t2.b invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(1);
            List list2 = (kotlin.jvm.internal.r.a(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) y.f27891a.f11311b.invoke(obj2);
            Object obj3 = list.get(0);
            String str = obj3 != null ? (String) obj3 : null;
            kotlin.jvm.internal.r.b(str);
            return new t2.b((List<? extends b.c<? extends b.a>>) list2, str);
        }
    }

    public static final class b0 extends kotlin.jvm.internal.s implements eh.l<Object, e2> {

        /* renamed from: a, reason: collision with root package name */
        public static final b0 f27915a = new b0(1);

        @Override // eh.l
        public final e2 invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            int i10 = b1.f21655i;
            t2.z zVar = y.f27906p;
            Boolean bool = Boolean.FALSE;
            b1 b1Var = ((kotlin.jvm.internal.r.a(obj2, bool) && zVar == null) || obj2 == null) ? null : (b1) zVar.f27959b.invoke(obj2);
            kotlin.jvm.internal.r.b(b1Var);
            long j10 = b1Var.f21656a;
            Object obj3 = list.get(1);
            t2.z zVar2 = y.f27908r;
            p1.c cVar = ((kotlin.jvm.internal.r.a(obj3, bool) && zVar2 == null) || obj3 == null) ? null : (p1.c) zVar2.f27959b.invoke(obj3);
            kotlin.jvm.internal.r.b(cVar);
            long j11 = cVar.f21129a;
            Object obj4 = list.get(2);
            Float f10 = obj4 != null ? (Float) obj4 : null;
            kotlin.jvm.internal.r.b(f10);
            return new e2(j10, j11, f10.floatValue());
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.p<g1.o, List<? extends b.c<? extends Object>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27916a = new c(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, List<? extends b.c<? extends Object>> list) {
            g1.o oVar2 = oVar;
            List<? extends b.c<? extends Object>> list2 = list;
            ArrayList arrayList = new ArrayList(list2.size());
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(y.a(list2.get(i10), y.f27892b, oVar2));
            }
            return arrayList;
        }
    }

    public static final class c0 extends kotlin.jvm.internal.s implements eh.p<g1.o, t2.b0, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final c0 f27917a = new c0(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, t2.b0 b0Var) {
            g1.o oVar2 = oVar;
            t2.b0 b0Var2 = b0Var;
            b1 b1Var = new b1(b0Var2.f27775a.j());
            t2.z zVar = y.f27906p;
            Object objA = y.a(b1Var, zVar, oVar2);
            f3.t tVar = new f3.t(b0Var2.f27776b);
            t2.z zVar2 = y.f27907q;
            Object objA2 = y.a(tVar, zVar2, oVar2);
            x2.p pVar = b0Var2.f27777c;
            x2.p pVar2 = x2.p.f32029b;
            Object objA3 = y.a(pVar, y.f27903m, oVar2);
            x2.n nVar = b0Var2.f27778d;
            x2.o oVar3 = b0Var2.f27779e;
            String str = b0Var2.f27781g;
            Object objA4 = y.a(new f3.t(b0Var2.f27782h), zVar2, oVar2);
            Object objA5 = y.a(b0Var2.f27783i, y.f27904n, oVar2);
            Object objA6 = y.a(b0Var2.f27784j, y.f27901k, oVar2);
            a3.c cVar = b0Var2.f27785k;
            a3.c cVar2 = a3.c.f24c;
            Object objA7 = y.a(cVar, y.f27909s, oVar2);
            Object objA8 = y.a(new b1(b0Var2.f27786l), zVar, oVar2);
            Object objA9 = y.a(b0Var2.f27787m, y.f27900j, oVar2);
            e2 e2Var = b0Var2.f27788n;
            e2 e2Var2 = e2.f21687d;
            return qg.p.f(objA, objA2, objA3, nVar, oVar3, -1, str, objA4, objA5, objA6, objA7, objA8, objA9, y.a(e2Var, y.f27905o, oVar2));
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<Object, List<? extends b.c<? extends Object>>> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f27918a = new d(1);

        @Override // eh.l
        public final List<? extends b.c<? extends Object>> invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                g1.n nVar = y.f27892b;
                b.c cVar = null;
                if (!kotlin.jvm.internal.r.a(obj2, Boolean.FALSE) && obj2 != null) {
                    cVar = (b.c) nVar.f11311b.invoke(obj2);
                }
                kotlin.jvm.internal.r.b(cVar);
                arrayList.add(cVar);
            }
            return arrayList;
        }
    }

    public static final class d0 extends kotlin.jvm.internal.s implements eh.l<Object, t2.b0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d0 f27919a = new d0(1);

        @Override // eh.l
        public final t2.b0 invoke(Object obj) {
            e2 e2Var;
            long j10;
            x2.n nVar;
            x2.o oVar;
            long j11;
            e3.m mVar;
            a3.c cVar;
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            int i10 = b1.f21655i;
            t2.z zVar = y.f27906p;
            Boolean bool = Boolean.FALSE;
            b1 b1Var = ((kotlin.jvm.internal.r.a(obj2, bool) && zVar == null) || obj2 == null) ? null : (b1) zVar.f27959b.invoke(obj2);
            kotlin.jvm.internal.r.b(b1Var);
            long j12 = b1Var.f21656a;
            Object obj3 = list.get(1);
            f3.v[] vVarArr = f3.t.f8832b;
            t2.z zVar2 = y.f27907q;
            f3.t tVar = ((kotlin.jvm.internal.r.a(obj3, bool) && zVar2 == null) || obj3 == null) ? null : (f3.t) zVar2.f27959b.invoke(obj3);
            kotlin.jvm.internal.r.b(tVar);
            long j13 = tVar.f8834a;
            Object obj4 = list.get(2);
            x2.p pVar = x2.p.f32029b;
            x2.p pVar2 = (kotlin.jvm.internal.r.a(obj4, bool) || obj4 == null) ? null : (x2.p) y.f27903m.f11311b.invoke(obj4);
            Object obj5 = list.get(3);
            x2.n nVar2 = obj5 != null ? (x2.n) obj5 : null;
            Object obj6 = list.get(4);
            x2.o oVar2 = obj6 != null ? (x2.o) obj6 : null;
            Object obj7 = list.get(6);
            String str = obj7 != null ? (String) obj7 : null;
            Object obj8 = list.get(7);
            f3.t tVar2 = ((kotlin.jvm.internal.r.a(obj8, bool) && zVar2 == null) || obj8 == null) ? null : (f3.t) zVar2.f27959b.invoke(obj8);
            kotlin.jvm.internal.r.b(tVar2);
            long j14 = tVar2.f8834a;
            Object obj9 = list.get(8);
            e3.a aVar = (kotlin.jvm.internal.r.a(obj9, bool) || obj9 == null) ? null : (e3.a) y.f27904n.f11311b.invoke(obj9);
            Object obj10 = list.get(9);
            e3.m mVar2 = (kotlin.jvm.internal.r.a(obj10, bool) || obj10 == null) ? null : (e3.m) y.f27901k.f11311b.invoke(obj10);
            Object obj11 = list.get(10);
            a3.c cVar2 = a3.c.f24c;
            e3.m mVar3 = mVar2;
            a3.c cVar3 = (kotlin.jvm.internal.r.a(obj11, bool) || obj11 == null) ? null : (a3.c) y.f27909s.f11311b.invoke(obj11);
            Object obj12 = list.get(11);
            b1 b1Var2 = ((kotlin.jvm.internal.r.a(obj12, bool) && zVar == null) || obj12 == null) ? null : (b1) zVar.f27959b.invoke(obj12);
            kotlin.jvm.internal.r.b(b1Var2);
            a3.c cVar4 = cVar3;
            x2.p pVar3 = pVar2;
            long j15 = b1Var2.f21656a;
            Object obj13 = list.get(12);
            e3.i iVar = (kotlin.jvm.internal.r.a(obj13, bool) || obj13 == null) ? null : (e3.i) y.f27900j.f11311b.invoke(obj13);
            Object obj14 = list.get(13);
            e2 e2Var2 = e2.f21687d;
            g1.n nVar3 = y.f27905o;
            if (kotlin.jvm.internal.r.a(obj14, bool) || obj14 == null) {
                j10 = j12;
                nVar = nVar2;
                oVar = oVar2;
                j11 = j14;
                mVar = mVar3;
                cVar = cVar4;
                e2Var = null;
            } else {
                e2Var = (e2) nVar3.f11311b.invoke(obj14);
                j10 = j12;
                nVar = nVar2;
                oVar = oVar2;
                j11 = j14;
                mVar = mVar3;
                cVar = cVar4;
            }
            return new t2.b0(j10, j13, pVar3, nVar, oVar, (x2.f) null, str, j11, aVar, mVar, cVar, j15, iVar, e2Var, 49184);
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.p<g1.o, b.c<? extends Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f27920a = new e(2);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.p
        public final Object invoke(g1.o oVar, b.c<? extends Object> cVar) {
            t2.f fVar;
            Object objA;
            g1.o oVar2 = oVar;
            b.c<? extends Object> cVar2 = cVar;
            T t3 = cVar2.f27771a;
            if (t3 instanceof t2.s) {
                fVar = t2.f.f27799a;
            } else if (t3 instanceof t2.b0) {
                fVar = t2.f.f27800b;
            } else if (t3 instanceof t2.o0) {
                fVar = t2.f.f27801c;
            } else if (t3 instanceof t2.n0) {
                fVar = t2.f.f27802d;
            } else if (t3 instanceof i.b) {
                fVar = t2.f.f27803e;
            } else if (t3 instanceof i.a) {
                fVar = t2.f.f27804f;
            } else {
                if (!(t3 instanceof t2.e0)) {
                    throw new UnsupportedOperationException();
                }
                fVar = t2.f.f27805g;
            }
            switch (fVar.ordinal()) {
                case 0:
                    kotlin.jvm.internal.r.c(t3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    objA = y.a((t2.s) t3, y.f27897g, oVar2);
                    break;
                case 1:
                    kotlin.jvm.internal.r.c(t3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    objA = y.a((t2.b0) t3, y.f27898h, oVar2);
                    break;
                case 2:
                    kotlin.jvm.internal.r.c(t3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    objA = y.a((t2.o0) t3, y.f27893c, oVar2);
                    break;
                case 3:
                    kotlin.jvm.internal.r.c(t3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    objA = y.a((t2.n0) t3, y.f27894d, oVar2);
                    break;
                case 4:
                    kotlin.jvm.internal.r.c(t3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    objA = y.a((i.b) t3, y.f27895e, oVar2);
                    break;
                case 5:
                    kotlin.jvm.internal.r.c(t3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                    objA = y.a((i.a) t3, y.f27896f, oVar2);
                    break;
                case 6:
                    kotlin.jvm.internal.r.c(t3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                    objA = ((t2.e0) t3).f27798a;
                    g1.n nVar = y.f27891a;
                    break;
                default:
                    throw new pg.l();
            }
            return qg.p.f(fVar, objA, Integer.valueOf(cVar2.f27772b), Integer.valueOf(cVar2.f27773c), cVar2.f27774d);
        }
    }

    public static final class e0 extends kotlin.jvm.internal.s implements eh.p<g1.o, e3.i, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final e0 f27921a = new e0(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, e3.i iVar) {
            return Integer.valueOf(iVar.f8367a);
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.l<Object, b.c<? extends Object>> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f27922a = new f(1);

        @Override // eh.l
        public final b.c<? extends Object> invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            t2.s sVar = null;
            aVar = null;
            i.a aVar = null;
            bVar = null;
            i.b bVar = null;
            n0Var = null;
            t2.n0 n0Var = null;
            o0Var = null;
            t2.o0 o0Var = null;
            b0Var = null;
            t2.b0 b0Var = null;
            sVar = null;
            t2.f fVar = obj2 != null ? (t2.f) obj2 : null;
            kotlin.jvm.internal.r.b(fVar);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            kotlin.jvm.internal.r.b(num);
            int iIntValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            kotlin.jvm.internal.r.b(num2);
            int iIntValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            kotlin.jvm.internal.r.b(str);
            switch (fVar.ordinal()) {
                case 0:
                    Object obj6 = list.get(1);
                    g1.n nVar = y.f27897g;
                    if (!kotlin.jvm.internal.r.a(obj6, Boolean.FALSE) && obj6 != null) {
                        sVar = (t2.s) nVar.f11311b.invoke(obj6);
                    }
                    kotlin.jvm.internal.r.b(sVar);
                    return new b.c<>(sVar, iIntValue, iIntValue2, str);
                case 1:
                    Object obj7 = list.get(1);
                    g1.n nVar2 = y.f27898h;
                    if (!kotlin.jvm.internal.r.a(obj7, Boolean.FALSE) && obj7 != null) {
                        b0Var = (t2.b0) nVar2.f11311b.invoke(obj7);
                    }
                    kotlin.jvm.internal.r.b(b0Var);
                    return new b.c<>(b0Var, iIntValue, iIntValue2, str);
                case 2:
                    Object obj8 = list.get(1);
                    g1.n nVar3 = y.f27893c;
                    if (!kotlin.jvm.internal.r.a(obj8, Boolean.FALSE) && obj8 != null) {
                        o0Var = (t2.o0) nVar3.f11311b.invoke(obj8);
                    }
                    kotlin.jvm.internal.r.b(o0Var);
                    return new b.c<>(o0Var, iIntValue, iIntValue2, str);
                case 3:
                    Object obj9 = list.get(1);
                    g1.n nVar4 = y.f27894d;
                    if (!kotlin.jvm.internal.r.a(obj9, Boolean.FALSE) && obj9 != null) {
                        n0Var = (t2.n0) nVar4.f11311b.invoke(obj9);
                    }
                    kotlin.jvm.internal.r.b(n0Var);
                    return new b.c<>(n0Var, iIntValue, iIntValue2, str);
                case 4:
                    Object obj10 = list.get(1);
                    g1.n nVar5 = y.f27895e;
                    if (!kotlin.jvm.internal.r.a(obj10, Boolean.FALSE) && obj10 != null) {
                        bVar = (i.b) nVar5.f11311b.invoke(obj10);
                    }
                    kotlin.jvm.internal.r.b(bVar);
                    return new b.c<>(bVar, iIntValue, iIntValue2, str);
                case 5:
                    Object obj11 = list.get(1);
                    g1.n nVar6 = y.f27896f;
                    if (!kotlin.jvm.internal.r.a(obj11, Boolean.FALSE) && obj11 != null) {
                        aVar = (i.a) nVar6.f11311b.invoke(obj11);
                    }
                    kotlin.jvm.internal.r.b(aVar);
                    return new b.c<>(aVar, iIntValue, iIntValue2, str);
                case 6:
                    Object obj12 = list.get(1);
                    String str2 = obj12 != null ? (String) obj12 : null;
                    kotlin.jvm.internal.r.b(str2);
                    return new b.c<>(new t2.e0(str2), iIntValue, iIntValue2, str);
                default:
                    throw new pg.l();
            }
        }
    }

    public static final class f0 extends kotlin.jvm.internal.s implements eh.l<Object, e3.i> {

        /* renamed from: a, reason: collision with root package name */
        public static final f0 f27923a = new f0(1);

        @Override // eh.l
        public final e3.i invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.Int");
            return new e3.i(((Integer) obj).intValue());
        }
    }

    public static final class g extends kotlin.jvm.internal.s implements eh.p<g1.o, e3.a, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final g f27924a = new g(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, e3.a aVar) {
            return Float.valueOf(aVar.f8345a);
        }
    }

    public static final class g0 extends kotlin.jvm.internal.s implements eh.p<g1.o, e3.m, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final g0 f27925a = new g0(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, e3.m mVar) {
            e3.m mVar2 = mVar;
            return qg.p.f(Float.valueOf(mVar2.f8373a), Float.valueOf(mVar2.f8374b));
        }
    }

    public static final class h extends kotlin.jvm.internal.s implements eh.l<Object, e3.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f27926a = new h(1);

        @Override // eh.l
        public final e3.a invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.Float");
            return new e3.a(((Float) obj).floatValue());
        }
    }

    public static final class h0 extends kotlin.jvm.internal.s implements eh.l<Object, e3.m> {

        /* renamed from: a, reason: collision with root package name */
        public static final h0 f27927a = new h0(1);

        @Override // eh.l
        public final e3.m invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new e3.m(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    public static final class i extends kotlin.jvm.internal.s implements eh.p<g1.o, i.a, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final i f27928a = new i(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, i.a aVar) {
            i.a aVar2 = aVar;
            String str = aVar2.f27825a;
            g1.n nVar = y.f27891a;
            return qg.p.f(str, y.a(aVar2.f27826b, y.f27899i, oVar));
        }
    }

    public static final class i0 extends kotlin.jvm.internal.s implements eh.p<g1.o, e3.n, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final i0 f27929a = new i0(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, e3.n nVar) {
            g1.o oVar2 = oVar;
            e3.n nVar2 = nVar;
            f3.t tVar = new f3.t(nVar2.f8376a);
            t2.z zVar = y.f27907q;
            return qg.p.f(y.a(tVar, zVar, oVar2), y.a(new f3.t(nVar2.f8377b), zVar, oVar2));
        }
    }

    public static final class j extends kotlin.jvm.internal.s implements eh.l<Object, i.a> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f27930a = new j(1);

        @Override // eh.l
        public final i.a invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            t2.i0 i0Var = null;
            String str = obj2 != null ? (String) obj2 : null;
            kotlin.jvm.internal.r.b(str);
            Object obj3 = list.get(1);
            g1.n nVar = y.f27899i;
            if (!kotlin.jvm.internal.r.a(obj3, Boolean.FALSE) && obj3 != null) {
                i0Var = (t2.i0) nVar.f11311b.invoke(obj3);
            }
            return new i.a(str, i0Var);
        }
    }

    public static final class j0 extends kotlin.jvm.internal.s implements eh.l<Object, e3.n> {

        /* renamed from: a, reason: collision with root package name */
        public static final j0 f27931a = new j0(1);

        @Override // eh.l
        public final e3.n invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            f3.v[] vVarArr = f3.t.f8832b;
            t2.z zVar = y.f27907q;
            Boolean bool = Boolean.FALSE;
            f3.t tVar = null;
            f3.t tVar2 = ((kotlin.jvm.internal.r.a(obj2, bool) && zVar == null) || obj2 == null) ? null : (f3.t) zVar.f27959b.invoke(obj2);
            kotlin.jvm.internal.r.b(tVar2);
            long j10 = tVar2.f8834a;
            Object obj3 = list.get(1);
            if ((!kotlin.jvm.internal.r.a(obj3, bool) || zVar != null) && obj3 != null) {
                tVar = (f3.t) zVar.f27959b.invoke(obj3);
            }
            kotlin.jvm.internal.r.b(tVar);
            return new e3.n(j10, tVar.f8834a);
        }
    }

    public static final class k extends kotlin.jvm.internal.s implements eh.p<g1.o, b1, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final k f27932a = new k(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, b1 b1Var) {
            long j10 = b1Var.f21656a;
            return j10 == 16 ? Boolean.FALSE : Integer.valueOf(c2.n0.j(j10));
        }
    }

    public static final class k0 extends kotlin.jvm.internal.s implements eh.p<g1.o, t2.i0, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final k0 f27933a = new k0(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, t2.i0 i0Var) {
            g1.o oVar2 = oVar;
            t2.i0 i0Var2 = i0Var;
            t2.b0 b0Var = i0Var2.f27829a;
            g1.n nVar = y.f27898h;
            return qg.p.f(y.a(b0Var, nVar, oVar2), y.a(i0Var2.f27830b, nVar, oVar2), y.a(i0Var2.f27831c, nVar, oVar2), y.a(i0Var2.f27832d, nVar, oVar2));
        }
    }

    public static final class l extends kotlin.jvm.internal.s implements eh.l<Object, b1> {

        /* renamed from: a, reason: collision with root package name */
        public static final l f27934a = new l(1);

        @Override // eh.l
        public final b1 invoke(Object obj) {
            if (kotlin.jvm.internal.r.a(obj, Boolean.FALSE)) {
                return new b1(b1.f21654h);
            }
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.Int");
            return new b1(c2.n0.b(((Integer) obj).intValue()));
        }
    }

    public static final class l0 extends kotlin.jvm.internal.s implements eh.l<Object, t2.i0> {

        /* renamed from: a, reason: collision with root package name */
        public static final l0 f27935a = new l0(1);

        @Override // eh.l
        public final t2.i0 invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            g1.n nVar = y.f27898h;
            Boolean bool = Boolean.FALSE;
            t2.b0 b0Var = null;
            t2.b0 b0Var2 = (kotlin.jvm.internal.r.a(obj2, bool) || obj2 == null) ? null : (t2.b0) nVar.f11311b.invoke(obj2);
            Object obj3 = list.get(1);
            t2.b0 b0Var3 = (kotlin.jvm.internal.r.a(obj3, bool) || obj3 == null) ? null : (t2.b0) nVar.f11311b.invoke(obj3);
            Object obj4 = list.get(2);
            t2.b0 b0Var4 = (kotlin.jvm.internal.r.a(obj4, bool) || obj4 == null) ? null : (t2.b0) nVar.f11311b.invoke(obj4);
            Object obj5 = list.get(3);
            if (!kotlin.jvm.internal.r.a(obj5, bool) && obj5 != null) {
                b0Var = (t2.b0) nVar.f11311b.invoke(obj5);
            }
            return new t2.i0(b0Var2, b0Var3, b0Var4, b0Var);
        }
    }

    public static final class m extends kotlin.jvm.internal.s implements eh.p<g1.o, x2.p, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final m f27936a = new m(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, x2.p pVar) {
            return Integer.valueOf(pVar.f32037a);
        }
    }

    public static final class m0 extends kotlin.jvm.internal.s implements eh.p<g1.o, t2.j0, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final m0 f27937a = new m0(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, t2.j0 j0Var) {
            long j10 = j0Var.f27839a;
            int i10 = t2.j0.f27838c;
            Integer numValueOf = Integer.valueOf((int) (j10 >> 32));
            g1.n nVar = y.f27891a;
            return qg.p.f(numValueOf, Integer.valueOf((int) (j10 & BodyPartID.bodyIdMax)));
        }
    }

    public static final class n extends kotlin.jvm.internal.s implements eh.l<Object, x2.p> {

        /* renamed from: a, reason: collision with root package name */
        public static final n f27938a = new n(1);

        @Override // eh.l
        public final x2.p invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.Int");
            return new x2.p(((Integer) obj).intValue());
        }
    }

    public static final class n0 extends kotlin.jvm.internal.s implements eh.l<Object, t2.j0> {

        /* renamed from: a, reason: collision with root package name */
        public static final n0 f27939a = new n0(1);

        @Override // eh.l
        public final t2.j0 invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            kotlin.jvm.internal.r.b(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            kotlin.jvm.internal.r.b(num2);
            return new t2.j0(t2.k0.a(iIntValue, num2.intValue()));
        }
    }

    public static final class o extends kotlin.jvm.internal.s implements eh.p<g1.o, e3.f, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final o f27940a = new o(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, e3.f fVar) {
            e3.f fVar2 = fVar;
            f.a aVar = new f.a(fVar2.f8353a);
            g1.n nVar = y.f27891a;
            return qg.p.f(aVar, new f.c(fVar2.f8354b), new f.b());
        }
    }

    public static final class o0 extends kotlin.jvm.internal.s implements eh.p<g1.o, f3.t, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final o0 f27941a = new o0(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, f3.t tVar) {
            long j10 = tVar.f8834a;
            if (f3.t.a(j10, f3.t.f8833c)) {
                return Boolean.FALSE;
            }
            Float fValueOf = Float.valueOf(f3.t.c(j10));
            g1.n nVar = y.f27891a;
            return qg.p.f(fValueOf, new f3.v(f3.t.b(j10)));
        }
    }

    public static final class p extends kotlin.jvm.internal.s implements eh.l<Object, e3.f> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f27942a = new p(1);

        @Override // eh.l
        public final e3.f invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            f.a aVar = obj2 != null ? (f.a) obj2 : null;
            kotlin.jvm.internal.r.b(aVar);
            float f10 = aVar.f8358a;
            Object obj3 = list.get(1);
            f.c cVar = obj3 != null ? (f.c) obj3 : null;
            kotlin.jvm.internal.r.b(cVar);
            int i10 = cVar.f8359a;
            Object obj4 = list.get(2);
            kotlin.jvm.internal.r.b(obj4 != null ? (f.b) obj4 : null);
            return new e3.f(f10, i10);
        }
    }

    public static final class p0 extends kotlin.jvm.internal.s implements eh.l<Object, f3.t> {

        /* renamed from: a, reason: collision with root package name */
        public static final p0 f27943a = new p0(1);

        @Override // eh.l
        public final f3.t invoke(Object obj) {
            if (kotlin.jvm.internal.r.a(obj, Boolean.FALSE)) {
                return new f3.t(f3.t.f8833c);
            }
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            kotlin.jvm.internal.r.b(f10);
            float fFloatValue = f10.floatValue();
            Object obj3 = list.get(1);
            f3.v vVar = obj3 != null ? (f3.v) obj3 : null;
            kotlin.jvm.internal.r.b(vVar);
            return new f3.t(f3.u.e(fFloatValue, vVar.f8836a));
        }
    }

    public static final class q extends kotlin.jvm.internal.s implements eh.p<g1.o, i.b, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final q f27944a = new q(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, i.b bVar) {
            i.b bVar2 = bVar;
            String str = bVar2.f27827a;
            g1.n nVar = y.f27891a;
            return qg.p.f(str, y.a(bVar2.f27828b, y.f27899i, oVar));
        }
    }

    public static final class q0 extends kotlin.jvm.internal.s implements eh.p<g1.o, t2.n0, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final q0 f27945a = new q0(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, t2.n0 n0Var) {
            String str = n0Var.f27863a;
            g1.n nVar = y.f27891a;
            return str;
        }
    }

    public static final class r extends kotlin.jvm.internal.s implements eh.l<Object, i.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final r f27946a = new r(1);

        @Override // eh.l
        public final i.b invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            t2.i0 i0Var = null;
            String str = obj2 != null ? (String) obj2 : null;
            kotlin.jvm.internal.r.b(str);
            Object obj3 = list.get(1);
            g1.n nVar = y.f27899i;
            if (!kotlin.jvm.internal.r.a(obj3, Boolean.FALSE) && obj3 != null) {
                i0Var = (t2.i0) nVar.f11311b.invoke(obj3);
            }
            return new i.b(str, i0Var);
        }
    }

    public static final class r0 extends kotlin.jvm.internal.s implements eh.l<Object, t2.n0> {

        /* renamed from: a, reason: collision with root package name */
        public static final r0 f27947a = new r0(1);

        @Override // eh.l
        public final t2.n0 invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            kotlin.jvm.internal.r.b(str);
            return new t2.n0(str);
        }
    }

    public static final class s extends kotlin.jvm.internal.s implements eh.p<g1.o, a3.c, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final s f27948a = new s(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, a3.c cVar) {
            g1.o oVar2 = oVar;
            List<a3.b> list = cVar.f25a;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(y.a(list.get(i10), y.f27910t, oVar2));
            }
            return arrayList;
        }
    }

    public static final class s0 extends kotlin.jvm.internal.s implements eh.p<g1.o, t2.o0, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final s0 f27949a = new s0(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, t2.o0 o0Var) {
            String str = o0Var.f27871a;
            g1.n nVar = y.f27891a;
            return str;
        }
    }

    public static final class t extends kotlin.jvm.internal.s implements eh.l<Object, a3.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final t f27950a = new t(1);

        @Override // eh.l
        public final a3.c invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                g1.n nVar = y.f27910t;
                a3.b bVar = null;
                if (!kotlin.jvm.internal.r.a(obj2, Boolean.FALSE) && obj2 != null) {
                    bVar = (a3.b) nVar.f11311b.invoke(obj2);
                }
                kotlin.jvm.internal.r.b(bVar);
                arrayList.add(bVar);
            }
            return new a3.c(arrayList);
        }
    }

    public static final class t0 extends kotlin.jvm.internal.s implements eh.l<Object, t2.o0> {

        /* renamed from: a, reason: collision with root package name */
        public static final t0 f27951a = new t0(1);

        @Override // eh.l
        public final t2.o0 invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            kotlin.jvm.internal.r.b(str);
            return new t2.o0(str);
        }
    }

    public static final class u extends kotlin.jvm.internal.s implements eh.p<g1.o, a3.b, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final u f27952a = new u(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, a3.b bVar) {
            return bVar.f23a.toLanguageTag();
        }
    }

    public static final class v extends kotlin.jvm.internal.s implements eh.l<Object, a3.b> {

        /* renamed from: a, reason: collision with root package name */
        public static final v f27953a = new v(1);

        @Override // eh.l
        public final a3.b invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            a3.d.f27a.getClass();
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            if (kotlin.jvm.internal.r.a(localeForLanguageTag.toLanguageTag(), "und")) {
                Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
            }
            return new a3.b(localeForLanguageTag);
        }
    }

    public static final class w extends kotlin.jvm.internal.s implements eh.p<g1.o, p1.c, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final w f27954a = new w(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, p1.c cVar) {
            long j10 = cVar.f21129a;
            if (p1.c.b(j10, 9205357640488583168L)) {
                return Boolean.FALSE;
            }
            Float fValueOf = Float.valueOf(Float.intBitsToFloat((int) (j10 >> 32)));
            g1.n nVar = y.f27891a;
            return qg.p.f(fValueOf, Float.valueOf(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))));
        }
    }

    public static final class x extends kotlin.jvm.internal.s implements eh.l<Object, p1.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final x f27955a = new x(1);

        @Override // eh.l
        public final p1.c invoke(Object obj) {
            if (kotlin.jvm.internal.r.a(obj, Boolean.FALSE)) {
                return new p1.c(9205357640488583168L);
            }
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            kotlin.jvm.internal.r.b(f10);
            float fFloatValue = f10.floatValue();
            Object obj3 = list.get(1);
            kotlin.jvm.internal.r.b(obj3 != null ? (Float) obj3 : null);
            return new p1.c((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(r1.floatValue()) & BodyPartID.bodyIdMax));
        }
    }

    /* renamed from: t2.y$y, reason: collision with other inner class name */
    public static final class C0289y extends kotlin.jvm.internal.s implements eh.p<g1.o, t2.s, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0289y f27956a = new C0289y(2);

        @Override // eh.p
        public final Object invoke(g1.o oVar, t2.s sVar) {
            g1.o oVar2 = oVar;
            t2.s sVar2 = sVar;
            e3.h hVar = new e3.h(sVar2.f27875a);
            g1.n nVar = y.f27891a;
            e3.j jVar = new e3.j(sVar2.f27876b);
            Object objA = y.a(new f3.t(sVar2.f27877c), y.f27907q, oVar2);
            e3.n nVar2 = sVar2.f27878d;
            e3.n nVar3 = e3.n.f8375c;
            Object objA2 = y.a(nVar2, y.f27902l, oVar2);
            t2.v vVar = sVar2.f27879e;
            t2.v vVar2 = t2.v.f27886b;
            Object objA3 = y.a(vVar, t2.a0.f27751a, oVar2);
            e3.f fVar = sVar2.f27880f;
            e3.f fVar2 = e3.f.f8352c;
            return qg.p.f(hVar, jVar, objA, objA2, objA3, y.a(fVar, y.f27911u, oVar2), y.a(new e3.e(sVar2.f27881g), t2.a0.f27752b, oVar2), new e3.d(sVar2.f27882h), y.a(sVar2.f27883i, t2.a0.f27753c, oVar2));
        }
    }

    public static final class z extends kotlin.jvm.internal.s implements eh.l<Object, t2.s> {

        /* renamed from: a, reason: collision with root package name */
        public static final z f27957a = new z(1);

        @Override // eh.l
        public final t2.s invoke(Object obj) {
            kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            e3.o oVar = null;
            e3.h hVar = obj2 != null ? (e3.h) obj2 : null;
            kotlin.jvm.internal.r.b(hVar);
            int i10 = hVar.f8363a;
            Object obj3 = list.get(1);
            e3.j jVar = obj3 != null ? (e3.j) obj3 : null;
            kotlin.jvm.internal.r.b(jVar);
            int i11 = jVar.f8368a;
            Object obj4 = list.get(2);
            f3.v[] vVarArr = f3.t.f8832b;
            t2.z zVar = y.f27907q;
            Boolean bool = Boolean.FALSE;
            f3.t tVar = ((kotlin.jvm.internal.r.a(obj4, bool) && zVar == null) || obj4 == null) ? null : (f3.t) zVar.f27959b.invoke(obj4);
            kotlin.jvm.internal.r.b(tVar);
            long j10 = tVar.f8834a;
            Object obj5 = list.get(3);
            e3.n nVar = e3.n.f8375c;
            e3.n nVar2 = (kotlin.jvm.internal.r.a(obj5, bool) || obj5 == null) ? null : (e3.n) y.f27902l.f11311b.invoke(obj5);
            Object obj6 = list.get(4);
            t2.v vVar = t2.v.f27886b;
            t2.v vVar2 = (kotlin.jvm.internal.r.a(obj6, bool) || obj6 == null) ? null : (t2.v) t2.a0.f27751a.f11311b.invoke(obj6);
            Object obj7 = list.get(5);
            e3.f fVar = e3.f.f8352c;
            e3.f fVar2 = (kotlin.jvm.internal.r.a(obj7, bool) || obj7 == null) ? null : (e3.f) y.f27911u.f11311b.invoke(obj7);
            Object obj8 = list.get(6);
            e3.e eVar = (kotlin.jvm.internal.r.a(obj8, bool) || obj8 == null) ? null : (e3.e) t2.a0.f27752b.f11311b.invoke(obj8);
            kotlin.jvm.internal.r.b(eVar);
            int i12 = eVar.f8351a;
            Object obj9 = list.get(7);
            e3.d dVar = obj9 != null ? (e3.d) obj9 : null;
            kotlin.jvm.internal.r.b(dVar);
            int i13 = dVar.f8349a;
            Object obj10 = list.get(8);
            g1.n nVar3 = t2.a0.f27753c;
            if (!kotlin.jvm.internal.r.a(obj10, bool) && obj10 != null) {
                oVar = (e3.o) nVar3.f11311b.invoke(obj10);
            }
            return new t2.s(i10, i11, j10, nVar2, vVar2, fVar2, i12, i13, oVar);
        }
    }

    static {
        g1.n nVar = g1.m.f11307a;
        new g1.n(a.f27912a, b.f27914a);
        f27891a = new g1.n(c.f27916a, d.f27918a);
        f27892b = new g1.n(e.f27920a, f.f27922a);
        f27893c = new g1.n(s0.f27949a, t0.f27951a);
        f27894d = new g1.n(q0.f27945a, r0.f27947a);
        f27895e = new g1.n(q.f27944a, r.f27946a);
        f27896f = new g1.n(i.f27928a, j.f27930a);
        f27897g = new g1.n(C0289y.f27956a, z.f27957a);
        f27898h = new g1.n(c0.f27917a, d0.f27919a);
        f27899i = new g1.n(k0.f27933a, l0.f27935a);
        f27900j = new g1.n(e0.f27921a, f0.f27923a);
        f27901k = new g1.n(g0.f27925a, h0.f27927a);
        f27902l = new g1.n(i0.f27929a, j0.f27931a);
        f27903m = new g1.n(m.f27936a, n.f27938a);
        f27904n = new g1.n(g.f27924a, h.f27926a);
        new g1.n(m0.f27937a, n0.f27939a);
        f27905o = new g1.n(a0.f27913a, b0.f27915a);
        f27906p = new t2.z(k.f27932a, l.f27934a);
        f27907q = new t2.z(o0.f27941a, p0.f27943a);
        f27908r = new t2.z(w.f27954a, x.f27955a);
        f27909s = new g1.n(s.f27948a, t.f27950a);
        f27910t = new g1.n(u.f27952a, v.f27953a);
        f27911u = new g1.n(o.f27940a, p.f27942a);
    }

    public static final <T extends g1.l<Original, Saveable>, Original, Saveable> Object a(Original original, T t3, g1.o oVar) {
        Object objB;
        return (original == null || (objB = t3.b(oVar, original)) == null) ? Boolean.FALSE : objB;
    }
}
