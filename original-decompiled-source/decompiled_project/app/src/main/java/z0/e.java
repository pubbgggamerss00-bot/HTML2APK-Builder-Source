package z0;

import p.l0;
import p.m0;

/* loaded from: classes.dex */
public final class e<Key, Scope> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r4v1, types: [p.m0] */
    public static final void a(l0<Object, Object> l0Var, Key key, Scope scope) {
        int iH = l0Var.h(key);
        boolean z10 = iH < 0;
        Scope scope2 = z10 ? null : l0Var.f20739c[iH];
        if (scope2 != null) {
            if (scope2 instanceof m0) {
                ((m0) scope2).d(scope);
            } else if (scope2 != scope) {
                ?? m0Var = new m0((Object) null);
                m0Var.d(scope2);
                m0Var.d(scope);
                scope = m0Var;
            }
            scope = scope2;
        }
        if (!z10) {
            l0Var.f20739c[iH] = scope;
            return;
        }
        int i10 = ~iH;
        l0Var.f20738b[i10] = key;
        l0Var.f20739c[i10] = scope;
    }

    public static final boolean b(l0<Object, Object> l0Var, Key key, Scope scope) {
        Object objD = l0Var.d(key);
        if (objD == null) {
            return false;
        }
        if (!(objD instanceof m0)) {
            if (!objD.equals(scope)) {
                return false;
            }
            l0Var.j(key);
            return true;
        }
        m0 m0Var = (m0) objD;
        boolean zL = m0Var.l(scope);
        if (zL && m0Var.b()) {
            l0Var.j(key);
        }
        return zL;
    }

    public static final void c(l0<Object, Object> l0Var, Scope scope) {
        boolean zB;
        long[] jArr = l0Var.f20737a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = l0Var.f20738b[i13];
                        Object obj2 = l0Var.f20739c[i13];
                        if (obj2 instanceof m0) {
                            m0 m0Var = (m0) obj2;
                            m0Var.l(scope);
                            zB = m0Var.b();
                        } else {
                            zB = obj2 == scope;
                        }
                        if (zB) {
                            l0Var.k(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }
}
