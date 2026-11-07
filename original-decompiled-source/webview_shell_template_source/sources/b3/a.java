package b3;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f1988c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static a f1989d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f1990a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f1991b;

    @VisibleForTesting
    public a(Context context) {
        this.f1991b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f1990a;
        reentrantLock.lock();
        try {
            return this.f1991b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
