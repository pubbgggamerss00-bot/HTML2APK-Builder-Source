package t;

import i2.o2;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.s implements eh.l<o2, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b0 f25408a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kotlin.jvm.internal.b0 b0Var) {
        super(1);
        this.f25408a = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // eh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(o2 o2Var) {
        boolean z10;
        o2 o2Var2 = o2Var;
        kotlin.jvm.internal.b0 b0Var = this.f25408a;
        if (!b0Var.f16318a) {
            kotlin.jvm.internal.r.c(o2Var2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
            z10 = ((v.c1) o2Var2).f29794r;
        }
        b0Var.f16318a = z10;
        return Boolean.valueOf(!z10);
    }
}
