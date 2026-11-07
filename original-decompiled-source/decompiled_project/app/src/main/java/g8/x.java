package g8;

import androidx.datastore.preferences.protobuf.a1;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Map;
import p.g0;
import qg.k0;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f11647a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11648b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, Integer> f11649c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11650d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11651e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f11652f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11653g;

    public x() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f11647a == xVar.f11647a && this.f11648b == xVar.f11648b && kotlin.jvm.internal.r.a(this.f11649c, xVar.f11649c) && this.f11650d == xVar.f11650d && this.f11651e == xVar.f11651e && kotlin.jvm.internal.r.a(this.f11652f, xVar.f11652f) && this.f11653g == xVar.f11653g;
    }

    public final int hashCode() {
        int iA = a1.a(this.f11651e, a1.a(this.f11650d, (this.f11649c.hashCode() + a1.a(this.f11648b, Integer.hashCode(this.f11647a) * 31, 31)) * 31, 31), 31);
        Long l10 = this.f11652f;
        return Boolean.hashCode(this.f11653g) + ((iA + (l10 == null ? 0 : l10.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = g0.a(this.f11647a, this.f11648b, "AiPublicConfig(newAppEstimate=", ", editEstimate=", ", packs=");
        sbA.append(this.f11649c);
        sbA.append(", proMonthlyCredits=");
        sbA.append(this.f11650d);
        sbA.append(", proLifetimeCredits=");
        sbA.append(this.f11651e);
        sbA.append(", bonusCutoffMillis=");
        sbA.append(this.f11652f);
        sbA.append(", killSwitch=");
        sbA.append(this.f11653g);
        sbA.append(")");
        return sbA.toString();
    }

    public x(int i10, int i11, Map<String, Integer> map, int i12, int i13, Long l10, boolean z10) {
        this.f11647a = i10;
        this.f11648b = i11;
        this.f11649c = map;
        this.f11650d = i12;
        this.f11651e = i13;
        this.f11652f = l10;
        this.f11653g = z10;
    }

    public x(int i10) {
        this(10, 5, k0.d(new pg.n("credits_500", Integer.valueOf(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION)), new pg.n("credits_1500", 1500), new pg.n("credits_4000", 4000)), 60, 240, null, false);
    }
}
