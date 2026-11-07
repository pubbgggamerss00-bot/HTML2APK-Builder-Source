package ff;

import cf.r;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f11216a;

        /* renamed from: b, reason: collision with root package name */
        public long f11217b;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f11218a;

        /* renamed from: b, reason: collision with root package name */
        public long f11219b;
    }

    public static class c {
    }

    public static void a(r rVar, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (255 & j10);
            j10 >>= 8;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            rVar.write(bArr[(i10 - i12) - 1]);
        }
    }
}
