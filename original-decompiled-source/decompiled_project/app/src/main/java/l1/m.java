package l1;

import kotlin.jvm.internal.r;
import r.e2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f16676a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16677b;

    /* renamed from: c, reason: collision with root package name */
    public final n f16678c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.e f16679d;

    public m(int i10, long j10, n nVar, m2.e eVar) {
        this.f16676a = i10;
        this.f16677b = j10;
        this.f16678c = nVar;
        this.f16679d = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f16676a == mVar.f16676a && this.f16677b == mVar.f16677b && this.f16678c == mVar.f16678c && r.a(this.f16679d, mVar.f16679d);
    }

    public final int hashCode() {
        int iHashCode = (this.f16678c.hashCode() + e2.a(Integer.hashCode(this.f16676a) * 31, 31, this.f16677b)) * 31;
        m2.e eVar = this.f16679d;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f16676a + ", timestamp=" + this.f16677b + ", type=" + this.f16678c + ", structureCompat=" + this.f16679d + ')';
    }
}
