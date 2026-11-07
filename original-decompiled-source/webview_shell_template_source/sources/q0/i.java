package q0;

import android.os.LocaleList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f14102a;

    public i(LocaleList localeList) {
        this.f14102a = localeList;
    }

    @Override // q0.h
    public final Object a() {
        return this.f14102a;
    }

    public final boolean equals(Object obj) {
        return this.f14102a.equals(((h) obj).a());
    }

    public final int hashCode() {
        return this.f14102a.hashCode();
    }

    public final String toString() {
        return this.f14102a.toString();
    }
}
