package nc;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f1 extends o0<Object> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f18680a = new f1();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public final String toString() {
        return "Ordering.usingToString()";
    }
}
