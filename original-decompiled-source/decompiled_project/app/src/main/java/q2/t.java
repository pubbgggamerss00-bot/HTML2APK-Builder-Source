package q2;

import androidx.compose.ui.d;
import i2.e0;
import i2.g1;
import i2.k2;
import java.util.ArrayList;
import java.util.List;
import pg.f0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final d.c f21808a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21809b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f21810c;

    /* renamed from: d, reason: collision with root package name */
    public final l f21811d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21812e;

    /* renamed from: f, reason: collision with root package name */
    public t f21813f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21814g;

    public static final class a extends d.c implements k2 {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.s f21815q;

        /* JADX WARN: Multi-variable type inference failed */
        public a(eh.l<? super d0, f0> lVar) {
            this.f21815q = (kotlin.jvm.internal.s) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [eh.l, kotlin.jvm.internal.s] */
        @Override // i2.k2
        public final void X(d0 d0Var) {
            this.f21815q.invoke(d0Var);
        }
    }

    public t(d.c cVar, boolean z10, e0 e0Var, l lVar) {
        this.f21808a = cVar;
        this.f21809b = z10;
        this.f21810c = e0Var;
        this.f21811d = lVar;
        this.f21814g = e0Var.f13810b;
    }

    public static /* synthetic */ List h(int i10, t tVar) {
        return tVar.g((i10 & 1) != 0 ? !tVar.f21809b : false, (i10 & 2) == 0);
    }

    public final t a(i iVar, eh.l<? super d0, f0> lVar) {
        l lVar2 = new l();
        lVar2.f21801c = false;
        lVar2.f21802d = false;
        lVar.invoke(lVar2);
        t tVar = new t(new a(lVar), false, new e0(true, this.f21814g + (iVar != null ? 1000000000 : 2000000000)), lVar2);
        tVar.f21812e = true;
        tVar.f21813f = this;
        return tVar;
    }

    public final void b(e0 e0Var, ArrayList arrayList) {
        z0.b<e0> bVarI = e0Var.I();
        e0[] e0VarArr = bVarI.f34700a;
        int i10 = bVarI.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            e0 e0Var2 = e0VarArr[i11];
            if (e0Var2.m() && !e0Var2.T) {
                if (e0Var2.I.d(8)) {
                    arrayList.add(u.a(e0Var2, this.f21809b));
                } else {
                    b(e0Var2, arrayList);
                }
            }
        }
    }

    public final g1 c() {
        if (this.f21812e) {
            t tVarJ = j();
            if (tVarJ != null) {
                return tVarJ.c();
            }
            return null;
        }
        i2.j jVarB = u.b(this.f21810c);
        if (jVarB == null) {
            jVarB = this.f21808a;
        }
        return i2.k.d(jVarB, 8);
    }

    public final void d(ArrayList arrayList, ArrayList arrayList2) {
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            t tVar = (t) arrayList.get(size2);
            if (tVar.l()) {
                arrayList2.add(tVar);
            } else if (!tVar.f21811d.f21802d) {
                tVar.d(arrayList, arrayList2);
            }
        }
    }

    public final p1.e e() {
        g1 g1VarC = c();
        if (g1VarC != null) {
            if (!g1VarC.l1().f1157p) {
                g1VarC = null;
            }
            if (g1VarC != null) {
                return g2.w.c(g1VarC).N(g1VarC, true);
            }
        }
        return p1.e.f21130e;
    }

    public final p1.e f() {
        g1 g1VarC = c();
        if (g1VarC != null) {
            if (!g1VarC.l1().f1157p) {
                g1VarC = null;
            }
            if (g1VarC != null) {
                return g2.w.b(g1VarC);
            }
        }
        return p1.e.f21130e;
    }

    public final List g(boolean z10, boolean z11) {
        if (!z10 && this.f21811d.f21802d) {
            return qg.z.f22752a;
        }
        ArrayList arrayList = new ArrayList();
        if (!l()) {
            return o(arrayList, z11);
        }
        ArrayList arrayList2 = new ArrayList();
        d(arrayList, arrayList2);
        return arrayList2;
    }

    public final l i() {
        boolean zL = l();
        l lVar = this.f21811d;
        if (!zL) {
            return lVar;
        }
        l lVarE = lVar.e();
        n(new ArrayList(), lVarE);
        return lVarE;
    }

    public final t j() {
        e0 e0VarG;
        t tVar = this.f21813f;
        if (tVar != null) {
            return tVar;
        }
        e0 e0Var = this.f21810c;
        boolean z10 = this.f21809b;
        if (z10) {
            e0VarG = e0Var.G();
            while (e0VarG != null) {
                l lVarE = e0VarG.e();
                if (lVarE != null && lVarE.f21801c) {
                    break;
                }
                e0VarG = e0VarG.G();
            }
            e0VarG = null;
        } else {
            e0VarG = null;
        }
        if (e0VarG == null) {
            e0 e0VarG2 = e0Var.G();
            while (true) {
                if (e0VarG2 == null) {
                    e0VarG = null;
                    break;
                }
                if (e0VarG2.I.d(8)) {
                    e0VarG = e0VarG2;
                    break;
                }
                e0VarG2 = e0VarG2.G();
            }
        }
        if (e0VarG == null) {
            return null;
        }
        return u.a(e0VarG, z10);
    }

    public final l k() {
        return this.f21811d;
    }

    public final boolean l() {
        return this.f21809b && this.f21811d.f21801c;
    }

    public final boolean m() {
        if (this.f21812e || !h(4, this).isEmpty()) {
            return false;
        }
        e0 e0VarG = this.f21810c.G();
        while (true) {
            if (e0VarG == null) {
                e0VarG = null;
                break;
            }
            l lVarE = e0VarG.e();
            if (lVarE != null && lVarE.f21801c) {
                break;
            }
            e0VarG = e0VarG.G();
        }
        return e0VarG == null;
    }

    public final void n(ArrayList arrayList, l lVar) {
        if (this.f21811d.f21802d) {
            return;
        }
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            t tVar = (t) arrayList.get(size2);
            if (!tVar.l()) {
                lVar.i(tVar.f21811d);
                tVar.n(arrayList, lVar);
            }
        }
    }

    public final List o(ArrayList arrayList, boolean z10) {
        if (this.f21812e) {
            return qg.z.f22752a;
        }
        b(this.f21810c, arrayList);
        if (z10) {
            c0<i> c0Var = w.f21842w;
            l lVar = this.f21811d;
            i iVar = (i) m.a(lVar, c0Var);
            if (iVar != null && lVar.f21801c && !arrayList.isEmpty()) {
                arrayList.add(a(iVar, new r(iVar)));
            }
            c0<List<String>> c0Var2 = w.f21820a;
            if (lVar.f21799a.b(c0Var2) && !arrayList.isEmpty() && lVar.f21801c) {
                List list = (List) m.a(lVar, c0Var2);
                String str = list != null ? (String) qg.x.D(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new s(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
