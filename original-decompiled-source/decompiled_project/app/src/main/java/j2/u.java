package j2;

import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.s implements eh.l<ph.i0, d1> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f14908a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(AndroidComposeView androidComposeView) {
        super(1);
        this.f14908a = androidComposeView;
    }

    @Override // eh.l
    public final d1 invoke(ph.i0 i0Var) {
        AndroidComposeView androidComposeView = this.f14908a;
        return new d1(androidComposeView, androidComposeView.getTextInputService(), i0Var);
    }
}
