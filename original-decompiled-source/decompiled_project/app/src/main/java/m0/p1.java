package m0;

import org.bouncycastle.asn1.cmc.BodyPartID;

@vg.e(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class p1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f17448a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.r3<p1.c> f17450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.b<p1.c, s.p> f17451d;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<p1.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.r3<p1.c> f17452a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0.r3<p1.c> r3Var) {
            super(0);
            this.f17452a = r3Var;
        }

        @Override // eh.a
        public final p1.c invoke() {
            s.p pVar = m1.f17414a;
            return new p1.c(this.f17452a.getValue().f21129a);
        }
    }

    public static final class b<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s.b<p1.c, s.p> f17453a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ph.i0 f17454b;

        public b(s.b<p1.c, s.p> bVar, ph.i0 i0Var) {
            this.f17453a = bVar;
            this.f17454b = i0Var;
        }

        @Override // sh.g
        public final Object c(Object obj, tg.e eVar) {
            long j10 = ((p1.c) obj).f21129a;
            s.b<p1.c, s.p> bVar = this.f17453a;
            if ((bVar.d().f21129a & 9223372034707292159L) == 9205357640488583168L || (j10 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (bVar.d().f21129a & BodyPartID.bodyIdMax)) == Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax))) {
                Object objF = bVar.f(new p1.c(j10), eVar);
                return objF == ug.a.f29706a ? objF : pg.f0.f21461a;
            }
            ph.h.c(this.f17454b, null, null, new q1(bVar, j10, null), 3);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(x0.r3<p1.c> r3Var, s.b<p1.c, s.p> bVar, tg.e<? super p1> eVar) {
        super(2, eVar);
        this.f17450c = r3Var;
        this.f17451d = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        p1 p1Var = new p1(this.f17450c, this.f17451d, eVar);
        p1Var.f17449b = obj;
        return p1Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((p1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f17448a;
        if (i10 == 0) {
            pg.q.b(obj);
            ph.i0 i0Var = (ph.i0) this.f17449b;
            sh.m0 m0VarL = bg.b.l(new a(this.f17450c));
            b bVar = new b(this.f17451d, i0Var);
            this.f17448a = 1;
            if (m0VarL.b(bVar, this) == aVar) {
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
