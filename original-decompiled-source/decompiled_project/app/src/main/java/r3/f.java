package r3;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f23162e = new f(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f23163a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23164b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23165c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23166d;

    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public f(int i10, int i11, int i12, int i13) {
        this.f23163a = i10;
        this.f23164b = i11;
        this.f23165c = i12;
        this.f23166d = i13;
    }

    public static f a(f fVar, f fVar2) {
        return b(Math.max(fVar.f23163a, fVar2.f23163a), Math.max(fVar.f23164b, fVar2.f23164b), Math.max(fVar.f23165c, fVar2.f23165c), Math.max(fVar.f23166d, fVar2.f23166d));
    }

    public static f b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f23162e : new f(i10, i11, i12, i13);
    }

    public static f c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return a.a(this.f23163a, this.f23164b, this.f23165c, this.f23166d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f23166d == fVar.f23166d && this.f23163a == fVar.f23163a && this.f23165c == fVar.f23165c && this.f23164b == fVar.f23164b;
    }

    public final int hashCode() {
        return (((((this.f23163a * 31) + this.f23164b) * 31) + this.f23165c) * 31) + this.f23166d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f23163a);
        sb.append(", top=");
        sb.append(this.f23164b);
        sb.append(", right=");
        sb.append(this.f23165c);
        sb.append(", bottom=");
        return b.b.a(sb, this.f23166d, '}');
    }
}
