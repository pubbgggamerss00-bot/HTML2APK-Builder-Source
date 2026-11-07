package k0;

import android.view.inputmethod.BaseInputConnection;

/* loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15882b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(Object obj, int i10) {
        super(0);
        this.f15881a = i10;
        this.f15882b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f15881a) {
            case 0:
                return new BaseInputConnection(((p1) this.f15882b).f15886a, false);
            default:
                return Boolean.valueOf((((m0.w) this.f15882b).a() & 9223372034707292159L) != 9205357640488583168L);
        }
    }
}
