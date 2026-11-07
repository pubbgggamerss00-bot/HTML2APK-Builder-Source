package t0;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.ArrayList;
import x0.j;

/* loaded from: classes.dex */
public final class mc extends kotlin.jvm.internal.s implements eh.q<eh.p<? super x0.j, ? super Integer, ? extends pg.f0>, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic f26470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ic f26471b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26472c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u3<ic> f26473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(ic icVar, ic icVar2, ArrayList arrayList, u3 u3Var) {
        super(3);
        this.f26470a = icVar;
        this.f26471b = icVar2;
        this.f26472c = arrayList;
        this.f26473d = u3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(eh.p<? super x0.j, ? super Integer, ? extends pg.f0> pVar, x0.j jVar, Integer num) {
        Object rcVar;
        Boolean bool;
        eh.p<? super x0.j, ? super Integer, ? extends pg.f0> pVar2 = pVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.l(pVar2) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            ic icVar = this.f26471b;
            ic icVar2 = this.f26470a;
            boolean zA = kotlin.jvm.internal.r.a(icVar2, icVar);
            int i10 = zA ? 150 : 75;
            if (zA) {
                ArrayList arrayList = this.f26472c;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Object obj = arrayList.get(i11);
                    if (obj != null) {
                        arrayList2.add(obj);
                    }
                }
                int i12 = arrayList2.size() == 1 ? 0 : 75;
                s.m2 m2Var = new s.m2(i10, i12, s.d0.f23706d);
                boolean zK = jVar2.K(icVar2);
                u3<ic> u3Var = this.f26473d;
                boolean zL = zK | jVar2.l(u3Var);
                Object objG = jVar2.g();
                Object obj2 = j.a.f31715a;
                if (zL || objG == obj2) {
                    objG = new lc(icVar2, u3Var);
                    jVar2.C(objG);
                }
                eh.a aVar = (eh.a) objG;
                Object objG2 = jVar2.g();
                if (objG2 == obj2) {
                    objG2 = s.d.a(!zA ? 1.0f : CropImageView.DEFAULT_ASPECT_RATIO);
                    jVar2.C(objG2);
                }
                s.b bVar = (s.b) objG2;
                Boolean boolValueOf = Boolean.valueOf(zA);
                boolean zL2 = jVar2.l(bVar) | jVar2.c(zA) | jVar2.l(m2Var) | jVar2.K(aVar);
                Object objG3 = jVar2.g();
                if (zL2 || objG3 == obj2) {
                    bool = boolValueOf;
                    rcVar = new rc(bVar, zA, m2Var, aVar, null);
                    jVar2.C(rcVar);
                } else {
                    bool = boolValueOf;
                    rcVar = objG3;
                }
                x0.o0.d((eh.p) rcVar, bool, jVar2);
                s.n<T, V> nVar = bVar.f23654c;
                s.m2 m2Var2 = new s.m2(i10, i12, s.d0.f23703a);
                Object objG4 = jVar2.g();
                if (objG4 == obj2) {
                    objG4 = s.d.a(!zA ? 1.0f : 0.8f);
                    jVar2.C(objG4);
                }
                s.b bVar2 = (s.b) objG4;
                Boolean boolValueOf2 = Boolean.valueOf(zA);
                boolean zL3 = jVar2.l(bVar2) | jVar2.c(zA) | jVar2.l(m2Var2);
                Object objG5 = jVar2.g();
                if (zL3 || objG5 == obj2) {
                    objG5 = new sc(bVar2, zA, m2Var2, null);
                    jVar2.C(objG5);
                }
                x0.o0.d((eh.p) objG5, boolValueOf2, jVar2);
                s.n<T, V> nVar2 = bVar2.f23654c;
                androidx.compose.ui.d dVarB = androidx.compose.ui.graphics.a.b(d.a.f1143b, ((Number) nVar2.f23843b.getValue()).floatValue(), ((Number) nVar2.f23843b.getValue()).floatValue(), ((Number) nVar.f23843b.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, false, 131064);
                boolean zK2 = jVar2.K(icVar2);
                Object objG6 = jVar2.g();
                if (zK2 || objG6 == obj2) {
                    objG6 = new m0.k1(icVar2, 1);
                    jVar2.C(objG6);
                }
                androidx.compose.ui.d dVarA = q2.q.a(dVarB, false, (eh.l) objG6);
                g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA, jVar2);
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
                ph.v1.j(g.a.f13867f, l0VarD, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                pVar2.invoke(jVar2, Integer.valueOf(iIntValue & 14));
                jVar2.H();
            }
        }
        return pg.f0.f21461a;
    }
}
