package v;

import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import ph.l2;
import v.t1;

@vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {247}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class y1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f30125a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2.j0 f30127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg.i f30128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f30129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0 f30130f;

    @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {251, BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public l2 f30131a;

        /* renamed from: b, reason: collision with root package name */
        public int f30132b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f30133c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ph.i0 f30134d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ vg.i f30135e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.s f30136f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x0 f30137g;

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend")
        /* renamed from: v.y1$a$a, reason: collision with other inner class name */
        public static final class C0308a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f30138a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ vg.i f30139b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x0 f30140c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c2.b0 f30141d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0308a(eh.q<? super u0, ? super p1.c, ? super tg.e<? super pg.f0>, ? extends Object> qVar, x0 x0Var, c2.b0 b0Var, tg.e<? super C0308a> eVar) {
                super(2, eVar);
                this.f30139b = (vg.i) qVar;
                this.f30140c = x0Var;
                this.f30141d = b0Var;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [eh.q, vg.i] */
            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new C0308a(this.f30139b, this.f30140c, this.f30141d, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((C0308a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [eh.q, vg.i] */
            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f30138a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    p1.c cVar = new p1.c(this.f30141d.f4595c);
                    this.f30138a = 1;
                    if (this.f30139b.b(this.f30140c, cVar, this) == aVar) {
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

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x0 f30142a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x0 x0Var, tg.e<? super b> eVar) {
                super(2, eVar);
                this.f30142a = x0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new b(this.f30142a, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                this.f30142a.m();
                return pg.f0.f21461a;
            }
        }

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x0 f30143a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(x0 x0Var, tg.e<? super c> eVar) {
                super(2, eVar);
                this.f30143a = x0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new c(this.f30143a, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                this.f30143a.r();
                return pg.f0.f21461a;
            }
        }

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {249}, m = "invokeSuspend")
        public static final class d extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f30144a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f30145b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(x0 x0Var, tg.e<? super d> eVar) {
                super(2, eVar);
                this.f30145b = x0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new d(this.f30145b, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((d) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f30144a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    this.f30144a = 1;
                    if (this.f30145b.w(this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ph.i0 i0Var, eh.q<? super u0, ? super p1.c, ? super tg.e<? super pg.f0>, ? extends Object> qVar, eh.l<? super p1.c, pg.f0> lVar, x0 x0Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f30134d = i0Var;
            this.f30135e = (vg.i) qVar;
            this.f30136f = (kotlin.jvm.internal.s) lVar;
            this.f30137g = x0Var;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [eh.q, vg.i] */
        /* JADX WARN: Type inference failed for: r3v0, types: [eh.l, kotlin.jvm.internal.s] */
        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f30134d, this.f30135e, this.f30136f, this.f30137g, eVar);
            aVar.f30133c = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
        /* JADX WARN: Type inference failed for: r0v4, types: [eh.l, kotlin.jvm.internal.s] */
        /* JADX WARN: Type inference failed for: r8v0, types: [eh.q, vg.i] */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            l2 l2VarC;
            c2.c cVar;
            ph.s1 s1Var;
            c2.b0 b0Var;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f30132b;
            ph.i0 i0Var = this.f30134d;
            x0 x0Var = this.f30137g;
            if (i10 == 0) {
                pg.q.b(obj);
                c2.c cVar2 = (c2.c) this.f30133c;
                t1.a aVar2 = t1.f30086a;
                l2VarC = ph.h.c(i0Var, null, ph.k0.f21556d, new d(x0Var, null), 1);
                this.f30133c = cVar2;
                this.f30131a = l2VarC;
                this.f30132b = 1;
                Object objC = t1.c(cVar2, this, 3);
                if (objC != aVar) {
                    cVar = cVar2;
                    obj = objC;
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s1Var = (ph.s1) this.f30133c;
                pg.q.b(obj);
                b0Var = (c2.b0) obj;
                if (b0Var != null) {
                    t1.g(i0Var, s1Var, new b(x0Var, null));
                } else {
                    b0Var.a();
                    t1.g(i0Var, s1Var, new c(x0Var, null));
                    this.f30136f.invoke(new p1.c(b0Var.f4595c));
                }
                return pg.f0.f21461a;
            }
            l2VarC = this.f30131a;
            cVar = (c2.c) this.f30133c;
            pg.q.b(obj);
            c2.b0 b0Var2 = (c2.b0) obj;
            b0Var2.a();
            t1.a aVar3 = t1.f30086a;
            ?? r82 = this.f30135e;
            if (r82 != aVar3) {
                t1.g(i0Var, l2VarC, new C0308a(r82, x0Var, b0Var2, null));
            }
            this.f30133c = l2VarC;
            this.f30131a = null;
            this.f30132b = 2;
            obj = t1.i(cVar, c2.t.f4695b, this);
            if (obj != aVar) {
                s1Var = l2VarC;
                b0Var = (c2.b0) obj;
                if (b0Var != null) {
                }
                return pg.f0.f21461a;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y1(c2.j0 j0Var, eh.q<? super u0, ? super p1.c, ? super tg.e<? super pg.f0>, ? extends Object> qVar, eh.l<? super p1.c, pg.f0> lVar, x0 x0Var, tg.e<? super y1> eVar) {
        super(2, eVar);
        this.f30127c = j0Var;
        this.f30128d = (vg.i) qVar;
        this.f30129e = (kotlin.jvm.internal.s) lVar;
        this.f30130f = x0Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eh.q, vg.i] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        y1 y1Var = new y1(this.f30127c, this.f30128d, this.f30129e, this.f30130f, eVar);
        y1Var.f30126b = obj;
        return y1Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((y1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [eh.q, vg.i] */
    /* JADX WARN: Type inference failed for: r6v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f30125a;
        if (i10 == 0) {
            pg.q.b(obj);
            a aVar2 = new a((ph.i0) this.f30126b, this.f30128d, this.f30129e, this.f30130f, null);
            this.f30125a = 1;
            if (c0.c(this.f30127c, aVar2, this) == aVar) {
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
