package b5;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.h0;
import com.google.android.gms.internal.consent_sdk.p0;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2001a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2002b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: b5.a$a, reason: collision with other inner class name */
    public static class C0024a {

        /* renamed from: b, reason: collision with root package name */
        public final Context f2004b;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f2003a = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f2005c = 0;

        public C0024a(@RecentlyNonNull Context context) {
            this.f2004b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public final a a() {
            boolean z6 = true;
            if (!p0.a()) {
                if (!this.f2003a.contains(h0.a(this.f2004b))) {
                    z6 = false;
                }
            }
            return new a(z6, this);
        }
    }

    public /* synthetic */ a(boolean z6, C0024a c0024a) {
        this.f2001a = z6;
        this.f2002b = c0024a.f2005c;
    }
}
