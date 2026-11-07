package q3;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: i, reason: collision with root package name */
    public static volatile e0 f14128i;

    /* renamed from: a, reason: collision with root package name */
    public final String f14129a;

    /* renamed from: b, reason: collision with root package name */
    public final i3.c f14130b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f14131c;

    /* renamed from: d, reason: collision with root package name */
    public final i2.h f14132d;

    /* renamed from: e, reason: collision with root package name */
    public int f14133e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14134f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14135g;
    public volatile f h;

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e0(Context context, Bundle bundle, String str) throws Resources.NotFoundException, ClassNotFoundException {
        String packageName;
        String packageName2;
        String string;
        if (str != null) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                this.f14129a = "FA";
            } catch (ClassNotFoundException unused) {
                this.f14129a = "FA-Ads";
            }
        } else {
            this.f14129a = "FA";
        }
        this.f14130b = i3.c.f13363a;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new x());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14131c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f14132d = new i2.h(this);
        new ArrayList();
        try {
            try {
                packageName = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            } catch (IllegalStateException unused2) {
            }
        } catch (Resources.NotFoundException unused3) {
            packageName = context.getPackageName();
        }
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(packageName)) {
            try {
                packageName2 = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            } catch (Resources.NotFoundException unused4) {
                packageName2 = context.getPackageName();
            }
            packageName = packageName2;
        }
        int identifier = resources.getIdentifier("google_app_id", "string", packageName);
        if (identifier == 0) {
            string = null;
            if (string != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused5) {
                    this.f14135g = null;
                    this.f14134f = true;
                    Log.w(this.f14129a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } else {
            try {
                string = resources.getString(identifier);
            } catch (Resources.NotFoundException unused6) {
            }
            if (string != null) {
            }
        }
        if (str != null) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                this.f14135g = "fa";
                if (str == null) {
                    Log.v(this.f14129a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                } else {
                    if (str == null) {
                        Log.w(this.f14129a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                    }
                }
            } catch (ClassNotFoundException unused7) {
                this.f14135g = "am";
            }
        } else {
            this.f14135g = "fa";
            if (str == null) {
            }
        }
        b(new p(this, str, context, bundle, 0));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f14129a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new d0(this));
        }
    }

    public final void a(Exception exc, boolean z6, boolean z7) {
        this.f14134f |= z6;
        String str = this.f14129a;
        if (z6) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z7) {
            b(new k(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }

    public final void b(a0 a0Var) {
        this.f14131c.execute(a0Var);
    }
}
