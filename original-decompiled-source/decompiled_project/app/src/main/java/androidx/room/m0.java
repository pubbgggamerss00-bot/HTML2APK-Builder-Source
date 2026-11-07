package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class m0 implements i6.e, i6.d {

    /* renamed from: j, reason: collision with root package name */
    public static final TreeMap<Integer, m0> f3025j = new TreeMap<>();

    /* renamed from: a, reason: collision with root package name */
    public final int f3026a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f3027b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f3028c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f3029d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f3030e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f3031f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3032g;

    /* renamed from: h, reason: collision with root package name */
    public int f3033h;

    public m0(int i10) {
        this.f3026a = i10;
        int i11 = i10 + 1;
        this.f3032g = new int[i11];
        this.f3028c = new long[i11];
        this.f3029d = new double[i11];
        this.f3030e = new String[i11];
        this.f3031f = new byte[i11][];
    }

    public static final m0 p(int i10, String str) {
        TreeMap<Integer, m0> treeMap = f3025j;
        synchronized (treeMap) {
            Map.Entry<Integer, m0> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                m0 value = entryCeilingEntry.getValue();
                value.f3027b = str;
                value.f3033h = i10;
                return value;
            }
            pg.f0 f0Var = pg.f0.f21461a;
            m0 m0Var = new m0(i10);
            m0Var.f3027b = str;
            m0Var.f3033h = i10;
            return m0Var;
        }
    }

    @Override // i6.d
    public final void L(int i10, byte[] bArr) {
        this.f3032g[i10] = 5;
        this.f3031f[i10] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // i6.d
    public final void d(int i10, long j10) {
        this.f3032g[i10] = 2;
        this.f3028c[i10] = j10;
    }

    @Override // i6.d
    public final void e(int i10) {
        this.f3032g[i10] = 1;
    }

    @Override // i6.e
    public final void h(i6.d dVar) {
        int i10 = this.f3033h;
        if (1 > i10) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.f3032g[i11];
            if (i12 == 1) {
                dVar.e(i11);
            } else if (i12 == 2) {
                dVar.d(i11, this.f3028c[i11]);
            } else if (i12 == 3) {
                dVar.t(i11, this.f3029d[i11]);
            } else if (i12 == 4) {
                String str = this.f3030e[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.o(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.f3031f[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dVar.L(i11, bArr);
            }
            if (i11 == i10) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // i6.e
    public final String l() {
        String str = this.f3027b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // i6.d
    public final void o(int i10, String value) {
        kotlin.jvm.internal.r.e(value, "value");
        this.f3032g[i10] = 4;
        this.f3030e[i10] = value;
    }

    @Override // i6.d
    public final void t(int i10, double d10) {
        this.f3032g[i10] = 3;
        this.f3029d[i10] = d10;
    }

    public final void z() {
        TreeMap<Integer, m0> treeMap = f3025j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f3026a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.r.d(it, "iterator(...)");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
            pg.f0 f0Var = pg.f0.f21461a;
        }
    }
}
