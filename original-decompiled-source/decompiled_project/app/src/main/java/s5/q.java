package s5;

import java.util.ArrayList;
import java.util.Iterator;
import mh.t;
import mh.x;
import p.c1;
import p.f1;
import p5.i0;
import p5.k0;
import p5.o0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f24517a;

    /* renamed from: b, reason: collision with root package name */
    public final c1<k0> f24518b = new c1<>(0);

    /* renamed from: c, reason: collision with root package name */
    public int f24519c;

    /* renamed from: d, reason: collision with root package name */
    public String f24520d;

    /* renamed from: e, reason: collision with root package name */
    public String f24521e;

    public q(o0 o0Var) {
        this.f24517a = o0Var;
    }

    public final k0 a(int i10) {
        return c(i10, this.f24517a, null, false);
    }

    public final k0 b(String route, boolean z10) {
        Object next;
        o0 o0Var;
        kotlin.jvm.internal.r.e(route, "route");
        c1<k0> c1Var = this.f24518b;
        kotlin.jvm.internal.r.e(c1Var, "<this>");
        Iterator it = ((lh.a) lh.l.g(new f1(c1Var))).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            k0 k0Var = (k0) next;
            if (t.j(k0Var.f21235b.f24512e, route, false) || k0Var.f21235b.a(route) != null) {
                break;
            }
        }
        k0 k0Var2 = (k0) next;
        if (k0Var2 != null) {
            return k0Var2;
        }
        if (!z10 || (o0Var = this.f24517a.f21236c) == null) {
            return null;
        }
        q qVar = o0Var.f21253f;
        qVar.getClass();
        if (x.A(route)) {
            return null;
        }
        return qVar.b(route, true);
    }

    public final k0 c(int i10, k0 k0Var, k0 k0Var2, boolean z10) {
        c1<k0> c1Var = this.f24518b;
        k0 k0VarC = c1Var.c(i10);
        if (k0Var2 != null) {
            if (kotlin.jvm.internal.r.a(k0VarC, k0Var2) && kotlin.jvm.internal.r.a(k0VarC.f21236c, k0Var2.f21236c)) {
                return k0VarC;
            }
            k0VarC = null;
        } else if (k0VarC != null) {
            return k0VarC;
        }
        o0 o0Var = this.f24517a;
        if (z10) {
            Iterator it = ((lh.a) lh.l.g(new f1(c1Var))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    k0VarC = null;
                    break;
                }
                k0 k0Var3 = (k0) it.next();
                k0VarC = (!(k0Var3 instanceof o0) || k0Var3.equals(k0Var)) ? null : ((o0) k0Var3).f21253f.c(i10, o0Var, k0Var2, true);
                if (k0VarC != null) {
                    break;
                }
            }
        }
        if (k0VarC != null) {
            return k0VarC;
        }
        o0 o0Var2 = o0Var.f21236c;
        if (o0Var2 == null || o0Var2.equals(k0Var)) {
            return null;
        }
        o0 o0Var3 = o0Var.f21236c;
        kotlin.jvm.internal.r.b(o0Var3);
        return o0Var3.f21253f.c(i10, o0Var, k0Var2, z10);
    }

    public final k0.b d(k0.b bVar, i0 i0Var, boolean z10, k0 k0Var) {
        k0.b bVarG;
        ArrayList arrayList = new ArrayList();
        o0 o0Var = this.f24517a;
        Iterator<k0> it = o0Var.iterator();
        while (true) {
            p pVar = (p) it;
            if (!pVar.hasNext()) {
                break;
            }
            k0 k0Var2 = (k0) pVar.next();
            bVarG = kotlin.jvm.internal.r.a(k0Var2, k0Var) ? null : k0Var2.f(i0Var);
            if (bVarG != null) {
                arrayList.add(bVarG);
            }
        }
        k0.b bVar2 = (k0.b) qg.x.L(arrayList);
        o0 o0Var2 = o0Var.f21236c;
        if (o0Var2 != null && z10 && !o0Var2.equals(k0Var)) {
            bVarG = o0Var2.g(i0Var, o0Var);
        }
        return (k0.b) qg.x.L(qg.o.s(new k0.b[]{bVar, bVar2, bVarG}));
    }
}
