package l9;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.FrameMetrics;
import android.view.Window;
import com.basitce.htmltoapk.MainActivity;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final MainActivity f16898a;

    /* renamed from: b, reason: collision with root package name */
    public final f8.n f16899b;

    /* renamed from: e, reason: collision with root package name */
    public u f16902e;

    /* renamed from: f, reason: collision with root package name */
    public long f16903f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16905h;

    /* renamed from: c, reason: collision with root package name */
    public final z f16900c = new z();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f16901d = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public long f16904g = 16666667;

    public v(MainActivity mainActivity, f8.n nVar) {
        this.f16898a = mainActivity;
        this.f16899b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.Window$OnFrameMetricsAvailableListener, l9.u] */
    public final void a() {
        if (this.f16902e != null) {
            return;
        }
        z zVar = this.f16900c;
        zVar.f16916a = 0;
        zVar.f16917b = 0;
        zVar.f16918c = 0;
        this.f16903f = SystemClock.uptimeMillis() + 3000;
        MainActivity mainActivity = this.f16898a;
        float refreshRate = mainActivity.getWindowManager().getDefaultDisplay().getRefreshRate();
        if (refreshRate > 1.0f) {
            this.f16904g = (long) (1000000000 / refreshRate);
        }
        ?? r12 = new Window.OnFrameMetricsAvailableListener() { // from class: l9.u
            /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                long metric;
                v vVar = this.f16897a;
                if (vVar.f16905h || vVar.f16902e == null || frameMetrics.getMetric(9) == 1 || SystemClock.uptimeMillis() < vVar.f16903f) {
                    return;
                }
                z zVar2 = vVar.f16900c;
                long metric2 = frameMetrics.getMetric(7) + frameMetrics.getMetric(6) + frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
                if (Build.VERSION.SDK_INT >= 31) {
                    metric = frameMetrics.getMetric(13);
                    if (metric <= 0) {
                        metric = vVar.f16904g;
                    }
                }
                zVar2.f16916a++;
                if (metric2 > Math.max(metric * 2, 24000000L)) {
                    zVar2.f16917b++;
                }
                if (zVar2.f16916a < 120) {
                    return;
                }
                int i11 = ((float) zVar2.f16917b) >= ((float) CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET) * 0.25f ? zVar2.f16918c + 1 : 0;
                zVar2.f16918c = i11;
                zVar2.f16916a = 0;
                zVar2.f16917b = 0;
                if (i11 >= 3) {
                    vVar.f16901d.post(new androidx.credentials.playservices.controllers.identityauth.beginsignin.q(vVar, 1));
                }
            }
        };
        this.f16902e = r12;
        mainActivity.getWindow().addOnFrameMetricsAvailableListener(r12, this.f16901d);
    }

    public final void b() {
        u uVar = this.f16902e;
        if (uVar == null) {
            return;
        }
        this.f16902e = null;
        try {
            this.f16898a.getWindow().removeOnFrameMetricsAvailableListener(uVar);
        } catch (IllegalArgumentException unused) {
        }
    }
}
