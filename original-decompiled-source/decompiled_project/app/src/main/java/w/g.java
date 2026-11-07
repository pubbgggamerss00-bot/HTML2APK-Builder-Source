package w;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {175}, m = "tryApproach")
/* loaded from: classes.dex */
public final class g extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f31004b;

    /* renamed from: c, reason: collision with root package name */
    public int f31005c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, vg.c cVar) {
        super(cVar);
        this.f31004b = hVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f31003a = obj;
        this.f31005c |= PKIFailureInfo.systemUnavail;
        return h.c(this.f31004b, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, this);
    }
}
