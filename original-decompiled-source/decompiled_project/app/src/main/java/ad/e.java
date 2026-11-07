package ad;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class e extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f405b;

    /* renamed from: c, reason: collision with root package name */
    public final b f406c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f407a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f408b;

        /* renamed from: c, reason: collision with root package name */
        public b f409c;

        public final e a() throws GeneralSecurityException {
            Integer num = this.f407a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f408b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f409c != null) {
                return new e(num.intValue(), this.f408b.intValue(), this.f409c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public final void b(int i10) throws GeneralSecurityException {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f407a = Integer.valueOf(i10);
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f410b = new b("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final b f411c = new b("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final b f412d = new b("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final b f413e = new b("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f414a;

        public b(String str) {
            this.f414a = str;
        }

        public final String toString() {
            return this.f414a;
        }
    }

    public e(int i10, int i11, b bVar) {
        this.f404a = i10;
        this.f405b = i11;
        this.f406c = bVar;
    }

    public final int b0() {
        b bVar = b.f413e;
        int i10 = this.f405b;
        b bVar2 = this.f406c;
        if (bVar2 == bVar) {
            return i10;
        }
        if (bVar2 != b.f410b && bVar2 != b.f411c && bVar2 != b.f412d) {
            throw new IllegalStateException("Unknown variant");
        }
        return i10 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f404a == this.f404a && eVar.b0() == b0() && eVar.f406c == this.f406c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f404a), Integer.valueOf(this.f405b), this.f406c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f406c);
        sb.append(", ");
        sb.append(this.f405b);
        sb.append("-byte tags, and ");
        return x0.a.a(sb, this.f404a, "-byte key)");
    }
}
