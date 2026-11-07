package androidx.fragment.app;

import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class s<E> extends p {
    public final FragmentActivity s;

    /* renamed from: t, reason: collision with root package name */
    public final FragmentActivity f1222t;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f1223u;

    /* renamed from: v, reason: collision with root package name */
    public final z f1224v;

    public s(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f1224v = new z();
        this.s = fragmentActivity;
        this.f1222t = fragmentActivity;
        this.f1223u = handler;
    }

    public abstract void i(PrintWriter printWriter, String[] strArr);

    public abstract FragmentActivity j();

    public abstract LayoutInflater k();

    public abstract void l();
}
