package w5;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f31270c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f31271d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f31272a;

    /* renamed from: b, reason: collision with root package name */
    public final c f31273b;

    public static final class a {
    }

    public b(String filename, boolean z10) {
        ReentrantLock reentrantLock;
        r.e(filename, "filename");
        synchronized (f31270c) {
            try {
                LinkedHashMap linkedHashMap = f31271d;
                Object reentrantLock2 = linkedHashMap.get(filename);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(filename, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f31272a = reentrantLock;
        this.f31273b = z10 ? new c(filename) : null;
    }
}
