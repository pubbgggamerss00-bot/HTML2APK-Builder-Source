package v;

/* loaded from: classes.dex */
public final class j1 extends kotlin.jvm.internal.s implements eh.p<Float, Float, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.j f29953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(androidx.compose.foundation.gestures.j jVar) {
        super(2);
        this.f29953a = jVar;
    }

    @Override // eh.p
    public final Boolean invoke(Float f10, Float f11) {
        float fFloatValue = f10.floatValue();
        float fFloatValue2 = f11.floatValue();
        androidx.compose.foundation.gestures.j jVar = this.f29953a;
        ph.h.c(jVar.H1(), null, null, new i1(jVar, fFloatValue, fFloatValue2, null), 3);
        return Boolean.TRUE;
    }
}
