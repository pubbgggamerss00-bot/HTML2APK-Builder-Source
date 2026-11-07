package j9;

import android.os.SystemClock;
import androidx.lifecycle.l;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.eac.EACTags;
import s.m2;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.ShowcaseCarouselKt$ShowcaseCarousel$2$1", f = "ShowcaseCarousel.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f15420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.l f15421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0.b f15422c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f15424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f15425f;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.templates.ShowcaseCarouselKt$ShowcaseCarousel$2$1$1", f = "ShowcaseCarousel.kt", l = {48, EACTags.SEX}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public long f15426a;

        /* renamed from: b, reason: collision with root package name */
        public int f15427b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0.b f15428c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15429d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x0.n1 f15430e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x0.n1 f15431f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0.b bVar, ArrayList arrayList, x0.n1 n1Var, x0.n1 n1Var2, tg.e eVar) {
            super(2, eVar);
            this.f15428c = bVar;
            this.f15429d = arrayList;
            this.f15430e = n1Var;
            this.f15431f = n1Var2;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f15428c, this.f15429d, this.f15430e, this.f15431f, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        
            if (e0.d1.g(r13, r8, r1, r12, 2) == r0) goto L32;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0065 A[Catch: CancellationException -> 0x0015, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0015, blocks: (B:7:0x0010, B:26:0x0065, B:28:0x006e, B:30:0x0081, B:29:0x007b), top: B:42:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004b -> B:37:0x00a1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0059 -> B:37:0x00a1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0063 -> B:37:0x00a1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0092 -> B:37:0x00a1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009d -> B:37:0x00a1). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long jElapsedRealtime;
            long jElapsedRealtime2;
            e0.b bVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f15427b;
            if (i10 == 0) {
                pg.q.b(obj);
                jElapsedRealtime = 3000;
                if (!ph.v1.h(getContext())) {
                }
            } else if (i10 == 1) {
                pg.q.b(obj);
                jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (!((Boolean) this.f15430e.getValue()).booleanValue()) {
                    bVar = this.f15428c;
                    if (!bVar.f8153k.a()) {
                    }
                }
                jElapsedRealtime = 3000 - (SystemClock.elapsedRealtime() - jElapsedRealtime2);
                if (jElapsedRealtime < 0) {
                }
                if (!ph.v1.h(getContext())) {
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jElapsedRealtime2 = this.f15426a;
                try {
                    pg.q.b(obj);
                } catch (CancellationException e10) {
                    if (!ph.v1.h(getContext())) {
                        throw e10;
                    }
                }
                jElapsedRealtime = 3000 - (SystemClock.elapsedRealtime() - jElapsedRealtime2);
                if (jElapsedRealtime < 0) {
                    jElapsedRealtime = 0;
                }
                if (!ph.v1.h(getContext())) {
                    this.f15427b = 1;
                    if (ph.t0.b(jElapsedRealtime, this) != aVar) {
                        jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        if (!((Boolean) this.f15430e.getValue()).booleanValue() && !((Boolean) this.f15431f.getValue()).booleanValue()) {
                            bVar = this.f15428c;
                            if (!bVar.f8153k.a()) {
                                int size = bVar.j() == 2147483646 ? 1073741823 - (1073741823 % this.f15429d.size()) : bVar.j() + 1;
                                m2 m2VarD = s.m.d(600, 0, null, 6);
                                this.f15426a = jElapsedRealtime2;
                                this.f15427b = 2;
                            }
                        }
                        jElapsedRealtime = 3000 - (SystemClock.elapsedRealtime() - jElapsedRealtime2);
                        if (jElapsedRealtime < 0) {
                        }
                        if (!ph.v1.h(getContext())) {
                            return pg.f0.f21461a;
                        }
                    }
                    return aVar;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.lifecycle.l lVar, e0.b bVar, ArrayList arrayList, x0.n1 n1Var, x0.n1 n1Var2, tg.e eVar) {
        super(2, eVar);
        this.f15421b = lVar;
        this.f15422c = bVar;
        this.f15423d = arrayList;
        this.f15424e = n1Var;
        this.f15425f = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new i(this.f15421b, this.f15422c, this.f15423d, this.f15424e, this.f15425f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((i) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f15420a;
        if (i10 == 0) {
            pg.q.b(obj);
            l.b bVar = l.b.f2323e;
            a aVar2 = new a(this.f15422c, this.f15423d, this.f15424e, this.f15425f, null);
            this.f15420a = 1;
            if (androidx.lifecycle.i0.a(this.f15421b, bVar, aVar2, this) == aVar) {
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
