package u0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.htmltoapk.template.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import u0.a;
import u0.c;
import u0.r0;
import u0.s0;
import v0.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, n0> f14480a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f14481b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f14482c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14483d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f14484e = new b0();

    /* renamed from: f, reason: collision with root package name */
    public static final a f14485f = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f14486a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<T> f14487b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14488c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14489d;

        public b(int i6, Class<T> cls, int i7, int i8) {
            this.f14486a = i6;
            this.f14487b = cls;
            this.f14489d = i7;
            this.f14488c = i8;
        }

        public abstract T a(View view);

        public abstract void b(View view, T t6);

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(View view, T t6) {
            Object tag;
            if (Build.VERSION.SDK_INT >= this.f14488c) {
                b(view, t6);
                return;
            }
            if (Build.VERSION.SDK_INT >= this.f14488c) {
                tag = a(view);
            } else {
                tag = view.getTag(this.f14486a);
                if (!this.f14487b.isInstance(tag)) {
                    tag = null;
                }
            }
            if (d(tag, t6)) {
                View.AccessibilityDelegate accessibilityDelegateD = f0.d(view);
                u0.a aVar = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof a.C0093a ? ((a.C0093a) accessibilityDelegateD).f14448a : new u0.a(accessibilityDelegateD);
                if (aVar == null) {
                    aVar = new u0.a();
                }
                f0.m(view, aVar);
                view.setTag(this.f14486a, t6);
                f0.h(view, this.f14489d);
            }
        }

        public abstract boolean d(T t6, T t7);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            int i6 = h0.f14500a;
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public s0 f14490a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f14491b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ r f14492c;

            public a(View view, r rVar) {
                this.f14491b = view;
                this.f14492c = rVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                s0 s0VarG = s0.g(view, windowInsets);
                int i6 = Build.VERSION.SDK_INT;
                r rVar = this.f14492c;
                if (i6 < 30) {
                    d.a(windowInsets, this.f14491b);
                    if (s0VarG.equals(this.f14490a)) {
                        return rVar.d(view, s0VarG).f();
                    }
                }
                this.f14490a = s0VarG;
                s0 s0VarD = rVar.d(view, s0VarG);
                if (i6 >= 30) {
                    return s0VarD.f();
                }
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                c.c(view);
                return s0VarD.f();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static s0 b(View view, s0 s0Var, Rect rect) {
            WindowInsets windowInsetsF = s0Var.f();
            if (windowInsetsF != null) {
                return s0.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
            }
            rect.setEmpty();
            return s0Var;
        }

        public static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        public static String e(View view) {
            return view.getTransitionName();
        }

        public static float f(View view) {
            return view.getZ();
        }

        public static boolean g(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void h(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void i(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void j(View view, float f6) {
            view.setElevation(f6);
        }

        public static void k(View view, r rVar) {
            a aVar = rVar != null ? new a(view, rVar) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, aVar);
            }
            if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            }
        }

        public static void l(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e {
        public static s0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            s0 s0VarG = s0.g(null, rootWindowInsets);
            s0.l lVar = s0VarG.f14553a;
            lVar.q(s0VarG);
            lVar.d(view.getRootView());
            return s0VarG;
        }

        public static void b(View view, int i6, int i7) {
            view.setScrollIndicators(i6, i7);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class f {
        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i6) {
            view.setImportantForAutofill(i6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class g {
        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void d(View view, boolean z6) {
            view.setAccessibilityHeading(z6);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void f(View view, boolean z6) {
            view.setScreenReaderFocusable(z6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class h {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i6, int i7) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i6, i7);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class i {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class j {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static u0.c b(View view, u0.c cVar) {
            ContentInfo contentInfoC = cVar.f14455a.c();
            Objects.requireNonNull(contentInfoC);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoC);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoC ? cVar : new u0.c(new c.d(contentInfoPerformReceiveContent));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface k {
        boolean a();
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class l {

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f14493d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f14494a = null;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f14495b = null;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f14496c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((k) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f14494a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                    if (viewA != null) {
                        return viewA;
                    }
                }
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    @Deprecated
    public static n0 a(View view) {
        if (f14480a == null) {
            f14480a = new WeakHashMap<>();
        }
        n0 n0Var = f14480a.get(view);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(view);
        f14480a.put(view, n0Var2);
        return n0Var2;
    }

    public static void b(View view, s0 s0Var) {
        int i6 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsF = s0Var.f();
        if (windowInsetsF != null) {
            WindowInsets windowInsetsA = i6 >= 30 ? i.a(view, windowInsetsF) : c.a(view, windowInsetsF);
            if (windowInsetsA.equals(windowInsetsF)) {
                return;
            }
            s0.g(view, windowInsetsA);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = l.f14493d;
        l lVar = (l) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (lVar == null) {
            lVar = new l();
            view.setTag(R.id.tag_unhandled_key_event_manager, lVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = lVar.f14494a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = l.f14493d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (lVar.f14494a == null) {
                            lVar.f14494a = new WeakHashMap<>();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList<WeakReference<View>> arrayList3 = l.f14493d;
                            View view2 = arrayList3.get(size).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                lVar.f14494a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    lVar.f14494a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = lVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (lVar.f14495b == null) {
                    lVar.f14495b = new SparseArray<>();
                }
                lVar.f14495b.put(keyCode, new WeakReference<>(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h.a(view);
        }
        if (f14482c) {
            return null;
        }
        if (f14481b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f14481b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f14482c = true;
                return null;
            }
        }
        try {
            Object obj = f14481b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f14482c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = g.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(l.k kVar) {
        return Build.VERSION.SDK_INT >= 31 ? j.a(kVar) : (String[]) kVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i6) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z6 = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z6) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z6 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i6);
                if (z6) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i6 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i6);
                        return;
                    } catch (AbstractMethodError e6) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i6);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static u0.c i(View view, u0.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return j.b(view, cVar);
        }
        s sVar = (s) view.getTag(R.id.tag_on_receive_content_listener);
        t tVar = f14484e;
        if (sVar == null) {
            if (view instanceof t) {
                tVar = (t) view;
            }
            return tVar.a(cVar);
        }
        u0.c cVarA = sVar.a(view, cVar);
        if (cVarA == null) {
            return null;
        }
        if (view instanceof t) {
            tVar = (t) view;
        }
        return tVar.a(cVarA);
    }

    public static void j(View view, int i6) {
        ArrayList arrayListF = f(view);
        for (int i7 = 0; i7 < arrayListF.size(); i7++) {
            if (((b.a) arrayListF.get(i7)).a() == i6) {
                arrayListF.remove(i7);
                return;
            }
        }
    }

    public static void k(View view, b.a aVar, v0.d dVar) {
        b.a aVar2 = new b.a(null, aVar.f14738b, null, dVar, aVar.f14739c);
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        u0.a aVar3 = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof a.C0093a ? ((a.C0093a) accessibilityDelegateD).f14448a : new u0.a(accessibilityDelegateD);
        if (aVar3 == null) {
            aVar3 = new u0.a();
        }
        m(view, aVar3);
        j(view, aVar2.a());
        f(view).add(aVar2);
        h(view, 0);
    }

    public static void l(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i6, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            h.b(view, context, iArr, attributeSet, typedArray, i6, i7);
        }
    }

    public static void m(View view, u0.a aVar) {
        if (aVar == null && (d(view) instanceof a.C0093a)) {
            aVar = new u0.a();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f14447b);
    }

    public static void n(View view, CharSequence charSequence) {
        new d0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view, charSequence);
        a aVar = f14485f;
        if (charSequence == null) {
            aVar.s.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
        } else {
            aVar.s.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        }
    }

    public static void o(View view, r0.b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new r0.d.a(bVar));
            return;
        }
        PathInterpolator pathInterpolator = r0.c.f14528e;
        View.OnApplyWindowInsetsListener aVar = new r0.c.a(view, bVar);
        view.setTag(R.id.tag_window_insets_animation_callback, aVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(aVar);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap<View, Boolean> s = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.s.entrySet()) {
                    View key = entry.getKey();
                    boolean zBooleanValue = entry.getValue().booleanValue();
                    boolean z6 = key.isShown() && key.getWindowVisibility() == 0;
                    if (zBooleanValue != z6) {
                        f0.h(key, z6 ? 16 : 32);
                        entry.setValue(Boolean.valueOf(z6));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
