package p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class s<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final q.b lock;
    private final q.c<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public s(int i10) {
        this.maxSize = i10;
        if (i10 <= 0) {
            q.d.a("maxSize <= 0");
            throw null;
        }
        this.map = new q.c<>();
        this.lock = new q.b();
    }

    private final int safeSizeOf(K k10, V v10) {
        int iSizeOf = sizeOf(k10, v10);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        String message = "Negative size: " + k10 + '=' + v10;
        kotlin.jvm.internal.r.e(message, "message");
        throw new IllegalStateException(message);
    }

    public V create(K key) {
        kotlin.jvm.internal.r.e(key, "key");
        return null;
    }

    public final int createCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.createCount;
        }
        return i10;
    }

    public void entryRemoved(boolean z10, K key, V oldValue, V v10) {
        kotlin.jvm.internal.r.e(key, "key");
        kotlin.jvm.internal.r.e(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.evictionCount;
        }
        return i10;
    }

    public final V get(K key) {
        V v10;
        kotlin.jvm.internal.r.e(key, "key");
        synchronized (this.lock) {
            q.c<K, V> cVar = this.map;
            cVar.getClass();
            V v11 = cVar.f21640a.get(key);
            if (v11 != null) {
                this.hitCount++;
                return v11;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v10 = (V) this.map.f21640a.put(key, vCreate);
                    if (v10 != null) {
                        this.map.f21640a.put(key, v10);
                    } else {
                        this.size += safeSizeOf(key, vCreate);
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (v10 != null) {
                entryRemoved(false, key, vCreate, v10);
                return v10;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.hitCount;
        }
        return i10;
    }

    public final int maxSize() {
        int i10;
        synchronized (this.lock) {
            i10 = this.maxSize;
        }
        return i10;
    }

    public final int missCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.missCount;
        }
        return i10;
    }

    public final V put(K key, V value) {
        V vPut;
        kotlin.jvm.internal.r.e(key, "key");
        kotlin.jvm.internal.r.e(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += safeSizeOf(key, value);
                vPut = this.map.f21640a.put(key, value);
                if (vPut != null) {
                    this.size -= safeSizeOf(key, vPut);
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vPut != null) {
            entryRemoved(false, key, vPut, value);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final int putCount() {
        int i10;
        synchronized (this.lock) {
            i10 = this.putCount;
        }
        return i10;
    }

    public final V remove(K key) {
        V vRemove;
        kotlin.jvm.internal.r.e(key, "key");
        synchronized (this.lock) {
            try {
                q.c<K, V> cVar = this.map;
                cVar.getClass();
                vRemove = cVar.f21640a.remove(key);
                if (vRemove != null) {
                    this.size -= safeSizeOf(key, vRemove);
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vRemove != null) {
            entryRemoved(false, key, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int i10) {
        if (!(i10 > 0)) {
            q.d.a("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = i10;
            pg.f0 f0Var = pg.f0.f21461a;
        }
        trimToSize(i10);
    }

    public final int size() {
        int i10;
        synchronized (this.lock) {
            i10 = this.size;
        }
        return i10;
    }

    public int sizeOf(K key, V value) {
        kotlin.jvm.internal.r.e(key, "key");
        kotlin.jvm.internal.r.e(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set<Map.Entry<K, V>> setEntrySet = this.map.f21640a.entrySet();
            kotlin.jvm.internal.r.d(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry<K, V>> setEntrySet2 = this.map.f21640a.entrySet();
            kotlin.jvm.internal.r.d(setEntrySet2, "<get-entries>(...)");
            Iterator<T> it = setEntrySet2.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i10 = this.hitCount;
                int i11 = this.missCount + i10;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.f21640a.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size <= i10 || this.map.f21640a.isEmpty()) {
                        break;
                    }
                    Set<Map.Entry<K, V>> setEntrySet = this.map.f21640a.entrySet();
                    kotlin.jvm.internal.r.d(setEntrySet, "<get-entries>(...)");
                    Map.Entry entry = (Map.Entry) qg.x.C(setEntrySet);
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    q.c<K, V> cVar = this.map;
                    cVar.getClass();
                    kotlin.jvm.internal.r.e(key, "key");
                    cVar.f21640a.remove(key);
                    this.size -= safeSizeOf(key, value);
                    this.evictionCount++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
