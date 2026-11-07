package a3;

import java.util.Locale;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f23a;

    public b(Locale locale) {
        this.f23a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return r.a(this.f23a.toLanguageTag(), ((b) obj).f23a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f23a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f23a.toLanguageTag();
    }
}
