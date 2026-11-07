package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.htmltoapk.template.WebViewActivity;
import i0.e;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.f1;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f58t;

    public /* synthetic */ d(int i6, Object obj) {
        this.s = i6;
        this.f58t = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.app.Application] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [i0.e$a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        e.a aVar;
        Application application;
        switch (this.s) {
            case 0:
                ((ComponentActivity) this.f58t).invalidateMenu();
                return;
            case 1:
                ((b.a) this.f58t).a(null);
                return;
            case 2:
                ((WebViewActivity) this.f58t).hideSplash();
                return;
            case 3:
                Activity activity = (Activity) this.f58t;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = i0.e.f13298g;
                Method method = i0.e.f13297f;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28) {
                    activity.recreate();
                    return;
                }
                ?? r5 = 27;
                if (((i6 != 26 && i6 != 27) || method != null) && (i0.e.f13296e != null || i0.e.f13295d != null)) {
                    try {
                        Object obj2 = i0.e.f13294c.get(activity);
                        if (obj2 != null && (obj = i0.e.f13293b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            e.a aVar2 = new e.a(activity);
                            application2.registerActivityLifecycleCallbacks(aVar2);
                            handler.post(new i0.b(aVar2, obj2));
                            ?? r42 = (i6 == 26 || i6 == 27) ? 1 : 0;
                            try {
                                if (r42 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r42 = application2;
                                        r5 = aVar2;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        application = application2;
                                        aVar = aVar2;
                                        handler.post(new i0.c(application, aVar));
                                        throw th;
                                    }
                                } else {
                                    r42 = application2;
                                    r5 = aVar2;
                                    activity.recreate();
                                }
                                handler.post(new i0.c(r42, r5));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                application = r42;
                                aVar = r5;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 4:
                ((f1) this.f58t).c(false);
                return;
            case 5:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new androidx.camera.core.processing.p(9, (Context) this.f58t));
                return;
            default:
                w2.z zVar = (w2.z) this.f58t;
                if (zVar.f15058x) {
                    return;
                }
                zVar.animate().alpha(0.0f).setDuration(250L).start();
                return;
        }
    }
}
