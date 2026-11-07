package w;

import com.yalantis.ucrop.view.CropImageView;
import e0.c0;
import e0.o0;
import eh.p;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.s;
import pg.f0;
import pg.q;
import ph.i0;
import s.l1;
import s.o2;
import s.p2;
import s.w2;
import s.y;
import t0.u8;
import v.b1;
import v.t0;
import x0.x1;

@vg.e(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {135, 151}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends vg.i implements p<i0, tg.e<? super w.a<Float, s.o>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public d0 f30990a;

    /* renamed from: b, reason: collision with root package name */
    public int f30991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f30992c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f30993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<Float, f0> f30994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f30995f;

    public static final class a extends s implements eh.l<Float, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f30996a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<Float, f0> f30997b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d0 d0Var, eh.l<? super Float, f0> lVar) {
            super(1);
            this.f30996a = d0Var;
            this.f30997b = lVar;
        }

        @Override // eh.l
        public final f0 invoke(Float f10) {
            float fFloatValue = f10.floatValue();
            d0 d0Var = this.f30996a;
            float f11 = d0Var.f16322a - fFloatValue;
            d0Var.f16322a = f11;
            this.f30997b.invoke(Float.valueOf(f11));
            return f0.f21461a;
        }
    }

    public static final class b extends s implements eh.l<Float, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d0 f30998a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<Float, f0> f30999b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(d0 d0Var, eh.l<? super Float, f0> lVar) {
            super(1);
            this.f30998a = d0Var;
            this.f30999b = lVar;
        }

        @Override // eh.l
        public final f0 invoke(Float f10) {
            float fFloatValue = f10.floatValue();
            d0 d0Var = this.f30998a;
            float f11 = d0Var.f16322a - fFloatValue;
            d0Var.f16322a = f11;
            this.f30999b.invoke(Float.valueOf(f11));
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(h hVar, float f10, eh.l<? super Float, f0> lVar, b1 b1Var, tg.e<? super e> eVar) {
        super(2, eVar);
        this.f30992c = hVar;
        this.f30993d = f10;
        this.f30994e = lVar;
        this.f30995f = b1Var;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new e(this.f30992c, this.f30993d, this.f30994e, this.f30995f, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super w.a<Float, s.o>> eVar) {
        return ((e) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a A[RETURN] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f10;
        e0.b bVar;
        long j10;
        float f11;
        d0 d0Var;
        Object objC;
        float f12;
        float f13;
        float fFloatValue;
        h hVar = this.f30992c;
        c cVar = hVar.f31006a;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f30991b;
        eh.l<Float, f0> lVar = this.f30994e;
        if (i10 == 0) {
            q.b(obj);
            y<Float> yVar = hVar.f31007b;
            o2 o2Var = p2.f23868a;
            w2 w2VarA = yVar.a();
            s.o oVar = new s.o(CropImageView.DEFAULT_ASPECT_RATIO);
            float f14 = this.f30993d;
            float f15 = ((s.o) w2VarA.b(oVar, new s.o(f14))).f23852a;
            e0.b bVar2 = cVar.f30984a;
            int iN = bVar2.n();
            x1 x1Var = bVar2.f8158p;
            int i11 = ((o0) x1Var.getValue()).f8253c + iN;
            if (i11 == 0) {
                f11 = 0.0f;
                f10 = 0.0f;
            } else {
                int i12 = f14 < CropImageView.DEFAULT_ASPECT_RATIO ? bVar2.f8147e + 1 : bVar2.f8147e;
                int iM = jh.j.m(((int) (f15 / i11)) + i12, 0, bVar2.m());
                bVar2.n();
                int i13 = ((o0) x1Var.getValue()).f8253c;
                long j11 = i12;
                f10 = 0.0f;
                long j12 = 1;
                long j13 = j11 - j12;
                if (j13 < 0) {
                    bVar = bVar2;
                    j10 = 0;
                } else {
                    bVar = bVar2;
                    j10 = j13;
                }
                int i14 = (int) j10;
                long j14 = j11 + j12;
                if (j14 > 2147483647L) {
                    j14 = 2147483647L;
                }
                int iAbs = Math.abs((jh.j.m(jh.j.m(iM, i14, (int) j14), 0, bVar.m()) - i12) * i11) - i11;
                if (iAbs < 0) {
                    iAbs = 0;
                }
                f11 = iAbs == 0 ? iAbs : iAbs * Math.signum(f14);
            }
            if (Float.isNaN(f11)) {
                y.c.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            d0Var = new d0();
            float fSignum = Math.signum(f14) * Math.abs(f11);
            d0Var.f16322a = fSignum;
            lVar.invoke(new Float(fSignum));
            float f16 = d0Var.f16322a;
            b bVar3 = new b(d0Var, lVar);
            this.f30990a = d0Var;
            this.f30991b = 1;
            objC = h.c(hVar, this.f30995f, f16, this.f30993d, bVar3, this);
            if (objC != aVar) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            return obj;
        }
        d0 d0Var2 = this.f30990a;
        q.b(obj);
        f10 = 0.0f;
        d0Var = d0Var2;
        objC = obj;
        s.n nVar = (s.n) objC;
        float fFloatValue2 = ((Number) nVar.c()).floatValue();
        e0.b bVar4 = cVar.f30984a;
        n nVarI = bVar4.l().i();
        List<e0.n> listF = bVar4.l().f();
        int size = listF.size();
        float f17 = Float.NEGATIVE_INFINITY;
        float f18 = Float.POSITIVE_INFINITY;
        for (int i15 = 0; i15 < size; i15++) {
            e0.n nVar2 = listF.get(i15);
            c0 c0VarL = bVar4.l();
            c0VarL.getOrientation();
            t0 t0Var = t0.f30083a;
            c0VarL.b();
            bVar4.l().d();
            bVar4.l().c();
            bVar4.l().g();
            int offset = nVar2.getOffset();
            bVar4.m();
            nVarI.getClass();
            float f19 = offset - 0;
            if (f19 <= f10 && f19 > f17) {
                f17 = f19;
            }
            if (f19 >= f10 && f19 < f18) {
                f18 = f19;
            }
        }
        if (f17 == Float.NEGATIVE_INFINITY) {
            f17 = f18;
        }
        if (f18 == Float.POSITIVE_INFINITY) {
            f18 = f17;
        }
        if (!bVar4.d()) {
            if (u8.b(bVar4, fFloatValue2)) {
                f17 = f10;
                f18 = f17;
            } else {
                f18 = f10;
            }
        }
        if (bVar4.b()) {
            f12 = f17;
        } else {
            if (!u8.b(bVar4, fFloatValue2)) {
                f12 = f10;
                f13 = f12;
                fFloatValue = ((Number) cVar.f30985b.b(Float.valueOf(fFloatValue2), Float.valueOf(f12), Float.valueOf(f13))).floatValue();
                if (fFloatValue != f12 && fFloatValue != f13 && fFloatValue != f10) {
                    y.c.c("Final Snapping Offset Should Be one of " + f12 + ", " + f13 + " or 0.0");
                }
                if (fFloatValue != Float.POSITIVE_INFINITY || fFloatValue == Float.NEGATIVE_INFINITY) {
                    fFloatValue = f10;
                }
                if (Float.isNaN(fFloatValue)) {
                    y.c.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                d0Var.f16322a = fFloatValue;
                float f20 = f10;
                s.n nVarC = o1.j.c(nVar, f20, f20, 30);
                l1 l1Var = hVar.f31008c;
                a aVar2 = new a(d0Var, lVar);
                this.f30990a = null;
                this.f30991b = 2;
                Object objC2 = m.c(this.f30995f, fFloatValue, fFloatValue, nVarC, l1Var, aVar2, this);
                return objC2 != aVar ? aVar : objC2;
            }
            f12 = f10;
        }
        f13 = f18;
        fFloatValue = ((Number) cVar.f30985b.b(Float.valueOf(fFloatValue2), Float.valueOf(f12), Float.valueOf(f13))).floatValue();
        if (fFloatValue != f12) {
            y.c.c("Final Snapping Offset Should Be one of " + f12 + ", " + f13 + " or 0.0");
        }
        if (fFloatValue != Float.POSITIVE_INFINITY) {
            fFloatValue = f10;
            if (Float.isNaN(fFloatValue)) {
            }
            d0Var.f16322a = fFloatValue;
            float f202 = f10;
            s.n nVarC2 = o1.j.c(nVar, f202, f202, 30);
            l1 l1Var2 = hVar.f31008c;
            a aVar22 = new a(d0Var, lVar);
            this.f30990a = null;
            this.f30991b = 2;
            Object objC22 = m.c(this.f30995f, fFloatValue, fFloatValue, nVarC2, l1Var2, aVar22, this);
            if (objC22 != aVar) {
            }
        }
    }
}
