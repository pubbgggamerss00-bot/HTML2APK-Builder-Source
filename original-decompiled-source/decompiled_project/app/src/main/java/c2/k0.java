package c2;

import android.view.MotionEvent;
import i0.u2;

/* loaded from: classes.dex */
public final class k0 implements h0 {

    /* renamed from: b, reason: collision with root package name */
    public m0 f4654b;

    /* renamed from: c, reason: collision with root package name */
    public q0 f4655c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4656d;

    /* renamed from: e, reason: collision with root package name */
    public final b f4657e = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4658a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f4659b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f4660c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f4661d;

        static {
            a aVar = new a("Unknown", 0);
            f4658a = aVar;
            a aVar2 = new a("Dispatching", 1);
            f4659b = aVar2;
            a aVar3 = new a("NotDispatching", 2);
            f4660c = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f4661d = aVarArr;
            u2.e(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f4661d.clone();
        }
    }

    public static final class b extends g0 {

        /* renamed from: b, reason: collision with root package name */
        public a f4662b;

        public static final class a extends kotlin.jvm.internal.s implements eh.l<MotionEvent, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k0 f4664a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k0 k0Var) {
                super(1);
                this.f4664a = k0Var;
            }

            @Override // eh.l
            public final pg.f0 invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                m0 m0Var = this.f4664a.f4654b;
                if (m0Var != null) {
                    m0Var.invoke(motionEvent2);
                    return pg.f0.f21461a;
                }
                kotlin.jvm.internal.r.h("onTouchEvent");
                throw null;
            }
        }

        /* renamed from: c2.k0$b$b, reason: collision with other inner class name */
        public static final class C0057b extends kotlin.jvm.internal.s implements eh.l<MotionEvent, pg.f0> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f4666b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0057b(k0 k0Var) {
                super(1);
                this.f4666b = k0Var;
            }

            @Override // eh.l
            public final pg.f0 invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                int actionMasked = motionEvent2.getActionMasked();
                k0 k0Var = this.f4666b;
                if (actionMasked == 0) {
                    m0 m0Var = k0Var.f4654b;
                    if (m0Var == null) {
                        kotlin.jvm.internal.r.h("onTouchEvent");
                        throw null;
                    }
                    b.this.f4662b = ((Boolean) m0Var.invoke(motionEvent2)).booleanValue() ? a.f4659b : a.f4660c;
                } else {
                    m0 m0Var2 = k0Var.f4654b;
                    if (m0Var2 == null) {
                        kotlin.jvm.internal.r.h("onTouchEvent");
                        throw null;
                    }
                    m0Var2.invoke(motionEvent2);
                }
                return pg.f0.f21461a;
            }
        }

        public b() {
            super(0);
            this.f4662b = a.f4658a;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
        public final void c0(r rVar) {
            ?? r02 = rVar.f4687a;
            int size = r02.size();
            int i10 = 0;
            while (true) {
                k0 k0Var = k0.this;
                if (i10 >= size) {
                    g2.v vVar = (g2.v) this.f4646a;
                    if (vVar == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    n0.k(rVar, vVar.Y(0L), new C0057b(k0Var), false);
                    if (this.f4662b == a.f4659b) {
                        int size2 = r02.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            ((b0) r02.get(i11)).a();
                        }
                        j jVar = rVar.f4688b;
                        if (jVar == null) {
                            return;
                        }
                        jVar.f4653c = !k0Var.f4656d;
                        return;
                    }
                    return;
                }
                if (((b0) r02.get(i10)).b()) {
                    if (this.f4662b == a.f4659b) {
                        g2.v vVar2 = (g2.v) this.f4646a;
                        if (vVar2 == null) {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                        n0.k(rVar, vVar2.Y(0L), new a(k0Var), true);
                    }
                    this.f4662b = a.f4660c;
                    return;
                }
                i10++;
            }
        }
    }

    @Override // c2.h0
    public final b o() {
        return this.f4657e;
    }
}
