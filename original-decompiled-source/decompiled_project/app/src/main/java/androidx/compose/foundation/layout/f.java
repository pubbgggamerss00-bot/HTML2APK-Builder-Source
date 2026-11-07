package androidx.compose.foundation.layout;

import eh.l;
import f3.h;
import f3.r;
import j2.e3;
import j2.f5;
import kotlin.jvm.internal.s;
import pg.f0;
import z.f1;
import z.g1;

/* loaded from: classes.dex */
public final class f {

    public static final class a extends s implements l<e3, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f967a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f968b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f969c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f970d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, float f11, float f12, float f13) {
            super(1);
            this.f967a = f10;
            this.f968b = f11;
            this.f969c = f12;
            this.f970d = f13;
        }

        @Override // eh.l
        public final f0 invoke(e3 e3Var) {
            e3 e3Var2 = e3Var;
            e3Var2.getClass();
            f5 f5Var = e3Var2.f14714a;
            f5Var.b(new h(this.f967a), "start");
            f5Var.b(new h(this.f968b), "top");
            f5Var.b(new h(this.f969c), "end");
            f5Var.b(new h(this.f970d), "bottom");
            return f0.f21461a;
        }
    }

    public static final class b extends s implements l<e3, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f971a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f972b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, float f11) {
            super(1);
            this.f971a = f10;
            this.f972b = f11;
        }

        @Override // eh.l
        public final f0 invoke(e3 e3Var) {
            e3 e3Var2 = e3Var;
            e3Var2.getClass();
            f5 f5Var = e3Var2.f14714a;
            f5Var.b(new h(this.f971a), "horizontal");
            f5Var.b(new h(this.f972b), "vertical");
            return f0.f21461a;
        }
    }

    public static final class c extends s implements l<e3, f0> {
        @Override // eh.l
        public final f0 invoke(e3 e3Var) {
            e3Var.getClass();
            return f0.f21461a;
        }
    }

    public static final class d extends s implements l<e3, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f1 f973a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f1 f1Var) {
            super(1);
            this.f973a = f1Var;
        }

        @Override // eh.l
        public final f0 invoke(e3 e3Var) {
            e3 e3Var2 = e3Var;
            e3Var2.getClass();
            e3Var2.f14714a.b(this.f973a, "paddingValues");
            return f0.f21461a;
        }
    }

    public static final g1 a(float f10) {
        return new g1(f10, f10, f10, f10);
    }

    public static final g1 b(float f10, float f11) {
        return new g1(f10, f11, f10, f11);
    }

    public static g1 c(float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return new g1(f10, f11, f10, f11);
    }

    public static g1 d(float f10, float f11, int i10) {
        float f12 = 0;
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        float f13 = 0;
        if ((i10 & 8) != 0) {
            f11 = 0;
        }
        return new g1(f12, f10, f13, f11);
    }

    public static final float e(f1 f1Var, r rVar) {
        return rVar == r.f8828a ? f1Var.d(rVar) : f1Var.b(rVar);
    }

    public static final float f(f1 f1Var, r rVar) {
        return rVar == r.f8828a ? f1Var.b(rVar) : f1Var.d(rVar);
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, f1 f1Var) {
        return dVar.h(new PaddingValuesElement(f1Var, new d(f1Var)));
    }

    public static final androidx.compose.ui.d h(androidx.compose.ui.d dVar, float f10) {
        return dVar.h(new PaddingElement(f10, f10, f10, f10, new c(1)));
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.h(new PaddingElement(f10, f11, f10, f11, new b(f10, f11)));
    }

    public static androidx.compose.ui.d j(androidx.compose.ui.d dVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return i(dVar, f10, f11);
    }

    public static final androidx.compose.ui.d k(androidx.compose.ui.d dVar, float f10, float f11, float f12, float f13) {
        return dVar.h(new PaddingElement(f10, f11, f12, f13, new a(f10, f11, f12, f13)));
    }

    public static androidx.compose.ui.d l(androidx.compose.ui.d dVar, float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return k(dVar, f10, f11, f12, f13);
    }
}
