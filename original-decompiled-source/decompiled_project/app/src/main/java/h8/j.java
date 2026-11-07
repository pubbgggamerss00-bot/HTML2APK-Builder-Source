package h8;

import androidx.room.y0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f12409a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12410b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12411c;

    public j(String str, String str2, String str3) {
        this.f12409a = str;
        this.f12410b = str2;
        this.f12411c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.r.a(this.f12409a, jVar.f12409a) && kotlin.jvm.internal.r.a(this.f12410b, jVar.f12410b) && kotlin.jvm.internal.r.a(this.f12411c, jVar.f12411c);
    }

    public final int hashCode() {
        return this.f12411c.hashCode() + l0.k.a(this.f12409a.hashCode() * 31, 31, this.f12410b);
    }

    public final String toString() {
        return b.o.a(y0.a("AiIcon(symbol=", this.f12409a, ", background=", this.f12410b, ", foreground="), this.f12411c, ")");
    }
}
