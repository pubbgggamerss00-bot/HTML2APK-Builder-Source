package c7;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f5006a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5007b;

    public j(String workSpecId, int i10) {
        kotlin.jvm.internal.r.e(workSpecId, "workSpecId");
        this.f5006a = workSpecId;
        this.f5007b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.r.a(this.f5006a, jVar.f5006a) && this.f5007b == jVar.f5007b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5007b) + (this.f5006a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f5006a);
        sb.append(", generation=");
        return b.b.a(sb, this.f5007b, ')');
    }
}
