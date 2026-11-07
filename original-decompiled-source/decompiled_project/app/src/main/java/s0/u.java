package s0;

import com.yalantis.ucrop.view.CropImageView;
import i2.h0;
import java.util.ArrayList;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import pg.f0;
import ph.i0;
import q1.b1;
import qg.x;
import s.d0;
import s.m2;
import s1.a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24156a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.a<h> f24157b;

    /* renamed from: c, reason: collision with root package name */
    public final s.b<Float, s.o> f24158c = s.d.a(CropImageView.DEFAULT_ASPECT_RATIO);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24159d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public x.k f24160e;

    @vg.e(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {480}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24161a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f24163c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s.l<Float> f24164d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, s.l<Float> lVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f24163c = f10;
            this.f24164d = lVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return u.this.new a(this.f24163c, this.f24164d, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24161a;
            if (i10 == 0) {
                pg.q.b(obj);
                s.b<Float, s.o> bVar = u.this.f24158c;
                Float f10 = new Float(this.f24163c);
                this.f24161a = 1;
                if (s.b.c(bVar, f10, this.f24164d, null, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {484}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f24165a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s.l<Float> f24167c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s.l<Float> lVar, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f24167c = lVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return u.this.new b(this.f24167c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f24165a;
            if (i10 == 0) {
                pg.q.b(obj);
                s.b<Float, s.o> bVar = u.this.f24158c;
                Float f10 = new Float(CropImageView.DEFAULT_ASPECT_RATIO);
                this.f24165a = 1;
                if (s.b.c(bVar, f10, this.f24167c, null, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return f0.f21461a;
        }
    }

    public u(eh.a aVar, boolean z10) {
        this.f24156a = z10;
        this.f24157b = aVar;
    }

    public final void a(h0 h0Var, float f10, long j10) {
        s1.a aVar = h0Var.f13901a;
        float fFloatValue = this.f24158c.d().floatValue();
        if (fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO) {
            long jC = b1.c(fFloatValue, j10);
            if (!this.f24156a) {
                s1.e.f0(h0Var, jC, f10, 0L, null, 0, CdexHeaderItem.DEBUG_INFO_BASE);
                return;
            }
            float fD = p1.h.d(aVar.i());
            float fB = p1.h.b(aVar.i());
            a.b bVar = aVar.f24173b;
            long jD = bVar.d();
            bVar.a().d();
            try {
                bVar.f24180a.b(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, fD, fB, 1);
                s1.e.f0(h0Var, jC, f10, 0L, null, 0, CdexHeaderItem.DEBUG_INFO_BASE);
            } finally {
                t.r.a(bVar, jD);
            }
        }
    }

    public final void b(x.k kVar, i0 i0Var) {
        boolean z10 = kVar instanceof x.i;
        ArrayList arrayList = this.f24159d;
        if (z10) {
            arrayList.add(kVar);
        } else if (kVar instanceof x.j) {
            arrayList.remove(((x.j) kVar).f31596a);
        } else if (kVar instanceof x.e) {
            arrayList.add(kVar);
        } else if (kVar instanceof x.f) {
            arrayList.remove(((x.f) kVar).f31590a);
        } else if (kVar instanceof x.b) {
            arrayList.add(kVar);
        } else if (kVar instanceof x.c) {
            arrayList.remove(((x.c) kVar).f31584a);
        } else if (!(kVar instanceof x.a)) {
            return;
        } else {
            arrayList.remove(((x.a) kVar).f31583a);
        }
        x.k kVar2 = (x.k) x.K(arrayList);
        if (kotlin.jvm.internal.r.a(this.f24160e, kVar2)) {
            return;
        }
        if (kVar2 != null) {
            h hVarInvoke = this.f24157b.invoke();
            float f10 = z10 ? hVarInvoke.f24116c : kVar instanceof x.e ? hVarInvoke.f24115b : kVar instanceof x.b ? hVarInvoke.f24114a : CropImageView.DEFAULT_ASPECT_RATIO;
            m2<Float> m2Var = q.f24137a;
            if (!(kVar2 instanceof x.i) && ((kVar2 instanceof x.e) || (kVar2 instanceof x.b))) {
                m2Var = new m2<>(45, d0.f23706d, 2);
            }
            ph.h.c(i0Var, null, null, new a(f10, m2Var, null), 3);
        } else {
            x.k kVar3 = this.f24160e;
            m2<Float> m2Var2 = q.f24137a;
            if (!(kVar3 instanceof x.i) && !(kVar3 instanceof x.e) && (kVar3 instanceof x.b)) {
                m2Var2 = new m2<>(150, d0.f23706d, 2);
            }
            ph.h.c(i0Var, null, null, new b(m2Var2, null), 3);
        }
        this.f24160e = kVar2;
    }
}
