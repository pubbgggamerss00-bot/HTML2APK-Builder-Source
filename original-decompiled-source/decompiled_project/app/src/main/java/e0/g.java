package e0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import v.t1;
import x0.x1;

/* loaded from: classes.dex */
public final class g implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f8181a;

    @vg.e(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {287}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8182a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c2.j0 f8183b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f8184c;

        @vg.e(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {289, 293}, m = "invokeSuspend")
        /* renamed from: e0.g$a$a, reason: collision with other inner class name */
        public static final class C0084a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public c2.b0 f8185a;

            /* renamed from: b, reason: collision with root package name */
            public c2.b0 f8186b;

            /* renamed from: c, reason: collision with root package name */
            public int f8187c;

            /* renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f8188d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f8189e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0084a(b bVar, tg.e eVar) {
                super(2, eVar);
                this.f8189e = bVar;
            }

            @Override // vg.a
            public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
                C0084a c0084a = new C0084a(this.f8189e, eVar);
                c0084a.f8188d = obj;
                return c0084a;
            }

            @Override // eh.p
            public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
                return ((C0084a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
            
                if (r12 == r1) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
            
                if (r12 == r1) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
            
                return r1;
             */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
            /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0062 -> B:18:0x0065). Please report as a decompilation issue!!! */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                c2.c cVar;
                c2.c cVar2;
                c2.b0 b0Var;
                c2.b0 b0Var2;
                x1 x1Var = this.f8189e.f8145c;
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f8187c;
                if (i10 == 0) {
                    pg.q.b(obj);
                    cVar = (c2.c) this.f8188d;
                    c2.t tVar = c2.t.f4694a;
                    this.f8188d = cVar;
                    this.f8187c = 1;
                    obj = t1.b(cVar, false, tVar, this);
                } else if (i10 == 1) {
                    cVar = (c2.c) this.f8188d;
                    pg.q.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b0Var = this.f8186b;
                    b0Var2 = this.f8185a;
                    cVar2 = (c2.c) this.f8188d;
                    pg.q.b(obj);
                    c2.r rVar = (c2.r) obj;
                    ?? r72 = rVar.f4687a;
                    int size = r72.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            b0Var = (c2.b0) rVar.f4687a.get(0);
                            break;
                        }
                        if (!c2.s.b((c2.b0) r72.get(i11))) {
                            break;
                        }
                        i11++;
                    }
                    if (b0Var == null) {
                        x1Var.setValue(new p1.c(p1.c.f(b0Var.f4595c, b0Var2.f4595c)));
                        return pg.f0.f21461a;
                    }
                    c2.t tVar2 = c2.t.f4694a;
                    this.f8188d = cVar2;
                    this.f8185a = b0Var2;
                    this.f8186b = b0Var;
                    this.f8187c = 2;
                    obj = cVar2.C1(tVar2, this);
                }
                x1Var.setValue(new p1.c(0L));
                cVar2 = cVar;
                b0Var = null;
                b0Var2 = (c2.b0) obj;
                if (b0Var == null) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c2.j0 j0Var, b bVar, tg.e eVar) {
            super(2, eVar);
            this.f8183b = j0Var;
            this.f8184c = bVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f8183b, this.f8184c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f8182a;
            if (i10 == 0) {
                pg.q.b(obj);
                C0084a c0084a = new C0084a(this.f8184c, null);
                this.f8182a = 1;
                if (v.c0.c(this.f8183b, c0084a, this) == aVar) {
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

    public g(b bVar) {
        this.f8181a = bVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        Object objC = ph.j0.c(new a(j0Var, this.f8181a, null), eVar);
        return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
    }
}
