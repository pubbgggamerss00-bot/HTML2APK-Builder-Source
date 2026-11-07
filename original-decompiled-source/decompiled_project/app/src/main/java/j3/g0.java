package j3;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.UUID;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.x1;

/* loaded from: classes.dex */
public final class g0 extends j2.a {
    public static final a E = a.f15073a;
    public y A;
    public final x1 B;
    public boolean C;
    public final int[] D;

    /* renamed from: j, reason: collision with root package name */
    public eh.a<pg.f0> f15058j;

    /* renamed from: k, reason: collision with root package name */
    public p0 f15059k;

    /* renamed from: l, reason: collision with root package name */
    public String f15060l;

    /* renamed from: m, reason: collision with root package name */
    public final View f15061m;

    /* renamed from: n, reason: collision with root package name */
    public final n0 f15062n;

    /* renamed from: p, reason: collision with root package name */
    public final WindowManager f15063p;

    /* renamed from: q, reason: collision with root package name */
    public final WindowManager.LayoutParams f15064q;

    /* renamed from: r, reason: collision with root package name */
    public o0 f15065r;

    /* renamed from: s, reason: collision with root package name */
    public f3.r f15066s;

    /* renamed from: t, reason: collision with root package name */
    public final x1 f15067t;

    /* renamed from: v, reason: collision with root package name */
    public final x1 f15068v;

    /* renamed from: w, reason: collision with root package name */
    public f3.n f15069w;

    /* renamed from: x, reason: collision with root package name */
    public final x0.g0 f15070x;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f15071y;

    /* renamed from: z, reason: collision with root package name */
    public final h1.z f15072z;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g0, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15073a = new a(1);

        @Override // eh.l
        public final pg.f0 invoke(g0 g0Var) {
            g0 g0Var2 = g0Var;
            if (g0Var2.isAttachedToWindow()) {
                g0Var2.o();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.f0 f15074a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0 f15075b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f3.n f15076c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f15077d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f15078e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.f0 f0Var, g0 g0Var, f3.n nVar, long j10, long j11) {
            super(0);
            this.f15074a = f0Var;
            this.f15075b = g0Var;
            this.f15076c = nVar;
            this.f15077d = j10;
            this.f15078e = j11;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            g0 g0Var = this.f15075b;
            this.f15074a.f16326a = g0Var.getPositionProvider().a(this.f15076c, this.f15077d, g0Var.getParentLayoutDirection(), this.f15078e);
            return pg.f0.f21461a;
        }
    }

    public g0() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(eh.a aVar, p0 p0Var, String str, View view, f3.d dVar, o0 o0Var, UUID uuid) {
        super(view.getContext());
        n0 m0Var = Build.VERSION.SDK_INT >= 29 ? new m0() : new n0();
        this.f15058j = aVar;
        this.f15059k = p0Var;
        this.f15060l = str;
        this.f15061m = view;
        this.f15062n = m0Var;
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.r.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f15063p = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        p0 p0Var2 = this.f15059k;
        boolean zB = k.b(view);
        boolean z10 = p0Var2.f15103b;
        int i10 = p0Var2.f15102a;
        if (z10 && zB) {
            i10 |= 8192;
        } else if (z10 && !zB) {
            i10 &= -8193;
        }
        layoutParams.flags = i10;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f15064q = layoutParams;
        this.f15065r = o0Var;
        this.f15066s = f3.r.f8828a;
        this.f15067t = bg.b.h(null);
        this.f15068v = bg.b.h(null);
        this.f15070x = bg.b.d(new h0(this));
        this.f15071y = new Rect();
        this.f15072z = new h1.z(new j0(this));
        setId(android.R.id.content);
        c1.d(this, c1.c(view));
        setTag(R.id.view_tree_view_model_store_owner, d1.a(view));
        setTag(R.id.view_tree_saved_state_registry_owner, b6.c.d(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.N0((float) 8));
        setOutlineProvider(new f0());
        this.B = bg.b.h(b0.f15027a);
        this.D = new int[2];
    }

    private final eh.p<x0.j, Integer, pg.f0> getContent() {
        return (eh.p) this.B.getValue();
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g2.v getParentLayoutCoordinates() {
        return (g2.v) this.f15068v.getValue();
    }

    private final f3.n getVisibleDisplayBounds() {
        this.f15062n.getClass();
        View view = this.f15061m;
        Rect rect = this.f15071y;
        view.getWindowVisibleDisplayFrame(rect);
        x0.m0 m0Var = k.f15087a;
        return new f3.n(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        this.B.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(g2.v vVar) {
        this.f15068v.setValue(vVar);
    }

    @Override // j2.a
    public final void a(int i10, x0.j jVar) {
        jVar.L(-857613600);
        getContent().invoke(jVar, 0);
        jVar.B();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f15059k.f15104c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                eh.a<pg.f0> aVar = this.f15058j;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // j2.a
    public final void g(boolean z10, int i10, int i11, int i12, int i13) {
        super.g(z10, i10, i11, i12, i13);
        this.f15059k.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f15064q;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f15062n.getClass();
        this.f15063p.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f15070x.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f15064q;
    }

    public final f3.r getParentLayoutDirection() {
        return this.f15066s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final f3.p m87getPopupContentSizebOM6tXw() {
        return (f3.p) this.f15067t.getValue();
    }

    public final o0 getPositionProvider() {
        return this.f15065r;
    }

    @Override // j2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.C;
    }

    public j2.a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f15060l;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // j2.a
    public final void h(int i10, int i11) {
        this.f15059k.getClass();
        f3.n visibleDisplayBounds = getVisibleDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d(), PKIFailureInfo.systemUnavail), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), PKIFailureInfo.systemUnavail));
    }

    public final void k(x0.s sVar, eh.p<? super x0.j, ? super Integer, pg.f0> pVar) {
        setParentCompositionContext(sVar);
        setContent(pVar);
        this.C = true;
    }

    public final void l(eh.a<pg.f0> aVar, p0 p0Var, String str, f3.r rVar) {
        int i10;
        this.f15058j = aVar;
        this.f15060l = str;
        if (!kotlin.jvm.internal.r.a(this.f15059k, p0Var)) {
            p0Var.getClass();
            this.f15059k = p0Var;
            boolean zB = k.b(this.f15061m);
            boolean z10 = p0Var.f15103b;
            int i11 = p0Var.f15102a;
            if (z10 && zB) {
                i11 |= 8192;
            } else if (z10 && !zB) {
                i11 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f15064q;
            layoutParams.flags = i11;
            this.f15062n.getClass();
            this.f15063p.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = rVar.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new pg.l();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    public final void m() {
        g2.v parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.m()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA = parentLayoutCoordinates.a();
            long jB = parentLayoutCoordinates.B(0L);
            f3.n nVarA = f3.o.a((Math.round(Float.intBitsToFloat((int) (jB >> 32))) << 32) | (BodyPartID.bodyIdMax & Math.round(Float.intBitsToFloat((int) (jB & BodyPartID.bodyIdMax)))), jA);
            if (nVarA.equals(this.f15069w)) {
                return;
            }
            this.f15069w = nVarA;
            o();
        }
    }

    public final void n(g2.v vVar) {
        setParentLayoutCoordinates(vVar);
        m();
    }

    public final void o() {
        f3.p pVarM87getPopupContentSizebOM6tXw;
        f3.n nVar = this.f15069w;
        if (nVar == null || (pVarM87getPopupContentSizebOM6tXw = m87getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j10 = pVarM87getPopupContentSizebOM6tXw.f8826a;
        f3.n visibleDisplayBounds = getVisibleDisplayBounds();
        long jB = (visibleDisplayBounds.b() & BodyPartID.bodyIdMax) | (visibleDisplayBounds.d() << 32);
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f16326a = 0L;
        this.f15072z.d(this, E, new b(f0Var, this, nVar, jB, j10));
        long j11 = f0Var.f16326a;
        WindowManager.LayoutParams layoutParams = this.f15064q;
        layoutParams.x = (int) (j11 >> 32);
        layoutParams.y = (int) (j11 & BodyPartID.bodyIdMax);
        boolean z10 = this.f15059k.f15106e;
        n0 n0Var = this.f15062n;
        if (z10) {
            n0Var.a(this, (int) (jB >> 32), (int) (jB & BodyPartID.bodyIdMax));
        }
        n0Var.getClass();
        this.f15063p.updateViewLayout(this, layoutParams);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j3.y] */
    @Override // j2.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15072z.e();
        if (!this.f15059k.f15104c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.A == null) {
            final eh.a<pg.f0> aVar = this.f15058j;
            this.A = new OnBackInvokedCallback() { // from class: j3.y
                public final void onBackInvoked() {
                    eh.a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                }
            };
        }
        z.a(this, this.A);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h1.z zVar = this.f15072z;
        h1.g gVar = zVar.f12201h;
        if (gVar != null) {
            gVar.a();
        }
        zVar.b();
        if (Build.VERSION.SDK_INT >= 33) {
            z.b(this, this.A);
        }
        this.A = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f15059k.f15105d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < CropImageView.DEFAULT_ASPECT_RATIO || motionEvent.getX() >= getWidth() || motionEvent.getY() < CropImageView.DEFAULT_ASPECT_RATIO || motionEvent.getY() >= getHeight())) {
            eh.a<pg.f0> aVar = this.f15058j;
            if (aVar != null) {
                aVar.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            eh.a<pg.f0> aVar2 = this.f15058j;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(f3.r rVar) {
        this.f15066s = rVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m88setPopupContentSizefhxjrPA(f3.p pVar) {
        this.f15067t.setValue(pVar);
    }

    public final void setPositionProvider(o0 o0Var) {
        this.f15065r = o0Var;
    }

    public final void setTestTag(String str) {
        this.f15060l = str;
    }
}
