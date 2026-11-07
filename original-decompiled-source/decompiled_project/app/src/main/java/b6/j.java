package b6;

/* loaded from: classes.dex */
public final class j implements Comparable<j> {

    /* renamed from: a, reason: collision with root package name */
    public final int f3629a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3630b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3631c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3632d;

    public j(int i10, int i11, String from, String to) {
        kotlin.jvm.internal.r.e(from, "from");
        kotlin.jvm.internal.r.e(to, "to");
        this.f3629a = i10;
        this.f3630b = i11;
        this.f3631c = from;
        this.f3632d = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(j jVar) {
        j other = jVar;
        kotlin.jvm.internal.r.e(other, "other");
        int i10 = this.f3629a - other.f3629a;
        return i10 == 0 ? this.f3630b - other.f3630b : i10;
    }
}
