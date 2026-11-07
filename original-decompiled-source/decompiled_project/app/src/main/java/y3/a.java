package y3;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.basitce.htmltoapk.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import y3.q0;
import z3.j;
import z3.l;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f33784c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f33785a;

    /* renamed from: b, reason: collision with root package name */
    public final C0340a f33786b;

    /* renamed from: y3.a$a, reason: collision with other inner class name */
    public static final class C0340a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final a f33787a;

        public C0340a(a aVar) {
            this.f33787a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f33787a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            z3.k kVarB = this.f33787a.b(view);
            if (kVarB != null) {
                return kVarB.f34742a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f33787a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            z3.j jVar = new z3.j(accessibilityNodeInfo);
            Field field = q0.f33885a;
            accessibilityNodeInfo.setScreenReaderFocusable(q0.f.c(view));
            accessibilityNodeInfo.setHeading(q0.f.b(view));
            accessibilityNodeInfo.setPaneTitle(q0.f.a(view));
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                tag = q0.h.b(view);
            } else {
                tag = view.getTag(R.id.tag_state_description);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag;
            if (i10 >= 30) {
                j.b.b(accessibilityNodeInfo, charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f33787a.d(view, jVar);
            accessibilityNodeInfo.getText();
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                jVar.b((j.a) list.get(i11));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f33787a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f33787a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f33787a.g(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i10) {
            this.f33787a.h(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f33787a.i(view, accessibilityEvent);
        }
    }

    public a() {
        this(f33784c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f33785a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public z3.k b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f33785a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new z3.k(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f33785a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, z3.j jVar) {
        this.f33785a.onInitializeAccessibilityNodeInfo(view, jVar.f34725a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f33785a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f33785a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            j.a aVar = (j.a) list.get(i11);
            if (aVar.a() == i10) {
                Class<? extends l.a> cls = aVar.f34740c;
                z3.l lVar = aVar.f34741d;
                if (lVar != null) {
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(null).newInstance(null).getClass();
                        } catch (Exception e10) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    zPerformAccessibilityAction = lVar.a(view);
                }
            } else {
                i11++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f33785a.performAccessibilityAction(view, i10, bundle);
        }
        if (zPerformAccessibilityAction || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i13 = 0;
            while (true) {
                if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    z10 = true;
                    break;
                }
                i13++;
            }
        }
        return z10;
    }

    public void h(View view, int i10) {
        this.f33785a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f33785a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f33785a = accessibilityDelegate;
        this.f33786b = new C0340a(this);
    }
}
