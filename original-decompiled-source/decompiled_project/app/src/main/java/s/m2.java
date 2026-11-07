package s;

/* loaded from: classes.dex */
public final class m2<T> implements a0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f23839a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23840b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f23841c;

    public m2(int i10, b0 b0Var, int i11) {
        this((i11 & 1) != 0 ? 300 : i10, 0, (i11 & 4) != 0 ? d0.f23703a : b0Var);
    }

    @Override // s.l
    public final q2 a(n2 n2Var) {
        return new c3(this.f23839a, this.f23840b, this.f23841c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            if (m2Var.f23839a == this.f23839a && m2Var.f23840b == this.f23840b && kotlin.jvm.internal.r.a(m2Var.f23841c, this.f23841c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23841c.hashCode() + (this.f23839a * 31)) * 31) + this.f23840b;
    }

    @Override // s.a0, s.l
    public final t2 a(n2 n2Var) {
        return new c3(this.f23839a, this.f23840b, this.f23841c);
    }

    public m2(int i10, int i11, b0 b0Var) {
        this.f23839a = i10;
        this.f23840b = i11;
        this.f23841c = b0Var;
    }
}
