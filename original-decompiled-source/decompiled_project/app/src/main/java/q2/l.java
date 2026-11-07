package q2;

import j2.h3;
import java.util.Iterator;
import java.util.Map;
import p.l0;
import p.w0;
import r.o2;

/* loaded from: classes.dex */
public final class l implements d0, Iterable<Map.Entry<? extends c0<?>, ? extends Object>>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final l0<c0<?>, Object> f21799a = w0.b();

    /* renamed from: b, reason: collision with root package name */
    public p.u f21800b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21801c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21802d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q2.d0
    public final <T> void c(c0<T> c0Var, T t3) {
        boolean z10 = t3 instanceof a;
        l0<c0<?>, Object> l0Var = this.f21799a;
        if (!z10 || !l0Var.b(c0Var)) {
            l0Var.l(c0Var, t3);
            return;
        }
        Object objD = l0Var.d(c0Var);
        kotlin.jvm.internal.r.c(objD, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) objD;
        a aVar2 = (a) t3;
        String str = aVar2.f21752a;
        if (str == null) {
            str = aVar.f21752a;
        }
        pg.f fVar = aVar2.f21753b;
        if (fVar == null) {
            fVar = aVar.f21753b;
        }
        l0Var.l(c0Var, new a(str, fVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l e() {
        l lVar = new l();
        lVar.f21801c = this.f21801c;
        lVar.f21802d = this.f21802d;
        l0<c0<?>, Object> l0Var = lVar.f21799a;
        l0Var.getClass();
        l0<c0<?>, Object> from = this.f21799a;
        kotlin.jvm.internal.r.e(from, "from");
        Object[] objArr = from.f20738b;
        Object[] objArr2 = from.f20739c;
        long[] jArr = from.f20737a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            l0Var.l(objArr[i13], objArr2[i13]);
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
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.r.a(this.f21799a, lVar.f21799a) && this.f21801c == lVar.f21801c && this.f21802d == lVar.f21802d;
    }

    public final <T> T f(c0<T> c0Var) {
        T t3 = (T) this.f21799a.d(c0Var);
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException("Key not present: " + c0Var + " - consider getOrElse or getOrNull");
    }

    public final <T> T g(c0<T> c0Var, eh.a<? extends T> aVar) {
        T t3 = (T) this.f21799a.d(c0Var);
        return t3 == null ? aVar.invoke() : t3;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21802d) + o2.a(this.f21799a.hashCode() * 31, 31, this.f21801c);
    }

    public final void i(l lVar) {
        l0<c0<?>, Object> l0Var = lVar.f21799a;
        Object[] objArr = l0Var.f20738b;
        Object[] objArr2 = l0Var.f20739c;
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
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        c0<?> c0Var = (c0) obj;
                        l0<c0<?>, Object> l0Var2 = this.f21799a;
                        Object objD = l0Var2.d(c0Var);
                        kotlin.jvm.internal.r.c(c0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = c0Var.f21759b.invoke(objD, obj2);
                        if (objInvoke != null) {
                            l0Var2.l(c0Var, objInvoke);
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

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends c0<?>, ? extends Object>> iterator() {
        p.u uVar = this.f21800b;
        if (uVar == null) {
            l0<c0<?>, Object> l0Var = this.f21799a;
            l0Var.getClass();
            p.u uVar2 = new p.u(l0Var);
            this.f21800b = uVar2;
            uVar = uVar2;
        }
        return ((p.d) uVar.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f21801c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f21802d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        l0<c0<?>, Object> l0Var = this.f21799a;
        Object[] objArr = l0Var.f20738b;
        Object[] objArr2 = l0Var.f20739c;
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
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            sb.append(str);
                            sb.append(((c0) obj).f21758a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return h3.b(this) + "{ " + ((Object) sb) + " }";
    }
}
