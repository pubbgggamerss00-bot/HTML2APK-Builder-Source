package v1;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i implements z1.c, Closeable {
    public static final TreeMap<Integer, i> A = new TreeMap<>();
    public volatile String s;

    /* renamed from: t, reason: collision with root package name */
    public final long[] f14790t;

    /* renamed from: u, reason: collision with root package name */
    public final double[] f14791u;

    /* renamed from: v, reason: collision with root package name */
    public final String[] f14792v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[][] f14793w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f14794x;

    /* renamed from: y, reason: collision with root package name */
    public final int f14795y;

    /* renamed from: z, reason: collision with root package name */
    public int f14796z;

    public i(int i6) {
        this.f14795y = i6;
        int i7 = i6 + 1;
        this.f14794x = new int[i7];
        this.f14790t = new long[i7];
        this.f14791u = new double[i7];
        this.f14792v = new String[i7];
        this.f14793w = new byte[i7][];
    }

    public static i a(int i6, String str) {
        TreeMap<Integer, i> treeMap = A;
        synchronized (treeMap) {
            try {
                Map.Entry<Integer, i> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i6));
                if (entryCeilingEntry == null) {
                    i iVar = new i(i6);
                    iVar.s = str;
                    iVar.f14796z = i6;
                    return iVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                i value = entryCeilingEntry.getValue();
                value.s = str;
                value.f14796z = i6;
                return value;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z1.c
    public final String b() {
        return this.s;
    }

    public final void c(int i6, long j6) {
        this.f14794x[i6] = 2;
        this.f14790t[i6] = j6;
    }

    @Override // z1.c
    public final void d(a2.d dVar) {
        for (int i6 = 1; i6 <= this.f14796z; i6++) {
            int i7 = this.f14794x[i6];
            if (i7 == 1) {
                dVar.c(i6);
            } else if (i7 == 2) {
                dVar.b(i6, this.f14790t[i6]);
            } else if (i7 == 3) {
                dVar.s.bindDouble(i6, this.f14791u[i6]);
            } else if (i7 == 4) {
                dVar.d(i6, this.f14792v[i6]);
            } else if (i7 == 5) {
                dVar.a(i6, this.f14793w[i6]);
            }
        }
    }

    public final void e(int i6) {
        this.f14794x[i6] = 1;
    }

    public final void f(int i6, String str) {
        this.f14794x[i6] = 4;
        this.f14792v[i6] = str;
    }

    public final void h() {
        TreeMap<Integer, i> treeMap = A;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f14795y), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i6 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i6;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
