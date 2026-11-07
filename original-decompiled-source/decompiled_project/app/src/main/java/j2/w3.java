package j2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {184, 186}, m = "interceptedTextInputSession")
/* loaded from: classes.dex */
public final class w3 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14960a;

    /* renamed from: b, reason: collision with root package name */
    public int f14961b;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f14960a = obj;
        this.f14961b |= PKIFailureInfo.systemUnavail;
        u3.b(null, null, null, this);
        return ug.a.f29706a;
    }
}
