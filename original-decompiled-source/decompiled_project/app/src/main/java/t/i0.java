package t;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25253a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25254b;

    /* renamed from: c, reason: collision with root package name */
    public long f25255c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f25256d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f25257e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f25258f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f25259g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f25260h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f25261i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f25262j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f25263k;

    public i0(Context context, int i10) {
        this.f25253a = context;
        this.f25254b = i10;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? j.b(edgeEffect) : 0.0f) == CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final EdgeEffect a(v.t0 t0Var) {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f25253a;
        EdgeEffect edgeEffectA = i10 >= 31 ? j.a(context) : new n0(context);
        edgeEffectA.setColor(this.f25254b);
        if (!f3.p.b(this.f25255c, 0L)) {
            if (t0Var == v.t0.f30083a) {
                long j10 = this.f25255c;
                edgeEffectA.setSize((int) (j10 >> 32), (int) (j10 & BodyPartID.bodyIdMax));
                return edgeEffectA;
            }
            long j11 = this.f25255c;
            edgeEffectA.setSize((int) (j11 & BodyPartID.bodyIdMax), (int) (j11 >> 32));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f25257e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(v.t0.f30083a);
        this.f25257e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f25258f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(v.t0.f30084b);
        this.f25258f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f25259g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(v.t0.f30084b);
        this.f25259g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f25256d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(v.t0.f30083a);
        this.f25256d = edgeEffectA;
        return edgeEffectA;
    }
}
