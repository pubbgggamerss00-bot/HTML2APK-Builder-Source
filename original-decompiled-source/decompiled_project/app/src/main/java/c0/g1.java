package c0;

import com.yalantis.ucrop.view.CropImageView;
import d0.m1;
import d0.p1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class g1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f4391a;

    public g1(w0 w0Var) {
        this.f4391a = w0Var;
    }

    @Override // d0.m1
    public final int a() {
        w0 w0Var = this.f4391a;
        return (int) (w0Var.i().getOrientation() == v.t0.f30083a ? w0Var.i().b() & BodyPartID.bodyIdMax : w0Var.i().b() >> 32);
    }

    @Override // d0.m1
    public final float b() {
        int iG = this.f4391a.g();
        return (iG * CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION) + r0.h();
    }

    @Override // d0.m1
    public final int c() {
        w0 w0Var = this.f4391a;
        return w0Var.i().c() + w0Var.i().d();
    }

    @Override // d0.m1
    public final Object d(int i10, p1 p1Var) {
        Object objJ = w0.j(this.f4391a, i10, p1Var);
        return objJ == ug.a.f29706a ? objJ : pg.f0.f21461a;
    }

    @Override // d0.m1
    public final float e() {
        w0 w0Var = this.f4391a;
        int iG = w0Var.g();
        int iH = w0Var.h();
        return w0Var.d() ? (iG * CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION) + iH + 100 : (iG * CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION) + iH;
    }

    @Override // d0.m1
    public final q2.b f() {
        return new q2.b(-1, -1);
    }
}
