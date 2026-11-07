package w;

import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.d0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {313}, m = "animateDecay")
/* loaded from: classes.dex */
public final class i extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public float f31010a;

    /* renamed from: b, reason: collision with root package name */
    public s.n f31011b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f31012c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f31013d;

    /* renamed from: e, reason: collision with root package name */
    public int f31014e;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f31013d = obj;
        this.f31014e |= PKIFailureInfo.systemUnavail;
        return m.a(null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, this);
    }
}
