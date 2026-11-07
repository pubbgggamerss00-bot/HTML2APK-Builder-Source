package u0;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@i5.e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k0 extends i5.a implements p5.p<w5.f<? super View>, g5.d<? super d5.j>, Object>, kotlin.jvm.internal.g<Object> {

    /* renamed from: t, reason: collision with root package name */
    public final int f14508t;

    /* renamed from: u, reason: collision with root package name */
    public int f14509u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f14510v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ View f14511w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(View view, g5.d<? super k0> dVar) {
        super(dVar);
        this.f14511w = view;
        if (dVar != null && dVar.getContext() != g5.g.s) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
        this.f14508t = 2;
    }

    @Override // i5.a
    public final g5.d a(g5.d dVar, Object obj) {
        k0 k0Var = new k0(this.f14511w, dVar);
        k0Var.f14510v = obj;
        return k0Var;
    }

    @Override // p5.p
    public final Object b(w5.f<? super View> fVar, g5.d<? super d5.j> dVar) {
        return ((k0) a(dVar, fVar)).d(d5.j.f12745a);
    }

    @Override // i5.a
    public final Object d(Object obj) throws Throwable {
        int i6 = this.f14509u;
        View view = this.f14511w;
        h5.a aVar = h5.a.s;
        if (i6 == 0) {
            d5.e.b(obj);
            w5.f fVar = (w5.f) this.f14510v;
            this.f14510v = fVar;
            this.f14509u = 1;
            fVar.a(view, this);
            return aVar;
        }
        d5.j jVar = d5.j.f12745a;
        if (i6 != 1) {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d5.e.b(obj);
            return jVar;
        }
        w5.f fVar2 = (w5.f) this.f14510v;
        d5.e.b(obj);
        if (view instanceof ViewGroup) {
            this.f14510v = null;
            this.f14509u = 2;
            fVar2.getClass();
            Object objB = fVar2.b(new y(new j0((ViewGroup) view), i0.s), this);
            if (objB != aVar) {
                objB = jVar;
            }
            if (objB == aVar) {
                return aVar;
            }
        }
        return jVar;
    }

    @Override // kotlin.jvm.internal.g
    public final int getArity() {
        return this.f14508t;
    }

    @Override // g5.d
    public final g5.f getContext() {
        return g5.g.s;
    }

    @Override // i5.a
    public final String toString() {
        if (this.s != null) {
            return super.toString();
        }
        kotlin.jvm.internal.q.f13553a.getClass();
        String strA = kotlin.jvm.internal.r.a(this);
        kotlin.jvm.internal.j.d("renderLambdaToString(...)", strA);
        return strA;
    }
}
