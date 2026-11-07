package c6;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: v, reason: collision with root package name */
    public static final c f2236v;

    static {
        int i6 = j.f2243c;
        int i7 = j.f2244d;
        long j6 = j.f2245e;
        String str = j.f2241a;
        c cVar = new c();
        cVar.f2237u = new a(i6, i7, str, j6);
        f2236v = cVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // y5.u
    public final String toString() {
        return "Dispatchers.Default";
    }
}
