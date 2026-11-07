package v;

import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import ph.l2;
import v.d0;
import v.t1;

@vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {HeaderItem.DATA_SIZE_OFFSET}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f30149a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2.j0 f30151c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.q<u0, p1.c, tg.e<? super pg.f0>, Object> f30152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<p1.c, pg.f0> f30153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.l<p1.c, pg.f0> f30154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f30155g;

    @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105, CdexHeaderItem.DEBUG_INFO_OFFSETS_POS_OFFSET, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f30156a;

        /* renamed from: b, reason: collision with root package name */
        public Object f30157b;

        /* renamed from: c, reason: collision with root package name */
        public c2.b0 f30158c;

        /* renamed from: d, reason: collision with root package name */
        public int f30159d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f30160e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ph.i0 f30161f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ eh.q<u0, p1.c, tg.e<? super pg.f0>, Object> f30162g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ eh.l<p1.c, pg.f0> f30163h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ eh.l<p1.c, pg.f0> f30164j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.s f30165k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x0 f30166l;

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {110}, m = "invokeSuspend")
        /* renamed from: v.z1$a$a, reason: collision with other inner class name */
        public static final class C0309a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f30167a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ eh.q<u0, p1.c, tg.e<? super pg.f0>, Object> f30168b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x0 f30169c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c2.b0 f30170d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0309a(eh.q<? super u0, ? super p1.c, ? super tg.e<? super pg.f0>, ? extends Object> qVar, x0 x0Var, c2.b0 b0Var, tg.e<? super C0309a> eVar) {
                super(2, eVar);
                this.f30168b = qVar;
                this.f30169c = x0Var;
                this.f30170d = b0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new C0309a(this.f30168b, this.f30169c, this.f30170d, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((C0309a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f30167a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    p1.c cVar = new p1.c(this.f30170d.f4595c);
                    this.f30167a = 1;
                    if (this.f30168b.b(this.f30169c, cVar, this) == aVar) {
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

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x0 f30171a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x0 x0Var, tg.e<? super b> eVar) {
                super(2, eVar);
                this.f30171a = x0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new b(this.f30171a, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                this.f30171a.r();
                return pg.f0.f21461a;
            }
        }

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class c extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x0 f30172a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(x0 x0Var, tg.e<? super c> eVar) {
                super(2, eVar);
                this.f30172a = x0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new c(this.f30172a, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                this.f30172a.m();
                return pg.f0.f21461a;
            }
        }

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class d extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x0 f30173a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(x0 x0Var, tg.e<? super d> eVar) {
                super(2, eVar);
                this.f30173a = x0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new d(this.f30173a, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((d) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                this.f30173a.r();
                return pg.f0.f21461a;
            }
        }

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {157, 158}, m = "invokeSuspend")
        public static final class e extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f30174a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ph.s1 f30175b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x0 f30176c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(ph.s1 s1Var, x0 x0Var, tg.e<? super e> eVar) {
                super(2, eVar);
                this.f30175b = s1Var;
                this.f30176c = x0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new e(this.f30175b, this.f30176c, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((e) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
            
                if (r4.f30176c.w(r4) == r0) goto L15;
             */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f30174a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    this.f30174a = 1;
                    if (this.f30175b.join(this) != aVar) {
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    return pg.f0.f21461a;
                }
                pg.q.b(obj);
                this.f30174a = 2;
            }
        }

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {161}, m = "invokeSuspend")
        public static final class f extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f30177a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ eh.q<u0, p1.c, tg.e<? super pg.f0>, Object> f30178b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x0 f30179c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c2.b0 f30180d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(eh.q<? super u0, ? super p1.c, ? super tg.e<? super pg.f0>, ? extends Object> qVar, x0 x0Var, c2.b0 b0Var, tg.e<? super f> eVar) {
                super(2, eVar);
                this.f30178b = qVar;
                this.f30179c = x0Var;
                this.f30180d = b0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new f(this.f30178b, this.f30179c, this.f30180d, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((f) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f30177a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    p1.c cVar = new p1.c(this.f30180d.f4595c);
                    this.f30177a = 1;
                    if (this.f30178b.b(this.f30179c, cVar, this) == aVar) {
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

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class g extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x0 f30181a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(x0 x0Var, tg.e<? super g> eVar) {
                super(2, eVar);
                this.f30181a = x0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new g(this.f30181a, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((g) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                this.f30181a.r();
                return pg.f0.f21461a;
            }
        }

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class h extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x0 f30182a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(x0 x0Var, tg.e<? super h> eVar) {
                super(2, eVar);
                this.f30182a = x0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new h(this.f30182a, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((h) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                this.f30182a.m();
                return pg.f0.f21461a;
            }
        }

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {HeaderItem.DATA_START_OFFSET}, m = "invokeSuspend")
        public static final class i extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f30183a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f30184b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(x0 x0Var, tg.e<? super i> eVar) {
                super(2, eVar);
                this.f30184b = x0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new i(this.f30184b, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((i) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f30183a;
                if (i10 == 0) {
                    pg.q.b(obj);
                    this.f30183a = 1;
                    if (this.f30184b.w(this) == aVar) {
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

        @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        public static final class j extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x0 f30185a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(x0 x0Var, tg.e<? super j> eVar) {
                super(2, eVar);
                this.f30185a = x0Var;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                return new j(this.f30185a, eVar);
            }

            @Override // eh.p
            public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
                return ((j) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) {
                ug.a aVar = ug.a.f29706a;
                pg.q.b(obj);
                this.f30185a.r();
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ph.i0 i0Var, eh.q<? super u0, ? super p1.c, ? super tg.e<? super pg.f0>, ? extends Object> qVar, eh.l<? super p1.c, pg.f0> lVar, eh.l<? super p1.c, pg.f0> lVar2, eh.l<? super p1.c, pg.f0> lVar3, x0 x0Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f30161f = i0Var;
            this.f30162g = qVar;
            this.f30163h = lVar;
            this.f30164j = lVar2;
            this.f30165k = (kotlin.jvm.internal.s) lVar3;
            this.f30166l = x0Var;
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [eh.l, kotlin.jvm.internal.s] */
        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f30161f, this.f30162g, this.f30163h, this.f30164j, this.f30165k, this.f30166l, eVar);
            aVar.f30160e = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0230  */
        /* JADX WARN: Type inference failed for: r7v0, types: [eh.l, kotlin.jvm.internal.s] */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c2.c cVar;
            Object objC;
            c2.b0 b0Var;
            Object objH;
            c2.c cVar2;
            ph.s1 s1Var;
            Object objI;
            c2.c cVar3;
            c2.b0 b0Var2;
            ph.s1 s1VarG;
            Object objZ;
            d0 d0Var;
            ph.s1 s1Var2;
            c2.b0 b0Var3;
            ph.s1 s1VarC;
            Object objH2;
            c2.c cVar4;
            Object objI2;
            c2.b0 b0Var4;
            c2.b0 b0Var5;
            d0 d0Var2;
            ph.s1 s1Var3;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f30159d;
            ph.i0 i0Var = this.f30161f;
            eh.l<p1.c, pg.f0> lVar = this.f30164j;
            eh.q<u0, p1.c, tg.e<? super pg.f0>, Object> qVar = this.f30162g;
            ?? r72 = this.f30165k;
            eh.l<p1.c, pg.f0> lVar2 = this.f30163h;
            x0 x0Var = this.f30166l;
            switch (i10) {
                case 0:
                    pg.q.b(obj);
                    cVar = (c2.c) this.f30160e;
                    this.f30160e = cVar;
                    this.f30159d = 1;
                    objC = t1.c(cVar, this, 3);
                    if (objC != aVar) {
                        b0Var = (c2.b0) objC;
                        b0Var.a();
                        t1.a aVar2 = t1.f30086a;
                        l2 l2VarC = ph.h.c(i0Var, null, ph.k0.f21556d, new i(x0Var, null), 1);
                        if (qVar != t1.f30086a) {
                            t1.g(i0Var, l2VarC, new C0309a(qVar, x0Var, b0Var, null));
                        }
                        if (lVar2 != null) {
                            this.f30160e = cVar;
                            this.f30156a = l2VarC;
                            this.f30159d = 2;
                            objI = t1.i(cVar, c2.t.f4695b, this);
                            if (objI != aVar) {
                                cVar3 = cVar;
                                s1Var = l2VarC;
                                b0Var2 = (c2.b0) objI;
                                if (b0Var2 == null) {
                                    s1VarG = t1.g(i0Var, s1Var, new c(x0Var, null));
                                } else {
                                    b0Var2.a();
                                    s1VarG = t1.g(i0Var, s1Var, new d(x0Var, null));
                                }
                                if (b0Var2 != null) {
                                    if (lVar == null) {
                                        r72.invoke(new p1.c(b0Var2.f4595c));
                                    } else {
                                        this.f30160e = cVar3;
                                        this.f30156a = b0Var2;
                                        this.f30157b = s1VarG;
                                        this.f30159d = 5;
                                        objZ = cVar3.Z(cVar3.getViewConfiguration().a(), new w1(b0Var2, null), this);
                                        if (objZ != aVar) {
                                            b0Var3 = (c2.b0) objZ;
                                            if (b0Var3 != null) {
                                                r72.invoke(new p1.c(b0Var2.f4595c));
                                            } else {
                                                t1.a aVar3 = t1.f30086a;
                                                s1VarC = ph.h.c(i0Var, null, ph.k0.f21556d, new e(s1VarG, x0Var, null), 1);
                                                if (qVar != t1.f30086a) {
                                                    t1.g(i0Var, s1VarC, new f(qVar, x0Var, b0Var3, null));
                                                }
                                                if (lVar2 == null) {
                                                    this.f30160e = s1VarC;
                                                    this.f30156a = b0Var2;
                                                    this.f30157b = null;
                                                    this.f30159d = 6;
                                                    objI2 = t1.i(cVar3, c2.t.f4695b, this);
                                                    if (objI2 != aVar) {
                                                        b0Var4 = b0Var2;
                                                        b0Var5 = (c2.b0) objI2;
                                                        if (b0Var5 != null) {
                                                            b0Var5.a();
                                                            t1.g(i0Var, s1VarC, new g(x0Var, null));
                                                            lVar.invoke(new p1.c(b0Var5.f4595c));
                                                        } else {
                                                            t1.g(i0Var, s1VarC, new h(x0Var, null));
                                                            r72.invoke(new p1.c(b0Var4.f4595c));
                                                        }
                                                    }
                                                } else {
                                                    this.f30160e = cVar3;
                                                    this.f30156a = s1VarC;
                                                    this.f30157b = b0Var2;
                                                    this.f30158c = b0Var3;
                                                    this.f30159d = 7;
                                                    objH2 = t1.h(cVar3, c2.t.f4695b, this);
                                                    if (objH2 != aVar) {
                                                        cVar4 = cVar3;
                                                        d0Var2 = (d0) objH2;
                                                        if (kotlin.jvm.internal.r.a(d0Var2, d0.c.f29805a)) {
                                                            if (d0Var2 instanceof d0.b) {
                                                                b0Var5 = ((d0.b) d0Var2).f29804a;
                                                                b0Var4 = b0Var2;
                                                            } else {
                                                                if (!(d0Var2 instanceof d0.a)) {
                                                                    throw new pg.l();
                                                                }
                                                                b0Var4 = b0Var2;
                                                                b0Var5 = null;
                                                            }
                                                            if (b0Var5 != null) {
                                                            }
                                                        } else {
                                                            lVar2.invoke(new p1.c(b0Var3.f4595c));
                                                            this.f30160e = s1VarC;
                                                            this.f30156a = null;
                                                            this.f30157b = null;
                                                            this.f30158c = null;
                                                            this.f30159d = 8;
                                                            if (t1.a(cVar4, this) != aVar) {
                                                                s1Var3 = s1VarC;
                                                                t1.g(i0Var, s1Var3, new j(x0Var, null));
                                                                return pg.f0.f21461a;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return pg.f0.f21461a;
                            }
                        } else {
                            this.f30160e = cVar;
                            this.f30156a = b0Var;
                            this.f30157b = l2VarC;
                            this.f30159d = 3;
                            objH = t1.h(cVar, c2.t.f4695b, this);
                            if (objH != aVar) {
                                cVar2 = cVar;
                                s1Var = l2VarC;
                                d0Var = (d0) objH;
                                if (kotlin.jvm.internal.r.a(d0Var, d0.c.f29805a)) {
                                    if (d0Var instanceof d0.b) {
                                        b0Var2 = ((d0.b) d0Var).f29804a;
                                    } else {
                                        if (!(d0Var instanceof d0.a)) {
                                            throw new pg.l();
                                        }
                                        b0Var2 = null;
                                    }
                                    cVar3 = cVar2;
                                    if (b0Var2 == null) {
                                    }
                                    if (b0Var2 != null) {
                                    }
                                    return pg.f0.f21461a;
                                }
                                lVar2.invoke(new p1.c(b0Var.f4595c));
                                this.f30160e = s1Var;
                                this.f30156a = null;
                                this.f30157b = null;
                                this.f30159d = 4;
                                if (t1.a(cVar2, this) != aVar) {
                                    s1Var2 = s1Var;
                                    t1.g(i0Var, s1Var2, new b(x0Var, null));
                                    return pg.f0.f21461a;
                                }
                            }
                        }
                    }
                    return aVar;
                case 1:
                    cVar = (c2.c) this.f30160e;
                    pg.q.b(obj);
                    objC = obj;
                    b0Var = (c2.b0) objC;
                    b0Var.a();
                    t1.a aVar22 = t1.f30086a;
                    l2 l2VarC2 = ph.h.c(i0Var, null, ph.k0.f21556d, new i(x0Var, null), 1);
                    if (qVar != t1.f30086a) {
                    }
                    if (lVar2 != null) {
                    }
                    return aVar;
                case 2:
                    s1Var = (ph.s1) this.f30156a;
                    c2.c cVar5 = (c2.c) this.f30160e;
                    pg.q.b(obj);
                    cVar3 = cVar5;
                    objI = obj;
                    b0Var2 = (c2.b0) objI;
                    if (b0Var2 == null) {
                    }
                    if (b0Var2 != null) {
                    }
                    return pg.f0.f21461a;
                case 3:
                    s1Var = (ph.s1) this.f30157b;
                    c2.b0 b0Var6 = (c2.b0) this.f30156a;
                    c2.c cVar6 = (c2.c) this.f30160e;
                    pg.q.b(obj);
                    cVar2 = cVar6;
                    b0Var = b0Var6;
                    objH = obj;
                    d0Var = (d0) objH;
                    if (kotlin.jvm.internal.r.a(d0Var, d0.c.f29805a)) {
                    }
                    break;
                case 4:
                    s1Var2 = (ph.s1) this.f30160e;
                    pg.q.b(obj);
                    t1.g(i0Var, s1Var2, new b(x0Var, null));
                    return pg.f0.f21461a;
                case 5:
                    s1VarG = (ph.s1) this.f30157b;
                    b0Var2 = (c2.b0) this.f30156a;
                    cVar3 = (c2.c) this.f30160e;
                    pg.q.b(obj);
                    objZ = obj;
                    b0Var3 = (c2.b0) objZ;
                    if (b0Var3 != null) {
                    }
                    break;
                case 6:
                    b0Var4 = (c2.b0) this.f30156a;
                    s1VarC = (ph.s1) this.f30160e;
                    pg.q.b(obj);
                    objI2 = obj;
                    b0Var5 = (c2.b0) objI2;
                    if (b0Var5 != null) {
                    }
                    return pg.f0.f21461a;
                case 7:
                    c2.b0 b0Var7 = this.f30158c;
                    b0Var2 = (c2.b0) this.f30157b;
                    ph.s1 s1Var4 = (ph.s1) this.f30156a;
                    cVar4 = (c2.c) this.f30160e;
                    pg.q.b(obj);
                    b0Var3 = b0Var7;
                    s1VarC = s1Var4;
                    objH2 = obj;
                    d0Var2 = (d0) objH2;
                    if (kotlin.jvm.internal.r.a(d0Var2, d0.c.f29805a)) {
                    }
                    break;
                case 8:
                    s1Var3 = (ph.s1) this.f30160e;
                    pg.q.b(obj);
                    t1.g(i0Var, s1Var3, new j(x0Var, null));
                    return pg.f0.f21461a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z1(c2.j0 j0Var, eh.q<? super u0, ? super p1.c, ? super tg.e<? super pg.f0>, ? extends Object> qVar, eh.l<? super p1.c, pg.f0> lVar, eh.l<? super p1.c, pg.f0> lVar2, eh.l<? super p1.c, pg.f0> lVar3, tg.e<? super z1> eVar) {
        super(2, eVar);
        this.f30151c = j0Var;
        this.f30152d = qVar;
        this.f30153e = lVar;
        this.f30154f = lVar2;
        this.f30155g = (kotlin.jvm.internal.s) lVar3;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        z1 z1Var = new z1(this.f30151c, this.f30152d, this.f30153e, this.f30154f, this.f30155g, eVar);
        z1Var.f30150b = obj;
        return z1Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((z1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f30149a;
        if (i10 == 0) {
            pg.q.b(obj);
            ph.i0 i0Var = (ph.i0) this.f30150b;
            c2.j0 j0Var = this.f30151c;
            x0 x0Var = new x0(j0Var);
            a aVar2 = new a(i0Var, this.f30152d, this.f30153e, this.f30154f, this.f30155g, x0Var, null);
            this.f30149a = 1;
            if (c0.c(j0Var, aVar2, this) == aVar) {
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
