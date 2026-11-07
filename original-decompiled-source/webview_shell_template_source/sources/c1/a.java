package c1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import c1.b;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;
import w.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a extends u0.a {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f2122n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final C0026a f2123o = new C0026a();

    /* renamed from: p, reason: collision with root package name */
    public static final b f2124p = new b();
    public final AccessibilityManager h;

    /* renamed from: i, reason: collision with root package name */
    public final Chip f2129i;

    /* renamed from: j, reason: collision with root package name */
    public c f2130j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f2125d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2126e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f2127f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2128g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f2131k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f2132l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f2133m = Integer.MIN_VALUE;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: c1.a$a, reason: collision with other inner class name */
    public class C0026a implements b.a<v0.b> {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c extends v0.c {
        public c() {
        }

        @Override // v0.c
        public final v0.b a(int i6) {
            return new v0.b(AccessibilityNodeInfo.obtain(a.this.n(i6).f14729a));
        }

        @Override // v0.c
        public final v0.b b(int i6) {
            a aVar = a.this;
            int i7 = i6 == 2 ? aVar.f2131k : aVar.f2132l;
            if (i7 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i7);
        }

        @Override // v0.c
        public final boolean c(int i6, int i7, Bundle bundle) {
            int i8;
            a aVar = a.this;
            Chip chip = aVar.f2129i;
            if (i6 == -1) {
                return chip.performAccessibilityAction(i7, bundle);
            }
            if (i7 == 1) {
                return aVar.q(i6);
            }
            if (i7 == 2) {
                return aVar.j(i6);
            }
            boolean z6 = false;
            if (i7 == 64) {
                AccessibilityManager accessibilityManager = aVar.h;
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i8 = aVar.f2131k) == i6) {
                    return false;
                }
                if (i8 != Integer.MIN_VALUE) {
                    aVar.f2131k = Integer.MIN_VALUE;
                    chip.invalidate();
                    aVar.r(i8, 65536);
                }
                aVar.f2131k = i6;
                chip.invalidate();
                aVar.r(i6, 32768);
                return true;
            }
            if (i7 == 128) {
                if (aVar.f2131k != i6) {
                    return false;
                }
                aVar.f2131k = Integer.MIN_VALUE;
                chip.invalidate();
                aVar.r(i6, 65536);
                return true;
            }
            Chip chip2 = Chip.this;
            if (i7 == 16) {
                if (i6 == 0) {
                    return chip2.performClick();
                }
                if (i6 == 1) {
                    chip2.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip2.f12182z;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip2);
                        z6 = true;
                    }
                    if (chip2.K) {
                        chip2.J.r(1, 1);
                    }
                }
            }
            return z6;
        }
    }

    public a(Chip chip) {
        this.f2129i = chip;
        this.h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // u0.a
    public final v0.c b(View view) {
        if (this.f2130j == null) {
            this.f2130j = new c();
        }
        return this.f2130j;
    }

    @Override // u0.a
    public final void d(View view, v0.b bVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
        this.f14446a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = Chip.this;
        com.google.android.material.chip.a aVar = chip.f12179w;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.f12210s0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        bVar.h(chip.getAccessibilityClassName());
        bVar.k(chip.getText());
    }

    public final boolean j(int i6) {
        if (this.f2132l != i6) {
            return false;
        }
        this.f2132l = Integer.MIN_VALUE;
        p(i6, false);
        r(i6, 8);
        return true;
    }

    public final v0.b k(int i6) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        v0.b bVar = new v0.b(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        bVar.h("android.view.View");
        Rect rect = f2122n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f2129i;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i6, bVar);
        if (bVar.f() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f2126e;
        accessibilityNodeInfoObtain.getBoundsInParent(rect2);
        Rect rect3 = this.f2125d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        bVar.f14730b = i6;
        accessibilityNodeInfoObtain.setSource(chip, i6);
        if (this.f2131k == i6) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            bVar.a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            bVar.a(64);
        }
        boolean z6 = this.f2132l == i6;
        if (z6) {
            bVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            bVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z6);
        int[] iArr = this.f2128g;
        chip.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoObtain.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            chip.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            accessibilityNodeInfoObtain.setBoundsInScreen(rect4);
            accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        }
        Rect rect5 = this.f2127f;
        if (chip.getLocalVisibleRect(rect5)) {
            rect5.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect5)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            bVar.f14729a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i6, Rect rect) {
        int i7;
        int i8;
        Object obj;
        v0.b bVar;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        h hVar = new h();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            hVar.c(((Integer) arrayList.get(i14)).intValue(), k(((Integer) arrayList.get(i14)).intValue()));
        }
        int i15 = this.f2132l;
        v0.b bVar2 = i15 == Integer.MIN_VALUE ? null : (v0.b) hVar.b(i15);
        C0026a c0026a = f2123o;
        b bVar3 = f2124p;
        Chip chip = this.f2129i;
        if (i6 == 1 || i6 == 2) {
            i7 = -1;
            i8 = 0;
            boolean z6 = chip.getLayoutDirection() == 1;
            bVar3.getClass();
            int i16 = hVar.f14852u;
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 < i16; i17++) {
                arrayList2.add((v0.b) hVar.f14851t[i17]);
            }
            Collections.sort(arrayList2, new b.C0027b(z6, c0026a));
            if (i6 == 1) {
                int size = arrayList2.size();
                if (bVar2 != null) {
                    size = arrayList2.indexOf(bVar2);
                }
                int i18 = size - 1;
                if (i18 >= 0) {
                    obj = arrayList2.get(i18);
                }
                bVar = (v0.b) obj;
            } else {
                if (i6 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (bVar2 == null ? -1 : arrayList2.lastIndexOf(bVar2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                bVar = (v0.b) obj;
            }
        } else {
            if (i6 != 17 && i6 != 33 && i6 != 66 && i6 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i19 = this.f2132l;
            if (i19 != Integer.MIN_VALUE) {
                n(i19).f14729a.getBoundsInScreen(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i6 == 17) {
                    i11 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i6 == 33) {
                    i11 = -1;
                    rect2.set(0, height, width, height);
                } else if (i6 == 66) {
                    i11 = -1;
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = -1;
                    rect2.set(0, -1, width, -1);
                }
                Rect rect3 = new Rect(rect2);
                if (i6 != 17) {
                    i8 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i6 == 33) {
                    i8 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i6 == 66) {
                    i8 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i8 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                bVar3.getClass();
                i12 = hVar.f14852u;
                Rect rect4 = new Rect();
                bVar = null;
                for (i13 = i8; i13 < i12; i13++) {
                    v0.b bVar4 = (v0.b) hVar.f14851t[i13];
                    if (bVar4 != bVar2) {
                        c0026a.getClass();
                        bVar4.f14729a.getBoundsInScreen(rect4);
                        if (c1.b.c(i6, rect2, rect4)) {
                            if (c1.b.c(i6, rect2, rect3) && !c1.b.a(i6, rect2, rect4, rect3)) {
                                if (!c1.b.a(i6, rect2, rect3, rect4)) {
                                    int iD = c1.b.d(i6, rect2, rect4);
                                    int iE = c1.b.e(i6, rect2, rect4);
                                    int i20 = (iE * iE) + (iD * 13 * iD);
                                    int iD2 = c1.b.d(i6, rect2, rect3);
                                    int iE2 = c1.b.e(i6, rect2, rect3);
                                    if (i20 < (iE2 * iE2) + (iD2 * 13 * iD2)) {
                                        rect3.set(rect4);
                                        bVar = bVar4;
                                    }
                                }
                            }
                        }
                    }
                }
                i7 = i11;
            }
            i11 = -1;
            Rect rect32 = new Rect(rect2);
            if (i6 != 17) {
            }
            bVar3.getClass();
            i12 = hVar.f14852u;
            Rect rect42 = new Rect();
            bVar = null;
            while (i13 < i12) {
            }
            i7 = i11;
        }
        v0.b bVar5 = bVar;
        if (bVar5 == null) {
            i10 = Integer.MIN_VALUE;
        } else {
            int i21 = hVar.f14852u;
            int i22 = i8;
            while (true) {
                if (i22 >= i21) {
                    i9 = i7;
                    break;
                }
                if (hVar.f14851t[i22] == bVar5) {
                    i9 = i22;
                    break;
                }
                i22++;
            }
            i10 = hVar.s[i9];
        }
        return q(i10);
    }

    public final v0.b n(int i6) {
        if (i6 != -1) {
            return k(i6);
        }
        Chip chip = this.f2129i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        v0.b bVar = new v0.b(accessibilityNodeInfoObtain);
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            bVar.f14729a.addChild(chip, ((Integer) arrayList.get(i7)).intValue());
        }
        return bVar;
    }

    public abstract void o(int i6, v0.b bVar);

    public abstract void p(int i6, boolean z6);

    public final boolean q(int i6) {
        int i7;
        Chip chip = this.f2129i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i7 = this.f2132l) == i6) {
            return false;
        }
        if (i7 != Integer.MIN_VALUE) {
            j(i7);
        }
        if (i6 == Integer.MIN_VALUE) {
            return false;
        }
        this.f2132l = i6;
        p(i6, true);
        r(i6, 8);
        return true;
    }

    public final void r(int i6, int i7) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i6 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.f2129i).getParent()) == null) {
            return;
        }
        if (i6 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i7);
            v0.b bVarN = n(i6);
            accessibilityEventObtain.getText().add(bVarN.f());
            AccessibilityNodeInfo accessibilityNodeInfo = bVarN.f14729a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i6);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i7);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
