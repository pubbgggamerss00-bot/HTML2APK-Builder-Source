package wh;

import ph.g0;

/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final c f31565d;

    static {
        int i10 = i.f31573c;
        int i11 = i.f31574d;
        long j10 = i.f31575e;
        String str = i.f31571a;
        c cVar = new c();
        cVar.f31567c = new a(i10, i11, j10, str);
        f31565d = cVar;
    }

    @Override // ph.g0
    public final g0 G0(int i10) {
        uh.i.a(i10);
        return i10 >= i.f31573c ? this : super.G0(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // ph.g0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
