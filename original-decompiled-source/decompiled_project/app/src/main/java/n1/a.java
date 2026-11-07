package n1;

import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.s;
import pg.f0;
import q1.l1;
import q1.t0;
import q1.y1;

/* loaded from: classes.dex */
public final class a extends s implements eh.l<l1, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f18298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f18299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18300c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f18301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(float f10, float f11, int i10, boolean z10) {
        super(1);
        this.f18298a = f10;
        this.f18299b = f11;
        this.f18300c = i10;
        this.f18301d = z10;
    }

    @Override // eh.l
    public final f0 invoke(l1 l1Var) {
        l1 l1Var2 = l1Var;
        float fN0 = l1Var2.N0(this.f18298a);
        float fN02 = l1Var2.N0(this.f18299b);
        l1Var2.l((fN0 <= CropImageView.DEFAULT_ASPECT_RATIO || fN02 <= CropImageView.DEFAULT_ASPECT_RATIO) ? null : new t0(fN0, fN02, this.f18300c));
        l1Var2.p1(y1.f21750a);
        l1Var2.C(this.f18301d);
        return f0.f21461a;
    }
}
