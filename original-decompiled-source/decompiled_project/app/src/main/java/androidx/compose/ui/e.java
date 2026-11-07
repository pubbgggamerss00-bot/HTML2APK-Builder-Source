package androidx.compose.ui;

import androidx.compose.ui.d;
import eh.l;
import g2.g1;
import g2.k0;
import g2.m0;
import g2.o0;
import i2.b0;
import kotlin.jvm.internal.s;
import pg.f0;
import qg.a0;

/* loaded from: classes.dex */
public final class e extends d.c implements b0 {

    /* renamed from: q, reason: collision with root package name */
    public float f1173q;

    public static final class a extends s implements l<g1.a, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g1 f1174a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f1175b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1 g1Var, e eVar) {
            super(1);
            this.f1174a = g1Var;
            this.f1175b = eVar;
        }

        @Override // eh.l
        public final f0 invoke(g1.a aVar) {
            aVar.d(this.f1174a, 0, 0, this.f1175b.f1173q);
            return f0.f21461a;
        }
    }

    @Override // i2.b0
    public final m0 m(o0 o0Var, k0 k0Var, long j10) {
        g1 g1VarP = k0Var.P(j10);
        return o0Var.i0(g1VarP.f11382a, g1VarP.f11383b, a0.f22708a, new a(g1VarP, this));
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.digest.d.a(new StringBuilder("ZIndexModifier(zIndex="), this.f1173q, ')');
    }
}
