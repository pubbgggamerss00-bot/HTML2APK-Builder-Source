package d8;

import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.google.android.gms.internal.play_billing.zzc;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public volatile aa.c f7435a;

        /* renamed from: b, reason: collision with root package name */
        public final Hilt_HtmlToApkApplication f7436b;

        /* renamed from: c, reason: collision with root package name */
        public volatile i8.j f7437c;

        public /* synthetic */ a(Hilt_HtmlToApkApplication hilt_HtmlToApkApplication) {
            this.f7436b = hilt_HtmlToApkApplication;
        }

        public final boolean a() {
            try {
                Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = this.f7436b;
                return hilt_HtmlToApkApplication.getPackageManager().getApplicationInfo(hilt_HtmlToApkApplication.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e10) {
                zzc.zzo("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e10);
                return false;
            }
        }
    }
}
