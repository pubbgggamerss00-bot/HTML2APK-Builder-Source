package x0;

/* loaded from: classes.dex */
public abstract class e2<T> {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f31668a;

    public e2() {
        throw null;
    }

    public e2(eh.a aVar) {
        this.f31668a = new b1(aVar);
    }

    public abstract f2<T> a(T t3);

    public v3<Object> b() {
        return this.f31668a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 x0.n0) = (r5v8 x0.n0), (r5v9 x0.n0) binds: [B:21:0x0041, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v3<T> c(f2<T> f2Var, v3<T> v3Var) {
        n0 n0Var;
        n0 n0Var2 = null;
        if (v3Var instanceof n0) {
            if (f2Var.f31675d) {
                n0Var2 = (n0) v3Var;
                n0Var2.f31820a.setValue(f2Var.a());
            }
        } else if (v3Var instanceof t3) {
            if ((f2Var.f31673b || f2Var.f31676e != null) && !f2Var.f31675d) {
                t3 t3Var = (t3) v3Var;
                boolean zA = kotlin.jvm.internal.r.a(f2Var.a(), t3Var.f31918a);
                n0Var = t3Var;
                if (zA) {
                    n0Var2 = n0Var;
                }
            }
        } else if (v3Var instanceof e0) {
            f2Var.getClass();
            e0 e0Var = (e0) v3Var;
            eh.l<x, T> lVar = e0Var.f31666a;
            n0Var = e0Var;
            if (lVar == null) {
            }
        }
        if (n0Var2 != null) {
            return n0Var2;
        }
        if (!f2Var.f31675d) {
            return new t3(f2Var.a());
        }
        T t3 = f2Var.f31676e;
        i3 i3Var = f2Var.f31674c;
        if (i3Var == null) {
            i3Var = u3.f31923a;
        }
        return new n0(new x1(t3, i3Var));
    }
}
