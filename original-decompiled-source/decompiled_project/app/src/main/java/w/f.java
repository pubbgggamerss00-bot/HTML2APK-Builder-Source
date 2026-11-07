package w;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {101}, m = "performFling")
/* loaded from: classes.dex */
public final class f extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f31001b;

    /* renamed from: c, reason: collision with root package name */
    public int f31002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, vg.c cVar) {
        super(cVar);
        this.f31001b = hVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f31000a = obj;
        this.f31002c |= PKIFailureInfo.systemUnavail;
        return this.f31001b.b(null, CropImageView.DEFAULT_ASPECT_RATIO, null, this);
    }
}
