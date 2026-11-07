package y3;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.basitce.htmltoapk.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import y3.a;
import y3.c;
import y3.i1;
import y3.x0;
import z3.j;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static Field f33885a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f33886b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f33887c = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f33888d = new p0();

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static class b {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            int i10 = s0.f33892a;
            return view.dispatchApplyWindowInsets(windowInsets);
        }
    }

    public static class c {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public i1 f33889a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f33890b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ u f33891c;

            public a(View view, u uVar) {
                this.f33890b = view;
                this.f33891c = uVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                i1 i1VarC = i1.c(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                u uVar = this.f33891c;
                if (i10 < 30) {
                    c.a(windowInsets, this.f33890b);
                    if (i1VarC.equals(this.f33889a)) {
                        return uVar.c(view, i1VarC).b();
                    }
                }
                this.f33889a = i1VarC;
                i1 i1VarC2 = uVar.c(view, i1VarC);
                if (i10 >= 30) {
                    return i1VarC2.b();
                }
                Field field = q0.f33885a;
                view.requestApplyInsets();
                return i1VarC2.b();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static void b(View view, u uVar) {
            a aVar = uVar != null ? new a(view, uVar) : null;
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
    }

    public static class d {
        public static i1 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            i1 i1VarC = i1.c(rootWindowInsets, null);
            i1.q qVar = i1VarC.f33825a;
            qVar.y(i1VarC);
            View rootView = view.getRootView();
            qVar.d(rootView);
            qVar.p(rootView);
            qVar.q();
            return i1VarC;
        }
    }

    public static class e {
        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    public static class f {
        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }
    }

    public static class g {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }
    }

    public static final class i {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static y3.c b(View view, y3.c cVar) {
            ContentInfo contentInfoA = cVar.f33792a.a();
            Objects.requireNonNull(contentInfoA);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoA);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoA ? cVar : new y3.c(new c.d(contentInfoPerformReceiveContent));
        }
    }

    static {
        new WeakHashMap();
    }

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return g.a(view);
        }
        if (f33886b) {
            return null;
        }
        if (f33885a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f33885a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f33886b = true;
                return null;
            }
        }
        try {
            Object obj = f33885a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f33886b = true;
            return null;
        }
    }

    public static ArrayList b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void c(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = f.a(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(f.a(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(f.a(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y3.c d(View view, y3.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return i.b(view, cVar);
        }
        v vVar = (v) view.getTag(R.id.tag_on_receive_content_listener);
        if (vVar == null) {
            return (view instanceof w ? (w) view : f33888d).a(cVar);
        }
        vVar.a();
        throw null;
    }

    public static void e(View view, int i10) {
        ArrayList arrayListB = b(view);
        for (int i11 = 0; i11 < arrayListB.size(); i11++) {
            if (((j.a) arrayListB.get(i11)).a() == i10) {
                arrayListB.remove(i11);
                return;
            }
        }
    }

    public static void f(View view, j.a aVar, z3.l lVar) {
        j.a aVar2 = new j.a(null, aVar.f34739b, null, lVar, aVar.f34740c);
        View.AccessibilityDelegate accessibilityDelegateA = a(view);
        y3.a aVar3 = accessibilityDelegateA == null ? null : accessibilityDelegateA instanceof a.C0340a ? ((a.C0340a) accessibilityDelegateA).f33787a : new y3.a(accessibilityDelegateA);
        if (aVar3 == null) {
            aVar3 = new y3.a();
        }
        h(view, aVar3);
        e(view, aVar2.a());
        b(view).add(aVar2);
        c(view, 0);
    }

    public static void g(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            g.b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void h(View view, y3.a aVar) {
        if (aVar == null && (a(view) instanceof a.C0340a)) {
            aVar = new y3.a();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f33786b);
    }

    public static void i(View view, x0.b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new x0.d.a(bVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = x0.c.f33909d;
        View.OnApplyWindowInsetsListener aVar = bVar != null ? new x0.c.a(view, bVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, aVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(aVar);
        }
    }
}
