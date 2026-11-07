package androidx.work.impl.model;

import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class Preference {

    /* renamed from: a, reason: collision with root package name */
    public final String f3162a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f3163b;

    public Preference(String str, Long l10) {
        this.f3162a = str;
        this.f3163b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        return r.a(this.f3162a, preference.f3162a) && r.a(this.f3163b, preference.f3163b);
    }

    public final int hashCode() {
        int iHashCode = this.f3162a.hashCode() * 31;
        Long l10 = this.f3163b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f3162a + ", value=" + this.f3163b + ')';
    }
}
