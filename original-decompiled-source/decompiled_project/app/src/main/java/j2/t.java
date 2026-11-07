package j2;

import androidx.compose.ui.platform.AndroidComposeView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {739}, m = "textInputSession")
/* loaded from: classes.dex */
public final class t extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f14897b;

    /* renamed from: c, reason: collision with root package name */
    public int f14898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AndroidComposeView androidComposeView, vg.c cVar) {
        super(cVar);
        this.f14897b = androidComposeView;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f14896a = obj;
        this.f14898c |= PKIFailureInfo.systemUnavail;
        this.f14897b.j(null, this);
        return ug.a.f29706a;
    }
}
