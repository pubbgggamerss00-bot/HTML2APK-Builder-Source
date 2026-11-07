package e0;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", f = "LazyLayoutPager.kt", l = {386}, m = "performFling")
/* loaded from: classes.dex */
public final class h1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public i1 f8195a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f8197c;

    /* renamed from: d, reason: collision with root package name */
    public int f8198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, vg.c cVar) {
        super(cVar);
        this.f8197c = i1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f8196b = obj;
        this.f8198d |= PKIFailureInfo.systemUnavail;
        return this.f8197c.a(null, CropImageView.DEFAULT_ASPECT_RATIO, this);
    }
}
