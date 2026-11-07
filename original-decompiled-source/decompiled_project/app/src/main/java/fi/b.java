package fi;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.r;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11241b;

    public /* synthetic */ b(String str, boolean z10) {
        this.f11240a = str;
        this.f11241b = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte[] bArr = Util.f19393a;
        String name = this.f11240a;
        r.e(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f11241b);
        return thread;
    }
}
