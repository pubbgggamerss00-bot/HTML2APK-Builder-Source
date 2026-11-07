package j2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", f = "PlatformTextInputModifierNode.kt", l = {136}, m = "establishTextInputSession")
/* loaded from: classes.dex */
public final class v3 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14930a;

    /* renamed from: b, reason: collision with root package name */
    public int f14931b;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f14930a = obj;
        this.f14931b |= PKIFailureInfo.systemUnavail;
        u3.a(null, null, this);
        return ug.a.f29706a;
    }
}
