package z0;

import java.util.NoSuchElementException;
import jh.g;
import jh.j;
import kotlin.jvm.internal.r;
import p.h0;
import p.l0;
import p.r0;
import qg.m;
import x0.g1;
import x0.o1;

/* loaded from: classes.dex */
public final class a<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final l0<Object, Object> f34699a;

    public /* synthetic */ a(l0 l0Var) {
        this.f34699a = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(l0<Object, Object> l0Var, K k10, V v10) {
        int iH = l0Var.h(k10);
        boolean z10 = iH < 0;
        Object obj = z10 ? null : l0Var.f20739c[iH];
        if (obj != null) {
            if (obj instanceof h0) {
                h0 h0Var = (h0) obj;
                h0Var.g(v10);
                v10 = h0Var;
            } else {
                Object[] objArr = r0.f20710a;
                h0 h0Var2 = new h0(2);
                h0Var2.g(obj);
                h0Var2.g(v10);
                v10 = h0Var2;
            }
        }
        if (!z10) {
            l0Var.f20739c[iH] = v10;
            return;
        }
        int i10 = ~iH;
        l0Var.f20738b[i10] = k10;
        l0Var.f20739c[i10] = v10;
    }

    public static l0 b() {
        return new l0((Object) null);
    }

    public static final Object c(l0 l0Var, g1 g1Var) {
        Object objD = l0Var.d(g1Var);
        if (objD == null) {
            return null;
        }
        if (!(objD instanceof h0)) {
            l0Var.j(g1Var);
            return objD;
        }
        h0 h0Var = (h0) objD;
        if (h0Var.d()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i10 = h0Var.f20707b - 1;
        E eB = h0Var.b(i10);
        h0Var.k(i10);
        r.c(eB, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (h0Var.d()) {
            l0Var.j(g1Var);
        }
        if (h0Var.f20707b == 1) {
            l0Var.l(g1Var, h0Var.a());
        }
        return eB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(l0 l0Var, g1 g1Var, o1.a aVar) {
        Object objD = l0Var.d(g1Var);
        if (objD != null) {
            if (!(objD instanceof h0)) {
                if (((Boolean) aVar.invoke(objD)).booleanValue()) {
                    l0Var.j(g1Var);
                    return;
                }
                return;
            }
            h0 h0Var = (h0) objD;
            int i10 = h0Var.f20707b;
            Object[] objArr = h0Var.f20706a;
            int i11 = 0;
            g gVarQ = j.q(0, i10);
            int i12 = gVarQ.f15744a;
            int i13 = gVarQ.f15745b;
            if (i12 <= i13) {
                while (true) {
                    objArr[i12 - i11] = objArr[i12];
                    if (((Boolean) aVar.invoke(objArr[i12])).booleanValue()) {
                        i11++;
                    }
                    if (i12 == i13) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            m.m(objArr, i10 - i11, i10, null);
            h0Var.f20707b -= i11;
            if (h0Var.d()) {
                l0Var.j(g1Var);
            }
            if (h0Var.f20707b == 0) {
                l0Var.l(g1Var, h0Var.a());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final h0 e(l0 l0Var) {
        if (l0Var.e()) {
            h0 h0Var = r0.f20711b;
            r.c(h0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return h0Var;
        }
        h0 h0Var2 = new h0((Object) null);
        Object[] objArr = l0Var.f20739c;
        long[] jArr = l0Var.f20737a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (obj instanceof h0) {
                                h0 h0Var3 = (h0) obj;
                                if (!h0Var3.d()) {
                                    int i13 = h0Var2.f20707b + h0Var3.f20707b;
                                    Object[] objArr2 = h0Var2.f20706a;
                                    if (objArr2.length < i13) {
                                        h0Var2.m(i13, objArr2);
                                    }
                                    m.g(h0Var3.f20706a, h0Var2.f20707b, h0Var2.f20706a, 0, h0Var3.f20707b);
                                    h0Var2.f20707b += h0Var3.f20707b;
                                }
                            } else {
                                r.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                h0Var2.g(obj);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return h0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return r.a(this.f34699a, ((a) obj).f34699a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34699a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f34699a + ')';
    }
}
