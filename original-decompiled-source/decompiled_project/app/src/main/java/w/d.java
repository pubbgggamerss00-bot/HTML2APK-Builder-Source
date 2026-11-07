package w;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {115}, m = "fling")
/* loaded from: classes.dex */
public final class d extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public eh.l f30986a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f30988c;

    /* renamed from: d, reason: collision with root package name */
    public int f30989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, vg.c cVar) {
        super(cVar);
        this.f30988c = hVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f30987b = obj;
        this.f30989d |= PKIFailureInfo.systemUnavail;
        return this.f30988c.d(null, CropImageView.DEFAULT_ASPECT_RATIO, null, this);
    }
}
