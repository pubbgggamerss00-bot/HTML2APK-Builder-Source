package q8;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.ui.d;
import b9.x3;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import x0.j;

/* loaded from: classes.dex */
public final class e3 implements eh.q<z.n, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f22181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f22182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f22183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f22184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f22185f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f22186g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h1.u<d1> f22187h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f22188j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<k> f22189k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f22190l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.l1 f22191m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f22192n;

    public e3(boolean z10, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, Context context, boolean z11, h1.u<d1> uVar, eh.a<pg.f0> aVar, x0.n1<k> n1Var, x0.n1<Boolean> n1Var2, x0.l1 l1Var, x0.n1<Boolean> n1Var3) {
        this.f22180a = z10;
        this.f22181b = list;
        this.f22182c = list2;
        this.f22183d = list3;
        this.f22184e = list4;
        this.f22185f = context;
        this.f22186g = z11;
        this.f22187h = uVar;
        this.f22188j = aVar;
        this.f22189k = n1Var;
        this.f22190l = n1Var2;
        this.f22191m = l1Var;
        this.f22192n = n1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [eh.p] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // eh.q
    public final pg.f0 b(z.n nVar, x0.j jVar, Integer num) throws Throwable {
        k kVar;
        x0.n1<k> n1Var;
        Boolean bool;
        Throwable th2;
        List<Integer> list;
        List<Integer> list2;
        List<Integer> list3;
        int iIntValue;
        ?? r92;
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
            f3.d dVar = (f3.d) jVar2.f(j2.j2.f14779h);
            float f10 = 52;
            float fI = f3.b.i(BoxWithConstraints.c()) - dVar.N0(f10);
            float f11 = fI < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : fI;
            jVar2.L(-898313370);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                x0.u1 u1Var = new x0.u1(0.85f * f11);
                jVar2.C(u1Var);
                objG = u1Var;
            }
            final x0.k1 k1Var = (x0.k1) objG;
            jVar2.B();
            jVar2.L(-898311053);
            Object objG2 = jVar2.g();
            if (objG2 == c0321a) {
                objG2 = s.d.a(CropImageView.DEFAULT_ASPECT_RATIO);
                jVar2.C(objG2);
            }
            s.b bVar = (s.b) objG2;
            jVar2.B();
            boolean z10 = this.f22180a;
            Boolean boolValueOf = Boolean.valueOf(z10);
            jVar2.L(-898308637);
            boolean zC = jVar2.c(z10);
            Object objG3 = jVar2.g();
            x0.n1<k> n1Var2 = this.f22189k;
            if (zC || objG3 == c0321a) {
                objG3 = new w2(z10, n1Var2, null);
                jVar2.C(objG3);
            }
            jVar2.B();
            x0.o0.d((eh.p) objG3, boolValueOf, jVar2);
            k value = n1Var2.getValue();
            Boolean boolValueOf2 = Boolean.valueOf(z10);
            jVar2.L(-898296735);
            boolean zC2 = jVar2.c(z10) | jVar2.h(f11) | jVar2.l(bVar);
            Object objG4 = jVar2.g();
            if (zC2 || objG4 == c0321a) {
                kVar = value;
                n1Var = n1Var2;
                bool = boolValueOf2;
                th2 = null;
                a3 a3Var = new a3(this.f22180a, f11, bVar, this.f22189k, this.f22190l, k1Var, null);
                jVar2.C(a3Var);
                objG4 = a3Var;
            } else {
                kVar = value;
                bool = boolValueOf2;
                n1Var = n1Var2;
                th2 = null;
            }
            jVar2.B();
            x0.o0.e(kVar, bool, (eh.p) objG4, jVar2);
            k value2 = n1Var.getValue();
            jVar2.L(-898234159);
            List<Integer> list4 = this.f22181b;
            boolean zL = jVar2.l(list4);
            List<Integer> list5 = this.f22182c;
            boolean zL2 = zL | jVar2.l(list5);
            List<Integer> list6 = this.f22183d;
            boolean zL3 = zL2 | jVar2.l(list6);
            List<Integer> list7 = this.f22184e;
            boolean zL4 = zL3 | jVar2.l(list7);
            Object objG5 = jVar2.g();
            if (zL4 || objG5 == c0321a) {
                objG5 = new b3(list4, list5, list6, list7, this.f22189k, this.f22191m, null);
                list = list4;
                list2 = list6;
                list3 = list7;
                jVar2.C(objG5);
            } else {
                list2 = list6;
                list = list4;
                list3 = list7;
            }
            jVar2.B();
            x0.o0.d((eh.p) objG5, value2, jVar2);
            int iOrdinal = n1Var.getValue().ordinal();
            x0.l1 l1Var = this.f22191m;
            if (iOrdinal == 0) {
                int iG = l1Var.g() % list.size();
                iIntValue = ((iG < 0 || iG >= list.size()) ? Integer.valueOf(list.get(0).intValue()) : list.get(iG)).intValue();
            } else if (iOrdinal == 1) {
                int iG2 = l1Var.g() % list5.size();
                iIntValue = ((iG2 < 0 || iG2 >= list5.size()) ? Integer.valueOf(list5.get(0).intValue()) : list5.get(iG2)).intValue();
            } else if (iOrdinal == 2) {
                int iG3 = l1Var.g() % list2.size();
                iIntValue = ((iG3 < 0 || iG3 >= list2.size()) ? Integer.valueOf(list2.get(0).intValue()) : list2.get(iG3)).intValue();
            } else {
                if (iOrdinal != 3) {
                    throw new pg.l();
                }
                int iG4 = l1Var.g() % list3.size();
                iIntValue = ((iG4 < 0 || iG4 >= list3.size()) ? Integer.valueOf(list3.get(0).intValue()) : list3.get(iG4)).intValue();
            }
            androidx.compose.ui.d dVarC = androidx.compose.foundation.layout.e.c(d.a.f1143b, dVar.v(k1Var.getFloatValue()), CropImageView.DEFAULT_ASPECT_RATIO, 2);
            jVar2.L(-898194072);
            boolean zL5 = jVar2.l(bVar);
            Object objG6 = jVar2.g();
            if (zL5 || objG6 == c0321a) {
                objG6 = new h7.j(bVar, 1);
                jVar2.C(objG6);
            }
            jVar2.B();
            androidx.compose.ui.d dVarN = androidx.compose.foundation.layout.g.n(androidx.compose.foundation.layout.e.a(dVarC, (eh.l) objG6), f10);
            jVar2.L(-898189281);
            Object objG7 = jVar2.g();
            if (objG7 == c0321a) {
                objG7 = new x.n();
                jVar2.C(objG7);
            }
            x.m mVar = (x.m) objG7;
            jVar2.B();
            jVar2.L(-898185116);
            boolean zL6 = jVar2.l(this.f22185f) | jVar2.c(this.f22186g);
            Object objG8 = jVar2.g();
            if (zL6 || objG8 == c0321a) {
                final Context context = this.f22185f;
                final boolean z11 = this.f22186g;
                final h1.u<d1> uVar = this.f22187h;
                final x0.n1<k> n1Var3 = this.f22189k;
                final x0.n1<Boolean> n1Var4 = this.f22192n;
                r92 = 0;
                eh.a aVar = new eh.a() { // from class: q8.u2
                    @Override // eh.a
                    public final Object invoke() {
                        n1Var3.setValue(k.f22270d);
                        sh.z0 z0Var = k8.j.f16136a;
                        Context context2 = context;
                        kotlin.jvm.internal.r.e(context2, "context");
                        if (!z11) {
                            k8.j.a(context2);
                            sh.z0 z0Var2 = k8.j.f16136a;
                            if (!((Boolean) z0Var2.getValue()).booleanValue()) {
                                SharedPreferences sharedPreferences = context2.getSharedPreferences("cat_world_unlock_prefs", 0);
                                int i10 = sharedPreferences.getInt("cat_roaming_tap_count", 0) + 1;
                                sharedPreferences.edit().putInt("cat_roaming_tap_count", i10).apply();
                                if (i10 >= 10) {
                                    k8.j.a(context2);
                                    context2.getSharedPreferences("cat_world_unlock_prefs", 0).edit().putBoolean("is_cat_world_unlocked", true).apply();
                                    Boolean bool2 = Boolean.TRUE;
                                    z0Var2.j(null, bool2);
                                    n1Var4.setValue(bool2);
                                }
                            }
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        hh.c.f13027a.getClass();
                        uVar.add(new d1(jCurrentTimeMillis + r3.c(DescriptorProtos.Edition.EDITION_2023_VALUE), k1Var.getFloatValue() + r3.d(-10, 20), (String) qg.p.j("❤️", "🐾", "🥰", "✨").get(hh.c.f13028b.c(4))));
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(aVar);
                objG8 = aVar;
            } else {
                r92 = 0;
            }
            jVar2.B();
            androidx.compose.ui.d dVarB = androidx.compose.foundation.b.b(dVarN, mVar, null, false, null, (eh.a) objG8, 28);
            g2.l0 l0VarD = z.g.d(d.a.f14609h, r92);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarB, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw th2;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar2);
            } else {
                jVar2.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, jVar2);
            ph.v1.j(g.a.f13866e, a2VarY, jVar2);
            g.a.C0128a c0128a = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC2, jVar2);
            t.t0.b(o2.a.a(iIntValue, jVar2), null, d0.d2.c(androidx.compose.foundation.layout.g.f976c, this.f22190l.getValue().booleanValue() ? -1.0f : 1.0f, 1.0f), null, jVar2, 48, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET);
            jVar2.H();
            jVar2.L(-898148364);
            h1.u<d1> uVar2 = this.f22187h;
            for (d1 d1Var : uVar2.f().f12180c) {
                jVar2.q(-1228133974, Long.valueOf(d1Var.f22164a));
                jVar2.L(-1228130441);
                boolean zK = jVar2.K(d1Var);
                Object objG9 = jVar2.g();
                if (zK || objG9 == c0321a) {
                    objG9 = new x3(1, uVar2, d1Var);
                    jVar2.C(objG9);
                }
                jVar2.B();
                t2.a(d1Var, (eh.a) objG9, jVar2, r92);
                jVar2.F();
            }
            jVar2.B();
            x0.n1<Boolean> n1Var5 = this.f22192n;
            if (n1Var5.getValue().booleanValue()) {
                jVar2.L(-898080262);
                eh.a<pg.f0> aVar3 = this.f22188j;
                ?? B = aVar3 != null ? f1.c.b(-1523535585, new d3(n1Var5), jVar2) : th2;
                jVar2.B();
                jVar2.L(-898138508);
                Object objG10 = jVar2.g();
                if (objG10 == c0321a) {
                    objG10 = new v2(n1Var5, 0);
                    jVar2.C(objG10);
                }
                jVar2.B();
                t0.r.a((eh.a) objG10, f1.c.b(1671285117, new z2(aVar3, n1Var5), jVar2), null, B, c0.f22142d, c0.f22143e, c0.f22144f, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, jVar2, 1794102, 0, 16260);
            }
        }
        return pg.f0.f21461a;
    }
}
