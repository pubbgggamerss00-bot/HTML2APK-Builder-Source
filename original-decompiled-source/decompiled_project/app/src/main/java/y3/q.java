package y3;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f33880a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f33881b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f33882c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33883d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f33884e;

    public q(ViewGroup viewGroup) {
        this.f33882c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentE;
        if (this.f33883d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f33882c, f10, f11, z10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent viewParentE;
        if (this.f33883d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f33882c, f10, f11);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i10, int[] iArr, int i11, int i12, int[] iArr2) {
        ViewParent viewParentE;
        int i13;
        int i14;
        if (!this.f33883d || (viewParentE = e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f33882c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f33884e == null) {
                this.f33884e = new int[2];
            }
            iArr = this.f33884e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentE instanceof r) {
            ((r) viewParentE).i(i10, i11, iArr, i12);
        } else if (i12 == 0) {
            try {
                viewParentE.onNestedPreScroll(viewGroup, i10, i11, iArr);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean d(int i10, int[] iArr, int i11, int i12, int i13, int[] iArr2, int i14) {
        ViewParent viewParentE;
        int i15;
        int i16;
        int[] iArr3;
        ViewGroup viewGroup;
        if (this.f33883d && (viewParentE = e(i14)) != null) {
            if (i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
                ViewGroup viewGroup2 = this.f33882c;
                if (iArr != null) {
                    viewGroup2.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (this.f33884e == null) {
                        this.f33884e = new int[2];
                    }
                    int[] iArr4 = this.f33884e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentE instanceof s) {
                    ((s) viewParentE).b(iArr3, i10, i11, i12, i13, i14);
                    viewGroup = viewGroup2;
                } else {
                    iArr3[0] = iArr3[0] + i12;
                    iArr3[1] = iArr3[1] + i13;
                    if (viewParentE instanceof r) {
                        viewGroup = viewGroup2;
                        ((r) viewParentE).e(viewGroup, i10, i11, i12, i13, i14);
                    } else {
                        viewGroup = viewGroup2;
                        if (i14 == 0) {
                            try {
                                viewParentE.onNestedScroll(viewGroup, i10, i11, i12, i13);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e10);
                            }
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i15;
                    iArr[1] = iArr[1] - i16;
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

    public final ViewParent e(int i10) {
        if (i10 == 0) {
            return this.f33880a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f33881b;
    }

    public final boolean f(int i10) {
        return e(i10) != null;
    }

    public final boolean g(int i10, int i11) {
        boolean zOnStartNestedScroll;
        if (!f(i11)) {
            if (this.f33883d) {
                View view = this.f33882c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z10 = parent instanceof r;
                    if (z10) {
                        zOnStartNestedScroll = ((r) parent).f(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i11 == 0) {
                            this.f33880a = parent;
                        } else if (i11 == 1) {
                            this.f33881b = parent;
                        }
                        if (z10) {
                            ((r) parent).g(view2, view, i10, i11);
                        } else if (i11 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i10);
                            } catch (AbstractMethodError e11) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
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

    public final void h(int i10) {
        ViewParent viewParentE = e(i10);
        if (viewParentE != null) {
            boolean z10 = viewParentE instanceof r;
            ViewGroup viewGroup = this.f33882c;
            if (z10) {
                ((r) viewParentE).h(viewGroup, i10);
            } else if (i10 == 0) {
                try {
                    viewParentE.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f33880a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f33881b = null;
            }
        }
    }
}
