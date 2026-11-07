package v;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {57}, m = "scrollBy")
/* loaded from: classes.dex */
public final class y0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.d0 f30122a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30123b;

    /* renamed from: c, reason: collision with root package name */
    public int f30124c;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30123b = obj;
        this.f30124c |= PKIFailureInfo.systemUnavail;
        return qg.n0.f(null, CropImageView.DEFAULT_ASPECT_RATIO, this);
    }
}
