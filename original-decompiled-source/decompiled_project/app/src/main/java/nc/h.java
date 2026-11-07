package nc;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class h<T> extends o0<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator<T> f18682a;

    public h(Comparator<T> comparator) {
        comparator.getClass();
        this.f18682a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        return this.f18682a.compare(t3, t10);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return this.f18682a.equals(((h) obj).f18682a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18682a.hashCode();
    }

    public final String toString() {
        return this.f18682a.toString();
    }
}
