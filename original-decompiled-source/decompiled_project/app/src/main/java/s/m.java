package s;

import s.q0;

/* loaded from: classes.dex */
public final class m {
    public static k0 a(a0 a0Var, y0 y0Var, int i10) {
        if ((i10 & 2) != 0) {
            y0Var = y0.f23998a;
        }
        return new k0(a0Var, y0Var, 0);
    }

    public static final <T> q0<T> b(eh.l<? super q0.b<T>, pg.f0> lVar) {
        q0.b bVar = new q0.b();
        lVar.invoke(bVar);
        return new q0<>(bVar);
    }

    public static l1 c(float f10, float f11, Object obj, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new l1(f10, f11, obj);
    }

    public static m2 d(int i10, int i11, b0 b0Var, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            b0Var = d0.f23703a;
        }
        return new m2(i10, i11, b0Var);
    }
}
