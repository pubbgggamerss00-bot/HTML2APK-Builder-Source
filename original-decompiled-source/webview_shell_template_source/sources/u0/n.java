package u0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f14516a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f14517b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f14518c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14519d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f14520e;

    public n(ViewGroup viewGroup) {
        this.f14518c = viewGroup;
    }

    public final boolean a(float f6, float f7, boolean z6) {
        ViewParent viewParentE;
        if (this.f14519d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f14518c, f6, f7, z6);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e6);
            }
        }
        return false;
    }

    public final boolean b(float f6, float f7) {
        ViewParent viewParentE;
        if (this.f14519d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f14518c, f6, f7);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e6);
            }
        }
        return false;
    }

    public final boolean c(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        ViewParent viewParentE;
        int i9;
        int i10;
        if (!this.f14519d || (viewParentE = e(i8)) == null) {
            return false;
        }
        if (i6 == 0 && i7 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f14518c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i9 = iArr2[0];
            i10 = iArr2[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr == null) {
            if (this.f14520e == null) {
                this.f14520e = new int[2];
            }
            iArr = this.f14520e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentE instanceof o) {
            ((o) viewParentE).onNestedPreScroll(viewGroup, i6, i7, iArr3, i8);
        } else if (i8 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i6, i7, iArr3);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e6);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i9;
            iArr2[1] = iArr2[1] - i10;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        ViewParent viewParentE;
        int i11;
        int i12;
        int[] iArr3;
        if (this.f14519d && (viewParentE = e(i10)) != null) {
            if (i6 != 0 || i7 != 0 || i8 != 0 || i9 != 0) {
                ViewGroup viewGroup = this.f14518c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i11 = iArr[0];
                    i12 = iArr[1];
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                if (iArr2 == null) {
                    if (this.f14520e == null) {
                        this.f14520e = new int[2];
                    }
                    int[] iArr4 = this.f14520e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof p) {
                    ((p) viewParentE).onNestedScroll(viewGroup, i6, i7, i8, i9, i10, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i8;
                    iArr3[1] = iArr3[1] + i9;
                    if (viewParentE instanceof o) {
                        ((o) viewParentE).onNestedScroll(viewGroup, i6, i7, i8, i9, i10);
                    } else if (i10 == 0) {
                        try {
                            viewParentE.onNestedScroll(viewGroup, i6, i7, i8, i9);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e6);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i11;
                    iArr[1] = iArr[1] - i12;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i6) {
        if (i6 == 0) {
            return this.f14516a;
        }
        if (i6 != 1) {
            return null;
        }
        return this.f14517b;
    }

    public final boolean f(int i6) {
        return e(i6) != null;
    }

    public final boolean g(int i6, int i7) {
        boolean zOnStartNestedScroll;
        if (!f(i7)) {
            if (this.f14519d) {
                View view = this.f14518c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z6 = parent instanceof o;
                    if (z6) {
                        zOnStartNestedScroll = ((o) parent).onStartNestedScroll(view2, view, i6, i7);
                    } else if (i7 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i6);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e6);
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i7 == 0) {
                            this.f14516a = parent;
                        } else if (i7 == 1) {
                            this.f14517b = parent;
                        }
                        if (z6) {
                            ((o) parent).onNestedScrollAccepted(view2, view, i6, i7);
                        } else if (i7 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i6);
                            } catch (AbstractMethodError e7) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e7);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i6) {
        ViewParent viewParentE = e(i6);
        if (viewParentE != null) {
            boolean z6 = viewParentE instanceof o;
            ViewGroup viewGroup = this.f14518c;
            if (z6) {
                ((o) viewParentE).onStopNestedScroll(viewGroup, i6);
            } else if (i6 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e6);
                }
            }
            if (i6 == 0) {
                this.f14516a = null;
            } else {
                if (i6 != 1) {
                    return;
                }
                this.f14517b = null;
            }
        }
    }
}
