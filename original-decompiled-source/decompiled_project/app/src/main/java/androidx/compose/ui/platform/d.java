package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import c2.n0;
import com.yalantis.ucrop.view.CropImageView;
import eh.p;
import i2.u1;
import j2.i3;
import j2.p3;
import j2.s2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import pg.f0;
import q1.b0;
import q1.c2;
import q1.l2;
import q1.r1;
import q1.w0;
import q1.x0;
import q1.y1;
import q1.z1;

/* loaded from: classes.dex */
public final class d extends View implements u1 {

    /* renamed from: r, reason: collision with root package name */
    public static final b f1336r = b.f1357a;

    /* renamed from: s, reason: collision with root package name */
    public static final a f1337s = new a();

    /* renamed from: t, reason: collision with root package name */
    public static Method f1338t;

    /* renamed from: v, reason: collision with root package name */
    public static Field f1339v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f1340w;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f1341x;

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f1342a;

    /* renamed from: b, reason: collision with root package name */
    public final s2 f1343b;

    /* renamed from: c, reason: collision with root package name */
    public p<? super w0, ? super t1.d, f0> f1344c;

    /* renamed from: d, reason: collision with root package name */
    public eh.a<f0> f1345d;

    /* renamed from: e, reason: collision with root package name */
    public final p3 f1346e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1347f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f1348g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1349h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1350j;

    /* renamed from: k, reason: collision with root package name */
    public final x0 f1351k;

    /* renamed from: l, reason: collision with root package name */
    public final i3<View> f1352l;

    /* renamed from: m, reason: collision with root package name */
    public long f1353m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1354n;

    /* renamed from: p, reason: collision with root package name */
    public final long f1355p;

    /* renamed from: q, reason: collision with root package name */
    public int f1356q;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            r.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineB = ((d) view).f1346e.b();
            r.b(outlineB);
            outline.set(outlineB);
        }
    }

    public static final class b extends s implements p<View, Matrix, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1357a = new b(2);

        @Override // eh.p
        public final f0 invoke(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
            return f0.f21461a;
        }
    }

    public static final class c {
        public static void a(View view) {
            try {
                if (!d.f1340w) {
                    d.f1340w = true;
                    d.f1338t = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    d.f1339v = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    Method method = d.f1338t;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = d.f1339v;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = d.f1339v;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = d.f1338t;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                d.f1341x = true;
            }
        }
    }

    public d(AndroidComposeView androidComposeView, s2 s2Var, p<? super w0, ? super t1.d, f0> pVar, eh.a<f0> aVar) {
        super(androidComposeView.getContext());
        this.f1342a = androidComposeView;
        this.f1343b = s2Var;
        this.f1344c = pVar;
        this.f1345d = aVar;
        this.f1346e = new p3();
        this.f1351k = new x0();
        this.f1352l = new i3<>(f1336r);
        this.f1353m = l2.f21718b;
        this.f1354n = true;
        setWillNotDraw(false);
        s2Var.addView(this);
        this.f1355p = View.generateViewId();
    }

    private final q1.u1 getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        p3 p3Var = this.f1346e;
        if (!p3Var.f14852g) {
            return null;
        }
        p3Var.e();
        return p3Var.f14850e;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f1349h) {
            this.f1349h = z10;
            this.f1342a.U(this, z10);
        }
    }

    @Override // i2.u1
    public final void a(float[] fArr) {
        r1.e(fArr, this.f1352l.b(this));
    }

    @Override // i2.u1
    public final void b(w0 w0Var, t1.d dVar) {
        boolean z10 = getElevation() > CropImageView.DEFAULT_ASPECT_RATIO;
        this.f1350j = z10;
        if (z10) {
            w0Var.s();
        }
        this.f1343b.a(w0Var, this, getDrawingTime());
        if (this.f1350j) {
            w0Var.f();
        }
    }

    @Override // i2.u1
    public final boolean c(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j10));
        if (this.f1347f) {
            return CropImageView.DEFAULT_ASPECT_RATIO <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && CropImageView.DEFAULT_ASPECT_RATIO <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f1346e.c(j10);
        }
        return true;
    }

    @Override // i2.u1
    public final long d(long j10, boolean z10) {
        i3<View> i3Var = this.f1352l;
        if (!z10) {
            return !i3Var.f14767h ? r1.b(i3Var.b(this), j10) : j10;
        }
        float[] fArrA = i3Var.a(this);
        if (fArrA == null) {
            return 9187343241974906880L;
        }
        return !i3Var.f14767h ? r1.b(fArrA, j10) : j10;
    }

    @Override // i2.u1
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.f1342a;
        androidComposeView.I = true;
        this.f1344c = null;
        this.f1345d = null;
        androidComposeView.Y(this);
        this.f1343b.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        x0 x0Var = this.f1351k;
        b0 b0Var = x0Var.f21746a;
        Canvas canvas2 = b0Var.f21645a;
        b0Var.f21645a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            b0Var.d();
            this.f1346e.a(b0Var);
            z10 = true;
        }
        p<? super w0, ? super t1.d, f0> pVar = this.f1344c;
        if (pVar != null) {
            pVar.invoke(b0Var, null);
        }
        if (z10) {
            b0Var.o();
        }
        x0Var.f21746a.f21645a = canvas2;
        setInvalidated(false);
    }

    @Override // i2.u1
    public final void e(long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        if (i10 == getWidth() && i11 == getHeight()) {
            return;
        }
        setPivotX(l2.b(this.f1353m) * i10);
        setPivotY(l2.c(this.f1353m) * i11);
        setOutlineProvider(this.f1346e.b() != null ? f1337s : null);
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
        l();
        this.f1352l.c();
    }

    @Override // i2.u1
    public final void f(p<? super w0, ? super t1.d, f0> pVar, eh.a<f0> aVar) {
        this.f1343b.addView(this);
        i3<View> i3Var = this.f1352l;
        i3Var.f14764e = false;
        i3Var.f14765f = false;
        i3Var.f14767h = true;
        i3Var.f14766g = true;
        r1.d(i3Var.f14762c);
        r1.d(i3Var.f14763d);
        this.f1347f = false;
        this.f1350j = false;
        this.f1353m = l2.f21718b;
        this.f1344c = pVar;
        this.f1345d = aVar;
        setInvalidated(false);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // i2.u1
    public final void g(float[] fArr) {
        float[] fArrA = this.f1352l.a(this);
        if (fArrA != null) {
            r1.e(fArr, fArrA);
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final s2 getContainer() {
        return this.f1343b;
    }

    public long getLayerId() {
        return this.f1355p;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f1342a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f1342a.getUniqueDrawingId();
        }
        return -1L;
    }

    @Override // i2.u1
    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public float[] mo1getUnderlyingMatrixsQKQjiQ() {
        return this.f1352l.b(this);
    }

    @Override // i2.u1
    public final void h(c2 c2Var) {
        eh.a<f0> aVar;
        int i10 = c2Var.f21659a | this.f1356q;
        if ((i10 & 4096) != 0) {
            long j10 = c2Var.f21670m;
            this.f1353m = j10;
            setPivotX(l2.b(j10) * getWidth());
            setPivotY(l2.c(this.f1353m) * getHeight());
        }
        if ((i10 & 1) != 0) {
            setScaleX(c2Var.f21660b);
        }
        if ((i10 & 2) != 0) {
            setScaleY(c2Var.f21661c);
        }
        if ((i10 & 4) != 0) {
            setAlpha(c2Var.f21662d);
        }
        if ((i10 & 8) != 0) {
            setTranslationX(c2Var.f21663e);
        }
        if ((i10 & 16) != 0) {
            setTranslationY(c2Var.f21664f);
        }
        if ((i10 & 32) != 0) {
            setElevation(c2Var.f21665g);
        }
        if ((i10 & 1024) != 0) {
            setRotation(c2Var.f21668k);
        }
        if ((i10 & 256) != 0) {
            setRotationX(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        if ((i10 & 512) != 0) {
            setRotationY(CropImageView.DEFAULT_ASPECT_RATIO);
        }
        if ((i10 & 2048) != 0) {
            setCameraDistancePx(c2Var.f21669l);
        }
        boolean z10 = false;
        boolean z11 = getManualClipPath() != null;
        boolean z12 = c2Var.f21672p;
        y1.a aVar2 = y1.f21750a;
        boolean z13 = z12 && c2Var.f21671n != aVar2;
        if ((i10 & 24576) != 0) {
            this.f1347f = z12 && c2Var.f21671n == aVar2;
            l();
            setClipToOutline(z13);
        }
        boolean zD = this.f1346e.d(c2Var.f21678w, c2Var.f21662d, z13, c2Var.f21665g, c2Var.f21674r);
        p3 p3Var = this.f1346e;
        if (p3Var.f14851f) {
            setOutlineProvider(p3Var.b() != null ? f1337s : null);
        }
        boolean z14 = getManualClipPath() != null;
        if (z11 != z14 || (z14 && zD)) {
            invalidate();
        }
        if (!this.f1350j && getElevation() > CropImageView.DEFAULT_ASPECT_RATIO && (aVar = this.f1345d) != null) {
            aVar.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.f1352l.c();
        }
        int i11 = Build.VERSION.SDK_INT;
        if ((i10 & 64) != 0) {
            setOutlineAmbientShadowColor(n0.j(c2Var.f21666h));
        }
        if ((i10 & 128) != 0) {
            setOutlineSpotShadowColor(n0.j(c2Var.f21667j));
        }
        if (i11 >= 31 && (131072 & i10) != 0) {
            z1 z1Var = c2Var.f21677v;
            setRenderEffect(z1Var != null ? z1Var.a() : null);
        }
        if ((i10 & 32768) != 0) {
            int i12 = c2Var.f21673q;
            if (i12 == 1) {
                setLayerType(2, null);
            } else if (i12 == 2) {
                setLayerType(0, null);
                this.f1354n = z10;
            } else {
                setLayerType(0, null);
            }
            z10 = true;
            this.f1354n = z10;
        }
        this.f1356q = c2Var.f21659a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f1354n;
    }

    @Override // i2.u1
    public final void i(long j10) {
        int i10 = (int) (j10 >> 32);
        int left = getLeft();
        i3<View> i3Var = this.f1352l;
        if (i10 != left) {
            offsetLeftAndRight(i10 - getLeft());
            i3Var.c();
        }
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        if (i11 != getTop()) {
            offsetTopAndBottom(i11 - getTop());
            i3Var.c();
        }
    }

    @Override // android.view.View, i2.u1
    public final void invalidate() {
        if (this.f1349h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f1342a.invalidate();
    }

    @Override // i2.u1
    public final void j() {
        if (!this.f1349h || f1341x) {
            return;
        }
        c.a(this);
        setInvalidated(false);
    }

    @Override // i2.u1
    public final void k(p1.b bVar, boolean z10) {
        i3<View> i3Var = this.f1352l;
        if (!z10) {
            float[] fArrB = i3Var.b(this);
            if (i3Var.f14767h) {
                return;
            }
            r1.c(fArrB, bVar);
            return;
        }
        float[] fArrA = i3Var.a(this);
        if (fArrA != null) {
            if (i3Var.f14767h) {
                return;
            }
            r1.c(fArrA, bVar);
        } else {
            bVar.f21125a = CropImageView.DEFAULT_ASPECT_RATIO;
            bVar.f21126b = CropImageView.DEFAULT_ASPECT_RATIO;
            bVar.f21127c = CropImageView.DEFAULT_ASPECT_RATIO;
            bVar.f21128d = CropImageView.DEFAULT_ASPECT_RATIO;
        }
    }

    public final void l() {
        Rect rect;
        if (this.f1347f) {
            Rect rect2 = this.f1348g;
            if (rect2 == null) {
                this.f1348g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                r.b(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f1348g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }
}
