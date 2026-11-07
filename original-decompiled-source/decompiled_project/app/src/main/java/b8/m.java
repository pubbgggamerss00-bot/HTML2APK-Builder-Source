package b8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import qg.x;
import r7.f;

/* loaded from: classes.dex */
public class m<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final long f3674a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f3675b = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: c, reason: collision with root package name */
    public long f3676c;

    public m(long j10) {
        this.f3674a = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    public void a(K k10, V v10, V v11) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        if (this.f3676c == -1) {
            Iterator<T> it = this.f3675b.entrySet().iterator();
            long jC = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jC += c(entry.getKey(), entry.getValue());
            }
            this.f3676c = jC;
        }
        return this.f3676c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c(K k10, V v10) throws Exception {
        try {
            long j10 = ((f.a) v10).f23232c;
            if (j10 >= 0) {
                return j10;
            }
            throw new IllegalStateException(("sizeOf(" + k10 + ", " + v10 + ") returned a negative value: " + j10).toString());
        } catch (Exception e10) {
            this.f3676c = -1L;
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(long j10) {
        while (b() > j10) {
            LinkedHashMap linkedHashMap = this.f3675b;
            if (linkedHashMap.isEmpty()) {
                if (b() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) x.A(linkedHashMap.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            linkedHashMap.remove(key);
            this.f3676c = b() - c(key, value);
            a(key, value, null);
        }
    }
}
