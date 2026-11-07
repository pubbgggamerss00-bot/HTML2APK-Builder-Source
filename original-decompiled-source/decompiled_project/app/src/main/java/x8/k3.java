package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import f9.ld;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x0.j;

/* loaded from: classes.dex */
public final class k3 implements eh.q<c0.v, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8 f32854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map<Long, Integer> f32855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashMap<Long, p1.e> f32856c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f32857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f32858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f32859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f32860g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32861h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j6 f32862j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f32863k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32864l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f32865m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32866n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f32867p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0.n1<List<Long>> f32868q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.n1<p1.c> f32869r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0.n1<p1.e> f32870s;

    public k3(n8 n8Var, Map map, HashMap map2, s.b bVar, x0.n1 n1Var, ph.i0 i0Var, boolean z10, x0.n1 n1Var2, j6 j6Var, b0.m0 m0Var, x0.n1 n1Var3, x0.n1 n1Var4, x0.n1 n1Var5, x0.n1 n1Var6, x0.n1 n1Var7, x0.n1 n1Var8, x0.n1 n1Var9) {
        this.f32854a = n8Var;
        this.f32855b = map;
        this.f32856c = map2;
        this.f32857d = bVar;
        this.f32858e = n1Var;
        this.f32859f = i0Var;
        this.f32860g = z10;
        this.f32861h = n1Var2;
        this.f32862j = j6Var;
        this.f32863k = m0Var;
        this.f32864l = n1Var3;
        this.f32865m = n1Var4;
        this.f32866n = n1Var5;
        this.f32867p = n1Var6;
        this.f32868q = n1Var7;
        this.f32869r = n1Var8;
        this.f32870s = n1Var9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(c0.v vVar, x0.j jVar, Integer num) {
        c0.v item = vVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            boolean z10 = g5.f32665a;
            s.b<Float, s.o> bVarB = e.b("folders", this.f32864l.getValue().booleanValue(), 1, this.f32865m.getValue(), jVar2, 390);
            List list = (List) this.f32866n.getValue();
            Long l10 = (Long) this.f32854a.f32994g.getValue();
            jVar2.L(354157567);
            final HashMap<Long, p1.e> map = this.f32856c;
            boolean zL = jVar2.l(map);
            Object objG = jVar2.g();
            Object obj = j.a.f31715a;
            if (zL || objG == obj) {
                objG = new eh.p() { // from class: x8.i3
                    @Override // eh.p
                    public final Object invoke(Object obj2, Object obj3) {
                        Long l11 = (Long) obj2;
                        l11.longValue();
                        p1.e eVar = (p1.e) obj3;
                        HashMap map2 = map;
                        if (eVar == null) {
                            map2.remove(l11);
                        } else {
                            map2.put(l11, eVar);
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(objG);
            }
            eh.p pVar = (eh.p) objG;
            jVar2.B();
            jVar2.L(354164548);
            boolean zL2 = jVar2.l(this.f32857d);
            final x0.n1<Long> n1Var = this.f32858e;
            boolean zL3 = jVar2.l(map) | zL2 | jVar2.K(n1Var) | jVar2.l(this.f32859f) | jVar2.c(this.f32860g);
            Object objG2 = jVar2.g();
            if (zL3 || objG2 == obj) {
                final s.b<Float, s.o> bVar = this.f32857d;
                final HashMap<Long, p1.e> map2 = this.f32856c;
                final ph.i0 i0Var = this.f32859f;
                final x0.n1<Long> n1Var2 = this.f32867p;
                final x0.n1<Boolean> n1Var3 = this.f32864l;
                final x0.n1<List<Long>> n1Var4 = this.f32868q;
                final x0.n1<p1.c> n1Var5 = this.f32869r;
                final x0.n1<p1.e> n1Var6 = this.f32870s;
                final boolean z11 = this.f32860g;
                Object obj2 = new eh.l() { // from class: x8.j3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // eh.l
                    public final Object invoke(Object obj3) {
                        FolderEntity it = (FolderEntity) obj3;
                        kotlin.jvm.internal.r.e(it, "it");
                        long id2 = it.getId();
                        boolean z12 = g5.f32665a;
                        s.b bVar2 = bVar;
                        if (!bVar2.e()) {
                            x0.n1 n1Var7 = n1Var;
                            if (((Long) n1Var7.getValue()) == null && ((Long) n1Var2.getValue()) == null) {
                                n1Var3.setValue(Boolean.FALSE);
                                n1Var4.setValue(null);
                                p1.e eVar = (p1.e) map2.get(Long.valueOf(id2));
                                n1Var6.setValue(eVar != null ? eVar.j(((p1.c) n1Var5.getValue()).f21129a ^ (-9223372034707292160L)) : null);
                                n1Var7.setValue(Long.valueOf(id2));
                                ph.h.c(i0Var, null, null, new h5(bVar2, null, z11), 3);
                            }
                        }
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(obj2);
                objG2 = obj2;
            }
            eh.l lVar = (eh.l) objG2;
            x0.n1<Boolean> n1Var7 = this.f32861h;
            boolean zB = androidx.datastore.preferences.protobuf.e.b(jVar2, 354166797, n1Var7);
            Object objG3 = jVar2.g();
            if (zB || objG3 == obj) {
                objG3 = new ld(n1Var7, 1);
                jVar2.C(objG3);
            }
            eh.a aVar = (eh.a) objG3;
            jVar2.B();
            jVar2.L(354147895);
            Object obj3 = this.f32862j;
            boolean zL4 = jVar2.l(obj3);
            Object objG4 = jVar2.g();
            if (zL4 || objG4 == obj) {
                objG4 = new b9.s2(obj3, 1);
                jVar2.C(objG4);
            }
            jVar2.B();
            s.e(list, this.f32855b, l10, pVar, lVar, aVar, (eh.l) objG4, bVarB, this.f32863k, null, jVar2, 16777216);
        }
        return pg.f0.f21461a;
    }
}
