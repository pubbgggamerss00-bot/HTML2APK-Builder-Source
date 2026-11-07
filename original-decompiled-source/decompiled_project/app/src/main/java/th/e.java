package th;

import pg.f0;
import ph.i0;

@vg.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28783a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sh.g<Object> f28785c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g<Object> f28786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sh.g<Object> gVar, g<Object> gVar2, tg.e<? super e> eVar) {
        super(2, eVar);
        this.f28785c = gVar;
        this.f28786d = gVar2;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        e eVar2 = new e(this.f28785c, this.f28786d, eVar);
        eVar2.f28784b = obj;
        return eVar2;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((e) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f28783a;
        if (i10 == 0) {
            pg.q.b(obj);
            rh.w<Object> wVarH = this.f28786d.h((i0) this.f28784b);
            this.f28783a = 1;
            Object objA = sh.i.a(this.f28785c, wVarH, true, this);
            if (objA != obj2) {
                objA = f0.f21461a;
            }
            if (objA == obj2) {
                return obj2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return f0.f21461a;
    }
}
