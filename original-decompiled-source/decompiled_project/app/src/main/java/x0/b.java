package x0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f31620a;

    public b(int i10) {
        this.f31620a = i10;
    }

    public final boolean a() {
        return this.f31620a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return a.a(sb, this.f31620a, " }");
    }
}
