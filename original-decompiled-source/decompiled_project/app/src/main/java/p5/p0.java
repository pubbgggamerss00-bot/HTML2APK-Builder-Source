package p5;

import java.util.ArrayList;
import p5.c1;

/* loaded from: classes.dex */
public final class p0 extends l0<o0> {

    /* renamed from: g, reason: collision with root package name */
    public final c1 f21254g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21255h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f21256i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(c1 provider, String startDestination) {
        super(provider.b(c1.a.a(r0.class)), null);
        kotlin.jvm.internal.r.e(provider, "provider");
        kotlin.jvm.internal.r.e(startDestination, "startDestination");
        this.f21256i = new ArrayList();
        this.f21254g = provider;
        this.f21255h = startDestination;
    }

    public final o0 c() {
        o0 o0Var = (o0) super.a();
        ArrayList nodes = this.f21256i;
        kotlin.jvm.internal.r.e(nodes, "nodes");
        s5.q qVar = o0Var.f21253f;
        qVar.getClass();
        int size = nodes.size();
        int iHashCode = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = nodes.get(i10);
            i10++;
            k0 k0Var = (k0) obj;
            if (k0Var != null) {
                p.c1<k0> c1Var = qVar.f24518b;
                o0 o0Var2 = qVar.f24517a;
                s5.o oVar = o0Var2.f21235b;
                s5.o oVar2 = k0Var.f21235b;
                int i11 = oVar2.f24511d;
                String str = oVar2.f24512e;
                if (i11 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = oVar.f24512e;
                if (str2 != null && kotlin.jvm.internal.r.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + k0Var + " cannot have the same route as graph " + o0Var2).toString());
                }
                if (i11 == oVar.f24511d) {
                    throw new IllegalArgumentException(("Destination " + k0Var + " cannot have the same id as graph " + o0Var2).toString());
                }
                k0 k0VarC = c1Var.c(i11);
                if (k0VarC == k0Var) {
                    continue;
                } else {
                    if (k0Var.f21236c != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (k0VarC != null) {
                        k0VarC.f21236c = null;
                    }
                    k0Var.f21236c = o0Var2;
                    c1Var.e(oVar2.f24511d, k0Var);
                }
            }
        }
        String str3 = this.f21255h;
        if (str3 == null) {
            if (this.f21246c != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        o0 o0Var3 = qVar.f24517a;
        if (str3 != null) {
            if (str3.equals(o0Var3.f21235b.f24512e)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + o0Var3).toString());
            }
            if (mh.x.A(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i12 = k0.f21233e;
            iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        qVar.f24519c = iHashCode;
        qVar.f24521e = str3;
        return o0Var;
    }
}
