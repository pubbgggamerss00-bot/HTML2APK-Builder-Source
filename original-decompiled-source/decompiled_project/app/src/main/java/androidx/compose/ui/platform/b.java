package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import eh.l;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b extends s implements l<FocusTargetNode, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.e f1300a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o1.e eVar) {
        super(1);
        this.f1300a = eVar;
    }

    @Override // eh.l
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.H(this.f1300a.f18860a));
    }
}
