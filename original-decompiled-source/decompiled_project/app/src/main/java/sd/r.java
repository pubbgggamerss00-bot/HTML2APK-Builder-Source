package sd;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class r<T> implements fe.b<Set<T>> {

    /* renamed from: a, reason: collision with root package name */
    public volatile Set<fe.b<T>> f24879a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Set<T> f24880b;

    public r() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        throw r0;
     */
    @Override // fe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.f24880b == null) {
            synchronized (this) {
                try {
                    if (this.f24880b == null) {
                        this.f24880b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator<fe.b<T>> it = this.f24879a.iterator();
                            while (it.hasNext()) {
                                this.f24880b.add(it.next().get());
                            }
                            this.f24879a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f24880b);
    }
}
