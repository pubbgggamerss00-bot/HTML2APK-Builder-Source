package androidx.compose.ui.platform;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.d;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import c2.a0;
import c2.x;
import c2.z;
import com.google.protobuf.DescriptorProtos;
import com.yalantis.ucrop.view.CropImageView;
import f3.b;
import g2.c1;
import g2.g1;
import g2.h1;
import h1.z;
import i2.a1;
import i2.c;
import i2.d1;
import i2.e0;
import i2.f2;
import i2.g1;
import i2.i2;
import i2.j2;
import i2.k0;
import i2.u0;
import i2.v1;
import j2.a3;
import j2.a5;
import j2.b3;
import j2.f1;
import j2.g3;
import j2.i0;
import j2.j3;
import j2.k1;
import j2.k5;
import j2.l2;
import j2.m3;
import j2.m5;
import j2.n0;
import j2.n1;
import j2.o0;
import j2.o5;
import j2.p0;
import j2.p5;
import j2.q0;
import j2.q1;
import j2.q4;
import j2.q5;
import j2.r1;
import j2.s1;
import j2.s2;
import j2.t1;
import j2.u1;
import j2.w2;
import j2.w4;
import j2.x4;
import j2.y0;
import j2.z4;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import l1.b;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jf.dexlib2.dexbacked.raw.ItemType;
import p.h0;
import p.l0;
import p.r0;
import p.y;
import pg.f0;
import ph.j0;
import ph.m0;
import q1.b0;
import q1.d0;
import q1.w0;
import q1.x0;
import x0.g0;
import x0.x1;
import x2.f;
import y2.c0;
import y2.e0;

/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements v1, j2, c2.k, androidx.lifecycle.e {
    public static Class<?> J0;
    public static Method K0;
    public ArrayList A;
    public final h0<eh.a<f0>> A0;
    public boolean B;
    public final t B0;
    public boolean C;
    public final j2.p C0;
    public final c2.l D;
    public boolean D0;
    public final c2.f0 E;
    public final s E0;
    public eh.l<? super Configuration, f0> F;
    public final u1 F0;
    public final k1.b G;
    public boolean G0;
    public final k1.e H;
    public final p2.q H0;
    public boolean I;
    public final q I0;
    public final j2.k K;
    public final j2.j L;
    public final f2 M;
    public boolean N;
    public n1 O;
    public s2 P;
    public f3.b Q;
    public boolean R;
    public final u0 S;
    public long T;
    public final int[] U;
    public final float[] V;
    public final float[] W;

    /* renamed from: a, reason: collision with root package name */
    public long f1213a;

    /* renamed from: a0, reason: collision with root package name */
    public final float[] f1214a0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1215b;

    /* renamed from: b0, reason: collision with root package name */
    public long f1216b0;

    /* renamed from: c, reason: collision with root package name */
    public final i2.h0 f1217c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f1218c0;

    /* renamed from: d, reason: collision with root package name */
    public final x1 f1219d;

    /* renamed from: d0, reason: collision with root package name */
    public long f1220d0;

    /* renamed from: e, reason: collision with root package name */
    public final o1.u f1221e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1222e0;

    /* renamed from: f, reason: collision with root package name */
    public tg.h f1223f;

    /* renamed from: f0, reason: collision with root package name */
    public final x1 f1224f0;

    /* renamed from: g, reason: collision with root package name */
    public final m1.a f1225g;

    /* renamed from: g0, reason: collision with root package name */
    public final g0 f1226g0;

    /* renamed from: h, reason: collision with root package name */
    public final j3 f1227h;

    /* renamed from: h0, reason: collision with root package name */
    public eh.l<? super b, f0> f1228h0;

    /* renamed from: i0, reason: collision with root package name */
    public final j2.m f1229i0;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.compose.ui.d f1230j;

    /* renamed from: j0, reason: collision with root package name */
    public final j2.n f1231j0;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.compose.ui.d f1232k;

    /* renamed from: k0, reason: collision with root package name */
    public final j2.o f1233k0;

    /* renamed from: l, reason: collision with root package name */
    public final x0 f1234l;

    /* renamed from: l0, reason: collision with root package name */
    public final y2.g0 f1235l0;

    /* renamed from: m, reason: collision with root package name */
    public final k1 f1236m;

    /* renamed from: m0, reason: collision with root package name */
    public final e0 f1237m0;

    /* renamed from: n, reason: collision with root package name */
    public final i2.e0 f1238n;

    /* renamed from: n0, reason: collision with root package name */
    public final AtomicReference f1239n0;

    /* renamed from: o0, reason: collision with root package name */
    public final l2 f1240o0;

    /* renamed from: p, reason: collision with root package name */
    public final y<i2.e0> f1241p;

    /* renamed from: p0, reason: collision with root package name */
    public final y0 f1242p0;

    /* renamed from: q, reason: collision with root package name */
    public final r2.c f1243q;

    /* renamed from: q0, reason: collision with root package name */
    public final x1 f1244q0;

    /* renamed from: r, reason: collision with root package name */
    public final AndroidComposeView f1245r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1246r0;

    /* renamed from: s, reason: collision with root package name */
    public final q2.v f1247s;

    /* renamed from: s0, reason: collision with root package name */
    public final x1 f1248s0;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.compose.ui.platform.c f1249t;

    /* renamed from: t0, reason: collision with root package name */
    public final y1.b f1250t0;

    /* renamed from: u0, reason: collision with root package name */
    public final z1.c f1251u0;

    /* renamed from: v, reason: collision with root package name */
    public l1.b f1252v;

    /* renamed from: v0, reason: collision with root package name */
    public final h2.e f1253v0;

    /* renamed from: w, reason: collision with root package name */
    public final j2.i f1254w;

    /* renamed from: w0, reason: collision with root package name */
    public final f1 f1255w0;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f1256x;

    /* renamed from: x0, reason: collision with root package name */
    public MotionEvent f1257x0;

    /* renamed from: y, reason: collision with root package name */
    public final k1.l f1258y;

    /* renamed from: y0, reason: collision with root package name */
    public long f1259y0;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f1260z;

    /* renamed from: z0, reason: collision with root package name */
    public final o5<i2.u1> f1261z0;

    public static final class a {
        public static final boolean a() throws ClassNotFoundException {
            Class<?> cls = AndroidComposeView.J0;
            try {
                if (AndroidComposeView.J0 == null) {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.J0 = cls2;
                    AndroidComposeView.K0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.K0;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.t f1262a;

        /* renamed from: b, reason: collision with root package name */
        public final c6.e f1263b;

        public b(androidx.lifecycle.t tVar, c6.e eVar) {
            this.f1262a = tVar;
            this.f1263b = eVar;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<z1.a, Boolean> {
        public c() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(z1.a aVar) {
            int i10 = aVar.f34720a;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            boolean zRequestFocusFromTouch = true;
            if (i10 == 1) {
                zRequestFocusFromTouch = androidComposeView.isInTouchMode();
            } else if (i10 != 2) {
                zRequestFocusFromTouch = false;
            } else if (androidComposeView.isInTouchMode()) {
                zRequestFocusFromTouch = androidComposeView.requestFocusFromTouch();
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }
    }

    public static final class d extends kotlin.jvm.internal.s implements eh.l<Configuration, f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f1266a = new d(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ f0 invoke(Configuration configuration) {
            return f0.f21461a;
        }
    }

    public /* synthetic */ class e extends kotlin.jvm.internal.p implements eh.a<m2.b> {
        @Override // eh.a
        public final m2.b invoke() {
            ContentCaptureSession contentCaptureSessionA;
            View view = (View) this.receiver;
            q0.a aVar = q0.f14863a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                m2.d.a(view);
            }
            if (i10 < 29 || (contentCaptureSessionA = m2.c.a(view)) == null) {
                return null;
            }
            return new m2.b(contentCaptureSessionA, view);
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ KeyEvent f1268b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(KeyEvent keyEvent) {
            super(0);
            this.f1268b = keyEvent;
        }

        @Override // eh.a
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.f1268b));
        }
    }

    public /* synthetic */ class g extends kotlin.jvm.internal.p implements eh.q<m1.j, p1.h, eh.l<? super s1.e, ? extends f0>, Boolean> {
        @Override // eh.q
        public final Boolean b(m1.j jVar, p1.h hVar, eh.l<? super s1.e, ? extends f0> lVar) {
            AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
            Resources resources = androidComposeView.getContext().getResources();
            m1.b bVar = new m1.b(new f3.e(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), hVar.f21143a, lVar);
            return Boolean.valueOf(i0.f14749a.a(androidComposeView, jVar, bVar));
        }
    }

    public /* synthetic */ class h extends kotlin.jvm.internal.p implements eh.l<eh.a<? extends f0>, f0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // eh.l
        public final f0 invoke(eh.a<? extends f0> aVar) {
            ((AndroidComposeView) this.receiver).d(aVar);
            return f0.f21461a;
        }
    }

    public /* synthetic */ class i extends kotlin.jvm.internal.p implements eh.p<o1.e, p1.e, Boolean> {
        @Override // eh.p
        public final Boolean invoke(o1.e eVar, p1.e eVar2) {
            return Boolean.valueOf(AndroidComposeView.I((AndroidComposeView) this.receiver, eVar, eVar2));
        }
    }

    public /* synthetic */ class j extends kotlin.jvm.internal.p implements eh.l<o1.e, Boolean> {
        /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
        @Override // eh.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(o1.e eVar) {
            boolean zD;
            int i10 = eVar.f18860a;
            AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
            androidComposeView.getClass();
            if (i10 != 7 && i10 != 8) {
                Integer numE = o1.j.e(i10);
                if (numE == null) {
                    throw new IllegalStateException("Invalid focus direction");
                }
                int iIntValue = numE.intValue();
                p1.e eVarV = androidComposeView.V();
                Rect rectB = eVarV != null ? q1.x1.b(eVarV) : null;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View viewFindNextFocus = rectB == null ? focusFinder.findNextFocus(androidComposeView, androidComposeView.findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(androidComposeView, rectB, iIntValue);
                zD = viewFindNextFocus != null ? o1.j.d(viewFindNextFocus, Integer.valueOf(iIntValue), rectB) : false;
            }
            return Boolean.valueOf(zD);
        }
    }

    public /* synthetic */ class k extends kotlin.jvm.internal.p implements eh.a<f0> {
        @Override // eh.a
        public final f0 invoke() {
            AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
            if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
                androidComposeView.clearFocus();
            } else if (androidComposeView.hasFocus()) {
                View viewFindFocus = androidComposeView.findFocus();
                if (viewFindFocus != null) {
                    viewFindFocus.clearFocus();
                }
                androidComposeView.clearFocus();
            }
            return f0.f21461a;
        }
    }

    public /* synthetic */ class l extends kotlin.jvm.internal.p implements eh.a<p1.e> {
        @Override // eh.a
        public final p1.e invoke() {
            return ((AndroidComposeView) this.receiver).V();
        }
    }

    public /* synthetic */ class m extends kotlin.jvm.internal.u {
        @Override // kh.g
        public final Object get() {
            return ((AndroidComposeView) this.receiver).getLayoutDirection();
        }
    }

    public static final class n extends kotlin.jvm.internal.s implements eh.l<FocusTargetNode, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.g0<FocusTargetNode> f1269a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(kotlin.jvm.internal.g0<FocusTargetNode> g0Var) {
            super(1);
            this.f1269a = g0Var;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.ui.focus.FocusTargetNode] */
        @Override // eh.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f1269a.f16327a = focusTargetNode;
            return Boolean.TRUE;
        }
    }

    public static final class o extends kotlin.jvm.internal.s implements eh.l<a2.c, Boolean> {
        public o() {
            super(1);
        }

        @Override // eh.l
        public final Boolean invoke(a2.c cVar) {
            o1.e eVar;
            KeyEvent keyEvent = cVar.f17a;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            int[] iArr = androidComposeView.U;
            long jA = a2.d.a(keyEvent);
            if (a2.b.a(jA, a2.b.f9g)) {
                eVar = new o1.e(keyEvent.isShiftPressed() ? 2 : 1);
            } else if (a2.b.a(jA, a2.b.f7e)) {
                eVar = new o1.e(4);
            } else if (a2.b.a(jA, a2.b.f6d)) {
                eVar = new o1.e(3);
            } else {
                eVar = a2.b.a(jA, a2.b.f4b) ? true : a2.b.a(jA, a2.b.f13k) ? new o1.e(5) : a2.b.a(jA, a2.b.f5c) ? true : a2.b.a(jA, a2.b.f14l) ? new o1.e(6) : a2.b.a(jA, a2.b.f8f) ? true : a2.b.a(jA, a2.b.f11i) ? true : a2.b.a(jA, a2.b.f15m) ? new o1.e(7) : a2.b.a(jA, a2.b.f3a) ? true : a2.b.a(jA, a2.b.f12j) ? new o1.e(8) : null;
            }
            if (eVar != null) {
                int i10 = eVar.f18860a;
                if (a2.d.b(keyEvent) == 2) {
                    Integer numE = o1.j.e(i10);
                    p1.e eVarV = androidComposeView.V();
                    Boolean boolP = androidComposeView.getFocusOwner().p(i10, eVarV, new androidx.compose.ui.platform.b(eVar));
                    if (boolP != null ? boolP.booleanValue() : true) {
                        return Boolean.TRUE;
                    }
                    if (!(i10 == 1 || i10 == 2)) {
                        return Boolean.FALSE;
                    }
                    if (numE != null) {
                        int iIntValue = numE.intValue();
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View viewFindNextFocus = androidComposeView;
                        loop0: while (true) {
                            if (viewFindNextFocus == null) {
                                viewFindNextFocus = null;
                                break;
                            }
                            View rootView = androidComposeView.getRootView();
                            kotlin.jvm.internal.r.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, iIntValue);
                            if (viewFindNextFocus != null) {
                                q0.a aVar = q0.f14863a;
                                if (!viewFindNextFocus.equals(androidComposeView)) {
                                    for (ViewParent parent = viewFindNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                                        if (parent == androidComposeView) {
                                            break;
                                        }
                                    }
                                    break loop0;
                                }
                                break;
                            }
                        }
                        if (kotlin.jvm.internal.r.a(viewFindNextFocus, androidComposeView)) {
                            viewFindNextFocus = null;
                        }
                        if (viewFindNextFocus != null) {
                            Rect rectB = eVarV != null ? q1.x1.b(eVarV) : null;
                            if (rectB == null) {
                                throw new IllegalStateException("Invalid rect");
                            }
                            viewFindNextFocus.getLocationInWindow(iArr);
                            int i11 = iArr[0];
                            int i12 = iArr[1];
                            androidComposeView.getLocationInWindow(iArr);
                            rectB.offset(iArr[0] - i11, iArr[1] - i12);
                            if (o1.j.d(viewFindNextFocus, numE, rectB)) {
                                return Boolean.TRUE;
                            }
                        }
                    }
                    if (!androidComposeView.getFocusOwner().l(i10, false, false)) {
                        return Boolean.TRUE;
                    }
                    Boolean boolP2 = androidComposeView.getFocusOwner().p(i10, null, new androidx.compose.ui.platform.a(eVar));
                    return Boolean.valueOf(boolP2 != null ? boolP2.booleanValue() : true);
                }
            }
            return Boolean.FALSE;
        }
    }

    public static final class p extends kotlin.jvm.internal.s implements eh.a<f3.p> {
        public p() {
            super(0);
        }

        @Override // eh.a
        public final f3.p invoke() {
            Activity activity;
            int iRound;
            long j10;
            Context context = AndroidComposeView.this.getContext();
            Context baseContext = context;
            while (true) {
                if (!(baseContext instanceof Activity)) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                } else {
                    activity = (Activity) baseContext;
                    break;
                }
            }
            if (activity != null) {
                int i10 = Build.VERSION.SDK_INT;
                Rect rectA = (i10 >= 30 ? s1.f14893a : i10 >= 29 ? r1.f14888a : q1.f14865a).a(activity);
                int iWidth = rectA.width();
                iRound = rectA.height();
                j10 = iWidth;
            } else {
                Configuration configuration = context.getResources().getConfiguration();
                float f10 = context.getResources().getDisplayMetrics().density;
                int iRound2 = Math.round(configuration.screenWidthDp * f10);
                iRound = Math.round(configuration.screenHeightDp * f10);
                j10 = iRound2;
            }
            return new f3.p((iRound & BodyPartID.bodyIdMax) | (j10 << 32));
        }
    }

    public static final class q implements z {

        /* renamed from: a, reason: collision with root package name */
        public x f1272a;

        public q() {
            x.f4707a.getClass();
        }

        @Override // c2.z
        public final x a() {
            return this.f1272a;
        }

        @Override // c2.z
        public final void b(x xVar) {
            if (xVar == null) {
                x.f4707a.getClass();
                xVar = a0.f4590a;
            }
            o0.f14837a.a(AndroidComposeView.this, xVar);
        }

        @Override // c2.z
        public final void c(x xVar) {
            this.f1272a = xVar;
        }
    }

    public static final class r extends kotlin.jvm.internal.s implements eh.l<FocusTargetNode, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1274a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(int i10) {
            super(1);
            this.f1274a = i10;
        }

        @Override // eh.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.H(this.f1274a));
        }
    }

    public static final class s extends kotlin.jvm.internal.s implements eh.a<f0> {
        public s() {
            super(0);
        }

        @Override // eh.a
        public final f0 invoke() {
            int actionMasked;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            MotionEvent motionEvent = androidComposeView.f1257x0;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                androidComposeView.f1259y0 = SystemClock.uptimeMillis();
                androidComposeView.post(androidComposeView.B0);
            }
            return f0.f21461a;
        }
    }

    public static final class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            androidComposeView.removeCallbacks(this);
            MotionEvent motionEvent = androidComposeView.f1257x0;
            if (motionEvent != null) {
                boolean z10 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z10) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i10 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i10 = 2;
                }
                AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                androidComposeView2.b0(motionEvent, i10, androidComposeView2.f1259y0, false);
            }
        }
    }

    public static final class u extends kotlin.jvm.internal.s implements eh.l<e2.c, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final u f1277a = new u(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ Boolean invoke(e2.c cVar) {
            return Boolean.FALSE;
        }
    }

    public static final class v extends kotlin.jvm.internal.s implements eh.l<eh.a<? extends f0>, f0> {
        public v() {
            super(1);
        }

        @Override // eh.l
        public final f0 invoke(eh.a<? extends f0> aVar) {
            final eh.a<? extends f0> aVar2 = aVar;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            Handler handler = androidComposeView.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar2.invoke();
            } else {
                Handler handler2 = androidComposeView.getHandler();
                if (handler2 != null) {
                    handler2.post(new Runnable() { // from class: j2.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            aVar2.invoke();
                        }
                    });
                }
            }
            return f0.f21461a;
        }
    }

    public static final class w extends kotlin.jvm.internal.s implements eh.a<b> {
        public w() {
            super(0);
        }

        @Override // eh.a
        public final b invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: Type inference failed for: r4v18, types: [j2.m] */
    /* JADX WARN: Type inference failed for: r4v19, types: [j2.n] */
    /* JADX WARN: Type inference failed for: r4v20, types: [j2.o] */
    public AndroidComposeView(Context context, tg.h hVar) {
        super(context);
        this.f1213a = 9205357640488583168L;
        this.f1215b = true;
        this.f1217c = new i2.h0();
        f3.g gVarA = f3.a.a(context);
        x0.s2 s2Var = x0.s2.f31913a;
        this.f1219d = new x1(gVarA, s2Var);
        q2.f fVar = new q2.f();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(fVar);
        a1<t1> a1Var = new a1<t1>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // i2.a1
            public final d.c a() {
                t1 t1Var = new t1();
                t1Var.f14901q = this.f1264b;
                return t1Var;
            }

            @Override // i2.a1
            public final void b(d.c cVar) {
                ((t1) cVar).f14901q = this.f1264b;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f1264b.hashCode();
            }
        };
        this.f1221e = new o1.u(new h(1, this, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0), new i(2, this, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0), new j(1, this, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0), new k(0, this, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0), new l(0, this, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0), new m(this, AndroidComposeView.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        this.f1223f = hVar;
        this.f1225g = new m1.a(new g(3, this, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0));
        this.f1227h = new j3();
        androidx.compose.ui.d dVarA = androidx.compose.ui.input.key.a.a(d.a.f1143b, new o());
        this.f1230j = dVarA;
        androidx.compose.ui.d dVarA2 = androidx.compose.ui.input.rotary.a.a(u.f1277a);
        this.f1232k = dVarA2;
        this.f1234l = new x0();
        this.f1236m = new k1(ViewConfiguration.get(context));
        i2.e0 e0Var = new i2.e0(3);
        e0Var.l(g2.k1.f11401b);
        e0Var.i0(getDensity());
        e0Var.k0(getViewConfiguration());
        e0Var.c(emptySemanticsElement.h(dVarA2).h(dVarA).h(getFocusOwner().c()).h(getDragAndDropManager().f17615c).h(a1Var));
        this.f1238n = e0Var;
        y yVar = p.j.f20648a;
        this.f1241p = new y<>();
        getLayoutNodes();
        this.f1243q = new r2.c();
        this.f1245r = this;
        this.f1247s = new q2.v(getRoot(), fVar, getLayoutNodes());
        androidx.compose.ui.platform.c cVar = new androidx.compose.ui.platform.c(this);
        this.f1249t = cVar;
        this.f1252v = new l1.b(this, new e(0, this, q0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1));
        this.f1254w = new j2.i(context);
        this.f1256x = new d0(this);
        this.f1258y = new k1.l();
        this.f1260z = new ArrayList();
        this.D = new c2.l();
        this.E = new c2.f0(getRoot());
        this.F = d.f1266a;
        this.G = new k1.b(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw k1.a.a("Autofill service could not be located.");
        }
        this.H = new k1.e(new k1.p(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.K = new j2.k(context);
        this.L = new j2.j(getClipboardManager());
        this.M = new f2(new v());
        this.S = new u0(getRoot());
        long j10 = Integer.MAX_VALUE;
        this.T = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
        this.U = new int[]{0, 0};
        float[] fArrA = q1.r1.a();
        this.V = fArrA;
        this.W = q1.r1.a();
        this.f1214a0 = q1.r1.a();
        this.f1216b0 = -1L;
        this.f1220d0 = 9187343241974906880L;
        this.f1222e0 = true;
        this.f1224f0 = bg.b.h(null);
        this.f1226g0 = bg.b.d(new w());
        this.f1229i0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: j2.m
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f14828a.c0();
            }
        };
        this.f1231j0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: j2.n
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f14830a.c0();
            }
        };
        this.f1233k0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: j2.o
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                this.f14836a.f1251u0.f34721a.setValue(new z1.a(z10 ? 1 : 2));
            }
        };
        y2.g0 g0Var = new y2.g0(getView(), this);
        this.f1235l0 = g0Var;
        q0.f14863a.getClass();
        this.f1237m0 = new e0(g0Var);
        this.f1239n0 = new AtomicReference(null);
        this.f1240o0 = new l2(getTextInputService());
        this.f1242p0 = new y0();
        this.f1244q0 = new x1(x2.k.a(context), s2Var);
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = Build.VERSION.SDK_INT;
        this.f1246r0 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        f3.r rVar = layoutDirection != 0 ? layoutDirection != 1 ? null : f3.r.f8829b : f3.r.f8828a;
        this.f1248s0 = bg.b.h(rVar == null ? f3.r.f8828a : rVar);
        this.f1250t0 = new y1.b(this);
        this.f1251u0 = new z1.c(isInTouchMode() ? 1 : 2, new c());
        this.f1253v0 = new h2.e(this);
        this.f1255w0 = new f1(this);
        this.f1261z0 = new o5<>();
        this.A0 = new h0<>(qVar);
        this.B0 = new t();
        this.C0 = new j2.p(this);
        this.E0 = new s();
        this.F0 = i10 < 29 ? new j2.v1(fArrA) : new j2.x1();
        addOnAttachStateChangeListener(this.f1252v);
        setWillNotDraw(false);
        setFocusable(true);
        p0.f14842a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        y3.q0.h(this, cVar);
        setOnDragListener(getDragAndDropManager());
        getRoot().o(this);
        if (i10 >= 29) {
            j2.h0.f14728a.a(this);
        }
        this.H0 = i10 >= 31 ? new p2.q() : null;
        this.I0 = new q();
    }

    public static final void E(AndroidComposeView androidComposeView, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        androidx.compose.ui.platform.c cVar = androidComposeView.f1249t;
        if (kotlin.jvm.internal.r.a(str, cVar.G)) {
            int iD2 = cVar.E.d(i10);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.r.a(str, cVar.H) || (iD = cVar.F.d(i10)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public static final boolean I(AndroidComposeView androidComposeView, o1.e eVar, p1.e eVar2) {
        Integer numE;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            return true;
        }
        return super.requestFocus((eVar == null || (numE = o1.j.e(eVar.f18860a)) == null) ? 130 : numE.intValue(), eVar2 != null ? q1.x1.b(eVar2) : null);
    }

    public static void J(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).u();
            } else if (childAt instanceof ViewGroup) {
                J((ViewGroup) childAt);
            }
        }
    }

    public static long K(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j10 = size;
        return j10 | (j10 << 32);
    }

    public static View L(View view, int i10) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.r.a(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View viewL = L(viewGroup.getChildAt(i11), i10);
                    if (viewL != null) {
                        return viewL;
                    }
                }
            }
        }
        return null;
    }

    public static void P(i2.e0 e0Var) {
        e0Var.N();
        z0.b<i2.e0> bVarJ = e0Var.J();
        i2.e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            P(e0VarArr[i11]);
        }
    }

    public static boolean R(MotionEvent motionEvent) {
        boolean z10 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                z10 = (Float.floatToRawIntBits(motionEvent.getX(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !m3.f14829a.a(motionEvent, i10));
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    @pg.d
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @pg.d
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final b get_viewTreeOwners() {
        return (b) this.f1224f0.getValue();
    }

    private void setDensity(f3.d dVar) {
        this.f1219d.setValue(dVar);
    }

    private void setFontFamilyResolver(f.a aVar) {
        this.f1244q0.setValue(aVar);
    }

    private void setLayoutDirection(f3.r rVar) {
        this.f1248s0.setValue(rVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.f1224f0.setValue(bVar);
    }

    @Override // c2.p0
    public final long A(long j10) {
        W();
        long jB = q1.r1.b(this.W, j10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f1220d0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f1220d0 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (jB & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // i2.v1
    public final void B(i2.e0 e0Var, boolean z10) {
        this.S.f(e0Var, z10);
    }

    @Override // i2.v1
    public final void C(i2.e0 e0Var) {
        k1.e eVar = this.H;
        if (eVar != null) {
            eVar.f15925d.f23146a.b(e0Var.f13810b, new k1.d(eVar, e0Var));
        }
    }

    @Override // i2.v1
    public final void D() {
        this.C = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int O(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        AndroidComposeView androidComposeView;
        removeCallbacks(this.B0);
        try {
            X(motionEvent);
            this.f1218c0 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.f1257x0;
                boolean z10 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                c2.f0 f0Var = this.E;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!f0Var.f4643e) {
                                f0Var.f4641c.f4608a.a();
                                f0Var.f4640b.c();
                            }
                        } else if (motionEvent3.getActionMasked() != 10 && z10) {
                            b0(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z11 = motionEvent.getToolType(0) == 3;
                if (z10 || !z11 || actionMasked2 == 3 || actionMasked2 == 9 || !S(motionEvent)) {
                    androidComposeView = this;
                } else {
                    androidComposeView = this;
                    androidComposeView.b0(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = androidComposeView.f1257x0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = androidComposeView.f1257x0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    c2.l lVar = androidComposeView.D;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            lVar.f4669c.delete(pointerId);
                            lVar.f4668b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = androidComposeView.f1257x0;
                        float x10 = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = androidComposeView.f1257x0;
                        boolean z12 = (x10 == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = androidComposeView.f1257x0;
                        boolean z13 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z12 || z13) {
                            if (pointerId >= 0) {
                                lVar.f4669c.delete(pointerId);
                                lVar.f4668b.delete(pointerId);
                            }
                            c2.f fVar = f0Var.f4640b;
                            if (fVar.f4632d) {
                                fVar.f4632d = true;
                            } else {
                                fVar.f4635g.f4684a.g();
                            }
                        }
                    }
                }
                androidComposeView.f1257x0 = MotionEvent.obtainNoHistory(motionEvent);
                int iA0 = a0(motionEvent);
                Trace.endSection();
                androidComposeView.f1218c0 = false;
                return iA0;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            this.f1218c0 = false;
            throw th4;
        }
    }

    public final void Q(i2.e0 e0Var) {
        this.S.p(e0Var, false);
        z0.b<i2.e0> bVarJ = e0Var.J();
        i2.e0[] e0VarArr = bVarJ.f34700a;
        int i10 = bVarJ.f34702c;
        for (int i11 = 0; i11 < i10; i11++) {
            Q(e0VarArr[i11]);
        }
    }

    public final boolean S(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return CropImageView.DEFAULT_ASPECT_RATIO <= x10 && x10 <= ((float) getWidth()) && CropImageView.DEFAULT_ASPECT_RATIO <= y10 && y10 <= ((float) getHeight());
    }

    public final boolean T(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f1257x0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void U(i2.u1 u1Var, boolean z10) {
        ArrayList arrayList = this.f1260z;
        if (!z10) {
            if (this.B) {
                return;
            }
            arrayList.remove(u1Var);
            ArrayList arrayList2 = this.A;
            if (arrayList2 != null) {
                arrayList2.remove(u1Var);
                return;
            }
            return;
        }
        if (!this.B) {
            arrayList.add(u1Var);
            return;
        }
        ArrayList arrayList3 = this.A;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.A = arrayList3;
        }
        arrayList3.add(u1Var);
    }

    public final p1.e V() {
        if (isFocused()) {
            return getFocusOwner().k();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return o1.j.b(viewFindFocus, this);
        }
        return null;
    }

    public final void W() {
        if (this.f1218c0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f1216b0) {
            this.f1216b0 = jCurrentAnimationTimeMillis;
            u1 u1Var = this.F0;
            float[] fArr = this.W;
            u1Var.a(this, fArr);
            g3.a(fArr, this.f1214a0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.U;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            float f12 = iArr[0];
            float f13 = f11 - iArr[1];
            this.f1220d0 = (Float.floatToRawIntBits(f10 - f12) << 32) | (Float.floatToRawIntBits(f13) & BodyPartID.bodyIdMax);
        }
    }

    public final void X(MotionEvent motionEvent) {
        this.f1216b0 = AnimationUtils.currentAnimationTimeMillis();
        u1 u1Var = this.F0;
        float[] fArr = this.W;
        u1Var.a(this, fArr);
        g3.a(fArr, this.f1214a0);
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long jB = q1.r1.b(fArr, (Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & BodyPartID.bodyIdMax));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & BodyPartID.bodyIdMax));
        this.f1220d0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & BodyPartID.bodyIdMax);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(i2.u1 u1Var) {
        o5<i2.u1> o5Var;
        z0.b<Reference<i2.u1>> bVar;
        Reference<? extends i2.u1> referencePoll;
        if (this.P != null) {
            d.b bVar2 = androidx.compose.ui.platform.d.f1336r;
        }
        do {
            o5Var = this.f1261z0;
            ReferenceQueue<i2.u1> referenceQueue = o5Var.f14840b;
            bVar = o5Var.f14839a;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                bVar.j(referencePoll);
            }
        } while (referencePoll != null);
        bVar.b(new WeakReference(u1Var, o5Var.f14840b));
        this.f1260z.remove(u1Var);
    }

    public final void Z(i2.e0 e0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (e0Var != null) {
            while (e0Var != null && e0Var.K.f13929p.f14053m == e0.f.f13840a) {
                if (!this.R) {
                    i2.e0 e0VarG = e0Var.G();
                    if (e0VarG == null) {
                        break;
                    }
                    long j10 = e0VarG.I.f13790b.f11385d;
                    if (f3.b.g(j10) && f3.b.f(j10)) {
                        break;
                    }
                }
                e0Var = e0Var.G();
            }
            if (e0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    @Override // i2.v1
    public final void a(boolean z10) {
        s sVar;
        u0 u0Var = this.S;
        if (u0Var.f14032b.b() || ((z0.b) u0Var.f14035e.f14016a).f34702c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    sVar = this.E0;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                sVar = null;
            }
            if (u0Var.j(sVar)) {
                requestLayout();
            }
            u0Var.a(false);
            if (this.C) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.C = false;
            }
            f0 f0Var = f0.f21461a;
            Trace.endSection();
        }
    }

    public final int a0(MotionEvent motionEvent) {
        c2.e0 e0Var;
        if (this.G0) {
            this.G0 = false;
            int metaState = motionEvent.getMetaState();
            this.f1227h.getClass();
            q5.f14884a.setValue(new c2.o0(metaState));
        }
        c2.l lVar = this.D;
        c2.d0 d0VarA = lVar.a(motionEvent, this);
        c2.f0 f0Var = this.E;
        if (d0VarA == null) {
            if (!f0Var.f4643e) {
                f0Var.f4641c.f4608a.a();
                f0Var.f4640b.c();
            }
            return 0;
        }
        List<c2.e0> list = d0VarA.f4613a;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                e0Var = list.get(size);
                if (e0Var.f4622e) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
            e0Var = null;
        } else {
            e0Var = null;
        }
        c2.e0 e0Var2 = e0Var;
        if (e0Var2 != null) {
            this.f1213a = e0Var2.f4621d;
        }
        int iA = f0Var.a(d0VarA, this, S(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iA & 1) != 0) {
            return iA;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        lVar.f4669c.delete(pointerId);
        lVar.f4668b.delete(pointerId);
        return iA;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> sparseArray) {
        q2.l lVarE;
        q2.a aVar;
        eh.l lVar;
        k1.e eVar = this.H;
        if (eVar != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                AutofillValue autofillValue = sparseArray.get(iKeyAt);
                if (autofillValue.isText()) {
                    i2.e0 e0VarB = eVar.f15923b.f21818c.b(iKeyAt);
                    if (e0VarB != null && (lVarE = e0VarB.e()) != null && (aVar = (q2.a) q2.m.a(lVarE, q2.k.f21779g)) != null && (lVar = (eh.l) aVar.f21753b) != null) {
                    }
                } else if (autofillValue.isDate()) {
                    Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                } else if (autofillValue.isList()) {
                    Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                } else if (autofillValue.isToggle()) {
                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                }
            }
        }
        k1.b bVar = this.G;
        if (bVar != null) {
            k1.l lVar2 = bVar.f15915b;
            if (lVar2.f15933a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                int iKeyAt2 = sparseArray.keyAt(i11);
                AutofillValue autofillValue2 = sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                } else {
                    if (autofillValue2.isDate()) {
                        throw new pg.m("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new pg.m("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new pg.m("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // i2.v1
    public final void b(i2.e0 e0Var) {
        ((z0.b) this.S.f14035e.f14016a).b(e0Var);
        e0Var.S = true;
        Z(null);
    }

    public final void b0(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f10 = pointerCoords.x;
            long jA = A((Float.floatToRawIntBits(pointerCoords.y) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jA >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jA & BodyPartID.bodyIdMax));
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        c2.d0 d0VarA = this.D.a(motionEventObtain, this);
        kotlin.jvm.internal.r.b(d0VarA);
        this.E.a(d0VarA, this, true);
        motionEventObtain.recycle();
    }

    @Override // i2.v1
    public final void c(int i10, i2.e0 e0Var) {
        getLayoutNodes().g(i10);
        getLayoutNodes().h(e0Var.f13810b, e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        boolean z10;
        boolean z11;
        int[] iArr = this.U;
        getLocationOnScreen(iArr);
        long j10 = this.T;
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        int i12 = iArr[0];
        if (i10 != i12 || i11 != iArr[1] || this.f1216b0 < 0) {
            this.T = (BodyPartID.bodyIdMax & iArr[1]) | (i12 << 32);
            if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
                z10 = false;
            } else {
                getRoot().K.f13929p.t0();
                z10 = true;
            }
        }
        W();
        r2.c rectManager = getRectManager();
        long j11 = this.T;
        long jD = m0.d(this.f1220d0);
        rectManager.getClass();
        float[] fArr = this.W;
        int iA = c9.g.a(fArr);
        r2.d dVar = rectManager.f23147b;
        if ((iA & 2) != 0) {
            fArr = null;
        }
        if (f3.m.b(jD, dVar.f23158c)) {
            z11 = false;
        } else {
            dVar.f23158c = jD;
            z11 = true;
        }
        if (!f3.m.b(j11, dVar.f23159d)) {
            dVar.f23159d = j11;
            z11 = true;
        }
        if (fArr != null) {
            z11 = true;
        }
        rectManager.f23150e = z11 || rectManager.f23150e;
        this.S.a(z10);
        getRectManager().a();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f1249t.m(i10, this.f1213a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f1249t.m(i10, this.f1213a, true);
    }

    @Override // i2.v1
    public final void d(eh.a<f0> aVar) {
        h0<eh.a<f0>> h0Var = this.A0;
        if (h0Var.c(aVar) >= 0) {
            return;
        }
        h0Var.g(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            P(getRoot());
        }
        a(true);
        h1.n.k().m();
        this.B = true;
        x0 x0Var = this.f1234l;
        b0 b0Var = x0Var.f21746a;
        Canvas canvas2 = b0Var.f21645a;
        b0Var.f21645a = canvas;
        getRoot().t(b0Var, null);
        x0Var.f21746a.f21645a = canvas2;
        ArrayList arrayList = this.f1260z;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((i2.u1) arrayList.get(i10)).j();
            }
        }
        if (androidx.compose.ui.platform.d.f1341x) {
            int iSave = canvas.save();
            canvas.clipRect(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.B = false;
        ArrayList arrayList2 = this.A;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        getRectManager().a();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.D0) {
            j2.p pVar = this.C0;
            removeCallbacks(pVar);
            if (motionEvent.getActionMasked() == 8) {
                this.D0 = false;
            } else {
                pVar.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (R(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (O(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        getContext();
        float scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor() * f10;
        getContext();
        return getFocusOwner().h(new e2.c(scaledVerticalScrollFactor, viewConfiguration.getScaledHorizontalScrollFactor() * f10, motionEvent.getDeviceId(), motionEvent.getEventTime()), new j2.r(motionEvent, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10 = this.D0;
        j2.p pVar = this.C0;
        if (z10) {
            removeCallbacks(pVar);
            pVar.run();
        }
        if (!R(motionEvent) && isAttachedToWindow()) {
            androidx.compose.ui.platform.c cVar = this.f1249t;
            AndroidComposeView androidComposeView = cVar.f1301d;
            AccessibilityManager accessibilityManager = cVar.f1304g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    androidComposeView.a(true);
                    i2.u uVar = new i2.u();
                    i2.e0 root = androidComposeView.getRoot();
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & BodyPartID.bodyIdMax);
                    e0.c cVar2 = i2.e0.U;
                    d1 d1Var = root.I;
                    g1 g1Var = d1Var.f13791c;
                    g1.d dVar = g1.O;
                    d1Var.f13791c.u1(g1.U, g1Var.d1(jFloatToRawIntBits), uVar, 1, true);
                    for (int i11 = qg.p.i(uVar); -1 < i11; i11--) {
                        Object objB = uVar.f14021a.b(i11);
                        kotlin.jvm.internal.r.c(objB, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                        i2.e0 e0VarF = i2.k.f((d.c) objB);
                        if (androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(e0VarF) != null) {
                            break;
                        }
                        if (e0VarF.I.d(8)) {
                            int iZ = cVar.z(e0VarF.f13810b);
                            q2.t tVarA = q2.u.a(e0VarF, false);
                            if (x4.e(tVarA)) {
                                if (!tVarA.i().f21799a.b(q2.w.f21844y)) {
                                    i10 = iZ;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i10 = PKIFailureInfo.systemUnavail;
                    androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i12 = cVar.f1302e;
                    if (i12 != i10) {
                        cVar.f1302e = i10;
                        androidx.compose.ui.platform.c.D(cVar, i10, 128, null, 12);
                        androidx.compose.ui.platform.c.D(cVar, i12, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i13 = cVar.f1302e;
                    if (i13 == Integer.MIN_VALUE) {
                        androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    } else if (i13 != Integer.MIN_VALUE) {
                        cVar.f1302e = PKIFailureInfo.systemUnavail;
                        androidx.compose.ui.platform.c.D(cVar, PKIFailureInfo.systemUnavail, 128, null, 12);
                        androidx.compose.ui.platform.c.D(cVar, i13, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && S(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f1257x0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f1257x0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.D0 = true;
                        postDelayed(pVar, 8L);
                        return false;
                    }
                } else if ((O(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (T(motionEvent)) {
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().i(keyEvent, new f(keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f1227h.getClass();
        q5.f14884a.setValue(new c2.o0(metaState));
        return getFocusOwner().i(keyEvent, o1.p.f18883a) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().o(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.D0) {
            j2.p pVar = this.C0;
            removeCallbacks(pVar);
            MotionEvent motionEvent2 = this.f1257x0;
            kotlin.jvm.internal.r.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.D0 = false;
            } else {
                pVar.run();
            }
        }
        if (!R(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || T(motionEvent))) {
            int iO = O(motionEvent);
            if ((iO & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iO & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // i2.v1
    public final void e(i2.e0 e0Var) {
        getLayoutNodes().g(e0Var.f13810b);
        u0 u0Var = this.S;
        i2.p pVar = u0Var.f14032b;
        pVar.f13974a.b(e0Var);
        pVar.f13975b.b(e0Var);
        ((z0.b) u0Var.f14035e.f14016a).j(e0Var);
        this.I = true;
        getRectManager().h(e0Var);
        k1.e eVar = this.H;
        if (eVar == null || !eVar.f15929h.e(e0Var.f13810b)) {
            return;
        }
        eVar.f15922a.a(eVar.f15924c, e0Var.f13810b, false);
    }

    @Override // i2.v1
    public final long f(long j10) {
        W();
        return q1.r1.b(this.W, j10);
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return L(this, i10);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        p1.e eVarB;
        if (view == null || this.S.f14033c) {
            return super.focusSearch(view, i10);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        if (view != this || (eVarB = getFocusOwner().k()) == null) {
            eVarB = o1.j.b(view, this);
        }
        o1.e eVarF = o1.j.f(i10);
        int i11 = eVarF != null ? eVarF.f18860a : 6;
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        if (getFocusOwner().p(i11, eVarB, new n(g0Var)) != null) {
            T t3 = g0Var.f16327a;
            if (t3 != 0) {
                if (viewFindNextFocus != null) {
                    if (i11 == 1 || i11 == 2) {
                        return super.focusSearch(view, i10);
                    }
                    kotlin.jvm.internal.r.b(t3);
                    if (f3.i.i(o1.m0.b((FocusTargetNode) t3), o1.j.b(viewFindNextFocus, this), eVarB, i11)) {
                    }
                }
                return this;
            }
            if (viewFindNextFocus == null) {
            }
            return viewFindNextFocus;
        }
        return view;
    }

    @Override // i2.v1
    public final long g(long j10) {
        W();
        return q1.r1.b(this.f1214a0, j10);
    }

    public final n1 getAndroidViewsHandler$ui_release() {
        if (this.O == null) {
            n1 n1Var = new n1(getContext());
            this.O = n1Var;
            addView(n1Var, -1);
            requestLayout();
        }
        n1 n1Var2 = this.O;
        kotlin.jvm.internal.r.b(n1Var2);
        return n1Var2;
    }

    @Override // i2.v1
    public k1.h getAutofill() {
        return this.G;
    }

    @Override // i2.v1
    public k1.j getAutofillManager() {
        return this.H;
    }

    @Override // i2.v1
    public k1.l getAutofillTree() {
        return this.f1258y;
    }

    public final eh.l<Configuration, f0> getConfigurationChangeObserver() {
        return this.F;
    }

    public final l1.b getContentCaptureManager$ui_release() {
        return this.f1252v;
    }

    @Override // i2.v1
    public tg.h getCoroutineContext() {
        return this.f1223f;
    }

    @Override // i2.v1
    public f3.d getDensity() {
        return (f3.d) this.f1219d.getValue();
    }

    @Override // i2.v1
    public o1.q getFocusOwner() {
        return this.f1221e;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        f0 f0Var;
        p1.e eVarV = V();
        if (eVarV != null) {
            rect.left = Math.round(eVarV.f21131a);
            rect.top = Math.round(eVarV.f21132b);
            rect.right = Math.round(eVarV.f21133c);
            rect.bottom = Math.round(eVarV.f21134d);
            f0Var = f0.f21461a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // i2.v1
    public f.a getFontFamilyResolver() {
        return (f.a) this.f1244q0.getValue();
    }

    @Override // i2.v1
    public x2.e getFontLoader() {
        return this.f1242p0;
    }

    @Override // i2.v1
    public q1.k1 getGraphicsContext() {
        return this.f1256x;
    }

    @Override // i2.v1
    public y1.a getHapticFeedBack() {
        return this.f1250t0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.S.f14032b.b();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // i2.v1
    public z1.b getInputModeManager() {
        return this.f1251u0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f1216b0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, i2.v1
    public f3.r getLayoutDirection() {
        return (f3.r) this.f1248s0.getValue();
    }

    public long getMeasureIteration() {
        u0 u0Var = this.S;
        if (!u0Var.f14033c) {
            f2.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return u0Var.f14037g;
    }

    @Override // i2.v1
    public h2.e getModifierLocalManager() {
        return this.f1253v0;
    }

    @Override // i2.v1
    public g1.a getPlacementScope() {
        h1.a aVar = h1.f11391a;
        return new c1(this);
    }

    @Override // i2.v1
    public z getPointerIconService() {
        return this.I0;
    }

    @Override // i2.v1
    public r2.c getRectManager() {
        return this.f1243q;
    }

    @Override // i2.v1
    public i2.e0 getRoot() {
        return this.f1238n;
    }

    public j2 getRootForTest() {
        return this.f1245r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getScrollCaptureInProgress$ui_release() {
        p2.q qVar;
        if (Build.VERSION.SDK_INT < 31 || (qVar = this.H0) == null) {
            return false;
        }
        return ((Boolean) qVar.f21182a.getValue()).booleanValue();
    }

    @Override // i2.v1
    public q2.v getSemanticsOwner() {
        return this.f1247s;
    }

    @Override // i2.v1
    public i2.h0 getSharedDrawScope() {
        return this.f1217c;
    }

    @Override // i2.v1
    public boolean getShowLayoutBounds() {
        return this.N;
    }

    @Override // i2.v1
    public f2 getSnapshotObserver() {
        return this.M;
    }

    @Override // i2.v1
    public z4 getSoftwareKeyboardController() {
        return this.f1240o0;
    }

    @Override // i2.v1
    public y2.e0 getTextInputService() {
        return this.f1237m0;
    }

    @Override // i2.v1
    public a5 getTextToolbar() {
        return this.f1255w0;
    }

    public View getView() {
        return this;
    }

    @Override // i2.v1
    public k5 getViewConfiguration() {
        return this.f1236m;
    }

    public final b getViewTreeOwners() {
        return (b) this.f1226g0.getValue();
    }

    @Override // i2.v1
    public p5 getWindowInfo() {
        return this.f1227h;
    }

    public final k1.e get_autofillManager$ui_release() {
        return this.H;
    }

    @Override // androidx.lifecycle.e
    public final void h(androidx.lifecycle.t tVar) {
        setShowLayoutBounds(a.a());
    }

    @Override // i2.v1
    public final void i(i2.e0 e0Var) {
        q2.l lVarE;
        k1.e eVar = this.H;
        if (eVar == null || (lVarE = e0Var.e()) == null || !lVarE.f21799a.a(q2.w.f21835p)) {
            return;
        }
        eVar.f15929h.a(e0Var.f13810b);
        eVar.f15922a.a(eVar.f15924c, e0Var.f13810b, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // i2.v1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(eh.p pVar, vg.c cVar) {
        j2.t tVar;
        if (cVar instanceof j2.t) {
            tVar = (j2.t) cVar;
            int i10 = tVar.f14898c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                tVar.f14898c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                tVar = new j2.t(this, cVar);
            }
        }
        Object obj = tVar.f14896a;
        ug.a aVar = ug.a.f29706a;
        int i11 = tVar.f14898c;
        if (i11 == 0) {
            pg.q.b(obj);
            j2.u uVar = new j2.u(this);
            tVar.f14898c = 1;
            if (j0.c(new j1.k(uVar, this.f1239n0, pVar, null), tVar) == aVar) {
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

    @Override // i2.v1
    public final void k(i2.e0 e0Var) {
        androidx.compose.ui.platform.c cVar = this.f1249t;
        cVar.A = true;
        if (cVar.u()) {
            cVar.v(e0Var);
        }
        l1.b bVar = this.f1252v;
        bVar.f16654g = true;
        if (bVar.d()) {
            bVar.f16655h.g(f0.f21461a);
        }
    }

    @Override // i2.v1
    public final void m(i2.e0 e0Var, boolean z10, boolean z11) {
        i2.j0 j0Var = e0Var.K;
        u0 u0Var = this.S;
        if (!z10) {
            u0Var.getClass();
            int iOrdinal = j0Var.f13917d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new pg.l();
            }
            i2.e0 e0VarG = e0Var.G();
            boolean z12 = e0VarG == null || e0VarG.x();
            if (!z11) {
                if (e0Var.D()) {
                    return;
                }
                if (e0Var.C() && e0Var.x() == z12 && e0Var.x() == j0Var.f13929p.f14062x) {
                    return;
                }
            }
            i2.x0 x0Var = j0Var.f13929p;
            x0Var.f14064z = true;
            x0Var.A = true;
            if (!e0Var.T && x0Var.f14062x && z12) {
                if ((e0VarG == null || !e0VarG.C()) && (e0VarG == null || !e0VarG.D())) {
                    u0Var.f14032b.a(e0Var, false);
                }
                if (u0Var.f14034d) {
                    return;
                }
                Z(null);
                return;
            }
            return;
        }
        i2.p pVar = u0Var.f14032b;
        int iOrdinal2 = j0Var.f13917d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new pg.l();
                }
            }
        }
        if ((j0Var.f13918e || j0Var.f13919f) && !z11) {
            return;
        }
        j0Var.f13919f = true;
        j0Var.f13920g = true;
        i2.x0 x0Var2 = j0Var.f13929p;
        x0Var2.f14064z = true;
        x0Var2.A = true;
        if (e0Var.T) {
            return;
        }
        i2.e0 e0VarG2 = e0Var.G();
        if (kotlin.jvm.internal.r.a(e0Var.R(), Boolean.TRUE) && ((e0VarG2 == null || !e0VarG2.K.f13918e) && (e0VarG2 == null || !e0VarG2.K.f13919f))) {
            pVar.a(e0Var, true);
        } else if (e0Var.x() && ((e0VarG2 == null || !e0VarG2.C()) && (e0VarG2 == null || !e0VarG2.D()))) {
            pVar.a(e0Var, false);
        }
        if (u0Var.f14034d) {
            return;
        }
        Z(null);
    }

    @Override // i2.v1
    public final void o(i2.e0 e0Var) {
        getLayoutNodes().h(e0Var.f13810b, e0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.l lifecycle;
        androidx.lifecycle.t tVar;
        super.onAttachedToWindow();
        boolean zHasWindowFocus = hasWindowFocus();
        j3 j3Var = this.f1227h;
        j3Var.f14821a.setValue(Boolean.valueOf(zHasWindowFocus));
        new p();
        j3Var.getClass();
        Q(getRoot());
        P(getRoot());
        getSnapshotObserver().f13853a.e();
        k1.b bVar = this.G;
        if (bVar != null) {
            k1.i iVar = k1.i.f15932a;
            iVar.getClass();
            bVar.f15916c.registerCallback(iVar);
        }
        androidx.lifecycle.t tVarC = androidx.lifecycle.c1.c(this);
        c6.e eVarD = b6.c.d(this);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (tVarC != null && eVarD != null && (tVarC != (tVar = viewTreeOwners.f1262a) || eVarD != tVar))) {
            if (tVarC == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (eVarD == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f1262a.getLifecycle()) != null) {
                lifecycle.c(this);
            }
            tVarC.getLifecycle().a(this);
            b bVar2 = new b(tVarC, eVarD);
            set_viewTreeOwners(bVar2);
            eh.l<? super b, f0> lVar = this.f1228h0;
            if (lVar != null) {
                lVar.invoke(bVar2);
            }
            this.f1228h0 = null;
        }
        this.f1251u0.f34721a.setValue(new z1.a(isInTouchMode() ? 1 : 2));
        b viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.l lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.f1262a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw k1.a.a("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.f1252v);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1229i0);
        getViewTreeObserver().addOnScrollChangedListener(this.f1231j0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f1233k0);
        if (Build.VERSION.SDK_INT >= 31) {
            n0.f14831a.b(this);
        }
        k1.e eVar = this.H;
        if (eVar != null) {
            getFocusOwner().s().g(eVar);
            getSemanticsOwner().f21819d.g(eVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        j1.j jVar = (j1.j) this.f1239n0.get();
        j2.d1 d1Var = (j2.d1) (jVar != null ? jVar.f14626b : null);
        if (d1Var == null) {
            return this.f1235l0.f33712d;
        }
        j1.j jVar2 = (j1.j) d1Var.f14697d.get();
        b3 b3Var = (b3) (jVar2 != null ? jVar2.f14626b : null);
        return b3Var != null && (b3Var.f14665e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(f3.a.a(getContext()));
        this.f1227h.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f1246r0) {
            this.f1246r0 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(x2.k.a(getContext()));
        }
        this.F.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        j1.j jVar = (j1.j) this.f1239n0.get();
        j2.d1 d1Var = (j2.d1) (jVar != null ? jVar.f14626b : null);
        if (d1Var == null) {
            y2.g0 g0Var = this.f1235l0;
            if (g0Var.f33712d) {
                y2.o oVar = g0Var.f33716h;
                c0 c0Var = g0Var.f33715g;
                int i11 = oVar.f33757e;
                boolean z10 = oVar.f33753a;
                if (i11 == 1) {
                    i10 = z10 ? 6 : 0;
                } else if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 2) {
                    i10 = 2;
                } else if (i11 == 6) {
                    i10 = 5;
                } else if (i11 == 5) {
                    i10 = 7;
                } else if (i11 == 3) {
                    i10 = 3;
                } else if (i11 == 4) {
                    i10 = 4;
                } else {
                    if (i11 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i10;
                int i12 = oVar.f33756d;
                if (i12 == 1) {
                    editorInfo.inputType = 1;
                } else if (i12 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i10;
                } else if (i12 == 3) {
                    editorInfo.inputType = 2;
                } else if (i12 == 4) {
                    editorInfo.inputType = 3;
                } else if (i12 == 5) {
                    editorInfo.inputType = 17;
                } else if (i12 == 6) {
                    editorInfo.inputType = 33;
                } else if (i12 == 7) {
                    editorInfo.inputType = 129;
                } else if (i12 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i12 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = ItemType.STRING_DATA_ITEM;
                }
                if (!z10) {
                    int i13 = editorInfo.inputType;
                    if ((i13 & 1) == 1) {
                        editorInfo.inputType = i13 | 131072;
                        if (i11 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i14 = editorInfo.inputType;
                if ((i14 & 1) == 1) {
                    int i15 = oVar.f33754b;
                    if (i15 == 1) {
                        editorInfo.inputType = i14 | 4096;
                    } else if (i15 == 2) {
                        editorInfo.inputType = i14 | 8192;
                    } else if (i15 == 3) {
                        editorInfo.inputType = i14 | 16384;
                    }
                    if (oVar.f33755c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j10 = c0Var.f33683b;
                int i16 = t2.j0.f27838c;
                editorInfo.initialSelStart = (int) (j10 >> 32);
                editorInfo.initialSelEnd = (int) (j10 & BodyPartID.bodyIdMax);
                a4.a.a(editorInfo, c0Var.f33682a.f27761b);
                editorInfo.imeOptions |= 33554432;
                if (androidx.emoji2.text.d.d()) {
                    androidx.emoji2.text.d.a().i(editorInfo);
                }
                y2.y yVar = new y2.y(g0Var.f33715g, new y2.i0(g0Var), g0Var.f33716h.f33755c);
                g0Var.f33717i.add(new WeakReference(yVar));
                return yVar;
            }
        } else {
            j1.j jVar2 = (j1.j) d1Var.f14697d.get();
            b3 b3Var = (b3) (jVar2 != null ? jVar2.f14626b : null);
            if (b3Var != null) {
                synchronized (b3Var.f14663c) {
                    if (b3Var.f14665e) {
                        return null;
                    }
                    k0.s1 s1VarA = b3Var.f14661a.a(editorInfo);
                    a3 a3Var = new a3(b3Var);
                    InputConnection uVar = Build.VERSION.SDK_INT >= 34 ? new y2.u(s1VarA, a3Var) : new y2.t(s1VarA, a3Var);
                    b3Var.f14664d.b(new i2.s2(uVar));
                    return uVar;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        q2.t tVar;
        String strA;
        l1.b bVar = this.f1252v;
        bVar.getClass();
        for (long j10 : jArr) {
            w4 w4VarB = bVar.c().b((int) j10);
            if (w4VarB != null && (tVar = w4VarB.f14962a) != null) {
                l1.d.a();
                ViewTranslationRequest.Builder builderA = l1.c.a(bVar.f16648a.getAutofillId(), tVar.f21814g);
                List list = (List) q2.m.a(tVar.f21811d, q2.w.f21845z);
                if (list != null && (strA = h3.a.a(list, "\n", null, 62)) != null) {
                    builderA.setValue("android:text", TranslationRequestValue.forText(new t2.b(strA)));
                    consumer.accept(builderA.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h1.z zVar = getSnapshotObserver().f13853a;
        h1.g gVar = zVar.f12201h;
        if (gVar != null) {
            gVar.a();
        }
        zVar.b();
        this.f1227h.getClass();
        b viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.l lifecycle = viewTreeOwners != null ? viewTreeOwners.f1262a.getLifecycle() : null;
        if (lifecycle == null) {
            throw k1.a.a("No lifecycle owner exists");
        }
        lifecycle.c(this.f1252v);
        lifecycle.c(this);
        k1.b bVar = this.G;
        if (bVar != null) {
            k1.i iVar = k1.i.f15932a;
            iVar.getClass();
            bVar.f15916c.unregisterCallback(iVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f1229i0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f1231j0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f1233k0);
        if (Build.VERSION.SDK_INT >= 31) {
            n0.f14831a.a(this);
        }
        k1.e eVar = this.H;
        if (eVar != null) {
            getSemanticsOwner().f21819d.j(eVar);
            getFocusOwner().s().j(eVar);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10 || hasFocus()) {
            return;
        }
        getFocusOwner().q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f1216b0 = 0L;
        this.S.j(this.E0);
        this.Q = null;
        c0();
        if (this.O != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        u0 u0Var = this.S;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                Q(getRoot());
            }
            long jK = K(i10);
            int i12 = (int) (jK >>> 32);
            int i13 = (int) (jK & BodyPartID.bodyIdMax);
            long jK2 = K(i11);
            long jA = b.a.a(i12, i13, (int) (jK2 >>> 32), (int) (BodyPartID.bodyIdMax & jK2));
            f3.b bVar = this.Q;
            if (bVar == null) {
                this.Q = new f3.b(jA);
                this.R = false;
            } else if (!f3.b.c(bVar.f8811a, jA)) {
                this.R = true;
            }
            u0Var.q(jA);
            u0Var.l();
            setMeasuredDimension(getRoot().K.f13929p.f11382a, getRoot().K.f13929p.f11383b);
            if (this.O != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().K.f13929p.f11382a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().K.f13929p.f11383b, 1073741824));
            }
            f0 f0Var = f0.f21461a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        if (viewStructure != null) {
            k1.e eVar = this.H;
            if (eVar != null) {
                i2.e0 e0Var = eVar.f15923b.f21816a;
                AutofillId autofillId = eVar.f15928g;
                String str = eVar.f15926e;
                r2.c cVar = eVar.f15925d;
                k1.r.a(viewStructure, e0Var, autofillId, str, cVar);
                Object[] objArr = r0.f20710a;
                h0 h0Var = new h0(2);
                h0Var.g(e0Var);
                h0Var.g(viewStructure);
                while (h0Var.e()) {
                    Object objK = h0Var.k(h0Var.f20707b - 1);
                    kotlin.jvm.internal.r.c(objK, "null cannot be cast to non-null type android.view.ViewStructure");
                    ViewStructure viewStructure2 = (ViewStructure) objK;
                    Object objK2 = h0Var.k(h0Var.f20707b - 1);
                    kotlin.jvm.internal.r.c(objK2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                    List<q2.n> listG = ((q2.n) objK2).g();
                    int size = listG.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        q2.n nVar = listG.get(i11);
                        if (!nVar.z() && nVar.m() && nVar.x()) {
                            q2.l lVarE = nVar.e();
                            if (lVarE != null) {
                                l0<q2.c0<?>, Object> l0Var = lVarE.f21799a;
                                if (l0Var.a(q2.k.f21779g) || l0Var.a(q2.w.f21835p) || l0Var.a(q2.w.f21836q)) {
                                    ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    k1.r.a(viewStructureNewChild, nVar, autofillId, str, cVar);
                                    h0Var.g(nVar);
                                    h0Var.g(viewStructureNewChild);
                                } else {
                                    h0Var.g(nVar);
                                    h0Var.g(viewStructure2);
                                }
                            }
                        }
                    }
                }
            }
            k1.b bVar = this.G;
            if (bVar != null) {
                k1.l lVar = bVar.f15915b;
                LinkedHashMap linkedHashMap = lVar.f15933a;
                LinkedHashMap linkedHashMap2 = lVar.f15933a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    k1.k kVar = (k1.k) entry.getValue();
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId(bVar.f15917d, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, bVar.f15914a.getContext().getPackageName(), null, null);
                    viewStructureNewChild2.setAutofillType(1);
                    kVar.getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        x xVarA;
        int toolType = motionEvent.getToolType(i10);
        if (motionEvent.isFromSource(ItemType.STRING_DATA_ITEM) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (xVarA = getPointerIconService().a()) == null)) {
            return super.onResolvePointerIcon(motionEvent, i10);
        }
        Context context = getContext();
        if (xVarA instanceof c2.a) {
            return null;
        }
        return xVarA instanceof c2.b ? PointerIcon.getSystemIcon(context, ((c2.b) xVarA).f4592b) : PointerIcon.getSystemIcon(context, DescriptorProtos.Edition.EDITION_2023_VALUE);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (this.f1215b) {
            f3.r rVar = i10 != 0 ? i10 != 1 ? null : f3.r.f8829b : f3.r.f8828a;
            if (rVar == null) {
                rVar = f3.r.f8828a;
            }
            setLayoutDirection(rVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        p2.q qVar;
        if (Build.VERSION.SDK_INT >= 31 && (qVar = this.H0) != null) {
            q2.v semanticsOwner = getSemanticsOwner();
            tg.h coroutineContext = getCoroutineContext();
            z0.b bVar = new z0.b(new p2.r[16]);
            p2.s.a(semanticsOwner.a(), 0, new p2.n(1, bVar, z0.b.class, "add", "add(Ljava/lang/Object;)Z", 8));
            bVar.n(i0.x1.a(p2.o.f21180a, p2.p.f21181a));
            int i10 = bVar.f34702c;
            p2.r rVar = (p2.r) (i10 == 0 ? null : bVar.f34700a[i10 - 1]);
            if (rVar != null) {
                f3.n nVar = rVar.f21185c;
                p2.c cVar = new p2.c(rVar.f21183a, nVar, j0.a(coroutineContext), qVar, this);
                i2.g1 g1Var = rVar.f21186d;
                p1.e eVarN = g2.w.c(g1Var).N(g1Var, true);
                long jC = nVar.c();
                ScrollCaptureTarget scrollCaptureTargetA = p2.l.a(this, q1.x1.a(f3.o.d(eVarN)), new Point((int) (jC >> 32), (int) (jC & BodyPartID.bodyIdMax)), cVar);
                scrollCaptureTargetA.setScrollBounds(q1.x1.a(nVar));
                consumer.accept(scrollCaptureTargetA);
            }
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(final LongSparseArray<ViewTranslationResponse> longSparseArray) {
        final l1.b bVar = this.f1252v;
        bVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (kotlin.jvm.internal.r.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            b.C0166b.a(bVar, longSparseArray);
        } else {
            bVar.f16648a.post(new Runnable() { // from class: l1.k
                @Override // java.lang.Runnable
                public final void run() {
                    b.C0166b.a(bVar, longSparseArray);
                }
            });
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean zA;
        this.f1227h.f14821a.setValue(Boolean.valueOf(z10));
        this.G0 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || getShowLayoutBounds() == (zA = a.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        P(getRoot());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i2.v1
    public final i2.u1 p(eh.p<? super w0, ? super t1.d, f0> pVar, eh.a<f0> aVar, t1.d dVar, boolean z10) {
        z0.b<Reference<i2.u1>> bVar;
        Reference<? extends i2.u1> referencePoll;
        Object obj;
        if (dVar != null) {
            return new w2(dVar, null, this, pVar, aVar);
        }
        if (z10) {
            if (isHardwareAccelerated() && this.f1222e0) {
                try {
                    return new q4(this, pVar, aVar);
                } catch (Throwable unused) {
                    this.f1222e0 = false;
                }
            }
            if (this.P == null) {
                if (!androidx.compose.ui.platform.d.f1340w) {
                    d.c.a(new View(getContext()));
                }
                s2 s2Var = androidx.compose.ui.platform.d.f1341x ? new s2(getContext()) : new m5(getContext());
                this.P = s2Var;
                addView(s2Var, -1);
            }
            s2 s2Var2 = this.P;
            kotlin.jvm.internal.r.b(s2Var2);
            return new androidx.compose.ui.platform.d(this, s2Var2, pVar, aVar);
        }
        do {
            o5<i2.u1> o5Var = this.f1261z0;
            ReferenceQueue<i2.u1> referenceQueue = o5Var.f14840b;
            bVar = o5Var.f14839a;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                bVar.j(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i10 = bVar.f34702c;
            if (i10 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) bVar.k(i10 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        i2.u1 u1Var = (i2.u1) obj;
        if (u1Var == null) {
            return new w2(getGraphicsContext().b(), getGraphicsContext(), this, pVar, aVar);
        }
        u1Var.f(pVar, aVar);
        return u1Var;
    }

    @Override // i2.v1
    public final void q(i2.e0 e0Var) {
        getRectManager().h(e0Var);
        k1.e eVar = this.H;
        if (eVar == null || !eVar.f15929h.e(e0Var.f13810b)) {
            return;
        }
        eVar.f15922a.a(eVar.f15924c, e0Var.f13810b, false);
    }

    @Override // i2.v1
    public final void r(i2.e0 e0Var, boolean z10, boolean z11, boolean z12) {
        i2.e0 e0VarG;
        i2.e0 e0VarG2;
        i2.p0 p0Var;
        k0 k0Var;
        u0 u0Var = this.S;
        if (!z10) {
            if (u0Var.p(e0Var, z11) && z12) {
                Z(e0Var);
                return;
            }
            return;
        }
        i2.p pVar = u0Var.f14032b;
        i2.e0 e0Var2 = e0Var.f13816h;
        i2.j0 j0Var = e0Var.K;
        if (e0Var2 == null) {
            f2.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = j0Var.f13917d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new pg.l();
                }
                if (!j0Var.f13918e || z11) {
                    j0Var.f13918e = true;
                    j0Var.f13929p.f14063y = true;
                    if (e0Var.T) {
                        return;
                    }
                    if ((kotlin.jvm.internal.r.a(e0Var.R(), Boolean.TRUE) || (j0Var.f13918e && (e0Var.E() == e0.f.f13840a || !((p0Var = j0Var.f13930q) == null || (k0Var = p0Var.f13989v) == null || !k0Var.f())))) && ((e0VarG = e0Var.G()) == null || !e0VarG.K.f13918e)) {
                        pVar.a(e0Var, true);
                    } else if ((e0Var.x() || u0.h(e0Var)) && ((e0VarG2 = e0Var.G()) == null || !e0VarG2.D())) {
                        pVar.a(e0Var, false);
                    }
                    if (u0Var.f14034d || !z12) {
                        return;
                    }
                    Z(e0Var);
                    return;
                }
                return;
            }
        }
        u0Var.f14038h.b(new u0.a(e0Var, true, z11));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().g().a()) {
            return super.requestFocus(i10, rect);
        }
        o1.e eVarF = o1.j.f(i10);
        int i11 = eVarF != null ? eVarF.f18860a : 7;
        return kotlin.jvm.internal.r.a(getFocusOwner().p(i11, rect != null ? q1.x1.d(rect) : null, new r(i11)), Boolean.TRUE);
    }

    @Override // c2.k
    public final void s(float[] fArr) {
        W();
        q1.r1.e(fArr, this.W);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f1220d0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f1220d0 & BodyPartID.bodyIdMax));
        q0.a aVar = q0.f14863a;
        float[] fArr2 = this.V;
        q1.r1.d(fArr2);
        q1.r1.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        q0.b(fArr, fArr2);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j10) {
        this.f1249t.f1305h = j10;
    }

    public final void setConfigurationChangeObserver(eh.l<? super Configuration, f0> lVar) {
        this.F = lVar;
    }

    public final void setContentCaptureManager$ui_release(l1.b bVar) {
        this.f1252v = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(tg.h hVar) {
        this.f1223f = hVar;
        ?? r11 = getRoot().I.f13793e;
        if (r11 instanceof c2.u0) {
            ((c2.u0) r11).F1();
        }
        if (!r11.f1144a.f1157p) {
            f2.a.b("visitSubtreeIf called on an unattached node");
        }
        z0.b bVar = new z0.b(new d.c[16]);
        d.c cVar = r11.f1144a;
        d.c cVar2 = cVar.f1149f;
        if (cVar2 == null) {
            i2.k.a(bVar, cVar);
        } else {
            bVar.b(cVar2);
        }
        while (true) {
            int i10 = bVar.f34702c;
            if (i10 == 0) {
                return;
            }
            d.c cVar3 = (d.c) bVar.k(i10 - 1);
            if ((cVar3.f1147d & 16) != 0) {
                for (d.c cVar4 = cVar3; cVar4 != null; cVar4 = cVar4.f1149f) {
                    if ((cVar4.f1146c & 16) != 0) {
                        i2.m mVarB = cVar4;
                        ?? bVar2 = 0;
                        while (mVarB != 0) {
                            if (mVarB instanceof i2) {
                                i2 i2Var = (i2) mVarB;
                                if (i2Var instanceof c2.u0) {
                                    ((c2.u0) i2Var).F1();
                                }
                            } else if ((mVarB.f1146c & 16) != 0 && (mVarB instanceof i2.m)) {
                                d.c cVar5 = mVarB.f13947r;
                                int i11 = 0;
                                mVarB = mVarB;
                                bVar2 = bVar2;
                                while (cVar5 != null) {
                                    if ((cVar5.f1146c & 16) != 0) {
                                        i11++;
                                        bVar2 = bVar2;
                                        if (i11 == 1) {
                                            mVarB = cVar5;
                                        } else {
                                            if (bVar2 == 0) {
                                                bVar2 = new z0.b(new d.c[16]);
                                            }
                                            if (mVarB != 0) {
                                                bVar2.b(mVarB);
                                                mVarB = 0;
                                            }
                                            bVar2.b(cVar5);
                                        }
                                    }
                                    cVar5 = cVar5.f1149f;
                                    mVarB = mVarB;
                                    bVar2 = bVar2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            mVarB = i2.k.b(bVar2);
                        }
                    }
                }
            }
            i2.k.a(bVar, cVar3);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.f1216b0 = j10;
    }

    public final void setOnViewTreeOwnersAvailable(eh.l<? super b, f0> lVar) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f1228h0 = lVar;
    }

    @Override // i2.v1
    public void setShowLayoutBounds(boolean z10) {
        this.N = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // i2.v1
    public final void t(i2.e0 e0Var, long j10) {
        u0 u0Var = this.S;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            u0Var.k(e0Var, j10);
            if (!u0Var.f14032b.b()) {
                u0Var.a(false);
                if (this.C) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.C = false;
                }
            }
            getRectManager().a();
            f0 f0Var = f0.f21461a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // i2.v1
    public final void u() {
        if (this.I) {
            h1.z zVar = getSnapshotObserver().f13853a;
            i2.x1 x1Var = i2.x1.f14069a;
            synchronized (zVar.f12200g) {
                try {
                    z0.b<z.a> bVar = zVar.f12199f;
                    int i10 = bVar.f34702c;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        z.a aVar = bVar.f34700a[i12];
                        aVar.e(x1Var);
                        if (!(aVar.f12209f.f20741e != 0)) {
                            i11++;
                        } else if (i11 > 0) {
                            z.a[] aVarArr = bVar.f34700a;
                            aVarArr[i12 - i11] = aVarArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    Arrays.fill(bVar.f34700a, i13, i10, (Object) null);
                    bVar.f34702c = i13;
                    f0 f0Var = f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.I = false;
        }
        n1 n1Var = this.O;
        if (n1Var != null) {
            J(n1Var);
        }
        k1.e eVar = this.H;
        if (eVar != null) {
            p.z zVar2 = eVar.f15929h;
            if (zVar2.f20762d == 0 && eVar.f15930i) {
                eVar.f15922a.f15938a.commit();
                eVar.f15930i = false;
            }
            if (zVar2.f20762d != 0) {
                eVar.f15930i = true;
            }
        }
        while (this.A0.e() && this.A0.b(0) != null) {
            int i14 = this.A0.f20707b;
            for (int i15 = 0; i15 < i14; i15++) {
                eh.a<f0> aVarB = this.A0.b(i15);
                h0<eh.a<f0>> h0Var = this.A0;
                if (i15 < 0 || i15 >= h0Var.f20707b) {
                    h0Var.f(i15);
                    throw null;
                }
                Object[] objArr = h0Var.f20706a;
                Object obj = objArr[i15];
                objArr[i15] = null;
                if (aVarB != null) {
                    aVarB.invoke();
                }
            }
            this.A0.l(0, i14);
        }
    }

    @Override // i2.v1
    public final void v() {
        androidx.compose.ui.platform.c cVar = this.f1249t;
        cVar.A = true;
        if (cVar.u() && !cVar.L) {
            cVar.L = true;
            cVar.f1309l.post(cVar.M);
        }
        l1.b bVar = this.f1252v;
        bVar.f16654g = true;
        if (!bVar.d() || bVar.f16661p) {
            return;
        }
        bVar.f16661p = true;
        bVar.f16656j.post(bVar.f16662q);
    }

    @Override // i2.v1
    public final void w(c.b bVar) {
        this.S.f14036f.b(bVar);
        Z(null);
    }

    @Override // i2.v1
    public final void x(int i10, i2.e0 e0Var) {
        k1.e eVar = this.H;
        if (eVar != null) {
            AndroidComposeView androidComposeView = eVar.f15924c;
            k1.p pVar = eVar.f15922a;
            p.z zVar = eVar.f15929h;
            if (zVar.e(i10)) {
                pVar.a(androidComposeView, i10, false);
            }
            q2.l lVarE = e0Var.e();
            if (lVarE != null && lVarE.f21799a.a(q2.w.f21835p)) {
                zVar.a(e0Var.f13810b);
                pVar.a(androidComposeView, e0Var.f13810b, true);
            }
        }
        getRectManager().f(e0Var, e0Var.K.f13929p.f14055p, true);
    }

    @Override // c2.p0
    public final long y(long j10) {
        W();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (this.f1220d0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (this.f1220d0 & BodyPartID.bodyIdMax));
        return q1.r1.b(this.f1214a0, (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        kotlin.jvm.internal.r.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // i2.v1
    public j2.i getAccessibilityManager() {
        return this.f1254w;
    }

    @Override // i2.v1
    public j2.j getClipboard() {
        return this.L;
    }

    @Override // i2.v1
    public j2.k getClipboardManager() {
        return this.K;
    }

    @Override // i2.v1
    public m1.a getDragAndDropManager() {
        return this.f1225g;
    }

    public y<i2.e0> getLayoutNodes() {
        return this.f1241p;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        f0 f0Var = f0.f21461a;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
