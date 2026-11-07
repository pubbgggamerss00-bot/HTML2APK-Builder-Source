package d4;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f7362a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f7363b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<ComponentName> f7364c;

    public v(Bundle bundle, Bundle bundle2, Set set) {
        this.f7362a = bundle;
        this.f7363b = bundle2;
        this.f7364c = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000);
    }
}
