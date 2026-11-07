package u0;

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
import com.htmltoapk.template.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import u0.f0;
import v0.b;
import v0.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f14445c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f14446a;

    /* renamed from: b, reason: collision with root package name */
    public final C0093a f14447b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: u0.a$a, reason: collision with other inner class name */
    public static final class C0093a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final a f14448a;

        public C0093a(a aVar) {
            this.f14448a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f14448a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            v0.c cVarB = this.f14448a.b(view);
            if (cVarB != null) {
                return cVarB.f14741a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f14448a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            Object tag2;
            Object tag3;
            int iKeyAt;
            v0.b bVar = new v0.b(accessibilityNodeInfo);
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            if (Build.VERSION.SDK_INT >= 28) {
                tag = Boolean.valueOf(f0.g.c(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            int i6 = 0;
            boolean z6 = bool != null && bool.booleanValue();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z6);
            } else {
                bVar.g(1, z6);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                tag2 = Boolean.valueOf(f0.g.b(view));
            } else {
                tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            boolean z7 = bool2 != null && bool2.booleanValue();
            if (i7 >= 28) {
                accessibilityNodeInfo.setHeading(z7);
            } else {
                bVar.g(2, z7);
            }
            CharSequence charSequenceE = f0.e(view);
            if (i7 >= 28) {
                accessibilityNodeInfo.setPaneTitle(charSequenceE);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceE);
            }
            if (i7 >= 30) {
                tag3 = f0.i.b(view);
            } else {
                tag3 = view.getTag(R.id.tag_state_description);
                if (!CharSequence.class.isInstance(tag3)) {
                    tag3 = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag3;
            if (i7 >= 30) {
                b.C0097b.b(accessibilityNodeInfo, charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f14448a.d(view, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i7 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                        if (((WeakReference) sparseArray.valueAt(i8)).get() == null) {
                            arrayList.add(Integer.valueOf(i8));
                        }
                    }
                    for (int i9 = 0; i9 < arrayList.size(); i9++) {
                        sparseArray.remove(((Integer) arrayList.get(i9)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i10 = 0;
                    while (i10 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i10];
                        int i11 = i6;
                        while (true) {
                            if (i11 >= sparseArray2.size()) {
                                iKeyAt = v0.b.f14728c;
                                v0.b.f14728c = iKeyAt + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i11)).get())) {
                                    iKeyAt = sparseArray2.keyAt(i11);
                                    break;
                                }
                                i11++;
                            }
                        }
                        sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i10]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i10];
                        Spanned spanned = (Spanned) text;
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                        i10++;
                        i6 = 0;
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                bVar.b((b.a) list.get(i12));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f14448a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f14448a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i6, Bundle bundle) {
            return this.f14448a.g(view, i6, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i6) {
            this.f14448a.h(view, i6);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f14448a.i(view, accessibilityEvent);
        }
    }

    public a() {
        this(f14445c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f14446a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public v0.c b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f14446a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new v0.c(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f14446a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, v0.b bVar) {
        this.f14446a.onInitializeAccessibilityNodeInfo(view, bVar.f14729a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f14446a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f14446a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i6, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= list.size()) {
                break;
            }
            b.a aVar = (b.a) list.get(i7);
            if (aVar.a() == i6) {
                Class<? extends d.a> cls = aVar.f14739c;
                v0.d dVar = aVar.f14740d;
                if (dVar != null) {
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(null).newInstance(null).getClass();
                        } catch (Exception e6) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e6);
                        }
                    }
                    zPerformAccessibilityAction = dVar.a(view);
                }
            } else {
                i7++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f14446a.performAccessibilityAction(view, i6, bundle);
        }
        if (zPerformAccessibilityAction || i6 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i8 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i8)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i9 = 0;
            while (true) {
                if (clickableSpanArr == null || i9 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i9])) {
                    clickableSpan.onClick(view);
                    z6 = true;
                    break;
                }
                i9++;
            }
        }
        return z6;
    }

    public void h(View view, int i6) {
        this.f14446a.sendAccessibilityEvent(view, i6);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f14446a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f14446a = accessibilityDelegate;
        this.f14447b = new C0093a(this);
    }
}
