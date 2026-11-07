package l9;

import androidx.room.y0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f16781a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16782b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16783c;

    public b(String code, String nativeName, String englishName) {
        kotlin.jvm.internal.r.e(code, "code");
        kotlin.jvm.internal.r.e(nativeName, "nativeName");
        kotlin.jvm.internal.r.e(englishName, "englishName");
        this.f16781a = code;
        this.f16782b = nativeName;
        this.f16783c = englishName;
    }

    public final String a() {
        String str = this.f16782b;
        String str2 = this.f16783c;
        if (mh.t.j(str, str2, true)) {
            return str;
        }
        return str + " (" + str2 + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.r.a(this.f16781a, bVar.f16781a) && kotlin.jvm.internal.r.a(this.f16782b, bVar.f16782b) && kotlin.jvm.internal.r.a(this.f16783c, bVar.f16783c);
    }

    public final int hashCode() {
        return this.f16783c.hashCode() + l0.k.a(this.f16781a.hashCode() * 31, 31, this.f16782b);
    }

    public final String toString() {
        return b.o.a(y0.a("AppLanguage(code=", this.f16781a, ", nativeName=", this.f16782b, ", englishName="), this.f16783c, ")");
    }
}
