package k1;

import android.graphics.Rect;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes.dex */
public final class c extends s implements eh.r<Integer, Integer, Integer, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f15918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i10) {
        super(4);
        this.f15918a = eVar;
        this.f15919b = i10;
    }

    @Override // eh.r
    public final f0 f(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        e eVar = this.f15918a;
        p pVar = eVar.f15922a;
        pVar.f15938a.notifyViewEntered(eVar.f15924c, this.f15919b, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return f0.f21461a;
    }
}
