package s;

@vg.e(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i0 extends vg.i implements eh.l<tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f23772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f23773b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(eh.l<? super Long, Object> lVar, tg.e<? super i0> eVar) {
        super(1, eVar);
        this.f23773b = (kotlin.jvm.internal.s) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new i0(this.f23773b, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<Object> eVar) {
        return ((i0) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f23772a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        this.f23772a = 1;
        Object objF0 = x0.f1.a(getContext()).f0(this.f23773b, this);
        return objF0 == aVar ? aVar : objF0;
    }
}
