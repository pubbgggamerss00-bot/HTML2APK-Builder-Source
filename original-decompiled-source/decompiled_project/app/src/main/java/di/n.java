package di;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f8055a = new ConcurrentHashMap(16);

    public static final class a<T> {
    }

    public final <T> T a(bi.f descriptor, a<T> aVar) {
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        Map map = (Map) this.f8055a.get(descriptor);
        T t3 = map != null ? (T) map.get(aVar) : null;
        if (t3 == null) {
            return null;
        }
        return t3;
    }
}
