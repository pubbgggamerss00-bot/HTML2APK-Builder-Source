package z6;

import eh.p;
import kotlin.jvm.internal.s;
import pg.f0;
import pg.q;
import rh.u;
import y6.b;

@vg.e(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends vg.i implements p<u<? super y6.b>, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f34768a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z6.b<Object> f34770c;

    /* renamed from: z6.a$a, reason: collision with other inner class name */
    public static final class C0355a extends s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z6.b<Object> f34771a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f34772b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0355a(z6.b<Object> bVar, b bVar2) {
            super(0);
            this.f34771a = bVar;
            this.f34772b = bVar2;
        }

        @Override // eh.a
        public final f0 invoke() {
            a7.i<Object> iVar = this.f34771a.f34775a;
            b bVar = this.f34772b;
            iVar.getClass();
            synchronized (iVar.f89c) {
                if (iVar.f90d.remove(bVar) && iVar.f90d.isEmpty()) {
                    iVar.d();
                }
            }
            return f0.f21461a;
        }
    }

    public static final class b implements y6.a<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z6.b<Object> f34773a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u<y6.b> f34774b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(z6.b<Object> bVar, u<? super y6.b> uVar) {
            this.f34773a = bVar;
            this.f34774b = uVar;
        }

        @Override // y6.a
        public final void a(Object obj) {
            z6.b<Object> bVar = this.f34773a;
            this.f34774b.E().g(bVar.e(obj) ? new b.C0345b(bVar.d()) : b.a.f33959a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z6.b<Object> bVar, tg.e<? super a> eVar) {
        super(2, eVar);
        this.f34770c = bVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        a aVar = new a(this.f34770c, eVar);
        aVar.f34769b = obj;
        return aVar;
    }

    @Override // eh.p
    public final Object invoke(u<? super y6.b> uVar, tg.e<? super f0> eVar) {
        return ((a) create(uVar, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f34768a;
        if (i10 == 0) {
            q.b(obj);
            u uVar = (u) this.f34769b;
            z6.b<Object> bVar = this.f34770c;
            b bVar2 = new b(bVar, uVar);
            a7.i<Object> iVar = bVar.f34775a;
            iVar.getClass();
            synchronized (iVar.f89c) {
                try {
                    if (iVar.f90d.add(bVar2)) {
                        if (iVar.f90d.size() == 1) {
                            iVar.f91e = iVar.a();
                            t6.s.d().a(a7.j.f92a, iVar.getClass().getSimpleName() + ": initial state = " + iVar.f91e);
                            iVar.c();
                        }
                        bVar2.a(iVar.f91e);
                    }
                    f0 f0Var = f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C0355a c0355a = new C0355a(this.f34770c, bVar2);
            this.f34768a = 1;
            if (rh.s.a(uVar, c0355a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
        }
        return f0.f21461a;
    }
}
