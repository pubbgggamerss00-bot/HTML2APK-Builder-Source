package ad;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class m extends r {

    /* renamed from: a, reason: collision with root package name */
    public final int f426a;

    /* renamed from: b, reason: collision with root package name */
    public final int f427b;

    /* renamed from: c, reason: collision with root package name */
    public final c f428c;

    /* renamed from: d, reason: collision with root package name */
    public final b f429d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Integer f430a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f431b;

        /* renamed from: c, reason: collision with root package name */
        public b f432c;

        /* renamed from: d, reason: collision with root package name */
        public c f433d;

        public final m a() throws GeneralSecurityException {
            Integer num = this.f430a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f431b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f432c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f433d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f430a));
            }
            Integer num2 = this.f431b;
            int iIntValue = num2.intValue();
            b bVar = this.f432c;
            if (iIntValue < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
            }
            if (bVar == b.f434b) {
                if (iIntValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                }
            } else if (bVar == b.f435c) {
                if (iIntValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                }
            } else if (bVar == b.f436d) {
                if (iIntValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                }
            } else if (bVar == b.f437e) {
                if (iIntValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                }
            } else {
                if (bVar != b.f438f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (iIntValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                }
            }
            return new m(this.f430a.intValue(), this.f431b.intValue(), this.f433d, this.f432c);
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f434b = new b("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final b f435c = new b("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final b f436d = new b("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final b f437e = new b("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final b f438f = new b("SHA512");

        /* renamed from: a, reason: collision with root package name */
        public final String f439a;

        public b(String str) {
            this.f439a = str;
        }

        public final String toString() {
            return this.f439a;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f440b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f441c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f442d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f443e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f444a;

        public c(String str) {
            this.f444a = str;
        }

        public final String toString() {
            return this.f444a;
        }
    }

    public m(int i10, int i11, c cVar, b bVar) {
        this.f426a = i10;
        this.f427b = i11;
        this.f428c = cVar;
        this.f429d = bVar;
    }

    public final int b0() {
        c cVar = c.f443e;
        int i10 = this.f427b;
        c cVar2 = this.f428c;
        if (cVar2 == cVar) {
            return i10;
        }
        if (cVar2 != c.f440b && cVar2 != c.f441c && cVar2 != c.f442d) {
            throw new IllegalStateException("Unknown variant");
        }
        return i10 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.f426a == this.f426a && mVar.b0() == b0() && mVar.f428c == this.f428c && mVar.f429d == this.f429d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f426a), Integer.valueOf(this.f427b), this.f428c, this.f429d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f428c);
        sb.append(", hashType: ");
        sb.append(this.f429d);
        sb.append(", ");
        sb.append(this.f427b);
        sb.append("-byte tags, and ");
        return x0.a.a(sb, this.f426a, "-byte key)");
    }
}
