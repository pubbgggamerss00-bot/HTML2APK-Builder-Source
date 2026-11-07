package q5;

import androidx.lifecycle.l;
import j2.d3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import q5.n;
import q5.o;
import x0.h2;
import x0.j;
import x0.n1;

/* loaded from: classes.dex */
public final class n {

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p5.s f22013a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f22014b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g1.d f22015c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h1.u<p5.s> f22016d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o.a f22017e;

        public a(p5.s sVar, o oVar, g1.e eVar, h1.u uVar, o.a aVar) {
            this.f22013a = sVar;
            this.f22014b = oVar;
            this.f22015c = eVar;
            this.f22016d = uVar;
            this.f22017e = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                final p5.s sVar = this.f22013a;
                boolean zL = jVar2.l(sVar);
                final o oVar = this.f22014b;
                boolean zL2 = zL | jVar2.l(oVar);
                Object objG = jVar2.g();
                if (zL2 || objG == j.a.f31715a) {
                    final h1.u<p5.s> uVar = this.f22016d;
                    objG = new eh.l() { // from class: q5.k
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            h1.u uVar2 = uVar;
                            p5.s sVar2 = sVar;
                            uVar2.add(sVar2);
                            return new m(uVar2, sVar2, oVar);
                        }
                    };
                    jVar2.C(objG);
                }
                x0.o0.a(sVar, (eh.l) objG, jVar2);
                di.p0.a(sVar, this.f22015c, f1.c.b(-497631156, new l(this.f22017e, sVar), jVar2), jVar2, 384);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n1 f22018a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f22019b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h1.u<p5.s> f22020c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n1 n1Var, o oVar, h1.u uVar, tg.e eVar) {
            super(2, eVar);
            this.f22018a = n1Var;
            this.f22019b = oVar;
            this.f22020c = uVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f22018a, this.f22019b, this.f22020c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            for (p5.s sVar : (Set) this.f22018a.getValue()) {
                o oVar = this.f22019b;
                if (!((List) ((sh.l0) oVar.b().f21204e).f25021a.getValue()).contains(sVar) && !this.f22020c.contains(sVar)) {
                    oVar.b().f(sVar);
                }
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements x0.k0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p5.s f22021a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f22022b;

        public c(p5.s sVar, j jVar) {
            this.f22021a = sVar;
            this.f22022b = jVar;
        }

        @Override // x0.k0
        public final void a() {
            this.f22021a.f21275h.f24452j.c(this.f22022b);
        }
    }

    public static final void a(o oVar, x0.j jVar, final int i10) {
        final o oVar2;
        x0.k kVarP = jVar.p(294589392);
        if ((((kVarP.l(oVar) ? 4 : 2) | i10) & 3) == 2 && kVarP.s()) {
            kVarP.v();
            oVar2 = oVar;
        } else {
            g1.e eVarI = c2.n0.i(kVarP);
            n1 n1VarB = bg.b.b((sh.l0) oVar.b().f21204e, kVarP);
            List list = (List) n1VarB.getValue();
            boolean zBooleanValue = ((Boolean) kVarP.f(d3.f14698a)).booleanValue();
            boolean zK = kVarP.K(list);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            Object obj = objG;
            if (zK || objG == c0321a) {
                h1.u uVar = new h1.u();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    p5.s sVar = (p5.s) obj2;
                    if (zBooleanValue || sVar.f21275h.f24452j.f2361d.compareTo(l.b.f2322d) >= 0) {
                        arrayList.add(obj2);
                    }
                }
                uVar.addAll(arrayList);
                kVarP.C(uVar);
                obj = uVar;
            }
            h1.u uVar2 = (h1.u) obj;
            b(uVar2, (List) n1VarB.getValue(), kVarP, 0);
            n1 n1VarB2 = bg.b.b((sh.l0) oVar.b().f21205f, kVarP);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new h1.u();
                kVarP.C(objG2);
            }
            h1.u uVar3 = (h1.u) objG2;
            kVarP.L(-367418626);
            ListIterator listIterator = uVar2.listIterator();
            while (true) {
                h1.c0 c0Var = (h1.c0) listIterator;
                if (!c0Var.hasNext()) {
                    break;
                }
                p5.s sVar2 = (p5.s) c0Var.next();
                p5.k0 k0Var = sVar2.f21269b;
                kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                o.a aVar = (o.a) k0Var;
                boolean zL = kVarP.l(oVar) | kVarP.l(sVar2);
                Object objG3 = kVarP.g();
                if (zL || objG3 == c0321a) {
                    objG3 = new androidx.credentials.playservices.controllers.identityauth.createpassword.b(2, oVar, sVar2);
                    kVarP.C(objG3);
                }
                o oVar3 = oVar;
                j3.j.a((eh.a) objG3, aVar.f22028f, f1.c.b(1129586364, new a(sVar2, oVar3, eVarI, uVar3, aVar), kVarP), kVarP, 384, 0);
                oVar = oVar3;
            }
            oVar2 = oVar;
            kVarP.T(false);
            Set set = (Set) n1VarB2.getValue();
            boolean zK2 = kVarP.K(n1VarB2) | kVarP.l(oVar2);
            Object objG4 = kVarP.g();
            if (zK2 || objG4 == c0321a) {
                objG4 = new b(n1VarB2, oVar2, uVar3, null);
                kVarP.C(objG4);
            }
            x0.o0.e(set, uVar3, (eh.p) objG4, kVarP);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(i10) { // from class: q5.g
                @Override // eh.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iN = f3.i.n(1);
                    n.a(this.f21964a, (x0.j) obj3, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final List<p5.s> list, final Collection<p5.s> collection, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(1537894851);
        if ((((kVarP.l(list) ? 4 : 2) | i10 | (kVarP.l(collection) ? 32 : 16)) & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            final boolean zBooleanValue = ((Boolean) kVarP.f(d3.f14698a)).booleanValue();
            for (final p5.s sVar : collection) {
                androidx.lifecycle.v vVar = sVar.f21275h.f24452j;
                boolean zC = kVarP.c(zBooleanValue) | kVarP.l(list) | kVarP.l(sVar);
                Object objG = kVarP.g();
                if (zC || objG == j.a.f31715a) {
                    objG = new eh.l() { // from class: q5.h
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.s, q5.j] */
                        @Override // eh.l
                        public final Object invoke(Object obj) {
                            final List list2 = list;
                            final p5.s sVar2 = sVar;
                            final boolean z10 = zBooleanValue;
                            ?? r42 = new androidx.lifecycle.r() { // from class: q5.j
                                @Override // androidx.lifecycle.r
                                public final void l(androidx.lifecycle.t tVar, l.a aVar) {
                                    boolean z11 = z10;
                                    List list3 = list2;
                                    p5.s sVar3 = sVar2;
                                    if (z11 && !list3.contains(sVar3)) {
                                        list3.add(sVar3);
                                    }
                                    if (aVar == l.a.ON_START && !list3.contains(sVar3)) {
                                        list3.add(sVar3);
                                    }
                                    if (aVar == l.a.ON_STOP) {
                                        list3.remove(sVar3);
                                    }
                                }
                            };
                            sVar2.f21275h.f24452j.a(r42);
                            return new n.c(sVar2, r42);
                        }
                    };
                    kVarP.C(objG);
                }
                x0.o0.a(vVar, (eh.l) objG, kVarP);
            }
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(list, collection, i10) { // from class: q5.i

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f21977a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Collection f21978b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    n.b(this.f21977a, this.f21978b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
