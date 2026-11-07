package ea;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.o;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes2.dex */
public final class c implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final c f8633b = new c(new Bundle());

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f8634a;

    public /* synthetic */ c(Bundle bundle) {
        this.f8634a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        Bundle bundle = ((c) obj).f8634a;
        Bundle bundle2 = this.f8634a;
        if (bundle2 == null || bundle == null) {
            return bundle2 == bundle;
        }
        if (bundle2.size() == bundle.size()) {
            Set<String> setKeySet = bundle2.keySet();
            if (setKeySet.containsAll(bundle.keySet())) {
                for (String str : setKeySet) {
                    if (!o.a(bundle2.get(str), bundle.get(str))) {
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8634a});
    }
}
