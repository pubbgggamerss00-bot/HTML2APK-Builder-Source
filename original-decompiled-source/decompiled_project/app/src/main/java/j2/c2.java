package j2;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c2 extends vg.i implements eh.p<y3, tg.e<?>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14678a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p<y3, tg.e<?>, Object> f14680c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d2 f14681d;

    public static final class a implements y3 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y3 f14682a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y3 f14683b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f14684c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d2 f14685d;

        public a(y3 y3Var, AtomicReference atomicReference, d2 d2Var) {
            this.f14683b = y3Var;
            this.f14684c = atomicReference;
            this.f14685d = d2Var;
            this.f14682a = y3Var;
        }

        @Override // j2.x3
        public final View a() {
            return this.f14682a.a();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // j2.x3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void b(k0.p1 p1Var, vg.c cVar) {
            z1 z1Var;
            if (cVar instanceof z1) {
                z1Var = (z1) cVar;
                int i10 = z1Var.f15011c;
                if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                    z1Var.f15011c = i10 - PKIFailureInfo.systemUnavail;
                } else {
                    z1Var = new z1(this, cVar);
                }
            }
            Object obj = z1Var.f15009a;
            ug.a aVar = ug.a.f29706a;
            int i11 = z1Var.f15011c;
            if (i11 == 0) {
                pg.q.b(obj);
                b2 b2Var = new b2(this.f14685d, p1Var, this.f14683b, null);
                z1Var.f15011c = 1;
                if (ph.j0.c(new j1.k(a2.f14644a, this.f14684c, b2Var, null), z1Var) == aVar) {
                    return;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            throw new pg.g();
        }

        @Override // ph.i0
        public final tg.h getCoroutineContext() {
            return this.f14682a.getCoroutineContext();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c2(eh.p<? super y3, ? super tg.e<?>, ? extends Object> pVar, d2 d2Var, tg.e<? super c2> eVar) {
        super(2, eVar);
        this.f14680c = pVar;
        this.f14681d = d2Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        c2 c2Var = new c2(this.f14680c, this.f14681d, eVar);
        c2Var.f14679b = obj;
        return c2Var;
    }

    @Override // eh.p
    public final Object invoke(y3 y3Var, tg.e<?> eVar) {
        ((c2) create(y3Var, eVar)).invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f14678a;
        if (i10 == 0) {
            pg.q.b(obj);
            a aVar2 = new a((y3) this.f14679b, new AtomicReference(null), this.f14681d);
            this.f14678a = 1;
            if (this.f14680c.invoke(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        throw new pg.g();
    }
}
