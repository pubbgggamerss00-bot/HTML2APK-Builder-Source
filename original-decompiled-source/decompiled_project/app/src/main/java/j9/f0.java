package j9;

import j9.x1;
import s8.e2;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.TemplatesScreenKt$TemplateDetailScreen$2$1", f = "TemplatesScreen.kt", l = {304}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f15392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f15393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f15394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p5.x f15395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.t f15396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1.a f15397f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(x0.n1 n1Var, x1 x1Var, p5.x xVar, androidx.lifecycle.t tVar, x1.a aVar, tg.e eVar) {
        super(2, eVar);
        this.f15393b = n1Var;
        this.f15394c = x1Var;
        this.f15395d = xVar;
        this.f15396e = tVar;
        this.f15397f = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new f0(this.f15393b, this.f15394c, this.f15395d, this.f15396e, this.f15397f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((f0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f15392a;
        if (i10 == 0) {
            pg.q.b(obj);
            Long l10 = (Long) this.f15393b.getValue();
            if (l10 != null) {
                long jLongValue = l10.longValue();
                this.f15394c.f15623f.setValue(null);
                e2.v vVar = e2.v.f24652c;
                x1.a aVar2 = this.f15397f;
                String strA = e2.v.a(vVar, jLongValue, (aVar2 != null ? aVar2.f15641f : null) == null, null, 4);
                this.f15392a = 1;
                if (s8.b2.b(this.f15395d, this.f15396e, strA, new s8.b(), this) == aVar) {
                    return aVar;
                }
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
