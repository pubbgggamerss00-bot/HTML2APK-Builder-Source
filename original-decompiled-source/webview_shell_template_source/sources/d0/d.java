package d0;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import d0.e;
import e0.a;
import java.util.ArrayList;
import u0.p;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d extends ConstraintLayout implements p {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f12656a0 = 0;
    public float I;
    public int J;
    public int K;
    public float L;
    public float M;
    public long N;
    public c O;
    public d0.b P;
    public boolean Q;
    public int R;
    public float S;
    public boolean T;
    public b U;
    public boolean V;
    public EnumC0042d W;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.U.a();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public float f12657a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        public float f12658b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        public int f12659c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f12660d = -1;

        public b() {
        }

        public final void a() {
            int i6 = this.f12659c;
            d dVar = d.this;
            if (i6 != -1 || this.f12660d != -1) {
                EnumC0042d enumC0042d = EnumC0042d.s;
                if (i6 == -1) {
                    int i7 = this.f12660d;
                    if (dVar.isAttachedToWindow()) {
                        int i8 = dVar.J;
                        if (i8 != i7 && -1 != i7 && dVar.K != i7) {
                            dVar.K = i7;
                            if (i8 == -1) {
                                dVar.L = 0.0f;
                                dVar.M = 0.0f;
                                dVar.N = dVar.getNanoTime();
                                dVar.getNanoTime();
                                throw null;
                            }
                            if (!dVar.isAttachedToWindow()) {
                                b bVar = dVar.U;
                                bVar.f12659c = i8;
                                bVar.f12660d = i7;
                            }
                            dVar.M = 0.0f;
                        }
                    } else {
                        dVar.U.f12660d = i7;
                    }
                } else {
                    int i9 = this.f12660d;
                    if (i9 == -1) {
                        dVar.setState(enumC0042d);
                        dVar.J = i6;
                        dVar.K = -1;
                        e0.a aVar = dVar.C;
                        if (aVar != null) {
                            float f6 = -1;
                            ConstraintLayout constraintLayout = aVar.f12749a;
                            SparseArray<a.C0050a> sparseArray = aVar.f12752d;
                            int i10 = aVar.f12750b;
                            int i11 = 0;
                            if (i10 == i6) {
                                a.C0050a c0050aValueAt = i6 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i10);
                                int i12 = aVar.f12751c;
                                if (i12 == -1 || !c0050aValueAt.f12755b.get(i12).a(f6, f6)) {
                                    ArrayList<a.b> arrayList = c0050aValueAt.f12755b;
                                    while (true) {
                                        if (i11 >= arrayList.size()) {
                                            i11 = -1;
                                            break;
                                        } else if (arrayList.get(i11).a(f6, f6)) {
                                            break;
                                        } else {
                                            i11++;
                                        }
                                    }
                                    ArrayList<a.b> arrayList2 = c0050aValueAt.f12755b;
                                    if (aVar.f12751c != i11) {
                                        androidx.constraintlayout.widget.d dVar2 = i11 == -1 ? null : arrayList2.get(i11).f12763f;
                                        if (i11 != -1) {
                                            int i13 = arrayList2.get(i11).f12762e;
                                        }
                                        if (dVar2 != null) {
                                            aVar.f12751c = i11;
                                            dVar2.a(constraintLayout);
                                            constraintLayout.setConstraintSet(null);
                                            constraintLayout.requestLayout();
                                        }
                                    }
                                }
                            } else {
                                aVar.f12750b = i6;
                                a.C0050a c0050a = sparseArray.get(i6);
                                ArrayList<a.b> arrayList3 = c0050a.f12755b;
                                while (true) {
                                    if (i11 >= arrayList3.size()) {
                                        i11 = -1;
                                        break;
                                    } else if (arrayList3.get(i11).a(f6, f6)) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                }
                                ArrayList<a.b> arrayList4 = c0050a.f12755b;
                                androidx.constraintlayout.widget.d dVar3 = i11 == -1 ? c0050a.f12757d : arrayList4.get(i11).f12763f;
                                if (i11 != -1) {
                                    int i14 = arrayList4.get(i11).f12762e;
                                }
                                if (dVar3 == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i6 + ", dim =-1.0, -1.0");
                                } else {
                                    aVar.f12751c = i11;
                                    dVar3.a(constraintLayout);
                                    constraintLayout.setConstraintSet(null);
                                    constraintLayout.requestLayout();
                                }
                            }
                        }
                    } else if (!dVar.isAttachedToWindow()) {
                        b bVar2 = dVar.U;
                        bVar2.f12659c = i6;
                        bVar2.f12660d = i9;
                    }
                }
                dVar.setState(enumC0042d);
            }
            if (Float.isNaN(this.f12658b)) {
                if (Float.isNaN(this.f12657a)) {
                    return;
                }
                dVar.setProgress(this.f12657a);
                return;
            }
            float f7 = this.f12657a;
            float f8 = this.f12658b;
            if (dVar.isAttachedToWindow()) {
                dVar.setProgress(f7);
                dVar.setState(EnumC0042d.f12662t);
                dVar.I = f8;
            } else {
                b bVar3 = dVar.U;
                bVar3.f12657a = f7;
                bVar3.f12658b = f8;
            }
            this.f12657a = Float.NaN;
            this.f12658b = Float.NaN;
            this.f12659c = -1;
            this.f12660d = -1;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: d0.d$d, reason: collision with other inner class name */
    public static final class EnumC0042d {
        public static final EnumC0042d s;

        /* renamed from: t, reason: collision with root package name */
        public static final EnumC0042d f12662t;

        /* renamed from: u, reason: collision with root package name */
        public static final EnumC0042d f12663u;

        /* renamed from: v, reason: collision with root package name */
        public static final /* synthetic */ EnumC0042d[] f12664v;

        /* JADX INFO: Fake field, exist only in values array */
        EnumC0042d EF0;

        static {
            EnumC0042d enumC0042d = new EnumC0042d("UNDEFINED", 0);
            EnumC0042d enumC0042d2 = new EnumC0042d("SETUP", 1);
            s = enumC0042d2;
            EnumC0042d enumC0042d3 = new EnumC0042d("MOVING", 2);
            f12662t = enumC0042d3;
            EnumC0042d enumC0042d4 = new EnumC0042d("FINISHED", 3);
            f12663u = enumC0042d4;
            f12664v = new EnumC0042d[]{enumC0042d, enumC0042d2, enumC0042d3, enumC0042d4};
        }

        public EnumC0042d() {
            throw null;
        }

        public static EnumC0042d valueOf(String str) {
            return (EnumC0042d) Enum.valueOf(EnumC0042d.class, str);
        }

        public static EnumC0042d[] values() {
            return (EnumC0042d[]) f12664v.clone();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        boolean z6;
        if (this.N == -1) {
            this.N = getNanoTime();
        }
        float f6 = this.M;
        if (f6 > 0.0f && f6 < 1.0f) {
            this.J = -1;
        }
        boolean z7 = false;
        if (this.Q) {
            float fSignum = Math.signum(1.0f - f6);
            long nanoTime = getNanoTime();
            float f7 = (((nanoTime - this.N) * fSignum) * 1.0E-9f) / 0.0f;
            float f8 = this.M + f7;
            if ((fSignum > 0.0f && f8 >= 1.0f) || (fSignum <= 0.0f && f8 <= 1.0f)) {
                f8 = 1.0f;
            }
            this.M = f8;
            this.L = f8;
            this.N = nanoTime;
            this.I = f7;
            if (Math.abs(f7) > 1.0E-5f) {
                setState(EnumC0042d.f12662t);
            }
            if ((fSignum > 0.0f && f8 >= 1.0f) || (fSignum <= 0.0f && f8 <= 1.0f)) {
                f8 = 1.0f;
            }
            EnumC0042d enumC0042d = EnumC0042d.f12663u;
            if (f8 >= 1.0f || f8 <= 0.0f) {
                setState(enumC0042d);
            }
            int childCount = getChildCount();
            this.Q = false;
            getNanoTime();
            if (childCount > 0) {
                getChildAt(0);
                throw null;
            }
            boolean z8 = (fSignum > 0.0f && f8 >= 1.0f) || (fSignum <= 0.0f && f8 <= 1.0f);
            if (!this.Q && z8) {
                setState(enumC0042d);
            }
            boolean z9 = (!z8) | this.Q;
            this.Q = z9;
            if (f8 >= 1.0d) {
                int i6 = this.J;
                int i7 = this.K;
                if (i6 != i7) {
                    this.J = i7;
                    throw null;
                }
            }
            if (z9) {
                invalidate();
            } else if ((fSignum > 0.0f && f8 == 1.0f) || (fSignum < 0.0f && f8 == 0.0f)) {
                setState(enumC0042d);
            }
            if (!this.Q && ((fSignum <= 0.0f || f8 != 1.0f) && fSignum < 0.0f)) {
                int i8 = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
            }
        }
        float f9 = this.M;
        if (f9 < 1.0f) {
            if (f9 <= 0.0f) {
                z6 = this.J != -1;
                this.J = -1;
            }
            if (z7 && !this.T) {
                super.requestLayout();
            }
            this.L = this.M;
            super.dispatchDraw(canvas);
        }
        int i9 = this.J;
        int i10 = this.K;
        z6 = i9 != i10;
        this.J = i10;
        z7 = z6;
        if (z7) {
            super.requestLayout();
        }
        this.L = this.M;
        super.dispatchDraw(canvas);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void e(int i6) {
        this.C = null;
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.J;
    }

    public ArrayList<e.a> getDefinedTransitions() {
        return null;
    }

    public d0.b getDesignTool() {
        if (this.P == null) {
            this.P = new d0.b();
        }
        return this.P;
    }

    public int getEndState() {
        return this.K;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.M;
    }

    public e getScene() {
        return null;
    }

    public int getStartState() {
        return -1;
    }

    public float getTargetPosition() {
        return 1.0f;
    }

    public Bundle getTransitionState() {
        b bVar = this.U;
        d dVar = d.this;
        bVar.f12660d = dVar.K;
        bVar.f12659c = -1;
        bVar.f12658b = dVar.getVelocity();
        bVar.f12657a = dVar.getProgress();
        b bVar2 = this.U;
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f12657a);
        bundle.putFloat("motion.velocity", bVar2.f12658b);
        bundle.putInt("motion.StartState", bVar2.f12659c);
        bundle.putInt("motion.EndState", bVar2.f12660d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return (long) 0.0f;
    }

    public float getVelocity() {
        return this.I;
    }

    public final void h() {
        this.O.getClass();
        if (this.S != this.L) {
            if (this.R != -1) {
                throw null;
            }
            this.R = -1;
            this.S = this.L;
            throw null;
        }
    }

    public final void i() {
        this.O.getClass();
        if (this.R != -1) {
            this.O.getClass();
            throw null;
        }
        this.R = this.J;
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.U;
        if (this.V) {
            post(new a());
        } else {
            bVar.a();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        this.T = true;
        try {
            super.onLayout(z6, i6, i7, i8, i9);
        } finally {
            this.T = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z6) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    @Override // u0.p
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        if (i6 == 0 && i7 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
    }

    @Override // u0.o
    public final void onNestedScrollAccepted(View view, View view2, int i6, int i7) {
        getNanoTime();
    }

    @Override // u0.o
    public final boolean onStartNestedScroll(View view, View view2, int i6, int i7) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof d0.c) {
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
    }

    public void setDebugMode(int i6) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z6) {
        this.V = z6;
    }

    public void setInterpolatedProgress(float f6) {
        setProgress(f6);
    }

    public void setProgress(float f6) {
        if (f6 < 0.0f || f6 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            this.U.f12657a = f6;
            return;
        }
        EnumC0042d enumC0042d = EnumC0042d.f12663u;
        EnumC0042d enumC0042d2 = EnumC0042d.f12662t;
        if (f6 <= 0.0f) {
            if (this.M == 1.0f && this.J == this.K) {
                setState(enumC0042d2);
            }
            this.J = -1;
            if (this.M == 0.0f) {
                setState(enumC0042d);
                return;
            }
            return;
        }
        if (f6 < 1.0f) {
            this.J = -1;
            setState(enumC0042d2);
            return;
        }
        if (this.M == 0.0f && this.J == -1) {
            setState(enumC0042d2);
        }
        this.J = this.K;
        if (this.M == 1.0f) {
            setState(enumC0042d);
        }
    }

    public void setScene(e eVar) {
        d();
        throw null;
    }

    public void setStartState(int i6) {
        if (isAttachedToWindow()) {
            this.J = i6;
            return;
        }
        if (this.U == null) {
            this.U = new b();
        }
        b bVar = this.U;
        bVar.f12659c = i6;
        bVar.f12660d = i6;
    }

    public void setState(EnumC0042d enumC0042d) {
        EnumC0042d enumC0042d2 = EnumC0042d.f12663u;
        if (enumC0042d == enumC0042d2 && this.J == -1) {
            return;
        }
        EnumC0042d enumC0042d3 = this.W;
        this.W = enumC0042d;
        EnumC0042d enumC0042d4 = EnumC0042d.f12662t;
        if (enumC0042d3 == enumC0042d4 && enumC0042d == enumC0042d4) {
            h();
        }
        int iOrdinal = enumC0042d3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && enumC0042d == enumC0042d2) {
                i();
                return;
            }
            return;
        }
        if (enumC0042d == enumC0042d4) {
            h();
        }
        if (enumC0042d == enumC0042d2) {
            i();
        }
    }

    public void setTransition(int i6) {
    }

    public void setTransitionDuration(int i6) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.O = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.U == null) {
            this.U = new b();
        }
        b bVar = this.U;
        bVar.getClass();
        bVar.f12657a = bundle.getFloat("motion.progress");
        bVar.f12658b = bundle.getFloat("motion.velocity");
        bVar.f12659c = bundle.getInt("motion.StartState");
        bVar.f12660d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.U.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return d0.a.a(context, -1) + "->" + d0.a.a(context, this.K) + " (pos:" + this.M + " Dpos/Dt:" + this.I;
    }

    public void setTransition(e.a aVar) {
        throw null;
    }

    @Override // u0.o
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9, int i10) {
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i6) {
    }

    public void setInteractionEnabled(boolean z6) {
    }

    public void setOnHide(float f6) {
    }

    public void setOnShow(float f6) {
    }

    @Override // u0.o
    public final void onStopNestedScroll(View view, int i6) {
    }

    @Override // u0.o
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr, int i8) {
    }
}
