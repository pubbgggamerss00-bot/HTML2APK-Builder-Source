package e0;

import com.yalantis.ucrop.view.CropImageView;
import s.w1;

@vg.e(c = "androidx.compose.foundation.pager.PagerState$animateScrollToPage$3", f = "PagerState.kt", l = {619}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v0 extends vg.i implements eh.p<v.b1, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f8312a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f8314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f8316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s.l<Float> f8317f;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<v.b1, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d1 f8318a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d1 d1Var) {
            super(2);
            this.f8318a = d1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(v.b1 b1Var, Integer num) {
            int iIntValue = num.intValue();
            d1 d1Var = this.f8318a;
            d1Var.f8161s.f(d1Var.i(iIntValue));
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(d1 d1Var, int i10, float f10, s.l<Float> lVar, tg.e<? super v0> eVar) {
        super(2, eVar);
        this.f8314c = d1Var;
        this.f8315d = i10;
        this.f8316e = f10;
        this.f8317f = lVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        v0 v0Var = new v0(this.f8314c, this.f8315d, this.f8316e, this.f8317f, eVar);
        v0Var.f8313b = obj;
        return v0Var;
    }

    @Override // eh.p
    public final Object invoke(v.b1 b1Var, tg.e<? super pg.f0> eVar) {
        return ((v0) create(b1Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        Object obj2 = ug.a.f29706a;
        int i11 = this.f8312a;
        if (i11 == 0) {
            pg.q.b(obj);
            v.b1 b1Var = (v.b1) this.f8313b;
            d1 d1Var = this.f8314c;
            s0 s0Var = new s0(b1Var, d1Var);
            a aVar = new a(d1Var);
            this.f8312a = 1;
            float f10 = e1.f8172a;
            int i12 = this.f8315d;
            aVar.invoke(s0Var, new Integer(i12));
            boolean z10 = i12 > d1Var.f8147e;
            int iA = (s0Var.a() - d1Var.f8147e) + 1;
            if (((z10 && i12 > s0Var.a()) || (!z10 && i12 < d1Var.f8147e)) && Math.abs(i12 - d1Var.f8147e) >= 3) {
                if (z10) {
                    i10 = i12 - iA;
                    int i13 = d1Var.f8147e;
                    if (i10 < i13) {
                        i10 = i13;
                    }
                } else {
                    int i14 = iA + i12;
                    i10 = d1Var.f8147e;
                    if (i14 <= i10) {
                        i10 = i14;
                    }
                }
                s0Var.b(i10, 0);
            }
            Object objC = w1.c(CropImageView.DEFAULT_ASPECT_RATIO, s0Var.d(i12) + this.f8316e, this.f8317f, new f1(new kotlin.jvm.internal.d0(), s0Var), this, 4);
            if (objC != obj2) {
                objC = pg.f0.f21461a;
            }
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
