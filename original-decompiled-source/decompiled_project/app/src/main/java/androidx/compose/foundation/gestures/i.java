package androidx.compose.foundation.gestures;

import c2.b0;
import eh.l;
import eh.p;
import i0.c4;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;
import tg.h;
import v.b1;
import v.d1;
import v.e1;
import v.s1;
import v.t0;
import x.m;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f901a = a.f905a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f902b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final b f903c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final d f904d = new d();

    public static final class a extends s implements l<b0, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f905a = new a(1);

        @Override // eh.l
        public final Boolean invoke(b0 b0Var) {
            return Boolean.valueOf(!(b0Var.f4601i == 2));
        }
    }

    public static final class b implements j1.i {
        @Override // tg.h
        public final <R> R fold(R r10, p<? super R, ? super h.a, ? extends R> pVar) {
            return pVar.invoke(r10, this);
        }

        @Override // tg.h
        public final <E extends h.a> E get(h.b<E> bVar) {
            return (E) h.a.C0291a.a(this, bVar);
        }

        @Override // tg.h
        public final tg.h minusKey(h.b<?> bVar) {
            return h.a.C0291a.b(this, bVar);
        }

        @Override // j1.i
        public final float p() {
            return 1.0f;
        }

        @Override // tg.h
        public final tg.h plus(tg.h hVar) {
            return h.a.C0291a.c(this, hVar);
        }
    }

    public static final class c implements b1 {
        @Override // v.b1
        public final float e(float f10) {
            return f10;
        }
    }

    public static final class d implements f3.d {
        @Override // f3.d
        public final float G0() {
            return 1.0f;
        }

        @Override // f3.d
        public final float getDensity() {
            return 1.0f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s1 s1Var, long j10, vg.c cVar) {
        d1 d1Var;
        d0 d0Var;
        s1 s1Var2;
        if (cVar instanceof d1) {
            d1Var = (d1) cVar;
            int i10 = d1Var.f29809d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                d1Var.f29809d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                d1Var = new d1(cVar);
            }
        }
        Object obj = d1Var.f29808c;
        ug.a aVar = ug.a.f29706a;
        int i11 = d1Var.f29809d;
        if (i11 == 0) {
            q.b(obj);
            d0Var = new d0();
            t.b1 b1Var = t.b1.f25167a;
            e1 e1Var = new e1(s1Var, j10, d0Var, null);
            d1Var.f29806a = s1Var;
            d1Var.f29807b = d0Var;
            d1Var.f29809d = 1;
            if (s1Var.f(b1Var, e1Var, d1Var) == aVar) {
                return aVar;
            }
            s1Var2 = s1Var;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0 d0Var2 = d1Var.f29807b;
            s1 s1Var3 = d1Var.f29806a;
            q.b(obj);
            d0Var = d0Var2;
            s1Var2 = s1Var3;
        }
        return new p1.c(s1Var2.h(d0Var.f16322a));
    }

    public static androidx.compose.ui.d b(c4 c4Var, t0 t0Var, boolean z10, boolean z11, m mVar) {
        return new ScrollableElement(c4Var, t0Var, z10, z11, mVar);
    }
}
