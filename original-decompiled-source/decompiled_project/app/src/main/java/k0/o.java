package k0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.eac.EACTags;
import ph.l2;

@vg.e(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends vg.i implements eh.p<ph.i0, tg.e<? super Boolean>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f15876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f15877b;

    @vg.e(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID, 79, EACTags.ANSWER_TO_RESET}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15878a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ph.s1 f15879b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f15880c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ph.s1 s1Var, p pVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f15879b = s1Var;
            this.f15880c = pVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f15879b, this.f15880c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        
            if (ph.v1.c(r12, r11) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        
            if (ph.t0.b(500, r11) != r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:33:0x006e, B:27:0x0057, B:30:0x0060, B:14:0x0027, B:15:0x002b, B:16:0x0033, B:23:0x0048, B:25:0x0051), top: B:37:0x000f }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006b -> B:33:0x006e). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f15878a;
            p pVar = this.f15880c;
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    ph.s1 s1Var = this.f15879b;
                    if (s1Var != null) {
                        this.f15878a = 1;
                    }
                } else if (i10 == 1) {
                    pg.q.b(obj);
                } else {
                    if (i10 == 2) {
                        pg.q.b(obj);
                        throw new pg.g();
                    }
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pg.q.b(obj);
                        pVar.f15885c.e(1.0f);
                        this.f15878a = 3;
                        if (ph.t0.b(500L, this) == aVar) {
                            pVar.f15885c.e(CropImageView.DEFAULT_ASPECT_RATIO);
                            this.f15878a = 4;
                        }
                        return aVar;
                    }
                    pg.q.b(obj);
                    pVar.f15885c.e(CropImageView.DEFAULT_ASPECT_RATIO);
                    this.f15878a = 4;
                }
                pVar.f15885c.e(1.0f);
                if (!pVar.f15883a) {
                    this.f15878a = 2;
                    ph.t0.a(this);
                    return aVar;
                }
                this.f15878a = 3;
                if (ph.t0.b(500L, this) == aVar) {
                }
                return aVar;
            } catch (Throwable th2) {
                pVar.f15885c.e(CropImageView.DEFAULT_ASPECT_RATIO);
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, tg.e<? super o> eVar) {
        super(2, eVar);
        this.f15877b = pVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        o oVar = new o(this.f15877b, eVar);
        oVar.f15876a = obj;
        return oVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Boolean> eVar) {
        return ((o) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        ph.i0 i0Var = (ph.i0) this.f15876a;
        p pVar = this.f15877b;
        ph.s1 andSet = pVar.f15884b.getAndSet(null);
        AtomicReference<ph.s1> atomicReference = pVar.f15884b;
        l2 l2VarC = ph.h.c(i0Var, null, null, new a(andSet, pVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, l2VarC)) {
                z10 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z10 = false;
                break;
            }
        }
        return Boolean.valueOf(z10);
    }
}
