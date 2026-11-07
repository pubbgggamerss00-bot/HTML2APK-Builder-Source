package i0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import org.bouncycastle.asn1.eac.EACTags;
import v.t1;
import x.o;

/* loaded from: classes.dex */
public final class z3 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f13736a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<o.b> f13737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x.m f13738c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f13739d;

    @vg.e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.q<v.u0, p1.c, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13740a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ v.u0 f13741b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ long f13742c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ph.i0 f13743d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.n1<o.b> f13744e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x.m f13745f;

        @vg.e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend")
        /* renamed from: i0.z3$a$a, reason: collision with other inner class name */
        public static final class C0125a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f13746a;

            /* renamed from: b, reason: collision with root package name */
            public int f13747b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x0.n1<o.b> f13748c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f13749d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ x.m f13750e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0125a(x0.n1<o.b> n1Var, long j10, x.m mVar, tg.e<? super C0125a> eVar) {
                super(2, eVar);
                this.f13748c = n1Var;
                this.f13749d = j10;
                this.f13750e = mVar;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new C0125a(this.f13748c, this.f13749d, this.f13750e, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((C0125a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
            
                if (r2.c(r1, r8) == r0) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                x0.n1<o.b> n1Var;
                o.b bVar;
                o.b bVar2;
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f13747b;
                x.m mVar = this.f13750e;
                x0.n1<o.b> n1Var2 = this.f13748c;
                if (i10 == 0) {
                    pg.q.b(obj);
                    o.b value = n1Var2.getValue();
                    if (value == null) {
                        bVar = new o.b(this.f13749d);
                        if (mVar != null) {
                            this.f13746a = bVar;
                            this.f13747b = 2;
                            if (mVar.c(bVar, this) != aVar) {
                                bVar2 = bVar;
                                bVar = bVar2;
                            }
                        }
                        n1Var2.setValue(bVar);
                        return pg.f0.f21461a;
                    }
                    o.a aVar2 = new o.a(value);
                    if (mVar != null) {
                        this.f13746a = n1Var2;
                        this.f13747b = 1;
                    }
                    n1Var = n1Var2;
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar2 = (o.b) this.f13746a;
                    pg.q.b(obj);
                    bVar = bVar2;
                    n1Var2.setValue(bVar);
                    return pg.f0.f21461a;
                }
                n1Var = (x0.n1) this.f13746a;
                pg.q.b(obj);
                n1Var.setValue(null);
                bVar = new o.b(this.f13749d);
                if (mVar != null) {
                }
                n1Var2.setValue(bVar);
                return pg.f0.f21461a;
            }
        }

        @vg.e(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend")
        public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public x0.n1 f13751a;

            /* renamed from: b, reason: collision with root package name */
            public int f13752b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x0.n1<o.b> f13753c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f13754d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ x.m f13755e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x0.n1<o.b> n1Var, boolean z10, x.m mVar, tg.e<? super b> eVar) {
                super(2, eVar);
                this.f13753c = n1Var;
                this.f13754d = z10;
                this.f13755e = mVar;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new b(this.f13753c, this.f13754d, this.f13755e, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                x0.n1<o.b> n1Var;
                x0.n1<o.b> n1Var2;
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f13752b;
                if (i10 == 0) {
                    pg.q.b(obj);
                    n1Var = this.f13753c;
                    o.b value = n1Var.getValue();
                    if (value != null) {
                        x.k cVar = this.f13754d ? new o.c(value) : new o.a(value);
                        x.m mVar = this.f13755e;
                        if (mVar != null) {
                            this.f13751a = n1Var;
                            this.f13752b = 1;
                            if (mVar.c(cVar, this) == aVar) {
                                return aVar;
                            }
                            n1Var2 = n1Var;
                        }
                        n1Var.setValue(null);
                    }
                    return pg.f0.f21461a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n1Var2 = this.f13751a;
                pg.q.b(obj);
                n1Var = n1Var2;
                n1Var.setValue(null);
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ph.i0 i0Var, x0.n1<o.b> n1Var, x.m mVar, tg.e<? super a> eVar) {
            super(3, eVar);
            this.f13743d = i0Var;
            this.f13744e = n1Var;
            this.f13745f = mVar;
        }

        @Override // eh.q
        public final Object b(v.u0 u0Var, p1.c cVar, tg.e<? super pg.f0> eVar) {
            long j10 = cVar.f21129a;
            x0.n1<o.b> n1Var = this.f13744e;
            x.m mVar = this.f13745f;
            a aVar = new a(this.f13743d, n1Var, mVar, eVar);
            aVar.f13741b = u0Var;
            aVar.f13742c = j10;
            return aVar.invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f13740a;
            ph.i0 i0Var = this.f13743d;
            if (i10 == 0) {
                pg.q.b(obj);
                v.u0 u0Var = this.f13741b;
                ph.h.c(i0Var, null, null, new C0125a(this.f13744e, this.f13742c, this.f13745f, null), 3);
                this.f13740a = 1;
                obj = u0Var.G1(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            ph.h.c(i0Var, null, null, new b(this.f13744e, ((Boolean) obj).booleanValue(), this.f13745f, null), 3);
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<p1.c, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1 f13756a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x0.n1 n1Var) {
            super(1);
            this.f13756a = n1Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(p1.c cVar) {
            ((eh.l) this.f13756a.getValue()).invoke(new p1.c(cVar.f21129a));
            return pg.f0.f21461a;
        }
    }

    public z3(ph.i0 i0Var, x0.n1 n1Var, x.m mVar, x0.n1 n1Var2) {
        this.f13736a = i0Var;
        this.f13737b = n1Var;
        this.f13738c = mVar;
        this.f13739d = n1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        a aVar = new a(this.f13736a, this.f13737b, this.f13738c, null);
        b bVar = new b(this.f13739d);
        t1.a aVar2 = v.t1.f30086a;
        Object objC = ph.j0.c(new v.y1(j0Var, aVar, bVar, new v.x0(j0Var), null), eVar);
        ug.a aVar3 = ug.a.f29706a;
        if (objC != aVar3) {
            objC = pg.f0.f21461a;
        }
        return objC == aVar3 ? objC : pg.f0.f21461a;
    }
}
