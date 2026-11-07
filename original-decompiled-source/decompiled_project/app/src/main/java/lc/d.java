package lc;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class d<T> {

    public static final class a extends d<Object> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16941a = new a();

        @Override // lc.d
        public final boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // lc.d
        public final int b(Object obj) {
            return obj.hashCode();
        }
    }

    public abstract boolean a(T t3, T t10);

    public abstract int b(T t3);

    public final boolean c(T t3, T t10) {
        if (t3 == t10) {
            return true;
        }
        if (t3 == null || t10 == null) {
            return false;
        }
        return a(t3, t10);
    }
}
