package sd;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final y<?> f24871a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24872b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24873c;

    public l(int i10, int i11, Class cls) {
        this((y<?>) y.a(cls), i10, i11);
    }

    public static l a(Class<?> cls) {
        return new l(0, 1, cls);
    }

    public static l b(Class<?> cls) {
        return new l(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f24871a.equals(lVar.f24871a) && this.f24872b == lVar.f24872b && this.f24873c == lVar.f24873c;
    }

    public final int hashCode() {
        return ((((this.f24871a.hashCode() ^ 1000003) * 1000003) ^ this.f24872b) * 1000003) ^ this.f24873c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f24871a);
        sb.append(", type=");
        int i10 = this.f24872b;
        sb.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i11 = this.f24873c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(j2.y.a(i11, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return b.o.a(sb, str, "}");
    }

    public l(y<?> yVar, int i10, int i11) {
        this.f24871a = yVar;
        this.f24872b = i10;
        this.f24873c = i11;
    }
}
