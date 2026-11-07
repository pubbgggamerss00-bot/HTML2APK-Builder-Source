package x8;

import android.os.SystemClock;
import com.yalantis.ucrop.view.CropImageView;
import f9.qg;
import x0.j;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final s.q0<Float> f32528a = s.m.b(new com.basitce.htmltoapk.data.apkgenerator.signer.d(1));

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeEntranceKt$rememberEntranceAnim$1$1", f = "HomeEntrance.kt", l = {41, 42}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f32529a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f32530b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f32531c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f32532d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s.b<Float, s.o> f32533e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, Long l10, int i10, s.b<Float, s.o> bVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f32530b = z10;
            this.f32531c = l10;
            this.f32532d = i10;
            this.f32533e = bVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f32530b, this.f32531c, this.f32532d, this.f32533e, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        
            if (s.b.c(r10.f32533e, r4, r5, null, r10, 12) == r0) goto L22;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Long l10;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f32529a;
            if (i10 == 0) {
                pg.q.b(obj);
                if (!this.f32530b || (l10 = this.f32531c) == null) {
                    return pg.f0.f21461a;
                }
                long jUptimeMillis = (this.f32532d * 200) - (SystemClock.uptimeMillis() - l10.longValue());
                if (jUptimeMillis > 0) {
                    this.f32529a = 1;
                    if (ph.t0.b(jUptimeMillis, this) != aVar) {
                    }
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                    return pg.f0.f21461a;
                }
                pg.q.b(obj);
            }
            Float f10 = new Float(1.0f);
            s.q0<Float> q0Var = e.f32528a;
            this.f32529a = 2;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, s.b<Float, s.o> anim) {
        kotlin.jvm.internal.r.e(dVar, "<this>");
        kotlin.jvm.internal.r.e(anim, "anim");
        return androidx.compose.ui.graphics.a.a(dVar, new qg(anim, 1));
    }

    public static final s.b<Float, s.o> b(Object obj, boolean z10, int i10, Long l10, x0.j jVar, int i11) {
        s.b<Float, s.o> bVar;
        jVar.L(-1989392674);
        jVar.L(1882792070);
        boolean zK = jVar.K(obj);
        Object objG = jVar.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (zK || objG == c0321a) {
            objG = Boolean.valueOf(z10 && (l10 == null || SystemClock.uptimeMillis() - l10.longValue() < 2000));
            jVar.C(objG);
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        jVar.B();
        jVar.L(1882797164);
        boolean zK2 = jVar.K(obj);
        Object objG2 = jVar.g();
        if (zK2 || objG2 == c0321a) {
            objG2 = s.d.a(zBooleanValue ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f);
            jVar.C(objG2);
        }
        s.b<Float, s.o> bVar2 = (s.b) objG2;
        jVar.B();
        jVar.L(1882800314);
        boolean zC = jVar.c(zBooleanValue) | jVar.K(l10) | ((((i11 & 896) ^ 384) > 256 && jVar.i(i10)) || (i11 & 384) == 256) | jVar.l(bVar2);
        Object objG3 = jVar.g();
        if (zC || objG3 == c0321a) {
            bVar = bVar2;
            a aVar = new a(zBooleanValue, l10, i10, bVar, null);
            jVar.C(aVar);
            objG3 = aVar;
        } else {
            bVar = bVar2;
        }
        jVar.B();
        x0.o0.e(obj, l10, (eh.p) objG3, jVar);
        jVar.B();
        return bVar;
    }
}
