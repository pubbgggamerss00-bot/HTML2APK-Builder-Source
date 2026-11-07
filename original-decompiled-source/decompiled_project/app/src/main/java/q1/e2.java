package q1;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: d, reason: collision with root package name */
    public static final e2 f21687d = new e2();

    /* renamed from: a, reason: collision with root package name */
    public final long f21688a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21689b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21690c;

    public e2(long j10, long j11, float f10) {
        this.f21688a = j10;
        this.f21689b = j11;
        this.f21690c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return b1.d(this.f21688a, e2Var.f21688a) && p1.c.b(this.f21689b, e2Var.f21689b) && this.f21690c == e2Var.f21690c;
    }

    public final int hashCode() {
        int i10 = b1.f21655i;
        return Float.hashCode(this.f21690c) + r.e2.a(Long.hashCode(this.f21688a) * 31, 31, this.f21689b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        ad.f.c(this.f21688a, ", offset=", sb);
        sb.append((Object) p1.c.i(this.f21689b));
        sb.append(", blurRadius=");
        return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f21690c, ')');
    }

    public /* synthetic */ e2() {
        this(c2.n0.c(4278190080L), 0L, CropImageView.DEFAULT_ASPECT_RATIO);
    }
}
