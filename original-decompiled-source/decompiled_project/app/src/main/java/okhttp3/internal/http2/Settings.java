package okhttp3.internal.http2;

import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class Settings {

    /* renamed from: a, reason: collision with root package name */
    public int f19735a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f19736b = new int[10];

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public final int a() {
        if ((this.f19735a & 128) != 0) {
            return this.f19736b[7];
        }
        return 65535;
    }

    public final void b(Settings other) {
        r.e(other, "other");
        for (int i10 = 0; i10 < 10; i10++) {
            if (((1 << i10) & other.f19735a) != 0) {
                c(i10, other.f19736b[i10]);
            }
        }
    }

    public final void c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f19736b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f19735a = (1 << i10) | this.f19735a;
            iArr[i10] = i11;
        }
    }
}
