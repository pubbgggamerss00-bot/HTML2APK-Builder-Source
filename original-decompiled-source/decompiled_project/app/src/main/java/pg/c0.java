package pg;

import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes2.dex */
public final class c0 implements Comparable<c0> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f21454b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final short f21455a;

    public static final class a {
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(c0 c0Var) {
        return kotlin.jvm.internal.r.f(this.f21455a & HPKE.aead_EXPORT_ONLY, c0Var.f21455a & HPKE.aead_EXPORT_ONLY);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return this.f21455a == ((c0) obj).f21455a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f21455a);
    }

    public final String toString() {
        return String.valueOf(this.f21455a & HPKE.aead_EXPORT_ONLY);
    }
}
