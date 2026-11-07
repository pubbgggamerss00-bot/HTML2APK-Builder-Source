package j2;

import j2.c2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {230}, m = "startInputMethod")
/* loaded from: classes.dex */
public final class z1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2.a f15010b;

    /* renamed from: c, reason: collision with root package name */
    public int f15011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(c2.a aVar, vg.c cVar) {
        super(cVar);
        this.f15010b = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f15009a = obj;
        this.f15011c |= PKIFailureInfo.systemUnavail;
        this.f15010b.b(null, this);
        return ug.a.f29706a;
    }
}
