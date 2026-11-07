package p5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p5.k0;

/* loaded from: classes.dex */
public class o0 extends k0 implements Iterable<k0>, fh.a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f21252g = 0;

    /* renamed from: f, reason: collision with root package name */
    public final s5.q f21253f;

    public static final class a {
        public static k0 a(o0 o0Var) {
            Iterator it = lh.l.h(new n0(), o0Var).iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException("Sequence is empty.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return (k0) next;
        }
    }

    public o0(r0 r0Var) {
        super(r0Var);
        this.f21253f = new s5.q(this);
    }

    @Override // p5.k0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o0) || !super.equals(obj)) {
            return false;
        }
        s5.q qVar = this.f21253f;
        int iF = qVar.f24518b.f();
        s5.q qVar2 = ((o0) obj).f21253f;
        if (iF != qVar2.f24518b.f() || qVar.f24519c != qVar2.f24519c) {
            return false;
        }
        p.c1<k0> c1Var = qVar.f24518b;
        kotlin.jvm.internal.r.e(c1Var, "<this>");
        Iterator it = ((lh.a) lh.l.g(new p.f1(c1Var))).iterator();
        while (it.hasNext()) {
            k0 k0Var = (k0) it.next();
            if (!k0Var.equals(qVar2.f24518b.c(k0Var.f21235b.f24511d))) {
                return false;
            }
        }
        return true;
    }

    @Override // p5.k0
    public final k0.b f(i0 i0Var) {
        k0.b bVarF = super.f(i0Var);
        s5.q qVar = this.f21253f;
        qVar.getClass();
        return qVar.d(bVarF, i0Var, false, qVar.f24517a);
    }

    public final k0.b g(i0 i0Var, k0 k0Var) {
        return this.f21253f.d(super.f(i0Var), i0Var, true, k0Var);
    }

    @Override // p5.k0
    public final int hashCode() {
        s5.q qVar = this.f21253f;
        int iA = qVar.f24519c;
        p.c1<k0> c1Var = qVar.f24518b;
        int iF = c1Var.f();
        for (int i10 = 0; i10 < iF; i10++) {
            iA = m0.a(iA, 31, c1Var.d(i10), 31) + c1Var.g(i10).hashCode();
        }
        return iA;
    }

    public final k0.b i(String route, boolean z10, k0 k0Var) {
        k0.b bVarI;
        kotlin.jvm.internal.r.e(route, "route");
        s5.q qVar = this.f21253f;
        qVar.getClass();
        o0 o0Var = qVar.f24517a;
        k0.b bVarA = o0Var.f21235b.a(route);
        ArrayList arrayList = new ArrayList();
        Iterator<k0> it = o0Var.iterator();
        while (true) {
            s5.p pVar = (s5.p) it;
            bVarI = null;
            if (!pVar.hasNext()) {
                break;
            }
            k0 k0Var2 = (k0) pVar.next();
            if (!kotlin.jvm.internal.r.a(k0Var2, k0Var)) {
                if (k0Var2 instanceof o0) {
                    bVarI = ((o0) k0Var2).i(route, false, o0Var);
                } else {
                    k0Var2.getClass();
                    bVarI = k0Var2.f21235b.a(route);
                }
            }
            if (bVarI != null) {
                arrayList.add(bVarI);
            }
        }
        k0.b bVar = (k0.b) qg.x.L(arrayList);
        o0 o0Var2 = o0Var.f21236c;
        if (o0Var2 != null && z10 && !o0Var2.equals(k0Var)) {
            bVarI = o0Var2.i(route, true, o0Var);
        }
        return (k0.b) qg.x.L(qg.o.s(new k0.b[]{bVarA, bVar, bVarI}));
    }

    @Override // java.lang.Iterable
    public final Iterator<k0> iterator() {
        s5.q qVar = this.f21253f;
        qVar.getClass();
        return new s5.p(qVar);
    }

    @Override // p5.k0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        s5.q qVar = this.f21253f;
        String str = qVar.f24521e;
        qVar.getClass();
        k0 k0VarB = (str == null || mh.x.A(str)) ? null : qVar.b(str, true);
        if (k0VarB == null) {
            k0VarB = qVar.a(qVar.f24519c);
        }
        sb.append(" startDestination=");
        if (k0VarB == null) {
            String str2 = qVar.f24521e;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = qVar.f24520d;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(qVar.f24519c));
                }
            }
        } else {
            sb.append("{");
            sb.append(k0VarB.toString());
            sb.append("}");
        }
        String string = sb.toString();
        kotlin.jvm.internal.r.d(string, "toString(...)");
        return string;
    }
}
