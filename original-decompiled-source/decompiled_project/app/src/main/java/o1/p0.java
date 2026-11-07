package o1;

import androidx.compose.ui.focus.FocusTargetNode;
import g2.g;
import o1.u;

/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.s implements eh.l<g.a, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f18884a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f18885b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1.e f18886c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u.a f18888e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(f1.m mVar, FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, p1.e eVar, int i10, u.a aVar) {
        super(1);
        this.f18884a = focusTargetNode;
        this.f18885b = focusTargetNode2;
        this.f18886c = eVar;
        this.f18887d = i10;
        this.f18888e = aVar;
    }

    @Override // eh.l
    public final Boolean invoke(g.a aVar) {
        g.a aVar2 = aVar;
        FocusTargetNode focusTargetNode = this.f18885b;
        if (this.f18884a != i2.k.g(focusTargetNode).getFocusOwner().r()) {
            return Boolean.TRUE;
        }
        boolean zL = f3.i.l(this.f18887d, focusTargetNode, this.f18888e, this.f18886c);
        Boolean boolValueOf = Boolean.valueOf(zL);
        if (zL || !aVar2.a()) {
            return boolValueOf;
        }
        return null;
    }
}
