package p5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p5.b1;
import p5.k0;

@b1.a("navigation")
/* loaded from: classes.dex */
public class r0 extends b1<o0> {

    /* renamed from: c, reason: collision with root package name */
    public final c1 f21267c;

    public r0(c1 navigatorProvider) {
        kotlin.jvm.internal.r.e(navigatorProvider, "navigatorProvider");
        this.f21267c = navigatorProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, android.os.Bundle] */
    @Override // p5.b1
    public final void d(List list, u0 u0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            k0 k0Var = sVar.f21269b;
            kotlin.jvm.internal.r.c(k0Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            o0 o0Var = (o0) k0Var;
            s5.o oVar = o0Var.f21235b;
            kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
            g0Var.f16327a = sVar.f21275h.a();
            s5.q qVar = o0Var.f21253f;
            int i10 = qVar.f24519c;
            String str = qVar.f24521e;
            if (i10 == 0 && str == null) {
                oVar.getClass();
                String superName = String.valueOf(oVar.f24511d);
                kotlin.jvm.internal.r.e(superName, "superName");
                if (qVar.f24517a.f21235b.f24511d == 0) {
                    superName = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(superName).toString());
            }
            k0 k0VarB = str != null ? qVar.b(str, false) : qVar.f24518b.c(i10);
            if (k0VarB == null) {
                if (qVar.f24520d == null) {
                    String strValueOf = qVar.f24521e;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(qVar.f24519c);
                    }
                    qVar.f24520d = strValueOf;
                }
                String str2 = qVar.f24520d;
                kotlin.jvm.internal.r.b(str2);
                throw new IllegalArgumentException(i8.n.d("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            s5.o oVar2 = k0VarB.f21235b;
            if (str != null) {
                if (!str.equals(oVar2.f24512e)) {
                    k0.b bVarA = oVar2.a(str);
                    Bundle bundle = bVarA != null ? bVarA.f21239b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        ?? A = u3.d.a((pg.n[]) Arrays.copyOf(new pg.n[0], 0));
                        A.putAll(bundle);
                        Bundle bundle2 = (Bundle) g0Var.f16327a;
                        if (bundle2 != null) {
                            A.putAll(bundle2);
                        }
                        g0Var.f16327a = A;
                    }
                }
                if (k0VarB.e().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListG = c9.g.g(k0VarB.e(), new q0(g0Var, 0));
                    if (!arrayListG.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + k0VarB + ". Missing required arguments [" + arrayListG + ']').toString());
                    }
                }
            }
            this.f21267c.b(k0VarB.f21234a).d(c0.g0.c(b().c(k0VarB, k0VarB.c((Bundle) g0Var.f16327a))), u0Var);
        }
    }

    @Override // p5.b1
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public o0 a() {
        return new o0(this);
    }
}
