package o1;

import androidx.compose.ui.focus.FocusTargetNode;
import g2.g;
import o1.u;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.s implements eh.l<g.a, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f18878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f18879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f18880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u.a f18882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(f1.m mVar, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, FocusTargetNode focusTargetNode3, int i10, u.a aVar) {
        super(1);
        this.f18878a = focusTargetNode;
        this.f18879b = focusTargetNode2;
        this.f18880c = focusTargetNode3;
        this.f18881d = i10;
        this.f18882e = aVar;
    }

    @Override // eh.l
    public final Boolean invoke(g.a aVar) {
        g.a aVar2 = aVar;
        FocusTargetNode focusTargetNode = this.f18879b;
        if (this.f18878a != i2.k.g(focusTargetNode).getFocusOwner().r()) {
            return Boolean.TRUE;
        }
        boolean zH = f3.f.h(focusTargetNode, this.f18880c, this.f18881d, this.f18882e);
        Boolean boolValueOf = Boolean.valueOf(zH);
        if (zH || !aVar2.a()) {
            return boolValueOf;
        }
        return null;
    }
}
