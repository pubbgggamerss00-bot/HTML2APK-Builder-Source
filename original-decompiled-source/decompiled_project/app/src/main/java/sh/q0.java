package sh;

/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final uh.v f25075a = new uh.v("NO_VALUE");

    public static final o0 a(int i10, int i11, rh.a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(j2.y.a(i10, "replay cannot be negative, but was ").toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(j2.y.a(i11, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i10 <= 0 && i11 <= 0 && aVar != rh.a.f23576a) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i12 = i11 + i10;
        if (i12 < 0) {
            i12 = Integer.MAX_VALUE;
        }
        return new o0(i10, i12, aVar);
    }

    public static /* synthetic */ o0 b(int i10, int i11, rh.a aVar) {
        int i12 = (i11 & 1) != 0 ? 0 : 1;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = rh.a.f23576a;
        }
        return a(i12, i10, aVar);
    }

    public static final void c(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }

    public static final <T> f<T> d(n0<? extends T> n0Var, tg.h hVar, int i10, rh.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == rh.a.f23576a) ? n0Var : new th.j(n0Var, hVar, i10, aVar);
    }
}
