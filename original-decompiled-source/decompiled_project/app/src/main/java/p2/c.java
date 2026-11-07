package p2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import ph.e2;
import ph.i0;
import ph.l2;
import q1.x1;
import q2.t;
import x0.f1;

/* loaded from: classes.dex */
public final class c implements ScrollCaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final t f21144a;

    /* renamed from: b, reason: collision with root package name */
    public final f3.n f21145b;

    /* renamed from: c, reason: collision with root package name */
    public final a f21146c;

    /* renamed from: d, reason: collision with root package name */
    public final AndroidComposeView f21147d;

    /* renamed from: e, reason: collision with root package name */
    public final uh.c f21148e;

    /* renamed from: f, reason: collision with root package name */
    public final k f21149f;

    public interface a {
        void a();

        void b();
    }

    @vg.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {186}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21150a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Runnable f21152c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f21152c = runnable;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return c.this.new b(this.f21152c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f21150a;
            c cVar = c.this;
            if (i10 == 0) {
                pg.q.b(obj);
                k kVar = cVar.f21149f;
                this.f21150a = 1;
                Object objA = kVar.a(CropImageView.DEFAULT_ASPECT_RATIO - kVar.f21179c, this);
                if (objA != aVar) {
                    objA = f0.f21461a;
                }
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            cVar.f21146c.b();
            this.f21152c.run();
            return f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {119}, m = "invokeSuspend")
    /* renamed from: p2.c$c, reason: collision with other inner class name */
    public static final class C0244c extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21153a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ScrollCaptureSession f21155c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Rect f21156d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Consumer<Rect> f21157e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0244c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, tg.e<? super C0244c> eVar) {
            super(2, eVar);
            this.f21155c = scrollCaptureSession;
            this.f21156d = rect;
            this.f21157e = consumer;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return c.this.new C0244c(this.f21155c, this.f21156d, this.f21157e, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((C0244c) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f21153a;
            if (i10 == 0) {
                pg.q.b(obj);
                ScrollCaptureSession scrollCaptureSession = this.f21155c;
                Rect rect = this.f21156d;
                f3.n nVar = new f3.n(rect.left, rect.top, rect.right, rect.bottom);
                this.f21153a = 1;
                obj = c.a(c.this, scrollCaptureSession, nVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            this.f21157e.accept(x1.a((f3.n) obj));
            return f0.f21461a;
        }
    }

    public c(t tVar, f3.n nVar, uh.c cVar, a aVar, AndroidComposeView androidComposeView) {
        this.f21144a = tVar;
        this.f21145b = nVar;
        this.f21146c = aVar;
        this.f21147d = androidComposeView;
        this.f21148e = new uh.c(cVar.f29723a.plus(i.f21172a));
        this.f21149f = new k(nVar.b(), new f(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ScrollCaptureSession scrollCaptureSession, f3.n nVar, vg.c cVar2) {
        d dVar;
        int i10;
        int i11;
        Object objA;
        c cVar3;
        ScrollCaptureSession scrollCaptureSessionA;
        int i12;
        int i13;
        int iM;
        int iM2;
        if (cVar2 instanceof d) {
            dVar = (d) cVar2;
            int i14 = dVar.f21165h;
            if ((i14 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f21165h = i14 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(cVar, cVar2);
            }
        }
        Object obj = dVar.f21163f;
        ug.a aVar = ug.a.f29706a;
        int i15 = dVar.f21165h;
        if (i15 == 0) {
            pg.q.b(obj);
            i10 = nVar.f8823b;
            i11 = nVar.f8825d;
            k kVar = cVar.f21149f;
            dVar.f21158a = cVar;
            dVar.f21159b = scrollCaptureSession;
            dVar.f21160c = nVar;
            dVar.f21161d = i10;
            dVar.f21162e = i11;
            dVar.f21165h = 1;
            int i16 = kVar.f21177a;
            if (i10 > i11) {
                throw new IllegalArgumentException(e1.c.a(i10, i11, "Expected min=", " ≤ max=").toString());
            }
            int i17 = i11 - i10;
            if (i17 > i16) {
                throw new IllegalArgumentException(e1.c.a(i17, i16, "Expected range (", ") to be ≤ viewportSize=").toString());
            }
            float f10 = i10;
            float f11 = kVar.f21179c;
            if (f10 < f11 || i11 > i16 + f11) {
                objA = kVar.a((f10 < f11 ? i10 : i11 - i16) - f11, dVar);
                if (objA != aVar) {
                    objA = f0.f21461a;
                }
                if (objA != aVar) {
                    objA = f0.f21461a;
                }
            } else {
                objA = f0.f21461a;
            }
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = dVar.f21162e;
            i12 = dVar.f21161d;
            nVar = dVar.f21160c;
            scrollCaptureSessionA = p2.a.a(dVar.f21159b);
            cVar3 = dVar.f21158a;
            pg.q.b(obj);
            k kVar2 = cVar3.f21149f;
            iM = jh.j.m(i12 - gh.a.b(kVar2.f21179c), 0, kVar2.f21177a);
            k kVar3 = cVar3.f21149f;
            iM2 = jh.j.m(i13 - gh.a.b(kVar3.f21179c), 0, kVar3.f21177a);
            int i18 = nVar.f8822a;
            int i19 = nVar.f8824c;
            if (iM != iM2) {
                return f3.n.f8821e;
            }
            Canvas canvasLockHardwareCanvas = scrollCaptureSessionA.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i18, -iM);
                f3.n nVar2 = cVar3.f21145b;
                canvasLockHardwareCanvas.translate(-nVar2.f8822a, -nVar2.f8823b);
                cVar3.f21147d.getRootView().draw(canvasLockHardwareCanvas);
                scrollCaptureSessionA.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                int iB = gh.a.b(cVar3.f21149f.f21179c);
                return new f3.n(i18, iM + iB, i19, iM2 + iB);
            } catch (Throwable th2) {
                scrollCaptureSessionA.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th2;
            }
        }
        int i20 = dVar.f21162e;
        int i21 = dVar.f21161d;
        nVar = dVar.f21160c;
        ScrollCaptureSession scrollCaptureSessionA2 = p2.a.a(dVar.f21159b);
        c cVar4 = dVar.f21158a;
        pg.q.b(obj);
        i10 = i21;
        scrollCaptureSession = scrollCaptureSessionA2;
        i11 = i20;
        cVar = cVar4;
        dVar.f21158a = cVar;
        dVar.f21159b = scrollCaptureSession;
        dVar.f21160c = nVar;
        dVar.f21161d = i10;
        dVar.f21162e = i11;
        dVar.f21165h = 2;
        if (f1.a(dVar.getContext()).f0(e.f21166a, dVar) != aVar) {
            cVar3 = cVar;
            scrollCaptureSessionA = scrollCaptureSession;
            i12 = i10;
            i13 = i11;
            k kVar22 = cVar3.f21149f;
            iM = jh.j.m(i12 - gh.a.b(kVar22.f21179c), 0, kVar22.f21177a);
            k kVar32 = cVar3.f21149f;
            iM2 = jh.j.m(i13 - gh.a.b(kVar32.f21179c), 0, kVar32.f21177a);
            int i182 = nVar.f8822a;
            int i192 = nVar.f8824c;
            if (iM != iM2) {
            }
        }
        return aVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        ph.h.c(this.f21148e, e2.f21526b, null, new b(runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        final l2 l2VarC = ph.h.c(this.f21148e, null, null, new C0244c(scrollCaptureSession, rect, consumer, null), 3);
        l2VarC.invokeOnCompletion(new h(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: p2.g
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                l2VarC.cancel((CancellationException) null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(x1.a(this.f21145b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f21149f.f21179c = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f21146c.a();
        runnable.run();
    }
}
