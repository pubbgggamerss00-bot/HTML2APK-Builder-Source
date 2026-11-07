package w;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class f<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final int f14843a;

    /* renamed from: b, reason: collision with root package name */
    public final x.b<K, V> f14844b;

    /* renamed from: c, reason: collision with root package name */
    public final a1.a f14845c;

    /* renamed from: d, reason: collision with root package name */
    public int f14846d;

    /* renamed from: e, reason: collision with root package name */
    public int f14847e;

    /* renamed from: f, reason: collision with root package name */
    public int f14848f;

    public f(int i6) {
        this.f14843a = i6;
        if (i6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f14844b = new x.b<>();
        this.f14845c = new a1.a();
    }

    public final V a(K k6) {
        j.e("key", k6);
        synchronized (this.f14845c) {
            x.b<K, V> bVar = this.f14844b;
            bVar.getClass();
            V v2 = bVar.f15107a.get(k6);
            if (v2 != null) {
                this.f14847e++;
                return v2;
            }
            this.f14848f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V b(K k6, V v2) {
        V vPut;
        j.e("key", k6);
        synchronized (this.f14845c) {
            this.f14846d++;
            x.b<K, V> bVar = this.f14844b;
            bVar.getClass();
            vPut = bVar.f15107a.put(k6, v2);
            if (vPut != null) {
                this.f14846d--;
            }
        }
        int i6 = this.f14843a;
        while (true) {
            synchronized (this.f14845c) {
                try {
                    if (this.f14846d < 0 || (this.f14844b.f15107a.isEmpty() && this.f14846d != 0)) {
                        break;
                    }
                    if (this.f14846d <= i6 || this.f14844b.f15107a.isEmpty()) {
                        break;
                    }
                    Set<Map.Entry<K, V>> setEntrySet = this.f14844b.f15107a.entrySet();
                    j.d("map.entries", setEntrySet);
                    Object next = null;
                    if (setEntrySet instanceof List) {
                        List list = (List) setEntrySet;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        }
                    } else {
                        Iterator<T> it = setEntrySet.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null) {
                        return vPut;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    x.b<K, V> bVar2 = this.f14844b;
                    bVar2.getClass();
                    j.e("key", key);
                    bVar2.f15107a.remove(key);
                    int i7 = this.f14846d;
                    j.e("value", value);
                    this.f14846d = i7 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String toString() {
        String str;
        synchronized (this.f14845c) {
            try {
                int i6 = this.f14847e;
                int i7 = this.f14848f + i6;
                str = "LruCache[maxSize=" + this.f14843a + ",hits=" + this.f14847e + ",misses=" + this.f14848f + ",hitRate=" + (i7 != 0 ? (i6 * 100) / i7 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
