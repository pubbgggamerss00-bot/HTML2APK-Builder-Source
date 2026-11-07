package pg;

/* loaded from: classes2.dex */
public final class v implements Comparable<v> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f21482b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final byte f21483a;

    public static final class a {
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(v vVar) {
        return kotlin.jvm.internal.r.f(this.f21483a & 255, vVar.f21483a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f21483a == ((v) obj).f21483a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f21483a);
    }

    public final String toString() {
        return String.valueOf(this.f21483a & 255);
    }
}
