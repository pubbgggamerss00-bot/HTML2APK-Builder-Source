package i0;

import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: classes.dex */
public final class m2 {

    @vg.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super ph.s1>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f13426a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c2.j0 f13427b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b3 f13428c;

        @vg.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID}, m = "invokeSuspend")
        /* renamed from: i0.m2$a$a, reason: collision with other inner class name */
        public static final class C0121a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f13429a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c2.j0 f13430b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b3 f13431c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0121a(c2.j0 j0Var, b3 b3Var, tg.e<? super C0121a> eVar) {
                super(2, eVar);
                this.f13430b = j0Var;
                this.f13431c = b3Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new C0121a(this.f13430b, this.f13431c, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((C0121a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                Object obj2 = ug.a.f29706a;
                int i10 = this.f13429a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    this.f13429a = 1;
                    Object objC = v.c0.c(this.f13430b, new r2(this.f13431c, null), this);
                    if (objC != obj2) {
                        objC = pg.f0.f21461a;
                    }
                    if (objC == obj2) {
                        return obj2;
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

        @vg.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {78}, m = "invokeSuspend")
        public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f13432a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c2.j0 f13433b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b3 f13434c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c2.j0 j0Var, b3 b3Var, tg.e<? super b> eVar) {
                super(2, eVar);
                this.f13433b = j0Var;
                this.f13434c = b3Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new b(this.f13433b, this.f13434c, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                Object obj2 = ug.a.f29706a;
                int i10 = this.f13432a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    this.f13432a = 1;
                    b3 b3Var = this.f13434c;
                    n2 n2Var = new n2(b3Var, 0);
                    o2 o2Var = new o2(b3Var);
                    p2 p2Var = new p2(b3Var);
                    q2 q2Var = new q2(b3Var);
                    float f10 = v.u.f30087a;
                    v.o oVar = new v.o(n2Var);
                    v.p pVar = new v.p(o2Var);
                    Object objC = v.c0.c(this.f13433b, new v.r(v.q.f30029a, new kotlin.jvm.internal.f0(), null, oVar, q2Var, p2Var, pVar, null), this);
                    if (objC != obj2) {
                        objC = pg.f0.f21461a;
                    }
                    if (objC != obj2) {
                        objC = pg.f0.f21461a;
                    }
                    if (objC != obj2) {
                        objC = pg.f0.f21461a;
                    }
                    if (objC == obj2) {
                        return obj2;
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
        public a(c2.j0 j0Var, b3 b3Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f13427b = j0Var;
            this.f13428c = b3Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f13427b, this.f13428c, eVar);
            aVar.f13426a = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super ph.s1> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            ph.i0 i0Var = (ph.i0) this.f13426a;
            ph.k0 k0Var = ph.k0.f21556d;
            c2.j0 j0Var = this.f13427b;
            b3 b3Var = this.f13428c;
            ph.h.c(i0Var, null, k0Var, new C0121a(j0Var, b3Var, null), 1);
            return ph.h.c(i0Var, null, k0Var, new b(j0Var, b3Var, null), 1);
        }
    }

    public static final Object a(c2.j0 j0Var, b3 b3Var, tg.e<? super pg.f0> eVar) {
        Object objC = ph.j0.c(new a(j0Var, b3Var, null), eVar);
        return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
    }
}
