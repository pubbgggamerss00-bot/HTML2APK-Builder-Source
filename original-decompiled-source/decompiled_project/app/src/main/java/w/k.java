package w;

import com.yalantis.ucrop.view.CropImageView;
import kotlin.jvm.internal.d0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {354}, m = "animateWithTarget")
/* loaded from: classes.dex */
public final class k extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public float f31019a;

    /* renamed from: b, reason: collision with root package name */
    public float f31020b;

    /* renamed from: c, reason: collision with root package name */
    public s.n f31021c;

    /* renamed from: d, reason: collision with root package name */
    public d0 f31022d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f31023e;

    /* renamed from: f, reason: collision with root package name */
    public int f31024f;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f31023e = obj;
        this.f31024f |= PKIFailureInfo.systemUnavail;
        return m.c(null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, this);
    }
}
