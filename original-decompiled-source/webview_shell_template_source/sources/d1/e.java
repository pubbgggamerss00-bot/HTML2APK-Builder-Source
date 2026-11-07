package d1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.AndroidRuntimeException;
import androidx.fragment.app.p;
import d1.a;
import d1.a.c;
import java.util.ArrayList;
import u4.o;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends d<e> {

    /* renamed from: q, reason: collision with root package name */
    public f f12696q;

    /* renamed from: r, reason: collision with root package name */
    public float f12697r;
    public boolean s;

    public e(o oVar, p pVar) {
        super(oVar, pVar);
        this.f12696q = null;
        this.f12697r = Float.MAX_VALUE;
        this.s = false;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [d1.b] */
    public final void d(float f6) {
        if (this.f12689e) {
            this.f12697r = f6;
            return;
        }
        if (this.f12696q == null) {
            this.f12696q = new f(f6);
        }
        f fVar = this.f12696q;
        double d7 = f6;
        fVar.f12705i = d7;
        double d8 = (float) d7;
        if (d8 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        float f7 = this.f12690f;
        if (d8 < f7) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.h * 0.75f);
        fVar.f12701d = dAbs;
        fVar.f12702e = dAbs * 62.5d;
        a.d dVar = d.b().f12670e;
        dVar.getClass();
        if (Thread.currentThread() != dVar.f12677b.getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z6 = this.f12689e;
        if (z6 || z6) {
            return;
        }
        this.f12689e = true;
        float fC = this.f12688d.c(this.f12687c);
        this.f12686b = fC;
        if (fC > Float.MAX_VALUE || fC < f7) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        a aVarB = d.b();
        ArrayList<a.b> arrayList = aVarB.f12667b;
        if (arrayList.size() == 0) {
            aVarB.f12670e.f12676a.postFrameCallback(new c(aVarB.f12669d));
            if (Build.VERSION.SDK_INT >= 33) {
                aVarB.f12672g = ValueAnimator.getDurationScale();
                if (aVarB.h == null) {
                    aVarB.h = aVarB.new c();
                }
                final a.c cVar = aVarB.h;
                if (cVar.f12674a == null) {
                    ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: d1.b
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f8) {
                            a.this.f12672g = f8;
                        }
                    };
                    cVar.f12674a = r12;
                    ValueAnimator.registerDurationScaleChangeListener(r12);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void e() {
        if (this.f12696q.f12699b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        a.d dVar = d.b().f12670e;
        dVar.getClass();
        if (Thread.currentThread() != dVar.f12677b.getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f12689e) {
            this.s = true;
        }
    }
}
