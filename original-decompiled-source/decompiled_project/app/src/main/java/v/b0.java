package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;

@vg.e(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {HeaderItem.FIELD_START_OFFSET}, m = "awaitAllPointersUp")
/* loaded from: classes.dex */
public final class b0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f29780a;

    /* renamed from: b, reason: collision with root package name */
    public c2.t f29781b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f29782c;

    /* renamed from: d, reason: collision with root package name */
    public int f29783d;

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29782c = obj;
        this.f29783d |= PKIFailureInfo.systemUnavail;
        return c0.b(null, null, this);
    }
}
