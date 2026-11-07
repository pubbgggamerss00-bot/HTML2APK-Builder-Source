package c2;

import c2.y0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {861}, m = "withTimeoutOrNull")
/* loaded from: classes.dex */
public final class x0<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0.a<Object> f4710b;

    /* renamed from: c, reason: collision with root package name */
    public int f4711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0.a aVar, vg.a aVar2) {
        super(aVar2);
        this.f4710b = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f4709a = obj;
        this.f4711c |= PKIFailureInfo.systemUnavail;
        return this.f4710b.Z(0L, null, this);
    }
}
