package pg;

/* loaded from: classes2.dex */
public final class i implements Comparable<i> {

    /* renamed from: b, reason: collision with root package name */
    public static final i f21464b = new i();

    /* renamed from: a, reason: collision with root package name */
    public final int f21465a = 131348;

    @Override // java.lang.Comparable
    public final int compareTo(i iVar) {
        i other = iVar;
        kotlin.jvm.internal.r.e(other, "other");
        return this.f21465a - other.f21465a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i iVar = obj instanceof i ? (i) obj : null;
        return iVar != null && this.f21465a == iVar.f21465a;
    }

    public final int hashCode() {
        return this.f21465a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
