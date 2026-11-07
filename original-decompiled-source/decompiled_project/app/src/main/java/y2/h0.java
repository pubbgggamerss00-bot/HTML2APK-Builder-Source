package y2;

import android.view.inputmethod.BaseInputConnection;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.s implements eh.a<BaseInputConnection> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f33732a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g0 g0Var) {
        super(0);
        this.f33732a = g0Var;
    }

    @Override // eh.a
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.f33732a.f33709a, false);
    }
}
