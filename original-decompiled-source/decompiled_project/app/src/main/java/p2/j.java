package p2;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {296}, m = "scrollBy")
/* loaded from: classes.dex */
public final class j extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public k f21173a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f21175c;

    /* renamed from: d, reason: collision with root package name */
    public int f21176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, vg.c cVar) {
        super(cVar);
        this.f21175c = kVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f21174b = obj;
        this.f21176d |= PKIFailureInfo.systemUnavail;
        return this.f21175c.a(CropImageView.DEFAULT_ASPECT_RATIO, this);
    }
}
