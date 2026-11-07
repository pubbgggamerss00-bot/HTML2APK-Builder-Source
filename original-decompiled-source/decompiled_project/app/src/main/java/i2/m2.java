package i2;

/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f13956a = a.b(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f13957b = 0;

    public static final class a {
        public static final int a(int i10, long j10) {
            int i11 = m2.f13957b;
            return ((int) (j10 >> (i10 * 15))) & 32767;
        }

        public static long b(int i10, int i11, int i12, int i13) {
            return ((i11 & 32767) << 15) | (i10 & 32767) | ((i12 & 32767) << 30) | ((i13 & 32767) << 45) | Long.MIN_VALUE;
        }
    }
}
