package n8;

import v4.e;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository$rescheduleRatingTarget$2", f = "SettingsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y extends vg.i implements eh.p<v4.b, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i10, tg.e<? super y> eVar) {
        super(2, eVar);
        this.f18626b = i10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        y yVar = new y(this.f18626b, eVar);
        yVar.f18625a = obj;
        return yVar;
    }

    @Override // eh.p
    public final Object invoke(v4.b bVar, tg.e<? super pg.f0> eVar) {
        return ((y) create(bVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        v4.b bVar = (v4.b) this.f18625a;
        e.a<String> aVar2 = m1.f18520v;
        Integer num = (Integer) bVar.b(m1.G);
        int iIntValue = num != null ? num.intValue() : 5;
        Integer num2 = (Integer) bVar.b(m1.H);
        int iIntValue2 = num2 != null ? num2.intValue() : 10;
        int i10 = iIntValue >= 5 ? iIntValue : 5;
        int i11 = iIntValue2 >= 10 ? iIntValue2 : 10;
        do {
            i10 += i11;
            i11 *= 2;
        } while (i10 <= this.f18626b);
        e.a<String> aVar3 = m1.f18520v;
        bVar.e(m1.G, new Integer(i10));
        bVar.e(m1.H, new Integer(i11));
        return pg.f0.f21461a;
    }
}
