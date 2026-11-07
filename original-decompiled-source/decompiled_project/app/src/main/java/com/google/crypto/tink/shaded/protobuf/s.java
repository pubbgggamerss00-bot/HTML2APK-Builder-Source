package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.j1;
import com.google.crypto.tink.shaded.protobuf.s.a;
import com.google.crypto.tink.shaded.protobuf.y;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class s<T extends a<T>> {

    /* renamed from: d, reason: collision with root package name */
    public static final s f6757d = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public final i1 f6758a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6759b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6760c;

    public interface a<T extends a<T>> extends Comparable<T> {
        u1 getLiteJavaType();
    }

    public s() {
        this.f6758a = new i1(16);
    }

    public static int b(a<?> aVar, Object obj) {
        int size;
        int iS;
        aVar.getClass();
        int iQ = k.Q(0);
        Enum r12 = null;
        if (t1.f6769a == null) {
            iQ *= 2;
        }
        int iOrdinal = r12.ordinal();
        int iT = 1;
        switch (iOrdinal) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = k.f6720b;
                iT = 8;
                return iT + iQ;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = k.f6720b;
                iT = 4;
                return iT + iQ;
            case 2:
                iT = k.T(((Long) obj).longValue());
                return iT + iQ;
            case 3:
                iT = k.T(((Long) obj).longValue());
                return iT + iQ;
            case 4:
                iT = k.N(((Integer) obj).intValue());
                return iT + iQ;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = k.f6720b;
                iT = 8;
                return iT + iQ;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = k.f6720b;
                iT = 4;
                return iT + iQ;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = k.f6720b;
                return iT + iQ;
            case 8:
                if (!(obj instanceof h)) {
                    iT = k.P((String) obj);
                    return iT + iQ;
                }
                Logger logger6 = k.f6720b;
                size = ((h) obj).size();
                iS = k.S(size);
                iT = iS + size;
                return iT + iQ;
            case 9:
                Logger logger7 = k.f6720b;
                iT = ((p0) obj).getSerializedSize();
                return iT + iQ;
            case 10:
                if (obj instanceof b0) {
                    iT = k.O((b0) obj);
                    return iT + iQ;
                }
                Logger logger8 = k.f6720b;
                size = ((p0) obj).getSerializedSize();
                iS = k.S(size);
                iT = iS + size;
                return iT + iQ;
            case 11:
                if (obj instanceof h) {
                    Logger logger9 = k.f6720b;
                    size = ((h) obj).size();
                    iS = k.S(size);
                } else {
                    Logger logger10 = k.f6720b;
                    size = ((byte[]) obj).length;
                    iS = k.S(size);
                }
                iT = iS + size;
                return iT + iQ;
            case 12:
                iT = k.S(((Integer) obj).intValue());
                return iT + iQ;
            case 13:
                iT = obj instanceof y.a ? k.N(((y.a) obj).getNumber()) : k.N(((Integer) obj).intValue());
                return iT + iQ;
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = k.f6720b;
                iT = 4;
                return iT + iQ;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = k.f6720b;
                iT = 8;
                return iT + iQ;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iT = k.S((iIntValue >> 31) ^ (iIntValue << 1));
                return iT + iQ;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iT = k.T((jLongValue << 1) ^ (jLongValue >> 63));
                return iT + iQ;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int c(Map.Entry entry) {
        k.Q(1);
        a aVar = (a) entry.getKey();
        entry.getValue();
        aVar.getLiteJavaType();
        throw null;
    }

    public static <T extends a<T>> boolean e(Map.Entry<T, Object> entry) {
        entry.getKey().getLiteJavaType();
        throw null;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final s<T> clone() {
        s<T> sVar = new s<>();
        i1 i1Var = this.f6758a;
        if (i1Var.f6705b.size() > 0) {
            Map.Entry<Object, Object> entryF = i1Var.f(0);
            sVar.i((a) entryF.getKey(), entryF.getValue());
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = i1Var.g().iterator();
        if (!it.hasNext()) {
            sVar.f6760c = this.f6760c;
            return sVar;
        }
        Map.Entry<Object, Object> next = it.next();
        sVar.i((a) next.getKey(), next.getValue());
        throw null;
    }

    public final boolean d() {
        i1 i1Var = this.f6758a;
        if (i1Var.f6705b.size() > 0) {
            e(i1Var.f(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = i1Var.g().iterator();
        if (!it.hasNext()) {
            return true;
        }
        e(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f6758a.equals(((s) obj).f6758a);
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> f() {
        boolean z10 = this.f6760c;
        i1 i1Var = this.f6758a;
        if (!z10) {
            return ((j1.d) i1Var.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((j1.d) i1Var.entrySet()).iterator();
        b0.b bVar = new b0.b();
        bVar.f6631a = it;
        return bVar;
    }

    public final void g() {
        if (this.f6759b) {
            return;
        }
        int i10 = 0;
        while (true) {
            i1 i1Var = this.f6758a;
            if (i10 >= i1Var.f6705b.size()) {
                i1Var.i();
                this.f6759b = true;
                return;
            }
            Map.Entry<Object, Object> entryF = i1Var.f(i10);
            if (entryF.getValue() instanceof w) {
                w wVar = (w) entryF.getValue();
                wVar.getClass();
                c1 c1Var = c1.f6638c;
                c1Var.getClass();
                c1Var.a(wVar.getClass()).makeImmutable(wVar);
                wVar.o();
            }
            i10++;
        }
    }

    public final void h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b0) {
            ((b0) value).a(null);
        }
        key.getClass();
        key.getLiteJavaType();
        throw null;
    }

    public final int hashCode() {
        return this.f6758a.hashCode();
    }

    public final void i(T t3, Object obj) {
        t3.getClass();
        t3.getClass();
        Charset charset = y.f6818a;
        obj.getClass();
        throw null;
    }

    public s(int i10) {
        int i11 = j1.f6703g;
        this.f6758a = new i1(0);
        g();
        g();
    }
}
