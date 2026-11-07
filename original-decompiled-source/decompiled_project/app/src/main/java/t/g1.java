package t;

import com.yalantis.ucrop.view.CropImageView;

@pg.d
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f25241a;

    /* renamed from: b, reason: collision with root package name */
    public final z.g1 f25242b;

    public g1() {
        long jC = c2.n0.c(4284900966L);
        z.g1 g1VarC = androidx.compose.foundation.layout.f.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 3);
        this.f25241a = jC;
        this.f25242b = g1VarC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        g1 g1Var = (g1) obj;
        return q1.b1.d(this.f25241a, g1Var.f25241a) && kotlin.jvm.internal.r.a(this.f25242b, g1Var.f25242b);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return this.f25242b.hashCode() + (Long.hashCode(this.f25241a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        ad.f.c(this.f25241a, ", drawPadding=", sb);
        sb.append(this.f25242b);
        sb.append(')');
        return sb.toString();
    }
}
