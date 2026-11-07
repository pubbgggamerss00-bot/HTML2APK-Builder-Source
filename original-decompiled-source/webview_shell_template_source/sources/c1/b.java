package c1;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import c1.a;
import java.util.Comparator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a<T> {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: c1.b$b, reason: collision with other inner class name */
    public static class C0027b<T> implements Comparator<T> {
        public final Rect s = new Rect();

        /* renamed from: t, reason: collision with root package name */
        public final Rect f2135t = new Rect();

        /* renamed from: u, reason: collision with root package name */
        public final boolean f2136u;

        /* renamed from: v, reason: collision with root package name */
        public final a<T> f2137v;

        public C0027b(boolean z6, a<T> aVar) {
            this.f2136u = z6;
            this.f2137v = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t6, T t7) {
            a.C0026a c0026a = (a.C0026a) this.f2137v;
            c0026a.getClass();
            AccessibilityNodeInfo accessibilityNodeInfo = ((v0.b) t6).f14729a;
            Rect rect = this.s;
            accessibilityNodeInfo.getBoundsInScreen(rect);
            c0026a.getClass();
            AccessibilityNodeInfo accessibilityNodeInfo2 = ((v0.b) t7).f14729a;
            Rect rect2 = this.f2135t;
            accessibilityNodeInfo2.getBoundsInScreen(rect2);
            int i6 = rect.top;
            int i7 = rect2.top;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.left;
            int i9 = rect2.left;
            boolean z6 = this.f2136u;
            if (i8 < i9) {
                return z6 ? 1 : -1;
            }
            if (i8 > i9) {
                return z6 ? -1 : 1;
            }
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.right;
            int i13 = rect2.right;
            if (i12 < i13) {
                return z6 ? 1 : -1;
            }
            if (i12 > i13) {
                return z6 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(int i6, Rect rect, Rect rect2, Rect rect3) {
        int i7;
        int i8;
        boolean zB = b(i6, rect, rect2);
        if (b(i6, rect, rect3) || !zB) {
            return false;
        }
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i6 != 17 && i6 != 66) {
                            int iD = d(i6, rect, rect2);
                            if (i6 == 17) {
                                i7 = rect.left;
                                i8 = rect3.left;
                            } else if (i6 == 33) {
                                i7 = rect.top;
                                i8 = rect3.top;
                            } else if (i6 == 66) {
                                i7 = rect3.right;
                                i8 = rect.right;
                            } else {
                                if (i6 != 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i7 = rect3.bottom;
                                i8 = rect.bottom;
                            }
                            if (iD >= Math.max(1, i7 - i8)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                }
            } else if (rect.top >= rect3.bottom) {
            }
        } else if (rect.left >= rect3.right) {
        }
        return true;
    }

    public static boolean b(int i6, Rect rect, Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(int i6, Rect rect, Rect rect2) {
        if (i6 == 17) {
            int i7 = rect.right;
            int i8 = rect2.right;
            return (i7 > i8 || rect.left >= i8) && rect.left > rect2.left;
        }
        if (i6 == 33) {
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            return (i9 > i10 || rect.top >= i10) && rect.top > rect2.top;
        }
        if (i6 == 66) {
            int i11 = rect.left;
            int i12 = rect2.left;
            return (i11 < i12 || rect.right <= i12) && rect.right < rect2.right;
        }
        if (i6 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i13 = rect.top;
        int i14 = rect2.top;
        return (i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom;
    }

    public static int d(int i6, Rect rect, Rect rect2) {
        int i7;
        int i8;
        if (i6 == 17) {
            i7 = rect.left;
            i8 = rect2.right;
        } else if (i6 == 33) {
            i7 = rect.top;
            i8 = rect2.bottom;
        } else if (i6 == 66) {
            i7 = rect2.left;
            i8 = rect.right;
        } else {
            if (i6 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i7 = rect2.top;
            i8 = rect.bottom;
        }
        return Math.max(0, i7 - i8);
    }

    public static int e(int i6, Rect rect, Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
