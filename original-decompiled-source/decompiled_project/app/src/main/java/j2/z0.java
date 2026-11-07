package j2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {EACTags.MESSAGE_REFERENCE}, m = "startInputMethod")
/* loaded from: classes.dex */
public final class z0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1 f15007b;

    /* renamed from: c, reason: collision with root package name */
    public int f15008c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(d1 d1Var, vg.c cVar) {
        super(cVar);
        this.f15007b = d1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f15006a = obj;
        this.f15008c |= PKIFailureInfo.systemUnavail;
        this.f15007b.b(null, this);
        return ug.a.f29706a;
    }
}
