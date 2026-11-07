package v;

import org.bouncycastle.asn1.cmc.BodyPartID;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {518}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.j f29923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f29924c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f29925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(androidx.compose.foundation.gestures.j jVar, float f10, float f11, tg.e<? super i1> eVar) {
        super(2, eVar);
        this.f29923b = jVar;
        this.f29924c = f10;
        this.f29925d = f11;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new i1(this.f29923b, this.f29924c, this.f29925d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((i1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29922a;
        if (i10 == 0) {
            pg.q.b(obj);
            s1 s1Var = this.f29923b.G;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(this.f29924c) << 32) | (Float.floatToRawIntBits(this.f29925d) & BodyPartID.bodyIdMax);
            this.f29922a = 1;
            if (androidx.compose.foundation.gestures.i.a(s1Var, jFloatToRawIntBits, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
