package s;

/* loaded from: classes.dex */
public final class l1<T> implements e0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final float f23829a;

    /* renamed from: b, reason: collision with root package name */
    public final float f23830b;

    /* renamed from: c, reason: collision with root package name */
    public final T f23831c;

    public l1() {
        this(null, 7);
    }

    @Override // s.l
    public final q2 a(n2 n2Var) {
        T t3 = this.f23831c;
        return new b3(this.f23829a, this.f23830b, t3 == null ? null : (s) n2Var.a().invoke(t3));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            if (l1Var.f23829a == this.f23829a && l1Var.f23830b == this.f23830b && kotlin.jvm.internal.r.a(l1Var.f23831c, this.f23831c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        T t3 = this.f23831c;
        return Float.hashCode(this.f23830b) + r.z1.a(this.f23829a, (t3 != null ? t3.hashCode() : 0) * 31, 31);
    }

    public l1(float f10, float f11, T t3) {
        this.f23829a = f10;
        this.f23830b = f11;
        this.f23831c = t3;
    }

    public /* synthetic */ l1(Object obj, int i10) {
        this(1.0f, 1500.0f, (i10 & 4) != 0 ? null : obj);
    }
}
