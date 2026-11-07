package v;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", l = {244, 295}, m = "dispatchMouseWheelScroll")
/* loaded from: classes.dex */
public final class i0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public f0 f29915a;

    /* renamed from: b, reason: collision with root package name */
    public s1 f29916b;

    /* renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.d0 f29917c;

    /* renamed from: d, reason: collision with root package name */
    public float f29918d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f29920f;

    /* renamed from: g, reason: collision with root package name */
    public int f29921g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f0 f0Var, vg.c cVar) {
        super(cVar);
        this.f29920f = f0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29919e = obj;
        this.f29921g |= PKIFailureInfo.systemUnavail;
        return f0.b(this.f29920f, null, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, this);
    }
}
