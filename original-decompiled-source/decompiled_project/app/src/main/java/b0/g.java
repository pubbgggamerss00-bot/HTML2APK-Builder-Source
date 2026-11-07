package b0;

import com.yalantis.ucrop.view.CropImageView;
import d0.m1;
import d0.p1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import t.b1;

/* loaded from: classes.dex */
public final class g implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f3336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3337b;

    public g(m0 m0Var, boolean z10) {
        this.f3336a = m0Var;
        this.f3337b = z10;
    }

    @Override // d0.m1
    public final int a() {
        m0 m0Var = this.f3336a;
        return (int) (m0Var.i().getOrientation() == v.t0.f30083a ? m0Var.i().b() & BodyPartID.bodyIdMax : m0Var.i().b() >> 32);
    }

    @Override // d0.m1
    public final float b() {
        int iG = this.f3336a.g();
        return (iG * CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION) + r0.h();
    }

    @Override // d0.m1
    public final int c() {
        m0 m0Var = this.f3336a;
        return m0Var.i().c() + m0Var.i().d();
    }

    @Override // d0.m1
    public final Object d(int i10, p1 p1Var) {
        g1.n nVar = m0.f3381w;
        m0 m0Var = this.f3336a;
        m0Var.getClass();
        Object objC = m0Var.c(b1.f25167a, new s0(m0Var, i10, 0, null), p1Var);
        ug.a aVar = ug.a.f29706a;
        if (objC != aVar) {
            objC = pg.f0.f21461a;
        }
        return objC == aVar ? objC : pg.f0.f21461a;
    }

    @Override // d0.m1
    public final float e() {
        m0 m0Var = this.f3336a;
        int iG = m0Var.g();
        int iH = m0Var.h();
        return m0Var.d() ? (iG * CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION) + iH + 100 : (iG * CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION) + iH;
    }

    @Override // d0.m1
    public final q2.b f() {
        return this.f3337b ? new q2.b(-1, 1) : new q2.b(1, -1);
    }
}
