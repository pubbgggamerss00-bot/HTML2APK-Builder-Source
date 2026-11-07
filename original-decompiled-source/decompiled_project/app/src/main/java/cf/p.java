package cf;

/* loaded from: classes2.dex */
public final class p implements Comparable<p> {

    /* renamed from: a, reason: collision with root package name */
    public final long f5553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5554b;

    public p(int i10, long j10) {
        this.f5553a = j10;
        this.f5554b = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(p pVar) {
        p pVar2 = pVar;
        long j10 = this.f5553a;
        long j11 = pVar2.f5553a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        int i10 = pVar2.f5554b;
        int i11 = this.f5554b;
        if (i11 < i10) {
            return -1;
        }
        return i11 > i10 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        p pVar = obj instanceof p ? (p) obj : null;
        return pVar != null && pVar.f5553a == this.f5553a && pVar.f5554b == this.f5554b;
    }

    public final int hashCode() {
        return Long.valueOf((this.f5553a << 4) + this.f5554b).hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5553a);
        sb.append(" ");
        return x0.a.a(sb, this.f5554b, " R");
    }
}
