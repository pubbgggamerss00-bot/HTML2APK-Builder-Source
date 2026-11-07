package c2;

import c2.y0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.l2;

@vg.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", l = {891}, m = "withTimeout")
/* loaded from: classes.dex */
public final class v0<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public l2 f4699a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0.a<Object> f4701c;

    /* renamed from: d, reason: collision with root package name */
    public int f4702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(y0.a aVar, vg.c cVar) {
        super(cVar);
        this.f4701c = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f4700b = obj;
        this.f4702d |= PKIFailureInfo.systemUnavail;
        return this.f4701c.y1(0L, null, this);
    }
}
