package androidx.compose.foundation.layout;

import eh.l;
import f3.h;
import f3.m;
import j2.e3;
import j2.f5;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes.dex */
public final class e {

    public static final class a extends s implements l<e3, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f964a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f965b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, float f11) {
            super(1);
            this.f964a = f10;
            this.f965b = f11;
        }

        @Override // eh.l
        public final f0 invoke(e3 e3Var) {
            e3 e3Var2 = e3Var;
            e3Var2.getClass();
            f5 f5Var = e3Var2.f14714a;
            f5Var.b(new h(this.f964a), "x");
            f5Var.b(new h(this.f965b), "y");
            return f0.f21461a;
        }
    }

    public static final class b extends s implements l<e3, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<f3.d, m> f966a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super f3.d, m> lVar) {
            super(1);
            this.f966a = lVar;
        }

        @Override // eh.l
        public final f0 invoke(e3 e3Var) {
            e3 e3Var2 = e3Var;
            e3Var2.getClass();
            e3Var2.f14714a.b(this.f966a, "offset");
            return f0.f21461a;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, l<? super f3.d, m> lVar) {
        return dVar.h(new OffsetPxElement(lVar, new b(lVar)));
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.h(new OffsetElement(f10, f11, new a(f10, f11)));
    }

    public static androidx.compose.ui.d c(androidx.compose.ui.d dVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return b(dVar, f10, f11);
    }
}
