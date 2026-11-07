package l7;

import j7.q;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public final q f16761a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16762b;

    /* renamed from: c, reason: collision with root package name */
    public final j7.f f16763c;

    public p(q qVar, String str, j7.f fVar) {
        this.f16761a = qVar;
        this.f16762b = str;
        this.f16763c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return r.a(this.f16761a, pVar.f16761a) && r.a(this.f16762b, pVar.f16762b) && this.f16763c == pVar.f16763c;
    }

    public final int hashCode() {
        int iHashCode = this.f16761a.hashCode() * 31;
        String str = this.f16762b;
        return this.f16763c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f16761a + ", mimeType=" + this.f16762b + ", dataSource=" + this.f16763c + ')';
    }
}
