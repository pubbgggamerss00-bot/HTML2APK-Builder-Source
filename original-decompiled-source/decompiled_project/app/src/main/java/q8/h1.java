package q8;

import android.os.SystemClock;
import android.view.ActionMode;
import android.view.MotionEvent;
import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22225a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f22225a) {
            case 0:
                x it = (x) obj;
                kotlin.jvm.internal.r.e(it, "it");
                if (!it.N) {
                    it.N = true;
                    it.M.incrementAndGet();
                    Future<?> future = it.K;
                    if (future != null) {
                        future.cancel(true);
                    }
                    it.I.shutdownNow();
                    ExecutorService executorService = it.L;
                    if (executorService != null) {
                        executorService.shutdownNow();
                    }
                    it.removeCallbacks(it.f22469n0);
                    it.removeCallbacks(it.f22470o0);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                    try {
                        it.f22467m0.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                        ActionMode actionMode = it.W;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                        it.f22465l0.clear();
                        it.O = null;
                        it.f22471p = null;
                        it.f22459i0.clear();
                        it.f22461j0.clear();
                    } catch (Throwable th2) {
                        motionEventObtain.recycle();
                        throw th2;
                    }
                }
                return pg.f0.f21461a;
            default:
                return 200L;
        }
    }
}
