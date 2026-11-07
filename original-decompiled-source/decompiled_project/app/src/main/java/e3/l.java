package e3;

import kotlin.jvm.internal.s;
import q1.b1;
import q1.d2;
import q1.u0;

/* loaded from: classes.dex */
public interface l {

    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8369a = new a();

        @Override // e3.l
        public final float i() {
            return Float.NaN;
        }

        @Override // e3.l
        public final long j() {
            int i10 = b1.f21655i;
            return b1.f21654h;
        }

        @Override // e3.l
        public final u0 l() {
            return null;
        }
    }

    public static final class b extends s implements eh.a<Float> {
        public b() {
            super(0);
        }

        @Override // eh.a
        public final Float invoke() {
            return Float.valueOf(l.this.i());
        }
    }

    public static final class c extends s implements eh.a<l> {
        public c() {
            super(0);
        }

        @Override // eh.a
        public final l invoke() {
            return l.this;
        }
    }

    float i();

    long j();

    default l k(l lVar) {
        boolean z10 = lVar instanceof e3.b;
        if (!z10 || !(this instanceof e3.b)) {
            return (!z10 || (this instanceof e3.b)) ? (z10 || !(this instanceof e3.b)) ? lVar.m(new c()) : this : lVar;
        }
        e3.b bVar = (e3.b) lVar;
        d2 d2Var = bVar.f8346a;
        float fFloatValue = bVar.f8347b;
        b bVar2 = new b();
        if (Float.isNaN(fFloatValue)) {
            fFloatValue = ((Number) bVar2.invoke()).floatValue();
        }
        return new e3.b(d2Var, fFloatValue);
    }

    u0 l();

    default l m(eh.a<? extends l> aVar) {
        return !equals(a.f8369a) ? this : aVar.invoke();
    }
}
