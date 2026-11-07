package o1;

import androidx.compose.ui.focus.FocusTargetNode;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.s implements eh.l<FocusTargetNode, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i10) {
        super(1);
        this.f18906a = i10;
    }

    @Override // eh.l
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.H(this.f18906a));
    }
}
