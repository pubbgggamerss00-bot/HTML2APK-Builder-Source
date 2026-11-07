package j2;

import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {EACTags.ADDRESS}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z2 extends vg.i implements eh.l<tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f15012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<Long, Object> f15013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z2(eh.l<? super Long, Object> lVar, tg.e<? super z2> eVar) {
        super(1, eVar);
        this.f15013b = lVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(tg.e<?> eVar) {
        return new z2(this.f15013b, eVar);
    }

    @Override // eh.l
    public final Object invoke(tg.e<Object> eVar) {
        return ((z2) create(eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f15012a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        this.f15012a = 1;
        Object objF0 = x0.f1.a(getContext()).f0(this.f15013b, this);
        return objF0 == aVar ? aVar : objF0;
    }
}
