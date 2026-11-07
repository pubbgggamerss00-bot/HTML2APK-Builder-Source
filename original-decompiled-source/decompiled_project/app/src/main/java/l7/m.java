package l7;

import kotlin.jvm.internal.r;
import r.o2;

/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: a, reason: collision with root package name */
    public final g7.l f16754a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16755b;

    /* renamed from: c, reason: collision with root package name */
    public final j7.f f16756c;

    public m(g7.l lVar, boolean z10, j7.f fVar) {
        this.f16754a = lVar;
        this.f16755b = z10;
        this.f16756c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return r.a(this.f16754a, mVar.f16754a) && this.f16755b == mVar.f16755b && this.f16756c == mVar.f16756c;
    }

    public final int hashCode() {
        return this.f16756c.hashCode() + o2.a(this.f16754a.hashCode() * 31, 31, this.f16755b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f16754a + ", isSampled=" + this.f16755b + ", dataSource=" + this.f16756c + ')';
    }
}
