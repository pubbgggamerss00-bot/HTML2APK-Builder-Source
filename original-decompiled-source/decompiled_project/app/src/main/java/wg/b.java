package wg;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.r;
import qg.c;

/* loaded from: classes2.dex */
public final class b<T extends Enum<T>> extends c<T> implements a<T>, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final T[] f31536a;

    public b(T[] entries) {
        r.e(entries, "entries");
        this.f31536a = entries;
    }

    @Override // qg.a
    public final int c() {
        return this.f31536a.length;
    }

    @Override // qg.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        T[] tArr = this.f31536a;
        r.e(tArr, "<this>");
        return ((iOrdinal < 0 || iOrdinal >= tArr.length) ? null : tArr[iOrdinal]) == r42;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        T[] tArr = this.f31536a;
        int length = tArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(e1.c.a(i10, length, "index: ", ", size: "));
        }
        return tArr[i10];
    }

    @Override // qg.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        T[] tArr = this.f31536a;
        r.e(tArr, "<this>");
        if (((iOrdinal < 0 || iOrdinal >= tArr.length) ? null : tArr[iOrdinal]) == r42) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // qg.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
