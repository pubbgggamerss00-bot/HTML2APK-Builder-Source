package p;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f14043a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f14044b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {
        public static void a(ActivityOptions activityOptions, boolean z6) {
            activityOptions.setShareIdentityEnabled(z6);
        }
    }

    public e(Intent intent, Bundle bundle) {
        this.f14043a = intent;
        this.f14044b = bundle;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f14045a;

        /* renamed from: b, reason: collision with root package name */
        public final j3.b f14046b;

        /* renamed from: c, reason: collision with root package name */
        public ActivityOptions f14047c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f14048d;

        public d() {
            this.f14045a = new Intent("android.intent.action.VIEW");
            this.f14046b = new j3.b();
            this.f14048d = true;
        }

        public final e a() {
            Intent intent = this.f14045a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f14048d);
            this.f14046b.getClass();
            intent.putExtras(new Bundle());
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            int i6 = Build.VERSION.SDK_INT;
            String strA = b.a();
            if (!TextUtils.isEmpty(strA)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strA);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
            if (i6 >= 34) {
                if (this.f14047c == null) {
                    this.f14047c = a.a();
                }
                c.a(this.f14047c, false);
            }
            ActivityOptions activityOptions = this.f14047c;
            return new e(intent, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public d(h hVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f14045a = intent;
            this.f14046b = new j3.b();
            this.f14048d = true;
            if (hVar != null) {
                intent.setPackage(hVar.f14055d.getPackageName());
                p.c cVar = hVar.f14054c;
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", cVar);
                intent.putExtras(bundle);
            }
        }
    }
}
