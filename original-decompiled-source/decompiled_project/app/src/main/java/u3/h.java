package u3;

import android.os.LocaleList;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f29247a;

    public h(LocaleList localeList) {
        this.f29247a = localeList;
    }

    @Override // u3.g
    public final Object a() {
        return this.f29247a;
    }

    public final boolean equals(Object obj) {
        return this.f29247a.equals(((g) obj).a());
    }

    public final int hashCode() {
        return this.f29247a.hashCode();
    }

    public final String toString() {
        return this.f29247a.toString();
    }
}
