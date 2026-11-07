package k1;

import i2.e0;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes.dex */
public final class d extends s implements eh.r<Integer, Integer, Integer, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f15920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f15921b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, e0 e0Var) {
        super(4);
        this.f15920a = eVar;
        this.f15921b = e0Var;
    }

    @Override // eh.r
    public final f0 f(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        e eVar = this.f15920a;
        eVar.f15927f.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        p pVar = eVar.f15922a;
        pVar.f15938a.requestAutofill(eVar.f15924c, this.f15921b.f13810b, eVar.f15927f);
        return f0.f21461a;
    }
}
