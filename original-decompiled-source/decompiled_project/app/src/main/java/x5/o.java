package x5;

import eh.p;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.eac.EACTags;
import pg.f0;
import pg.q;
import ph.i0;
import ph.k0;
import ph.l1;
import ph.u;
import ph.v;
import ph.w;
import tg.f;
import tg.h;

/* loaded from: classes.dex */
public final class o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @vg.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends vg.i implements p<i0, tg.e<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f32164a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vg.i f32165b;

        @vg.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        /* renamed from: x5.o$a$a, reason: collision with other inner class name */
        public static final class C0325a extends vg.i implements p<i0, tg.e<? super f0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f32166a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f32167b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f32168c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ vg.i f32169d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0325a(v vVar, p pVar, tg.e eVar) {
                super(2, eVar);
                this.f32168c = vVar;
                this.f32169d = (vg.i) pVar;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [eh.p, vg.i] */
            @Override // vg.a
            public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
                C0325a c0325a = new C0325a(this.f32168c, this.f32169d, eVar);
                c0325a.f32167b = obj;
                return c0325a;
            }

            @Override // eh.p
            public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
                return ((C0325a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
            /* JADX WARN: Type inference failed for: r3v0, types: [eh.p, vg.i] */
            @Override // vg.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u uVar;
                u uVar2;
                Throwable thA;
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f32166a;
                if (i10 == 0) {
                    q.b(obj);
                    i0 i0Var = (i0) this.f32167b;
                    v vVar = this.f32168c;
                    ?? r32 = this.f32169d;
                    try {
                        this.f32167b = vVar;
                        this.f32166a = 1;
                        obj = r32.invoke(i0Var, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        uVar2 = vVar;
                    } catch (Throwable th2) {
                        th = th2;
                        uVar = vVar;
                        obj = q.a(th);
                        uVar2 = uVar;
                        thA = pg.p.a(obj);
                        if (thA == null) {
                        }
                        return f0.f21461a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = (u) this.f32167b;
                    try {
                        q.b(obj);
                        uVar2 = uVar;
                    } catch (Throwable th3) {
                        th = th3;
                        obj = q.a(th);
                        uVar2 = uVar;
                        thA = pg.p.a(obj);
                        if (thA == null) {
                        }
                        return f0.f21461a;
                    }
                }
                thA = pg.p.a(obj);
                if (thA == null) {
                    uVar2.g0(obj);
                } else {
                    uVar2.d0(thA);
                }
                return f0.f21461a;
            }
        }

        @vg.e(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION}, m = "invokeSuspend")
        public static final class b extends vg.i implements p<i0, tg.e<? super T>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f32170a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f32171b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(v vVar, tg.e eVar) {
                super(2, eVar);
                this.f32171b = vVar;
            }

            @Override // vg.a
            public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
                return new b(this.f32171b, eVar);
            }

            @Override // eh.p
            public final Object invoke(i0 i0Var, Object obj) {
                return ((b) create(i0Var, (tg.e) obj)).invokeSuspend(f0.f21461a);
            }

            @Override // vg.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                ug.a aVar = ug.a.f29706a;
                int i10 = this.f32170a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                    return obj;
                }
                q.b(obj);
                this.f32170a = 1;
                Object objK = this.f32171b.k(this);
                return objK == aVar ? aVar : objK;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super i0, ? super tg.e<? super T>, ? extends Object> pVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f32165b = (vg.i) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [eh.p, vg.i] */
        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f32165b, eVar);
            aVar.f32164a = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, Object obj) {
            return ((a) create(i0Var, (tg.e) obj)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [eh.p, vg.i] */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            q.b(obj);
            h.a aVar2 = ((i0) this.f32164a).getCoroutineContext().get(f.a.f28767a);
            r.b(aVar2);
            tg.f fVar = (tg.f) aVar2;
            v vVarA = w.a();
            ph.h.b(l1.f21562a, fVar, k0.f21556d, new C0325a(vVarA, this.f32165b, null));
            while (!vVarA.isCompleted()) {
                try {
                    return ph.h.d(fVar, new b(vVarA, null));
                } catch (InterruptedException unused) {
                }
            }
            return vVarA.x();
        }
    }

    public static final <T> T a(p<? super i0, ? super tg.e<? super T>, ? extends Object> pVar) {
        Thread.interrupted();
        return (T) ph.h.d(tg.i.f28768a, new a(pVar, null));
    }
}
